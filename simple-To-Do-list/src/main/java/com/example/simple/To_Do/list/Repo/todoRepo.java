package com.example.simple.To_Do.list.Repo;

import com.example.simple.To_Do.list.model.todoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface todoRepo extends JpaRepository<todoModel,Long> {

}
