<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>freemarker页面</title>
</head>
<body>
Hello ${name}  <!--ftl的插值-->
<#setting number_format="currency"/>
<#assign answer=46/>
${answer}
${answer?string}
${answer?string.number}
${answer?string.currency}
${answer?string.percent}
</body>
</html>