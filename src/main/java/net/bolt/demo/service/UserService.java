package net.bolt.demo.service;

import java.util.List;

import net.bolt.demo.model.User;

public interface UserService {

	User save(User user);

	/**
	 * Recupera la lista de usuarios
	 * @return lista de usuarios
	 */
	List<User> findAll();
	/**
	 * Elimina un usuario con el id recibido
	 * @param id
	 */
	void deleteUser(Long id);

}
