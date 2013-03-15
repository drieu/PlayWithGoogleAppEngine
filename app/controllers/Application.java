package controllers;

import java.util.List;

import models.Alert;
import play.Logger;
import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
    	List<Alert> alerts = Alert.findAll();
        render(alerts);
    }

    /**
     * Save an alert.
     * @param date
     * @param level
     * @param servers
     * @param msg
     */
    public static void saveAlert(String date, String level, String servers, String msg ) {
        Logger.info("==>Date:" + date + " level:" + level + " msg:" + msg);
        Alert alert = new Alert(date, level, servers,  msg);
        alert.save();
        index();
    }

}