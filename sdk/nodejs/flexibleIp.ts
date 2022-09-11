// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Creates and manages Scaleway flexible IPs.
 * For more information, see [the documentation](https://developers.scaleway.com/en/products/flexible-ip/api).
 *
 * ## Examples
 *
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * const main = new scaleway.FlexibleIp("main", {
 *     reverse: "my-reverse.com",
 * });
 * ```
 *
 * ### With zone
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * const main = new scaleway.FlexibleIp("main", {
 *     zone: "fr-par-2",
 * });
 * ```
 *
 * ### With baremetal server
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@lbrlabs/scaleway";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * const mainAccountSshKey = new scaleway.AccountSshKey("mainAccountSshKey", {publicKey: "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAILHy/M5FVm5ydLGcal3e5LNcfTalbeN7QL/ZGCvDEdqJ foobar@example.com"});
 * const byId = scaleway.getBaremetalOs({
 *     zone: "fr-par-2",
 *     name: "Ubuntu",
 *     version: "20.04 LTS (Focal Fossa)",
 * });
 * const myOffer = scaleway.getBaremetalOffer({
 *     zone: "fr-par-2",
 *     name: "EM-A210R-HDD",
 * });
 * const base = new scaleway.BaremetalServer("base", {
 *     zone: "fr-par-2",
 *     offer: myOffer.then(myOffer => myOffer.offerId),
 *     os: byId.then(byId => byId.osId),
 *     sshKeyIds: mainAccountSshKey.id,
 * });
 * const mainFlexibleIp = new scaleway.FlexibleIp("mainFlexibleIp", {
 *     serverId: base.id,
 *     zone: "fr-par-2",
 * });
 * ```
 *
 * ## Import
 *
 * Flexible IPs can be imported using the `{zone}/{id}`, e.g. bash
 *
 * ```sh
 *  $ pulumi import scaleway:index/flexibleIp:FlexibleIp main fr-par-1/11111111-1111-1111-1111-111111111111
 * ```
 */
export class FlexibleIp extends pulumi.CustomResource {
    /**
     * Get an existing FlexibleIp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FlexibleIpState, opts?: pulumi.CustomResourceOptions): FlexibleIp {
        return new FlexibleIp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scaleway:index/flexibleIp:FlexibleIp';

    /**
     * Returns true if the given object is an instance of FlexibleIp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FlexibleIp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FlexibleIp.__pulumiType;
    }

    /**
     * The date and time of the creation of the Flexible IP (Format ISO 8601)
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Description of the flexible IP
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The IPv4 address of the Flexible IP
     */
    public /*out*/ readonly ipAddress!: pulumi.Output<string>;
    /**
     * The MAC address of the server associated with this flexible IP
     */
    public /*out*/ readonly macAddress!: pulumi.Output<string>;
    /**
     * The organization of the Flexible IP
     */
    public /*out*/ readonly organizationId!: pulumi.Output<string>;
    /**
     * The project of the Flexible IP
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * The reverse domain associated with this flexible IP.
     */
    public readonly reverse!: pulumi.Output<string | undefined>;
    /**
     * The ID of the associated server
     */
    public readonly serverId!: pulumi.Output<string | undefined>;
    /**
     * The tags associated with the flexible IP
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * The date and time of the last update of the Flexible IP (Format ISO 8601)
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;
    /**
     * The zone of the Flexible IP
     */
    public readonly zone!: pulumi.Output<string>;

    /**
     * Create a FlexibleIp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: FlexibleIpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FlexibleIpArgs | FlexibleIpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FlexibleIpState | undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["macAddress"] = state ? state.macAddress : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["reverse"] = state ? state.reverse : undefined;
            resourceInputs["serverId"] = state ? state.serverId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
            resourceInputs["zone"] = state ? state.zone : undefined;
        } else {
            const args = argsOrState as FlexibleIpArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["reverse"] = args ? args.reverse : undefined;
            resourceInputs["serverId"] = args ? args.serverId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["zone"] = args ? args.zone : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["ipAddress"] = undefined /*out*/;
            resourceInputs["macAddress"] = undefined /*out*/;
            resourceInputs["organizationId"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FlexibleIp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FlexibleIp resources.
 */
export interface FlexibleIpState {
    /**
     * The date and time of the creation of the Flexible IP (Format ISO 8601)
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Description of the flexible IP
     */
    description?: pulumi.Input<string>;
    /**
     * The IPv4 address of the Flexible IP
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * The MAC address of the server associated with this flexible IP
     */
    macAddress?: pulumi.Input<string>;
    /**
     * The organization of the Flexible IP
     */
    organizationId?: pulumi.Input<string>;
    /**
     * The project of the Flexible IP
     */
    projectId?: pulumi.Input<string>;
    /**
     * The reverse domain associated with this flexible IP.
     */
    reverse?: pulumi.Input<string>;
    /**
     * The ID of the associated server
     */
    serverId?: pulumi.Input<string>;
    /**
     * The tags associated with the flexible IP
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The date and time of the last update of the Flexible IP (Format ISO 8601)
     */
    updatedAt?: pulumi.Input<string>;
    /**
     * The zone of the Flexible IP
     */
    zone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FlexibleIp resource.
 */
export interface FlexibleIpArgs {
    /**
     * Description of the flexible IP
     */
    description?: pulumi.Input<string>;
    /**
     * The project of the Flexible IP
     */
    projectId?: pulumi.Input<string>;
    /**
     * The reverse domain associated with this flexible IP.
     */
    reverse?: pulumi.Input<string>;
    /**
     * The ID of the associated server
     */
    serverId?: pulumi.Input<string>;
    /**
     * The tags associated with the flexible IP
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The zone of the Flexible IP
     */
    zone?: pulumi.Input<string>;
}
