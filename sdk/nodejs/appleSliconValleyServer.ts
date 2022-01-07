// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class AppleSliconValleyServer extends pulumi.CustomResource {
    /**
     * Get an existing AppleSliconValleyServer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppleSliconValleyServerState, opts?: pulumi.CustomResourceOptions): AppleSliconValleyServer {
        return new AppleSliconValleyServer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scaleway:index/appleSliconValleyServer:AppleSliconValleyServer';

    /**
     * Returns true if the given object is an instance of AppleSliconValleyServer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppleSliconValleyServer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppleSliconValleyServer.__pulumiType;
    }

    /**
     * The date and time of the creation of the server
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The minimal date and time on which you can delete this server due to Apple licence
     */
    public /*out*/ readonly deletableAt!: pulumi.Output<string>;
    /**
     * IPv4 address of the server
     */
    public /*out*/ readonly ip!: pulumi.Output<string>;
    /**
     * Name of the server
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The organization_id you want to attach the resource to
     */
    public /*out*/ readonly organizationId!: pulumi.Output<string>;
    /**
     * The project_id you want to attach the resource to
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Type of the server
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The date and time of the last update of the server
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;
    /**
     * VNC url use to connect remotely to the desktop GUI
     */
    public /*out*/ readonly vncUrl!: pulumi.Output<string>;
    /**
     * The zone you want to attach the resource to
     */
    public readonly zone!: pulumi.Output<string>;

    /**
     * Create a AppleSliconValleyServer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppleSliconValleyServerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppleSliconValleyServerArgs | AppleSliconValleyServerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppleSliconValleyServerState | undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["deletableAt"] = state ? state.deletableAt : undefined;
            resourceInputs["ip"] = state ? state.ip : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
            resourceInputs["vncUrl"] = state ? state.vncUrl : undefined;
            resourceInputs["zone"] = state ? state.zone : undefined;
        } else {
            const args = argsOrState as AppleSliconValleyServerArgs | undefined;
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["zone"] = args ? args.zone : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["deletableAt"] = undefined /*out*/;
            resourceInputs["ip"] = undefined /*out*/;
            resourceInputs["organizationId"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
            resourceInputs["vncUrl"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AppleSliconValleyServer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppleSliconValleyServer resources.
 */
export interface AppleSliconValleyServerState {
    /**
     * The date and time of the creation of the server
     */
    createdAt?: pulumi.Input<string>;
    /**
     * The minimal date and time on which you can delete this server due to Apple licence
     */
    deletableAt?: pulumi.Input<string>;
    /**
     * IPv4 address of the server
     */
    ip?: pulumi.Input<string>;
    /**
     * Name of the server
     */
    name?: pulumi.Input<string>;
    /**
     * The organization_id you want to attach the resource to
     */
    organizationId?: pulumi.Input<string>;
    /**
     * The project_id you want to attach the resource to
     */
    projectId?: pulumi.Input<string>;
    /**
     * Type of the server
     */
    type?: pulumi.Input<string>;
    /**
     * The date and time of the last update of the server
     */
    updatedAt?: pulumi.Input<string>;
    /**
     * VNC url use to connect remotely to the desktop GUI
     */
    vncUrl?: pulumi.Input<string>;
    /**
     * The zone you want to attach the resource to
     */
    zone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AppleSliconValleyServer resource.
 */
export interface AppleSliconValleyServerArgs {
    /**
     * Name of the server
     */
    name?: pulumi.Input<string>;
    /**
     * The project_id you want to attach the resource to
     */
    projectId?: pulumi.Input<string>;
    /**
     * Type of the server
     */
    type: pulumi.Input<string>;
    /**
     * The zone you want to attach the resource to
     */
    zone?: pulumi.Input<string>;
}
