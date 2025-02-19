// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Gets information about a Load Balancer.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * // Get info by name
 * const byName = pulumi.output(scaleway.getLoadbalancer({
 *     name: "foobar",
 * }));
 * // Get info by ID
 * const byId = pulumi.output(scaleway.getLoadbalancer({
 *     lbId: "11111111-1111-1111-1111-111111111111",
 * }));
 * ```
 */
export function getLoadbalancer(args?: GetLoadbalancerArgs, opts?: pulumi.InvokeOptions): Promise<GetLoadbalancerResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("scaleway:index/getLoadbalancer:getLoadbalancer", {
        "lbId": args.lbId,
        "name": args.name,
        "releaseIp": args.releaseIp,
        "zone": args.zone,
    }, opts);
}

/**
 * A collection of arguments for invoking getLoadbalancer.
 */
export interface GetLoadbalancerArgs {
    lbId?: string;
    /**
     * The IP address.
     */
    name?: string;
    releaseIp?: boolean;
    /**
     * (Defaults to provider `region`) The region in which the LB exists.
     */
    zone?: string;
}

/**
 * A collection of values returned by getLoadbalancer.
 */
export interface GetLoadbalancerResult {
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The load-balancer public IP Address.
     */
    readonly ipAddress: string;
    readonly ipId: string;
    readonly lbId?: string;
    readonly name?: string;
    readonly organizationId: string;
    readonly privateNetworks: outputs.GetLoadbalancerPrivateNetwork[];
    /**
     * (Defaults to provider `projectId`) The ID of the project the LB is associated with.
     */
    readonly projectId: string;
    readonly region: string;
    readonly releaseIp?: boolean;
    readonly sslCompatibilityLevel: string;
    /**
     * The tags associated with the load-balancers.
     */
    readonly tags: string[];
    /**
     * The type of the load-balancer.
     */
    readonly type: string;
    /**
     * (Defaults to provider `region`) The region in which the LB exists.
     */
    readonly zone?: string;
}

export function getLoadbalancerOutput(args?: GetLoadbalancerOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLoadbalancerResult> {
    return pulumi.output(args).apply(a => getLoadbalancer(a, opts))
}

/**
 * A collection of arguments for invoking getLoadbalancer.
 */
export interface GetLoadbalancerOutputArgs {
    lbId?: pulumi.Input<string>;
    /**
     * The IP address.
     */
    name?: pulumi.Input<string>;
    releaseIp?: pulumi.Input<boolean>;
    /**
     * (Defaults to provider `region`) The region in which the LB exists.
     */
    zone?: pulumi.Input<string>;
}
