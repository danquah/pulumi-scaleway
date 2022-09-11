// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Creates and manages Scaleway Database Users.
 * For more information, see [the documentation](https://developers.scaleway.com/en/products/rdb/api).
 *
 * ## Examples
 *
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as random from "@pulumi/random";
 * import * as scaleway from "@lbrlabs/scaleway";
 *
 * const dbPassword = new random.RandomPassword("dbPassword", {
 *     length: 16,
 *     special: true,
 * });
 * const dbAdmin = new scaleway.DatabaseUser("dbAdmin", {
 *     instanceId: scaleway_rdb_instance.main.id,
 *     password: dbPassword.result,
 *     isAdmin: true,
 * });
 * ```
 *
 * ## Import
 *
 * Database User can be imported using `{region}/{instance_id}/{name}`, e.g. bash
 *
 * ```sh
 *  $ pulumi import scaleway:index/databaseUser:DatabaseUser admin fr-par/11111111-1111-1111-1111-111111111111/admin
 * ```
 */
export class DatabaseUser extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseUser resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseUserState, opts?: pulumi.CustomResourceOptions): DatabaseUser {
        return new DatabaseUser(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scaleway:index/databaseUser:DatabaseUser';

    /**
     * Returns true if the given object is an instance of DatabaseUser.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseUser {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseUser.__pulumiType;
    }

    /**
     * The instance on which to create the user.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * Grant admin permissions to the Database User.
     */
    public readonly isAdmin!: pulumi.Output<boolean | undefined>;
    /**
     * Database User name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Database User password.
     */
    public readonly password!: pulumi.Output<string>;
    /**
     * The region you want to attach the resource to
     */
    public readonly region!: pulumi.Output<string>;

    /**
     * Create a DatabaseUser resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseUserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseUserArgs | DatabaseUserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseUserState | undefined;
            resourceInputs["instanceId"] = state ? state.instanceId : undefined;
            resourceInputs["isAdmin"] = state ? state.isAdmin : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
        } else {
            const args = argsOrState as DatabaseUserArgs | undefined;
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            if ((!args || args.password === undefined) && !opts.urn) {
                throw new Error("Missing required property 'password'");
            }
            resourceInputs["instanceId"] = args ? args.instanceId : undefined;
            resourceInputs["isAdmin"] = args ? args.isAdmin : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["password"] = args ? args.password : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DatabaseUser.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseUser resources.
 */
export interface DatabaseUserState {
    /**
     * The instance on which to create the user.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * Grant admin permissions to the Database User.
     */
    isAdmin?: pulumi.Input<boolean>;
    /**
     * Database User name.
     */
    name?: pulumi.Input<string>;
    /**
     * Database User password.
     */
    password?: pulumi.Input<string>;
    /**
     * The region you want to attach the resource to
     */
    region?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DatabaseUser resource.
 */
export interface DatabaseUserArgs {
    /**
     * The instance on which to create the user.
     */
    instanceId: pulumi.Input<string>;
    /**
     * Grant admin permissions to the Database User.
     */
    isAdmin?: pulumi.Input<boolean>;
    /**
     * Database User name.
     */
    name?: pulumi.Input<string>;
    /**
     * Database User password.
     */
    password: pulumi.Input<string>;
    /**
     * The region you want to attach the resource to
     */
    region?: pulumi.Input<string>;
}
