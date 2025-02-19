// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class ObjectBucketLifecycleRuleExpiration {
    private Integer days;

    private ObjectBucketLifecycleRuleExpiration() {}
    public Integer days() {
        return this.days;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectBucketLifecycleRuleExpiration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer days;
        public Builder() {}
        public Builder(ObjectBucketLifecycleRuleExpiration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
        }

        @CustomType.Setter
        public Builder days(Integer days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }
        public ObjectBucketLifecycleRuleExpiration build() {
            final var o = new ObjectBucketLifecycleRuleExpiration();
            o.days = days;
            return o;
        }
    }
}
