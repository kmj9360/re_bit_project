package com.spring.mapper;

import com.spring.domain.ReplyVO;

public interface ReplyMapper {
	public int insert(ReplyVO vo);
	public ReplyVO read(Long bno);
	public int delete (Long bno);
	public int update(ReplyVO reply);
}
