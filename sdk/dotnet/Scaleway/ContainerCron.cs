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
    /// <summary>
    /// Creates and manages Scaleway Container Triggers. For the moment, the feature is limited to CRON Schedule (time-based).
    /// 
    /// For more information consult
    /// the [documentation](https://www.scaleway.com/en/docs/compute/containers/api-cli/cont-uploading-with-serverless-framework/#configuring-events)
    /// .
    /// 
    /// For more details about the limitation
    /// check [containers-limitations](https://www.scaleway.com/en/docs/compute/containers/reference-content/containers-limitations/)
    /// .
    /// 
    /// You can check also
    /// our [containers cron api documentation](https://developers.scaleway.com/en/products/containers/api/#crons-942bf4).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Scaleway = Lbrlabs.PulumiPackage.Scaleway;
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
    ///     var mainContainerCron = new Scaleway.ContainerCron("mainContainerCron", new()
    ///     {
    ///         ContainerId = mainContainer.Id,
    ///         Schedule = "5 4 1 * *",
    ///         Args = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["address"] = new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["city"] = "Paris",
    ///                 ["country"] = "FR",
    ///             },
    ///             ["age"] = 23,
    ///             ["firstName"] = "John",
    ///             ["isAlive"] = true,
    ///             ["lastName"] = "Smith",
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Container Cron can be imported using the `{region}/{id}`, e.g. bash
    /// 
    /// ```sh
    ///  $ pulumi import scaleway:index/containerCron:ContainerCron main fr-par/11111111-1111-1111-1111-111111111111
    /// ```
    /// </summary>
    [ScalewayResourceType("scaleway:index/containerCron:ContainerCron")]
    public partial class ContainerCron : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The key-value mapping to define arguments that will be passed to your container’s event object
        /// during
        /// </summary>
        [Output("args")]
        public Output<string> Args { get; private set; } = null!;

        /// <summary>
        /// The container ID to link with your cron.
        /// </summary>
        [Output("containerId")]
        public Output<string> ContainerId { get; private set; } = null!;

        /// <summary>
        /// (Defaults to provider `region`) The region
        /// in where the job was created.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Cron format string, e.g. @hourly, as schedule time of its jobs to be created and
        /// executed.
        /// </summary>
        [Output("schedule")]
        public Output<string> Schedule { get; private set; } = null!;

        /// <summary>
        /// The cron status.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a ContainerCron resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ContainerCron(string name, ContainerCronArgs args, CustomResourceOptions? options = null)
            : base("scaleway:index/containerCron:ContainerCron", name, args ?? new ContainerCronArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ContainerCron(string name, Input<string> id, ContainerCronState? state = null, CustomResourceOptions? options = null)
            : base("scaleway:index/containerCron:ContainerCron", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ContainerCron resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ContainerCron Get(string name, Input<string> id, ContainerCronState? state = null, CustomResourceOptions? options = null)
        {
            return new ContainerCron(name, id, state, options);
        }
    }

    public sealed class ContainerCronArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The key-value mapping to define arguments that will be passed to your container’s event object
        /// during
        /// </summary>
        [Input("args", required: true)]
        public Input<string> Args { get; set; } = null!;

        /// <summary>
        /// The container ID to link with your cron.
        /// </summary>
        [Input("containerId", required: true)]
        public Input<string> ContainerId { get; set; } = null!;

        /// <summary>
        /// Cron format string, e.g. @hourly, as schedule time of its jobs to be created and
        /// executed.
        /// </summary>
        [Input("schedule", required: true)]
        public Input<string> Schedule { get; set; } = null!;

        public ContainerCronArgs()
        {
        }
        public static new ContainerCronArgs Empty => new ContainerCronArgs();
    }

    public sealed class ContainerCronState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The key-value mapping to define arguments that will be passed to your container’s event object
        /// during
        /// </summary>
        [Input("args")]
        public Input<string>? Args { get; set; }

        /// <summary>
        /// The container ID to link with your cron.
        /// </summary>
        [Input("containerId")]
        public Input<string>? ContainerId { get; set; }

        /// <summary>
        /// (Defaults to provider `region`) The region
        /// in where the job was created.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Cron format string, e.g. @hourly, as schedule time of its jobs to be created and
        /// executed.
        /// </summary>
        [Input("schedule")]
        public Input<string>? Schedule { get; set; }

        /// <summary>
        /// The cron status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public ContainerCronState()
        {
        }
        public static new ContainerCronState Empty => new ContainerCronState();
    }
}
