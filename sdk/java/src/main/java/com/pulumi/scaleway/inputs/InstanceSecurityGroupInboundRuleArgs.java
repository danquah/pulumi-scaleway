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


public final class InstanceSecurityGroupInboundRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceSecurityGroupInboundRuleArgs Empty = new InstanceSecurityGroupInboundRuleArgs();

    /**
     * The action to take when rule match. Possible values are: `accept` or `drop`.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The action to take when rule match. Possible values are: `accept` or `drop`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * The ip this rule apply to. If no `ip` nor `ip_range` are specified, rule will apply to all ip. Only one of `ip` and `ip_range` should be specified.
     * 
     * @deprecated
     * Ip address is deprecated. Please use ip_range instead
     * 
     */
    @Deprecated /* Ip address is deprecated. Please use ip_range instead */
    @Import(name="ip")
    private @Nullable Output<String> ip;

    /**
     * @return The ip this rule apply to. If no `ip` nor `ip_range` are specified, rule will apply to all ip. Only one of `ip` and `ip_range` should be specified.
     * 
     * @deprecated
     * Ip address is deprecated. Please use ip_range instead
     * 
     */
    @Deprecated /* Ip address is deprecated. Please use ip_range instead */
    public Optional<Output<String>> ip() {
        return Optional.ofNullable(this.ip);
    }

    /**
     * The ip range (e.g `192.168.1.0/24`) this rule applies to. If no `ip` nor `ip_range` are specified, rule will apply to all ip. Only one of `ip` and `ip_range` should be specified.
     * 
     */
    @Import(name="ipRange")
    private @Nullable Output<String> ipRange;

    /**
     * @return The ip range (e.g `192.168.1.0/24`) this rule applies to. If no `ip` nor `ip_range` are specified, rule will apply to all ip. Only one of `ip` and `ip_range` should be specified.
     * 
     */
    public Optional<Output<String>> ipRange() {
        return Optional.ofNullable(this.ipRange);
    }

    /**
     * The port this rule applies to. If no `port` nor `port_range` are specified, the rule will apply to all port. Only one of `port` and `port_range` should be specified.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port this rule applies to. If no `port` nor `port_range` are specified, the rule will apply to all port. Only one of `port` and `port_range` should be specified.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="portRange")
    private @Nullable Output<String> portRange;

    public Optional<Output<String>> portRange() {
        return Optional.ofNullable(this.portRange);
    }

    /**
     * The protocol this rule apply to. Possible values are: `TCP`, `UDP`, `ICMP` or `ANY`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The protocol this rule apply to. Possible values are: `TCP`, `UDP`, `ICMP` or `ANY`.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private InstanceSecurityGroupInboundRuleArgs() {}

    private InstanceSecurityGroupInboundRuleArgs(InstanceSecurityGroupInboundRuleArgs $) {
        this.action = $.action;
        this.ip = $.ip;
        this.ipRange = $.ipRange;
        this.port = $.port;
        this.portRange = $.portRange;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceSecurityGroupInboundRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceSecurityGroupInboundRuleArgs $;

        public Builder() {
            $ = new InstanceSecurityGroupInboundRuleArgs();
        }

        public Builder(InstanceSecurityGroupInboundRuleArgs defaults) {
            $ = new InstanceSecurityGroupInboundRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action to take when rule match. Possible values are: `accept` or `drop`.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action to take when rule match. Possible values are: `accept` or `drop`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param ip The ip this rule apply to. If no `ip` nor `ip_range` are specified, rule will apply to all ip. Only one of `ip` and `ip_range` should be specified.
         * 
         * @return builder
         * 
         * @deprecated
         * Ip address is deprecated. Please use ip_range instead
         * 
         */
        @Deprecated /* Ip address is deprecated. Please use ip_range instead */
        public Builder ip(@Nullable Output<String> ip) {
            $.ip = ip;
            return this;
        }

        /**
         * @param ip The ip this rule apply to. If no `ip` nor `ip_range` are specified, rule will apply to all ip. Only one of `ip` and `ip_range` should be specified.
         * 
         * @return builder
         * 
         * @deprecated
         * Ip address is deprecated. Please use ip_range instead
         * 
         */
        @Deprecated /* Ip address is deprecated. Please use ip_range instead */
        public Builder ip(String ip) {
            return ip(Output.of(ip));
        }

        /**
         * @param ipRange The ip range (e.g `192.168.1.0/24`) this rule applies to. If no `ip` nor `ip_range` are specified, rule will apply to all ip. Only one of `ip` and `ip_range` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder ipRange(@Nullable Output<String> ipRange) {
            $.ipRange = ipRange;
            return this;
        }

        /**
         * @param ipRange The ip range (e.g `192.168.1.0/24`) this rule applies to. If no `ip` nor `ip_range` are specified, rule will apply to all ip. Only one of `ip` and `ip_range` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder ipRange(String ipRange) {
            return ipRange(Output.of(ipRange));
        }

        /**
         * @param port The port this rule applies to. If no `port` nor `port_range` are specified, the rule will apply to all port. Only one of `port` and `port_range` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port this rule applies to. If no `port` nor `port_range` are specified, the rule will apply to all port. Only one of `port` and `port_range` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder portRange(@Nullable Output<String> portRange) {
            $.portRange = portRange;
            return this;
        }

        public Builder portRange(String portRange) {
            return portRange(Output.of(portRange));
        }

        /**
         * @param protocol The protocol this rule apply to. Possible values are: `TCP`, `UDP`, `ICMP` or `ANY`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol this rule apply to. Possible values are: `TCP`, `UDP`, `ICMP` or `ANY`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public InstanceSecurityGroupInboundRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            return $;
        }
    }

}
