package com.example.demo.ChildService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Child;
import com.example.demo.MyRepo4.Repository;

@Service
public class childServ {

	@Autowired
	private Repository repo;

	// addEmployee
	public Child addbaby(Child obj) {
		return repo.save(obj);
	}

	// getEmployee
	public List<Child> getbaby() {
		List<Child> arr = new ArrayList<>();
		arr = repo.findAll();
		return arr;
	}
	
	//deleteById  
	public void deleteById(Long id) {
		repo.deleteById(id);
	}
	
	//getById
	public Optional<Child> findById(Long id) {
		Optional<Child> g = repo.findById(id);
		return g;
	}
	
	//Paging
	public List<Child> showValues(){
		Pageable p=PageRequest.of(0,2);
		Page<Child> c=repo.findAll(p);
		return c.toList();
	}
	
	//Sorting
	public List<Child> sort(){
		return repo.findAll(Sort.by(Sort.Direction.DESC,"id"));
	
	}
}
