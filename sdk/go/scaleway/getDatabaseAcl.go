// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets information about the RDB instance network Access Control List.
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
//			_, err := scaleway.LookupDatabaseAcl(ctx, &GetDatabaseAclArgs{
//				InstanceId: "fr-par/11111111-1111-1111-1111-111111111111",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupDatabaseAcl(ctx *pulumi.Context, args *LookupDatabaseAclArgs, opts ...pulumi.InvokeOption) (*LookupDatabaseAclResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupDatabaseAclResult
	err := ctx.Invoke("scaleway:index/getDatabaseAcl:getDatabaseAcl", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabaseAcl.
type LookupDatabaseAclArgs struct {
	// The RDB instance ID.
	InstanceId string `pulumi:"instanceId"`
}

// A collection of values returned by getDatabaseAcl.
type LookupDatabaseAclResult struct {
	// A list of ACLs (structure is described below)
	AclRules []GetDatabaseAclAclRule `pulumi:"aclRules"`
	// The provider-assigned unique ID for this managed resource.
	Id         string `pulumi:"id"`
	InstanceId string `pulumi:"instanceId"`
	Region     string `pulumi:"region"`
}

func LookupDatabaseAclOutput(ctx *pulumi.Context, args LookupDatabaseAclOutputArgs, opts ...pulumi.InvokeOption) LookupDatabaseAclResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDatabaseAclResult, error) {
			args := v.(LookupDatabaseAclArgs)
			r, err := LookupDatabaseAcl(ctx, &args, opts...)
			var s LookupDatabaseAclResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDatabaseAclResultOutput)
}

// A collection of arguments for invoking getDatabaseAcl.
type LookupDatabaseAclOutputArgs struct {
	// The RDB instance ID.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
}

func (LookupDatabaseAclOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseAclArgs)(nil)).Elem()
}

// A collection of values returned by getDatabaseAcl.
type LookupDatabaseAclResultOutput struct{ *pulumi.OutputState }

func (LookupDatabaseAclResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseAclResult)(nil)).Elem()
}

func (o LookupDatabaseAclResultOutput) ToLookupDatabaseAclResultOutput() LookupDatabaseAclResultOutput {
	return o
}

func (o LookupDatabaseAclResultOutput) ToLookupDatabaseAclResultOutputWithContext(ctx context.Context) LookupDatabaseAclResultOutput {
	return o
}

// A list of ACLs (structure is described below)
func (o LookupDatabaseAclResultOutput) AclRules() GetDatabaseAclAclRuleArrayOutput {
	return o.ApplyT(func(v LookupDatabaseAclResult) []GetDatabaseAclAclRule { return v.AclRules }).(GetDatabaseAclAclRuleArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDatabaseAclResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseAclResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupDatabaseAclResultOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseAclResult) string { return v.InstanceId }).(pulumi.StringOutput)
}

func (o LookupDatabaseAclResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseAclResult) string { return v.Region }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDatabaseAclResultOutput{})
}
