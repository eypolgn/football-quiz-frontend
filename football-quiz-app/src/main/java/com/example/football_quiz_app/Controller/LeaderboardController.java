package com.example.football_quiz_app.Controller;

import com.example.football_quiz_app.Model.LeaderboardEntry;
import com.example.football_quiz_app.Service.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaderboard")
public class LeaderboardController {
    @Autowired
    private LeaderboardService leaderboardService;

    @PostMapping
    public LeaderboardEntry updateLeaderboard(@RequestBody LeaderboardEntry entry) {
        return leaderboardService.updateLeaderboard(entry);
    }

    @GetMapping
    public List<LeaderboardEntry> getLeaderboard(@RequestParam String difficulty) {
        return leaderboardService.getLeaderboardByDifficulty(difficulty);
    }
}
