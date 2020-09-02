package com.stephen.book.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stephen.book.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by ssc on 2020-09-02 17:03 .
 * Description:
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
}
