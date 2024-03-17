package clase.taller.controller;

import static spark.Spark.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ConcurrentHashMap;

import static clase.taller.service.URLReader.check;

import clase.taller.model.User;
import clase.taller.service.Hash;
import spark.Session;

/**
 * Hello world!
 */
public final class Index {
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static ConcurrentHashMap<String, User> users = new ConcurrentHashMap();
     public static void main(String[] args) {
        try {
            prepareAdmon();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        port(getPort());
        staticFiles.location("/static");
        secure("certificados/ecikeystore.p12", "123456", null, null); 

        post("/logs", (req, res) -> {
            String username = req.queryParams("username");
            String password = req.queryParams("password");

            if (users.containsKey(username) && users.get(username).getPassword().equals(Hash.sha1(password))) {
                Session session = req.session(true);
                session.attribute("username", username);
                check( "certificates/myTrustStore", "123456");
                res.redirect("https://localhost:6000/dashboard");
                return null;
            }

            return "";
        });
     }

     static int getPort() {
      if (System.getenv("PORT") != null) {
          return Integer.parseInt(System.getenv("PORT"));
      }
      return 5000; //returns default port if heroku-port isn't set (i.e. on localhost)
  }

  private static void prepareAdmon() throws NoSuchAlgorithmException, UnsupportedEncodingException{
    User user = new User();
    user.setPassword(Hash.sha1("password"));
    user.setUsername("admin");
    users.put(user.getUsername(), user);
  }
}

