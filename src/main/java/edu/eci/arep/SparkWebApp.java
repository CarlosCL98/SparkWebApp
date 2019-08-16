package edu.eci.arep;

import static spark.Spark.get;

/**
 * 
 *
 */
public class SparkWebApp {

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello Heroku");
    }
    
    static int getPort() {
        int port = 4567; //default port if heroku-port isn't set
        if (System.getenv("PORT") != null) {
            port = Integer.parseInt(System.getenv("PORT"));
        }
        return port;
    }
}
