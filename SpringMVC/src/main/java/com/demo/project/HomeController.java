package com.demo.project;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sample.domain.Student;
import com.sample.orm.StudentDAO;
import com.sample.orm.StudentHibernateDAOImpl;
import com.sample.orm.StudentSpringDAOImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = Logger.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView startHome(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}."+ locale);
		Student student = new Student();
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("home", student );
		model.addAttribute("serverTime", formattedDate );
		 return new ModelAndView("homepage", "", model);
	}
	
	@RequestMapping(value="/homeaction", method=RequestMethod.POST)
    public ModelAndView greetingSubmit(@ModelAttribute("home") Student student, Model model) {
        System.out.println(student.getStudentname());
//        StudentDAO studentDao = new StudentHibernateDAOImpl();
        StudentDAO studentDao = new StudentSpringDAOImpl();
        studentDao.setStudent(student);
        List<Student> students = studentDao.readStudent();
//        for(Student student1 : students){
//        	System.out.println("name is "+student1.getStudentname()+" and age is "+student1.getAge());
//        }
//        List<Student> students	= new ArrayList<Student>();
//        students.add(student);
        students.add(student);
        System.out.println("hi");
        
        model.addAttribute("result",students);
        
        return  new ModelAndView("result","",model);
    }

	
}
