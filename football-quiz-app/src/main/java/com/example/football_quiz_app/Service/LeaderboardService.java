package com.example.football_quiz_app.Service;

import com.example.football_quiz_app.Model.LeaderboardEntry;
import com.example.football_quiz_app.Repository.LeaderboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderboardService {
    @Autowired
    private LeaderboardRepository leaderboardRepository;

    public LeaderboardEntry updateLeaderboard(LeaderboardEntry entry) {
        return leaderboardRepository.save(entry);
    }

    public List<LeaderboardEntry> getLeaderboardByDifficulty(String difficulty) {
        return leaderboardRepository.findByDifficultyOrderByScoreDesc(difficulty);
    }
}
