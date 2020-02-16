package dev.heimz.core.definition;

import org.immutables.value.Value.Default;

interface RoleDefinition {

  @Default
  default boolean role() {
    return true;
  }

  @Default
  default boolean roleHierarchy() {
    return true;
  }

  @Default
  default int maxRoleHierarchy() {
    return 10;
  }

  @Default
  default boolean application() {
    return false;
  }
}
