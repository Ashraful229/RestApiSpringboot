package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	//List<Course> list;

	@Autowired
  private CourseDao courseDao;
	
	public CourseServiceImpl() {

//		list=new ArrayList<>();
//		list.add(new Course(111,"java","good course"));
//		list.add(new Course(112,"c#","good course also"));
	}



	@Override
	public List<Course> getCourses()
	{
		return courseDao.findAll();
	}



	@Override
	public Course getCourse(long courseId) {
		
		
//		Course c=null;
//		for(Course course:list)
//		{
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}



	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		//list.add(course);
		courseDao.save(course);
		return course;
	}

}
