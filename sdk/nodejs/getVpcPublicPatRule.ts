// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Gets information about a public gateway PAT rule. For further information please check the
 * API [documentation](https://developers.scaleway.com/en/products/vpc-gw/api/v1/#get-8faeea)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@lbrlabs/pulumi-scaleway";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * const pg01 = new scaleway.VpcPublicGateway("pg01", {type: "VPC-GW-S"});
 * const dhcp01 = new scaleway.VpcPublicGatewayDhcp("dhcp01", {subnet: "192.168.1.0/24"});
 * const pn01 = new scaleway.VpcPrivateNetwork("pn01", {});
 * const gn01 = new scaleway.VpcGatewayNetwork("gn01", {
 *     gatewayId: pg01.id,
 *     privateNetworkId: pn01.id,
 *     dhcpId: dhcp01.id,
 *     cleanupDhcp: true,
 *     enableMasquerade: true,
 * }, {
 *     dependsOn: [pn01],
 * });
 * const mainVpcPublicGatewayPatRule = new scaleway.VpcPublicGatewayPatRule("mainVpcPublicGatewayPatRule", {
 *     gatewayId: pg01.id,
 *     privateIp: dhcp01.address,
 *     privatePort: 42,
 *     publicPort: 42,
 *     protocol: "both",
 * }, {
 *     dependsOn: [
 *         gn01,
 *         pn01,
 *     ],
 * });
 * const mainVpcPublicPatRule = scaleway.getVpcPublicPatRuleOutput({
 *     patRuleId: mainVpcPublicGatewayPatRule.id,
 * });
 * ```
 */
export function getVpcPublicPatRule(args: GetVpcPublicPatRuleArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcPublicPatRuleResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("scaleway:index/getVpcPublicPatRule:getVpcPublicPatRule", {
        "patRuleId": args.patRuleId,
        "zone": args.zone,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcPublicPatRule.
 */
export interface GetVpcPublicPatRuleArgs {
    /**
     * The ID of the PAT rule to retrieve
     */
    patRuleId: string;
    /**
     * `zone`) The zone in which
     * the image exists.
     */
    zone?: string;
}

/**
 * A collection of values returned by getVpcPublicPatRule.
 */
export interface GetVpcPublicPatRuleResult {
    readonly createdAt: string;
    /**
     * The ID of the public gateway.
     */
    readonly gatewayId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly organizationId: string;
    readonly patRuleId: string;
    /**
     * The Private IP to forward data to (IP address).
     */
    readonly privateIp: string;
    /**
     * The Private port to translate to.
     */
    readonly privatePort: number;
    /**
     * The Protocol the rule should apply to. Possible values are both, tcp and udp.
     */
    readonly protocol: string;
    /**
     * The Public port to listen on.
     */
    readonly publicPort: number;
    readonly updatedAt: string;
    readonly zone?: string;
}

export function getVpcPublicPatRuleOutput(args: GetVpcPublicPatRuleOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVpcPublicPatRuleResult> {
    return pulumi.output(args).apply(a => getVpcPublicPatRule(a, opts))
}

/**
 * A collection of arguments for invoking getVpcPublicPatRule.
 */
export interface GetVpcPublicPatRuleOutputArgs {
    /**
     * The ID of the PAT rule to retrieve
     */
    patRuleId: pulumi.Input<string>;
    /**
     * `zone`) The zone in which
     * the image exists.
     */
    zone?: pulumi.Input<string>;
}
