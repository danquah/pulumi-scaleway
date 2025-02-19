// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Scaleway
{
    public static class GetBaremetalServer
    {
        /// <summary>
        /// Gets information about a baremetal server.
        /// For more information, see [the documentation](https://developers.scaleway.com/en/products/baremetal/api).
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
        ///     var byName = Scaleway.GetBaremetalServer.Invoke(new()
        ///     {
        ///         Name = "foobar",
        ///         Zone = "fr-par-2",
        ///     });
        /// 
        ///     var byId = Scaleway.GetBaremetalServer.Invoke(new()
        ///     {
        ///         ServerId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetBaremetalServerResult> InvokeAsync(GetBaremetalServerArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBaremetalServerResult>("scaleway:index/getBaremetalServer:getBaremetalServer", args ?? new GetBaremetalServerArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about a baremetal server.
        /// For more information, see [the documentation](https://developers.scaleway.com/en/products/baremetal/api).
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
        ///     var byName = Scaleway.GetBaremetalServer.Invoke(new()
        ///     {
        ///         Name = "foobar",
        ///         Zone = "fr-par-2",
        ///     });
        /// 
        ///     var byId = Scaleway.GetBaremetalServer.Invoke(new()
        ///     {
        ///         ServerId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetBaremetalServerResult> Invoke(GetBaremetalServerInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBaremetalServerResult>("scaleway:index/getBaremetalServer:getBaremetalServer", args ?? new GetBaremetalServerInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBaremetalServerArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The server name. Only one of `name` and `server_id` should be specified.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("serverId")]
        public string? ServerId { get; set; }

        /// <summary>
        /// `zone`) The zone in which the server exists.
        /// </summary>
        [Input("zone")]
        public string? Zone { get; set; }

        public GetBaremetalServerArgs()
        {
        }
        public static new GetBaremetalServerArgs Empty => new GetBaremetalServerArgs();
    }

    public sealed class GetBaremetalServerInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The server name. Only one of `name` and `server_id` should be specified.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("serverId")]
        public Input<string>? ServerId { get; set; }

        /// <summary>
        /// `zone`) The zone in which the server exists.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public GetBaremetalServerInvokeArgs()
        {
        }
        public static new GetBaremetalServerInvokeArgs Empty => new GetBaremetalServerInvokeArgs();
    }


    [OutputType]
    public sealed class GetBaremetalServerResult
    {
        public readonly string Description;
        public readonly string Domain;
        public readonly string Hostname;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetBaremetalServerIpResult> Ips;
        public readonly string? Name;
        public readonly string Offer;
        public readonly string OfferId;
        public readonly string OrganizationId;
        public readonly string Os;
        public readonly string OsId;
        public readonly string ProjectId;
        public readonly string? ServerId;
        public readonly ImmutableArray<string> SshKeyIds;
        public readonly ImmutableArray<string> Tags;
        public readonly string? Zone;

        [OutputConstructor]
        private GetBaremetalServerResult(
            string description,

            string domain,

            string hostname,

            string id,

            ImmutableArray<Outputs.GetBaremetalServerIpResult> ips,

            string? name,

            string offer,

            string offerId,

            string organizationId,

            string os,

            string osId,

            string projectId,

            string? serverId,

            ImmutableArray<string> sshKeyIds,

            ImmutableArray<string> tags,

            string? zone)
        {
            Description = description;
            Domain = domain;
            Hostname = hostname;
            Id = id;
            Ips = ips;
            Name = name;
            Offer = offer;
            OfferId = offerId;
            OrganizationId = organizationId;
            Os = os;
            OsId = osId;
            ProjectId = projectId;
            ServerId = serverId;
            SshKeyIds = sshKeyIds;
            Tags = tags;
            Zone = zone;
        }
    }
}
