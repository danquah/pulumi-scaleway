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
    public sealed class IotDeviceCertificate
    {
        public readonly string? Crt;
        /// <summary>
        /// The private key of the device, in case it is generated by Scaleway.
        /// </summary>
        public readonly string? Key;

        [OutputConstructor]
        private IotDeviceCertificate(
            string? crt,

            string? key)
        {
            Crt = crt;
            Key = key;
        }
    }
}
