package net.bolt.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bolt.demo.dao.UserRepository;
import net.bolt.demo.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	protected UserRepository userRepository;

	@Override
	public User save(User user) {
		return this.userRepository.save(user);
	}
}
