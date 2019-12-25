package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.mohe.mybatisdb.service.BaseService;

/**
 * <P>
 ** 类描述:
 * </p>
 * 
 * @author lxx date 2019年7月23日 下午3:47:52 新建
 */
@Service
public class UserService extends BaseService<UserMapper, User> {

	@Autowired
	private UserMapper userMapper;

	public List<User> list() {
		return userMapper.list();
	}

	/**
	 * 
	 * 检查该用户是否存在
	 * 
	 * @param openid
	 * @return
	 */
	public User checkOpenid(String openid) {
		return userMapper.checkOpenid(openid);
	}

}
