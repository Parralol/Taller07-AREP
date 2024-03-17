package clase.taller.controller;

import static clase.taller.service.URLReader.check;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.secure;

public class WebPage {
    public static void main(String[] args){
        port(getPort());
        secure("certificados/ecikeystore.p12", "123456", null, null);
        get("/dashboard",(req, res) -> {
            check("certificados/myTrustStore","123456");
            res.type("text/html");
            return "successfull logon";
        });
    }

    private static int getPort() {
        return 4567;
    }

}
