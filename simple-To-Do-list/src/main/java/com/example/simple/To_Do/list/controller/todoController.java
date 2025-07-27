package com.example.simple.To_Do.list.controller;



import com.example.simple.To_Do.list.Repo.todoRepo;

import com.example.simple.To_Do.list.model.todoModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class todoController {

    @Autowired
    private todoRepo repo;

    @GetMapping("/")
    public String showToDos(Model model) {
        model.addAttribute("todos", repo.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String add(@RequestParam String title){
        todoModel newTodo = todoModel.builder().title(title).completed(false).build();
        repo.save(newTodo);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id) {
        todoModel existingTodo = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found " + id));
        existingTodo.setCompleted(true);
        repo.save(existingTodo);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        todoModel existingTodo = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found " + id));
        repo.delete(existingTodo);
        return "redirect:/";
    }

}
