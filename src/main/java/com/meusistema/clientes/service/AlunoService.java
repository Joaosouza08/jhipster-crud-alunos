package com.meusistema.clientes.service;

import com.meusistema.clientes.domain.Aluno;
import com.meusistema.clientes.repository.AlunoRepository;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link com.meusistema.clientes.domain.Aluno}.
 */
@Service
@Transactional
public class AlunoService {

    private static final Logger LOG = LoggerFactory.getLogger(AlunoService.class);

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    /**
     * Save a aluno.
     *
     * @param aluno the entity to save.
     * @return the persisted entity.
     */
    public Aluno save(Aluno aluno) {
        LOG.debug("Request to save Aluno : {}", aluno);
        return alunoRepository.save(aluno);
    }

    /**
     * Update a aluno.
     *
     * @param aluno the entity to save.
     * @return the persisted entity.
     */
    public Aluno update(Aluno aluno) {
        LOG.debug("Request to update Aluno : {}", aluno);
        return alunoRepository.save(aluno);
    }

    /**
     * Partially update a aluno.
     *
     * @param aluno the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<Aluno> partialUpdate(Aluno aluno) {
        LOG.debug("Request to partially update Aluno : {}", aluno);

        return alunoRepository
            .findById(aluno.getId())
            .map(existingAluno -> {
                if (aluno.getNome() != null) {
                    existingAluno.setNome(aluno.getNome());
                }

                return existingAluno;
            })
            .map(alunoRepository::save);
    }

    /**
     * Get all the alunos.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<Aluno> findAll(Pageable pageable) {
        LOG.debug("Request to get all Alunos");
        return alunoRepository.findAll(pageable);
    }

    /**
     * Get one aluno by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<Aluno> findOne(Long id) {
        LOG.debug("Request to get Aluno : {}", id);
        return alunoRepository.findById(id);
    }

    /**
     * Delete the aluno by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        LOG.debug("Request to delete Aluno : {}", id);
        alunoRepository.deleteById(id);
    }
}
