// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class LoadbalancerBackendHealthCheckTcp {
    private LoadbalancerBackendHealthCheckTcp() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadbalancerBackendHealthCheckTcp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(LoadbalancerBackendHealthCheckTcp defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public LoadbalancerBackendHealthCheckTcp build() {
            final var o = new LoadbalancerBackendHealthCheckTcp();
            return o;
        }
    }
}
