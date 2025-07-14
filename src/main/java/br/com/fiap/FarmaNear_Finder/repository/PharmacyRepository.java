package br.com.fiap.FarmaNear_Finder.repository;

import br.com.fiap.FarmaNear_Finder.model.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
}
