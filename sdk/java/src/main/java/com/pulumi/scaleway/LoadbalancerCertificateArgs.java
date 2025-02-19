// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.LoadbalancerCertificateCustomCertificateArgs;
import com.pulumi.scaleway.inputs.LoadbalancerCertificateLetsencryptArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadbalancerCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadbalancerCertificateArgs Empty = new LoadbalancerCertificateArgs();

    /**
     * Configuration block for custom certificate chain. Only one of `letsencrypt` and `custom_certificate` should be specified.
     * 
     */
    @Import(name="customCertificate")
    private @Nullable Output<LoadbalancerCertificateCustomCertificateArgs> customCertificate;

    /**
     * @return Configuration block for custom certificate chain. Only one of `letsencrypt` and `custom_certificate` should be specified.
     * 
     */
    public Optional<Output<LoadbalancerCertificateCustomCertificateArgs>> customCertificate() {
        return Optional.ofNullable(this.customCertificate);
    }

    /**
     * The load-balancer ID this certificate is attached to.
     * 
     */
    @Import(name="lbId", required=true)
    private Output<String> lbId;

    /**
     * @return The load-balancer ID this certificate is attached to.
     * 
     */
    public Output<String> lbId() {
        return this.lbId;
    }

    /**
     * Configuration block for Let&#39;s Encrypt configuration. Only one of `letsencrypt` and `custom_certificate` should be specified.
     * 
     */
    @Import(name="letsencrypt")
    private @Nullable Output<LoadbalancerCertificateLetsencryptArgs> letsencrypt;

    /**
     * @return Configuration block for Let&#39;s Encrypt configuration. Only one of `letsencrypt` and `custom_certificate` should be specified.
     * 
     */
    public Optional<Output<LoadbalancerCertificateLetsencryptArgs>> letsencrypt() {
        return Optional.ofNullable(this.letsencrypt);
    }

    /**
     * The name of the certificate backend.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the certificate backend.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private LoadbalancerCertificateArgs() {}

    private LoadbalancerCertificateArgs(LoadbalancerCertificateArgs $) {
        this.customCertificate = $.customCertificate;
        this.lbId = $.lbId;
        this.letsencrypt = $.letsencrypt;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadbalancerCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadbalancerCertificateArgs $;

        public Builder() {
            $ = new LoadbalancerCertificateArgs();
        }

        public Builder(LoadbalancerCertificateArgs defaults) {
            $ = new LoadbalancerCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customCertificate Configuration block for custom certificate chain. Only one of `letsencrypt` and `custom_certificate` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder customCertificate(@Nullable Output<LoadbalancerCertificateCustomCertificateArgs> customCertificate) {
            $.customCertificate = customCertificate;
            return this;
        }

        /**
         * @param customCertificate Configuration block for custom certificate chain. Only one of `letsencrypt` and `custom_certificate` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder customCertificate(LoadbalancerCertificateCustomCertificateArgs customCertificate) {
            return customCertificate(Output.of(customCertificate));
        }

        /**
         * @param lbId The load-balancer ID this certificate is attached to.
         * 
         * @return builder
         * 
         */
        public Builder lbId(Output<String> lbId) {
            $.lbId = lbId;
            return this;
        }

        /**
         * @param lbId The load-balancer ID this certificate is attached to.
         * 
         * @return builder
         * 
         */
        public Builder lbId(String lbId) {
            return lbId(Output.of(lbId));
        }

        /**
         * @param letsencrypt Configuration block for Let&#39;s Encrypt configuration. Only one of `letsencrypt` and `custom_certificate` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder letsencrypt(@Nullable Output<LoadbalancerCertificateLetsencryptArgs> letsencrypt) {
            $.letsencrypt = letsencrypt;
            return this;
        }

        /**
         * @param letsencrypt Configuration block for Let&#39;s Encrypt configuration. Only one of `letsencrypt` and `custom_certificate` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder letsencrypt(LoadbalancerCertificateLetsencryptArgs letsencrypt) {
            return letsencrypt(Output.of(letsencrypt));
        }

        /**
         * @param name The name of the certificate backend.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the certificate backend.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public LoadbalancerCertificateArgs build() {
            $.lbId = Objects.requireNonNull($.lbId, "expected parameter 'lbId' to be non-null");
            return $;
        }
    }

}
