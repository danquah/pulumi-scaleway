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
    public static class GetIotHub
    {
        /// <summary>
        /// Gets information about an IOT Hub.
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
        ///     var myHub = Scaleway.GetIotHub.Invoke(new()
        ///     {
        ///         HubId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetIotHubResult> InvokeAsync(GetIotHubArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetIotHubResult>("scaleway:index/getIotHub:getIotHub", args ?? new GetIotHubArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about an IOT Hub.
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
        ///     var myHub = Scaleway.GetIotHub.Invoke(new()
        ///     {
        ///         HubId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetIotHubResult> Invoke(GetIotHubInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetIotHubResult>("scaleway:index/getIotHub:getIotHub", args ?? new GetIotHubInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIotHubArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Hub ID.
        /// Only one of the `name` and `hub_id` should be specified.
        /// </summary>
        [Input("hubId")]
        public string? HubId { get; set; }

        /// <summary>
        /// The name of the Hub.
        /// Only one of the `name` and `hub_id` should be specified.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// `region`) The region in which the hub exists.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        public GetIotHubArgs()
        {
        }
        public static new GetIotHubArgs Empty => new GetIotHubArgs();
    }

    public sealed class GetIotHubInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Hub ID.
        /// Only one of the `name` and `hub_id` should be specified.
        /// </summary>
        [Input("hubId")]
        public Input<string>? HubId { get; set; }

        /// <summary>
        /// The name of the Hub.
        /// Only one of the `name` and `hub_id` should be specified.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `region`) The region in which the hub exists.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetIotHubInvokeArgs()
        {
        }
        public static new GetIotHubInvokeArgs Empty => new GetIotHubInvokeArgs();
    }


    [OutputType]
    public sealed class GetIotHubResult
    {
        public readonly int ConnectedDeviceCount;
        public readonly string CreatedAt;
        public readonly bool DeviceAutoProvisioning;
        public readonly int DeviceCount;
        public readonly bool DisableEvents;
        public readonly bool Enabled;
        public readonly string Endpoint;
        public readonly string EventsTopicPrefix;
        public readonly string HubCa;
        public readonly string HubCaChallenge;
        public readonly string? HubId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Name;
        public readonly string OrganizationId;
        public readonly string ProductPlan;
        public readonly string ProjectId;
        public readonly string? Region;
        public readonly string Status;
        public readonly string UpdatedAt;

        [OutputConstructor]
        private GetIotHubResult(
            int connectedDeviceCount,

            string createdAt,

            bool deviceAutoProvisioning,

            int deviceCount,

            bool disableEvents,

            bool enabled,

            string endpoint,

            string eventsTopicPrefix,

            string hubCa,

            string hubCaChallenge,

            string? hubId,

            string id,

            string? name,

            string organizationId,

            string productPlan,

            string projectId,

            string? region,

            string status,

            string updatedAt)
        {
            ConnectedDeviceCount = connectedDeviceCount;
            CreatedAt = createdAt;
            DeviceAutoProvisioning = deviceAutoProvisioning;
            DeviceCount = deviceCount;
            DisableEvents = disableEvents;
            Enabled = enabled;
            Endpoint = endpoint;
            EventsTopicPrefix = eventsTopicPrefix;
            HubCa = hubCa;
            HubCaChallenge = hubCaChallenge;
            HubId = hubId;
            Id = id;
            Name = name;
            OrganizationId = organizationId;
            ProductPlan = productPlan;
            ProjectId = projectId;
            Region = region;
            Status = status;
            UpdatedAt = updatedAt;
        }
    }
}
