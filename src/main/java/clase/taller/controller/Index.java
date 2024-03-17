package clase.taller.controller;

import static spark.Spark.*;

import clase.taller.service.Hash;

/**
 * Hello world!
 */
public final class Index {
    
    private static HashMap<> users = new HashMap<>()
     public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/static");
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
