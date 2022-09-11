// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets information about a Load Balancer IP.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-scaleway/sdk/go/scaleway"
//	"github.com/pulumi/pulumi-scaleway/sdk/go/scaleway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := scaleway.LookupLoadbalancerIp(ctx, &GetLoadbalancerIpArgs{
//				IpId: pulumi.StringRef("11111111-1111-1111-1111-111111111111"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupLoadbalancerIp(ctx *pulumi.Context, args *LookupLoadbalancerIpArgs, opts ...pulumi.InvokeOption) (*LookupLoadbalancerIpResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupLoadbalancerIpResult
	err := ctx.Invoke("scaleway:index/getLoadbalancerIp:getLoadbalancerIp", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLoadbalancerIp.
type LookupLoadbalancerIpArgs struct {
	// The IP address.
	// Only one of `ipAddress` and `ipId` should be specified.
	IpAddress *string `pulumi:"ipAddress"`
	// The IP ID.
	// Only one of `ipAddress` and `ipId` should be specified.
	IpId *string `pulumi:"ipId"`
}

// A collection of values returned by getLoadbalancerIp.
type LookupLoadbalancerIpResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id        string  `pulumi:"id"`
	IpAddress *string `pulumi:"ipAddress"`
	IpId      *string `pulumi:"ipId"`
	// The associated load-balancer ID if any
	LbId string `pulumi:"lbId"`
	// (Defaults to provider `organizationId`) The ID of the organization the LB IP is associated with.
	OrganizationId string `pulumi:"organizationId"`
	ProjectId      string `pulumi:"projectId"`
	Region         string `pulumi:"region"`
	// The reverse domain associated with this IP.
	Reverse string `pulumi:"reverse"`
	Zone    string `pulumi:"zone"`
}

func LookupLoadbalancerIpOutput(ctx *pulumi.Context, args LookupLoadbalancerIpOutputArgs, opts ...pulumi.InvokeOption) LookupLoadbalancerIpResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupLoadbalancerIpResult, error) {
			args := v.(LookupLoadbalancerIpArgs)
			r, err := LookupLoadbalancerIp(ctx, &args, opts...)
			var s LookupLoadbalancerIpResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupLoadbalancerIpResultOutput)
}

// A collection of arguments for invoking getLoadbalancerIp.
type LookupLoadbalancerIpOutputArgs struct {
	// The IP address.
	// Only one of `ipAddress` and `ipId` should be specified.
	IpAddress pulumi.StringPtrInput `pulumi:"ipAddress"`
	// The IP ID.
	// Only one of `ipAddress` and `ipId` should be specified.
	IpId pulumi.StringPtrInput `pulumi:"ipId"`
}

func (LookupLoadbalancerIpOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoadbalancerIpArgs)(nil)).Elem()
}

// A collection of values returned by getLoadbalancerIp.
type LookupLoadbalancerIpResultOutput struct{ *pulumi.OutputState }

func (LookupLoadbalancerIpResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLoadbalancerIpResult)(nil)).Elem()
}

func (o LookupLoadbalancerIpResultOutput) ToLookupLoadbalancerIpResultOutput() LookupLoadbalancerIpResultOutput {
	return o
}

func (o LookupLoadbalancerIpResultOutput) ToLookupLoadbalancerIpResultOutputWithContext(ctx context.Context) LookupLoadbalancerIpResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupLoadbalancerIpResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadbalancerIpResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupLoadbalancerIpResultOutput) IpAddress() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupLoadbalancerIpResult) *string { return v.IpAddress }).(pulumi.StringPtrOutput)
}

func (o LookupLoadbalancerIpResultOutput) IpId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupLoadbalancerIpResult) *string { return v.IpId }).(pulumi.StringPtrOutput)
}

// The associated load-balancer ID if any
func (o LookupLoadbalancerIpResultOutput) LbId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadbalancerIpResult) string { return v.LbId }).(pulumi.StringOutput)
}

// (Defaults to provider `organizationId`) The ID of the organization the LB IP is associated with.
func (o LookupLoadbalancerIpResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadbalancerIpResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

func (o LookupLoadbalancerIpResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadbalancerIpResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupLoadbalancerIpResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadbalancerIpResult) string { return v.Region }).(pulumi.StringOutput)
}

// The reverse domain associated with this IP.
func (o LookupLoadbalancerIpResultOutput) Reverse() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadbalancerIpResult) string { return v.Reverse }).(pulumi.StringOutput)
}

func (o LookupLoadbalancerIpResultOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLoadbalancerIpResult) string { return v.Zone }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupLoadbalancerIpResultOutput{})
}
