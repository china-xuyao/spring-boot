package com.xuyao.user.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xuyao.mapper.UserMapper;
import com.xuyao.user.model.User;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

	/* (non-Javadoc)
	 * @see com.xuyao.user.server.UserService#getAll()
	 */
	@Override
	public List<User> getAll() throws Exception {
		// TODO Auto-generated method stub
		return mapper.list();
	}

	/* (non-Javadoc)
	 * @see com.xuyao.user.server.UserService#getUser(java.lang.Integer)
	 */
	@Override
	public User getUser(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.get(id);
	}

	/* (non-Javadoc)
	 * @see com.xuyao.user.server.UserService#insert(com.xuyao.user.model.User)
	 */
	@Override
	public void insert(User user) throws Exception {
		// TODO Auto-generated method stub
		mapper.add(user);
	}

	/* (non-Javadoc)
	 * @see com.xuyao.user.server.UserService#update(com.xuyao.user.model.User)
	 */
	@Override
	public void update(User user) throws Exception {
		// TODO Auto-generated method stub
		mapper.update(user);
	}

	/* (non-Javadoc)
	 * @see com.xuyao.user.server.UserService#delete(java.lang.Integer)
	 */
	@Override
	public void delete(Integer id) throws Exception {
		// TODO Auto-generated method stub
		mapper.delete(id);
	}



}