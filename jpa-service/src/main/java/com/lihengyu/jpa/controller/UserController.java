package com.lihengyu.jpa.controller;

import com.lihengyu.entity.*;
import com.lihengyu.jpa.repository.UserRepository;
import com.lihengyu.jpa.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "没有什么意义",tags = {"用户","管理"})
@RestController
@RequestMapping("user")
@Slf4j
@CrossOrigin
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;



    @RequestMapping("test")
    public String test(){
        User user = new User();
        user.setUsername("mytest");
        user.setPassword("12345");
        user.setName("test");
        user.setEmail("123@qq.com");
        user.setTelephone("12345678912");
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String str = "2020-02-02";
//        Date date = simpleDateFormat.parse(String.valueOf(str));
//        user.setBirthday("2020-02-02");
        user.setSex(1);
        user.setState(1);
        user.setCode("admidd");
        DriverCard driverCard = new DriverCard();
        driverCard.setCardtype("A1");
//        driverCard.setExpiredate("2020-09-09");
        user.setDriverCard(driverCard);
        userRepository.save(user);
        return "ok";
    }


    @ApiOperation(value = "获取列表",notes = "获取列表。。。。",
            response=MyPageImpl.class,httpMethod="GET")
    @RequestMapping("list")
    @ApiResponse(code = 200,message="返回的MyPageImpl对象",response=MyPageImpl.class)
    public MyPageImpl<User> list(@ApiParam(name="userVo",value = "UserVo的对象",defaultValue = "")
                                 //@RequestBody
                                             UserVo userVo){
        System.out.print("参数是  " + userVo);

        MyPageImpl<User> userPage = userService.list(userVo);
        log.info(" 获取。。。。。。。。。。。。");
        userPage.getContent().iterator().forEachRemaining(x->{System.out.println("x is " + x);});
        log.info("page.class is " + userPage.getClass());
        return userPage;
    }

    @RequestMapping("add")
    public boolean add(@RequestBody User user){
        return userService.add(user);
    }

    @RequestMapping("del")
    public boolean del(@RequestParam(value = "id") int id){
        return userService.del(id);

    }


    @RequestMapping("departs")
    public List<Depart> getDeparts(){
        return  userService.listDeparts();
    }

    @RequestMapping("favourites")//获取爱好
    public List<Favourite> getFavourites(){
        return  userService.listFavourites();
    }
}
