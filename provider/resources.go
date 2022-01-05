// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package scaleway

import (
	"unicode"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/scaleway/terraform-provider-scaleway/scaleway"
)

// all of the token components used below.
const (
	// packages:
	scalewayPkg = "scaleway"
	// modules:
	scalewayMod = "index" // the y module
)

// boolRef returns a reference to the bool argument.
func boolRef(b bool) *bool {
	return &b
}

// scalewayMember manufactures a type token for the Scaleway package and the given module and type.
func scalewayMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(scalewayPkg + ":" + mod + ":" + mem)
}

// scalewayType manufactures a type token for the Scaleway package and the given module and type.
func scalewayType(mod string, typ string) tokens.Type {
	return tokens.Type(scalewayMember(mod, typ))
}

// scalewayDataSource manufactures a standard resource token given a module and resource name.
// It automatically uses the Scaleway package and names the file by simply lower casing the data
// source's first character.
func scalewayDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return scalewayMember(mod+"/"+fn, res)
}

// scalewayResource manufactures a standard resource token given a module and resource name.
// It automatically uses the Scaleway package and names the file by simply lower casing the resource's
// first character.
func scalewayResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return scalewayType(mod+"/"+fn, res)
}

func refProviderLicense(license tfbridge.TFProviderLicense) *tfbridge.TFProviderLicense {
	return &license
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(scaleway.Provider(nil)())
	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                 p,
		Name:              "scaleway",
		Description:       "A Pulumi package for creating and managing scaleway cloud resources.",
		Keywords:          []string{"pulumi", "scaleway"},
		TFProviderLicense: refProviderLicense(tfbridge.MITLicenseType),
		License:           "Apache-2.0",
		Homepage:          "https://leebriggs.co.uk/projects#pulumi-scaleway",
		Repository:        "https://github.com/jaxxstorm/pulumi-scaleway",
		PluginDownloadURL: "https://dl.briggs.work/pulumi/releases/plugins",
		GitHubOrg:         "scaleway", // not in the terraform-providers repo
		Config: map[string]*tfbridge.SchemaInfo{
			"access_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"SCW_ACCESS_KEY"},
				},
			},
			"secret_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"SCW_SECRET_KEY"},
				},
			},
			"project_id": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"SCW_DEFAULT_PROJECT_ID"},
				},
			},
			"region": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"SCW_DEFAULT_REGION"},
				},
			},
			"zone": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"SCW_DEFAULT_ZONE"},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"scaleway_account_ssh_key":               {Tok: scalewayResource(scalewayMod, "AccountSshKey")},
			"scaleway_apple_silicon_server":          {Tok: scalewayResource(scalewayMod, "AppleSliconValleyServer")},
			"scaleway_baremetal_server":              {Tok: scalewayResource(scalewayMod, "BaremetalServer")},
			"scaleway_domain_record":                 {Tok: scalewayResource(scalewayMod, "DomainRecord")},
			"scaleway_instance_ip":                   {Tok: scalewayResource(scalewayMod, "InstanceIP")},
			"scaleway_instance_ip_reverse_dns":       {Tok: scalewayResource(scalewayMod, "InstanceIPReverseDNS")},
			"scaleway_instance_placement_group":      {Tok: scalewayResource(scalewayMod, "InstancePlacementGroup")},
			"scaleway_instance_private_nic":          {Tok: scalewayResource(scalewayMod, "InstancePrivateNIC")},
			"scaleway_instance_security_group":       {Tok: scalewayResource(scalewayMod, "InstanceSecurityGroup")},
			"scaleway_instance_security_group_rules": {Tok: scalewayResource(scalewayMod, "InstanceSecurityGroupRules")},
			"scaleway_instance_server":               {Tok: scalewayResource(scalewayMod, "InstanceServer")},
			"scaleway_instance_snapshot":             {Tok: scalewayResource(scalewayMod, "InstanceSnapshot")},
			"scaleway_instance_volume":               {Tok: scalewayResource(scalewayMod, "InstanceVolume")},
			"scaleway_iot_device":                    {Tok: scalewayResource(scalewayMod, "IOTDevice")},
			"scaleway_iot_hub":                       {Tok: scalewayResource(scalewayMod, "IOTHub")},
			"scaleway_iot_network":                   {Tok: scalewayResource(scalewayMod, "IOTNetwork")},
			"scaleway_iot_route":                     {Tok: scalewayResource(scalewayMod, "IOTRoute")},
			"scaleway_k8s_cluster":                   {Tok: scalewayResource(scalewayMod, "KubernetesCluster")},
			"scaleway_k8s_pool":                      {Tok: scalewayResource(scalewayMod, "KubernetesNodePool")},
			"scaleway_lb":                            {Tok: scalewayResource(scalewayMod, "Loadbalancer")},
			"scaleway_lb_backend":                    {Tok: scalewayResource(scalewayMod, "LoadbalancerBackend")},
			"scaleway_lb_certificate":                {Tok: scalewayResource(scalewayMod, "LoadbalancerCertificate")},
			"scaleway_lb_frontend":                   {Tok: scalewayResource(scalewayMod, "LoadbalancerFrontend")},
			"scaleway_lb_ip":                         {Tok: scalewayResource(scalewayMod, "LoadbalancerIP")},
			"scaleway_lb_route":                      {Tok: scalewayResource(scalewayMod, "Route")},
			"scaleway_object_bucket":                 {Tok: scalewayResource(scalewayMod, "ObjectBucket")},
			"scaleway_rdb_acl":                       {Tok: scalewayResource(scalewayMod, "DatabaseACL")},
			"scaleway_rdb_database":                  {Tok: scalewayResource(scalewayMod, "Database")},
			"scaleway_rdb_instance":                  {Tok: scalewayResource(scalewayMod, "DatabaseInstance")},
			"scaleway_rdb_privilege":                 {Tok: scalewayResource(scalewayMod, "DatabasePrivilege")},
			"scaleway_rdb_user":                      {Tok: scalewayResource(scalewayMod, "DatabaseUser")},
			"scaleway_registry_namespace":            {Tok: scalewayResource(scalewayMod, "RegistryNamespace")},
			"scaleway_vpc_gateway_network":           {Tok: scalewayResource(scalewayMod, "VpcGatewayNetwork")},
			"scaleway_vpc_private_network":           {Tok: scalewayResource(scalewayMod, "VpcPrivateNetwork")},
			"scaleway_vpc_public_gateway":            {Tok: scalewayResource(scalewayMod, "VpcPublicGateway")},
			"scaleway_vpc_public_gateway_dhcp":       {Tok: scalewayResource(scalewayMod, "VpcPublicGatewayDHCP")},
			"scaleway_vpc_public_gateway_ip":         {Tok: scalewayResource(scalewayMod, "VpcPublicGatewayIP")},
			"scaleway_vpc_public_gateway_pat_rule":   {Tok: scalewayResource(scalewayMod, "VpcPublicGatewayPATRule")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"scaleway_account_ssh_key": {Tok: scalewayDataSource(scalewayMod, "getAccountSshKey")},
			"scaleway_baremetal_offer": {
				Tok: scalewayDataSource(scalewayMod, "getBaremetalOffer"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"cpu": {
						MaxItemsOne: boolRef(true),
					},
				},
			},
			"scaleway_domain_record":           {Tok: scalewayDataSource(scalewayMod, "getDomainRecord")},
			"scaleway_instance_image":          {Tok: scalewayDataSource(scalewayMod, "getInstanceImage")},
			"scaleway_instance_ip":             {Tok: scalewayDataSource(scalewayMod, "getInstanceIP")},
			"scaleway_instance_security_group": {Tok: scalewayDataSource(scalewayMod, "getInstanceSecurityGroup")},
			"scaleway_instance_server":         {Tok: scalewayDataSource(scalewayMod, "getInstanceServer")},
			"scaleway_instance_volume":         {Tok: scalewayDataSource(scalewayMod, "getInstanceVolume")},
			"scaleway_k8s_cluster":             {Tok: scalewayDataSource(scalewayMod, "getKubernetesCluster")},
			"scaleway_k8s_pool":                {Tok: scalewayDataSource(scalewayMod, "getKubernetesNodePool")},
			"scaleway_lb":                      {Tok: scalewayDataSource(scalewayMod, "getLoadbalancer")},
			"scaleway_lb_ip":                   {Tok: scalewayDataSource(scalewayMod, "getLoadbalancerIP")},
			"scaleway_marketplace_image":       {Tok: scalewayDataSource(scalewayMod, "getMarketplaceImage")},
			"scaleway_rdb_acl":                 {Tok: scalewayDataSource(scalewayMod, "getDatabaseACL")},
			"scaleway_rdb_database":            {Tok: scalewayDataSource(scalewayMod, "getDatabase")},
			"scaleway_rdb_instance":            {Tok: scalewayDataSource(scalewayMod, "getDatabaseInstance")},
			"scaleway_rdb_privilege":           {Tok: scalewayDataSource(scalewayMod, "getDatabasePrivilege")},
			"scaleway_registry_image":          {Tok: scalewayDataSource(scalewayMod, "getRegistryImage")},
			"scaleway_registry_namespace":      {Tok: scalewayDataSource(scalewayMod, "getRegistryNamespace")},
			"scaleway_vpc_private_network":     {Tok: scalewayDataSource(scalewayMod, "getVpcPrivateNetwork")},
			"scaleway_vpc_public_gateway":      {Tok: scalewayDataSource(scalewayMod, "getVpcPublicGateway")},
			"scaleway_vpc_public_gateway_dhcp": {Tok: scalewayDataSource(scalewayMod, "getVpcPublicGatewayDHCP")},
			"scaleway_vpc_public_gateway_ip":   {Tok: scalewayDataSource(scalewayMod, "getVpcPublicGatewayIP")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			PackageName: "@jaxxstorm/pulumi-scaleway",
			// See the documentation for tfbridge.OverlayInfo for how to lay out this
			// section, or refer to the AWS provider. Delete this section if there are
			// no overlay files.
			//Overlay: &tfbridge.OverlayInfo{},
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
