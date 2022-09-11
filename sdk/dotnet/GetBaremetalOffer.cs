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
    public static class GetBaremetalOffer
    {
        /// <summary>
        /// Gets information about a baremetal offer. For more information, see [the documentation](https://developers.scaleway.com/en/products/baremetal/api).
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
        ///     var myOffer = Scaleway.GetBaremetalOffer.Invoke(new()
        ///     {
        ///         OfferId = "25dcf38b-c90c-4b18-97a2-6956e9d1e113",
        ///         Zone = "fr-par-2",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetBaremetalOfferResult> InvokeAsync(GetBaremetalOfferArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetBaremetalOfferResult>("scaleway:index/getBaremetalOffer:getBaremetalOffer", args ?? new GetBaremetalOfferArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about a baremetal offer. For more information, see [the documentation](https://developers.scaleway.com/en/products/baremetal/api).
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
        ///     var myOffer = Scaleway.GetBaremetalOffer.Invoke(new()
        ///     {
        ///         OfferId = "25dcf38b-c90c-4b18-97a2-6956e9d1e113",
        ///         Zone = "fr-par-2",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetBaremetalOfferResult> Invoke(GetBaremetalOfferInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetBaremetalOfferResult>("scaleway:index/getBaremetalOffer:getBaremetalOffer", args ?? new GetBaremetalOfferInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBaremetalOfferArgs : global::Pulumi.InvokeArgs
    {
        [Input("includeDisabled")]
        public bool? IncludeDisabled { get; set; }

        /// <summary>
        /// The offer name. Only one of `name` and `offer_id` should be specified.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The offer id. Only one of `name` and `offer_id` should be specified.
        /// </summary>
        [Input("offerId")]
        public string? OfferId { get; set; }

        /// <summary>
        /// `zone`) The zone in which the offer should be created.
        /// </summary>
        [Input("zone")]
        public string? Zone { get; set; }

        public GetBaremetalOfferArgs()
        {
        }
        public static new GetBaremetalOfferArgs Empty => new GetBaremetalOfferArgs();
    }

    public sealed class GetBaremetalOfferInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("includeDisabled")]
        public Input<bool>? IncludeDisabled { get; set; }

        /// <summary>
        /// The offer name. Only one of `name` and `offer_id` should be specified.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The offer id. Only one of `name` and `offer_id` should be specified.
        /// </summary>
        [Input("offerId")]
        public Input<string>? OfferId { get; set; }

        /// <summary>
        /// `zone`) The zone in which the offer should be created.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public GetBaremetalOfferInvokeArgs()
        {
        }
        public static new GetBaremetalOfferInvokeArgs Empty => new GetBaremetalOfferInvokeArgs();
    }


    [OutputType]
    public sealed class GetBaremetalOfferResult
    {
        /// <summary>
        /// Available Bandwidth with the offer.
        /// </summary>
        public readonly int Bandwidth;
        /// <summary>
        /// Commercial range of the offer.
        /// </summary>
        public readonly string CommercialRange;
        /// <summary>
        /// A list of cpu specifications. (Structure is documented below.)
        /// </summary>
        public readonly Outputs.GetBaremetalOfferCpuResult Cpu;
        /// <summary>
        /// A list of disk specifications. (Structure is documented below.)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBaremetalOfferDiskResult> Disks;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? IncludeDisabled;
        /// <summary>
        /// A list of memory specifications. (Structure is documented below.)
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBaremetalOfferMemoryResult> Memories;
        /// <summary>
        /// Name of the CPU.
        /// </summary>
        public readonly string? Name;
        public readonly string? OfferId;
        /// <summary>
        /// Stock status for this offer. Possible values are: `empty`, `low` or `available`.
        /// </summary>
        public readonly string Stock;
        public readonly string Zone;

        [OutputConstructor]
        private GetBaremetalOfferResult(
            int bandwidth,

            string commercialRange,

            Outputs.GetBaremetalOfferCpuResult cpu,

            ImmutableArray<Outputs.GetBaremetalOfferDiskResult> disks,

            string id,

            bool? includeDisabled,

            ImmutableArray<Outputs.GetBaremetalOfferMemoryResult> memories,

            string? name,

            string? offerId,

            string stock,

            string zone)
        {
            Bandwidth = bandwidth;
            CommercialRange = commercialRange;
            Cpu = cpu;
            Disks = disks;
            Id = id;
            IncludeDisabled = includeDisabled;
            Memories = memories;
            Name = name;
            OfferId = offerId;
            Stock = stock;
            Zone = zone;
        }
    }
}
