package com.checkmarx.sdk.dto.ast;

import com.checkmarx.sdk.dto.Filter;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Summary {
    private int totalPackages;
    private int directPackages;
    private int totalOutdatedPackages;
    private double riskScore;
    private Map<Filter.Severity, Integer> findingCounts;
}
