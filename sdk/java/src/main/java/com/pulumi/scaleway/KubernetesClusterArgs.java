// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.KubernetesClusterAutoUpgradeArgs;
import com.pulumi.scaleway.inputs.KubernetesClusterAutoscalerConfigArgs;
import com.pulumi.scaleway.inputs.KubernetesClusterOpenIdConnectConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterArgs Empty = new KubernetesClusterArgs();

    /**
     * The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
     * 
     */
    @Import(name="admissionPlugins")
    private @Nullable Output<List<String>> admissionPlugins;

    /**
     * @return The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
     * 
     */
    public Optional<Output<List<String>>> admissionPlugins() {
        return Optional.ofNullable(this.admissionPlugins);
    }

    /**
     * Additional Subject Alternative Names for the Kubernetes API server certificate
     * 
     */
    @Import(name="apiserverCertSans")
    private @Nullable Output<List<String>> apiserverCertSans;

    /**
     * @return Additional Subject Alternative Names for the Kubernetes API server certificate
     * 
     */
    public Optional<Output<List<String>>> apiserverCertSans() {
        return Optional.ofNullable(this.apiserverCertSans);
    }

    /**
     * The auto upgrade configuration.
     * 
     */
    @Import(name="autoUpgrade")
    private @Nullable Output<KubernetesClusterAutoUpgradeArgs> autoUpgrade;

    /**
     * @return The auto upgrade configuration.
     * 
     */
    public Optional<Output<KubernetesClusterAutoUpgradeArgs>> autoUpgrade() {
        return Optional.ofNullable(this.autoUpgrade);
    }

    /**
     * The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
     * 
     */
    @Import(name="autoscalerConfig")
    private @Nullable Output<KubernetesClusterAutoscalerConfigArgs> autoscalerConfig;

    /**
     * @return The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
     * 
     */
    public Optional<Output<KubernetesClusterAutoscalerConfigArgs>> autoscalerConfig() {
        return Optional.ofNullable(this.autoscalerConfig);
    }

    /**
     * The Container Network Interface (CNI) for the Kubernetes cluster.
     * &gt; **Important:** Updates to this field will recreate a new resource.
     * 
     */
    @Import(name="cni", required=true)
    private Output<String> cni;

    /**
     * @return The Container Network Interface (CNI) for the Kubernetes cluster.
     * &gt; **Important:** Updates to this field will recreate a new resource.
     * 
     */
    public Output<String> cni() {
        return this.cni;
    }

    /**
     * Delete additional resources like block volumes and loadbalancers that were created in Kubernetes on cluster deletion.
     * 
     */
    @Import(name="deleteAdditionalResources")
    private @Nullable Output<Boolean> deleteAdditionalResources;

    /**
     * @return Delete additional resources like block volumes and loadbalancers that were created in Kubernetes on cluster deletion.
     * 
     */
    public Optional<Output<Boolean>> deleteAdditionalResources() {
        return Optional.ofNullable(this.deleteAdditionalResources);
    }

    /**
     * A description for the Kubernetes cluster.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for the Kubernetes cluster.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
     * 
     */
    @Import(name="featureGates")
    private @Nullable Output<List<String>> featureGates;

    /**
     * @return The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
     * 
     */
    public Optional<Output<List<String>>> featureGates() {
        return Optional.ofNullable(this.featureGates);
    }

    /**
     * The name for the Kubernetes cluster.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the Kubernetes cluster.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The OpenID Connect configuration of the cluster
     * 
     */
    @Import(name="openIdConnectConfig")
    private @Nullable Output<KubernetesClusterOpenIdConnectConfigArgs> openIdConnectConfig;

    /**
     * @return The OpenID Connect configuration of the cluster
     * 
     */
    public Optional<Output<KubernetesClusterOpenIdConnectConfigArgs>> openIdConnectConfig() {
        return Optional.ofNullable(this.openIdConnectConfig);
    }

    /**
     * `project_id`) The ID of the project the cluster is associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the cluster is associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * `region`) The region in which the cluster should be created.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return `region`) The region in which the cluster should be created.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The tags associated with the Kubernetes cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The tags associated with the Kubernetes cluster.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The version of the Kubernetes cluster.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return The version of the Kubernetes cluster.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private KubernetesClusterArgs() {}

    private KubernetesClusterArgs(KubernetesClusterArgs $) {
        this.admissionPlugins = $.admissionPlugins;
        this.apiserverCertSans = $.apiserverCertSans;
        this.autoUpgrade = $.autoUpgrade;
        this.autoscalerConfig = $.autoscalerConfig;
        this.cni = $.cni;
        this.deleteAdditionalResources = $.deleteAdditionalResources;
        this.description = $.description;
        this.featureGates = $.featureGates;
        this.name = $.name;
        this.openIdConnectConfig = $.openIdConnectConfig;
        this.projectId = $.projectId;
        this.region = $.region;
        this.tags = $.tags;
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterArgs $;

        public Builder() {
            $ = new KubernetesClusterArgs();
        }

        public Builder(KubernetesClusterArgs defaults) {
            $ = new KubernetesClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param admissionPlugins The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder admissionPlugins(@Nullable Output<List<String>> admissionPlugins) {
            $.admissionPlugins = admissionPlugins;
            return this;
        }

        /**
         * @param admissionPlugins The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder admissionPlugins(List<String> admissionPlugins) {
            return admissionPlugins(Output.of(admissionPlugins));
        }

        /**
         * @param admissionPlugins The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder admissionPlugins(String... admissionPlugins) {
            return admissionPlugins(List.of(admissionPlugins));
        }

        /**
         * @param apiserverCertSans Additional Subject Alternative Names for the Kubernetes API server certificate
         * 
         * @return builder
         * 
         */
        public Builder apiserverCertSans(@Nullable Output<List<String>> apiserverCertSans) {
            $.apiserverCertSans = apiserverCertSans;
            return this;
        }

        /**
         * @param apiserverCertSans Additional Subject Alternative Names for the Kubernetes API server certificate
         * 
         * @return builder
         * 
         */
        public Builder apiserverCertSans(List<String> apiserverCertSans) {
            return apiserverCertSans(Output.of(apiserverCertSans));
        }

        /**
         * @param apiserverCertSans Additional Subject Alternative Names for the Kubernetes API server certificate
         * 
         * @return builder
         * 
         */
        public Builder apiserverCertSans(String... apiserverCertSans) {
            return apiserverCertSans(List.of(apiserverCertSans));
        }

        /**
         * @param autoUpgrade The auto upgrade configuration.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgrade(@Nullable Output<KubernetesClusterAutoUpgradeArgs> autoUpgrade) {
            $.autoUpgrade = autoUpgrade;
            return this;
        }

        /**
         * @param autoUpgrade The auto upgrade configuration.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgrade(KubernetesClusterAutoUpgradeArgs autoUpgrade) {
            return autoUpgrade(Output.of(autoUpgrade));
        }

        /**
         * @param autoscalerConfig The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
         * 
         * @return builder
         * 
         */
        public Builder autoscalerConfig(@Nullable Output<KubernetesClusterAutoscalerConfigArgs> autoscalerConfig) {
            $.autoscalerConfig = autoscalerConfig;
            return this;
        }

        /**
         * @param autoscalerConfig The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
         * 
         * @return builder
         * 
         */
        public Builder autoscalerConfig(KubernetesClusterAutoscalerConfigArgs autoscalerConfig) {
            return autoscalerConfig(Output.of(autoscalerConfig));
        }

        /**
         * @param cni The Container Network Interface (CNI) for the Kubernetes cluster.
         * &gt; **Important:** Updates to this field will recreate a new resource.
         * 
         * @return builder
         * 
         */
        public Builder cni(Output<String> cni) {
            $.cni = cni;
            return this;
        }

        /**
         * @param cni The Container Network Interface (CNI) for the Kubernetes cluster.
         * &gt; **Important:** Updates to this field will recreate a new resource.
         * 
         * @return builder
         * 
         */
        public Builder cni(String cni) {
            return cni(Output.of(cni));
        }

        /**
         * @param deleteAdditionalResources Delete additional resources like block volumes and loadbalancers that were created in Kubernetes on cluster deletion.
         * 
         * @return builder
         * 
         */
        public Builder deleteAdditionalResources(@Nullable Output<Boolean> deleteAdditionalResources) {
            $.deleteAdditionalResources = deleteAdditionalResources;
            return this;
        }

        /**
         * @param deleteAdditionalResources Delete additional resources like block volumes and loadbalancers that were created in Kubernetes on cluster deletion.
         * 
         * @return builder
         * 
         */
        public Builder deleteAdditionalResources(Boolean deleteAdditionalResources) {
            return deleteAdditionalResources(Output.of(deleteAdditionalResources));
        }

        /**
         * @param description A description for the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param featureGates The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder featureGates(@Nullable Output<List<String>> featureGates) {
            $.featureGates = featureGates;
            return this;
        }

        /**
         * @param featureGates The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder featureGates(List<String> featureGates) {
            return featureGates(Output.of(featureGates));
        }

        /**
         * @param featureGates The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder featureGates(String... featureGates) {
            return featureGates(List.of(featureGates));
        }

        /**
         * @param name The name for the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param openIdConnectConfig The OpenID Connect configuration of the cluster
         * 
         * @return builder
         * 
         */
        public Builder openIdConnectConfig(@Nullable Output<KubernetesClusterOpenIdConnectConfigArgs> openIdConnectConfig) {
            $.openIdConnectConfig = openIdConnectConfig;
            return this;
        }

        /**
         * @param openIdConnectConfig The OpenID Connect configuration of the cluster
         * 
         * @return builder
         * 
         */
        public Builder openIdConnectConfig(KubernetesClusterOpenIdConnectConfigArgs openIdConnectConfig) {
            return openIdConnectConfig(Output.of(openIdConnectConfig));
        }

        /**
         * @param projectId `project_id`) The ID of the project the cluster is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the cluster is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region `region`) The region in which the cluster should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region `region`) The region in which the cluster should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param tags The tags associated with the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags associated with the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags associated with the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param version The version of the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public KubernetesClusterArgs build() {
            $.cni = Objects.requireNonNull($.cni, "expected parameter 'cni' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
