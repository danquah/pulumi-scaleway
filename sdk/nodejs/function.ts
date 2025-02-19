// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Creates and manages Scaleway Functions.
 * For more information see [the documentation](https://developers.scaleway.com/en/products/functions/api/).
 *
 * ## Examples
 *
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@lbrlabs/pulumi-scaleway";
 *
 * const mainFunctionNamespace = new scaleway.FunctionNamespace("mainFunctionNamespace", {description: "Main function namespace"});
 * const mainFunction = new scaleway.Function("mainFunction", {
 *     namespaceId: mainFunctionNamespace.id,
 *     runtime: "go118",
 *     handler: "Handle",
 *     privacy: "private",
 * });
 * ```
 *
 * ## Import
 *
 * Functions can be imported using the `{region}/{id}`, e.g. bash
 *
 * ```sh
 *  $ pulumi import scaleway:index/function:Function main fr-par/11111111-1111-1111-1111-111111111111
 * ```
 */
export class Function extends pulumi.CustomResource {
    /**
     * Get an existing Function resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FunctionState, opts?: pulumi.CustomResourceOptions): Function {
        return new Function(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scaleway:index/function:Function';

    /**
     * Returns true if the given object is an instance of Function.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Function {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Function.__pulumiType;
    }

    /**
     * The CPU limit in mCPU for your function. More infos on resources [here](https://developers.scaleway.com/en/products/functions/api/#functions)
     */
    public /*out*/ readonly cpuLimit!: pulumi.Output<number>;
    /**
     * Define if the function should be deployed, terraform will wait for function to be deployed
     */
    public readonly deploy!: pulumi.Output<boolean | undefined>;
    /**
     * The description of the function.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The native domain name of the function
     */
    public /*out*/ readonly domainName!: pulumi.Output<string>;
    /**
     * The environment variables of the function.
     */
    public readonly environmentVariables!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Handler of the function. Depends on the runtime ([function guide](https://developers.scaleway.com/en/products/functions/api/#create-a-function))
     */
    public readonly handler!: pulumi.Output<string>;
    /**
     * Maximum replicas for your function (defaults to 20), our system will scale your functions automatically based on incoming workload, but will never scale the number of replicas above the configured max_scale.
     */
    public readonly maxScale!: pulumi.Output<number | undefined>;
    /**
     * Memory limit in MB for your function, defaults to 128MB
     */
    public readonly memoryLimit!: pulumi.Output<number | undefined>;
    /**
     * Minimum replicas for your function, defaults to 0, Note that a function is billed when it gets executed, and using a minScale greater than 0 will cause your function container to run constantly.
     */
    public readonly minScale!: pulumi.Output<number | undefined>;
    /**
     * The unique name of the function.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The namespace ID associated with this function
     */
    public readonly namespaceId!: pulumi.Output<string>;
    /**
     * The organization ID the function is associated with.
     */
    public /*out*/ readonly organizationId!: pulumi.Output<string>;
    /**
     * Privacy of the function. Can be either `private` or `public`. Read more on [authentication](https://developers.scaleway.com/en/products/functions/api/#authentication)
     */
    public readonly privacy!: pulumi.Output<string>;
    /**
     * `projectId`) The ID of the project the namespace is associated with.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * `region`). The region in which the namespace should be created.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Runtime of the function. Runtimes can be fetched using [specific route](https://developers.scaleway.com/en/products/functions/api/#get-f7de6a)
     */
    public readonly runtime!: pulumi.Output<string>;
    /**
     * Holds the max duration (in seconds) the function is allowed for responding to a request
     */
    public readonly timeout!: pulumi.Output<number>;
    /**
     * Location of the zip file to upload containing your function sources
     */
    public readonly zipFile!: pulumi.Output<string | undefined>;
    /**
     * The hash of your source zip file, changing it will re-apply function. Can be any string
     */
    public readonly zipHash!: pulumi.Output<string | undefined>;

    /**
     * Create a Function resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FunctionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FunctionArgs | FunctionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FunctionState | undefined;
            resourceInputs["cpuLimit"] = state ? state.cpuLimit : undefined;
            resourceInputs["deploy"] = state ? state.deploy : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["domainName"] = state ? state.domainName : undefined;
            resourceInputs["environmentVariables"] = state ? state.environmentVariables : undefined;
            resourceInputs["handler"] = state ? state.handler : undefined;
            resourceInputs["maxScale"] = state ? state.maxScale : undefined;
            resourceInputs["memoryLimit"] = state ? state.memoryLimit : undefined;
            resourceInputs["minScale"] = state ? state.minScale : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namespaceId"] = state ? state.namespaceId : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["privacy"] = state ? state.privacy : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["runtime"] = state ? state.runtime : undefined;
            resourceInputs["timeout"] = state ? state.timeout : undefined;
            resourceInputs["zipFile"] = state ? state.zipFile : undefined;
            resourceInputs["zipHash"] = state ? state.zipHash : undefined;
        } else {
            const args = argsOrState as FunctionArgs | undefined;
            if ((!args || args.handler === undefined) && !opts.urn) {
                throw new Error("Missing required property 'handler'");
            }
            if ((!args || args.namespaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'namespaceId'");
            }
            if ((!args || args.privacy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'privacy'");
            }
            if ((!args || args.runtime === undefined) && !opts.urn) {
                throw new Error("Missing required property 'runtime'");
            }
            resourceInputs["deploy"] = args ? args.deploy : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["environmentVariables"] = args ? args.environmentVariables : undefined;
            resourceInputs["handler"] = args ? args.handler : undefined;
            resourceInputs["maxScale"] = args ? args.maxScale : undefined;
            resourceInputs["memoryLimit"] = args ? args.memoryLimit : undefined;
            resourceInputs["minScale"] = args ? args.minScale : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namespaceId"] = args ? args.namespaceId : undefined;
            resourceInputs["privacy"] = args ? args.privacy : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["runtime"] = args ? args.runtime : undefined;
            resourceInputs["timeout"] = args ? args.timeout : undefined;
            resourceInputs["zipFile"] = args ? args.zipFile : undefined;
            resourceInputs["zipHash"] = args ? args.zipHash : undefined;
            resourceInputs["cpuLimit"] = undefined /*out*/;
            resourceInputs["domainName"] = undefined /*out*/;
            resourceInputs["organizationId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Function.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Function resources.
 */
export interface FunctionState {
    /**
     * The CPU limit in mCPU for your function. More infos on resources [here](https://developers.scaleway.com/en/products/functions/api/#functions)
     */
    cpuLimit?: pulumi.Input<number>;
    /**
     * Define if the function should be deployed, terraform will wait for function to be deployed
     */
    deploy?: pulumi.Input<boolean>;
    /**
     * The description of the function.
     */
    description?: pulumi.Input<string>;
    /**
     * The native domain name of the function
     */
    domainName?: pulumi.Input<string>;
    /**
     * The environment variables of the function.
     */
    environmentVariables?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Handler of the function. Depends on the runtime ([function guide](https://developers.scaleway.com/en/products/functions/api/#create-a-function))
     */
    handler?: pulumi.Input<string>;
    /**
     * Maximum replicas for your function (defaults to 20), our system will scale your functions automatically based on incoming workload, but will never scale the number of replicas above the configured max_scale.
     */
    maxScale?: pulumi.Input<number>;
    /**
     * Memory limit in MB for your function, defaults to 128MB
     */
    memoryLimit?: pulumi.Input<number>;
    /**
     * Minimum replicas for your function, defaults to 0, Note that a function is billed when it gets executed, and using a minScale greater than 0 will cause your function container to run constantly.
     */
    minScale?: pulumi.Input<number>;
    /**
     * The unique name of the function.
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace ID associated with this function
     */
    namespaceId?: pulumi.Input<string>;
    /**
     * The organization ID the function is associated with.
     */
    organizationId?: pulumi.Input<string>;
    /**
     * Privacy of the function. Can be either `private` or `public`. Read more on [authentication](https://developers.scaleway.com/en/products/functions/api/#authentication)
     */
    privacy?: pulumi.Input<string>;
    /**
     * `projectId`) The ID of the project the namespace is associated with.
     */
    projectId?: pulumi.Input<string>;
    /**
     * `region`). The region in which the namespace should be created.
     */
    region?: pulumi.Input<string>;
    /**
     * Runtime of the function. Runtimes can be fetched using [specific route](https://developers.scaleway.com/en/products/functions/api/#get-f7de6a)
     */
    runtime?: pulumi.Input<string>;
    /**
     * Holds the max duration (in seconds) the function is allowed for responding to a request
     */
    timeout?: pulumi.Input<number>;
    /**
     * Location of the zip file to upload containing your function sources
     */
    zipFile?: pulumi.Input<string>;
    /**
     * The hash of your source zip file, changing it will re-apply function. Can be any string
     */
    zipHash?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Function resource.
 */
export interface FunctionArgs {
    /**
     * Define if the function should be deployed, terraform will wait for function to be deployed
     */
    deploy?: pulumi.Input<boolean>;
    /**
     * The description of the function.
     */
    description?: pulumi.Input<string>;
    /**
     * The environment variables of the function.
     */
    environmentVariables?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Handler of the function. Depends on the runtime ([function guide](https://developers.scaleway.com/en/products/functions/api/#create-a-function))
     */
    handler: pulumi.Input<string>;
    /**
     * Maximum replicas for your function (defaults to 20), our system will scale your functions automatically based on incoming workload, but will never scale the number of replicas above the configured max_scale.
     */
    maxScale?: pulumi.Input<number>;
    /**
     * Memory limit in MB for your function, defaults to 128MB
     */
    memoryLimit?: pulumi.Input<number>;
    /**
     * Minimum replicas for your function, defaults to 0, Note that a function is billed when it gets executed, and using a minScale greater than 0 will cause your function container to run constantly.
     */
    minScale?: pulumi.Input<number>;
    /**
     * The unique name of the function.
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace ID associated with this function
     */
    namespaceId: pulumi.Input<string>;
    /**
     * Privacy of the function. Can be either `private` or `public`. Read more on [authentication](https://developers.scaleway.com/en/products/functions/api/#authentication)
     */
    privacy: pulumi.Input<string>;
    /**
     * `projectId`) The ID of the project the namespace is associated with.
     */
    projectId?: pulumi.Input<string>;
    /**
     * `region`). The region in which the namespace should be created.
     */
    region?: pulumi.Input<string>;
    /**
     * Runtime of the function. Runtimes can be fetched using [specific route](https://developers.scaleway.com/en/products/functions/api/#get-f7de6a)
     */
    runtime: pulumi.Input<string>;
    /**
     * Holds the max duration (in seconds) the function is allowed for responding to a request
     */
    timeout?: pulumi.Input<number>;
    /**
     * Location of the zip file to upload containing your function sources
     */
    zipFile?: pulumi.Input<string>;
    /**
     * The hash of your source zip file, changing it will re-apply function. Can be any string
     */
    zipHash?: pulumi.Input<string>;
}
