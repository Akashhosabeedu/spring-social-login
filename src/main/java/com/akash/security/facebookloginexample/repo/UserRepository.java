//package com.akash.security.facebookloginexample.repo;
//
//import com.akash.security.facebookloginexample.entity.User;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//
//public interface UserRepository extends CrudRepository<User, Long> {
//
//    @Query("SELECT u FROM User u WHERE u.username = :username")
//    public User getUserByUsername(@Param("username") String username);
//}