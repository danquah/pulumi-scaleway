// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * Kubernetes clusters can be imported using the `{region}/{id}`, e.g. bash
 *
 * ```sh
 *  $ pulumi import scaleway:index/kubernetesCluster:KubernetesCluster mycluster fr-par/11111111-1111-1111-1111-111111111111
 * ```
 */
export class KubernetesCluster extends pulumi.CustomResource {
    /**
     * Get an existing KubernetesCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KubernetesClusterState, opts?: pulumi.CustomResourceOptions): KubernetesCluster {
        return new KubernetesCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scaleway:index/kubernetesCluster:KubernetesCluster';

    /**
     * Returns true if the given object is an instance of KubernetesCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KubernetesCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KubernetesCluster.__pulumiType;
    }

    /**
     * The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
     */
    public readonly admissionPlugins!: pulumi.Output<string[] | undefined>;
    /**
     * Additional Subject Alternative Names for the Kubernetes API server certificate
     */
    public readonly apiserverCertSans!: pulumi.Output<string[] | undefined>;
    /**
     * The URL of the Kubernetes API server.
     */
    public /*out*/ readonly apiserverUrl!: pulumi.Output<string>;
    /**
     * The auto upgrade configuration.
     */
    public readonly autoUpgrade!: pulumi.Output<outputs.KubernetesClusterAutoUpgrade>;
    /**
     * The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
     */
    public readonly autoscalerConfig!: pulumi.Output<outputs.KubernetesClusterAutoscalerConfig>;
    /**
     * The Container Network Interface (CNI) for the Kubernetes cluster.
     * > **Important:** Updates to this field will recreate a new resource.
     */
    public readonly cni!: pulumi.Output<string>;
    /**
     * The creation date of the cluster.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Delete additional resources like block volumes and loadbalancers that were created in Kubernetes on cluster deletion.
     */
    public readonly deleteAdditionalResources!: pulumi.Output<boolean | undefined>;
    /**
     * A description for the Kubernetes cluster.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
     */
    public readonly featureGates!: pulumi.Output<string[] | undefined>;
    /**
     * The kubeconfig configuration file of the Kubernetes cluster
     */
    public /*out*/ readonly kubeconfigs!: pulumi.Output<outputs.KubernetesClusterKubeconfig[]>;
    /**
     * The name for the Kubernetes cluster.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The OpenID Connect configuration of the cluster
     */
    public readonly openIdConnectConfig!: pulumi.Output<outputs.KubernetesClusterOpenIdConnectConfig>;
    /**
     * The organization ID the cluster is associated with.
     */
    public /*out*/ readonly organizationId!: pulumi.Output<string>;
    /**
     * `projectId`) The ID of the project the cluster is associated with.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * `region`) The region in which the cluster should be created.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The status of the Kubernetes cluster.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The tags associated with the Kubernetes cluster.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The last update date of the cluster.
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;
    /**
     * Set to `true` if a newer Kubernetes version is available.
     */
    public /*out*/ readonly upgradeAvailable!: pulumi.Output<boolean>;
    /**
     * The version of the Kubernetes cluster.
     */
    public readonly version!: pulumi.Output<string>;
    /**
     * The DNS wildcard that points to all ready nodes.
     * - `kubeconfig`
     */
    public /*out*/ readonly wildcardDns!: pulumi.Output<string>;

    /**
     * Create a KubernetesCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KubernetesClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KubernetesClusterArgs | KubernetesClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KubernetesClusterState | undefined;
            resourceInputs["admissionPlugins"] = state ? state.admissionPlugins : undefined;
            resourceInputs["apiserverCertSans"] = state ? state.apiserverCertSans : undefined;
            resourceInputs["apiserverUrl"] = state ? state.apiserverUrl : undefined;
            resourceInputs["autoUpgrade"] = state ? state.autoUpgrade : undefined;
            resourceInputs["autoscalerConfig"] = state ? state.autoscalerConfig : undefined;
            resourceInputs["cni"] = state ? state.cni : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["deleteAdditionalResources"] = state ? state.deleteAdditionalResources : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["featureGates"] = state ? state.featureGates : undefined;
            resourceInputs["kubeconfigs"] = state ? state.kubeconfigs : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["openIdConnectConfig"] = state ? state.openIdConnectConfig : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
            resourceInputs["upgradeAvailable"] = state ? state.upgradeAvailable : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
            resourceInputs["wildcardDns"] = state ? state.wildcardDns : undefined;
        } else {
            const args = argsOrState as KubernetesClusterArgs | undefined;
            if ((!args || args.cni === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cni'");
            }
            if ((!args || args.version === undefined) && !opts.urn) {
                throw new Error("Missing required property 'version'");
            }
            resourceInputs["admissionPlugins"] = args ? args.admissionPlugins : undefined;
            resourceInputs["apiserverCertSans"] = args ? args.apiserverCertSans : undefined;
            resourceInputs["autoUpgrade"] = args ? args.autoUpgrade : undefined;
            resourceInputs["autoscalerConfig"] = args ? args.autoscalerConfig : undefined;
            resourceInputs["cni"] = args ? args.cni : undefined;
            resourceInputs["deleteAdditionalResources"] = args ? args.deleteAdditionalResources : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["featureGates"] = args ? args.featureGates : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["openIdConnectConfig"] = args ? args.openIdConnectConfig : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
            resourceInputs["apiserverUrl"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["kubeconfigs"] = undefined /*out*/;
            resourceInputs["organizationId"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
            resourceInputs["upgradeAvailable"] = undefined /*out*/;
            resourceInputs["wildcardDns"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(KubernetesCluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KubernetesCluster resources.
 */
export interface KubernetesClusterState {
    /**
     * The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
     */
    admissionPlugins?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Additional Subject Alternative Names for the Kubernetes API server certificate
     */
    apiserverCertSans?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The URL of the Kubernetes API server.
     */
    apiserverUrl?: pulumi.Input<string>;
    /**
     * The auto upgrade configuration.
     */
    autoUpgrade?: pulumi.Input<inputs.KubernetesClusterAutoUpgrade>;
    /**
     * The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
     */
    autoscalerConfig?: pulumi.Input<inputs.KubernetesClusterAutoscalerConfig>;
    /**
     * The Container Network Interface (CNI) for the Kubernetes cluster.
     * > **Important:** Updates to this field will recreate a new resource.
     */
    cni?: pulumi.Input<string>;
    /**
     * The creation date of the cluster.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Delete additional resources like block volumes and loadbalancers that were created in Kubernetes on cluster deletion.
     */
    deleteAdditionalResources?: pulumi.Input<boolean>;
    /**
     * A description for the Kubernetes cluster.
     */
    description?: pulumi.Input<string>;
    /**
     * The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
     */
    featureGates?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The kubeconfig configuration file of the Kubernetes cluster
     */
    kubeconfigs?: pulumi.Input<pulumi.Input<inputs.KubernetesClusterKubeconfig>[]>;
    /**
     * The name for the Kubernetes cluster.
     */
    name?: pulumi.Input<string>;
    /**
     * The OpenID Connect configuration of the cluster
     */
    openIdConnectConfig?: pulumi.Input<inputs.KubernetesClusterOpenIdConnectConfig>;
    /**
     * The organization ID the cluster is associated with.
     */
    organizationId?: pulumi.Input<string>;
    /**
     * `projectId`) The ID of the project the cluster is associated with.
     */
    projectId?: pulumi.Input<string>;
    /**
     * `region`) The region in which the cluster should be created.
     */
    region?: pulumi.Input<string>;
    /**
     * The status of the Kubernetes cluster.
     */
    status?: pulumi.Input<string>;
    /**
     * The tags associated with the Kubernetes cluster.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
     */
    type?: pulumi.Input<string>;
    /**
     * The last update date of the cluster.
     */
    updatedAt?: pulumi.Input<string>;
    /**
     * Set to `true` if a newer Kubernetes version is available.
     */
    upgradeAvailable?: pulumi.Input<boolean>;
    /**
     * The version of the Kubernetes cluster.
     */
    version?: pulumi.Input<string>;
    /**
     * The DNS wildcard that points to all ready nodes.
     * - `kubeconfig`
     */
    wildcardDns?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a KubernetesCluster resource.
 */
export interface KubernetesClusterArgs {
    /**
     * The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
     */
    admissionPlugins?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Additional Subject Alternative Names for the Kubernetes API server certificate
     */
    apiserverCertSans?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The auto upgrade configuration.
     */
    autoUpgrade?: pulumi.Input<inputs.KubernetesClusterAutoUpgrade>;
    /**
     * The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
     */
    autoscalerConfig?: pulumi.Input<inputs.KubernetesClusterAutoscalerConfig>;
    /**
     * The Container Network Interface (CNI) for the Kubernetes cluster.
     * > **Important:** Updates to this field will recreate a new resource.
     */
    cni: pulumi.Input<string>;
    /**
     * Delete additional resources like block volumes and loadbalancers that were created in Kubernetes on cluster deletion.
     */
    deleteAdditionalResources?: pulumi.Input<boolean>;
    /**
     * A description for the Kubernetes cluster.
     */
    description?: pulumi.Input<string>;
    /**
     * The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
     */
    featureGates?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name for the Kubernetes cluster.
     */
    name?: pulumi.Input<string>;
    /**
     * The OpenID Connect configuration of the cluster
     */
    openIdConnectConfig?: pulumi.Input<inputs.KubernetesClusterOpenIdConnectConfig>;
    /**
     * `projectId`) The ID of the project the cluster is associated with.
     */
    projectId?: pulumi.Input<string>;
    /**
     * `region`) The region in which the cluster should be created.
     */
    region?: pulumi.Input<string>;
    /**
     * The tags associated with the Kubernetes cluster.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
     */
    type?: pulumi.Input<string>;
    /**
     * The version of the Kubernetes cluster.
     */
    version: pulumi.Input<string>;
}
