package net.bolt.demo.service;

import java.util.List;

import net.bolt.demo.model.User;

public interface UserService {

	User save(User user);

	List<User> findAll();

}
