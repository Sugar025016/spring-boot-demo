package com.bigdata.gxbuser.repository;

import com.bigdata.gxbuser.domain.TRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户角色
 *
 * @author fwj
 * @date 2019-02-12 22:29
 **/
public interface RoleRepository extends JpaRepository<TRoleEntity, Integer> {
}
