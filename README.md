# serviceOne Logs:

2022-05-01 13:44:55.951  INFO o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2022-05-01 13:44:56.249  INFO c.c.serviceOne.ServiceOneApplication     : Started ServiceOneApplication in 4.93 seconds (JVM running for 5.396)
2022-05-01 13:44:57.512  INFO o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2022-05-01 13:44:57.512  INFO o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2022-05-01 13:44:57.512  INFO o.s.web.servlet.DispatcherServlet        : Completed initialization in 0 ms
2022-05-01 13:45:25.924  INFO o.s.c.c.c.ConfigServerConfigDataLoader   : **Fetching config from server at : http://localhost:8888**
2022-05-01 13:45:27.106  INFO o.s.c.c.c.ConfigServerConfigDataLoader   : **Located environment: name=serviceOne, profiles=[dev], label=null, version=80568df28255f14107121eab9777bd5cb82f52f3, state=null**


## serviceOne: After updating properties in external properties in GitHub, hit below:

**POST** : http://localhost:8080/actuator/refresh
