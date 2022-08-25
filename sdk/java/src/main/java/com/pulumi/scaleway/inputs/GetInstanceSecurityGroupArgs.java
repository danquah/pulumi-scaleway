// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceSecurityGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceSecurityGroupArgs Empty = new GetInstanceSecurityGroupArgs();

    /**
     * The security group name. Only one of `name` and `security_group_id` should be specified.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The security group name. Only one of `name` and `security_group_id` should be specified.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The security group id. Only one of `name` and `security_group_id` should be specified.
     * 
     */
    @Import(name="securityGroupId")
    private @Nullable Output<String> securityGroupId;

    /**
     * @return The security group id. Only one of `name` and `security_group_id` should be specified.
     * 
     */
    public Optional<Output<String>> securityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }

    /**
     * `zone`) The zone in which the security group exists.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return `zone`) The zone in which the security group exists.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GetInstanceSecurityGroupArgs() {}

    private GetInstanceSecurityGroupArgs(GetInstanceSecurityGroupArgs $) {
        this.name = $.name;
        this.securityGroupId = $.securityGroupId;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceSecurityGroupArgs $;

        public Builder() {
            $ = new GetInstanceSecurityGroupArgs();
        }

        public Builder(GetInstanceSecurityGroupArgs defaults) {
            $ = new GetInstanceSecurityGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The security group name. Only one of `name` and `security_group_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The security group name. Only one of `name` and `security_group_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param securityGroupId The security group id. Only one of `name` and `security_group_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(@Nullable Output<String> securityGroupId) {
            $.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * @param securityGroupId The security group id. Only one of `name` and `security_group_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(String securityGroupId) {
            return securityGroupId(Output.of(securityGroupId));
        }

        /**
         * @param zone `zone`) The zone in which the security group exists.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone `zone`) The zone in which the security group exists.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public GetInstanceSecurityGroupArgs build() {
            return $;
        }
    }

}
