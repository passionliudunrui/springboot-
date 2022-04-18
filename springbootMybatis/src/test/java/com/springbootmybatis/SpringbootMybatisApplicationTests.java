package com.springbootmybatis;

import com.springbootmybatis.dao.AccountDao;
import com.springbootmybatis.entity.*;
import com.springbootmybatis.service.*;
import com.sun.tracing.dtrace.Attributes;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.jws.soap.SOAPBinding;
import java.util.Date;
import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {
    @Autowired
    private UserService userService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private NoteService noteService;

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private SeckillgoodsService seckillgoodsService;






    @Test
    public void orderTest(){

        
    }


    @Test
    public void seckillTest(){
        //seckillgoodsService.insert(new Seckillgoods(12,123,123,10,0,"秒杀商品",new Date(),new Date()));
        //seckillgoodsService.update(12);
        seckillgoodsService.delete(12);

    }





    @Test
    public void testAccount(){

        accountService.insert(17);

        Account account=new Account(12L,10,10000);
        accountService.update(account);

    }

    @Test
    public void testNote(){
        noteService.insert(new Note(12L,12L,330,new Date()));

    }

    @Test
    public void testFind(){
        List<Note> notes = noteService.findById(11L);
        for(Note note:notes){
            System.out.println(note);
        }

    }


    @Test
    public void testGoods(){
        goodsService.insert(new Goods(2,10,8,"正常购买2"));

    }

    @Test
    void contextLoads() {
        List<User>users=userService.findAll();
        for(User user:users){
            System.out.println(user);
        }

        User user=userService.check(18315624341L,"232333333333333333333333333332123432");
        System.out.println(user);
    }


    @Test
    void testInsert(){
        User user=new User(18315624345L,"LDR","232333333333333331233333333332123222");
        int insert = userService.insert(user);
        System.out.println(insert);
        System.out.println(user.getId());


    }

    @Test
    void testSelectById(){

        User user= userService.findById(18315624341L);
        System.out.println(user);
    }

    @Test
    public void update(){
        User user=new User(18315624345L,"gfdg","232333333333333333333333333332123432");
        userService.update(user);

    }



}