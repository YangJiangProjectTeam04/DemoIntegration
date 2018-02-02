<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>表格数据</title>

    <link href="../../css/demo.css" rel="stylesheet" type="text/css">

    <script src="../../scripts/boot.js" type="text/javascript"></script>
</head>
<body>

<div id="toolBar" class="mini-toolbar" style="width: 80.5%;border-bottom: 0px">

    <table>
        <tr>
            <td>
                <input class="mini-textbox"
                       id="key"
                       emptyText="请输入名字"
                       onenter="onKeyEnter">

                <input type="submit" value="提交" onclick="search()">
            </td>
        </tr>
    </table>

</div>

<div id="datagrid1"
     class="mini-datagrid"
     url="" style="width: 81%;height: 80%">

    <div property="columns">
        <div field="id" width="120">学生编号</div>
        <div field="username" width="120">学生姓名</div>
        <div field="address" width="120">学生地址</div>
    </div>

</div>

<%--<h2>Hello World!</h2>--%>
</body>

<script>

    var datagrid = mini.get("datagrid1");

    function search() {

        var key = mini.get("key").getValue();

        datagrid.load({ key: key });

    }

    function onKeyEnter() {

        search();

    }

</script>

</html>
