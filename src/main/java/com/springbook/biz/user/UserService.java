package com.springbook.biz.user;

public interface UserService {
	
	//CRUD 기능의 메소드 구현
	//회원 등록
	public void insetUserVO(UserVO vo);
	//회원 조회
	UserVO getUserVO(UserVO vo);
	
}
