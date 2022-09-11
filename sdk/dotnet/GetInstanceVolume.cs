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
    public static class GetInstanceVolume
    {
        /// <summary>
        /// Gets information about an instance volume.
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
        ///     var myVolume = Scaleway.GetInstanceVolume.Invoke(new()
        ///     {
        ///         VolumeId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetInstanceVolumeResult> InvokeAsync(GetInstanceVolumeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetInstanceVolumeResult>("scaleway:index/getInstanceVolume:getInstanceVolume", args ?? new GetInstanceVolumeArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about an instance volume.
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
        ///     var myVolume = Scaleway.GetInstanceVolume.Invoke(new()
        ///     {
        ///         VolumeId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetInstanceVolumeResult> Invoke(GetInstanceVolumeInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetInstanceVolumeResult>("scaleway:index/getInstanceVolume:getInstanceVolume", args ?? new GetInstanceVolumeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceVolumeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The volume name.
        /// Only one of `name` and `volume_id` should be specified.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The volume id.
        /// Only one of `name` and `volume_id` should be specified.
        /// </summary>
        [Input("volumeId")]
        public string? VolumeId { get; set; }

        /// <summary>
        /// `zone`) The zone in which the volume exists.
        /// </summary>
        [Input("zone")]
        public string? Zone { get; set; }

        public GetInstanceVolumeArgs()
        {
        }
        public static new GetInstanceVolumeArgs Empty => new GetInstanceVolumeArgs();
    }

    public sealed class GetInstanceVolumeInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The volume name.
        /// Only one of `name` and `volume_id` should be specified.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The volume id.
        /// Only one of `name` and `volume_id` should be specified.
        /// </summary>
        [Input("volumeId")]
        public Input<string>? VolumeId { get; set; }

        /// <summary>
        /// `zone`) The zone in which the volume exists.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public GetInstanceVolumeInvokeArgs()
        {
        }
        public static new GetInstanceVolumeInvokeArgs Empty => new GetInstanceVolumeInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceVolumeResult
    {
        public readonly string FromSnapshotId;
        public readonly string FromVolumeId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Name;
        /// <summary>
        /// The ID of the organization the volume is associated with.
        /// </summary>
        public readonly string OrganizationId;
        public readonly string ProjectId;
        public readonly string ServerId;
        public readonly int SizeInGb;
        public readonly ImmutableArray<string> Tags;
        public readonly string Type;
        public readonly string? VolumeId;
        public readonly string? Zone;

        [OutputConstructor]
        private GetInstanceVolumeResult(
            string fromSnapshotId,

            string fromVolumeId,

            string id,

            string? name,

            string organizationId,

            string projectId,

            string serverId,

            int sizeInGb,

            ImmutableArray<string> tags,

            string type,

            string? volumeId,

            string? zone)
        {
            FromSnapshotId = fromSnapshotId;
            FromVolumeId = fromVolumeId;
            Id = id;
            Name = name;
            OrganizationId = organizationId;
            ProjectId = projectId;
            ServerId = serverId;
            SizeInGb = sizeInGb;
            Tags = tags;
            Type = type;
            VolumeId = volumeId;
            Zone = zone;
        }
    }
}
