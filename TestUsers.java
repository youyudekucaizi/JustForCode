package com.sky.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUsers
{
	public static void main(String[] args)
	{
		//TestUsers test=new TestUsers();
		//test.addUser();
		new TestUsers().addUser();;
		
		
	}

	private void addUser()
	{
		Users user=new Users();
		user.setLoginName("zhangsan");
		user.setLoginPwd("123");
		Configuration config=new Configuration().configure();
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=null;
		//Hibernatetest/src/com/sky/entity/Users.hbm.xml
		//Hibernatetest/src/hibernate.cfg.xml
		try
		{
			tx=session.beginTransaction();
			session.save(user);
			tx.commit();
			
		} catch (Exception e)
		{
			if(tx!=null)
			{
				tx.rollback();
			}
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			session.close();
		}
		
		
	}
}
