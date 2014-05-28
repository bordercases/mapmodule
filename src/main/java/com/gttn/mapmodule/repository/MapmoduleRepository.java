package com.gttn.mapmodule.repository;
import com.gttn.mapmodule.domain.Mapmodule;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Mapmodule.class)
public interface MapmoduleRepository {
}
