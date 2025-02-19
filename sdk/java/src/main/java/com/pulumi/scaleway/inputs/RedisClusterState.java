// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.RedisClusterAclArgs;
import com.pulumi.scaleway.inputs.RedisClusterPrivateNetworkArgs;
import com.pulumi.scaleway.inputs.RedisClusterPublicNetworkArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RedisClusterState extends com.pulumi.resources.ResourceArgs {

    public static final RedisClusterState Empty = new RedisClusterState();

    /**
     * List of acl rules, this is cluster&#39;s authorized IPs.
     * 
     */
    @Import(name="acls")
    private @Nullable Output<List<RedisClusterAclArgs>> acls;

    /**
     * @return List of acl rules, this is cluster&#39;s authorized IPs.
     * 
     */
    public Optional<Output<List<RedisClusterAclArgs>>> acls() {
        return Optional.ofNullable(this.acls);
    }

    /**
     * The PEM of the certificate used by redis, only when `tls_enabled` is true
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return The PEM of the certificate used by redis, only when `tls_enabled` is true
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * The number of nodes in the Redis Cluster.
     * 
     */
    @Import(name="clusterSize")
    private @Nullable Output<Integer> clusterSize;

    /**
     * @return The number of nodes in the Redis Cluster.
     * 
     */
    public Optional<Output<Integer>> clusterSize() {
        return Optional.ofNullable(this.clusterSize);
    }

    /**
     * The date and time of creation of the Redis Cluster.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The date and time of creation of the Redis Cluster.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The name of the Redis Cluster.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Redis Cluster.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of Redis Cluster you want to create (e.g. `RED1-M`).
     * 
     */
    @Import(name="nodeType")
    private @Nullable Output<String> nodeType;

    /**
     * @return The type of Redis Cluster you want to create (e.g. `RED1-M`).
     * 
     */
    public Optional<Output<String>> nodeType() {
        return Optional.ofNullable(this.nodeType);
    }

    /**
     * Password for the first user of the Redis Cluster.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password for the first user of the Redis Cluster.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Describes the private network you want to connect to your cluster. If not set, a public network will be provided.
     * 
     */
    @Import(name="privateNetworks")
    private @Nullable Output<List<RedisClusterPrivateNetworkArgs>> privateNetworks;

    /**
     * @return Describes the private network you want to connect to your cluster. If not set, a public network will be provided.
     * 
     */
    public Optional<Output<List<RedisClusterPrivateNetworkArgs>>> privateNetworks() {
        return Optional.ofNullable(this.privateNetworks);
    }

    /**
     * `project_id`) The ID of the project the Redis Cluster is associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the Redis Cluster is associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Public network specs details
     * 
     */
    @Import(name="publicNetwork")
    private @Nullable Output<RedisClusterPublicNetworkArgs> publicNetwork;

    /**
     * @return Public network specs details
     * 
     */
    public Optional<Output<RedisClusterPublicNetworkArgs>> publicNetwork() {
        return Optional.ofNullable(this.publicNetwork);
    }

    /**
     * Map of settings for redis cluster. Available settings can be found by listing redis versions with scaleway API or CLI
     * 
     */
    @Import(name="settings")
    private @Nullable Output<Map<String,String>> settings;

    /**
     * @return Map of settings for redis cluster. Available settings can be found by listing redis versions with scaleway API or CLI
     * 
     */
    public Optional<Output<Map<String,String>>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * The tags associated with the Redis Cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The tags associated with the Redis Cluster.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Whether TLS is enabled or not.
     * 
     */
    @Import(name="tlsEnabled")
    private @Nullable Output<Boolean> tlsEnabled;

    /**
     * @return Whether TLS is enabled or not.
     * 
     */
    public Optional<Output<Boolean>> tlsEnabled() {
        return Optional.ofNullable(this.tlsEnabled);
    }

    /**
     * The date and time of the last update of the Redis Cluster.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return The date and time of the last update of the Redis Cluster.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    /**
     * Identifier for the first user of the Redis Cluster.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return Identifier for the first user of the Redis Cluster.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    /**
     * Redis&#39;s Cluster version (e.g. `6.2.6`).
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Redis&#39;s Cluster version (e.g. `6.2.6`).
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
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

    private RedisClusterState() {}

    private RedisClusterState(RedisClusterState $) {
        this.acls = $.acls;
        this.certificate = $.certificate;
        this.clusterSize = $.clusterSize;
        this.createdAt = $.createdAt;
        this.name = $.name;
        this.nodeType = $.nodeType;
        this.password = $.password;
        this.privateNetworks = $.privateNetworks;
        this.projectId = $.projectId;
        this.publicNetwork = $.publicNetwork;
        this.settings = $.settings;
        this.tags = $.tags;
        this.tlsEnabled = $.tlsEnabled;
        this.updatedAt = $.updatedAt;
        this.userName = $.userName;
        this.version = $.version;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedisClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedisClusterState $;

        public Builder() {
            $ = new RedisClusterState();
        }

        public Builder(RedisClusterState defaults) {
            $ = new RedisClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acls List of acl rules, this is cluster&#39;s authorized IPs.
         * 
         * @return builder
         * 
         */
        public Builder acls(@Nullable Output<List<RedisClusterAclArgs>> acls) {
            $.acls = acls;
            return this;
        }

        /**
         * @param acls List of acl rules, this is cluster&#39;s authorized IPs.
         * 
         * @return builder
         * 
         */
        public Builder acls(List<RedisClusterAclArgs> acls) {
            return acls(Output.of(acls));
        }

        /**
         * @param acls List of acl rules, this is cluster&#39;s authorized IPs.
         * 
         * @return builder
         * 
         */
        public Builder acls(RedisClusterAclArgs... acls) {
            return acls(List.of(acls));
        }

        /**
         * @param certificate The PEM of the certificate used by redis, only when `tls_enabled` is true
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate The PEM of the certificate used by redis, only when `tls_enabled` is true
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param clusterSize The number of nodes in the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterSize(@Nullable Output<Integer> clusterSize) {
            $.clusterSize = clusterSize;
            return this;
        }

        /**
         * @param clusterSize The number of nodes in the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterSize(Integer clusterSize) {
            return clusterSize(Output.of(clusterSize));
        }

        /**
         * @param createdAt The date and time of creation of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The date and time of creation of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param name The name of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeType The type of Redis Cluster you want to create (e.g. `RED1-M`).
         * 
         * @return builder
         * 
         */
        public Builder nodeType(@Nullable Output<String> nodeType) {
            $.nodeType = nodeType;
            return this;
        }

        /**
         * @param nodeType The type of Redis Cluster you want to create (e.g. `RED1-M`).
         * 
         * @return builder
         * 
         */
        public Builder nodeType(String nodeType) {
            return nodeType(Output.of(nodeType));
        }

        /**
         * @param password Password for the first user of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for the first user of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param privateNetworks Describes the private network you want to connect to your cluster. If not set, a public network will be provided.
         * 
         * @return builder
         * 
         */
        public Builder privateNetworks(@Nullable Output<List<RedisClusterPrivateNetworkArgs>> privateNetworks) {
            $.privateNetworks = privateNetworks;
            return this;
        }

        /**
         * @param privateNetworks Describes the private network you want to connect to your cluster. If not set, a public network will be provided.
         * 
         * @return builder
         * 
         */
        public Builder privateNetworks(List<RedisClusterPrivateNetworkArgs> privateNetworks) {
            return privateNetworks(Output.of(privateNetworks));
        }

        /**
         * @param privateNetworks Describes the private network you want to connect to your cluster. If not set, a public network will be provided.
         * 
         * @return builder
         * 
         */
        public Builder privateNetworks(RedisClusterPrivateNetworkArgs... privateNetworks) {
            return privateNetworks(List.of(privateNetworks));
        }

        /**
         * @param projectId `project_id`) The ID of the project the Redis Cluster is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the Redis Cluster is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param publicNetwork Public network specs details
         * 
         * @return builder
         * 
         */
        public Builder publicNetwork(@Nullable Output<RedisClusterPublicNetworkArgs> publicNetwork) {
            $.publicNetwork = publicNetwork;
            return this;
        }

        /**
         * @param publicNetwork Public network specs details
         * 
         * @return builder
         * 
         */
        public Builder publicNetwork(RedisClusterPublicNetworkArgs publicNetwork) {
            return publicNetwork(Output.of(publicNetwork));
        }

        /**
         * @param settings Map of settings for redis cluster. Available settings can be found by listing redis versions with scaleway API or CLI
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<Map<String,String>> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings Map of settings for redis cluster. Available settings can be found by listing redis versions with scaleway API or CLI
         * 
         * @return builder
         * 
         */
        public Builder settings(Map<String,String> settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param tags The tags associated with the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags associated with the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags associated with the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param tlsEnabled Whether TLS is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder tlsEnabled(@Nullable Output<Boolean> tlsEnabled) {
            $.tlsEnabled = tlsEnabled;
            return this;
        }

        /**
         * @param tlsEnabled Whether TLS is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder tlsEnabled(Boolean tlsEnabled) {
            return tlsEnabled(Output.of(tlsEnabled));
        }

        /**
         * @param updatedAt The date and time of the last update of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt The date and time of the last update of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        /**
         * @param userName Identifier for the first user of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName Identifier for the first user of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        /**
         * @param version Redis&#39;s Cluster version (e.g. `6.2.6`).
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Redis&#39;s Cluster version (e.g. `6.2.6`).
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
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

        public RedisClusterState build() {
            return $;
        }
    }

}
