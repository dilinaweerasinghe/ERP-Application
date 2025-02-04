package com.shop.microservices.user_service.Repository;

import com.shop.microservices.user_service.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link User} entities.
 * <p>
 * This interface extends {@link JpaRepository} to provide CRUD operations and additional query methods
 * for the {@link User} entity.
 * </p>
 * <p>
 * The {@link Repository} annotation indicates that this interface is a Spring Data repository.
 * </p>
 *
 * @see User The {@link User} entity.
 * @see JpaRepository The {@link JpaRepository} interface providing CRUD operations.
 */
@Repository
public interface IUserRepository extends JpaRepository<User, String> {
    // Additional query methods can be defined here
}