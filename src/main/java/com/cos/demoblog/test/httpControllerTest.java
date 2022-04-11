package com.cos.demoblog.test;

import org.springframework.web.bind.annotation.*;

// 사용자가 요청 -> 응답(HTML 파일)
// @Controller

// 사용자가 요청 -> 응답(Data)
@RestController
public class httpControllerTest {
    // 인터넷 브라우저 오쳥은 무조건 get 요청밖에 할 수 없다. (405에러)
    // http://localhost:8080/http/get (select)
    @GetMapping("/http/get")
    //public String getTest(@RequestParam int id, @RequestParam String username){
    public String getTest(Member m){    //id=1&username=ara&password=1234&email=ara@nate.com / MessageConverter(스프링부트)

        //return "get 요청: " + id + "," + username;
        return "get 요청: " + m.getId() + "," + m.getUsername() + "," + m.getPassword() + "," + m.getEmail();
    }
    // http://localhost:8080/http/post (insert)
    @PostMapping("/http/post")      // text/plain, application/json
    //public String postTest(Member m){
    //public String postTest(@RequestBody String text){
    public String postTest(@RequestBody Member m){      // MessageConverter(스프링부트)
        return "post 요청: " + m.getId() + "," + m.getUsername() + "," + m.getPassword() + "," + m.getEmail();

        //return "post 요청: " + text;
    }
    // http://localhost:8080/http/put (update)
    @PutMapping("/http/put")
    public String putTest(@RequestBody Member m){
        return "put 요청: " + m.getId() + "," + m.getUsername() + "," + m.getPassword() + "," + m.getEmail();
    }
    // http://localhost:8080/http/deleye (delete)
    @DeleteMapping("/http/delete")
    public String deleteTest(){
        return "delete 요청";
    }
}
