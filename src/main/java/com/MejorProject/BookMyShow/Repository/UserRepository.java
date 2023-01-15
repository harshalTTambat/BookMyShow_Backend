package com.MejorProject.BookMyShow.Repository;

import com.MejorProject.BookMyShow.Models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

}


