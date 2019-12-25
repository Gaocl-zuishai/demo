package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.User;
import com.mohe.mybatisdb.mapper.BaseMapper;

/**  
 * <P>
 ** 类描述: 
 * </p>
 * @author lxx
 * date 2019年7月23日 下午3:46:35 新建 
*/
@Mapper
public interface UserMapper extends BaseMapper<User>{

	
	
	@Select("select * from t_user")
	public List<User> list();
	/**
	   * 检查openid对应是否存在
	 * @param openid
	 * @return
	 */
	@Select("select timeKey,openid from t_user where openid=#{openid}")
	public User checkOpenid(@Param("openid") String openid);
	
	
	
	
}
