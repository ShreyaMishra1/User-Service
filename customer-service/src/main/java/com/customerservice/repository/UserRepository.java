package com.customerservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.customerservice.entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

}
