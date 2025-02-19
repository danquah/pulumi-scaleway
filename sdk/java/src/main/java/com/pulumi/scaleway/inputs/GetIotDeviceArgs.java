// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIotDeviceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIotDeviceArgs Empty = new GetIotDeviceArgs();

    /**
     * The device ID.
     * Only one of the `name` and `device_id` should be specified.
     * 
     */
    @Import(name="deviceId")
    private @Nullable Output<String> deviceId;

    /**
     * @return The device ID.
     * Only one of the `name` and `device_id` should be specified.
     * 
     */
    public Optional<Output<String>> deviceId() {
        return Optional.ofNullable(this.deviceId);
    }

    /**
     * The hub ID.
     * 
     */
    @Import(name="hubId")
    private @Nullable Output<String> hubId;

    /**
     * @return The hub ID.
     * 
     */
    public Optional<Output<String>> hubId() {
        return Optional.ofNullable(this.hubId);
    }

    /**
     * The name of the Hub.
     * Only one of the `name` and `device_id` should be specified.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Hub.
     * Only one of the `name` and `device_id` should be specified.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * `region`) The region in which the hub exists.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return `region`) The region in which the hub exists.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private GetIotDeviceArgs() {}

    private GetIotDeviceArgs(GetIotDeviceArgs $) {
        this.deviceId = $.deviceId;
        this.hubId = $.hubId;
        this.name = $.name;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIotDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIotDeviceArgs $;

        public Builder() {
            $ = new GetIotDeviceArgs();
        }

        public Builder(GetIotDeviceArgs defaults) {
            $ = new GetIotDeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceId The device ID.
         * Only one of the `name` and `device_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder deviceId(@Nullable Output<String> deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        /**
         * @param deviceId The device ID.
         * Only one of the `name` and `device_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder deviceId(String deviceId) {
            return deviceId(Output.of(deviceId));
        }

        /**
         * @param hubId The hub ID.
         * 
         * @return builder
         * 
         */
        public Builder hubId(@Nullable Output<String> hubId) {
            $.hubId = hubId;
            return this;
        }

        /**
         * @param hubId The hub ID.
         * 
         * @return builder
         * 
         */
        public Builder hubId(String hubId) {
            return hubId(Output.of(hubId));
        }

        /**
         * @param name The name of the Hub.
         * Only one of the `name` and `device_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Hub.
         * Only one of the `name` and `device_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param region `region`) The region in which the hub exists.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region `region`) The region in which the hub exists.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetIotDeviceArgs build() {
            return $;
        }
    }

}
