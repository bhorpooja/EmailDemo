package com.codekul.EmailDemo.repository;

import com.codekul.EmailDemo.model.Stud;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by pooja on 29/11/17.
 */
public interface StudRepo extends JpaRepository<Stud,Integer> {

    Stud save(Stud stud);

    Stud findByEmail(String email);
}
