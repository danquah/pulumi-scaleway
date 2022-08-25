// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesNodePoolNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesNodePoolNodeArgs Empty = new KubernetesNodePoolNodeArgs();

    /**
     * The name for the pool.
     * &gt; **Important:** Updates to this field will recreate a new resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the pool.
     * &gt; **Important:** Updates to this field will recreate a new resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The public IPv4.
     * 
     */
    @Import(name="publicIp")
    private @Nullable Output<String> publicIp;

    /**
     * @return The public IPv4.
     * 
     */
    public Optional<Output<String>> publicIp() {
        return Optional.ofNullable(this.publicIp);
    }

    /**
     * The public IPv6.
     * 
     */
    @Import(name="publicIpV6")
    private @Nullable Output<String> publicIpV6;

    /**
     * @return The public IPv6.
     * 
     */
    public Optional<Output<String>> publicIpV6() {
        return Optional.ofNullable(this.publicIpV6);
    }

    /**
     * The status of the node.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the node.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private KubernetesNodePoolNodeArgs() {}

    private KubernetesNodePoolNodeArgs(KubernetesNodePoolNodeArgs $) {
        this.name = $.name;
        this.publicIp = $.publicIp;
        this.publicIpV6 = $.publicIpV6;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesNodePoolNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesNodePoolNodeArgs $;

        public Builder() {
            $ = new KubernetesNodePoolNodeArgs();
        }

        public Builder(KubernetesNodePoolNodeArgs defaults) {
            $ = new KubernetesNodePoolNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name for the pool.
         * &gt; **Important:** Updates to this field will recreate a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the pool.
         * &gt; **Important:** Updates to this field will recreate a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicIp The public IPv4.
         * 
         * @return builder
         * 
         */
        public Builder publicIp(@Nullable Output<String> publicIp) {
            $.publicIp = publicIp;
            return this;
        }

        /**
         * @param publicIp The public IPv4.
         * 
         * @return builder
         * 
         */
        public Builder publicIp(String publicIp) {
            return publicIp(Output.of(publicIp));
        }

        /**
         * @param publicIpV6 The public IPv6.
         * 
         * @return builder
         * 
         */
        public Builder publicIpV6(@Nullable Output<String> publicIpV6) {
            $.publicIpV6 = publicIpV6;
            return this;
        }

        /**
         * @param publicIpV6 The public IPv6.
         * 
         * @return builder
         * 
         */
        public Builder publicIpV6(String publicIpV6) {
            return publicIpV6(Output.of(publicIpV6));
        }

        /**
         * @param status The status of the node.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the node.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public KubernetesNodePoolNodeArgs build() {
            return $;
        }
    }

}
