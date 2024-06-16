package com.blocklend.lending.protocol.controller.auth;

import com.blocklend.lending.protocol.dtos.request.RegisterUserRequest;
import com.blocklend.lending.protocol.dtos.response.AuthenticateUserResponse;
import com.blocklend.lending.protocol.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1")
public class RenderEndpointController {


    @GetMapping("/wakeRender")
    public ResponseEntity<String> wakeRender() {
        return ResponseEntity.ok("Render server is awake");
    }


}
