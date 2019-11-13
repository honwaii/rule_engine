package com.honwaii.ruleengine.domain.rule;

import lombok.Data;

@Data
public class SimpleRuleNode {
    private String name;
    private String type;
    private String group;
}
