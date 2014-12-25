package com.dearcom.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.ever4j.main.constant.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SMSClient {
	private static Logger logger = LoggerFactory.getLogger(SMSClient.class);

	// 发送传递的参数
	// http://www.ztsms.cn:8800/sendXSms.do?username=用户名&password=密码&mobile=手机号码&content=内容&dstime=&productid=产品ID&xh=留空
	private String username;
	private String password;
	private Integer productid;
	private String sendurl;
	private String xh;
	/**
	 * 创建一个新的实例 SMSSender. 助通科技提供的用户名与地址
	 */
	/****
	 * username 用户名（必填） password 密码（必填） mobile 手机号，多个手机号为用半角 ,
	 * 分开，如13899999999,13688888888(最多100个，必填) content 发送内容（必填） dstime
	 * 定时时间，为空时表示立即发送（选填） productid 产品id(必填) xh 扩展号,留空
	 * ***/

	public SMSClient(String sendurl,String username,String password,Integer productid) {
		this.sendurl=sendurl;
		this.username=username;
		this.password=password;
		this.productid=productid;
		xh = ""; // 扩展号留空
	}
	public SMSClient() {
		// 获取短信网关实例
		String url=Constant.configMap.get("sms_client_sms_gateway_url");
		String username=Constant.configMap.get("sms_client_sms_gateway_username");
		String password=Constant.configMap.get("sms_client_sms_gateway_password");
		int productid=Integer.parseInt(Constant.configMap.get("sms_client_sms_gateway_pid"));
		this.sendurl=url;
		this.username=username;
		this.password=password;
		this.productid=productid;
		xh = ""; // 扩展号留空
	}

	/**
	 * @param mobile
	 * @param content
	 * @return 1=成功 2=失败
	 */
	public Byte sendSms(String mobile, String content) {
		String sendUrl = null;
		try {// 否则发到手机乱码
			sendUrl = sendurl + "sendXSms.do?username=" + username
					+ "&password=" + password + "&mobile=" + mobile
					+ "&content=" + URLEncoder.encode(content, "UTF-8")
					+ "&productid=" + productid + "&xh=" + xh;
		} catch (UnsupportedEncodingException uee) {
			logger.error(uee.toString());
		}

		logger.debug("短信内容为:" + content);
		String result = "1,test";
		if(Constant.configMap.get("sms_client_sms_gateway_switch")!=null && Constant.configMap.get("sms_client_sms_gateway_switch").equals("1")){
			
			result = getUrl(sendUrl);
		}
		Byte status = 1;
		if(result!=null&&result.startsWith("1,")){
			status = 1;
		}else{
			status = 2;
		}
		return status;
	}

	/**
	 * @Title: getUrl
	 * @Description: 获取地址
	 * @param urlString
	 * @return
	 */

	private String getUrl(String urlString) {
		StringBuffer sb = new StringBuffer();
		try {
			URL url = new URL(urlString);
			URLConnection conn = url.openConnection();
			conn.setReadTimeout(15000);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			for (String line = null; (line = reader.readLine()) != null;) {
				sb.append(line);
			}
			reader.close();
		} catch (Exception e) {
			logger.error(e.toString());
		}
		String result = "";
		try {
			result = URLDecoder.decode(sb.toString(), "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	/***
	 * 测试地址
	 * 
	 * ***/
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		String message = "尊敬的18612758030顾客，您的无线网络验证码是347923。【世贸天阶】"
				+ dateFormat.format(new Date());
		String url="http://www.ztsms.cn:8800/";
		String username="autelan";
		String password="";
		int productid=111;
		String phone = "";
		SMSClient client = new SMSClient(url, username, password, productid);
		client.sendSms(phone, message);
	}
}
