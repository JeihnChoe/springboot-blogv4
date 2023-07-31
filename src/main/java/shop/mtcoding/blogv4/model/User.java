package shop.mtcoding.blogv4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Table(name="user_tb")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(nullable = false, length = 20, unique = true)
    String username;
    @Column(nullable = false, length = 20, unique = true)
    String password;
    @Column(nullable = false, length = 20, unique = true)
    String email;
}
