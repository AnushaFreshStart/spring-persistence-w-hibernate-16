package com.apress.springpersistence.audiomanager.dao;

import com.apress.springpersistence.audiomanager.domain.Thing;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.net.URL;
import java.util.List;

/**
 * Created by pfisher on 10/2/14.
 */
@RepositoryRestResource(collectionResourceRel = "things", path = "things")
public interface ThingRepository extends PagingAndSortingRepository<Thing, URL> {

    public List<Thing> findByName(@Param("name") String name);
}
