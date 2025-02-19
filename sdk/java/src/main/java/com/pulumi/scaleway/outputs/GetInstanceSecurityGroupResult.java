// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scaleway.outputs.GetInstanceSecurityGroupInboundRule;
import com.pulumi.scaleway.outputs.GetInstanceSecurityGroupOutboundRule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceSecurityGroupResult {
    private String description;
    private Boolean enableDefaultSecurity;
    private Boolean externalRules;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The default policy on incoming traffic. Possible values are: `accept` or `drop`.
     * 
     */
    private String inboundDefaultPolicy;
    /**
     * @return A list of inbound rule to add to the security group. (Structure is documented below.)
     * 
     */
    private List<GetInstanceSecurityGroupInboundRule> inboundRules;
    private @Nullable String name;
    /**
     * @return The ID of the organization the security group is associated with.
     * 
     */
    private String organizationId;
    /**
     * @return The default policy on outgoing traffic. Possible values are: `accept` or `drop`.
     * 
     */
    private String outboundDefaultPolicy;
    /**
     * @return A list of outbound rule to add to the security group. (Structure is documented below.)
     * 
     */
    private List<GetInstanceSecurityGroupOutboundRule> outboundRules;
    /**
     * @return The ID of the project the security group is associated with.
     * 
     */
    private String projectId;
    private @Nullable String securityGroupId;
    private Boolean stateful;
    private List<String> tags;
    private @Nullable String zone;

    private GetInstanceSecurityGroupResult() {}
    public String description() {
        return this.description;
    }
    public Boolean enableDefaultSecurity() {
        return this.enableDefaultSecurity;
    }
    public Boolean externalRules() {
        return this.externalRules;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The default policy on incoming traffic. Possible values are: `accept` or `drop`.
     * 
     */
    public String inboundDefaultPolicy() {
        return this.inboundDefaultPolicy;
    }
    /**
     * @return A list of inbound rule to add to the security group. (Structure is documented below.)
     * 
     */
    public List<GetInstanceSecurityGroupInboundRule> inboundRules() {
        return this.inboundRules;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The ID of the organization the security group is associated with.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return The default policy on outgoing traffic. Possible values are: `accept` or `drop`.
     * 
     */
    public String outboundDefaultPolicy() {
        return this.outboundDefaultPolicy;
    }
    /**
     * @return A list of outbound rule to add to the security group. (Structure is documented below.)
     * 
     */
    public List<GetInstanceSecurityGroupOutboundRule> outboundRules() {
        return this.outboundRules;
    }
    /**
     * @return The ID of the project the security group is associated with.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    public Optional<String> securityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }
    public Boolean stateful() {
        return this.stateful;
    }
    public List<String> tags() {
        return this.tags;
    }
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceSecurityGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private Boolean enableDefaultSecurity;
        private Boolean externalRules;
        private String id;
        private String inboundDefaultPolicy;
        private List<GetInstanceSecurityGroupInboundRule> inboundRules;
        private @Nullable String name;
        private String organizationId;
        private String outboundDefaultPolicy;
        private List<GetInstanceSecurityGroupOutboundRule> outboundRules;
        private String projectId;
        private @Nullable String securityGroupId;
        private Boolean stateful;
        private List<String> tags;
        private @Nullable String zone;
        public Builder() {}
        public Builder(GetInstanceSecurityGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.enableDefaultSecurity = defaults.enableDefaultSecurity;
    	      this.externalRules = defaults.externalRules;
    	      this.id = defaults.id;
    	      this.inboundDefaultPolicy = defaults.inboundDefaultPolicy;
    	      this.inboundRules = defaults.inboundRules;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.outboundDefaultPolicy = defaults.outboundDefaultPolicy;
    	      this.outboundRules = defaults.outboundRules;
    	      this.projectId = defaults.projectId;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.stateful = defaults.stateful;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder enableDefaultSecurity(Boolean enableDefaultSecurity) {
            this.enableDefaultSecurity = Objects.requireNonNull(enableDefaultSecurity);
            return this;
        }
        @CustomType.Setter
        public Builder externalRules(Boolean externalRules) {
            this.externalRules = Objects.requireNonNull(externalRules);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder inboundDefaultPolicy(String inboundDefaultPolicy) {
            this.inboundDefaultPolicy = Objects.requireNonNull(inboundDefaultPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder inboundRules(List<GetInstanceSecurityGroupInboundRule> inboundRules) {
            this.inboundRules = Objects.requireNonNull(inboundRules);
            return this;
        }
        public Builder inboundRules(GetInstanceSecurityGroupInboundRule... inboundRules) {
            return inboundRules(List.of(inboundRules));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        @CustomType.Setter
        public Builder outboundDefaultPolicy(String outboundDefaultPolicy) {
            this.outboundDefaultPolicy = Objects.requireNonNull(outboundDefaultPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder outboundRules(List<GetInstanceSecurityGroupOutboundRule> outboundRules) {
            this.outboundRules = Objects.requireNonNull(outboundRules);
            return this;
        }
        public Builder outboundRules(GetInstanceSecurityGroupOutboundRule... outboundRules) {
            return outboundRules(List.of(outboundRules));
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupId(@Nullable String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder stateful(Boolean stateful) {
            this.stateful = Objects.requireNonNull(stateful);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }
        public GetInstanceSecurityGroupResult build() {
            final var o = new GetInstanceSecurityGroupResult();
            o.description = description;
            o.enableDefaultSecurity = enableDefaultSecurity;
            o.externalRules = externalRules;
            o.id = id;
            o.inboundDefaultPolicy = inboundDefaultPolicy;
            o.inboundRules = inboundRules;
            o.name = name;
            o.organizationId = organizationId;
            o.outboundDefaultPolicy = outboundDefaultPolicy;
            o.outboundRules = outboundRules;
            o.projectId = projectId;
            o.securityGroupId = securityGroupId;
            o.stateful = stateful;
            o.tags = tags;
            o.zone = zone;
            return o;
        }
    }
}
