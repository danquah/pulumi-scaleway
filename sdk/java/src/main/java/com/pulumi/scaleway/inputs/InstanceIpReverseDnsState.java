// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceIpReverseDnsState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceIpReverseDnsState Empty = new InstanceIpReverseDnsState();

    /**
     * The IP ID
     * 
     */
    @Import(name="ipId")
    private @Nullable Output<String> ipId;

    /**
     * @return The IP ID
     * 
     */
    public Optional<Output<String>> ipId() {
        return Optional.ofNullable(this.ipId);
    }

    /**
     * The reverse DNS for this IP.
     * 
     */
    @Import(name="reverse")
    private @Nullable Output<String> reverse;

    /**
     * @return The reverse DNS for this IP.
     * 
     */
    public Optional<Output<String>> reverse() {
        return Optional.ofNullable(this.reverse);
    }

    /**
     * `zone`) The zone in which the IP should be reserved.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return `zone`) The zone in which the IP should be reserved.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstanceIpReverseDnsState() {}

    private InstanceIpReverseDnsState(InstanceIpReverseDnsState $) {
        this.ipId = $.ipId;
        this.reverse = $.reverse;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceIpReverseDnsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceIpReverseDnsState $;

        public Builder() {
            $ = new InstanceIpReverseDnsState();
        }

        public Builder(InstanceIpReverseDnsState defaults) {
            $ = new InstanceIpReverseDnsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipId The IP ID
         * 
         * @return builder
         * 
         */
        public Builder ipId(@Nullable Output<String> ipId) {
            $.ipId = ipId;
            return this;
        }

        /**
         * @param ipId The IP ID
         * 
         * @return builder
         * 
         */
        public Builder ipId(String ipId) {
            return ipId(Output.of(ipId));
        }

        /**
         * @param reverse The reverse DNS for this IP.
         * 
         * @return builder
         * 
         */
        public Builder reverse(@Nullable Output<String> reverse) {
            $.reverse = reverse;
            return this;
        }

        /**
         * @param reverse The reverse DNS for this IP.
         * 
         * @return builder
         * 
         */
        public Builder reverse(String reverse) {
            return reverse(Output.of(reverse));
        }

        /**
         * @param zone `zone`) The zone in which the IP should be reserved.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone `zone`) The zone in which the IP should be reserved.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstanceIpReverseDnsState build() {
            return $;
        }
    }

}
