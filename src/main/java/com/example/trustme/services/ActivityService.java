package com.example.trustme.services;

import com.example.trustme.entities.Activity;
import com.example.trustme.repositories.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActivityService {
    private final ActivityRepository activityRepository;


    public List<Activity> findAll(){
        return activityRepository.findAll();
    }

    public Activity create(Activity activity){
        return activityRepository.save(activity);
    }

    public void delete(String id){
        Activity activity = activityRepository.getReferenceById(String.valueOf(id));
        activityRepository.delete(activity);
    }
}
