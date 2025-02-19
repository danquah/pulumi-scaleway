// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceIpArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceIpArgs Empty = new GetInstanceIpArgs();

    /**
     * The IPv4 address to retrieve
     * Only one of `address` and `id` should be specified.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The IPv4 address to retrieve
     * Only one of `address` and `id` should be specified.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The ID of the IP address to retrieve
     * Only one of `address` and `id` should be specified.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the IP address to retrieve
     * Only one of `address` and `id` should be specified.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private GetInstanceIpArgs() {}

    private GetInstanceIpArgs(GetInstanceIpArgs $) {
        this.address = $.address;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceIpArgs $;

        public Builder() {
            $ = new GetInstanceIpArgs();
        }

        public Builder(GetInstanceIpArgs defaults) {
            $ = new GetInstanceIpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The IPv4 address to retrieve
         * Only one of `address` and `id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The IPv4 address to retrieve
         * Only one of `address` and `id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param id The ID of the IP address to retrieve
         * Only one of `address` and `id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the IP address to retrieve
         * Only one of `address` and `id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetInstanceIpArgs build() {
            return $;
        }
    }

}
