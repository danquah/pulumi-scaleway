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
    public sealed class KubernetesNodePoolNode
    {
        /// <summary>
        /// The name for the pool.
        /// &gt; **Important:** Updates to this field will recreate a new resource.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The public IPv4.
        /// </summary>
        public readonly string? PublicIp;
        /// <summary>
        /// The public IPv6.
        /// </summary>
        public readonly string? PublicIpV6;
        /// <summary>
        /// The status of the node.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private KubernetesNodePoolNode(
            string? name,

            string? publicIp,

            string? publicIpV6,

            string? status)
        {
            Name = name;
            PublicIp = publicIp;
            PublicIpV6 = publicIpV6;
            Status = status;
        }
    }
}
