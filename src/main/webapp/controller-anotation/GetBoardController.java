package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;


@Controller
public class GetBoardController {

	@RequestMapping("/getBoard.do")
	public ModelAndView handleRequest(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 상세 조회 처리");
		
		// 1. 검색할 게시글 번호 추출
//		String seq = request.getParameter("seq");
//		
//		
//		// 2. DB 연동 처리
//		BoardVO vo = new BoardVO();
//		vo.setSeq(Integer.parseInt(seq));
//		
//		BoardDAO boardDAO = new BoardDAO();
//		BoardVO board = boardDAO.getBoardVO(vo);
		
		// 3. 검색 결과를 세션에 저장하고 상세 화면으로 이동한다.
//		HttpSession session = request.getSession();
//		session.setAttribute("board", board);
//		return "getBoard";
		
		// 3. 검색결과와 화면 정보를 ModelAndView에 저장 하여 리턴
//		ModelAndView mav = new ModelAndView();
		
		mav.addObject("board", boardDAO.getBoardVO(vo));
		mav.setViewName("getBoard.jsp");
		return mav;
	}

}
