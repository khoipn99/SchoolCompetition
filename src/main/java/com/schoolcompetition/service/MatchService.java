package com.schoolcompetition.service;

import com.schoolcompetition.model.entity.Match;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MatchService {
    List<Match> getAllMatch();
}
