package shop.mtcoding.blogv4.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import shop.mtcoding.blogv4.dto.JoinDTO;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Repository
public class UserRepository {

    @Autowired
    private EntityManager em;
    @Transactional
    public void join(JoinDTO joinDTO){
        Query query = em.createNativeQuery("insert into user_tb(username,password,email) values(:username,:password,:email)");
        query.setParameter("username", joinDTO.getUsername());
        query.setParameter("password",joinDTO.getPassword());
        query.setParameter("email", joinDTO.getEmail());
        query.executeUpdate();
    }



}
