package com.kh.myapp3.web.admin.form.member;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class EditForm {
  public Long MemberId;
  private String email;       //이메일

  @Size(min = 0, max=10)
  private String pw;          //비밀번호
  @Size(min = 0, max=10)
  private String nickname;    //별칭
}
