package dev.heimz.core.definition;

import org.immutables.value.Value.Default;

interface PolicyDefinition extends RoleDefinition, SubjectDefinition, RuleDefinition {

    @Default
    default boolean object() {
        return true;
    }

    @Default
    default boolean action() {
        return true;
    }

    @Default
    default boolean priority() {
        return false;
    }

}
