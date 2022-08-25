// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceServersServer {
    /**
     * @return The boot Type of the server. Possible values are: `local`, `bootscript` or `rescue`.
     * 
     */
    private String bootType;
    /**
     * @return The ID of the bootscript.
     * 
     */
    private String bootscriptId;
    /**
     * @return If true a dynamic IP will be attached to the server.
     * 
     */
    private Boolean enableDynamicIp;
    /**
     * @return Determines if IPv6 is enabled for the server.
     * 
     */
    private Boolean enableIpv6;
    /**
     * @return The ID of the server.
     * 
     */
    private String id;
    /**
     * @return The UUID or the label of the base image used by the server.
     * 
     */
    private String image;
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
    /**
     * @return The server name used as filter. Servers with a name like it are listed.
     * 
     */
    private String name;
    /**
     * @return The organization ID the server is associated with.
     * 
     */
    private String organizationId;
    /**
     * @return The [placement group](https://developers.scaleway.com/en/products/instance/api/#placement-groups-d8f653) the server is attached to.
     * 
     */
    private String placementGroupId;
    private Boolean placementGroupPolicyRespected;
    /**
     * @return The Scaleway internal IP address of the server.
     * 
     */
    private String privateIp;
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
     * @return The [security group](https://developers.scaleway.com/en/products/instance/api/#security-groups-8d7f89) the server is attached to.
     * 
     */
    private String securityGroupId;
    /**
     * @return The state of the server. Possible values are: `started`, `stopped` or `standby`.
     * 
     */
    private String state;
    /**
     * @return List of tags used as filter. Servers with these exact tags are listed.
     * 
     */
    private List<String> tags;
    /**
     * @return The commercial type of the server.
     * 
     */
    private String type;
    /**
     * @return `zone`) The zone in which servers exist.
     * 
     */
    private String zone;

    private GetInstanceServersServer() {}
    /**
     * @return The boot Type of the server. Possible values are: `local`, `bootscript` or `rescue`.
     * 
     */
    public String bootType() {
        return this.bootType;
    }
    /**
     * @return The ID of the bootscript.
     * 
     */
    public String bootscriptId() {
        return this.bootscriptId;
    }
    /**
     * @return If true a dynamic IP will be attached to the server.
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
     * @return The ID of the server.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The UUID or the label of the base image used by the server.
     * 
     */
    public String image() {
        return this.image;
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
    /**
     * @return The server name used as filter. Servers with a name like it are listed.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The organization ID the server is associated with.
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
     * @return The [security group](https://developers.scaleway.com/en/products/instance/api/#security-groups-8d7f89) the server is attached to.
     * 
     */
    public String securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * @return The state of the server. Possible values are: `started`, `stopped` or `standby`.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return List of tags used as filter. Servers with these exact tags are listed.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return The commercial type of the server.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return `zone`) The zone in which servers exist.
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceServersServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bootType;
        private String bootscriptId;
        private Boolean enableDynamicIp;
        private Boolean enableIpv6;
        private String id;
        private String image;
        private String ipv6Address;
        private String ipv6Gateway;
        private Integer ipv6PrefixLength;
        private String name;
        private String organizationId;
        private String placementGroupId;
        private Boolean placementGroupPolicyRespected;
        private String privateIp;
        private String projectId;
        private String publicIp;
        private String securityGroupId;
        private String state;
        private List<String> tags;
        private String type;
        private String zone;
        public Builder() {}
        public Builder(GetInstanceServersServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootType = defaults.bootType;
    	      this.bootscriptId = defaults.bootscriptId;
    	      this.enableDynamicIp = defaults.enableDynamicIp;
    	      this.enableIpv6 = defaults.enableIpv6;
    	      this.id = defaults.id;
    	      this.image = defaults.image;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.ipv6Gateway = defaults.ipv6Gateway;
    	      this.ipv6PrefixLength = defaults.ipv6PrefixLength;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.placementGroupId = defaults.placementGroupId;
    	      this.placementGroupPolicyRespected = defaults.placementGroupPolicyRespected;
    	      this.privateIp = defaults.privateIp;
    	      this.projectId = defaults.projectId;
    	      this.publicIp = defaults.publicIp;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zone = defaults.zone;
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
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
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
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
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
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetInstanceServersServer build() {
            final var o = new GetInstanceServersServer();
            o.bootType = bootType;
            o.bootscriptId = bootscriptId;
            o.enableDynamicIp = enableDynamicIp;
            o.enableIpv6 = enableIpv6;
            o.id = id;
            o.image = image;
            o.ipv6Address = ipv6Address;
            o.ipv6Gateway = ipv6Gateway;
            o.ipv6PrefixLength = ipv6PrefixLength;
            o.name = name;
            o.organizationId = organizationId;
            o.placementGroupId = placementGroupId;
            o.placementGroupPolicyRespected = placementGroupPolicyRespected;
            o.privateIp = privateIp;
            o.projectId = projectId;
            o.publicIp = publicIp;
            o.securityGroupId = securityGroupId;
            o.state = state;
            o.tags = tags;
            o.type = type;
            o.zone = zone;
            return o;
        }
    }
}
