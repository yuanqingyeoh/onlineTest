package org.example.question4;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
@PreAuthorize("hasRole('ADMIN')")
public class Question4 {
    // Can make @PreAuthorize configuration at class level
}
