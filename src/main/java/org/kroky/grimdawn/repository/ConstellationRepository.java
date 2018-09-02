package org.kroky.grimdawn.repository;

import org.kroky.grimdawn.model.Constellation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstellationRepository extends JpaRepository<Constellation, String> {
    Page<Constellation> findByResAetherNotNull(Pageable pageable);
}
