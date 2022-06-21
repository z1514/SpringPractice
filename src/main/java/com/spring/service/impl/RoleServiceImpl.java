package com.spring.service.impl;

import com.spring.dao.RoleDao;
import com.spring.domain.Role;
import com.spring.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> list() {
        List<Role> roleList = roleDao.findAll();
        return roleList;
    }
}
