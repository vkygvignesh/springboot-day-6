package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Child;
import com.example.demo.ChildService.childServ;

@RestController
public class Controllers
{
	@Autowired
	private childServ cserv;
	
	@GetMapping("/show")
	public List<Child> showStudents(){
		return cserv.getbaby();
	}
	
	@PostMapping("/add")
	public Child addStudent(@RequestBody Child obj) {
		return cserv.addbaby(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delEmployee(@PathVariable Long id) {
		cserv.deleteById(id);
	}
	
	@GetMapping("/show/{id}")
	public Optional<Child> findById(@PathVariable Long id) {
		return cserv.findById(id);
	}
	
	@GetMapping("/display")
	public List<Child> show(){
		return cserv.showValues();
	}  
	@GetMapping("/displayit")
	public List<Child> sort(){
		return cserv.sort();
	}
	
}