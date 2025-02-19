// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.InstanceImageAdditionalVolumeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceImageState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceImageState Empty = new InstanceImageState();

    /**
     * List of IDs of the snapshots of the additional volumes to be attached to the image.
     * 
     */
    @Import(name="additionalVolumeIds")
    private @Nullable Output<String> additionalVolumeIds;

    /**
     * @return List of IDs of the snapshots of the additional volumes to be attached to the image.
     * 
     */
    public Optional<Output<String>> additionalVolumeIds() {
        return Optional.ofNullable(this.additionalVolumeIds);
    }

    /**
     * The description of the extra volumes attached to the image.
     * 
     */
    @Import(name="additionalVolumes")
    private @Nullable Output<List<InstanceImageAdditionalVolumeArgs>> additionalVolumes;

    /**
     * @return The description of the extra volumes attached to the image.
     * 
     */
    public Optional<Output<List<InstanceImageAdditionalVolumeArgs>>> additionalVolumes() {
        return Optional.ofNullable(this.additionalVolumes);
    }

    /**
     * The architecture the image is compatible with. Possible values are: `x86_64` or `arm`.
     * 
     */
    @Import(name="architecture")
    private @Nullable Output<String> architecture;

    /**
     * @return The architecture the image is compatible with. Possible values are: `x86_64` or `arm`.
     * 
     */
    public Optional<Output<String>> architecture() {
        return Optional.ofNullable(this.architecture);
    }

    /**
     * Date of the volume creation.
     * 
     */
    @Import(name="creationDate")
    private @Nullable Output<String> creationDate;

    /**
     * @return Date of the volume creation.
     * 
     */
    public Optional<Output<String>> creationDate() {
        return Optional.ofNullable(this.creationDate);
    }

    /**
     * ID of the server the image is based on (in case it is a backup).
     * 
     */
    @Import(name="fromServerId")
    private @Nullable Output<String> fromServerId;

    /**
     * @return ID of the server the image is based on (in case it is a backup).
     * 
     */
    public Optional<Output<String>> fromServerId() {
        return Optional.ofNullable(this.fromServerId);
    }

    /**
     * Date of volume latest update.
     * 
     */
    @Import(name="modificationDate")
    private @Nullable Output<String> modificationDate;

    /**
     * @return Date of volume latest update.
     * 
     */
    public Optional<Output<String>> modificationDate() {
        return Optional.ofNullable(this.modificationDate);
    }

    /**
     * The name of the image. If not provided it will be randomly generated.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the image. If not provided it will be randomly generated.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The organization ID the image is associated with.
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return The organization ID the image is associated with.
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * The ID of the project the image is associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The ID of the project the image is associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Set to `true` if the image is public.
     * 
     */
    @Import(name="public")
    private @Nullable Output<Boolean> public_;

    /**
     * @return Set to `true` if the image is public.
     * 
     */
    public Optional<Output<Boolean>> public_() {
        return Optional.ofNullable(this.public_);
    }

    /**
     * The ID of the snapshot of the volume to be used as root in the image.
     * 
     */
    @Import(name="rootVolumeId")
    private @Nullable Output<String> rootVolumeId;

    /**
     * @return The ID of the snapshot of the volume to be used as root in the image.
     * 
     */
    public Optional<Output<String>> rootVolumeId() {
        return Optional.ofNullable(this.rootVolumeId);
    }

    /**
     * State of the volume.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return State of the volume.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * A list of tags to apply to the image.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tags to apply to the image.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The zone in which the image should be created.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The zone in which the image should be created.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstanceImageState() {}

    private InstanceImageState(InstanceImageState $) {
        this.additionalVolumeIds = $.additionalVolumeIds;
        this.additionalVolumes = $.additionalVolumes;
        this.architecture = $.architecture;
        this.creationDate = $.creationDate;
        this.fromServerId = $.fromServerId;
        this.modificationDate = $.modificationDate;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.projectId = $.projectId;
        this.public_ = $.public_;
        this.rootVolumeId = $.rootVolumeId;
        this.state = $.state;
        this.tags = $.tags;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceImageState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceImageState $;

        public Builder() {
            $ = new InstanceImageState();
        }

        public Builder(InstanceImageState defaults) {
            $ = new InstanceImageState(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalVolumeIds List of IDs of the snapshots of the additional volumes to be attached to the image.
         * 
         * @return builder
         * 
         */
        public Builder additionalVolumeIds(@Nullable Output<String> additionalVolumeIds) {
            $.additionalVolumeIds = additionalVolumeIds;
            return this;
        }

        /**
         * @param additionalVolumeIds List of IDs of the snapshots of the additional volumes to be attached to the image.
         * 
         * @return builder
         * 
         */
        public Builder additionalVolumeIds(String additionalVolumeIds) {
            return additionalVolumeIds(Output.of(additionalVolumeIds));
        }

        /**
         * @param additionalVolumes The description of the extra volumes attached to the image.
         * 
         * @return builder
         * 
         */
        public Builder additionalVolumes(@Nullable Output<List<InstanceImageAdditionalVolumeArgs>> additionalVolumes) {
            $.additionalVolumes = additionalVolumes;
            return this;
        }

        /**
         * @param additionalVolumes The description of the extra volumes attached to the image.
         * 
         * @return builder
         * 
         */
        public Builder additionalVolumes(List<InstanceImageAdditionalVolumeArgs> additionalVolumes) {
            return additionalVolumes(Output.of(additionalVolumes));
        }

        /**
         * @param additionalVolumes The description of the extra volumes attached to the image.
         * 
         * @return builder
         * 
         */
        public Builder additionalVolumes(InstanceImageAdditionalVolumeArgs... additionalVolumes) {
            return additionalVolumes(List.of(additionalVolumes));
        }

        /**
         * @param architecture The architecture the image is compatible with. Possible values are: `x86_64` or `arm`.
         * 
         * @return builder
         * 
         */
        public Builder architecture(@Nullable Output<String> architecture) {
            $.architecture = architecture;
            return this;
        }

        /**
         * @param architecture The architecture the image is compatible with. Possible values are: `x86_64` or `arm`.
         * 
         * @return builder
         * 
         */
        public Builder architecture(String architecture) {
            return architecture(Output.of(architecture));
        }

        /**
         * @param creationDate Date of the volume creation.
         * 
         * @return builder
         * 
         */
        public Builder creationDate(@Nullable Output<String> creationDate) {
            $.creationDate = creationDate;
            return this;
        }

        /**
         * @param creationDate Date of the volume creation.
         * 
         * @return builder
         * 
         */
        public Builder creationDate(String creationDate) {
            return creationDate(Output.of(creationDate));
        }

        /**
         * @param fromServerId ID of the server the image is based on (in case it is a backup).
         * 
         * @return builder
         * 
         */
        public Builder fromServerId(@Nullable Output<String> fromServerId) {
            $.fromServerId = fromServerId;
            return this;
        }

        /**
         * @param fromServerId ID of the server the image is based on (in case it is a backup).
         * 
         * @return builder
         * 
         */
        public Builder fromServerId(String fromServerId) {
            return fromServerId(Output.of(fromServerId));
        }

        /**
         * @param modificationDate Date of volume latest update.
         * 
         * @return builder
         * 
         */
        public Builder modificationDate(@Nullable Output<String> modificationDate) {
            $.modificationDate = modificationDate;
            return this;
        }

        /**
         * @param modificationDate Date of volume latest update.
         * 
         * @return builder
         * 
         */
        public Builder modificationDate(String modificationDate) {
            return modificationDate(Output.of(modificationDate));
        }

        /**
         * @param name The name of the image. If not provided it will be randomly generated.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the image. If not provided it will be randomly generated.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationId The organization ID the image is associated with.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The organization ID the image is associated with.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param projectId The ID of the project the image is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The ID of the project the image is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param public_ Set to `true` if the image is public.
         * 
         * @return builder
         * 
         */
        public Builder public_(@Nullable Output<Boolean> public_) {
            $.public_ = public_;
            return this;
        }

        /**
         * @param public_ Set to `true` if the image is public.
         * 
         * @return builder
         * 
         */
        public Builder public_(Boolean public_) {
            return public_(Output.of(public_));
        }

        /**
         * @param rootVolumeId The ID of the snapshot of the volume to be used as root in the image.
         * 
         * @return builder
         * 
         */
        public Builder rootVolumeId(@Nullable Output<String> rootVolumeId) {
            $.rootVolumeId = rootVolumeId;
            return this;
        }

        /**
         * @param rootVolumeId The ID of the snapshot of the volume to be used as root in the image.
         * 
         * @return builder
         * 
         */
        public Builder rootVolumeId(String rootVolumeId) {
            return rootVolumeId(Output.of(rootVolumeId));
        }

        /**
         * @param state State of the volume.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State of the volume.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags A list of tags to apply to the image.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags to apply to the image.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags to apply to the image.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param zone The zone in which the image should be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The zone in which the image should be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstanceImageState build() {
            return $;
        }
    }

}
