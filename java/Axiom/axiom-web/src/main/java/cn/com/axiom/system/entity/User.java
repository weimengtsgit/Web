package cn.com.axiom.system.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import cn.com.axiom.entity.IdEntity;


/**
 * 用户.
 * 
 */
@Entity
@SuppressWarnings("serial")
@Table(name = "tbl_user")
// 默认的缓存策略.
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class User extends IdEntity {

	
	private Date createTime;

	private String password;

	private String realName;


	//1:正常 2:不正常
	private Integer status;

	private String userName;

	@Column(name = "create_time")
	public Date getCreateTime() {
		return createTime;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}
	
	@Column(name = "real_name")
	public String getRealName() {
		return realName;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return status;
	}

	@Column(name = "user_name")
	public String getUserName() {
		return userName;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}