package dev.heimz.core.definition;

import dev.heimz.core.policy.Rule;
import org.immutables.value.Value.Default;

interface RuleDefinition {

    @Default
    default Rule[] rules() {
        return new Rule[]{Rule.PERMIT};
    }

}
