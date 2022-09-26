// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.ObjectBucketAclAccessControlPolicyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectBucketAclState extends com.pulumi.resources.ResourceArgs {

    public static final ObjectBucketAclState Empty = new ObjectBucketAclState();

    /**
     * A configuration block that sets the ACL permissions for an object per grantee documented below.
     * 
     */
    @Import(name="accessControlPolicy")
    private @Nullable Output<ObjectBucketAclAccessControlPolicyArgs> accessControlPolicy;

    /**
     * @return A configuration block that sets the ACL permissions for an object per grantee documented below.
     * 
     */
    public Optional<Output<ObjectBucketAclAccessControlPolicyArgs>> accessControlPolicy() {
        return Optional.ofNullable(this.accessControlPolicy);
    }

    /**
     * The canned ACL you want to apply to the bucket.
     * 
     */
    @Import(name="acl")
    private @Nullable Output<String> acl;

    /**
     * @return The canned ACL you want to apply to the bucket.
     * 
     */
    public Optional<Output<String>> acl() {
        return Optional.ofNullable(this.acl);
    }

    /**
     * The name of the bucket.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * The project ID of the expected bucket owner.
     * 
     */
    @Import(name="expectedBucketOwner")
    private @Nullable Output<String> expectedBucketOwner;

    /**
     * @return The project ID of the expected bucket owner.
     * 
     */
    public Optional<Output<String>> expectedBucketOwner() {
        return Optional.ofNullable(this.expectedBucketOwner);
    }

    /**
     * The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private ObjectBucketAclState() {}

    private ObjectBucketAclState(ObjectBucketAclState $) {
        this.accessControlPolicy = $.accessControlPolicy;
        this.acl = $.acl;
        this.bucket = $.bucket;
        this.expectedBucketOwner = $.expectedBucketOwner;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectBucketAclState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectBucketAclState $;

        public Builder() {
            $ = new ObjectBucketAclState();
        }

        public Builder(ObjectBucketAclState defaults) {
            $ = new ObjectBucketAclState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessControlPolicy A configuration block that sets the ACL permissions for an object per grantee documented below.
         * 
         * @return builder
         * 
         */
        public Builder accessControlPolicy(@Nullable Output<ObjectBucketAclAccessControlPolicyArgs> accessControlPolicy) {
            $.accessControlPolicy = accessControlPolicy;
            return this;
        }

        /**
         * @param accessControlPolicy A configuration block that sets the ACL permissions for an object per grantee documented below.
         * 
         * @return builder
         * 
         */
        public Builder accessControlPolicy(ObjectBucketAclAccessControlPolicyArgs accessControlPolicy) {
            return accessControlPolicy(Output.of(accessControlPolicy));
        }

        /**
         * @param acl The canned ACL you want to apply to the bucket.
         * 
         * @return builder
         * 
         */
        public Builder acl(@Nullable Output<String> acl) {
            $.acl = acl;
            return this;
        }

        /**
         * @param acl The canned ACL you want to apply to the bucket.
         * 
         * @return builder
         * 
         */
        public Builder acl(String acl) {
            return acl(Output.of(acl));
        }

        /**
         * @param bucket The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param expectedBucketOwner The project ID of the expected bucket owner.
         * 
         * @return builder
         * 
         */
        public Builder expectedBucketOwner(@Nullable Output<String> expectedBucketOwner) {
            $.expectedBucketOwner = expectedBucketOwner;
            return this;
        }

        /**
         * @param expectedBucketOwner The project ID of the expected bucket owner.
         * 
         * @return builder
         * 
         */
        public Builder expectedBucketOwner(String expectedBucketOwner) {
            return expectedBucketOwner(Output.of(expectedBucketOwner));
        }

        /**
         * @param region The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public ObjectBucketAclState build() {
            return $;
        }
    }

}
