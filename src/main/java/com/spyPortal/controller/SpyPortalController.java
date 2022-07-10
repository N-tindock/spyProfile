package com.spyPortal.controller;

import com.spyPortal.Form.PieStyle;
import com.spyPortal.Mappings.PieStyleMapping;
import com.spyPortal.service.SpyPortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class SpyPortalController {

    @Autowired
    private SpyPortalService spyPortalService;

    @PostMapping(PieStyleMapping.SAVE_DEPARTMENT)
    public PieStyle saveDepartment(@Valid @RequestBody PieStyle pieStyle) {
        return spyPortalService.saveDepartment(pieStyle);
    }
}

//    @PostMapping("/updateSignUpUser")
//    public ResponseEntity<?> updateSignUpUser(@RequestBody Register register) {
//        try {
//            Register result = this.crudService.updateSignUpUser(register);
//            return ResponseEntity.ok(result);
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//    }

//    @GetMapping("/Testing")
//    public String testing(){
//        return "testing reday";
//    }




