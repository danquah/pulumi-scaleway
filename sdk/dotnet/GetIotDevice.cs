// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace lbrlabs.Scaleway
{
    public static class GetIotDevice
    {
        /// <summary>
        /// Gets information about an IOT Device.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Scaleway = Pulumi.Scaleway;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myDevice = Scaleway.GetIotDevice.Invoke(new()
        ///     {
        ///         DeviceId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetIotDeviceResult> InvokeAsync(GetIotDeviceArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetIotDeviceResult>("scaleway:index/getIotDevice:getIotDevice", args ?? new GetIotDeviceArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about an IOT Device.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Scaleway = Pulumi.Scaleway;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myDevice = Scaleway.GetIotDevice.Invoke(new()
        ///     {
        ///         DeviceId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetIotDeviceResult> Invoke(GetIotDeviceInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetIotDeviceResult>("scaleway:index/getIotDevice:getIotDevice", args ?? new GetIotDeviceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIotDeviceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The device ID.
        /// Only one of the `name` and `device_id` should be specified.
        /// </summary>
        [Input("deviceId")]
        public string? DeviceId { get; set; }

        /// <summary>
        /// The hub ID.
        /// </summary>
        [Input("hubId")]
        public string? HubId { get; set; }

        /// <summary>
        /// The name of the Hub.
        /// Only one of the `name` and `device_id` should be specified.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// `region`) The region in which the hub exists.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        public GetIotDeviceArgs()
        {
        }
        public static new GetIotDeviceArgs Empty => new GetIotDeviceArgs();
    }

    public sealed class GetIotDeviceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The device ID.
        /// Only one of the `name` and `device_id` should be specified.
        /// </summary>
        [Input("deviceId")]
        public Input<string>? DeviceId { get; set; }

        /// <summary>
        /// The hub ID.
        /// </summary>
        [Input("hubId")]
        public Input<string>? HubId { get; set; }

        /// <summary>
        /// The name of the Hub.
        /// Only one of the `name` and `device_id` should be specified.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `region`) The region in which the hub exists.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetIotDeviceInvokeArgs()
        {
        }
        public static new GetIotDeviceInvokeArgs Empty => new GetIotDeviceInvokeArgs();
    }


    [OutputType]
    public sealed class GetIotDeviceResult
    {
        public readonly bool AllowInsecure;
        public readonly bool AllowMultipleConnections;
        public readonly ImmutableArray<Outputs.GetIotDeviceCertificateResult> Certificates;
        public readonly string CreatedAt;
        public readonly string Description;
        public readonly string? DeviceId;
        public readonly string HubId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool IsConnected;
        public readonly string LastActivityAt;
        public readonly ImmutableArray<Outputs.GetIotDeviceMessageFilterResult> MessageFilters;
        public readonly string? Name;
        public readonly string? Region;
        public readonly string Status;
        public readonly string UpdatedAt;

        [OutputConstructor]
        private GetIotDeviceResult(
            bool allowInsecure,

            bool allowMultipleConnections,

            ImmutableArray<Outputs.GetIotDeviceCertificateResult> certificates,

            string createdAt,

            string description,

            string? deviceId,

            string hubId,

            string id,

            bool isConnected,

            string lastActivityAt,

            ImmutableArray<Outputs.GetIotDeviceMessageFilterResult> messageFilters,

            string? name,

            string? region,

            string status,

            string updatedAt)
        {
            AllowInsecure = allowInsecure;
            AllowMultipleConnections = allowMultipleConnections;
            Certificates = certificates;
            CreatedAt = createdAt;
            Description = description;
            DeviceId = deviceId;
            HubId = hubId;
            Id = id;
            IsConnected = isConnected;
            LastActivityAt = lastActivityAt;
            MessageFilters = messageFilters;
            Name = name;
            Region = region;
            Status = status;
            UpdatedAt = updatedAt;
        }
    }
}
