package com.hotel.galaxy.service;


import com.hotel.galaxy.model.Role;
import com.hotel.galaxy.model.User;

import java.util.List;

/**
 * @author Simpson Alfred
 */
public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}