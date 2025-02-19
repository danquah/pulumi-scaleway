// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcPublicGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcPublicGatewayArgs Empty = new GetVpcPublicGatewayArgs();

    /**
     * Exact name of the public gateway.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Exact name of the public gateway.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="publicGatewayId")
    private @Nullable Output<String> publicGatewayId;

    public Optional<Output<String>> publicGatewayId() {
        return Optional.ofNullable(this.publicGatewayId);
    }

    private GetVpcPublicGatewayArgs() {}

    private GetVpcPublicGatewayArgs(GetVpcPublicGatewayArgs $) {
        this.name = $.name;
        this.publicGatewayId = $.publicGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcPublicGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcPublicGatewayArgs $;

        public Builder() {
            $ = new GetVpcPublicGatewayArgs();
        }

        public Builder(GetVpcPublicGatewayArgs defaults) {
            $ = new GetVpcPublicGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Exact name of the public gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Exact name of the public gateway.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder publicGatewayId(@Nullable Output<String> publicGatewayId) {
            $.publicGatewayId = publicGatewayId;
            return this;
        }

        public Builder publicGatewayId(String publicGatewayId) {
            return publicGatewayId(Output.of(publicGatewayId));
        }

        public GetVpcPublicGatewayArgs build() {
            return $;
        }
    }

}
