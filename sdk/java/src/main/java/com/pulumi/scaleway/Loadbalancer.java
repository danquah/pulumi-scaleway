// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.LoadbalancerArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.LoadbalancerState;
import com.pulumi.scaleway.outputs.LoadbalancerPrivateNetwork;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages Scaleway Load-Balancers.
 * For more information, see [the documentation](https://developers.scaleway.com/en/products/lb/zoned_api).
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
 * import com.pulumi.scaleway.LoadbalancerIp;
 * import com.pulumi.scaleway.LoadbalancerIpArgs;
 * import com.pulumi.scaleway.Loadbalancer;
 * import com.pulumi.scaleway.LoadbalancerArgs;
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
 *         var main = new LoadbalancerIp(&#34;main&#34;, LoadbalancerIpArgs.builder()        
 *             .zone(&#34;fr-par-1&#34;)
 *             .build());
 * 
 *         var base = new Loadbalancer(&#34;base&#34;, LoadbalancerArgs.builder()        
 *             .ipId(main.id())
 *             .zone(main.zone())
 *             .type(&#34;LB-S&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ### IP for Public Gateway
 * resource &#34;scaleway_vpc_public_gateway_ip&#34; &#34;main&#34; {
 * }
 * 
 * ### Scaleway Private Network
 * resource scaleway_vpc_private_network main {
 * }
 * 
 * ### VPC Public Gateway Network
 * resource &#34;scaleway_vpc_public_gateway&#34; &#34;main&#34; {
 *     name  = &#34;tf-test-public-gw&#34;
 *     type  = &#34;VPC-GW-S&#34;
 *     ip_id = scaleway_vpc_public_gateway_ip.main.id
 * }
 * 
 * ### VPC Public Gateway Network DHCP config
 * resource &#34;scaleway_vpc_public_gateway_dhcp&#34; &#34;main&#34; {
 *     subnet = &#34;10.0.0.0/24&#34;
 * }
 * 
 * ### VPC Gateway Network
 * resource &#34;scaleway_vpc_gateway_network&#34; &#34;main&#34; {
 *     gateway_id         = scaleway_vpc_public_gateway.main.id
 *     private_network_id = scaleway_vpc_private_network.main.id
 *     dhcp_id            = scaleway_vpc_public_gateway_dhcp.main.id
 *     cleanup_dhcp       = true
 *     enable_masquerade  = true
 * }
 * 
 * ### Scaleway Instance
 * resource &#34;scaleway_instance_server&#34; &#34;main&#34; {
 *     name        = &#34;Scaleway Terraform Provider&#34;
 *     type        = &#34;DEV1-S&#34;
 *     image       = &#34;debian_bullseye&#34;
 *     enable_ipv6 = false
 * 
 *     private_network {
 *         pn_id = scaleway_vpc_private_network.main.id
 *     }
 * }
 * 
 * ### IP for LB IP
 * resource scaleway_lb_ip main {
 * }
 * 
 * ### Scaleway Private Network
 * resource scaleway_vpc_private_network &#34;main&#34; {
 *     name = &#34;private network with static config&#34;
 * }
 * 
 * ## Migration
 * 
 * In order to migrate to other types you can check the migration up or down via our CLI `scw lb lb-types list`.
 * this change will not recreate your Load Balancer.
 * 
 * Please check our [documentation](https://developers.scaleway.com/en/products/lb/zoned_api/#post-355592) for further details
 * 
 * ## IP ID
 * 
 * Since v1.15.0, `ip_id` is a required field. This means that now a separate `scaleway.LoadbalancerIp` is required.
 * When importing, the IP needs to be imported as well as the LB.
 * When upgrading to v1.15.0, you will need to create a new `scaleway.LoadbalancerIp` resource and import it.
 * 
 * For instance, if you had the following:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.Loadbalancer;
 * import com.pulumi.scaleway.LoadbalancerArgs;
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
 *         var main = new Loadbalancer(&#34;main&#34;, LoadbalancerArgs.builder()        
 *             .type(&#34;LB-S&#34;)
 *             .zone(&#34;fr-par-1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * You will need to update it to:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.LoadbalancerIp;
 * import com.pulumi.scaleway.Loadbalancer;
 * import com.pulumi.scaleway.LoadbalancerArgs;
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
 *         var mainLoadbalancerIp = new LoadbalancerIp(&#34;mainLoadbalancerIp&#34;);
 * 
 *         var mainLoadbalancer = new Loadbalancer(&#34;mainLoadbalancer&#34;, LoadbalancerArgs.builder()        
 *             .ipId(mainLoadbalancerIp.id())
 *             .zone(&#34;fr-par-1&#34;)
 *             .type(&#34;LB-S&#34;)
 *             .releaseIp(false)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Private Network with static config
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.LoadbalancerIp;
 * import com.pulumi.scaleway.VpcPrivateNetwork;
 * import com.pulumi.scaleway.Loadbalancer;
 * import com.pulumi.scaleway.LoadbalancerArgs;
 * import com.pulumi.scaleway.inputs.LoadbalancerPrivateNetworkArgs;
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
 *         var mainLoadbalancerIp = new LoadbalancerIp(&#34;mainLoadbalancerIp&#34;);
 * 
 *         var mainVpcPrivateNetwork = new VpcPrivateNetwork(&#34;mainVpcPrivateNetwork&#34;);
 * 
 *         var mainLoadbalancer = new Loadbalancer(&#34;mainLoadbalancer&#34;, LoadbalancerArgs.builder()        
 *             .ipId(mainLoadbalancerIp.id())
 *             .type(&#34;LB-S&#34;)
 *             .releaseIp(false)
 *             .privateNetworks(LoadbalancerPrivateNetworkArgs.builder()
 *                 .privateNetworkId(mainVpcPrivateNetwork.id())
 *                 .staticConfigs(                
 *                     &#34;172.16.0.100&#34;,
 *                     &#34;172.16.0.101&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Load-Balancer can be imported using the `{zone}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/loadbalancer:Loadbalancer main fr-par-1/11111111-1111-1111-1111-111111111111
 * ```
 * 
 *  Be aware that you will also need to import the `scaleway_lb_ip` resource.
 * 
 */
@ResourceType(type="scaleway:index/loadbalancer:Loadbalancer")
public class Loadbalancer extends com.pulumi.resources.CustomResource {
    /**
     * The description of the load-balancer.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the load-balancer.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The load-balance public IP Address
     * 
     */
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return The load-balance public IP Address
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * The ID of the associated LB IP. See below.
     * 
     */
    @Export(name="ipId", type=String.class, parameters={})
    private Output<String> ipId;

    /**
     * @return The ID of the associated LB IP. See below.
     * 
     */
    public Output<String> ipId() {
        return this.ipId;
    }
    /**
     * The name of the load-balancer.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the load-balancer.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The organization ID the load-balancer is associated with.
     * 
     */
    @Export(name="organizationId", type=String.class, parameters={})
    private Output<String> organizationId;

    /**
     * @return The organization ID the load-balancer is associated with.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * List of private network to connect with your load balancer
     * 
     */
    @Export(name="privateNetworks", type=List.class, parameters={LoadbalancerPrivateNetwork.class})
    private Output</* @Nullable */ List<LoadbalancerPrivateNetwork>> privateNetworks;

    /**
     * @return List of private network to connect with your load balancer
     * 
     */
    public Output<Optional<List<LoadbalancerPrivateNetwork>>> privateNetworks() {
        return Codegen.optional(this.privateNetworks);
    }
    /**
     * `project_id`) The ID of the project the load-balancer is associated with.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the load-balancer is associated with.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * The region of the resource
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region of the resource
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The release_ip allow release the ip address associated with the load-balancers.
     * 
     * @deprecated
     * The resource ip will be destroyed by it&#39;s own resource. Please set this to `false`
     * 
     */
    @Deprecated /* The resource ip will be destroyed by it's own resource. Please set this to `false` */
    @Export(name="releaseIp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> releaseIp;

    /**
     * @return The release_ip allow release the ip address associated with the load-balancers.
     * 
     */
    public Output<Optional<Boolean>> releaseIp() {
        return Codegen.optional(this.releaseIp);
    }
    /**
     * Enforces minimal SSL version (in SSL/TLS offloading context). Please check [possible values](https://developers.scaleway.com/en/products/lb/zoned_api/#ssl-compatibility-level-442f99).
     * 
     */
    @Export(name="sslCompatibilityLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> sslCompatibilityLevel;

    /**
     * @return Enforces minimal SSL version (in SSL/TLS offloading context). Please check [possible values](https://developers.scaleway.com/en/products/lb/zoned_api/#ssl-compatibility-level-442f99).
     * 
     */
    public Output<Optional<String>> sslCompatibilityLevel() {
        return Codegen.optional(this.sslCompatibilityLevel);
    }
    /**
     * The tags associated with the load-balancers.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return The tags associated with the load-balancers.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the load-balancer. Please check the migration section to upgrade the type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the load-balancer. Please check the migration section to upgrade the type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * `zone`) The zone in which the IP should be reserved.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return `zone`) The zone in which the IP should be reserved.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Loadbalancer(String name) {
        this(name, LoadbalancerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Loadbalancer(String name, LoadbalancerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Loadbalancer(String name, LoadbalancerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/loadbalancer:Loadbalancer", name, args == null ? LoadbalancerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Loadbalancer(String name, Output<String> id, @Nullable LoadbalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/loadbalancer:Loadbalancer", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Loadbalancer get(String name, Output<String> id, @Nullable LoadbalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Loadbalancer(name, id, state, options);
    }
}
