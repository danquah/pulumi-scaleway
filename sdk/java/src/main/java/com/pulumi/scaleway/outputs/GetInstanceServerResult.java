// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scaleway.outputs.GetInstanceServerPrivateNetwork;
import com.pulumi.scaleway.outputs.GetInstanceServerRootVolume;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceServerResult {
    /**
     * @return The [additional volumes](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39)
     * attached to the server.
     * 
     */
    private List<String> additionalVolumeIds;
    private String bootType;
    private String bootscriptId;
    /**
     * @return The cloud init script associated with this server.
     * 
     */
    private String cloudInit;
    /**
     * @return True is dynamic IP in enable on the server.
     * 
     */
    private Boolean enableDynamicIp;
    /**
     * @return Determines if IPv6 is enabled for the server.
     * 
     */
    private Boolean enableIpv6;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The UUID and the label of the base image used by the server.
     * 
     */
    private String image;
    private String ipId;
    /**
     * @return The default ipv6 address routed to the server. ( Only set when enable_ipv6 is set to true )
     * 
     */
    private String ipv6Address;
    /**
     * @return The ipv6 gateway address. ( Only set when enable_ipv6 is set to true )
     * 
     */
    private String ipv6Gateway;
    /**
     * @return The prefix length of the ipv6 subnet routed to the server. ( Only set when enable_ipv6 is set to true )
     * 
     */
    private Integer ipv6PrefixLength;
    private @Nullable String name;
    /**
     * @return The ID of the organization the server is associated with.
     * 
     */
    private String organizationId;
    /**
     * @return The [placement group](https://developers.scaleway.com/en/products/instance/api/#placement-groups-d8f653) the server is attached to.
     * 
     */
    private String placementGroupId;
    /**
     * @return True when the placement group policy is respected.
     * 
     */
    private Boolean placementGroupPolicyRespected;
    /**
     * @return The Scaleway internal IP address of the server.
     * 
     */
    private String privateIp;
    private List<GetInstanceServerPrivateNetwork> privateNetworks;
    /**
     * @return The ID of the project the server is associated with.
     * 
     */
    private String projectId;
    /**
     * @return The public IPv4 address of the server.
     * 
     */
    private String publicIp;
    /**
     * @return Root [volume](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39) attached to the server on creation.
     * 
     */
    private List<GetInstanceServerRootVolume> rootVolumes;
    /**
     * @return The [security group](https://developers.scaleway.com/en/products/instance/api/#security-groups-8d7f89) the server is attached to.
     * 
     */
    private String securityGroupId;
    private @Nullable String serverId;
    /**
     * @return The state of the server. Possible values are: `started`, `stopped` or `standby`.
     * 
     */
    private String state;
    /**
     * @return The tags associated with the server.
     * 
     */
    private List<String> tags;
    /**
     * @return The commercial type of the server.
     * You find all the available types on the [pricing page](https://www.scaleway.com/en/pricing/).
     * 
     */
    private String type;
    /**
     * @return The user data associated with the server.
     * 
     */
    private Map<String,String> userData;
    private @Nullable String zone;

    private GetInstanceServerResult() {}
    /**
     * @return The [additional volumes](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39)
     * attached to the server.
     * 
     */
    public List<String> additionalVolumeIds() {
        return this.additionalVolumeIds;
    }
    public String bootType() {
        return this.bootType;
    }
    public String bootscriptId() {
        return this.bootscriptId;
    }
    /**
     * @return The cloud init script associated with this server.
     * 
     */
    public String cloudInit() {
        return this.cloudInit;
    }
    /**
     * @return True is dynamic IP in enable on the server.
     * 
     */
    public Boolean enableDynamicIp() {
        return this.enableDynamicIp;
    }
    /**
     * @return Determines if IPv6 is enabled for the server.
     * 
     */
    public Boolean enableIpv6() {
        return this.enableIpv6;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The UUID and the label of the base image used by the server.
     * 
     */
    public String image() {
        return this.image;
    }
    public String ipId() {
        return this.ipId;
    }
    /**
     * @return The default ipv6 address routed to the server. ( Only set when enable_ipv6 is set to true )
     * 
     */
    public String ipv6Address() {
        return this.ipv6Address;
    }
    /**
     * @return The ipv6 gateway address. ( Only set when enable_ipv6 is set to true )
     * 
     */
    public String ipv6Gateway() {
        return this.ipv6Gateway;
    }
    /**
     * @return The prefix length of the ipv6 subnet routed to the server. ( Only set when enable_ipv6 is set to true )
     * 
     */
    public Integer ipv6PrefixLength() {
        return this.ipv6PrefixLength;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The ID of the organization the server is associated with.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return The [placement group](https://developers.scaleway.com/en/products/instance/api/#placement-groups-d8f653) the server is attached to.
     * 
     */
    public String placementGroupId() {
        return this.placementGroupId;
    }
    /**
     * @return True when the placement group policy is respected.
     * 
     */
    public Boolean placementGroupPolicyRespected() {
        return this.placementGroupPolicyRespected;
    }
    /**
     * @return The Scaleway internal IP address of the server.
     * 
     */
    public String privateIp() {
        return this.privateIp;
    }
    public List<GetInstanceServerPrivateNetwork> privateNetworks() {
        return this.privateNetworks;
    }
    /**
     * @return The ID of the project the server is associated with.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return The public IPv4 address of the server.
     * 
     */
    public String publicIp() {
        return this.publicIp;
    }
    /**
     * @return Root [volume](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39) attached to the server on creation.
     * 
     */
    public List<GetInstanceServerRootVolume> rootVolumes() {
        return this.rootVolumes;
    }
    /**
     * @return The [security group](https://developers.scaleway.com/en/products/instance/api/#security-groups-8d7f89) the server is attached to.
     * 
     */
    public String securityGroupId() {
        return this.securityGroupId;
    }
    public Optional<String> serverId() {
        return Optional.ofNullable(this.serverId);
    }
    /**
     * @return The state of the server. Possible values are: `started`, `stopped` or `standby`.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The tags associated with the server.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return The commercial type of the server.
     * You find all the available types on the [pricing page](https://www.scaleway.com/en/pricing/).
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The user data associated with the server.
     * 
     */
    public Map<String,String> userData() {
        return this.userData;
    }
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceServerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> additionalVolumeIds;
        private String bootType;
        private String bootscriptId;
        private String cloudInit;
        private Boolean enableDynamicIp;
        private Boolean enableIpv6;
        private String id;
        private String image;
        private String ipId;
        private String ipv6Address;
        private String ipv6Gateway;
        private Integer ipv6PrefixLength;
        private @Nullable String name;
        private String organizationId;
        private String placementGroupId;
        private Boolean placementGroupPolicyRespected;
        private String privateIp;
        private List<GetInstanceServerPrivateNetwork> privateNetworks;
        private String projectId;
        private String publicIp;
        private List<GetInstanceServerRootVolume> rootVolumes;
        private String securityGroupId;
        private @Nullable String serverId;
        private String state;
        private List<String> tags;
        private String type;
        private Map<String,String> userData;
        private @Nullable String zone;
        public Builder() {}
        public Builder(GetInstanceServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalVolumeIds = defaults.additionalVolumeIds;
    	      this.bootType = defaults.bootType;
    	      this.bootscriptId = defaults.bootscriptId;
    	      this.cloudInit = defaults.cloudInit;
    	      this.enableDynamicIp = defaults.enableDynamicIp;
    	      this.enableIpv6 = defaults.enableIpv6;
    	      this.id = defaults.id;
    	      this.image = defaults.image;
    	      this.ipId = defaults.ipId;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.ipv6Gateway = defaults.ipv6Gateway;
    	      this.ipv6PrefixLength = defaults.ipv6PrefixLength;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.placementGroupId = defaults.placementGroupId;
    	      this.placementGroupPolicyRespected = defaults.placementGroupPolicyRespected;
    	      this.privateIp = defaults.privateIp;
    	      this.privateNetworks = defaults.privateNetworks;
    	      this.projectId = defaults.projectId;
    	      this.publicIp = defaults.publicIp;
    	      this.rootVolumes = defaults.rootVolumes;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.serverId = defaults.serverId;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.userData = defaults.userData;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder additionalVolumeIds(List<String> additionalVolumeIds) {
            this.additionalVolumeIds = Objects.requireNonNull(additionalVolumeIds);
            return this;
        }
        public Builder additionalVolumeIds(String... additionalVolumeIds) {
            return additionalVolumeIds(List.of(additionalVolumeIds));
        }
        @CustomType.Setter
        public Builder bootType(String bootType) {
            this.bootType = Objects.requireNonNull(bootType);
            return this;
        }
        @CustomType.Setter
        public Builder bootscriptId(String bootscriptId) {
            this.bootscriptId = Objects.requireNonNull(bootscriptId);
            return this;
        }
        @CustomType.Setter
        public Builder cloudInit(String cloudInit) {
            this.cloudInit = Objects.requireNonNull(cloudInit);
            return this;
        }
        @CustomType.Setter
        public Builder enableDynamicIp(Boolean enableDynamicIp) {
            this.enableDynamicIp = Objects.requireNonNull(enableDynamicIp);
            return this;
        }
        @CustomType.Setter
        public Builder enableIpv6(Boolean enableIpv6) {
            this.enableIpv6 = Objects.requireNonNull(enableIpv6);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        @CustomType.Setter
        public Builder ipId(String ipId) {
            this.ipId = Objects.requireNonNull(ipId);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Gateway(String ipv6Gateway) {
            this.ipv6Gateway = Objects.requireNonNull(ipv6Gateway);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6PrefixLength(Integer ipv6PrefixLength) {
            this.ipv6PrefixLength = Objects.requireNonNull(ipv6PrefixLength);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        @CustomType.Setter
        public Builder placementGroupId(String placementGroupId) {
            this.placementGroupId = Objects.requireNonNull(placementGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder placementGroupPolicyRespected(Boolean placementGroupPolicyRespected) {
            this.placementGroupPolicyRespected = Objects.requireNonNull(placementGroupPolicyRespected);
            return this;
        }
        @CustomType.Setter
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        @CustomType.Setter
        public Builder privateNetworks(List<GetInstanceServerPrivateNetwork> privateNetworks) {
            this.privateNetworks = Objects.requireNonNull(privateNetworks);
            return this;
        }
        public Builder privateNetworks(GetInstanceServerPrivateNetwork... privateNetworks) {
            return privateNetworks(List.of(privateNetworks));
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder publicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }
        @CustomType.Setter
        public Builder rootVolumes(List<GetInstanceServerRootVolume> rootVolumes) {
            this.rootVolumes = Objects.requireNonNull(rootVolumes);
            return this;
        }
        public Builder rootVolumes(GetInstanceServerRootVolume... rootVolumes) {
            return rootVolumes(List.of(rootVolumes));
        }
        @CustomType.Setter
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder serverId(@Nullable String serverId) {
            this.serverId = serverId;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder userData(Map<String,String> userData) {
            this.userData = Objects.requireNonNull(userData);
            return this;
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }
        public GetInstanceServerResult build() {
            final var o = new GetInstanceServerResult();
            o.additionalVolumeIds = additionalVolumeIds;
            o.bootType = bootType;
            o.bootscriptId = bootscriptId;
            o.cloudInit = cloudInit;
            o.enableDynamicIp = enableDynamicIp;
            o.enableIpv6 = enableIpv6;
            o.id = id;
            o.image = image;
            o.ipId = ipId;
            o.ipv6Address = ipv6Address;
            o.ipv6Gateway = ipv6Gateway;
            o.ipv6PrefixLength = ipv6PrefixLength;
            o.name = name;
            o.organizationId = organizationId;
            o.placementGroupId = placementGroupId;
            o.placementGroupPolicyRespected = placementGroupPolicyRespected;
            o.privateIp = privateIp;
            o.privateNetworks = privateNetworks;
            o.projectId = projectId;
            o.publicIp = publicIp;
            o.rootVolumes = rootVolumes;
            o.securityGroupId = securityGroupId;
            o.serverId = serverId;
            o.state = state;
            o.tags = tags;
            o.type = type;
            o.userData = userData;
            o.zone = zone;
            return o;
        }
    }
}
