package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.BoardVO;
import com.dw.emp.vo.EmpVO;

@Mapper
public interface EmpMapper {

	List<EmpVO> selectEmp();
	
	EmpVO selectEmpfindByEmpno(int empno);
	
	int insertEmp(EmpVO vo);
	
	int updateEmp(EmpVO vo);
	
	int deleteEmp(int empno);

}
