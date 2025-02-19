// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.RedisClusterArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.RedisClusterState;
import com.pulumi.scaleway.outputs.RedisClusterAcl;
import com.pulumi.scaleway.outputs.RedisClusterPrivateNetwork;
import com.pulumi.scaleway.outputs.RedisClusterPublicNetwork;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages Scaleway Redis Clusters.
 * For more information, see [the documentation](https://developers.scaleway.com/en/products/redis/api/v1alpha1/).
 * 
 * ## Examples
 * 
 * ### Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.RedisCluster;
 * import com.pulumi.scaleway.RedisClusterArgs;
 * import com.pulumi.scaleway.inputs.RedisClusterAclArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var main = new RedisCluster(&#34;main&#34;, RedisClusterArgs.builder()        
 *             .acls(RedisClusterAclArgs.builder()
 *                 .description(&#34;Allow all&#34;)
 *                 .ip(&#34;0.0.0.0/0&#34;)
 *                 .build())
 *             .clusterSize(1)
 *             .nodeType(&#34;RED1-MICRO&#34;)
 *             .password(&#34;thiZ_is_v&amp;ry_s3cret&#34;)
 *             .tags(            
 *                 &#34;test&#34;,
 *                 &#34;redis&#34;)
 *             .tlsEnabled(&#34;true&#34;)
 *             .userName(&#34;my_initial_user&#34;)
 *             .version(&#34;6.2.6&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ### With settings
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.RedisCluster;
 * import com.pulumi.scaleway.RedisClusterArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var main = new RedisCluster(&#34;main&#34;, RedisClusterArgs.builder()        
 *             .nodeType(&#34;RED1-MICRO&#34;)
 *             .password(&#34;thiZ_is_v&amp;ry_s3cret&#34;)
 *             .settings(Map.ofEntries(
 *                 Map.entry(&#34;maxclients&#34;, &#34;1000&#34;),
 *                 Map.entry(&#34;tcp-keepalive&#34;, &#34;120&#34;)
 *             ))
 *             .userName(&#34;my_initial_user&#34;)
 *             .version(&#34;6.2.6&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ### With a private network
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.VpcPrivateNetwork;
 * import com.pulumi.scaleway.RedisCluster;
 * import com.pulumi.scaleway.RedisClusterArgs;
 * import com.pulumi.scaleway.inputs.RedisClusterPrivateNetworkArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var pn = new VpcPrivateNetwork(&#34;pn&#34;);
 * 
 *         var main = new RedisCluster(&#34;main&#34;, RedisClusterArgs.builder()        
 *             .version(&#34;6.2.6&#34;)
 *             .nodeType(&#34;RED1-MICRO&#34;)
 *             .userName(&#34;my_initial_user&#34;)
 *             .password(&#34;thiZ_is_v&amp;ry_s3cret&#34;)
 *             .clusterSize(1)
 *             .privateNetworks(RedisClusterPrivateNetworkArgs.builder()
 *                 .id(pn.id())
 *                 .serviceIps(&#34;10.12.1.1/20&#34;)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(pn)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Redis Cluster can be imported using the `{zone}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/redisCluster:RedisCluster redis01 fr-par/11111111-1111-1111-1111-111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/redisCluster:RedisCluster")
public class RedisCluster extends com.pulumi.resources.CustomResource {
    /**
     * List of acl rules, this is cluster&#39;s authorized IPs.
     * 
     */
    @Export(name="acls", type=List.class, parameters={RedisClusterAcl.class})
    private Output</* @Nullable */ List<RedisClusterAcl>> acls;

    /**
     * @return List of acl rules, this is cluster&#39;s authorized IPs.
     * 
     */
    public Output<Optional<List<RedisClusterAcl>>> acls() {
        return Codegen.optional(this.acls);
    }
    /**
     * The PEM of the certificate used by redis, only when `tls_enabled` is true
     * 
     */
    @Export(name="certificate", type=String.class, parameters={})
    private Output<String> certificate;

    /**
     * @return The PEM of the certificate used by redis, only when `tls_enabled` is true
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }
    /**
     * The number of nodes in the Redis Cluster.
     * 
     */
    @Export(name="clusterSize", type=Integer.class, parameters={})
    private Output<Integer> clusterSize;

    /**
     * @return The number of nodes in the Redis Cluster.
     * 
     */
    public Output<Integer> clusterSize() {
        return this.clusterSize;
    }
    /**
     * The date and time of creation of the Redis Cluster.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The date and time of creation of the Redis Cluster.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The name of the Redis Cluster.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Redis Cluster.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The type of Redis Cluster you want to create (e.g. `RED1-M`).
     * 
     */
    @Export(name="nodeType", type=String.class, parameters={})
    private Output<String> nodeType;

    /**
     * @return The type of Redis Cluster you want to create (e.g. `RED1-M`).
     * 
     */
    public Output<String> nodeType() {
        return this.nodeType;
    }
    /**
     * Password for the first user of the Redis Cluster.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return Password for the first user of the Redis Cluster.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * Describes the private network you want to connect to your cluster. If not set, a public network will be provided.
     * 
     */
    @Export(name="privateNetworks", type=List.class, parameters={RedisClusterPrivateNetwork.class})
    private Output</* @Nullable */ List<RedisClusterPrivateNetwork>> privateNetworks;

    /**
     * @return Describes the private network you want to connect to your cluster. If not set, a public network will be provided.
     * 
     */
    public Output<Optional<List<RedisClusterPrivateNetwork>>> privateNetworks() {
        return Codegen.optional(this.privateNetworks);
    }
    /**
     * `project_id`) The ID of the project the Redis Cluster is associated with.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the Redis Cluster is associated with.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Public network specs details
     * 
     */
    @Export(name="publicNetwork", type=RedisClusterPublicNetwork.class, parameters={})
    private Output<RedisClusterPublicNetwork> publicNetwork;

    /**
     * @return Public network specs details
     * 
     */
    public Output<RedisClusterPublicNetwork> publicNetwork() {
        return this.publicNetwork;
    }
    /**
     * Map of settings for redis cluster. Available settings can be found by listing redis versions with scaleway API or CLI
     * 
     */
    @Export(name="settings", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> settings;

    /**
     * @return Map of settings for redis cluster. Available settings can be found by listing redis versions with scaleway API or CLI
     * 
     */
    public Output<Optional<Map<String,String>>> settings() {
        return Codegen.optional(this.settings);
    }
    /**
     * The tags associated with the Redis Cluster.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return The tags associated with the Redis Cluster.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Whether TLS is enabled or not.
     * 
     */
    @Export(name="tlsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tlsEnabled;

    /**
     * @return Whether TLS is enabled or not.
     * 
     */
    public Output<Optional<Boolean>> tlsEnabled() {
        return Codegen.optional(this.tlsEnabled);
    }
    /**
     * The date and time of the last update of the Redis Cluster.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The date and time of the last update of the Redis Cluster.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    /**
     * Identifier for the first user of the Redis Cluster.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return Identifier for the first user of the Redis Cluster.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }
    /**
     * Redis&#39;s Cluster version (e.g. `6.2.6`).
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Redis&#39;s Cluster version (e.g. `6.2.6`).
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * `zone`) The zone in which the Redis Cluster should be created.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return `zone`) The zone in which the Redis Cluster should be created.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RedisCluster(String name) {
        this(name, RedisClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RedisCluster(String name, RedisClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RedisCluster(String name, RedisClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/redisCluster:RedisCluster", name, args == null ? RedisClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RedisCluster(String name, Output<String> id, @Nullable RedisClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/redisCluster:RedisCluster", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RedisCluster get(String name, Output<String> id, @Nullable RedisClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RedisCluster(name, id, state, options);
    }
}
