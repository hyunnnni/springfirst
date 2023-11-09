package com.green.springfirst.board;

import com.green.springfirst.ResVo;
import com.green.springfirst.board.model.BoardDetailVo;
import com.green.springfirst.board.model.BoardInsDto;
import com.green.springfirst.board.model.BoardUpdateVo;
import com.green.springfirst.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller 응답의 디폴트는 html이다 그래서 사용방법이 다르다
@RestController //응답의 디폴트가 json이다 이거도 빈 등록을 해준다 요청받고 응답받는
// 컨트롤러의 역할도 동시 수행
@RequiredArgsConstructor
// 유일한 (선택이 가능하지 않은) 클래스의 주소값을 생성자
public class BoardController {


    private final BoardService service;

    @GetMapping("/board")
    public List<BoardVo> getBoard() {
        return service.getBoard();
    }

    //get방식으로
    //똑같은 주소값이어도 날리는 방식에 따라 나뉠 수 있다
    // post방식으로
    @PostMapping("/board")

    //@ResponseBody : restController가 없을 때 html로만 보내던 컨트롤러의 목적을 바꾸고 싶었을 때
    //사용하던 애노테이션. json으로 보낼 수 있게 해준다
    /*public int insBoard(@RequestBody BoardInsDto bto) {//이건 json형태로 들어오던 값을 받아준다.

        service.getinsBoard(bto);
        return 1;
    }*/
    public ResVo postBoard(@RequestBody BoardInsDto dto) {
        System.out.println(dto);
        int result = service.postBoard(dto);
        System.out.println("result : " + result);
        return new ResVo(result);
    }

    // {iboard}의 값을 set 검색창에서 받아온 걸 애노테이션을 사용해 get해온다
    //그 값이 int iboard에 들어가고 다른 클래스에서 호출호출하면서 이 값을 전할 수 있다~
    //@pathvariable은 주소값의 {}인 부분을 파라미터로 받을 수 있게 해준다
    //애노테이션을 쓰고 원하는 타입형태로 바꿔서 파라미터를 받아서 쓸 수 있다.
    @GetMapping("/board/{iboard}")
    public BoardDetailVo getBoardDetail(@PathVariable int iboard) {
        return service.getiboard(iboard);
    }

    @DeleteMapping("/board/{iboard}")//위의 메소드와 같이 사용하려면 delete문은 delete맵핑을 쓴다
    public int getdelPk(@PathVariable int iboard) {
        int result = 0;
        System.out.println(iboard);
        result = service.getdelPk(iboard);
        System.out.println("result : " + result);
        return result;
    }

    @PutMapping("/board")
    public ResVo getupboard(@RequestBody BoardUpdateVo buo) {
        int result = service.getupdboard(buo);
        return new ResVo(result);
    }
}