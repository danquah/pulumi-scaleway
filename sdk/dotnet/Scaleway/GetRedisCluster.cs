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
    public static class GetRedisCluster
    {
        /// <summary>
        /// Gets information about a Redis cluster.
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
        ///     var myCluster = Scaleway.GetRedisCluster.Invoke(new()
        ///     {
        ///         ClusterId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRedisClusterResult> InvokeAsync(GetRedisClusterArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRedisClusterResult>("scaleway:index/getRedisCluster:getRedisCluster", args ?? new GetRedisClusterArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about a Redis cluster.
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
        ///     var myCluster = Scaleway.GetRedisCluster.Invoke(new()
        ///     {
        ///         ClusterId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetRedisClusterResult> Invoke(GetRedisClusterInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRedisClusterResult>("scaleway:index/getRedisCluster:getRedisCluster", args ?? new GetRedisClusterInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRedisClusterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Redis cluster ID.
        /// Only one of the `name` and `cluster_id` should be specified.
        /// </summary>
        [Input("clusterId")]
        public string? ClusterId { get; set; }

        /// <summary>
        /// The name of the Redis cluster.
        /// Only one of the `name` and `cluster_id` should be specified.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// `region`) The zone in which the server exists.
        /// </summary>
        [Input("zone")]
        public string? Zone { get; set; }

        public GetRedisClusterArgs()
        {
        }
        public static new GetRedisClusterArgs Empty => new GetRedisClusterArgs();
    }

    public sealed class GetRedisClusterInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Redis cluster ID.
        /// Only one of the `name` and `cluster_id` should be specified.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The name of the Redis cluster.
        /// Only one of the `name` and `cluster_id` should be specified.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `region`) The zone in which the server exists.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public GetRedisClusterInvokeArgs()
        {
        }
        public static new GetRedisClusterInvokeArgs Empty => new GetRedisClusterInvokeArgs();
    }


    [OutputType]
    public sealed class GetRedisClusterResult
    {
        public readonly ImmutableArray<Outputs.GetRedisClusterAclResult> Acls;
        public readonly string Certificate;
        public readonly string? ClusterId;
        public readonly int ClusterSize;
        public readonly string CreatedAt;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Name;
        public readonly string NodeType;
        public readonly string Password;
        public readonly ImmutableArray<Outputs.GetRedisClusterPrivateNetworkResult> PrivateNetworks;
        public readonly string ProjectId;
        public readonly ImmutableArray<Outputs.GetRedisClusterPublicNetworkResult> PublicNetworks;
        public readonly ImmutableDictionary<string, string> Settings;
        public readonly ImmutableArray<string> Tags;
        public readonly bool TlsEnabled;
        public readonly string UpdatedAt;
        public readonly string UserName;
        public readonly string Version;
        public readonly string? Zone;

        [OutputConstructor]
        private GetRedisClusterResult(
            ImmutableArray<Outputs.GetRedisClusterAclResult> acls,

            string certificate,

            string? clusterId,

            int clusterSize,

            string createdAt,

            string id,

            string? name,

            string nodeType,

            string password,

            ImmutableArray<Outputs.GetRedisClusterPrivateNetworkResult> privateNetworks,

            string projectId,

            ImmutableArray<Outputs.GetRedisClusterPublicNetworkResult> publicNetworks,

            ImmutableDictionary<string, string> settings,

            ImmutableArray<string> tags,

            bool tlsEnabled,

            string updatedAt,

            string userName,

            string version,

            string? zone)
        {
            Acls = acls;
            Certificate = certificate;
            ClusterId = clusterId;
            ClusterSize = clusterSize;
            CreatedAt = createdAt;
            Id = id;
            Name = name;
            NodeType = nodeType;
            Password = password;
            PrivateNetworks = privateNetworks;
            ProjectId = projectId;
            PublicNetworks = publicNetworks;
            Settings = settings;
            Tags = tags;
            TlsEnabled = tlsEnabled;
            UpdatedAt = updatedAt;
            UserName = userName;
            Version = version;
            Zone = zone;
        }
    }
}
