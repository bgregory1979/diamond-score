package b.gregory.controllers;

import b.gregory.models.Scorecard;
import b.gregory.models.dao.ScorecardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by brian on 6/11/15.
 */

@Controller
public class ScorecardController {

    @Autowired
    ScorecardDao scorecardDao;

    @RequestMapping(value="/")
    public String index(Model model) {
        Scorecard scorecard = new Scorecard("St. Louis Cardinals", "Chicago Cubs");
        model.addAttribute("hometeam", scorecard.getHomeTeam());
        model.addAttribute("awayteam", scorecard.getAwayTeam());

        scorecardDao.save(scorecard);
        return "index";
    }
}
