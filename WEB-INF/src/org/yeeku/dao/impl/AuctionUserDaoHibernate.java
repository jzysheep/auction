package org.yeeku.dao.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import org.yeeku.model.*;
import org.yeeku.business.*;
import org.yeeku.dao.*;


public class AuctionUserDaoHibernate extends HibernateDaoSupport implements AuctionUserDao  
{
    /**
     * 根据id查找用户
     * @param id 需要查找的用户id
     */  
    public AuctionUser get(Integer id)
    {
        return (AuctionUser)getHibernateTemplate().get(AuctionUser.class , id);
    }
    /**
     * 增加用户
     * @param user 需要增加的用户
     */       
    public void save(AuctionUser user)
    {
        getHibernateTemplate().save(user);
    }

    /**
     * 修改用户
     * @param user 需要修改的用户
     */  
    public void update(AuctionUser user)
    {
        getHibernateTemplate().saveOrUpdate(user);
    }

    /**
     * 删除用户
     * @param id 需要删除的用户id
     */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(AuctionUser.class , id));
    }

    /**
     * 删除用户
     * @param user 需要删除的用户
     */  
    public void delete(AuctionUser user)
    {
        getHibernateTemplate().delete(user);
    }

    /**
     * 查询全部用户
     * @return 获得全部用户
     */ 
    public List findAll()
    {
        return getHibernateTemplate().find("from AuctionUser");
    }

    /**
     * 根据用户名，密码查找用户
     * @param username 查询所需的用户名
     * @param pass 查询所需的密码
     * @return 对应的用户
     */ 
    public AuctionUser findUserByNameAndPass(String username , String pass)
    {
        String[] args = {username , pass};
        List ul = getHibernateTemplate().find("from AuctionUser au where au.username = ? and au.userpass = ?" , args);
        if (ul.size() == 1)
        {
            return (AuctionUser)ul.get(0);
        }
        return null;
    }
}
