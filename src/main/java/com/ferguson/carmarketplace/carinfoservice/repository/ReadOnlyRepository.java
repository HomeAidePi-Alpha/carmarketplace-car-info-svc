package com.homeaidepi.carmarketplace.carinfoservice.repository;

import com.homeaidepi.carmarketplace.core.entities.CarMakeName;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface ReadOnlyRepository<T, ID> extends Repository<T, ID> {
    Optional<T> findById(ID id);
    List<T> findAll();
    Long count();
    List<T> findByName(CarMakeName name);
    T findOneByName(CarMakeName name);
}
