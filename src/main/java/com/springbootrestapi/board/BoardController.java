package com.springbootrestapi.board;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class BoardController {

    private BoardService boardService;

    @RequestMapping(value= "/list", method = RequestMethod.GET)
    public List<BoardDto> getPageList {
        return boardService.getPageList(1);
    }
}
