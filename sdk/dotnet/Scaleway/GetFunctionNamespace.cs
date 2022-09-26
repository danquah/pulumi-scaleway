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
    public static class GetFunctionNamespace
    {
        /// <summary>
        /// Gets information about a function namespace.
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
        ///     var myNamespace = Scaleway.GetFunctionNamespace.Invoke(new()
        ///     {
        ///         NamespaceId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetFunctionNamespaceResult> InvokeAsync(GetFunctionNamespaceArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFunctionNamespaceResult>("scaleway:index/getFunctionNamespace:getFunctionNamespace", args ?? new GetFunctionNamespaceArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about a function namespace.
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
        ///     var myNamespace = Scaleway.GetFunctionNamespace.Invoke(new()
        ///     {
        ///         NamespaceId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetFunctionNamespaceResult> Invoke(GetFunctionNamespaceInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFunctionNamespaceResult>("scaleway:index/getFunctionNamespace:getFunctionNamespace", args ?? new GetFunctionNamespaceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFunctionNamespaceArgs : global::Pulumi.InvokeArgs
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

        public GetFunctionNamespaceArgs()
        {
        }
        public static new GetFunctionNamespaceArgs Empty => new GetFunctionNamespaceArgs();
    }

    public sealed class GetFunctionNamespaceInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetFunctionNamespaceInvokeArgs()
        {
        }
        public static new GetFunctionNamespaceInvokeArgs Empty => new GetFunctionNamespaceInvokeArgs();
    }


    [OutputType]
    public sealed class GetFunctionNamespaceResult
    {
        /// <summary>
        /// The description of the namespace.
        /// </summary>
        public readonly string Description;
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
        private GetFunctionNamespaceResult(
            string description,

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
