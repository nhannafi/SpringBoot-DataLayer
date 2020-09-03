package com.sip.AMS.Data.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sip.AMS.Data.entities.Provider;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {
// on peut ajouter d'autres méthodes spécifiques : HQL = Hibernate Query Language 
}

