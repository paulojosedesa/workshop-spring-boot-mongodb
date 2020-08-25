package com.nelioalves.es.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.es.workshopmongo.domain.User;
import com.nelioalves.es.workshopmongo.repository.UserRepository;
import com.nelioalves.es.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		User user = repo.findOne(id);
		if (user == null)
		throw new ObjectNotFoundException("Objeto não encontrado");
			
		}
		return user;
	}
}
