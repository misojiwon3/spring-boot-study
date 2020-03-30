package me.hanseung.controller;

import me.hanseung.model.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.hateoas.EntityModel;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RequestMapping("users")
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "hello user";
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        return user;
    }

    @GetMapping("/hateoas")
    public EntityModel<User> addLink() {
        User user = new User();
        user.setId(1L);
        user.setUsername("hanseung");
        user.setPassword("123456");

        EntityModel<User> em = new EntityModel<>(user);
        em.add(linkTo(methodOn(UserController.class).addLink()).withSelfRel());

        return em;
    }
}
