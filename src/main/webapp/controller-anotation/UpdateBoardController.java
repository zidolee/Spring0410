package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class UpdateBoardController {

	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 수정 처리");
		
		// 1. 사용자 입력 정보 추출
//		request.setCharacterEncoding("utf-8");
//		String title = request.getParameter("title");
//		String content = request.getParameter("content");
//		String seq = request.getParameter("seq");
		
		
		// 2. DB 연동 처리
//		BoardVO vo = new BoardVO();
//		vo.setTitle(title);
//		vo.setContent(content);
//		vo.setSeq(Integer.parseInt(seq));
//		
//		BoardDAO boardDAO = new BoardDAO();
//		boardDAO.updateBoard(vo);
		
		// 화면 네비게이션
//		return "getBoardList.do";
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("getBoardList.do");
//		return mav;
		boardDAO.updateBoard(vo);
		return "redirect:getBoardList.do";
	}
	
}
