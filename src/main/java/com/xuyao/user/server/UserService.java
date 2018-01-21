package com.xuyao.user.server;

import java.util.List;

import com.xuyao.user.model.User;

public interface UserService {
    public List<User> getAll() throws Exception;
    public User getUser(Integer id) throws Exception;
    public void insert(User user) throws Exception;
    public void update(User user) throws Exception;
    public void delete(Integer id) throws Exception;
}