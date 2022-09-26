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
    public static class GetContainerNamespace
    {
        /// <summary>
        /// Gets information about a container namespace.
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
        ///     var byName = Scaleway.GetContainerNamespace.Invoke(new()
        ///     {
        ///         Name = "my-namespace-name",
        ///     });
        /// 
        ///     var byId = Scaleway.GetContainerNamespace.Invoke(new()
        ///     {
        ///         NamespaceId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetContainerNamespaceResult> InvokeAsync(GetContainerNamespaceArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetContainerNamespaceResult>("scaleway:index/getContainerNamespace:getContainerNamespace", args ?? new GetContainerNamespaceArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about a container namespace.
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
        ///     var byName = Scaleway.GetContainerNamespace.Invoke(new()
        ///     {
        ///         Name = "my-namespace-name",
        ///     });
        /// 
        ///     var byId = Scaleway.GetContainerNamespace.Invoke(new()
        ///     {
        ///         NamespaceId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetContainerNamespaceResult> Invoke(GetContainerNamespaceInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetContainerNamespaceResult>("scaleway:index/getContainerNamespace:getContainerNamespace", args ?? new GetContainerNamespaceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetContainerNamespaceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The namespace name.
        /// Only one of `name` and `namespace_id` should be specified.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The namespace id.
        /// Only one of `name` and `namespace_id` should be specified.
        /// </summary>
        [Input("namespaceId")]
        public string? NamespaceId { get; set; }

        /// <summary>
        /// `region`) The region in which the namespace exists.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        public GetContainerNamespaceArgs()
        {
        }
        public static new GetContainerNamespaceArgs Empty => new GetContainerNamespaceArgs();
    }

    public sealed class GetContainerNamespaceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The namespace name.
        /// Only one of `name` and `namespace_id` should be specified.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace id.
        /// Only one of `name` and `namespace_id` should be specified.
        /// </summary>
        [Input("namespaceId")]
        public Input<string>? NamespaceId { get; set; }

        /// <summary>
        /// `region`) The region in which the namespace exists.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetContainerNamespaceInvokeArgs()
        {
        }
        public static new GetContainerNamespaceInvokeArgs Empty => new GetContainerNamespaceInvokeArgs();
    }


    [OutputType]
    public sealed class GetContainerNamespaceResult
    {
        /// <summary>
        /// The description of the namespace.
        /// </summary>
        public readonly string Description;
        public readonly bool DestroyRegistry;
        /// <summary>
        /// The environment variables of the namespace.
        /// </summary>
        public readonly ImmutableDictionary<string, string> EnvironmentVariables;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Name;
        public readonly string? NamespaceId;
        /// <summary>
        /// The organization ID the namespace is associated with.
        /// </summary>
        public readonly string OrganizationId;
        public readonly string ProjectId;
        public readonly string? Region;
        /// <summary>
        /// The registry endpoint of the namespace.
        /// </summary>
        public readonly string RegistryEndpoint;
        /// <summary>
        /// The registry namespace ID of the namespace.
        /// </summary>
        public readonly string RegistryNamespaceId;

        [OutputConstructor]
        private GetContainerNamespaceResult(
            string description,

            bool destroyRegistry,

            ImmutableDictionary<string, string> environmentVariables,

            string id,

            string? name,

            string? namespaceId,

            string organizationId,

            string projectId,

            string? region,

            string registryEndpoint,

            string registryNamespaceId)
        {
            Description = description;
            DestroyRegistry = destroyRegistry;
            EnvironmentVariables = environmentVariables;
            Id = id;
            Name = name;
            NamespaceId = namespaceId;
            OrganizationId = organizationId;
            ProjectId = projectId;
            Region = region;
            RegistryEndpoint = registryEndpoint;
            RegistryNamespaceId = registryNamespaceId;
        }
    }
}
