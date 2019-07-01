<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/6
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

    <hr>
    <p>TestRequestMapping</p>
    <a href="/hello.form">hello</a>

    <form action="/testRequestMapping.form" method="post">
      <button>testRequestMapping</button>
    </form>

    <a href="/testParams1.form?name=张三">testParams1</a><br>

    <a href="/testParams2.form?name=张三&pwd=12345">testParams2   name</a><br>
    <a href="/testParams2.form?name=张三&pwd=12345">testParams2   pwd</a><br>
    <a href="/testParams2.form?name=张三&pwd=12345">testParams2   sex</a><br>

    <a href="/testHeaders.form">testHeaders</a>
    <hr>
    <br><br><br><br><br><br><br><br><br><br><br>
    <p>TestRequestParam</p>
    <a href="/TestRequestParam/testValue.form?username=张三&password=123456">testValue</a>
    <a href="/TestRequestParam/testRequired.form?username=张三">testRequired</a>
    <a href="/TestRequestParam/testDefaultValue.form?username=张三">testDefaultValue</a>

    <hr>
    <br><br><br><br><br><br><br><br><br>
    <p>testHeader</p>
    <a href="/testHeader/testHeader.form">testHeader</a>

    <hr>
    <br><br><br><br><br><br><br><br><br>
    <a href="/testCoolieValue/testCookieValue.form">testCookieValue</a>

    <hr>
    <br><br><br><br><br><br><br><br><br>
    <form action="/testPOJO.form" method="post"><br>
      用户名：<input type="text" name="userName"><br>
      密码：<input type="password" name="password"><br>
      联系电话：<input type="text" name="tel"><br>
      年龄：<input type="text" name="age"><br>
      住址<input type="text" name="address.address"><br>
      <button type="submit">提交</button>
    </form>

    <hr>
    <br><br><br><br><br><br><br><br><br>

    <form action="/TestRequestParam/testUsers.form" >
      用户名1：<input type="text" name="userList[0].userName"><br>
      密码1：<input type="password" name="userList[0].password"><br>
      联系电话1：<input type="text" name="userList[0].tel"><br>
      年龄1：<input type="text" name="userList[0].age"><br>
      住址1<input type="text" name="userList[0].address.address"><br>
      用户名2：<input type="text" name="userList[1].userName"><br>
      密码2：<input type="password" name="userList[1].password"><br>
      联系电话2：<input type="text" name="userList[1].tel"><br>
      年龄2：<input type="text" name="userList[1].age"><br>
      住址2<input type="text" name="userList[1].address.address"><br>
      <button type="submit">提交</button>
    </form>
  </body>
</html>
