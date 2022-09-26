// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IotRouteS3Args extends com.pulumi.resources.ResourceArgs {

    public static final IotRouteS3Args Empty = new IotRouteS3Args();

    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }

    @Import(name="bucketRegion", required=true)
    private Output<String> bucketRegion;

    public Output<String> bucketRegion() {
        return this.bucketRegion;
    }

    @Import(name="objectPrefix")
    private @Nullable Output<String> objectPrefix;

    public Optional<Output<String>> objectPrefix() {
        return Optional.ofNullable(this.objectPrefix);
    }

    @Import(name="strategy", required=true)
    private Output<String> strategy;

    public Output<String> strategy() {
        return this.strategy;
    }

    private IotRouteS3Args() {}

    private IotRouteS3Args(IotRouteS3Args $) {
        this.bucketName = $.bucketName;
        this.bucketRegion = $.bucketRegion;
        this.objectPrefix = $.objectPrefix;
        this.strategy = $.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IotRouteS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IotRouteS3Args $;

        public Builder() {
            $ = new IotRouteS3Args();
        }

        public Builder(IotRouteS3Args defaults) {
            $ = new IotRouteS3Args(Objects.requireNonNull(defaults));
        }

        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder bucketRegion(Output<String> bucketRegion) {
            $.bucketRegion = bucketRegion;
            return this;
        }

        public Builder bucketRegion(String bucketRegion) {
            return bucketRegion(Output.of(bucketRegion));
        }

        public Builder objectPrefix(@Nullable Output<String> objectPrefix) {
            $.objectPrefix = objectPrefix;
            return this;
        }

        public Builder objectPrefix(String objectPrefix) {
            return objectPrefix(Output.of(objectPrefix));
        }

        public Builder strategy(Output<String> strategy) {
            $.strategy = strategy;
            return this;
        }

        public Builder strategy(String strategy) {
            return strategy(Output.of(strategy));
        }

        public IotRouteS3Args build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            $.bucketRegion = Objects.requireNonNull($.bucketRegion, "expected parameter 'bucketRegion' to be non-null");
            $.strategy = Objects.requireNonNull($.strategy, "expected parameter 'strategy' to be non-null");
            return $;
        }
    }

}
