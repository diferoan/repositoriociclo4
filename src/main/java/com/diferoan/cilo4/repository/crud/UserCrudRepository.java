/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diferoan.cilo4.repository.crud;

import com.diferoan.cilo4.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Diego R
 */
public interface UserCrudRepository extends CrudRepository<User, Integer> {
    
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    
}