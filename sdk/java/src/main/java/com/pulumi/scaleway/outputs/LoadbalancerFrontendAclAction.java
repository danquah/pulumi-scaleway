// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LoadbalancerFrontendAclAction {
    /**
     * @return The action type. Possible values are: `allow` or `deny`.
     * 
     */
    private String type;

    private LoadbalancerFrontendAclAction() {}
    /**
     * @return The action type. Possible values are: `allow` or `deny`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadbalancerFrontendAclAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        public Builder() {}
        public Builder(LoadbalancerFrontendAclAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public LoadbalancerFrontendAclAction build() {
            final var o = new LoadbalancerFrontendAclAction();
            o.type = type;
            return o;
        }
    }
}
