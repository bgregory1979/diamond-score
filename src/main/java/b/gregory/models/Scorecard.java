package b.gregory.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by brian on 6/11/15.
 */

@Entity
@Table(name = "scorecards")
public class Scorecard {

    private int uid;
    private String homeTeam;
    private String awayTeam;


    public Scorecard(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public Scorecard() {};

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @NotNull
    @Column(name = "hometeam")
    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    @NotNull
    @Column(name = "awayteam")
    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }


}
