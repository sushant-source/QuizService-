package com.quiz.services;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "http://localhost:8081", value = "Question-Client")
public interface QuestionClient {
}
