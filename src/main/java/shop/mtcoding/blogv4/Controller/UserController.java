package shop.mtcoding.blogv4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import shop.mtcoding.blogv4.dto.JoinDTO;
import shop.mtcoding.blogv4.repository.UserRepository;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/joinForm")
    public String joinForm(){
        return "/user/joinForm";
    }
    @PostMapping("/join")
    public String join(JoinDTO joinDTO){
        userRepository.join(joinDTO);
        return "/user/loginForm";
    }

    @GetMapping("/loginForm")
    public String loginForm(){
        return "user/loginForm";
    }

    @PostMapping("/login")
    public String login(){

    }
}
