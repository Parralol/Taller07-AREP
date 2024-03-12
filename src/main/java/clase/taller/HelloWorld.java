package clase.taller;

import static spark.Spark.*;

/**
 * Hello world!
 */
public final class HelloWorld {
    
     public static void main(String[] args) {
        port(getPort());
        secure("certificados/ecikeystore.p12", "123456", null, null); 
        get("/hello", (req, res) -> Hash.sha1("123456"));
     }

     static int getPort() {
      if (System.getenv("PORT") != null) {
          return Integer.parseInt(System.getenv("PORT"));
      }
      return 5000; //returns default port if heroku-port isn't set (i.e. on localhost)
  }
}
