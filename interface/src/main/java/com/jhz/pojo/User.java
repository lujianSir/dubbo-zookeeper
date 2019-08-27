package com.jhz.pojo;

import org.springframework.stereotype.Component;

/**
 * @author jhz
 * @date 18-8-5 下午7:23
 */
@Component
public class User {
    private int id;
    private String name;
    private String pwd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

   
}

