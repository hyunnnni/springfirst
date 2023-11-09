package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardUpdateVo;
import com.green.springfirst.board.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardVo> selBoardList();

    BoardDetailVo selBoardById(int iboard);// #{iboard}에 들어갈 값

    // 이렇게 만들면 first프로젝트에 있는 BoardDao에 있던 메소드들처럼 mybatis가 만들어준다

    int insBoard(BoardInsDto bto);

    int postBoard(BoardInsDto bto);

    int delBoard(int iboard);

    int updBoard(BoardUpdateVo buo);
}
