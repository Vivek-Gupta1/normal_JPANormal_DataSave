package com.vivek.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.Entity.Boss;

public interface BossRepo extends JpaRepository<Boss, Integer> {

}
