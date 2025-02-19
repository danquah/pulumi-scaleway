// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates and manages Scaleway Compute Baremetal servers. For more information, see [the documentation](https://developers.scaleway.com/en/products/baremetal/api).
//
// ## Examples
//
// ### Basic
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
//			main, err := scaleway.LookupAccountSshKey(ctx, &GetAccountSshKeyArgs{
//				Name: pulumi.StringRef("main"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.NewBaremetalServer(ctx, "base", &scaleway.BaremetalServerArgs{
//				Zone:  pulumi.String("fr-par-2"),
//				Offer: pulumi.String("GP-BM1-S"),
//				Os:    pulumi.String("d17d6872-0412-45d9-a198-af82c34d3c5c"),
//				SshKeyIds: pulumi.StringArray{
//					pulumi.String(main.Id),
//				},
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
// Baremetal servers can be imported using the `{zone}/{id}`, e.g. bash
//
// ```sh
//
//	$ pulumi import scaleway:index/baremetalServer:BaremetalServer web fr-par-2/11111111-1111-1111-1111-111111111111
//
// ```
type BaremetalServer struct {
	pulumi.CustomResourceState

	// A description for the server.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The domain of the server.
	Domain pulumi.StringOutput `pulumi:"domain"`
	// The hostname of the server.
	Hostname pulumi.StringPtrOutput `pulumi:"hostname"`
	// (List of) The IPs of the server.
	Ips BaremetalServerIpArrayOutput `pulumi:"ips"`
	// The name of the server.
	Name pulumi.StringOutput `pulumi:"name"`
	// The offer name or UUID of the baremetal server.
	// Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-334154) to find the right offer.
	Offer pulumi.StringOutput `pulumi:"offer"`
	// The ID of the offer.
	OfferId pulumi.StringOutput `pulumi:"offerId"`
	// The organization ID the server is associated with.
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
	// The UUID of the os to install on the server.
	// Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-87598a) to find the right OS ID.
	// > **Important:** Updates to `os` will reinstall the server.
	Os pulumi.StringOutput `pulumi:"os"`
	// The ID of the os.
	OsId pulumi.StringOutput `pulumi:"osId"`
	// `projectId`) The ID of the project the server is associated with.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// List of SSH keys allowed to connect to the server.
	// > **Important:** Updates to `sshKeyIds` will reinstall the server.
	SshKeyIds pulumi.StringArrayOutput `pulumi:"sshKeyIds"`
	// The tags associated with the server.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// `zone`) The zone in which the server should be created.
	Zone pulumi.StringOutput `pulumi:"zone"`
}

// NewBaremetalServer registers a new resource with the given unique name, arguments, and options.
func NewBaremetalServer(ctx *pulumi.Context,
	name string, args *BaremetalServerArgs, opts ...pulumi.ResourceOption) (*BaremetalServer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Offer == nil {
		return nil, errors.New("invalid value for required argument 'Offer'")
	}
	if args.Os == nil {
		return nil, errors.New("invalid value for required argument 'Os'")
	}
	if args.SshKeyIds == nil {
		return nil, errors.New("invalid value for required argument 'SshKeyIds'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource BaremetalServer
	err := ctx.RegisterResource("scaleway:index/baremetalServer:BaremetalServer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBaremetalServer gets an existing BaremetalServer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBaremetalServer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BaremetalServerState, opts ...pulumi.ResourceOption) (*BaremetalServer, error) {
	var resource BaremetalServer
	err := ctx.ReadResource("scaleway:index/baremetalServer:BaremetalServer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BaremetalServer resources.
type baremetalServerState struct {
	// A description for the server.
	Description *string `pulumi:"description"`
	// The domain of the server.
	Domain *string `pulumi:"domain"`
	// The hostname of the server.
	Hostname *string `pulumi:"hostname"`
	// (List of) The IPs of the server.
	Ips []BaremetalServerIp `pulumi:"ips"`
	// The name of the server.
	Name *string `pulumi:"name"`
	// The offer name or UUID of the baremetal server.
	// Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-334154) to find the right offer.
	Offer *string `pulumi:"offer"`
	// The ID of the offer.
	OfferId *string `pulumi:"offerId"`
	// The organization ID the server is associated with.
	OrganizationId *string `pulumi:"organizationId"`
	// The UUID of the os to install on the server.
	// Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-87598a) to find the right OS ID.
	// > **Important:** Updates to `os` will reinstall the server.
	Os *string `pulumi:"os"`
	// The ID of the os.
	OsId *string `pulumi:"osId"`
	// `projectId`) The ID of the project the server is associated with.
	ProjectId *string `pulumi:"projectId"`
	// List of SSH keys allowed to connect to the server.
	// > **Important:** Updates to `sshKeyIds` will reinstall the server.
	SshKeyIds []string `pulumi:"sshKeyIds"`
	// The tags associated with the server.
	Tags []string `pulumi:"tags"`
	// `zone`) The zone in which the server should be created.
	Zone *string `pulumi:"zone"`
}

type BaremetalServerState struct {
	// A description for the server.
	Description pulumi.StringPtrInput
	// The domain of the server.
	Domain pulumi.StringPtrInput
	// The hostname of the server.
	Hostname pulumi.StringPtrInput
	// (List of) The IPs of the server.
	Ips BaremetalServerIpArrayInput
	// The name of the server.
	Name pulumi.StringPtrInput
	// The offer name or UUID of the baremetal server.
	// Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-334154) to find the right offer.
	Offer pulumi.StringPtrInput
	// The ID of the offer.
	OfferId pulumi.StringPtrInput
	// The organization ID the server is associated with.
	OrganizationId pulumi.StringPtrInput
	// The UUID of the os to install on the server.
	// Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-87598a) to find the right OS ID.
	// > **Important:** Updates to `os` will reinstall the server.
	Os pulumi.StringPtrInput
	// The ID of the os.
	OsId pulumi.StringPtrInput
	// `projectId`) The ID of the project the server is associated with.
	ProjectId pulumi.StringPtrInput
	// List of SSH keys allowed to connect to the server.
	// > **Important:** Updates to `sshKeyIds` will reinstall the server.
	SshKeyIds pulumi.StringArrayInput
	// The tags associated with the server.
	Tags pulumi.StringArrayInput
	// `zone`) The zone in which the server should be created.
	Zone pulumi.StringPtrInput
}

func (BaremetalServerState) ElementType() reflect.Type {
	return reflect.TypeOf((*baremetalServerState)(nil)).Elem()
}

type baremetalServerArgs struct {
	// A description for the server.
	Description *string `pulumi:"description"`
	// The hostname of the server.
	Hostname *string `pulumi:"hostname"`
	// The name of the server.
	Name *string `pulumi:"name"`
	// The offer name or UUID of the baremetal server.
	// Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-334154) to find the right offer.
	Offer string `pulumi:"offer"`
	// The UUID of the os to install on the server.
	// Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-87598a) to find the right OS ID.
	// > **Important:** Updates to `os` will reinstall the server.
	Os string `pulumi:"os"`
	// `projectId`) The ID of the project the server is associated with.
	ProjectId *string `pulumi:"projectId"`
	// List of SSH keys allowed to connect to the server.
	// > **Important:** Updates to `sshKeyIds` will reinstall the server.
	SshKeyIds []string `pulumi:"sshKeyIds"`
	// The tags associated with the server.
	Tags []string `pulumi:"tags"`
	// `zone`) The zone in which the server should be created.
	Zone *string `pulumi:"zone"`
}

// The set of arguments for constructing a BaremetalServer resource.
type BaremetalServerArgs struct {
	// A description for the server.
	Description pulumi.StringPtrInput
	// The hostname of the server.
	Hostname pulumi.StringPtrInput
	// The name of the server.
	Name pulumi.StringPtrInput
	// The offer name or UUID of the baremetal server.
	// Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-334154) to find the right offer.
	Offer pulumi.StringInput
	// The UUID of the os to install on the server.
	// Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-87598a) to find the right OS ID.
	// > **Important:** Updates to `os` will reinstall the server.
	Os pulumi.StringInput
	// `projectId`) The ID of the project the server is associated with.
	ProjectId pulumi.StringPtrInput
	// List of SSH keys allowed to connect to the server.
	// > **Important:** Updates to `sshKeyIds` will reinstall the server.
	SshKeyIds pulumi.StringArrayInput
	// The tags associated with the server.
	Tags pulumi.StringArrayInput
	// `zone`) The zone in which the server should be created.
	Zone pulumi.StringPtrInput
}

func (BaremetalServerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*baremetalServerArgs)(nil)).Elem()
}

type BaremetalServerInput interface {
	pulumi.Input

	ToBaremetalServerOutput() BaremetalServerOutput
	ToBaremetalServerOutputWithContext(ctx context.Context) BaremetalServerOutput
}

func (*BaremetalServer) ElementType() reflect.Type {
	return reflect.TypeOf((**BaremetalServer)(nil)).Elem()
}

func (i *BaremetalServer) ToBaremetalServerOutput() BaremetalServerOutput {
	return i.ToBaremetalServerOutputWithContext(context.Background())
}

func (i *BaremetalServer) ToBaremetalServerOutputWithContext(ctx context.Context) BaremetalServerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BaremetalServerOutput)
}

// BaremetalServerArrayInput is an input type that accepts BaremetalServerArray and BaremetalServerArrayOutput values.
// You can construct a concrete instance of `BaremetalServerArrayInput` via:
//
//	BaremetalServerArray{ BaremetalServerArgs{...} }
type BaremetalServerArrayInput interface {
	pulumi.Input

	ToBaremetalServerArrayOutput() BaremetalServerArrayOutput
	ToBaremetalServerArrayOutputWithContext(context.Context) BaremetalServerArrayOutput
}

type BaremetalServerArray []BaremetalServerInput

func (BaremetalServerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BaremetalServer)(nil)).Elem()
}

func (i BaremetalServerArray) ToBaremetalServerArrayOutput() BaremetalServerArrayOutput {
	return i.ToBaremetalServerArrayOutputWithContext(context.Background())
}

func (i BaremetalServerArray) ToBaremetalServerArrayOutputWithContext(ctx context.Context) BaremetalServerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BaremetalServerArrayOutput)
}

// BaremetalServerMapInput is an input type that accepts BaremetalServerMap and BaremetalServerMapOutput values.
// You can construct a concrete instance of `BaremetalServerMapInput` via:
//
//	BaremetalServerMap{ "key": BaremetalServerArgs{...} }
type BaremetalServerMapInput interface {
	pulumi.Input

	ToBaremetalServerMapOutput() BaremetalServerMapOutput
	ToBaremetalServerMapOutputWithContext(context.Context) BaremetalServerMapOutput
}

type BaremetalServerMap map[string]BaremetalServerInput

func (BaremetalServerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BaremetalServer)(nil)).Elem()
}

func (i BaremetalServerMap) ToBaremetalServerMapOutput() BaremetalServerMapOutput {
	return i.ToBaremetalServerMapOutputWithContext(context.Background())
}

func (i BaremetalServerMap) ToBaremetalServerMapOutputWithContext(ctx context.Context) BaremetalServerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BaremetalServerMapOutput)
}

type BaremetalServerOutput struct{ *pulumi.OutputState }

func (BaremetalServerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BaremetalServer)(nil)).Elem()
}

func (o BaremetalServerOutput) ToBaremetalServerOutput() BaremetalServerOutput {
	return o
}

func (o BaremetalServerOutput) ToBaremetalServerOutputWithContext(ctx context.Context) BaremetalServerOutput {
	return o
}

// A description for the server.
func (o BaremetalServerOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BaremetalServer) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The domain of the server.
func (o BaremetalServerOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v *BaremetalServer) pulumi.StringOutput { return v.Domain }).(pulumi.StringOutput)
}

// The hostname of the server.
func (o BaremetalServerOutput) Hostname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BaremetalServer) pulumi.StringPtrOutput { return v.Hostname }).(pulumi.StringPtrOutput)
}

// (List of) The IPs of the server.
func (o BaremetalServerOutput) Ips() BaremetalServerIpArrayOutput {
	return o.ApplyT(func(v *BaremetalServer) BaremetalServerIpArrayOutput { return v.Ips }).(BaremetalServerIpArrayOutput)
}

// The name of the server.
func (o BaremetalServerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *BaremetalServer) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The offer name or UUID of the baremetal server.
// Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-334154) to find the right offer.
func (o BaremetalServerOutput) Offer() pulumi.StringOutput {
	return o.ApplyT(func(v *BaremetalServer) pulumi.StringOutput { return v.Offer }).(pulumi.StringOutput)
}

// The ID of the offer.
func (o BaremetalServerOutput) OfferId() pulumi.StringOutput {
	return o.ApplyT(func(v *BaremetalServer) pulumi.StringOutput { return v.OfferId }).(pulumi.StringOutput)
}

// The organization ID the server is associated with.
func (o BaremetalServerOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *BaremetalServer) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

// The UUID of the os to install on the server.
// Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-87598a) to find the right OS ID.
// > **Important:** Updates to `os` will reinstall the server.
func (o BaremetalServerOutput) Os() pulumi.StringOutput {
	return o.ApplyT(func(v *BaremetalServer) pulumi.StringOutput { return v.Os }).(pulumi.StringOutput)
}

// The ID of the os.
func (o BaremetalServerOutput) OsId() pulumi.StringOutput {
	return o.ApplyT(func(v *BaremetalServer) pulumi.StringOutput { return v.OsId }).(pulumi.StringOutput)
}

// `projectId`) The ID of the project the server is associated with.
func (o BaremetalServerOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *BaremetalServer) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// List of SSH keys allowed to connect to the server.
// > **Important:** Updates to `sshKeyIds` will reinstall the server.
func (o BaremetalServerOutput) SshKeyIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *BaremetalServer) pulumi.StringArrayOutput { return v.SshKeyIds }).(pulumi.StringArrayOutput)
}

// The tags associated with the server.
func (o BaremetalServerOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *BaremetalServer) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// `zone`) The zone in which the server should be created.
func (o BaremetalServerOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v *BaremetalServer) pulumi.StringOutput { return v.Zone }).(pulumi.StringOutput)
}

type BaremetalServerArrayOutput struct{ *pulumi.OutputState }

func (BaremetalServerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BaremetalServer)(nil)).Elem()
}

func (o BaremetalServerArrayOutput) ToBaremetalServerArrayOutput() BaremetalServerArrayOutput {
	return o
}

func (o BaremetalServerArrayOutput) ToBaremetalServerArrayOutputWithContext(ctx context.Context) BaremetalServerArrayOutput {
	return o
}

func (o BaremetalServerArrayOutput) Index(i pulumi.IntInput) BaremetalServerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BaremetalServer {
		return vs[0].([]*BaremetalServer)[vs[1].(int)]
	}).(BaremetalServerOutput)
}

type BaremetalServerMapOutput struct{ *pulumi.OutputState }

func (BaremetalServerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BaremetalServer)(nil)).Elem()
}

func (o BaremetalServerMapOutput) ToBaremetalServerMapOutput() BaremetalServerMapOutput {
	return o
}

func (o BaremetalServerMapOutput) ToBaremetalServerMapOutputWithContext(ctx context.Context) BaremetalServerMapOutput {
	return o
}

func (o BaremetalServerMapOutput) MapIndex(k pulumi.StringInput) BaremetalServerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BaremetalServer {
		return vs[0].(map[string]*BaremetalServer)[vs[1].(string)]
	}).(BaremetalServerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BaremetalServerInput)(nil)).Elem(), &BaremetalServer{})
	pulumi.RegisterInputType(reflect.TypeOf((*BaremetalServerArrayInput)(nil)).Elem(), BaremetalServerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BaremetalServerMapInput)(nil)).Elem(), BaremetalServerMap{})
	pulumi.RegisterOutputType(BaremetalServerOutput{})
	pulumi.RegisterOutputType(BaremetalServerArrayOutput{})
	pulumi.RegisterOutputType(BaremetalServerMapOutput{})
}
