package com.sky.entity;

import java.io.Serializable;

public class Users implements Serializable
{
	private Integer id;
	private String loginName;
	private String loginPwd;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getLoginName()
	{
		return loginName;
	}

	public void setLoginName(String loginName)
	{
		this.loginName = loginName;
	}

	public String getLoginPwd()
	{
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd)
	{
		this.loginPwd = loginPwd;
	}

	public Users()
	{

	}
	

}
