package com.example.trustme.controller;

import com.example.trustme.entities.Activity;
import com.example.trustme.services.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/activity")
@RequiredArgsConstructor
public class ActivityController {
    private final ActivityService activityService;

    @GetMapping
    private ResponseEntity<List<Activity>> activityList() {
        return ResponseEntity.ok(activityService.findAll());
    }

    @PostMapping
    private ResponseEntity<Activity> save(@RequestBody Activity activity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(activityService.create(activity));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Void> delete (@PathVariable String id){
        activityService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
