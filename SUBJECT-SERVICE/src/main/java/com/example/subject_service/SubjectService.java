package com.example.subject_service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SubjectService {

    private final SubjectRepository subjectRepository;

    public List<String> getSubject(){
        return List.of("maths");
    }

    public Subject postSubject(Subject subject) {
        return subjectRepository.save(subject);
    }
}
