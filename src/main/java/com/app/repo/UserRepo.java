package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.entity.UserEntity;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer>{
	UserEntity findByEmail(String email);
	
//	@Modifying
//    @Query("UPDATE UserEntity e SET e.refer_count = :count WHERE e.referrer = :referrer")
//	boolean findByReferIdAndUpdate(@Param("referrer") String referrer, @Param("count") Integer count);
}
