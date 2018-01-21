package com.xuyao.mapper;

import java.util.List;

import com.xuyao.user.model.User;


public interface UserMapper {
    public List<User> list();
    public User get(Integer id);
    public void add(User user);
    public void update(User user);
    public void delete(Integer id);
}