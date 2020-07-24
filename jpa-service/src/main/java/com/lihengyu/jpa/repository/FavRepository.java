package com.lihengyu.jpa.repository;

import com.lihengyu.entity.Favourite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavRepository extends JpaRepository<Favourite,Integer> {

}
