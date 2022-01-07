// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scaleway.Inputs
{

    public sealed class KubernetesNodePoolUpgradePolicyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum number of nodes to be created during the upgrade
        /// </summary>
        [Input("maxSurge")]
        public Input<int>? MaxSurge { get; set; }

        /// <summary>
        /// The maximum number of nodes that can be not ready at the same time
        /// </summary>
        [Input("maxUnavailable")]
        public Input<int>? MaxUnavailable { get; set; }

        public KubernetesNodePoolUpgradePolicyArgs()
        {
        }
    }
}
