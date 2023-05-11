package com.chemdet.web.service.impl;

import com.chemdet.web.mapper.SysUserMapper;
import com.chemdet.web.pojo.SysUser;
import com.chemdet.web.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }

    @Override
    public int insertSysUser(SysUser sysUser) {
        return sysUserMapper.insertSysUser(sysUser);
    }

    @Override
    public int deleteById(Long id) {
        return sysUserMapper.deleteById(id);
    }

    @Override
    public int updateById(SysUser user) {
        return sysUserMapper.updateById(user);
    }
}
