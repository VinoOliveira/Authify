package com.vino.Authify.dto;

import com.vino.Authify.model.user.UserRole;

public record RegisterDTO(String email, String password, UserRole role) {
}
