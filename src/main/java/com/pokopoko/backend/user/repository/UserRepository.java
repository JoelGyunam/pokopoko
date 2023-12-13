package com.pokopoko.backend.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokopoko.backend.user.domain.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer> {

}
