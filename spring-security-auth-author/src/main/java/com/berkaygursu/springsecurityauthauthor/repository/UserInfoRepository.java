package com.berkaygursu.springsecurityauthauthor.repository;

import com.berkaygursu.springsecurityauthauthor.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

    Optional<UserInfo> findByName(String username);
}
