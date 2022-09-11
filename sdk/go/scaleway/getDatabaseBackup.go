// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets information about an RDB backup.
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
//			_, err := scaleway.LookupDatabaseBackup(ctx, &GetDatabaseBackupArgs{
//				Name: pulumi.StringRef("mybackup"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.LookupDatabaseBackup(ctx, &GetDatabaseBackupArgs{
//				InstanceId: pulumi.StringRef("11111111-1111-1111-1111-111111111111"),
//				Name:       pulumi.StringRef("mybackup"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.LookupDatabaseBackup(ctx, &GetDatabaseBackupArgs{
//				BackupId: pulumi.StringRef("11111111-1111-1111-1111-111111111111"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupDatabaseBackup(ctx *pulumi.Context, args *LookupDatabaseBackupArgs, opts ...pulumi.InvokeOption) (*LookupDatabaseBackupResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupDatabaseBackupResult
	err := ctx.Invoke("scaleway:index/getDatabaseBackup:getDatabaseBackup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabaseBackup.
type LookupDatabaseBackupArgs struct {
	// The RDB backup ID.
	// Only one of the `name` and `backupId` should be specified.
	BackupId *string `pulumi:"backupId"`
	// The RDB instance ID.
	InstanceId *string `pulumi:"instanceId"`
	// The name of the RDB instance.
	// Only one of the `name` and `backupId` should be specified.
	Name   *string `pulumi:"name"`
	Region *string `pulumi:"region"`
}

// A collection of values returned by getDatabaseBackup.
type LookupDatabaseBackupResult struct {
	BackupId     *string `pulumi:"backupId"`
	CreatedAt    string  `pulumi:"createdAt"`
	DatabaseName string  `pulumi:"databaseName"`
	ExpiresAt    string  `pulumi:"expiresAt"`
	// The provider-assigned unique ID for this managed resource.
	Id           string  `pulumi:"id"`
	InstanceId   *string `pulumi:"instanceId"`
	InstanceName string  `pulumi:"instanceName"`
	Name         *string `pulumi:"name"`
	Region       *string `pulumi:"region"`
	Size         int     `pulumi:"size"`
	UpdatedAt    string  `pulumi:"updatedAt"`
}

func LookupDatabaseBackupOutput(ctx *pulumi.Context, args LookupDatabaseBackupOutputArgs, opts ...pulumi.InvokeOption) LookupDatabaseBackupResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDatabaseBackupResult, error) {
			args := v.(LookupDatabaseBackupArgs)
			r, err := LookupDatabaseBackup(ctx, &args, opts...)
			var s LookupDatabaseBackupResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDatabaseBackupResultOutput)
}

// A collection of arguments for invoking getDatabaseBackup.
type LookupDatabaseBackupOutputArgs struct {
	// The RDB backup ID.
	// Only one of the `name` and `backupId` should be specified.
	BackupId pulumi.StringPtrInput `pulumi:"backupId"`
	// The RDB instance ID.
	InstanceId pulumi.StringPtrInput `pulumi:"instanceId"`
	// The name of the RDB instance.
	// Only one of the `name` and `backupId` should be specified.
	Name   pulumi.StringPtrInput `pulumi:"name"`
	Region pulumi.StringPtrInput `pulumi:"region"`
}

func (LookupDatabaseBackupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseBackupArgs)(nil)).Elem()
}

// A collection of values returned by getDatabaseBackup.
type LookupDatabaseBackupResultOutput struct{ *pulumi.OutputState }

func (LookupDatabaseBackupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseBackupResult)(nil)).Elem()
}

func (o LookupDatabaseBackupResultOutput) ToLookupDatabaseBackupResultOutput() LookupDatabaseBackupResultOutput {
	return o
}

func (o LookupDatabaseBackupResultOutput) ToLookupDatabaseBackupResultOutputWithContext(ctx context.Context) LookupDatabaseBackupResultOutput {
	return o
}

func (o LookupDatabaseBackupResultOutput) BackupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDatabaseBackupResult) *string { return v.BackupId }).(pulumi.StringPtrOutput)
}

func (o LookupDatabaseBackupResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseBackupResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

func (o LookupDatabaseBackupResultOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseBackupResult) string { return v.DatabaseName }).(pulumi.StringOutput)
}

func (o LookupDatabaseBackupResultOutput) ExpiresAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseBackupResult) string { return v.ExpiresAt }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDatabaseBackupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseBackupResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupDatabaseBackupResultOutput) InstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDatabaseBackupResult) *string { return v.InstanceId }).(pulumi.StringPtrOutput)
}

func (o LookupDatabaseBackupResultOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseBackupResult) string { return v.InstanceName }).(pulumi.StringOutput)
}

func (o LookupDatabaseBackupResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDatabaseBackupResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o LookupDatabaseBackupResultOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDatabaseBackupResult) *string { return v.Region }).(pulumi.StringPtrOutput)
}

func (o LookupDatabaseBackupResultOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatabaseBackupResult) int { return v.Size }).(pulumi.IntOutput)
}

func (o LookupDatabaseBackupResultOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseBackupResult) string { return v.UpdatedAt }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDatabaseBackupResultOutput{})
}
