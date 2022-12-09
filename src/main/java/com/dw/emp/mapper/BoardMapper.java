package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.BoardVO;

@Mapper
public interface BoardMapper {
	
	List<BoardVO> selectBoard();
}
