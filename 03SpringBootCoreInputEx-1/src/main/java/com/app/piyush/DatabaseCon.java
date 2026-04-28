package com.app.piyush;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//$ indicates reading the data from the properties file
//@PropertySource
@ConfigurationProperties("my.db")
public class DatabaseCon {
	@Value("${my.db.driver}")
	private String driver;
	private String url;
	private String usr;
	private String pwd;
	public DatabaseCon() {
		super();
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsr() {
		return usr;
	}
	public void setUsr(String usr) {
		this.usr = usr;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "DatabaseCon [driver=" + driver + ", url=" + url + ", usr=" + usr + ", pwd=" + pwd + "]";
	}

}
