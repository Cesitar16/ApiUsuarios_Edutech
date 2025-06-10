package com.edutech.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edutech.usuarios.models.Rol;

public interface RolRepository extends JpaRepository<Rol, Integer> {

}
