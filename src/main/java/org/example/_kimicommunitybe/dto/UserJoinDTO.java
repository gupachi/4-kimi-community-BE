package org.example._kimicommunitybe.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
//user entity 구성 (username, userId) 속성을 가지고 있다.
public class UserJoinDTO {
    @NotBlank(message = "이메일을 입력해주세요")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$\n", message = "올바른 이메일 주소 형식을 입력해주세요")
    private String email;

    @NotBlank(message = "비밀번호를 입력해주세요")
    @Size(min = 8, max = 20, message = "비밀번호는 8자이상 20자 이하여야됩니다")
    private String password;

    @NotBlank(message = "닉네임을 입력해주세요")
    @Pattern(regexp = "^[^\\s]+$", message = "공백은 포함할 수 없습니다.")
    @Max(10)
    private String nickname;

    @NotBlank(message = "프로필 사진을 추가해주세요")
    private String profile_image;
}
