package com.piyal.bite_speed.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IdentifyRequest {
  private String email;
  private String phoneNumber;
}
