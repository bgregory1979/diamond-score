package b.gregory.models.dao;

import b.gregory.models.Scorecard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

/**
 * Created by brian on 6/12/15.
 */

@Transactional
@Repository
public interface ScorecardDao extends CrudRepository<Scorecard, Integer> {
    Scorecard findByHomeTeam(String homeTeam);
    Scorecard findByAwayTeam(String awayTeam);
}
