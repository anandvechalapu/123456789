·       Ability to redirect to the login page after successful logout.

package com.123456789.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LogoutRepository extends JpaRepository<Logout, Long> {

    @Query("SELECT l FROM Logout l WHERE l.userId = :userId")
    Logout findByUserId(Long userId);

    void deleteByUserId(Long userId);

}