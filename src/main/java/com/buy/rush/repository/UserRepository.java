//package com.buy.rush.repository;
//
//import com.buy.rush.entity.User;
////import org.hibernate.annotations.NamedQuery;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import javax.persistence.NamedQuery;
//import java.util.List;
//
//public interface UserRepository extends JpaRepository<User, Long> {
//
//    List<User> findAllByUsername(String username);
//
//    @Query("select u from User u where u.password = ?1")
//    List<User> findByPassword(String password);
//
//}
