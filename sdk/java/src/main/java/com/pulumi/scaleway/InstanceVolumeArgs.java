// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceVolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceVolumeArgs Empty = new InstanceVolumeArgs();

    /**
     * Create a volume based on a image
     * 
     */
    @Import(name="fromSnapshotId")
    private @Nullable Output<String> fromSnapshotId;

    /**
     * @return Create a volume based on a image
     * 
     */
    public Optional<Output<String>> fromSnapshotId() {
        return Optional.ofNullable(this.fromSnapshotId);
    }

    /**
     * If set, the new volume will be copied from this volume. Only one of `size_in_gb`, `from_volume_id` and `from_snapshot_id` should be specified.
     * 
     */
    @Import(name="fromVolumeId")
    private @Nullable Output<String> fromVolumeId;

    /**
     * @return If set, the new volume will be copied from this volume. Only one of `size_in_gb`, `from_volume_id` and `from_snapshot_id` should be specified.
     * 
     */
    public Optional<Output<String>> fromVolumeId() {
        return Optional.ofNullable(this.fromVolumeId);
    }

    /**
     * The name of the volume. If not provided it will be randomly generated.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the volume. If not provided it will be randomly generated.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * `project_id`) The ID of the project the volume is associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the volume is associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The size of the volume. Only one of `size_in_gb`, `from_volume_id` and `from_snapshot_id` should be specified.
     * 
     */
    @Import(name="sizeInGb")
    private @Nullable Output<Integer> sizeInGb;

    /**
     * @return The size of the volume. Only one of `size_in_gb`, `from_volume_id` and `from_snapshot_id` should be specified.
     * 
     */
    public Optional<Output<Integer>> sizeInGb() {
        return Optional.ofNullable(this.sizeInGb);
    }

    /**
     * A list of tags to apply to the volume.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tags to apply to the volume.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of the volume. The possible values are: `b_ssd` (Block SSD), `l_ssd` (Local SSD).
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the volume. The possible values are: `b_ssd` (Block SSD), `l_ssd` (Local SSD).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * `zone`) The zone in which the volume should be created.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return `zone`) The zone in which the volume should be created.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstanceVolumeArgs() {}

    private InstanceVolumeArgs(InstanceVolumeArgs $) {
        this.fromSnapshotId = $.fromSnapshotId;
        this.fromVolumeId = $.fromVolumeId;
        this.name = $.name;
        this.projectId = $.projectId;
        this.sizeInGb = $.sizeInGb;
        this.tags = $.tags;
        this.type = $.type;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceVolumeArgs $;

        public Builder() {
            $ = new InstanceVolumeArgs();
        }

        public Builder(InstanceVolumeArgs defaults) {
            $ = new InstanceVolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fromSnapshotId Create a volume based on a image
         * 
         * @return builder
         * 
         */
        public Builder fromSnapshotId(@Nullable Output<String> fromSnapshotId) {
            $.fromSnapshotId = fromSnapshotId;
            return this;
        }

        /**
         * @param fromSnapshotId Create a volume based on a image
         * 
         * @return builder
         * 
         */
        public Builder fromSnapshotId(String fromSnapshotId) {
            return fromSnapshotId(Output.of(fromSnapshotId));
        }

        /**
         * @param fromVolumeId If set, the new volume will be copied from this volume. Only one of `size_in_gb`, `from_volume_id` and `from_snapshot_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder fromVolumeId(@Nullable Output<String> fromVolumeId) {
            $.fromVolumeId = fromVolumeId;
            return this;
        }

        /**
         * @param fromVolumeId If set, the new volume will be copied from this volume. Only one of `size_in_gb`, `from_volume_id` and `from_snapshot_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder fromVolumeId(String fromVolumeId) {
            return fromVolumeId(Output.of(fromVolumeId));
        }

        /**
         * @param name The name of the volume. If not provided it will be randomly generated.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the volume. If not provided it will be randomly generated.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId `project_id`) The ID of the project the volume is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the volume is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param sizeInGb The size of the volume. Only one of `size_in_gb`, `from_volume_id` and `from_snapshot_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder sizeInGb(@Nullable Output<Integer> sizeInGb) {
            $.sizeInGb = sizeInGb;
            return this;
        }

        /**
         * @param sizeInGb The size of the volume. Only one of `size_in_gb`, `from_volume_id` and `from_snapshot_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder sizeInGb(Integer sizeInGb) {
            return sizeInGb(Output.of(sizeInGb));
        }

        /**
         * @param tags A list of tags to apply to the volume.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags to apply to the volume.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags to apply to the volume.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type The type of the volume. The possible values are: `b_ssd` (Block SSD), `l_ssd` (Local SSD).
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the volume. The possible values are: `b_ssd` (Block SSD), `l_ssd` (Local SSD).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param zone `zone`) The zone in which the volume should be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone `zone`) The zone in which the volume should be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstanceVolumeArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
