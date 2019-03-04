package uk.ac.sheffield.coursemgr.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.domain.pojo.User;
import uk.ac.sheffield.coursemgr.service.UserService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World !";
    }

    @GetMapping("/{userId}")
    public void findUser(@PathVariable("userId") Long userId) {
        LOG.info("查找userId为{}的用户", userId);
        userService.selectByPrimaryKey(userId);
    }

    @PutMapping("")
    public void addUser(@RequestBody User user) {
        LOG.info("新增用户.");
        userService.insertUser(user);
    }

    @PostMapping("")
    public void updateUser(@RequestBody User user) {
        LOG.info("修改用户.");
        userService.updateUserByPrimaryKey(user);
    }


}
