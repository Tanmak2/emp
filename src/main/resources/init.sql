-- 사용자 테이블
CREATE board(
	board_no int(5) AUTO_INCREMENT PRIMARY KEY comment '게시판 번호',
	title varchar(50) comment '개시판 제목',
	contents varchar(300) comment '게시판 내용',
	writer varchar(30) commet '작성자',
	create_at datetime DEFAULT current_timestamp comment '작성일자',
	board_count int(5) DEFAULT 0 comment '조회 수'
);