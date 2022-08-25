// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistryImageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryImageArgs Empty = new GetRegistryImageArgs();

    /**
     * The image ID.
     * Only one of `name` and `image_id` should be specified.
     * 
     */
    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    /**
     * @return The image ID.
     * Only one of `name` and `image_id` should be specified.
     * 
     */
    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    /**
     * The image name.
     * Only one of `name` and `image_id` should be specified.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The image name.
     * Only one of `name` and `image_id` should be specified.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The namespace ID in which the image is.
     * 
     */
    @Import(name="namespaceId")
    private @Nullable Output<String> namespaceId;

    /**
     * @return The namespace ID in which the image is.
     * 
     */
    public Optional<Output<String>> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    /**
     * `project_id`) The ID of the project the image is associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the image is associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * `region`) The region in which the image exists.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return `region`) The region in which the image exists.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The tags associated with the registry image
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The tags associated with the registry image
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetRegistryImageArgs() {}

    private GetRegistryImageArgs(GetRegistryImageArgs $) {
        this.imageId = $.imageId;
        this.name = $.name;
        this.namespaceId = $.namespaceId;
        this.projectId = $.projectId;
        this.region = $.region;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryImageArgs $;

        public Builder() {
            $ = new GetRegistryImageArgs();
        }

        public Builder(GetRegistryImageArgs defaults) {
            $ = new GetRegistryImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageId The image ID.
         * Only one of `name` and `image_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder imageId(@Nullable Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The image ID.
         * Only one of `name` and `image_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param name The image name.
         * Only one of `name` and `image_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The image name.
         * Only one of `name` and `image_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceId The namespace ID in which the image is.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId The namespace ID in which the image is.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        /**
         * @param projectId `project_id`) The ID of the project the image is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the image is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region `region`) The region in which the image exists.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region `region`) The region in which the image exists.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param tags The tags associated with the registry image
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags associated with the registry image
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags associated with the registry image
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public GetRegistryImageArgs build() {
            return $;
        }
    }

}
