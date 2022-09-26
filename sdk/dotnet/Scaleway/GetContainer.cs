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
    public static class GetContainer
    {
        /// <summary>
        /// Gets information about the Scaleway Container.
        /// 
        /// For more information consult the [documentation](https://www.scaleway.com/en/docs/faq/serverless-containers/).
        /// 
        /// For more details about the limitation check [containers-limitations](https://www.scaleway.com/en/docs/compute/containers/reference-content/containers-limitations/).
        /// 
        /// You can check also our [containers guide](https://www.scaleway.com/en/docs/compute/containers/concepts/).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Scaleway = Lbrlabs.PulumiPackage.Scaleway;
        /// using Scaleway = Pulumi.Scaleway;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var mainContainerNamespace = new Scaleway.ContainerNamespace("mainContainerNamespace");
        /// 
        ///     var mainContainer = new Scaleway.Container("mainContainer", new()
        ///     {
        ///         NamespaceId = mainContainerNamespace.Id,
        ///     });
        /// 
        ///     var byName = Scaleway.GetContainer.Invoke(new()
        ///     {
        ///         NamespaceId = mainContainerNamespace.Id,
        ///         Name = mainContainer.Name,
        ///     });
        /// 
        ///     var byId = Scaleway.GetContainer.Invoke(new()
        ///     {
        ///         NamespaceId = mainContainerNamespace.Id,
        ///         ContainerId = mainContainer.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetContainerResult> InvokeAsync(GetContainerArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetContainerResult>("scaleway:index/getContainer:getContainer", args ?? new GetContainerArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about the Scaleway Container.
        /// 
        /// For more information consult the [documentation](https://www.scaleway.com/en/docs/faq/serverless-containers/).
        /// 
        /// For more details about the limitation check [containers-limitations](https://www.scaleway.com/en/docs/compute/containers/reference-content/containers-limitations/).
        /// 
        /// You can check also our [containers guide](https://www.scaleway.com/en/docs/compute/containers/concepts/).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Scaleway = Lbrlabs.PulumiPackage.Scaleway;
        /// using Scaleway = Pulumi.Scaleway;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var mainContainerNamespace = new Scaleway.ContainerNamespace("mainContainerNamespace");
        /// 
        ///     var mainContainer = new Scaleway.Container("mainContainer", new()
        ///     {
        ///         NamespaceId = mainContainerNamespace.Id,
        ///     });
        /// 
        ///     var byName = Scaleway.GetContainer.Invoke(new()
        ///     {
        ///         NamespaceId = mainContainerNamespace.Id,
        ///         Name = mainContainer.Name,
        ///     });
        /// 
        ///     var byId = Scaleway.GetContainer.Invoke(new()
        ///     {
        ///         NamespaceId = mainContainerNamespace.Id,
        ///         ContainerId = mainContainer.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetContainerResult> Invoke(GetContainerInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetContainerResult>("scaleway:index/getContainer:getContainer", args ?? new GetContainerInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetContainerArgs : global::Pulumi.InvokeArgs
    {
        [Input("containerId")]
        public string? ContainerId { get; set; }

        /// <summary>
        /// The unique name of the container name.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The container namespace ID of the container.
        /// </summary>
        [Input("namespaceId", required: true)]
        public string NamespaceId { get; set; } = null!;

        /// <summary>
        /// (Defaults to provider `region`) The region in which the container was created.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        public GetContainerArgs()
        {
        }
        public static new GetContainerArgs Empty => new GetContainerArgs();
    }

    public sealed class GetContainerInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("containerId")]
        public Input<string>? ContainerId { get; set; }

        /// <summary>
        /// The unique name of the container name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The container namespace ID of the container.
        /// </summary>
        [Input("namespaceId", required: true)]
        public Input<string> NamespaceId { get; set; } = null!;

        /// <summary>
        /// (Defaults to provider `region`) The region in which the container was created.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetContainerInvokeArgs()
        {
        }
        public static new GetContainerInvokeArgs Empty => new GetContainerInvokeArgs();
    }


    [OutputType]
    public sealed class GetContainerResult
    {
        public readonly string? ContainerId;
        /// <summary>
        /// The amount of vCPU computing resources to allocate to each container. Defaults  to 70.
        /// </summary>
        public readonly int CpuLimit;
        /// <summary>
        /// The cron status of the container.
        /// </summary>
        public readonly string CronStatus;
        /// <summary>
        /// Boolean indicating whether the container is on a production environment.
        /// </summary>
        public readonly bool Deploy;
        public readonly string Description;
        /// <summary>
        /// The container domain name.
        /// </summary>
        public readonly string DomainName;
        /// <summary>
        /// The [environment](https://www.scaleway.com/en/docs/compute/containers/concepts/#environment-variables) variables of the container.
        /// </summary>
        public readonly ImmutableDictionary<string, string> EnvironmentVariables;
        /// <summary>
        /// The error message of the container.
        /// </summary>
        public readonly string ErrorMessage;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The maximum number of simultaneous requests your container can handle at the same time. Defaults to 50.
        /// </summary>
        public readonly int MaxConcurrency;
        /// <summary>
        /// The maximum of number of instances this container can scale to. Default to 20.
        /// </summary>
        public readonly int MaxScale;
        /// <summary>
        /// The memory computing resources in MB to allocate to each container. Defaults to 128.
        /// </summary>
        public readonly int MemoryLimit;
        /// <summary>
        /// The minimum of running container instances continuously. Defaults to 0.
        /// </summary>
        public readonly int MinScale;
        public readonly string? Name;
        public readonly string NamespaceId;
        /// <summary>
        /// The port to expose the container. Defaults to 8080.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// The privacy type define the way to authenticate to your container. Please check our dedicated [section](https://developers.scaleway.com/en/products/containers/api/#protocol-9dd4c8).
        /// </summary>
        public readonly string Privacy;
        /// <summary>
        /// The communication [protocol](https://developers.scaleway.com/en/products/containers/api/#protocol-9dd4c8) http1 or h2c. Defaults to http1.
        /// </summary>
        public readonly string Protocol;
        /// <summary>
        /// (Defaults to provider `region`) The region in which the container was created.
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// The registry image address. e.g: **"rg.fr-par.scw.cloud/$NAMESPACE/$IMAGE"**.
        /// </summary>
        public readonly string RegistryImage;
        /// <summary>
        /// The sha256 of your source registry image, changing it will re-apply the deployment. Can be any string.
        /// </summary>
        public readonly string RegistrySha256;
        /// <summary>
        /// The container status.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The maximum amount of time in seconds during which your container can process a request before we stop it. Defaults to 300s.
        /// </summary>
        public readonly int Timeout;

        [OutputConstructor]
        private GetContainerResult(
            string? containerId,

            int cpuLimit,

            string cronStatus,

            bool deploy,

            string description,

            string domainName,

            ImmutableDictionary<string, string> environmentVariables,

            string errorMessage,

            string id,

            int maxConcurrency,

            int maxScale,

            int memoryLimit,

            int minScale,

            string? name,

            string namespaceId,

            int port,

            string privacy,

            string protocol,

            string? region,

            string registryImage,

            string registrySha256,

            string status,

            int timeout)
        {
            ContainerId = containerId;
            CpuLimit = cpuLimit;
            CronStatus = cronStatus;
            Deploy = deploy;
            Description = description;
            DomainName = domainName;
            EnvironmentVariables = environmentVariables;
            ErrorMessage = errorMessage;
            Id = id;
            MaxConcurrency = maxConcurrency;
            MaxScale = maxScale;
            MemoryLimit = memoryLimit;
            MinScale = minScale;
            Name = name;
            NamespaceId = namespaceId;
            Port = port;
            Privacy = privacy;
            Protocol = protocol;
            Region = region;
            RegistryImage = registryImage;
            RegistrySha256 = registrySha256;
            Status = status;
            Timeout = timeout;
        }
    }
}
