// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Gets information about a RDB instance.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * // Get info by instance ID
 * const myInstance = pulumi.output(scaleway.getDatabaseInstance({
 *     instanceId: "11111111-1111-1111-1111-111111111111",
 * }));
 * ```
 */
export function getDatabaseInstance(args?: GetDatabaseInstanceArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseInstanceResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("scaleway:index/getDatabaseInstance:getDatabaseInstance", {
        "instanceId": args.instanceId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabaseInstance.
 */
export interface GetDatabaseInstanceArgs {
    /**
     * The RDB instance ID.
     * Only one of `name` and `instanceId` should be specified.
     */
    instanceId?: string;
    /**
     * The name of the RDB instance.
     * Only one of `name` and `instanceId` should be specified.
     */
    name?: string;
}

/**
 * A collection of values returned by getDatabaseInstance.
 */
export interface GetDatabaseInstanceResult {
    readonly backupSameRegion: boolean;
    readonly backupScheduleFrequency: number;
    readonly backupScheduleRetention: number;
    readonly certificate: string;
    readonly disableBackup: boolean;
    readonly endpointIp: string;
    readonly endpointPort: number;
    readonly engine: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instanceId?: string;
    readonly isHaCluster: boolean;
    readonly loadBalancers: outputs.GetDatabaseInstanceLoadBalancer[];
    readonly name?: string;
    readonly nodeType: string;
    readonly organizationId: string;
    readonly password: string;
    readonly privateNetworks: outputs.GetDatabaseInstancePrivateNetwork[];
    readonly projectId: string;
    readonly readReplicas: outputs.GetDatabaseInstanceReadReplica[];
    readonly region: string;
    readonly settings: {[key: string]: string};
    readonly tags: string[];
    readonly userName: string;
    readonly volumeSizeInGb: number;
    readonly volumeType: string;
}

export function getDatabaseInstanceOutput(args?: GetDatabaseInstanceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabaseInstanceResult> {
    return pulumi.output(args).apply(a => getDatabaseInstance(a, opts))
}

/**
 * A collection of arguments for invoking getDatabaseInstance.
 */
export interface GetDatabaseInstanceOutputArgs {
    /**
     * The RDB instance ID.
     * Only one of `name` and `instanceId` should be specified.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The name of the RDB instance.
     * Only one of `name` and `instanceId` should be specified.
     */
    name?: pulumi.Input<string>;
}
