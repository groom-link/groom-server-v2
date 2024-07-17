package team.groom.groomapi.security;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
  ADMIN, USER, ANONYNOUS;

  @Override
  public String getAuthority() {
    return "ROLE_"+name();
  }
}
