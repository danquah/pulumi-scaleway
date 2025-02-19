// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RedisClusterPrivateNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final RedisClusterPrivateNetworkArgs Empty = new RedisClusterPrivateNetworkArgs();

    @Import(name="endpointId")
    private @Nullable Output<String> endpointId;

    public Optional<Output<String>> endpointId() {
        return Optional.ofNullable(this.endpointId);
    }

    /**
     * The UUID of the private network resource.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The UUID of the private network resource.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Endpoint IPv4 addresses in [CIDR notation](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation). You must provide at least one IP per node.
     * 
     */
    @Import(name="serviceIps", required=true)
    private Output<List<String>> serviceIps;

    /**
     * @return Endpoint IPv4 addresses in [CIDR notation](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation). You must provide at least one IP per node.
     * 
     */
    public Output<List<String>> serviceIps() {
        return this.serviceIps;
    }

    /**
     * `zone`) The zone in which the Redis Cluster should be created.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return `zone`) The zone in which the Redis Cluster should be created.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private RedisClusterPrivateNetworkArgs() {}

    private RedisClusterPrivateNetworkArgs(RedisClusterPrivateNetworkArgs $) {
        this.endpointId = $.endpointId;
        this.id = $.id;
        this.serviceIps = $.serviceIps;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedisClusterPrivateNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedisClusterPrivateNetworkArgs $;

        public Builder() {
            $ = new RedisClusterPrivateNetworkArgs();
        }

        public Builder(RedisClusterPrivateNetworkArgs defaults) {
            $ = new RedisClusterPrivateNetworkArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointId(@Nullable Output<String> endpointId) {
            $.endpointId = endpointId;
            return this;
        }

        public Builder endpointId(String endpointId) {
            return endpointId(Output.of(endpointId));
        }

        /**
         * @param id The UUID of the private network resource.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The UUID of the private network resource.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param serviceIps Endpoint IPv4 addresses in [CIDR notation](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation). You must provide at least one IP per node.
         * 
         * @return builder
         * 
         */
        public Builder serviceIps(Output<List<String>> serviceIps) {
            $.serviceIps = serviceIps;
            return this;
        }

        /**
         * @param serviceIps Endpoint IPv4 addresses in [CIDR notation](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation). You must provide at least one IP per node.
         * 
         * @return builder
         * 
         */
        public Builder serviceIps(List<String> serviceIps) {
            return serviceIps(Output.of(serviceIps));
        }

        /**
         * @param serviceIps Endpoint IPv4 addresses in [CIDR notation](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation). You must provide at least one IP per node.
         * 
         * @return builder
         * 
         */
        public Builder serviceIps(String... serviceIps) {
            return serviceIps(List.of(serviceIps));
        }

        /**
         * @param zone `zone`) The zone in which the Redis Cluster should be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone `zone`) The zone in which the Redis Cluster should be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public RedisClusterPrivateNetworkArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.serviceIps = Objects.requireNonNull($.serviceIps, "expected parameter 'serviceIps' to be non-null");
            return $;
        }
    }

}
