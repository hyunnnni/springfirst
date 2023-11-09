package com.green.springfirst.board.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString //toString오버라이딩 해준다
public class BoardInsDto {
    private String title;
    private String ctnts;
    private String writer;

}
