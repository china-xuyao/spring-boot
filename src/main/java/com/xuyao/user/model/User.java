package com.xuyao.user.model;

public class User {
	  private int id;
	    private String name;
	    private String account;
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
	    public String getAccount() {
	        return account;
	    }
	    public void setAccount(String account) {
	        this.account = account;
	    }
	    @Override
	    public String toString() {
	        return "User [id=" + id + ", name=" + name + ", account=" + account + "]";
	    }
	
}
