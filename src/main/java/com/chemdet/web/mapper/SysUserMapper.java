package com.chemdet.web.mapper;

import com.chemdet.web.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper {

    // 查询全部SysUser记录
    List<SysUser> findAll();

    int insertSysUser(SysUser sysUser);

    int deleteById(Long id);

    int updateById(SysUser user);

}
