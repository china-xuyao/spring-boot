package com.xuyao.user.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xuyao.user.model.User;
import com.xuyao.user.server.UserService;
import com.xuyao.util.ResponseUtil;
import com.xuyao.util.ResponseUtil.StatusEnum;

@RestController
@RequestMapping("/user")
public class UserController {
    private Logger logger =  LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private UserService service;

    @RequestMapping(value="", method = RequestMethod.GET)
    public <T> Map<String, T> getUser(){
		try {
			List<User> list = service.getAll();
			return  (Map<String, T>) ResponseUtil.result(StatusEnum.succeed, "succeed", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	        logger.error(e.getMessage());
			return  (Map<String, T>) ResponseUtil.result(StatusEnum.failure, "failure" + e.getMessage());
		}
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public <T> Map<String, T> getUserById(@PathVariable int id){
		try {
			User user = service.getUser(id);
			return  (Map<String, T>) ResponseUtil.result(StatusEnum.succeed, "succeed", user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	        logger.error(e.getMessage());
			return  (Map<String, T>) ResponseUtil.result(StatusEnum.failure, "failure" + e.getMessage());
		}
    }
    
    @RequestMapping(value="", method = RequestMethod.POST, consumes="application/json")
    public <T> Map<String, T> create(@RequestBody User user, Model model) {
    	try {
			service.insert(user);
			return (Map<String, T>) ResponseUtil.result(StatusEnum.succeed, "create succeed", user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return (Map<String, T>) ResponseUtil.result(StatusEnum.failure, "create failure. Info:" + e.getMessage(), user);
		}
    }
    
    @RequestMapping(value="", method = RequestMethod.PUT, consumes="application/json")
    public <T> Map<String, T> update(@RequestBody User user, Model model) {
    	try {
			service.update(user);
	        return (Map<String, T>) ResponseUtil.result(StatusEnum.succeed, "put succeed", user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	        return (Map<String, T>) ResponseUtil.result(StatusEnum.failure, "put failure. Info:" + e.getMessage(), user);
		}
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public <T> Map<String, T> delete(@PathVariable int id) {
    	try {
			service.delete(id);
	        return (Map<String, T>) ResponseUtil.result(StatusEnum.succeed, "delete succeed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	        return (Map<String, T>) ResponseUtil.result(StatusEnum.failure, "delete failure. Info:" + e.getMessage());
		}
    }
}