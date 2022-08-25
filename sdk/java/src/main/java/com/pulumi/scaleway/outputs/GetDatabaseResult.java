// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatabaseResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String instanceId;
    /**
     * @return Whether or not the database is managed or not.
     * 
     */
    private Boolean managed;
    private String name;
    /**
     * @return The name of the owner of the database.
     * 
     */
    private String owner;
    /**
     * @return Size of the database (in bytes).
     * 
     */
    private String size;

    private GetDatabaseResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return Whether or not the database is managed or not.
     * 
     */
    public Boolean managed() {
        return this.managed;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The name of the owner of the database.
     * 
     */
    public String owner() {
        return this.owner;
    }
    /**
     * @return Size of the database (in bytes).
     * 
     */
    public String size() {
        return this.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String instanceId;
        private Boolean managed;
        private String name;
        private String owner;
        private String size;
        public Builder() {}
        public Builder(GetDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.managed = defaults.managed;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.size = defaults.size;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder managed(Boolean managed) {
            this.managed = Objects.requireNonNull(managed);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        @CustomType.Setter
        public Builder size(String size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public GetDatabaseResult build() {
            final var o = new GetDatabaseResult();
            o.id = id;
            o.instanceId = instanceId;
            o.managed = managed;
            o.name = name;
            o.owner = owner;
            o.size = size;
            return o;
        }
    }
}
