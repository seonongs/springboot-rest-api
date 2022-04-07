package com.springbootrestapi.board;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class BoardService {

    private BoardRepository boardRepository;

    public List<BoardEntity> findAll() {
        return new ArrayList<>(boardRepository.findAll());
    }

}
