indows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

PS C:\Users\lenovo\Desktop\JspDemo> C:\Users\lenovo\Desktop\JspDemo
C:\Users\lenovo\Desktop\JspDemo : The term 'C:\Users\lenovo\Desktop\JspDemo' is not recognized as the name of a cmdlet, function, script file, or 
operable program. Check the spelling of the name, or if a path was included, verify that the path is correct and try again.
At line:1 char:1
+ C:\Users\lenovo\Desktop\JspDemo
+ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : ObjectNotFound: (C:\Users\lenovo\Desktop\JspDemo:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException
 
PS C:\Users\lenovo\Desktop\JspDemo> cd C:\Users\lenovo\Desktop\JspDemo
PS C:\Users\lenovo\Desktop\JspDemo> git status
fatal: not a git repository (or any of the parent directories): .git
PS C:\Users\lenovo\Desktop\JspDemo> git init
Initialized empty Git repository in C:/Users/lenovo/Desktop/JspDemo/.git/
PS C:\Users\lenovo\Desktop\JspDemo> git add .
warning: in the working copy of '.gitignore', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'pom.xml', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/java/org/Jsp/Main.java', LF will be replaced by CRLF the next time Git touches it
PS C:\Users\lenovo\Desktop\JspDemo> git commit -m "feat: implement Spring MVC JSP application"
[master (root-commit) 28d4245] feat: implement Spring MVC JSP application
 13 files changed, 573 insertions(+)
 create mode 100644 .gitignore
 create mode 100644 .idea/.gitignore
 create mode 100644 .idea/encodings.xml
 create mode 100644 .idea/misc.xml
 create mode 100644 .idea/vcs.xml
 create mode 100644 pom.xml
 create mode 100644 src/main/java/org/Jsp/Main.java
 create mode 100644 src/main/java/org/Jsp/config/webConfig.java
 create mode 100644 src/main/java/org/Jsp/controller/HelloController.java
 create mode 100644 src/main/webapp/WEB-INF/views/Home.jsp
 create mode 100644 src/main/webapp/assets/style.css
 create mode 100644 tomcat.8080/work/Tomcat/localhost/ROOT/org/apache/jsp/WEB_002dINF/views/Home_jsp.class
 create mode 100644 tomcat.8080/work/Tomcat/localhost/ROOT/org/apache/jsp/WEB_002dINF/views/Home_jsp.java
PS C:\Users\lenovo\Desktop\JspDemo> git remote add origin https://github.com/Ankitshukla63/JSP_WEBAPP.git
PS C:\Users\lenovo\Desktop\JspDemo> git branch -M main
PS C:\Users\lenovo\Desktop\JspDemo> git push -u origin main
Enumerating objects: 37, done.
Counting objects: 100% (37/37), done.
Delta compression using up to 8 threads
Compressing objects: 100% (20/20), done.
Writing objects: 100% (37/37), 10.94 KiB | 800.00 KiB/s, done.
Total 37 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Ankitshukla63/JSP_WEBAPP.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.
PS C:\Users\lenovo\Desktop\JspDemo> 
