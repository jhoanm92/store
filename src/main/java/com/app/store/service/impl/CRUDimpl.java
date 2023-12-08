package com.app.store.service.impl;

import com.app.store.dto.audit.AuditVariablesDTO;
import com.app.store.dto.audit.AuditWrite;
import com.app.store.exception.ModeloNotFoundException;
import com.app.store.mapper.GenericMapper;
import com.app.store.repository.GenericRepository;
import com.app.store.service.CRUD;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Abstract Class CRUDimpl
 * Implements the operations crud
 * @param <T> Class entity
 * @param <D> Type of DTO, it must extends of AuditVariablesDTO
 * @param <ID> Type of id
 */
public abstract class CRUDimpl<T, D extends AuditVariablesDTO, ID> implements CRUD<D, ID> {

    @Autowired
    protected abstract GenericRepository<T, ID> getRepository();

    @Autowired
    private GenericMapper<T, D> mapper;

    @Autowired
    private AuditWrite<D> auditWrite;

    @Override
    public D register(D dto) {
        auditWrite.creation(dto);
        return mapper.toDto(getRepository().save(mapper.toEntity(dto)));
    }

    @Override
    public D update(D dto) {
        auditWrite.modofication(dto);
        return mapper.toDto(getRepository().save(mapper.toEntity(dto)));
    }

    @Override
    public List<D> getAll() {
        return mapper.toDtos(getRepository().findAll());
    }

    @Override
    public D getById(ID id) {
        return getRepository().findById(id)
                .map(x -> mapper.toDto(x))
                .orElseThrow(() -> new ModeloNotFoundException("ID NOT FOUND " + id));
    }

    @Override
    public void delete(ID id) {
        getById(id);
        getRepository().deleteById(id);
    }
}