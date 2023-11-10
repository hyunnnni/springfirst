package com.green.springfirst.board;

import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardUpdateVo;
import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service//이거도 빈 등록이면서 가진 기능을 수행한다
//@RequiredArgsConstructor
// 빈? 등록한 것. 이 클래스의 객체 생성을 spring컨테이너가 해준다
// spring이 주소값을 가지고 있다
//이때 싱글톤으로 한다 한 프로젝트의 객체 하나만 만드는 것
public class BoardService {

    //@Autowired 멤버필드에 바로 쓰면 직접적으로 주소값을 넣어주기 때문에 사용을 잘 안하는 게 좋다
    private final BoardMapper mapper;


    @Autowired//가진 주소값을 달라고 하는 주소값 명시는 안됨
    //타입으로 받을 수 있는 것이 있다면 달라고 하는 애노테이션
    // 이런 종류의 애노테이션이 더 있다
    //생성자를 이용해 주소값을 받는 걸 권장한다.
    public BoardService(BoardMapper mapper){
        this.mapper = mapper;
    }
    //생성자가 하나라면 자동으로 넣어주고 여러 개면 애노테이션을 적어줘야 한다
    //인식을 해서 주입받는다.

    public List<BoardVo> getBoard(){
        return mapper.selBoardList();
    }

    public BoardDetailVo getiboard(int iboard){
        return mapper.selBoardById(iboard);
    }

    public int getinsBoard(BoardInsDto bto){
        return mapper.insBoard(bto);
    }
    public int postBoard(BoardInsDto bto){
        return mapper.insBoard(bto);
    }

    public int getdelPk(int iboard){
        return mapper.delBoard(iboard);
    }

    public int getupdboard(BoardUpdateVo buo) {
        return mapper.updBoard(buo);
    }
}
