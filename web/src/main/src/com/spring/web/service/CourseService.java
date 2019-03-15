package com.spring.web.service;

import com.spring.web.entity.CourseVO;
import com.spring.web.entity.CourseVO1;

import java.util.List;

public interface CourseService {
    List<CourseVO> selectCurrentCourses();
    List<CourseVO1> selectFinshedCourses();
}