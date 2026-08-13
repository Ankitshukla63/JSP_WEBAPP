<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Spring MVC Demo</title>
    <link rel="stylesheet" href="/assets/style.css">
</head>

<body>

<div class="container">

    <h1>Spring MVC Jsp Demo</h1>
    <p>${massage}</p>  <%--  This message comes from HelloController model.addAttribute("message", "Enter your name");--%>

<%--
   ye /green api call krega aur iska method post hai jaise hi submit button click krenge
--%>
    <form action="/greet" method="post">

        <input
                type="text"
                name="name"
                placeholder="Enter your name"
                required>
        <br>

        <button type="submit">Submit</button>

    </form>

</div>

</body>
</html>