package com.dxc.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.login.entity.Course;
import com.dxc.login.repo.CourseRepository;

@Service
public class CourseService {
	@Autowired
	private CourseRepository repo;

	public List<Course> listAll() {
		return repo.findAll();
	}

	public void save(Course course) {
		repo.save(course);
	}

	public Course get(int id) {
		return repo.findById(id).get();
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}