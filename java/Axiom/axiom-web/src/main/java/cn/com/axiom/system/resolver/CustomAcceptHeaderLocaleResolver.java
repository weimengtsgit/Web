package cn.com.axiom.system.resolver;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

public class CustomAcceptHeaderLocaleResolver extends AcceptHeaderLocaleResolver {
	
	private Locale local;
	 
	/**
	 * 修改LOCAL
	 */
	public Locale resolveLocale(HttpServletRequest request) {
		
		if (local==null) {
			return request.getLocale();
		}
	  return local;
	 } 
		
     	
	 public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
		
	  this.local = locale;
	 }
}
