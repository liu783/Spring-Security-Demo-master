package com.liujie.mapper;

import com.liujie.entity.User;
import feign.Param;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {


	@Select("select * from userinfo")
	List<User> selectAllUser();

	@Delete("delete from userinfo where userid = #{userid}")
	int del(@Param("userid") Integer userid);

	@Insert("insert into userinfo (username,userpwd,createTime,inSchool,sex,hobby) " +
			"values (#{username},#{userpwd}," +
			"#{createTime},#{inSchool},#{sex},#{hobby}) ")
	int addUser(User user);

	@Select("select COUNT(userid) from userinfo where username = #{uname} and userpwd = #{upwd}")
	int loginNamePwd(@Param("uname") String username, @Param("upwd") String userpwd);

	@Update("update userinfo set username = #{username},userpwd = #{userpwd},inSchool = #{inSchool}," +
			"sex = #{sex},hobby = #{hobby} where userid = #{userid}")
	int update(User user);



}
