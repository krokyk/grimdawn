package org.kroky.grimdawn.controller;

import org.kroky.grimdawn.exception.ResourceNotFoundException;
import org.kroky.grimdawn.model.Constellation;
import org.kroky.grimdawn.repository.ConstellationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstellationController {

    @Autowired
    private ConstellationRepository constellationRepository;

    @GetMapping("/constellations/{name}")
    public Constellation getConstellationByName(@PathVariable String name) {
        return constellationRepository.findById(name)
                .orElseThrow(() -> new ResourceNotFoundException("Constellation not found with name " + name));

    }

    @GetMapping("/constellations")
    public Page<Constellation> getConstellations(Pageable pageable) {
        return constellationRepository.findAll(pageable);
    }

    @GetMapping("/constellationsByAether")
    public Page<Constellation> getConstellationsByAetherResistance(Pageable pageable) {
        return constellationRepository.findByResAetherNotNull(pageable);
    }

    @GetMapping("/constellationsByProperty")
    public Page<Constellation> getConstellationsByAetherResistance(Example<Constellation> example, Pageable pageable) {
        return constellationRepository.findAll(example, pageable);
    }
}
