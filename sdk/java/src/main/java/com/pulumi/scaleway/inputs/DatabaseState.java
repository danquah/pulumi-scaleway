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


public final class DatabaseState extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseState Empty = new DatabaseState();

    /**
     * UUID of the instance where to create the database.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return UUID of the instance where to create the database.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Whether or not the database is managed or not.
     * 
     */
    @Import(name="managed")
    private @Nullable Output<Boolean> managed;

    /**
     * @return Whether or not the database is managed or not.
     * 
     */
    public Optional<Output<Boolean>> managed() {
        return Optional.ofNullable(this.managed);
    }

    /**
     * Name of the database (e.g. `my-new-database`).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the database (e.g. `my-new-database`).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the owner of the database.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return The name of the owner of the database.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * Size of the database (in bytes).
     * 
     */
    @Import(name="size")
    private @Nullable Output<String> size;

    /**
     * @return Size of the database (in bytes).
     * 
     */
    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    private DatabaseState() {}

    private DatabaseState(DatabaseState $) {
        this.instanceId = $.instanceId;
        this.managed = $.managed;
        this.name = $.name;
        this.owner = $.owner;
        this.size = $.size;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseState $;

        public Builder() {
            $ = new DatabaseState();
        }

        public Builder(DatabaseState defaults) {
            $ = new DatabaseState(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceId UUID of the instance where to create the database.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId UUID of the instance where to create the database.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param managed Whether or not the database is managed or not.
         * 
         * @return builder
         * 
         */
        public Builder managed(@Nullable Output<Boolean> managed) {
            $.managed = managed;
            return this;
        }

        /**
         * @param managed Whether or not the database is managed or not.
         * 
         * @return builder
         * 
         */
        public Builder managed(Boolean managed) {
            return managed(Output.of(managed));
        }

        /**
         * @param name Name of the database (e.g. `my-new-database`).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the database (e.g. `my-new-database`).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param owner The name of the owner of the database.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner The name of the owner of the database.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param size Size of the database (in bytes).
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size Size of the database (in bytes).
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Output.of(size));
        }

        public DatabaseState build() {
            return $;
        }
    }

}
