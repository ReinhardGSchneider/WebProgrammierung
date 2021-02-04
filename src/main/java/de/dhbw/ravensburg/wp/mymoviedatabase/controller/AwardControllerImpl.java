package de.dhbw.ravensburg.wp.mymoviedatabase.controller;

import de.dhbw.ravensburg.wp.mymoviedatabase.model.Award;
import de.dhbw.ravensburg.wp.mymoviedatabase.service.AwardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/awards")
public class AwardControllerImpl implements de.dhbw.ravensburg.wp.myawarddatabase.controller.AwardController {

    private AwardService awardService;

    public AwardControllerImpl(AwardService awardService){
        this.awardService = awardService;
    }

    @Override
    @GetMapping
    public List<Award> getAllAwards(){ return this.awardService.getAllAwards();}


    @Override
    @DeleteMapping("/{awardId}")
    public void deleteAward(@PathVariable(name = "awardId") Long awardId){
        this.awardService.deleteAward(awardId);
    }

    @Override
    @GetMapping("/{awardId}")
    public Award getAwardById(@PathVariable(name = "awardId")Long awardId){return this.awardService.getAwardById(awardId);}

    @Override
    @PostMapping
    public Award addAward(@RequestBody Award award){
        return this.awardService.addAward(award);
    }

    @Override
    @PutMapping("/{awardId}")
    public Award updateAward(@PathVariable(name = "awardId") Long awardId, @RequestBody Award award){
        award.setId(awardId);
        return this.awardService.updateAward(award);
}
}