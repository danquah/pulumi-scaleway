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
    public static class GetBaremetalOs
    {
        /// <summary>
        /// Gets information about a baremetal operating system.
        /// For more information, see [the documentation](https://developers.scaleway.com/en/products/baremetal/api).
        /// 
        /// You can also use the [scaleway-cli](https://github.com/scaleway/scaleway-cli) with `scw baremetal os list` to list all available operating systems.
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
        ///     var byName = Scaleway.GetBaremetalOs.Invoke(new()
        ///     {
        ///         Name = "Ubuntu",
        ///         Version = "20.04 LTS (Focal Fossa)",
        ///     });
        /// 
        ///     var byId = Scaleway.GetBaremetalOs.Invoke(new()
        ///     {
        ///         OsId = "03b7f4ba-a6a1-4305-984e-b54fafbf1681",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetBaremetalOsResult> InvokeAsync(GetBaremetalOsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBaremetalOsResult>("scaleway:index/getBaremetalOs:getBaremetalOs", args ?? new GetBaremetalOsArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about a baremetal operating system.
        /// For more information, see [the documentation](https://developers.scaleway.com/en/products/baremetal/api).
        /// 
        /// You can also use the [scaleway-cli](https://github.com/scaleway/scaleway-cli) with `scw baremetal os list` to list all available operating systems.
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
        ///     var byName = Scaleway.GetBaremetalOs.Invoke(new()
        ///     {
        ///         Name = "Ubuntu",
        ///         Version = "20.04 LTS (Focal Fossa)",
        ///     });
        /// 
        ///     var byId = Scaleway.GetBaremetalOs.Invoke(new()
        ///     {
        ///         OsId = "03b7f4ba-a6a1-4305-984e-b54fafbf1681",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetBaremetalOsResult> Invoke(GetBaremetalOsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBaremetalOsResult>("scaleway:index/getBaremetalOs:getBaremetalOs", args ?? new GetBaremetalOsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBaremetalOsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The os name. Only one of `name` and `os_id` should be specified.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The operating system id. Only one of `name` and `os_id` should be specified.
        /// </summary>
        [Input("osId")]
        public string? OsId { get; set; }

        /// <summary>
        /// The os version.
        /// </summary>
        [Input("version")]
        public string? Version { get; set; }

        /// <summary>
        /// `zone`) The zone in which the os exists.
        /// </summary>
        [Input("zone")]
        public string? Zone { get; set; }

        public GetBaremetalOsArgs()
        {
        }
        public static new GetBaremetalOsArgs Empty => new GetBaremetalOsArgs();
    }

    public sealed class GetBaremetalOsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The os name. Only one of `name` and `os_id` should be specified.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The operating system id. Only one of `name` and `os_id` should be specified.
        /// </summary>
        [Input("osId")]
        public Input<string>? OsId { get; set; }

        /// <summary>
        /// The os version.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// `zone`) The zone in which the os exists.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public GetBaremetalOsInvokeArgs()
        {
        }
        public static new GetBaremetalOsInvokeArgs Empty => new GetBaremetalOsInvokeArgs();
    }


    [OutputType]
    public sealed class GetBaremetalOsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Name;
        public readonly string? OsId;
        public readonly string? Version;
        public readonly string Zone;

        [OutputConstructor]
        private GetBaremetalOsResult(
            string id,

            string? name,

            string? osId,

            string? version,

            string zone)
        {
            Id = id;
            Name = name;
            OsId = osId;
            Version = version;
            Zone = zone;
        }
    }
}
