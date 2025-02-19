// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceVolumeResult {
    private String fromSnapshotId;
    private String fromVolumeId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String name;
    /**
     * @return The ID of the organization the volume is associated with.
     * 
     */
    private String organizationId;
    private String projectId;
    private String serverId;
    private Integer sizeInGb;
    private List<String> tags;
    private String type;
    private @Nullable String volumeId;
    private @Nullable String zone;

    private GetInstanceVolumeResult() {}
    public String fromSnapshotId() {
        return this.fromSnapshotId;
    }
    public String fromVolumeId() {
        return this.fromVolumeId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The ID of the organization the volume is associated with.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    public String projectId() {
        return this.projectId;
    }
    public String serverId() {
        return this.serverId;
    }
    public Integer sizeInGb() {
        return this.sizeInGb;
    }
    public List<String> tags() {
        return this.tags;
    }
    public String type() {
        return this.type;
    }
    public Optional<String> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceVolumeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fromSnapshotId;
        private String fromVolumeId;
        private String id;
        private @Nullable String name;
        private String organizationId;
        private String projectId;
        private String serverId;
        private Integer sizeInGb;
        private List<String> tags;
        private String type;
        private @Nullable String volumeId;
        private @Nullable String zone;
        public Builder() {}
        public Builder(GetInstanceVolumeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromSnapshotId = defaults.fromSnapshotId;
    	      this.fromVolumeId = defaults.fromVolumeId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.projectId = defaults.projectId;
    	      this.serverId = defaults.serverId;
    	      this.sizeInGb = defaults.sizeInGb;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.volumeId = defaults.volumeId;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder fromSnapshotId(String fromSnapshotId) {
            this.fromSnapshotId = Objects.requireNonNull(fromSnapshotId);
            return this;
        }
        @CustomType.Setter
        public Builder fromVolumeId(String fromVolumeId) {
            this.fromVolumeId = Objects.requireNonNull(fromVolumeId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder serverId(String serverId) {
            this.serverId = Objects.requireNonNull(serverId);
            return this;
        }
        @CustomType.Setter
        public Builder sizeInGb(Integer sizeInGb) {
            this.sizeInGb = Objects.requireNonNull(sizeInGb);
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
        public Builder volumeId(@Nullable String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }
        public GetInstanceVolumeResult build() {
            final var o = new GetInstanceVolumeResult();
            o.fromSnapshotId = fromSnapshotId;
            o.fromVolumeId = fromVolumeId;
            o.id = id;
            o.name = name;
            o.organizationId = organizationId;
            o.projectId = projectId;
            o.serverId = serverId;
            o.sizeInGb = sizeInGb;
            o.tags = tags;
            o.type = type;
            o.volumeId = volumeId;
            o.zone = zone;
            return o;
        }
    }
}
