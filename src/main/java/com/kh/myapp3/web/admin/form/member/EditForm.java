package com.kh.myapp3.web.admin.form.member;

import lombok.Data;

@Data
public class EditForm {
  public Long MemberId;
  private String email;       //이메일
  private String pw;          //비밀번호
  private String nickname;    //별칭
}