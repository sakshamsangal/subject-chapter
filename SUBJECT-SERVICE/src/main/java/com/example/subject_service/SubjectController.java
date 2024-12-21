package com.example.subject_service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/subject")
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectService subjectService;
    private final MyClient myClient;

    @GetMapping("/")
    public ResponseEntity<List<String>> getSubjects() {
        Object post = myClient.getPost();
        log.info(post.toString());
        List<String> subject = subjectService.getSubject();
        return ResponseEntity.ok(subject);
    }

    @PostMapping("/")
    public ResponseEntity<Subject> getSubjects(@RequestBody Subject subject) {
        Subject savedsubject = subjectService.postSubject(subject);
        return ResponseEntity.ok(savedsubject);
    }
}
