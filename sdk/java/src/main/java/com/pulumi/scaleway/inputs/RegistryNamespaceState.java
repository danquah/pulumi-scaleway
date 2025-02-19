// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryNamespaceState extends com.pulumi.resources.ResourceArgs {

    public static final RegistryNamespaceState Empty = new RegistryNamespaceState();

    /**
     * The description of the namespace.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the namespace.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Endpoint reachable by Docker.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return Endpoint reachable by Docker.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * Whether the images stored in the namespace should be downloadable publicly (docker pull).
     * 
     */
    @Import(name="isPublic")
    private @Nullable Output<Boolean> isPublic;

    /**
     * @return Whether the images stored in the namespace should be downloadable publicly (docker pull).
     * 
     */
    public Optional<Output<Boolean>> isPublic() {
        return Optional.ofNullable(this.isPublic);
    }

    /**
     * The unique name of the namespace.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique name of the namespace.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The organization ID the namespace is associated with.
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return The organization ID the namespace is associated with.
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * `project_id`) The ID of the project the namespace is associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the namespace is associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * `region`). The region in which the namespace should be created.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return `region`). The region in which the namespace should be created.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private RegistryNamespaceState() {}

    private RegistryNamespaceState(RegistryNamespaceState $) {
        this.description = $.description;
        this.endpoint = $.endpoint;
        this.isPublic = $.isPublic;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.projectId = $.projectId;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryNamespaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryNamespaceState $;

        public Builder() {
            $ = new RegistryNamespaceState();
        }

        public Builder(RegistryNamespaceState defaults) {
            $ = new RegistryNamespaceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param endpoint Endpoint reachable by Docker.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint Endpoint reachable by Docker.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param isPublic Whether the images stored in the namespace should be downloadable publicly (docker pull).
         * 
         * @return builder
         * 
         */
        public Builder isPublic(@Nullable Output<Boolean> isPublic) {
            $.isPublic = isPublic;
            return this;
        }

        /**
         * @param isPublic Whether the images stored in the namespace should be downloadable publicly (docker pull).
         * 
         * @return builder
         * 
         */
        public Builder isPublic(Boolean isPublic) {
            return isPublic(Output.of(isPublic));
        }

        /**
         * @param name The unique name of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationId The organization ID the namespace is associated with.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The organization ID the namespace is associated with.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param projectId `project_id`) The ID of the project the namespace is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the namespace is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region `region`). The region in which the namespace should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region `region`). The region in which the namespace should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public RegistryNamespaceState build() {
            return $;
        }
    }

}
