// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets information about multiple instance servers.
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
//			_, err := scaleway.GetInstanceServers(ctx, &GetInstanceServersArgs{
//				Name: pulumi.StringRef("myserver"),
//				Zone: pulumi.StringRef("fr-par-2"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetInstanceServers(ctx *pulumi.Context, args *GetInstanceServersArgs, opts ...pulumi.InvokeOption) (*GetInstanceServersResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetInstanceServersResult
	err := ctx.Invoke("scaleway:index/getInstanceServers:getInstanceServers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstanceServers.
type GetInstanceServersArgs struct {
	// The server name used as filter. Servers with a name like it are listed.
	Name *string `pulumi:"name"`
	// The ID of the project the server is associated with.
	ProjectId *string `pulumi:"projectId"`
	// List of tags used as filter. Servers with these exact tags are listed.
	Tags []string `pulumi:"tags"`
	// `zone`) The zone in which servers exist.
	Zone *string `pulumi:"zone"`
}

// A collection of values returned by getInstanceServers.
type GetInstanceServersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the server.
	Name *string `pulumi:"name"`
	// The organization ID the server is associated with.
	OrganizationId string `pulumi:"organizationId"`
	// The ID of the project the server is associated with.
	ProjectId string `pulumi:"projectId"`
	// List of found servers
	Servers []GetInstanceServersServer `pulumi:"servers"`
	// The tags associated with the server.
	Tags []string `pulumi:"tags"`
	// The zone in which the server is.
	Zone string `pulumi:"zone"`
}

func GetInstanceServersOutput(ctx *pulumi.Context, args GetInstanceServersOutputArgs, opts ...pulumi.InvokeOption) GetInstanceServersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetInstanceServersResult, error) {
			args := v.(GetInstanceServersArgs)
			r, err := GetInstanceServers(ctx, &args, opts...)
			var s GetInstanceServersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetInstanceServersResultOutput)
}

// A collection of arguments for invoking getInstanceServers.
type GetInstanceServersOutputArgs struct {
	// The server name used as filter. Servers with a name like it are listed.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The ID of the project the server is associated with.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// List of tags used as filter. Servers with these exact tags are listed.
	Tags pulumi.StringArrayInput `pulumi:"tags"`
	// `zone`) The zone in which servers exist.
	Zone pulumi.StringPtrInput `pulumi:"zone"`
}

func (GetInstanceServersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceServersArgs)(nil)).Elem()
}

// A collection of values returned by getInstanceServers.
type GetInstanceServersResultOutput struct{ *pulumi.OutputState }

func (GetInstanceServersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceServersResult)(nil)).Elem()
}

func (o GetInstanceServersResultOutput) ToGetInstanceServersResultOutput() GetInstanceServersResultOutput {
	return o
}

func (o GetInstanceServersResultOutput) ToGetInstanceServersResultOutputWithContext(ctx context.Context) GetInstanceServersResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetInstanceServersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceServersResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the server.
func (o GetInstanceServersResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceServersResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The organization ID the server is associated with.
func (o GetInstanceServersResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceServersResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// The ID of the project the server is associated with.
func (o GetInstanceServersResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceServersResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// List of found servers
func (o GetInstanceServersResultOutput) Servers() GetInstanceServersServerArrayOutput {
	return o.ApplyT(func(v GetInstanceServersResult) []GetInstanceServersServer { return v.Servers }).(GetInstanceServersServerArrayOutput)
}

// The tags associated with the server.
func (o GetInstanceServersResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetInstanceServersResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// The zone in which the server is.
func (o GetInstanceServersResultOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceServersResult) string { return v.Zone }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstanceServersResultOutput{})
}
