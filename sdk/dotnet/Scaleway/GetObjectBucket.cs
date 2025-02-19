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
    public static class GetObjectBucket
    {
        /// <summary>
        /// Gets information about the Bucket.
        /// For more information, see [the documentation](https://www.scaleway.com/en/docs/object-storage-feature/).
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
        ///     var main = new Scaleway.ObjectBucket("main", new()
        ///     {
        ///         Tags = 
        ///         {
        ///             { "foo", "bar" },
        ///         },
        ///     });
        /// 
        ///     var selected = Scaleway.GetObjectBucket.Invoke(new()
        ///     {
        ///         Name = "bucket.test.com",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetObjectBucketResult> InvokeAsync(GetObjectBucketArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetObjectBucketResult>("scaleway:index/getObjectBucket:getObjectBucket", args ?? new GetObjectBucketArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about the Bucket.
        /// For more information, see [the documentation](https://www.scaleway.com/en/docs/object-storage-feature/).
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
        ///     var main = new Scaleway.ObjectBucket("main", new()
        ///     {
        ///         Tags = 
        ///         {
        ///             { "foo", "bar" },
        ///         },
        ///     });
        /// 
        ///     var selected = Scaleway.GetObjectBucket.Invoke(new()
        ///     {
        ///         Name = "bucket.test.com",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetObjectBucketResult> Invoke(GetObjectBucketInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetObjectBucketResult>("scaleway:index/getObjectBucket:getObjectBucket", args ?? new GetObjectBucketInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetObjectBucketArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The bucket name.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// `region`) The region in which the Object Storage exists.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        public GetObjectBucketArgs()
        {
        }
        public static new GetObjectBucketArgs Empty => new GetObjectBucketArgs();
    }

    public sealed class GetObjectBucketInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The bucket name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `region`) The region in which the Object Storage exists.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetObjectBucketInvokeArgs()
        {
        }
        public static new GetObjectBucketInvokeArgs Empty => new GetObjectBucketInvokeArgs();
    }


    [OutputType]
    public sealed class GetObjectBucketResult
    {
        public readonly string Acl;
        public readonly ImmutableArray<Outputs.GetObjectBucketCorsRuleResult> CorsRules;
        /// <summary>
        /// The endpoint URL of the bucket
        /// </summary>
        public readonly string Endpoint;
        public readonly bool ForceDestroy;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetObjectBucketLifecycleRuleResult> LifecycleRules;
        public readonly string? Name;
        public readonly string? Region;
        public readonly ImmutableDictionary<string, string> Tags;
        public readonly ImmutableArray<Outputs.GetObjectBucketVersioningResult> Versionings;

        [OutputConstructor]
        private GetObjectBucketResult(
            string acl,

            ImmutableArray<Outputs.GetObjectBucketCorsRuleResult> corsRules,

            string endpoint,

            bool forceDestroy,

            string id,

            ImmutableArray<Outputs.GetObjectBucketLifecycleRuleResult> lifecycleRules,

            string? name,

            string? region,

            ImmutableDictionary<string, string> tags,

            ImmutableArray<Outputs.GetObjectBucketVersioningResult> versionings)
        {
            Acl = acl;
            CorsRules = corsRules;
            Endpoint = endpoint;
            ForceDestroy = forceDestroy;
            Id = id;
            LifecycleRules = lifecycleRules;
            Name = name;
            Region = region;
            Tags = tags;
            Versionings = versionings;
        }
    }
}
