// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace lbrlabs.Scaleway.Outputs
{

    [OutputType]
    public sealed class ObjectBucketLifecycleRule
    {
        public readonly int? AbortIncompleteMultipartUploadDays;
        public readonly bool Enabled;
        public readonly Outputs.ObjectBucketLifecycleRuleExpiration? Expiration;
        /// <summary>
        /// The unique name of the bucket.
        /// </summary>
        public readonly string? Id;
        public readonly string? Prefix;
        /// <summary>
        /// A list of tags (key / value) for the bucket.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Tags;
        public readonly ImmutableArray<Outputs.ObjectBucketLifecycleRuleTransition> Transitions;

        [OutputConstructor]
        private ObjectBucketLifecycleRule(
            int? abortIncompleteMultipartUploadDays,

            bool enabled,

            Outputs.ObjectBucketLifecycleRuleExpiration? expiration,

            string? id,

            string? prefix,

            ImmutableDictionary<string, string>? tags,

            ImmutableArray<Outputs.ObjectBucketLifecycleRuleTransition> transitions)
        {
            AbortIncompleteMultipartUploadDays = abortIncompleteMultipartUploadDays;
            Enabled = enabled;
            Expiration = expiration;
            Id = id;
            Prefix = prefix;
            Tags = tags;
            Transitions = transitions;
        }
    }
}
