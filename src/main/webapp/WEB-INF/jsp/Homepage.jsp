<%--
  Created by IntelliJ IDEA.
  User: xuweijie
  Date: 2017/3/7
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Home</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../resources/layui/css/layui.css"  media="all">
    <link rel="stylesheet" href="//res.layui.com/css/global.css?t=1490981130731" media="all">
    <script src="../resources/layui/layui.js" charset="utf-8"></script>
    <script>
        layui.use('element', function(){
            var element = layui.element();
            element.on('nav(demo)', function(elem){
                layer.msg(elem.text());
            });
        });
    </script>
</head>
<body>


    <div class="layui-layout layui-layout-admin">
        <div class="layui-header header header-demo">
            <div class="layui-main">
                <a class="logo" href="#">
                    <img src="//res.layui.com/images/layui/logo.png" alt="layui">
                </a>

                <ul class="layui-nav" lay-filter="">
                    <li class="layui-nav-item"><a href="">最新活动</a></li>
                    <li class="layui-nav-item layui-this"><a href="">产品</a></li>
                    <li class="layui-nav-item"><a href="">大数据</a></li>
                    <li class="layui-nav-item">
                        <a href="javascript:;">解决方案</a>
                        <dl class="layui-nav-child"> <!-- 二级菜单 -->
                            <dd><a href="">移动模块</a></dd>
                            <dd><a href="">后台模版</a></dd>
                            <dd><a href="">电商平台</a></dd>
                        </dl>
                    </li>
                    <li class="layui-nav-item"><a href="">社区</a></li>
                </ul>
                    <span class="layui-nav-bar" style="left: 44px; top: 55px; width: 0px; opacity: 0;"></span></ul>
            </div>
        </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <ul class="layui-nav layui-nav-tree site-demo-nav">
                <li class="layui-nav-item layui-nav-itemed">
                    <a href="javascript:;">默认展开</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">选项1</a></dd>
                        <dd><a href="javascript:;">选项2</a></dd>
                        <dd><a href="">跳转</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">解决方案</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">移动模块</a></dd>
                        <dd><a href="javascript:;">后台模版</a></dd>
                        <dd><a href="javascript:;">电商平台</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">产品</a></li>
                <li class="layui-nav-item"><a href="">大数据</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body layui-tab-content site-demo site-demo-body">
        <ul class="layui-tab-title site-demo-title">
            <li>预览</li>
            <li>查看代码</li>
            <li>帮助</li>
        </ul>
    </div>
    </div>

</body>
</html>
