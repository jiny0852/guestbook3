package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.PersonVo;


@Controller
public class GuestbookController {
	
	//필드
	//dao를 메모리에 올린다
	@Autowired
	private GuestbookDao guestbookDao;
	
	//생성자
	//메서드 gs
       
	//메서드 일반 ////////////////////////////////////////	
	
	/* 삭제 */
	@RequestMapping ( value="delete", method= { RequestMethod.GET, RequestMethod.POST } )
	public String delete ( @RequestParam(value="no") int no , 
						   @RequestParam(value="password") String password  ) {
		
		System.out.println("phonebookController.deleteform()");
		
		int count = guestbookDao.deletePerson(no, password);
		System.out.println(count);

		
		return "redirect:/list";
	} 
	
	
	/* 삭제폼 */
	@RequestMapping ( value="deleteform", method={RequestMethod.GET, RequestMethod.POST}  )
	public String deleteForm( @RequestParam(value="no") int no , Model model ) {
		
		System.out.println("guestbookController.deleteForm()");
		
		System.out.println(no);
		
		//메소드를 이용해서 저장한다
		PersonVo personVo = guestbookDao.getPersonOne(no);
		System.out.println("deleteform : " + personVo);
				
		model.addAttribute("personVo", personVo);
		
		return "deleteForm";
		
	}
	
	
	/* 등록 */
	@RequestMapping ( value="/insert", method={RequestMethod.GET, RequestMethod.POST}  )
	public String insert ( @ModelAttribute PersonVo personVo ) {
		
		System.out.println("guestbookController.insert()");
		
		System.out.println(personVo);

		
		//메소드를 이용해서 저장한다
		int count = guestbookDao.insertPerson(personVo);
		System.out.println(count);
		
		//리스트로 리다이렉트
		return "redirect:/list";
		
	}
	
	
	/* 리스트-등록폼 */
	@RequestMapping ( value="/list", method={RequestMethod.GET, RequestMethod.POST}  )
	public String list ( Model model ) {
		
		System.out.println("guestbookController.list()");
		
		//메소드를 이용해서 저장한다
		List<PersonVo> personList = guestbookDao.getPersonList();
		
		System.out.println(personList);
		
		model.addAttribute("personList", personList);
		
		return "addList";
		
	}
	
	


	


}

