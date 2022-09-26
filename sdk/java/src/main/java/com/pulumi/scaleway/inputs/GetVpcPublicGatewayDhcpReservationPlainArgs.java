// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcPublicGatewayDhcpReservationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcPublicGatewayDhcpReservationPlainArgs Empty = new GetVpcPublicGatewayDhcpReservationPlainArgs();

    /**
     * The ID of the owning GatewayNetwork.
     * 
     */
    @Import(name="gatewayNetworkId")
    private @Nullable String gatewayNetworkId;

    /**
     * @return The ID of the owning GatewayNetwork.
     * 
     */
    public Optional<String> gatewayNetworkId() {
        return Optional.ofNullable(this.gatewayNetworkId);
    }

    /**
     * The MAC address of the reservation to retrieve
     * 
     */
    @Import(name="macAddress")
    private @Nullable String macAddress;

    /**
     * @return The MAC address of the reservation to retrieve
     * 
     */
    public Optional<String> macAddress() {
        return Optional.ofNullable(this.macAddress);
    }

    /**
     * The ID of the Reservation to retrieve
     * 
     */
    @Import(name="reservationId")
    private @Nullable String reservationId;

    /**
     * @return The ID of the Reservation to retrieve
     * 
     */
    public Optional<String> reservationId() {
        return Optional.ofNullable(this.reservationId);
    }

    /**
     * Boolean to wait for mac_address to exist in dhcp
     * 
     */
    @Import(name="waitForDhcp")
    private @Nullable Boolean waitForDhcp;

    /**
     * @return Boolean to wait for mac_address to exist in dhcp
     * 
     */
    public Optional<Boolean> waitForDhcp() {
        return Optional.ofNullable(this.waitForDhcp);
    }

    /**
     * `zone`) The zone in which
     * the image exists.
     * 
     */
    @Import(name="zone")
    private @Nullable String zone;

    /**
     * @return `zone`) The zone in which
     * the image exists.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GetVpcPublicGatewayDhcpReservationPlainArgs() {}

    private GetVpcPublicGatewayDhcpReservationPlainArgs(GetVpcPublicGatewayDhcpReservationPlainArgs $) {
        this.gatewayNetworkId = $.gatewayNetworkId;
        this.macAddress = $.macAddress;
        this.reservationId = $.reservationId;
        this.waitForDhcp = $.waitForDhcp;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcPublicGatewayDhcpReservationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcPublicGatewayDhcpReservationPlainArgs $;

        public Builder() {
            $ = new GetVpcPublicGatewayDhcpReservationPlainArgs();
        }

        public Builder(GetVpcPublicGatewayDhcpReservationPlainArgs defaults) {
            $ = new GetVpcPublicGatewayDhcpReservationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayNetworkId The ID of the owning GatewayNetwork.
         * 
         * @return builder
         * 
         */
        public Builder gatewayNetworkId(@Nullable String gatewayNetworkId) {
            $.gatewayNetworkId = gatewayNetworkId;
            return this;
        }

        /**
         * @param macAddress The MAC address of the reservation to retrieve
         * 
         * @return builder
         * 
         */
        public Builder macAddress(@Nullable String macAddress) {
            $.macAddress = macAddress;
            return this;
        }

        /**
         * @param reservationId The ID of the Reservation to retrieve
         * 
         * @return builder
         * 
         */
        public Builder reservationId(@Nullable String reservationId) {
            $.reservationId = reservationId;
            return this;
        }

        /**
         * @param waitForDhcp Boolean to wait for mac_address to exist in dhcp
         * 
         * @return builder
         * 
         */
        public Builder waitForDhcp(@Nullable Boolean waitForDhcp) {
            $.waitForDhcp = waitForDhcp;
            return this;
        }

        /**
         * @param zone `zone`) The zone in which
         * the image exists.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable String zone) {
            $.zone = zone;
            return this;
        }

        public GetVpcPublicGatewayDhcpReservationPlainArgs build() {
            return $;
        }
    }

}
