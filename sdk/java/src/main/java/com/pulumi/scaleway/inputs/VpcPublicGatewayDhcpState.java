// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcPublicGatewayDhcpState extends com.pulumi.resources.ResourceArgs {

    public static final VpcPublicGatewayDhcpState Empty = new VpcPublicGatewayDhcpState();

    /**
     * The IP address of the public gateway DHCP config.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The IP address of the public gateway DHCP config.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The date and time of the creation of the public gateway DHCP config.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The date and time of the creation of the public gateway DHCP config.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * TLD given to hostnames in the Private Network. Allowed characters are `a-z0-9-.`. Defaults to the slugified Private Network name if created along a GatewayNetwork, or else to `priv`.
     * 
     */
    @Import(name="dnsLocalName")
    private @Nullable Output<String> dnsLocalName;

    /**
     * @return TLD given to hostnames in the Private Network. Allowed characters are `a-z0-9-.`. Defaults to the slugified Private Network name if created along a GatewayNetwork, or else to `priv`.
     * 
     */
    public Optional<Output<String>> dnsLocalName() {
        return Optional.ofNullable(this.dnsLocalName);
    }

    /**
     * Additional DNS search paths
     * 
     */
    @Import(name="dnsSearches")
    private @Nullable Output<List<String>> dnsSearches;

    /**
     * @return Additional DNS search paths
     * 
     */
    public Optional<Output<List<String>>> dnsSearches() {
        return Optional.ofNullable(this.dnsSearches);
    }

    /**
     * Override the DNS server list pushed to DHCP clients, instead of the gateway itself
     * 
     */
    @Import(name="dnsServersOverrides")
    private @Nullable Output<List<String>> dnsServersOverrides;

    /**
     * @return Override the DNS server list pushed to DHCP clients, instead of the gateway itself
     * 
     */
    public Optional<Output<List<String>>> dnsServersOverrides() {
        return Optional.ofNullable(this.dnsServersOverrides);
    }

    /**
     * Whether to enable dynamic pooling of IPs. By turning the dynamic pool off, only pre-existing DHCP reservations will be handed out. Defaults to `true`.
     * 
     */
    @Import(name="enableDynamic")
    private @Nullable Output<Boolean> enableDynamic;

    /**
     * @return Whether to enable dynamic pooling of IPs. By turning the dynamic pool off, only pre-existing DHCP reservations will be handed out. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enableDynamic() {
        return Optional.ofNullable(this.enableDynamic);
    }

    /**
     * The organization ID the public gateway DHCP config is associated with.
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return The organization ID the public gateway DHCP config is associated with.
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * High IP (excluded) of the dynamic address pool. Defaults to the last address of the subnet.
     * 
     */
    @Import(name="poolHigh")
    private @Nullable Output<String> poolHigh;

    /**
     * @return High IP (excluded) of the dynamic address pool. Defaults to the last address of the subnet.
     * 
     */
    public Optional<Output<String>> poolHigh() {
        return Optional.ofNullable(this.poolHigh);
    }

    /**
     * Low IP (included) of the dynamic address pool. Defaults to the second address of the subnet.
     * 
     */
    @Import(name="poolLow")
    private @Nullable Output<String> poolLow;

    /**
     * @return Low IP (included) of the dynamic address pool. Defaults to the second address of the subnet.
     * 
     */
    public Optional<Output<String>> poolLow() {
        return Optional.ofNullable(this.poolLow);
    }

    /**
     * `project_id`) The ID of the project the public gateway DHCP config is associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the public gateway DHCP config is associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Whether the gateway should push a default route to DHCP clients or only hand out IPs. Defaults to `true`.
     * 
     */
    @Import(name="pushDefaultRoute")
    private @Nullable Output<Boolean> pushDefaultRoute;

    /**
     * @return Whether the gateway should push a default route to DHCP clients or only hand out IPs. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> pushDefaultRoute() {
        return Optional.ofNullable(this.pushDefaultRoute);
    }

    /**
     * Whether the gateway should push custom DNS servers to clients. This allows for instance hostname &gt; IP resolution. Defaults to `true`.
     * 
     */
    @Import(name="pushDnsServer")
    private @Nullable Output<Boolean> pushDnsServer;

    /**
     * @return Whether the gateway should push custom DNS servers to clients. This allows for instance hostname &gt; IP resolution. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> pushDnsServer() {
        return Optional.ofNullable(this.pushDnsServer);
    }

    /**
     * After how long, in seconds, a DHCP client will query for a new lease if previous renews fail. Must be 30s lower than `valid_lifetime`. Defaults to 51m (3060s).
     * 
     */
    @Import(name="rebindTimer")
    private @Nullable Output<Integer> rebindTimer;

    /**
     * @return After how long, in seconds, a DHCP client will query for a new lease if previous renews fail. Must be 30s lower than `valid_lifetime`. Defaults to 51m (3060s).
     * 
     */
    public Optional<Output<Integer>> rebindTimer() {
        return Optional.ofNullable(this.rebindTimer);
    }

    /**
     * After how long, in seconds, a renewal will be attempted. Must be 30s lower than `rebind_timer`. Defaults to 50m (3000s).
     * 
     */
    @Import(name="renewTimer")
    private @Nullable Output<Integer> renewTimer;

    /**
     * @return After how long, in seconds, a renewal will be attempted. Must be 30s lower than `rebind_timer`. Defaults to 50m (3000s).
     * 
     */
    public Optional<Output<Integer>> renewTimer() {
        return Optional.ofNullable(this.renewTimer);
    }

    /**
     * The subnet to associate with the public gateway DHCP config.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<String> subnet;

    /**
     * @return The subnet to associate with the public gateway DHCP config.
     * 
     */
    public Optional<Output<String>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    /**
     * The date and time of the last update of the public gateway DHCP config.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return The date and time of the last update of the public gateway DHCP config.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    /**
     * For how long, in seconds, will DHCP entries will be valid. Defaults to 1h (3600s).
     * 
     */
    @Import(name="validLifetime")
    private @Nullable Output<Integer> validLifetime;

    /**
     * @return For how long, in seconds, will DHCP entries will be valid. Defaults to 1h (3600s).
     * 
     */
    public Optional<Output<Integer>> validLifetime() {
        return Optional.ofNullable(this.validLifetime);
    }

    /**
     * `zone`) The zone in which the public gateway DHCP config should be created.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return `zone`) The zone in which the public gateway DHCP config should be created.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private VpcPublicGatewayDhcpState() {}

    private VpcPublicGatewayDhcpState(VpcPublicGatewayDhcpState $) {
        this.address = $.address;
        this.createdAt = $.createdAt;
        this.dnsLocalName = $.dnsLocalName;
        this.dnsSearches = $.dnsSearches;
        this.dnsServersOverrides = $.dnsServersOverrides;
        this.enableDynamic = $.enableDynamic;
        this.organizationId = $.organizationId;
        this.poolHigh = $.poolHigh;
        this.poolLow = $.poolLow;
        this.projectId = $.projectId;
        this.pushDefaultRoute = $.pushDefaultRoute;
        this.pushDnsServer = $.pushDnsServer;
        this.rebindTimer = $.rebindTimer;
        this.renewTimer = $.renewTimer;
        this.subnet = $.subnet;
        this.updatedAt = $.updatedAt;
        this.validLifetime = $.validLifetime;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcPublicGatewayDhcpState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcPublicGatewayDhcpState $;

        public Builder() {
            $ = new VpcPublicGatewayDhcpState();
        }

        public Builder(VpcPublicGatewayDhcpState defaults) {
            $ = new VpcPublicGatewayDhcpState(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The IP address of the public gateway DHCP config.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The IP address of the public gateway DHCP config.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param createdAt The date and time of the creation of the public gateway DHCP config.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The date and time of the creation of the public gateway DHCP config.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param dnsLocalName TLD given to hostnames in the Private Network. Allowed characters are `a-z0-9-.`. Defaults to the slugified Private Network name if created along a GatewayNetwork, or else to `priv`.
         * 
         * @return builder
         * 
         */
        public Builder dnsLocalName(@Nullable Output<String> dnsLocalName) {
            $.dnsLocalName = dnsLocalName;
            return this;
        }

        /**
         * @param dnsLocalName TLD given to hostnames in the Private Network. Allowed characters are `a-z0-9-.`. Defaults to the slugified Private Network name if created along a GatewayNetwork, or else to `priv`.
         * 
         * @return builder
         * 
         */
        public Builder dnsLocalName(String dnsLocalName) {
            return dnsLocalName(Output.of(dnsLocalName));
        }

        /**
         * @param dnsSearches Additional DNS search paths
         * 
         * @return builder
         * 
         */
        public Builder dnsSearches(@Nullable Output<List<String>> dnsSearches) {
            $.dnsSearches = dnsSearches;
            return this;
        }

        /**
         * @param dnsSearches Additional DNS search paths
         * 
         * @return builder
         * 
         */
        public Builder dnsSearches(List<String> dnsSearches) {
            return dnsSearches(Output.of(dnsSearches));
        }

        /**
         * @param dnsSearches Additional DNS search paths
         * 
         * @return builder
         * 
         */
        public Builder dnsSearches(String... dnsSearches) {
            return dnsSearches(List.of(dnsSearches));
        }

        /**
         * @param dnsServersOverrides Override the DNS server list pushed to DHCP clients, instead of the gateway itself
         * 
         * @return builder
         * 
         */
        public Builder dnsServersOverrides(@Nullable Output<List<String>> dnsServersOverrides) {
            $.dnsServersOverrides = dnsServersOverrides;
            return this;
        }

        /**
         * @param dnsServersOverrides Override the DNS server list pushed to DHCP clients, instead of the gateway itself
         * 
         * @return builder
         * 
         */
        public Builder dnsServersOverrides(List<String> dnsServersOverrides) {
            return dnsServersOverrides(Output.of(dnsServersOverrides));
        }

        /**
         * @param dnsServersOverrides Override the DNS server list pushed to DHCP clients, instead of the gateway itself
         * 
         * @return builder
         * 
         */
        public Builder dnsServersOverrides(String... dnsServersOverrides) {
            return dnsServersOverrides(List.of(dnsServersOverrides));
        }

        /**
         * @param enableDynamic Whether to enable dynamic pooling of IPs. By turning the dynamic pool off, only pre-existing DHCP reservations will be handed out. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enableDynamic(@Nullable Output<Boolean> enableDynamic) {
            $.enableDynamic = enableDynamic;
            return this;
        }

        /**
         * @param enableDynamic Whether to enable dynamic pooling of IPs. By turning the dynamic pool off, only pre-existing DHCP reservations will be handed out. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enableDynamic(Boolean enableDynamic) {
            return enableDynamic(Output.of(enableDynamic));
        }

        /**
         * @param organizationId The organization ID the public gateway DHCP config is associated with.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The organization ID the public gateway DHCP config is associated with.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param poolHigh High IP (excluded) of the dynamic address pool. Defaults to the last address of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder poolHigh(@Nullable Output<String> poolHigh) {
            $.poolHigh = poolHigh;
            return this;
        }

        /**
         * @param poolHigh High IP (excluded) of the dynamic address pool. Defaults to the last address of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder poolHigh(String poolHigh) {
            return poolHigh(Output.of(poolHigh));
        }

        /**
         * @param poolLow Low IP (included) of the dynamic address pool. Defaults to the second address of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder poolLow(@Nullable Output<String> poolLow) {
            $.poolLow = poolLow;
            return this;
        }

        /**
         * @param poolLow Low IP (included) of the dynamic address pool. Defaults to the second address of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder poolLow(String poolLow) {
            return poolLow(Output.of(poolLow));
        }

        /**
         * @param projectId `project_id`) The ID of the project the public gateway DHCP config is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the public gateway DHCP config is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param pushDefaultRoute Whether the gateway should push a default route to DHCP clients or only hand out IPs. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder pushDefaultRoute(@Nullable Output<Boolean> pushDefaultRoute) {
            $.pushDefaultRoute = pushDefaultRoute;
            return this;
        }

        /**
         * @param pushDefaultRoute Whether the gateway should push a default route to DHCP clients or only hand out IPs. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder pushDefaultRoute(Boolean pushDefaultRoute) {
            return pushDefaultRoute(Output.of(pushDefaultRoute));
        }

        /**
         * @param pushDnsServer Whether the gateway should push custom DNS servers to clients. This allows for instance hostname &gt; IP resolution. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder pushDnsServer(@Nullable Output<Boolean> pushDnsServer) {
            $.pushDnsServer = pushDnsServer;
            return this;
        }

        /**
         * @param pushDnsServer Whether the gateway should push custom DNS servers to clients. This allows for instance hostname &gt; IP resolution. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder pushDnsServer(Boolean pushDnsServer) {
            return pushDnsServer(Output.of(pushDnsServer));
        }

        /**
         * @param rebindTimer After how long, in seconds, a DHCP client will query for a new lease if previous renews fail. Must be 30s lower than `valid_lifetime`. Defaults to 51m (3060s).
         * 
         * @return builder
         * 
         */
        public Builder rebindTimer(@Nullable Output<Integer> rebindTimer) {
            $.rebindTimer = rebindTimer;
            return this;
        }

        /**
         * @param rebindTimer After how long, in seconds, a DHCP client will query for a new lease if previous renews fail. Must be 30s lower than `valid_lifetime`. Defaults to 51m (3060s).
         * 
         * @return builder
         * 
         */
        public Builder rebindTimer(Integer rebindTimer) {
            return rebindTimer(Output.of(rebindTimer));
        }

        /**
         * @param renewTimer After how long, in seconds, a renewal will be attempted. Must be 30s lower than `rebind_timer`. Defaults to 50m (3000s).
         * 
         * @return builder
         * 
         */
        public Builder renewTimer(@Nullable Output<Integer> renewTimer) {
            $.renewTimer = renewTimer;
            return this;
        }

        /**
         * @param renewTimer After how long, in seconds, a renewal will be attempted. Must be 30s lower than `rebind_timer`. Defaults to 50m (3000s).
         * 
         * @return builder
         * 
         */
        public Builder renewTimer(Integer renewTimer) {
            return renewTimer(Output.of(renewTimer));
        }

        /**
         * @param subnet The subnet to associate with the public gateway DHCP config.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet The subnet to associate with the public gateway DHCP config.
         * 
         * @return builder
         * 
         */
        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        /**
         * @param updatedAt The date and time of the last update of the public gateway DHCP config.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt The date and time of the last update of the public gateway DHCP config.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        /**
         * @param validLifetime For how long, in seconds, will DHCP entries will be valid. Defaults to 1h (3600s).
         * 
         * @return builder
         * 
         */
        public Builder validLifetime(@Nullable Output<Integer> validLifetime) {
            $.validLifetime = validLifetime;
            return this;
        }

        /**
         * @param validLifetime For how long, in seconds, will DHCP entries will be valid. Defaults to 1h (3600s).
         * 
         * @return builder
         * 
         */
        public Builder validLifetime(Integer validLifetime) {
            return validLifetime(Output.of(validLifetime));
        }

        /**
         * @param zone `zone`) The zone in which the public gateway DHCP config should be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone `zone`) The zone in which the public gateway DHCP config should be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public VpcPublicGatewayDhcpState build() {
            return $;
        }
    }

}
