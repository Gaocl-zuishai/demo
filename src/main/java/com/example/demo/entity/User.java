package com.example.demo.entity;

import java.sql.Types;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.mohe.mybatisdb.annotation.FieldType;
import com.mohe.mybatisdb.annotation.Indexs;
import com.mohe.mybatisdb.annotation.Table;
import com.mohe.mybatisdb.entity.BaseEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * <P>
 ** 类描述 : 用户
 * </p>
 * @author lxx
 * @date 2019年7月31日 下午1:44:36
 */
@Getter
@Setter
@Table(explain="用户")
public class User extends BaseEntity {

	private static final long serialVersionUID = -6065135477834731068L;
	
	@FieldType(type=Types.VARCHAR,length=100,indexType = Indexs.NORMAL_INDEX,explain="用户的唯一标识")
	public String openid;
	
	@FieldType(type=Types.VARCHAR,length=100,explain="用户昵称")
	public String nickname;	//用户昵称
	
	@FieldType(type=Types.INTEGER,explain="用户的性别")
	public Integer sex;	//用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
	
	@FieldType(type=Types.VARCHAR,length=100,explain="省份")
	public String province;	//用户个人资料填写的省份
	
//	@FieldType(type=Types.VARCHAR,length=100,explain="城市")
//	public String city;	//普通用户个人资料填写的城市
//	
//	@FieldType(type=Types.VARCHAR,length=100,explain="国家，如中国为CN")
//	public String country;	
	
	@FieldType(type=Types.VARCHAR,length=500,explain="用户头像")
	public String headimgurl;	//用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@FieldType(type = Types.TIMESTAMP, explain = "出生日期")
	public Date birthday;
	
	@FieldType(type=Types.VARCHAR,length=100,explain="学历")
	public String education;
	
	@FieldType(type=Types.VARCHAR,length=100,explain="星座")
	public String constellation;
	
	@FieldType(type=Types.INTEGER,length=100,explain="年龄")
	public Integer age;
	
}
