package com.checkmarx.sdk.dto.cxgo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CreateScan {
    @JsonProperty("project_id")
    public Integer projectId;
    @JsonProperty("engine_types")
    public List<String> engineTypes;
    @JsonProperty("branch")
    public String branch;

    CreateScan(Integer projectId, List<String> engineTypes, String branch) {
        this.projectId = projectId;
        this.engineTypes = engineTypes;
        this.branch = branch;
    }

    public static OdScanBuilder builder() {
        return new OdScanBuilder();
    }

    @JsonProperty("project_id")
    public Integer getProjectId() {
        return this.projectId;
    }

    @JsonProperty("project_id")
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @JsonProperty("engine_types")
    public List<String> getEngineTypes() {
        return engineTypes;
    }

    @JsonProperty("engine_types")
    public void setEngineTypes(List<String> engineTypes) {
        this.engineTypes = engineTypes;
    }

    @JsonProperty("branch")
    public String getBranch() {
        return branch;
    }

    @JsonProperty("branch")
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public static class OdScanBuilder {
        private Integer projectId;
        private List<String> engineTypes;
        private String branch;

        OdScanBuilder() {
        }

        public OdScanBuilder projectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }

        public OdScanBuilder engineTypes(List<String> engineTypes) {
            this.engineTypes = engineTypes;
            return this;
        }

        public OdScanBuilder branch(String branch) {
            this.branch = branch;
            return this;
        }

        public CreateScan build() {
            return new CreateScan(projectId, engineTypes, branch);
        }
    }
}
