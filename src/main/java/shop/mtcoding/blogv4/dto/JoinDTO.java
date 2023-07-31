package shop.mtcoding.blogv4.dto;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class JoinDTO {
    @Column(nullable = false, length = 20, unique = true)
    String username;
    @Column(nullable = false, length = 20, unique = true)
    String password;
    @Column(nullable = false, length = 20, unique = true)
    String email;
}
