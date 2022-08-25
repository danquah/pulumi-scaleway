// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scaleway.outputs.GetDatabaseInstanceLoadBalancer;
import com.pulumi.scaleway.outputs.GetDatabaseInstancePrivateNetwork;
import com.pulumi.scaleway.outputs.GetDatabaseInstanceReadReplica;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDatabaseInstanceResult {
    private Boolean backupSameRegion;
    private Integer backupScheduleFrequency;
    private Integer backupScheduleRetention;
    private String certificate;
    private Boolean disableBackup;
    private String endpointIp;
    private Integer endpointPort;
    private String engine;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String instanceId;
    private Boolean isHaCluster;
    private List<GetDatabaseInstanceLoadBalancer> loadBalancers;
    private @Nullable String name;
    private String nodeType;
    private String organizationId;
    private String password;
    private List<GetDatabaseInstancePrivateNetwork> privateNetworks;
    private String projectId;
    private List<GetDatabaseInstanceReadReplica> readReplicas;
    private String region;
    private Map<String,String> settings;
    private List<String> tags;
    private String userName;
    private Integer volumeSizeInGb;
    private String volumeType;

    private GetDatabaseInstanceResult() {}
    public Boolean backupSameRegion() {
        return this.backupSameRegion;
    }
    public Integer backupScheduleFrequency() {
        return this.backupScheduleFrequency;
    }
    public Integer backupScheduleRetention() {
        return this.backupScheduleRetention;
    }
    public String certificate() {
        return this.certificate;
    }
    public Boolean disableBackup() {
        return this.disableBackup;
    }
    public String endpointIp() {
        return this.endpointIp;
    }
    public Integer endpointPort() {
        return this.endpointPort;
    }
    public String engine() {
        return this.engine;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }
    public Boolean isHaCluster() {
        return this.isHaCluster;
    }
    public List<GetDatabaseInstanceLoadBalancer> loadBalancers() {
        return this.loadBalancers;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String nodeType() {
        return this.nodeType;
    }
    public String organizationId() {
        return this.organizationId;
    }
    public String password() {
        return this.password;
    }
    public List<GetDatabaseInstancePrivateNetwork> privateNetworks() {
        return this.privateNetworks;
    }
    public String projectId() {
        return this.projectId;
    }
    public List<GetDatabaseInstanceReadReplica> readReplicas() {
        return this.readReplicas;
    }
    public String region() {
        return this.region;
    }
    public Map<String,String> settings() {
        return this.settings;
    }
    public List<String> tags() {
        return this.tags;
    }
    public String userName() {
        return this.userName;
    }
    public Integer volumeSizeInGb() {
        return this.volumeSizeInGb;
    }
    public String volumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean backupSameRegion;
        private Integer backupScheduleFrequency;
        private Integer backupScheduleRetention;
        private String certificate;
        private Boolean disableBackup;
        private String endpointIp;
        private Integer endpointPort;
        private String engine;
        private String id;
        private @Nullable String instanceId;
        private Boolean isHaCluster;
        private List<GetDatabaseInstanceLoadBalancer> loadBalancers;
        private @Nullable String name;
        private String nodeType;
        private String organizationId;
        private String password;
        private List<GetDatabaseInstancePrivateNetwork> privateNetworks;
        private String projectId;
        private List<GetDatabaseInstanceReadReplica> readReplicas;
        private String region;
        private Map<String,String> settings;
        private List<String> tags;
        private String userName;
        private Integer volumeSizeInGb;
        private String volumeType;
        public Builder() {}
        public Builder(GetDatabaseInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupSameRegion = defaults.backupSameRegion;
    	      this.backupScheduleFrequency = defaults.backupScheduleFrequency;
    	      this.backupScheduleRetention = defaults.backupScheduleRetention;
    	      this.certificate = defaults.certificate;
    	      this.disableBackup = defaults.disableBackup;
    	      this.endpointIp = defaults.endpointIp;
    	      this.endpointPort = defaults.endpointPort;
    	      this.engine = defaults.engine;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.isHaCluster = defaults.isHaCluster;
    	      this.loadBalancers = defaults.loadBalancers;
    	      this.name = defaults.name;
    	      this.nodeType = defaults.nodeType;
    	      this.organizationId = defaults.organizationId;
    	      this.password = defaults.password;
    	      this.privateNetworks = defaults.privateNetworks;
    	      this.projectId = defaults.projectId;
    	      this.readReplicas = defaults.readReplicas;
    	      this.region = defaults.region;
    	      this.settings = defaults.settings;
    	      this.tags = defaults.tags;
    	      this.userName = defaults.userName;
    	      this.volumeSizeInGb = defaults.volumeSizeInGb;
    	      this.volumeType = defaults.volumeType;
        }

        @CustomType.Setter
        public Builder backupSameRegion(Boolean backupSameRegion) {
            this.backupSameRegion = Objects.requireNonNull(backupSameRegion);
            return this;
        }
        @CustomType.Setter
        public Builder backupScheduleFrequency(Integer backupScheduleFrequency) {
            this.backupScheduleFrequency = Objects.requireNonNull(backupScheduleFrequency);
            return this;
        }
        @CustomType.Setter
        public Builder backupScheduleRetention(Integer backupScheduleRetention) {
            this.backupScheduleRetention = Objects.requireNonNull(backupScheduleRetention);
            return this;
        }
        @CustomType.Setter
        public Builder certificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        @CustomType.Setter
        public Builder disableBackup(Boolean disableBackup) {
            this.disableBackup = Objects.requireNonNull(disableBackup);
            return this;
        }
        @CustomType.Setter
        public Builder endpointIp(String endpointIp) {
            this.endpointIp = Objects.requireNonNull(endpointIp);
            return this;
        }
        @CustomType.Setter
        public Builder endpointPort(Integer endpointPort) {
            this.endpointPort = Objects.requireNonNull(endpointPort);
            return this;
        }
        @CustomType.Setter
        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder isHaCluster(Boolean isHaCluster) {
            this.isHaCluster = Objects.requireNonNull(isHaCluster);
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancers(List<GetDatabaseInstanceLoadBalancer> loadBalancers) {
            this.loadBalancers = Objects.requireNonNull(loadBalancers);
            return this;
        }
        public Builder loadBalancers(GetDatabaseInstanceLoadBalancer... loadBalancers) {
            return loadBalancers(List.of(loadBalancers));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nodeType(String nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder privateNetworks(List<GetDatabaseInstancePrivateNetwork> privateNetworks) {
            this.privateNetworks = Objects.requireNonNull(privateNetworks);
            return this;
        }
        public Builder privateNetworks(GetDatabaseInstancePrivateNetwork... privateNetworks) {
            return privateNetworks(List.of(privateNetworks));
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder readReplicas(List<GetDatabaseInstanceReadReplica> readReplicas) {
            this.readReplicas = Objects.requireNonNull(readReplicas);
            return this;
        }
        public Builder readReplicas(GetDatabaseInstanceReadReplica... readReplicas) {
            return readReplicas(List.of(readReplicas));
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder settings(Map<String,String> settings) {
            this.settings = Objects.requireNonNull(settings);
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
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        @CustomType.Setter
        public Builder volumeSizeInGb(Integer volumeSizeInGb) {
            this.volumeSizeInGb = Objects.requireNonNull(volumeSizeInGb);
            return this;
        }
        @CustomType.Setter
        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }
        public GetDatabaseInstanceResult build() {
            final var o = new GetDatabaseInstanceResult();
            o.backupSameRegion = backupSameRegion;
            o.backupScheduleFrequency = backupScheduleFrequency;
            o.backupScheduleRetention = backupScheduleRetention;
            o.certificate = certificate;
            o.disableBackup = disableBackup;
            o.endpointIp = endpointIp;
            o.endpointPort = endpointPort;
            o.engine = engine;
            o.id = id;
            o.instanceId = instanceId;
            o.isHaCluster = isHaCluster;
            o.loadBalancers = loadBalancers;
            o.name = name;
            o.nodeType = nodeType;
            o.organizationId = organizationId;
            o.password = password;
            o.privateNetworks = privateNetworks;
            o.projectId = projectId;
            o.readReplicas = readReplicas;
            o.region = region;
            o.settings = settings;
            o.tags = tags;
            o.userName = userName;
            o.volumeSizeInGb = volumeSizeInGb;
            o.volumeType = volumeType;
            return o;
        }
    }
}
