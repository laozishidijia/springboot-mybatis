package com.winterchen.dao;


import com.winterchen.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {


    int insert(UserDomain record);

//    int addUser(UserDomain userDomain);

    List<UserDomain> selectUsers();
}