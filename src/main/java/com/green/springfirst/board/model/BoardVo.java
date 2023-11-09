package com.green.springfirst.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVo {
    private int iboard;
    private String title;
    private String writer;
    private String createdAt;

    /*public void setCreated_at(String created_at){
        this.createdAt = created_at;
    } BoardMapper에서 select에서 적은 컬럼명과 멤버필드의 이름이 다르니 그 값을 넣어주는 1번째 방법 */
}
