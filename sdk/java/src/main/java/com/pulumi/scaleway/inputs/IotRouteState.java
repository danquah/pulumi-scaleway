// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.IotRouteDatabaseArgs;
import com.pulumi.scaleway.inputs.IotRouteRestArgs;
import com.pulumi.scaleway.inputs.IotRouteS3Args;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IotRouteState extends com.pulumi.resources.ResourceArgs {

    public static final IotRouteState Empty = new IotRouteState();

    /**
     * The date and time of the creation of the IoT Route
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The date and time of the creation of the IoT Route
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Database Route parameters
     * 
     */
    @Import(name="database")
    private @Nullable Output<IotRouteDatabaseArgs> database;

    /**
     * @return Database Route parameters
     * 
     */
    public Optional<Output<IotRouteDatabaseArgs>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * The ID of the route&#39;s hub
     * 
     */
    @Import(name="hubId")
    private @Nullable Output<String> hubId;

    /**
     * @return The ID of the route&#39;s hub
     * 
     */
    public Optional<Output<String>> hubId() {
        return Optional.ofNullable(this.hubId);
    }

    /**
     * The name of the route
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the route
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The region you want to attach the resource to
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region you want to attach the resource to
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Rest Route parameters
     * 
     */
    @Import(name="rest")
    private @Nullable Output<IotRouteRestArgs> rest;

    /**
     * @return Rest Route parameters
     * 
     */
    public Optional<Output<IotRouteRestArgs>> rest() {
        return Optional.ofNullable(this.rest);
    }

    /**
     * S3 Route parameters
     * 
     */
    @Import(name="s3")
    private @Nullable Output<IotRouteS3Args> s3;

    /**
     * @return S3 Route parameters
     * 
     */
    public Optional<Output<IotRouteS3Args>> s3() {
        return Optional.ofNullable(this.s3);
    }

    /**
     * The Topic the route subscribes to (wildcards allowed)
     * 
     */
    @Import(name="topic")
    private @Nullable Output<String> topic;

    /**
     * @return The Topic the route subscribes to (wildcards allowed)
     * 
     */
    public Optional<Output<String>> topic() {
        return Optional.ofNullable(this.topic);
    }

    private IotRouteState() {}

    private IotRouteState(IotRouteState $) {
        this.createdAt = $.createdAt;
        this.database = $.database;
        this.hubId = $.hubId;
        this.name = $.name;
        this.region = $.region;
        this.rest = $.rest;
        this.s3 = $.s3;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IotRouteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IotRouteState $;

        public Builder() {
            $ = new IotRouteState();
        }

        public Builder(IotRouteState defaults) {
            $ = new IotRouteState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The date and time of the creation of the IoT Route
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The date and time of the creation of the IoT Route
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param database Database Route parameters
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<IotRouteDatabaseArgs> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Database Route parameters
         * 
         * @return builder
         * 
         */
        public Builder database(IotRouteDatabaseArgs database) {
            return database(Output.of(database));
        }

        /**
         * @param hubId The ID of the route&#39;s hub
         * 
         * @return builder
         * 
         */
        public Builder hubId(@Nullable Output<String> hubId) {
            $.hubId = hubId;
            return this;
        }

        /**
         * @param hubId The ID of the route&#39;s hub
         * 
         * @return builder
         * 
         */
        public Builder hubId(String hubId) {
            return hubId(Output.of(hubId));
        }

        /**
         * @param name The name of the route
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the route
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param region The region you want to attach the resource to
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region you want to attach the resource to
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param rest Rest Route parameters
         * 
         * @return builder
         * 
         */
        public Builder rest(@Nullable Output<IotRouteRestArgs> rest) {
            $.rest = rest;
            return this;
        }

        /**
         * @param rest Rest Route parameters
         * 
         * @return builder
         * 
         */
        public Builder rest(IotRouteRestArgs rest) {
            return rest(Output.of(rest));
        }

        /**
         * @param s3 S3 Route parameters
         * 
         * @return builder
         * 
         */
        public Builder s3(@Nullable Output<IotRouteS3Args> s3) {
            $.s3 = s3;
            return this;
        }

        /**
         * @param s3 S3 Route parameters
         * 
         * @return builder
         * 
         */
        public Builder s3(IotRouteS3Args s3) {
            return s3(Output.of(s3));
        }

        /**
         * @param topic The Topic the route subscribes to (wildcards allowed)
         * 
         * @return builder
         * 
         */
        public Builder topic(@Nullable Output<String> topic) {
            $.topic = topic;
            return this;
        }

        /**
         * @param topic The Topic the route subscribes to (wildcards allowed)
         * 
         * @return builder
         * 
         */
        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public IotRouteState build() {
            return $;
        }
    }

}
