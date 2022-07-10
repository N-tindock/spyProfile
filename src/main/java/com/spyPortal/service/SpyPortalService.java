package com.spyPortal.service;

import com.spyPortal.Form.PieStyle;
import com.spyPortal.Repo.PieStyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpyPortalService {
    @Autowired
    private PieStyleRepository pieStyleRepository;


    public PieStyle saveDepartment(PieStyle pieStyle) {
        return pieStyleRepository.save(pieStyle);
    }
}
