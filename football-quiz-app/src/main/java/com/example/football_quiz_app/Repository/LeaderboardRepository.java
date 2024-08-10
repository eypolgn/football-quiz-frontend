package com.example.football_quiz_app.Repository;

import com.example.football_quiz_app.Model.LeaderboardEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LeaderboardRepository extends JpaRepository<LeaderboardEntry, Long> {
    List<LeaderboardEntry> findByDifficultyOrderByScoreDesc(String difficulty);
}
