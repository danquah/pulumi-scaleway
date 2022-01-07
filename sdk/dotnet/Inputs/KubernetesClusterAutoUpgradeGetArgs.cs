// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scaleway.Inputs
{

    public sealed class KubernetesClusterAutoUpgradeGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set to `true` to enable Kubernetes patch version auto upgrades.
        /// &gt; **Important:** When enabling auto upgrades, the `version` field take a minor version like x.y (ie 1.18).
        /// </summary>
        [Input("enable", required: true)]
        public Input<bool> Enable { get; set; } = null!;

        /// <summary>
        /// The day of the auto upgrade maintenance window (`monday` to `sunday`, or `any`).
        /// </summary>
        [Input("maintenanceWindowDay", required: true)]
        public Input<string> MaintenanceWindowDay { get; set; } = null!;

        /// <summary>
        /// The start hour (UTC) of the 2-hour auto upgrade maintenance window (0 to 23).
        /// </summary>
        [Input("maintenanceWindowStartHour", required: true)]
        public Input<int> MaintenanceWindowStartHour { get; set; } = null!;

        public KubernetesClusterAutoUpgradeGetArgs()
        {
        }
    }
}
