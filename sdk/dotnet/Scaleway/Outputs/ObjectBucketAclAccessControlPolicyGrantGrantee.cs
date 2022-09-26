// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Scaleway.Outputs
{

    [OutputType]
    public sealed class ObjectBucketAclAccessControlPolicyGrantGrantee
    {
        public readonly string? DisplayName;
        /// <summary>
        /// The `region`,`bucket` and `acl` separated by (`/`).
        /// </summary>
        public readonly string Id;
        public readonly string Type;

        [OutputConstructor]
        private ObjectBucketAclAccessControlPolicyGrantGrantee(
            string? displayName,

            string id,

            string type)
        {
            DisplayName = displayName;
            Id = id;
            Type = type;
        }
    }
}
