package com.aditya.multimodule.repository;

import com.aditya.multimodule.model.Basic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicRepository extends JpaRepository<Basic, Integer>
{

}
