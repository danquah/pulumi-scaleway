// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerNamespaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerNamespaceArgs Empty = new ContainerNamespaceArgs();

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
     * . Destroy linked container registry on deletion.
     * 
     */
    @Import(name="destroyRegistry")
    private @Nullable Output<Boolean> destroyRegistry;

    /**
     * @return . Destroy linked container registry on deletion.
     * 
     */
    public Optional<Output<Boolean>> destroyRegistry() {
        return Optional.ofNullable(this.destroyRegistry);
    }

    /**
     * The environment variables of the namespace.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<Map<String,String>> environmentVariables;

    /**
     * @return The environment variables of the namespace.
     * 
     */
    public Optional<Output<Map<String,String>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * The unique name of the container namespace.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique name of the container namespace.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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

    private ContainerNamespaceArgs() {}

    private ContainerNamespaceArgs(ContainerNamespaceArgs $) {
        this.description = $.description;
        this.destroyRegistry = $.destroyRegistry;
        this.environmentVariables = $.environmentVariables;
        this.name = $.name;
        this.projectId = $.projectId;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerNamespaceArgs $;

        public Builder() {
            $ = new ContainerNamespaceArgs();
        }

        public Builder(ContainerNamespaceArgs defaults) {
            $ = new ContainerNamespaceArgs(Objects.requireNonNull(defaults));
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
         * @param destroyRegistry . Destroy linked container registry on deletion.
         * 
         * @return builder
         * 
         */
        public Builder destroyRegistry(@Nullable Output<Boolean> destroyRegistry) {
            $.destroyRegistry = destroyRegistry;
            return this;
        }

        /**
         * @param destroyRegistry . Destroy linked container registry on deletion.
         * 
         * @return builder
         * 
         */
        public Builder destroyRegistry(Boolean destroyRegistry) {
            return destroyRegistry(Output.of(destroyRegistry));
        }

        /**
         * @param environmentVariables The environment variables of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * @param environmentVariables The environment variables of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(Map<String,String> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        /**
         * @param name The unique name of the container namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the container namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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

        public ContainerNamespaceArgs build() {
            return $;
        }
    }

}
