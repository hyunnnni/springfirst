package com.green.springfirst.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDetailVo {//동일하더라도 셀렉 시 하나씩 만들어 주는 게 좋다
    //수정이 생길 시 용이하다
    private int iboard;
    private String title;
    private String ctnts;
    private String writer;
    private String createdAt;

}
