package com.javaex.dao;

import java.util.List;

import com.javaex.vo.EmaillistVo;

public class DaoTest {
	public static void main(String[] args) {
		//EmaillistVo vo = new EmaillistVo(0,"유","재","석");
		
		EmaillistDao dao = new EmaillistDao();
		//dao.insert(vo);
		
		List<EmaillistVo> emaillist = dao.getlist();
		for(EmaillistVo str : emaillist) {
			System.out.println(str.toString());
		}
		
	}
}
