package com.green.springfirst.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter //setter를 사용안한다면 생성자로만 값을 넣어준다
//@AllArgsConstructor를 쓰면 된다
//생성자를 사용하게 되면 쿼리문과 순서를 맞추는 편이 좋다 다만 타입이 같다면 순서가 상관은 없지만
//다른 타입끼리 순서가 섞인다면 오류가 난다

public class BoardVo {
    private int iboard;
    private String title;
    private String writer;
    private String createdAt;

    /*public void setCreated_at(String created_at){
        this.createdAt = created_at;
    } BoardMapper에서 select에서 적은 컬럼명과 멤버필드의 이름이 다르니 그 값을 넣어주는 1번째 방법 */
}
