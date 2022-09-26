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
    public sealed class IotRouteS3
    {
        public readonly string BucketName;
        public readonly string BucketRegion;
        public readonly string? ObjectPrefix;
        public readonly string Strategy;

        [OutputConstructor]
        private IotRouteS3(
            string bucketName,

            string bucketRegion,

            string? objectPrefix,

            string strategy)
        {
            BucketName = bucketName;
            BucketRegion = bucketRegion;
            ObjectPrefix = objectPrefix;
            Strategy = strategy;
        }
    }
}
