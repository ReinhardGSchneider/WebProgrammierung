package de.dhbw.ravensburg.wp.myawarddatabase.controller;

import de.dhbw.ravensburg.wp.mymoviedatabase.model.Award;
import de.dhbw.ravensburg.wp.mymoviedatabase.model.Award;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface AwardController {

    @GetMapping
    public List<Award> getAllAwards();

    @DeleteMapping("/{awardId}")
    void deleteAward(@PathVariable("awardId") Long awardId);

    @GetMapping
    Award getAwardById(@PathVariable("awardId") Long awardId);

    @PostMapping
    Award addAward(@RequestBody Award award);

    @PutMapping("/{awardId}")
    Award updateAward(@PathVariable("awardId") Long awardId, @RequestBody Award award);

}