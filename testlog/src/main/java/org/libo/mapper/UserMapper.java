package org.libo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.libo.entity.User;


@Mapper
public interface UserMapper {
    User Sel(int id);
    int Add(User user);
}
