// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IotHubArgs extends com.pulumi.resources.ResourceArgs {

    public static final IotHubArgs Empty = new IotHubArgs();

    /**
     * Wether to enable the device auto provisioning or not
     * 
     */
    @Import(name="deviceAutoProvisioning")
    private @Nullable Output<Boolean> deviceAutoProvisioning;

    /**
     * @return Wether to enable the device auto provisioning or not
     * 
     */
    public Optional<Output<Boolean>> deviceAutoProvisioning() {
        return Optional.ofNullable(this.deviceAutoProvisioning);
    }

    /**
     * Whether to enable the hub events or not
     * 
     */
    @Import(name="disableEvents")
    private @Nullable Output<Boolean> disableEvents;

    /**
     * @return Whether to enable the hub events or not
     * 
     */
    public Optional<Output<Boolean>> disableEvents() {
        return Optional.ofNullable(this.disableEvents);
    }

    /**
     * Wether the IoT Hub instance should be enabled or not.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Wether the IoT Hub instance should be enabled or not.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Topic prefix for the hub events
     * 
     */
    @Import(name="eventsTopicPrefix")
    private @Nullable Output<String> eventsTopicPrefix;

    /**
     * @return Topic prefix for the hub events
     * 
     */
    public Optional<Output<String>> eventsTopicPrefix() {
        return Optional.ofNullable(this.eventsTopicPrefix);
    }

    /**
     * Custom user provided certificate authority
     * 
     */
    @Import(name="hubCa")
    private @Nullable Output<String> hubCa;

    /**
     * @return Custom user provided certificate authority
     * 
     */
    public Optional<Output<String>> hubCa() {
        return Optional.ofNullable(this.hubCa);
    }

    /**
     * Challenge certificate for the user provided hub CA
     * 
     */
    @Import(name="hubCaChallenge")
    private @Nullable Output<String> hubCaChallenge;

    /**
     * @return Challenge certificate for the user provided hub CA
     * 
     */
    public Optional<Output<String>> hubCaChallenge() {
        return Optional.ofNullable(this.hubCaChallenge);
    }

    /**
     * The name of the IoT Hub instance you want to create (e.g. `my-hub`).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the IoT Hub instance you want to create (e.g. `my-hub`).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Product plan to create the hub, see documentation for available product plans (e.g. `plan_shared`)
     * 
     */
    @Import(name="productPlan", required=true)
    private Output<String> productPlan;

    /**
     * @return Product plan to create the hub, see documentation for available product plans (e.g. `plan_shared`)
     * 
     */
    public Output<String> productPlan() {
        return this.productPlan;
    }

    /**
     * `project_id`) The ID of the project the IoT Hub Instance is associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the IoT Hub Instance is associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * `region`) The region in which the Database Instance should be created.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return `region`) The region in which the Database Instance should be created.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private IotHubArgs() {}

    private IotHubArgs(IotHubArgs $) {
        this.deviceAutoProvisioning = $.deviceAutoProvisioning;
        this.disableEvents = $.disableEvents;
        this.enabled = $.enabled;
        this.eventsTopicPrefix = $.eventsTopicPrefix;
        this.hubCa = $.hubCa;
        this.hubCaChallenge = $.hubCaChallenge;
        this.name = $.name;
        this.productPlan = $.productPlan;
        this.projectId = $.projectId;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IotHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IotHubArgs $;

        public Builder() {
            $ = new IotHubArgs();
        }

        public Builder(IotHubArgs defaults) {
            $ = new IotHubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deviceAutoProvisioning Wether to enable the device auto provisioning or not
         * 
         * @return builder
         * 
         */
        public Builder deviceAutoProvisioning(@Nullable Output<Boolean> deviceAutoProvisioning) {
            $.deviceAutoProvisioning = deviceAutoProvisioning;
            return this;
        }

        /**
         * @param deviceAutoProvisioning Wether to enable the device auto provisioning or not
         * 
         * @return builder
         * 
         */
        public Builder deviceAutoProvisioning(Boolean deviceAutoProvisioning) {
            return deviceAutoProvisioning(Output.of(deviceAutoProvisioning));
        }

        /**
         * @param disableEvents Whether to enable the hub events or not
         * 
         * @return builder
         * 
         */
        public Builder disableEvents(@Nullable Output<Boolean> disableEvents) {
            $.disableEvents = disableEvents;
            return this;
        }

        /**
         * @param disableEvents Whether to enable the hub events or not
         * 
         * @return builder
         * 
         */
        public Builder disableEvents(Boolean disableEvents) {
            return disableEvents(Output.of(disableEvents));
        }

        /**
         * @param enabled Wether the IoT Hub instance should be enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Wether the IoT Hub instance should be enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param eventsTopicPrefix Topic prefix for the hub events
         * 
         * @return builder
         * 
         */
        public Builder eventsTopicPrefix(@Nullable Output<String> eventsTopicPrefix) {
            $.eventsTopicPrefix = eventsTopicPrefix;
            return this;
        }

        /**
         * @param eventsTopicPrefix Topic prefix for the hub events
         * 
         * @return builder
         * 
         */
        public Builder eventsTopicPrefix(String eventsTopicPrefix) {
            return eventsTopicPrefix(Output.of(eventsTopicPrefix));
        }

        /**
         * @param hubCa Custom user provided certificate authority
         * 
         * @return builder
         * 
         */
        public Builder hubCa(@Nullable Output<String> hubCa) {
            $.hubCa = hubCa;
            return this;
        }

        /**
         * @param hubCa Custom user provided certificate authority
         * 
         * @return builder
         * 
         */
        public Builder hubCa(String hubCa) {
            return hubCa(Output.of(hubCa));
        }

        /**
         * @param hubCaChallenge Challenge certificate for the user provided hub CA
         * 
         * @return builder
         * 
         */
        public Builder hubCaChallenge(@Nullable Output<String> hubCaChallenge) {
            $.hubCaChallenge = hubCaChallenge;
            return this;
        }

        /**
         * @param hubCaChallenge Challenge certificate for the user provided hub CA
         * 
         * @return builder
         * 
         */
        public Builder hubCaChallenge(String hubCaChallenge) {
            return hubCaChallenge(Output.of(hubCaChallenge));
        }

        /**
         * @param name The name of the IoT Hub instance you want to create (e.g. `my-hub`).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the IoT Hub instance you want to create (e.g. `my-hub`).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param productPlan Product plan to create the hub, see documentation for available product plans (e.g. `plan_shared`)
         * 
         * @return builder
         * 
         */
        public Builder productPlan(Output<String> productPlan) {
            $.productPlan = productPlan;
            return this;
        }

        /**
         * @param productPlan Product plan to create the hub, see documentation for available product plans (e.g. `plan_shared`)
         * 
         * @return builder
         * 
         */
        public Builder productPlan(String productPlan) {
            return productPlan(Output.of(productPlan));
        }

        /**
         * @param projectId `project_id`) The ID of the project the IoT Hub Instance is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the IoT Hub Instance is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region `region`) The region in which the Database Instance should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region `region`) The region in which the Database Instance should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public IotHubArgs build() {
            $.productPlan = Objects.requireNonNull($.productPlan, "expected parameter 'productPlan' to be non-null");
            return $;
        }
    }

}
