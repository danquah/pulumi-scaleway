// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates and manages Scaleway Compute Instance Volumes.
// For more information, see [the documentation](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39).
//
// ## Example
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-scaleway/sdk/go/scaleway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := scaleway.NewInstanceVolume(ctx, "serverVolume", &scaleway.InstanceVolumeArgs{
//				SizeInGb: pulumi.Int(20),
//				Type:     pulumi.String("l_ssd"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// volumes can be imported using the `{zone}/{id}`, e.g. bash
//
// ```sh
//
//	$ pulumi import scaleway:index/instanceVolume:InstanceVolume server_volume fr-par-1/11111111-1111-1111-1111-111111111111
//
// ```
type InstanceVolume struct {
	pulumi.CustomResourceState

	// Create a volume based on a image
	FromSnapshotId pulumi.StringPtrOutput `pulumi:"fromSnapshotId"`
	// If set, the new volume will be copied from this volume. Only one of `sizeInGb`, `fromVolumeId` and `fromSnapshotId` should be specified.
	FromVolumeId pulumi.StringPtrOutput `pulumi:"fromVolumeId"`
	// The name of the volume. If not provided it will be randomly generated.
	Name pulumi.StringOutput `pulumi:"name"`
	// The organization ID the volume is associated with.
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
	// `projectId`) The ID of the project the volume is associated with.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// The id of the associated server.
	ServerId pulumi.StringOutput `pulumi:"serverId"`
	// The size of the volume. Only one of `sizeInGb`, `fromVolumeId` and `fromSnapshotId` should be specified.
	SizeInGb pulumi.IntPtrOutput `pulumi:"sizeInGb"`
	// A list of tags to apply to the volume.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// The type of the volume. The possible values are: `bSsd` (Block SSD), `lSsd` (Local SSD).
	Type pulumi.StringOutput `pulumi:"type"`
	// `zone`) The zone in which the volume should be created.
	Zone pulumi.StringOutput `pulumi:"zone"`
}

// NewInstanceVolume registers a new resource with the given unique name, arguments, and options.
func NewInstanceVolume(ctx *pulumi.Context,
	name string, args *InstanceVolumeArgs, opts ...pulumi.ResourceOption) (*InstanceVolume, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource InstanceVolume
	err := ctx.RegisterResource("scaleway:index/instanceVolume:InstanceVolume", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceVolume gets an existing InstanceVolume resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceVolume(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceVolumeState, opts ...pulumi.ResourceOption) (*InstanceVolume, error) {
	var resource InstanceVolume
	err := ctx.ReadResource("scaleway:index/instanceVolume:InstanceVolume", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceVolume resources.
type instanceVolumeState struct {
	// Create a volume based on a image
	FromSnapshotId *string `pulumi:"fromSnapshotId"`
	// If set, the new volume will be copied from this volume. Only one of `sizeInGb`, `fromVolumeId` and `fromSnapshotId` should be specified.
	FromVolumeId *string `pulumi:"fromVolumeId"`
	// The name of the volume. If not provided it will be randomly generated.
	Name *string `pulumi:"name"`
	// The organization ID the volume is associated with.
	OrganizationId *string `pulumi:"organizationId"`
	// `projectId`) The ID of the project the volume is associated with.
	ProjectId *string `pulumi:"projectId"`
	// The id of the associated server.
	ServerId *string `pulumi:"serverId"`
	// The size of the volume. Only one of `sizeInGb`, `fromVolumeId` and `fromSnapshotId` should be specified.
	SizeInGb *int `pulumi:"sizeInGb"`
	// A list of tags to apply to the volume.
	Tags []string `pulumi:"tags"`
	// The type of the volume. The possible values are: `bSsd` (Block SSD), `lSsd` (Local SSD).
	Type *string `pulumi:"type"`
	// `zone`) The zone in which the volume should be created.
	Zone *string `pulumi:"zone"`
}

type InstanceVolumeState struct {
	// Create a volume based on a image
	FromSnapshotId pulumi.StringPtrInput
	// If set, the new volume will be copied from this volume. Only one of `sizeInGb`, `fromVolumeId` and `fromSnapshotId` should be specified.
	FromVolumeId pulumi.StringPtrInput
	// The name of the volume. If not provided it will be randomly generated.
	Name pulumi.StringPtrInput
	// The organization ID the volume is associated with.
	OrganizationId pulumi.StringPtrInput
	// `projectId`) The ID of the project the volume is associated with.
	ProjectId pulumi.StringPtrInput
	// The id of the associated server.
	ServerId pulumi.StringPtrInput
	// The size of the volume. Only one of `sizeInGb`, `fromVolumeId` and `fromSnapshotId` should be specified.
	SizeInGb pulumi.IntPtrInput
	// A list of tags to apply to the volume.
	Tags pulumi.StringArrayInput
	// The type of the volume. The possible values are: `bSsd` (Block SSD), `lSsd` (Local SSD).
	Type pulumi.StringPtrInput
	// `zone`) The zone in which the volume should be created.
	Zone pulumi.StringPtrInput
}

func (InstanceVolumeState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceVolumeState)(nil)).Elem()
}

type instanceVolumeArgs struct {
	// Create a volume based on a image
	FromSnapshotId *string `pulumi:"fromSnapshotId"`
	// If set, the new volume will be copied from this volume. Only one of `sizeInGb`, `fromVolumeId` and `fromSnapshotId` should be specified.
	FromVolumeId *string `pulumi:"fromVolumeId"`
	// The name of the volume. If not provided it will be randomly generated.
	Name *string `pulumi:"name"`
	// `projectId`) The ID of the project the volume is associated with.
	ProjectId *string `pulumi:"projectId"`
	// The size of the volume. Only one of `sizeInGb`, `fromVolumeId` and `fromSnapshotId` should be specified.
	SizeInGb *int `pulumi:"sizeInGb"`
	// A list of tags to apply to the volume.
	Tags []string `pulumi:"tags"`
	// The type of the volume. The possible values are: `bSsd` (Block SSD), `lSsd` (Local SSD).
	Type string `pulumi:"type"`
	// `zone`) The zone in which the volume should be created.
	Zone *string `pulumi:"zone"`
}

// The set of arguments for constructing a InstanceVolume resource.
type InstanceVolumeArgs struct {
	// Create a volume based on a image
	FromSnapshotId pulumi.StringPtrInput
	// If set, the new volume will be copied from this volume. Only one of `sizeInGb`, `fromVolumeId` and `fromSnapshotId` should be specified.
	FromVolumeId pulumi.StringPtrInput
	// The name of the volume. If not provided it will be randomly generated.
	Name pulumi.StringPtrInput
	// `projectId`) The ID of the project the volume is associated with.
	ProjectId pulumi.StringPtrInput
	// The size of the volume. Only one of `sizeInGb`, `fromVolumeId` and `fromSnapshotId` should be specified.
	SizeInGb pulumi.IntPtrInput
	// A list of tags to apply to the volume.
	Tags pulumi.StringArrayInput
	// The type of the volume. The possible values are: `bSsd` (Block SSD), `lSsd` (Local SSD).
	Type pulumi.StringInput
	// `zone`) The zone in which the volume should be created.
	Zone pulumi.StringPtrInput
}

func (InstanceVolumeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceVolumeArgs)(nil)).Elem()
}

type InstanceVolumeInput interface {
	pulumi.Input

	ToInstanceVolumeOutput() InstanceVolumeOutput
	ToInstanceVolumeOutputWithContext(ctx context.Context) InstanceVolumeOutput
}

func (*InstanceVolume) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceVolume)(nil)).Elem()
}

func (i *InstanceVolume) ToInstanceVolumeOutput() InstanceVolumeOutput {
	return i.ToInstanceVolumeOutputWithContext(context.Background())
}

func (i *InstanceVolume) ToInstanceVolumeOutputWithContext(ctx context.Context) InstanceVolumeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceVolumeOutput)
}

// InstanceVolumeArrayInput is an input type that accepts InstanceVolumeArray and InstanceVolumeArrayOutput values.
// You can construct a concrete instance of `InstanceVolumeArrayInput` via:
//
//	InstanceVolumeArray{ InstanceVolumeArgs{...} }
type InstanceVolumeArrayInput interface {
	pulumi.Input

	ToInstanceVolumeArrayOutput() InstanceVolumeArrayOutput
	ToInstanceVolumeArrayOutputWithContext(context.Context) InstanceVolumeArrayOutput
}

type InstanceVolumeArray []InstanceVolumeInput

func (InstanceVolumeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceVolume)(nil)).Elem()
}

func (i InstanceVolumeArray) ToInstanceVolumeArrayOutput() InstanceVolumeArrayOutput {
	return i.ToInstanceVolumeArrayOutputWithContext(context.Background())
}

func (i InstanceVolumeArray) ToInstanceVolumeArrayOutputWithContext(ctx context.Context) InstanceVolumeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceVolumeArrayOutput)
}

// InstanceVolumeMapInput is an input type that accepts InstanceVolumeMap and InstanceVolumeMapOutput values.
// You can construct a concrete instance of `InstanceVolumeMapInput` via:
//
//	InstanceVolumeMap{ "key": InstanceVolumeArgs{...} }
type InstanceVolumeMapInput interface {
	pulumi.Input

	ToInstanceVolumeMapOutput() InstanceVolumeMapOutput
	ToInstanceVolumeMapOutputWithContext(context.Context) InstanceVolumeMapOutput
}

type InstanceVolumeMap map[string]InstanceVolumeInput

func (InstanceVolumeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceVolume)(nil)).Elem()
}

func (i InstanceVolumeMap) ToInstanceVolumeMapOutput() InstanceVolumeMapOutput {
	return i.ToInstanceVolumeMapOutputWithContext(context.Background())
}

func (i InstanceVolumeMap) ToInstanceVolumeMapOutputWithContext(ctx context.Context) InstanceVolumeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceVolumeMapOutput)
}

type InstanceVolumeOutput struct{ *pulumi.OutputState }

func (InstanceVolumeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceVolume)(nil)).Elem()
}

func (o InstanceVolumeOutput) ToInstanceVolumeOutput() InstanceVolumeOutput {
	return o
}

func (o InstanceVolumeOutput) ToInstanceVolumeOutputWithContext(ctx context.Context) InstanceVolumeOutput {
	return o
}

// Create a volume based on a image
func (o InstanceVolumeOutput) FromSnapshotId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InstanceVolume) pulumi.StringPtrOutput { return v.FromSnapshotId }).(pulumi.StringPtrOutput)
}

// If set, the new volume will be copied from this volume. Only one of `sizeInGb`, `fromVolumeId` and `fromSnapshotId` should be specified.
func (o InstanceVolumeOutput) FromVolumeId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InstanceVolume) pulumi.StringPtrOutput { return v.FromVolumeId }).(pulumi.StringPtrOutput)
}

// The name of the volume. If not provided it will be randomly generated.
func (o InstanceVolumeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceVolume) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The organization ID the volume is associated with.
func (o InstanceVolumeOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceVolume) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

// `projectId`) The ID of the project the volume is associated with.
func (o InstanceVolumeOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceVolume) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// The id of the associated server.
func (o InstanceVolumeOutput) ServerId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceVolume) pulumi.StringOutput { return v.ServerId }).(pulumi.StringOutput)
}

// The size of the volume. Only one of `sizeInGb`, `fromVolumeId` and `fromSnapshotId` should be specified.
func (o InstanceVolumeOutput) SizeInGb() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *InstanceVolume) pulumi.IntPtrOutput { return v.SizeInGb }).(pulumi.IntPtrOutput)
}

// A list of tags to apply to the volume.
func (o InstanceVolumeOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *InstanceVolume) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// The type of the volume. The possible values are: `bSsd` (Block SSD), `lSsd` (Local SSD).
func (o InstanceVolumeOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceVolume) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// `zone`) The zone in which the volume should be created.
func (o InstanceVolumeOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceVolume) pulumi.StringOutput { return v.Zone }).(pulumi.StringOutput)
}

type InstanceVolumeArrayOutput struct{ *pulumi.OutputState }

func (InstanceVolumeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceVolume)(nil)).Elem()
}

func (o InstanceVolumeArrayOutput) ToInstanceVolumeArrayOutput() InstanceVolumeArrayOutput {
	return o
}

func (o InstanceVolumeArrayOutput) ToInstanceVolumeArrayOutputWithContext(ctx context.Context) InstanceVolumeArrayOutput {
	return o
}

func (o InstanceVolumeArrayOutput) Index(i pulumi.IntInput) InstanceVolumeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceVolume {
		return vs[0].([]*InstanceVolume)[vs[1].(int)]
	}).(InstanceVolumeOutput)
}

type InstanceVolumeMapOutput struct{ *pulumi.OutputState }

func (InstanceVolumeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceVolume)(nil)).Elem()
}

func (o InstanceVolumeMapOutput) ToInstanceVolumeMapOutput() InstanceVolumeMapOutput {
	return o
}

func (o InstanceVolumeMapOutput) ToInstanceVolumeMapOutputWithContext(ctx context.Context) InstanceVolumeMapOutput {
	return o
}

func (o InstanceVolumeMapOutput) MapIndex(k pulumi.StringInput) InstanceVolumeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceVolume {
		return vs[0].(map[string]*InstanceVolume)[vs[1].(string)]
	}).(InstanceVolumeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceVolumeInput)(nil)).Elem(), &InstanceVolume{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceVolumeArrayInput)(nil)).Elem(), InstanceVolumeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceVolumeMapInput)(nil)).Elem(), InstanceVolumeMap{})
	pulumi.RegisterOutputType(InstanceVolumeOutput{})
	pulumi.RegisterOutputType(InstanceVolumeArrayOutput{})
	pulumi.RegisterOutputType(InstanceVolumeMapOutput{})
}
