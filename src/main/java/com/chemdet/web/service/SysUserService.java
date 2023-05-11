package com.chemdet.web.service;

import com.chemdet.web.pojo.SysUser;

import java.util.List;

public interface SysUserService {

    List<SysUser> findAll();

    int insertSysUser(SysUser sysUser);

    int deleteById(Long id);

    int updateById(SysUser user);
}
