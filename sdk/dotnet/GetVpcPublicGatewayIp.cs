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
    public static class GetVpcPublicGatewayIp
    {
        /// <summary>
        /// Gets information about a public gateway IP.
        /// 
        /// For further information please check the API [documentation](https://developers.scaleway.com/en/products/vpc-gw/api/v1/#get-66f0c0)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Scaleway = Pulumi.Scaleway;
        /// using Scaleway = lbrlabs.Scaleway;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var main = new Scaleway.VpcPublicGatewayIp("main");
        /// 
        ///     var ipById = Scaleway.GetVpcPublicGatewayIp.Invoke(new()
        ///     {
        ///         IpId = main.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVpcPublicGatewayIpResult> InvokeAsync(GetVpcPublicGatewayIpArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetVpcPublicGatewayIpResult>("scaleway:index/getVpcPublicGatewayIp:getVpcPublicGatewayIp", args ?? new GetVpcPublicGatewayIpArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about a public gateway IP.
        /// 
        /// For further information please check the API [documentation](https://developers.scaleway.com/en/products/vpc-gw/api/v1/#get-66f0c0)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Scaleway = Pulumi.Scaleway;
        /// using Scaleway = lbrlabs.Scaleway;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var main = new Scaleway.VpcPublicGatewayIp("main");
        /// 
        ///     var ipById = Scaleway.GetVpcPublicGatewayIp.Invoke(new()
        ///     {
        ///         IpId = main.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVpcPublicGatewayIpResult> Invoke(GetVpcPublicGatewayIpInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetVpcPublicGatewayIpResult>("scaleway:index/getVpcPublicGatewayIp:getVpcPublicGatewayIp", args ?? new GetVpcPublicGatewayIpInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVpcPublicGatewayIpArgs : global::Pulumi.InvokeArgs
    {
        [Input("ipId")]
        public string? IpId { get; set; }

        public GetVpcPublicGatewayIpArgs()
        {
        }
        public static new GetVpcPublicGatewayIpArgs Empty => new GetVpcPublicGatewayIpArgs();
    }

    public sealed class GetVpcPublicGatewayIpInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ipId")]
        public Input<string>? IpId { get; set; }

        public GetVpcPublicGatewayIpInvokeArgs()
        {
        }
        public static new GetVpcPublicGatewayIpInvokeArgs Empty => new GetVpcPublicGatewayIpInvokeArgs();
    }


    [OutputType]
    public sealed class GetVpcPublicGatewayIpResult
    {
        public readonly string Address;
        public readonly string CreatedAt;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? IpId;
        public readonly string OrganizationId;
        public readonly string ProjectId;
        public readonly string Reverse;
        public readonly ImmutableArray<string> Tags;
        public readonly string UpdatedAt;
        public readonly string Zone;

        [OutputConstructor]
        private GetVpcPublicGatewayIpResult(
            string address,

            string createdAt,

            string id,

            string? ipId,

            string organizationId,

            string projectId,

            string reverse,

            ImmutableArray<string> tags,

            string updatedAt,

            string zone)
        {
            Address = address;
            CreatedAt = createdAt;
            Id = id;
            IpId = ipId;
            OrganizationId = organizationId;
            ProjectId = projectId;
            Reverse = reverse;
            Tags = tags;
            UpdatedAt = updatedAt;
            Zone = zone;
        }
    }
}
