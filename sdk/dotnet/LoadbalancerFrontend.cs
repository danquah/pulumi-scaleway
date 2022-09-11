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
    /// <summary>
    /// Creates and manages Scaleway Load-Balancer Frontends. For more information, see [the documentation](https://developers.scaleway.com/en/products/lb/zoned_api).
    /// 
    /// ## Examples Usage
    /// 
    /// ### Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Scaleway = lbrlabs.Scaleway;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var frontend01 = new Scaleway.LoadbalancerFrontend("frontend01", new()
    ///     {
    ///         LbId = scaleway_lb.Lb01.Id,
    ///         BackendId = scaleway_lb_backend.Backend01.Id,
    ///         InboundPort = 80,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Load-Balancer frontend can be imported using the `{zone}/{id}`, e.g. bash
    /// 
    /// ```sh
    ///  $ pulumi import scaleway:index/loadbalancerFrontend:LoadbalancerFrontend frontend01 fr-par-1/11111111-1111-1111-1111-111111111111
    /// ```
    /// </summary>
    [ScalewayResourceType("scaleway:index/loadbalancerFrontend:LoadbalancerFrontend")]
    public partial class LoadbalancerFrontend : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A list of ACL rules to apply to the load-balancer frontend.  Defined below.
        /// </summary>
        [Output("acls")]
        public Output<ImmutableArray<Outputs.LoadbalancerFrontendAcl>> Acls { get; private set; } = null!;

        /// <summary>
        /// The load-balancer backend ID this frontend is attached to.
        /// </summary>
        [Output("backendId")]
        public Output<string> BackendId { get; private set; } = null!;

        /// <summary>
        /// (Deprecated) first certificate ID used by the frontend.
        /// </summary>
        [Output("certificateId")]
        public Output<string> CertificateId { get; private set; } = null!;

        /// <summary>
        /// List of Certificate IDs that should be used by the frontend.
        /// </summary>
        [Output("certificateIds")]
        public Output<ImmutableArray<string>> CertificateIds { get; private set; } = null!;

        /// <summary>
        /// TCP port to listen on the front side.
        /// </summary>
        [Output("inboundPort")]
        public Output<int> InboundPort { get; private set; } = null!;

        /// <summary>
        /// The load-balancer ID this frontend is attached to.
        /// </summary>
        [Output("lbId")]
        public Output<string> LbId { get; private set; } = null!;

        /// <summary>
        /// The ACL name. If not provided it will be randomly generated.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Maximum inactivity time on the client side. (e.g.: `1s`)
        /// </summary>
        [Output("timeoutClient")]
        public Output<string?> TimeoutClient { get; private set; } = null!;


        /// <summary>
        /// Create a LoadbalancerFrontend resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadbalancerFrontend(string name, LoadbalancerFrontendArgs args, CustomResourceOptions? options = null)
            : base("scaleway:index/loadbalancerFrontend:LoadbalancerFrontend", name, args ?? new LoadbalancerFrontendArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoadbalancerFrontend(string name, Input<string> id, LoadbalancerFrontendState? state = null, CustomResourceOptions? options = null)
            : base("scaleway:index/loadbalancerFrontend:LoadbalancerFrontend", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LoadbalancerFrontend resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadbalancerFrontend Get(string name, Input<string> id, LoadbalancerFrontendState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadbalancerFrontend(name, id, state, options);
        }
    }

    public sealed class LoadbalancerFrontendArgs : global::Pulumi.ResourceArgs
    {
        [Input("acls")]
        private InputList<Inputs.LoadbalancerFrontendAclArgs>? _acls;

        /// <summary>
        /// A list of ACL rules to apply to the load-balancer frontend.  Defined below.
        /// </summary>
        public InputList<Inputs.LoadbalancerFrontendAclArgs> Acls
        {
            get => _acls ?? (_acls = new InputList<Inputs.LoadbalancerFrontendAclArgs>());
            set => _acls = value;
        }

        /// <summary>
        /// The load-balancer backend ID this frontend is attached to.
        /// </summary>
        [Input("backendId", required: true)]
        public Input<string> BackendId { get; set; } = null!;

        [Input("certificateIds")]
        private InputList<string>? _certificateIds;

        /// <summary>
        /// List of Certificate IDs that should be used by the frontend.
        /// </summary>
        public InputList<string> CertificateIds
        {
            get => _certificateIds ?? (_certificateIds = new InputList<string>());
            set => _certificateIds = value;
        }

        /// <summary>
        /// TCP port to listen on the front side.
        /// </summary>
        [Input("inboundPort", required: true)]
        public Input<int> InboundPort { get; set; } = null!;

        /// <summary>
        /// The load-balancer ID this frontend is attached to.
        /// </summary>
        [Input("lbId", required: true)]
        public Input<string> LbId { get; set; } = null!;

        /// <summary>
        /// The ACL name. If not provided it will be randomly generated.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Maximum inactivity time on the client side. (e.g.: `1s`)
        /// </summary>
        [Input("timeoutClient")]
        public Input<string>? TimeoutClient { get; set; }

        public LoadbalancerFrontendArgs()
        {
        }
        public static new LoadbalancerFrontendArgs Empty => new LoadbalancerFrontendArgs();
    }

    public sealed class LoadbalancerFrontendState : global::Pulumi.ResourceArgs
    {
        [Input("acls")]
        private InputList<Inputs.LoadbalancerFrontendAclGetArgs>? _acls;

        /// <summary>
        /// A list of ACL rules to apply to the load-balancer frontend.  Defined below.
        /// </summary>
        public InputList<Inputs.LoadbalancerFrontendAclGetArgs> Acls
        {
            get => _acls ?? (_acls = new InputList<Inputs.LoadbalancerFrontendAclGetArgs>());
            set => _acls = value;
        }

        /// <summary>
        /// The load-balancer backend ID this frontend is attached to.
        /// </summary>
        [Input("backendId")]
        public Input<string>? BackendId { get; set; }

        /// <summary>
        /// (Deprecated) first certificate ID used by the frontend.
        /// </summary>
        [Input("certificateId")]
        public Input<string>? CertificateId { get; set; }

        [Input("certificateIds")]
        private InputList<string>? _certificateIds;

        /// <summary>
        /// List of Certificate IDs that should be used by the frontend.
        /// </summary>
        public InputList<string> CertificateIds
        {
            get => _certificateIds ?? (_certificateIds = new InputList<string>());
            set => _certificateIds = value;
        }

        /// <summary>
        /// TCP port to listen on the front side.
        /// </summary>
        [Input("inboundPort")]
        public Input<int>? InboundPort { get; set; }

        /// <summary>
        /// The load-balancer ID this frontend is attached to.
        /// </summary>
        [Input("lbId")]
        public Input<string>? LbId { get; set; }

        /// <summary>
        /// The ACL name. If not provided it will be randomly generated.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Maximum inactivity time on the client side. (e.g.: `1s`)
        /// </summary>
        [Input("timeoutClient")]
        public Input<string>? TimeoutClient { get; set; }

        public LoadbalancerFrontendState()
        {
        }
        public static new LoadbalancerFrontendState Empty => new LoadbalancerFrontendState();
    }
}
