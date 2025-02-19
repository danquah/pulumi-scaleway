// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseInstancePrivateNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseInstancePrivateNetworkArgs Empty = new DatabaseInstancePrivateNetworkArgs();

    /**
     * The ID of the endpoint of the private network.
     * 
     */
    @Import(name="endpointId")
    private @Nullable Output<String> endpointId;

    /**
     * @return The ID of the endpoint of the private network.
     * 
     */
    public Optional<Output<String>> endpointId() {
        return Optional.ofNullable(this.endpointId);
    }

    /**
     * Name of the endpoint.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return Name of the endpoint.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * IP of the endpoint.
     * 
     */
    @Import(name="ip")
    private @Nullable Output<String> ip;

    /**
     * @return IP of the endpoint.
     * 
     */
    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    @Import(name="ipNet", required=true)
    private Output<String> ipNet;

    public Output<String> ipNet() {
        return this.ipNet;
    }

    /**
     * The name of the Database Instance.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Database Instance.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="pnId", required=true)
    private Output<String> pnId;

    public Output<String> pnId() {
        return this.pnId;
    }

    /**
     * Port of the endpoint.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Port of the endpoint.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private DatabaseInstancePrivateNetworkArgs() {}

    private DatabaseInstancePrivateNetworkArgs(DatabaseInstancePrivateNetworkArgs $) {
        this.endpointId = $.endpointId;
        this.hostname = $.hostname;
        this.ip = $.ip;
        this.ipNet = $.ipNet;
        this.name = $.name;
        this.pnId = $.pnId;
        this.port = $.port;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseInstancePrivateNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseInstancePrivateNetworkArgs $;

        public Builder() {
            $ = new DatabaseInstancePrivateNetworkArgs();
        }

        public Builder(DatabaseInstancePrivateNetworkArgs defaults) {
            $ = new DatabaseInstancePrivateNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointId The ID of the endpoint of the private network.
         * 
         * @return builder
         * 
         */
        public Builder endpointId(@Nullable Output<String> endpointId) {
            $.endpointId = endpointId;
            return this;
        }

        /**
         * @param endpointId The ID of the endpoint of the private network.
         * 
         * @return builder
         * 
         */
        public Builder endpointId(String endpointId) {
            return endpointId(Output.of(endpointId));
        }

        /**
         * @param hostname Name of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Name of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param ip IP of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip IP of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        public Builder ipNet(Output<String> ipNet) {
            $.ipNet = ipNet;
            return this;
        }

        public Builder ipNet(String ipNet) {
            return ipNet(Output.of(ipNet));
        }

        /**
         * @param name The name of the Database Instance.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Database Instance.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder pnId(Output<String> pnId) {
            $.pnId = pnId;
            return this;
        }

        public Builder pnId(String pnId) {
            return pnId(Output.of(pnId));
        }

        /**
         * @param port Port of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public DatabaseInstancePrivateNetworkArgs build() {
            $.ipNet = Objects.requireNonNull($.ipNet, "expected parameter 'ipNet' to be non-null");
            $.pnId = Objects.requireNonNull($.pnId, "expected parameter 'pnId' to be non-null");
            return $;
        }
    }

}
