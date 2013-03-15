package models;

import siena.Column;
import siena.Generator;
import siena.Id;
import siena.Model;
import siena.Query;

import java.util.List;

public class Alert extends Model {

    @Id(Generator.AUTO_INCREMENT)
    public Long id;

    @Column("date")
    public String date;

    @Column("level")
    public String level;

    @Column("servers")
    public String servers;

    @Column("msg")
    public String msg;

    public Alert(String date, String level, String servers, String msg) {
        this.date = date;
        this.level = level;
        this.servers = servers;
        this.msg = msg;
    }

    static Query<Alert> all() {
        return Model.all(Alert.class);
    }

    public static List<Alert> findAll() {
        return all().fetch();
    }

    public static Alert findById(Long id) {
        return all().filter("id", id).get();
    }

    public static Alert findByLogin(String login) {
        return all().filter("login", login).get();
    }
}
