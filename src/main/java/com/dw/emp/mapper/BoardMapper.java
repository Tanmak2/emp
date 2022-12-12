package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.BoardVO;

@Mapper
public interface BoardMapper {
	
	List<BoardVO> selectBoard();
	
	public int insertBoard(BoardVO vo);
	
	public BoardVO selectBoardFindByBoardNo(int board_no);
	
	public int updateBoard(BoardVO vo);
	
	public int deleteBoard(int board_no);
}
