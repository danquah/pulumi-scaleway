// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.LoadbalancerFrontendArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.LoadbalancerFrontendState;
import com.pulumi.scaleway.outputs.LoadbalancerFrontendAcl;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages Scaleway Load-Balancer Frontends. For more information, see [the documentation](https://developers.scaleway.com/en/products/lb/zoned_api).
 * 
 * ## Examples Usage
 * 
 * ### Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.LoadbalancerFrontend;
 * import com.pulumi.scaleway.LoadbalancerFrontendArgs;
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
 *         var frontend01 = new LoadbalancerFrontend(&#34;frontend01&#34;, LoadbalancerFrontendArgs.builder()        
 *             .lbId(scaleway_lb.lb01().id())
 *             .backendId(scaleway_lb_backend.backend01().id())
 *             .inboundPort(&#34;80&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## With ACLs
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.LoadbalancerFrontend;
 * import com.pulumi.scaleway.LoadbalancerFrontendArgs;
 * import com.pulumi.scaleway.inputs.LoadbalancerFrontendAclArgs;
 * import com.pulumi.scaleway.inputs.LoadbalancerFrontendAclActionArgs;
 * import com.pulumi.scaleway.inputs.LoadbalancerFrontendAclMatchArgs;
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
 *         var frontend01 = new LoadbalancerFrontend(&#34;frontend01&#34;, LoadbalancerFrontendArgs.builder()        
 *             .lbId(scaleway_lb.lb01().id())
 *             .backendId(scaleway_lb_backend.backend01().id())
 *             .inboundPort(&#34;80&#34;)
 *             .acls(            
 *                 LoadbalancerFrontendAclArgs.builder()
 *                     .name(&#34;blacklist wellknwon IPs&#34;)
 *                     .action(LoadbalancerFrontendAclActionArgs.builder()
 *                         .type(&#34;allow&#34;)
 *                         .build())
 *                     .match(LoadbalancerFrontendAclMatchArgs.builder()
 *                         .ipSubnets(                        
 *                             &#34;192.168.0.1&#34;,
 *                             &#34;192.168.0.2&#34;,
 *                             &#34;192.168.10.0/24&#34;)
 *                         .build())
 *                     .build(),
 *                 LoadbalancerFrontendAclArgs.builder()
 *                     .action(LoadbalancerFrontendAclActionArgs.builder()
 *                         .type(&#34;deny&#34;)
 *                         .build())
 *                     .match(LoadbalancerFrontendAclMatchArgs.builder()
 *                         .ipSubnets(&#34;51.51.51.51&#34;)
 *                         .httpFilter(&#34;regex&#34;)
 *                         .httpFilterValues(&#34;^foo*bar$&#34;)
 *                         .build())
 *                     .build(),
 *                 LoadbalancerFrontendAclArgs.builder()
 *                     .action(LoadbalancerFrontendAclActionArgs.builder()
 *                         .type(&#34;allow&#34;)
 *                         .build())
 *                     .match(LoadbalancerFrontendAclMatchArgs.builder()
 *                         .httpFilter(&#34;path_begin&#34;)
 *                         .httpFilterValues(                        
 *                             &#34;foo&#34;,
 *                             &#34;bar&#34;)
 *                         .build())
 *                     .build(),
 *                 LoadbalancerFrontendAclArgs.builder()
 *                     .action(LoadbalancerFrontendAclActionArgs.builder()
 *                         .type(&#34;allow&#34;)
 *                         .build())
 *                     .match(LoadbalancerFrontendAclMatchArgs.builder()
 *                         .httpFilter(&#34;path_begin&#34;)
 *                         .httpFilterValues(&#34;hi&#34;)
 *                         .invert(&#34;true&#34;)
 *                         .build())
 *                     .build(),
 *                 LoadbalancerFrontendAclArgs.builder()
 *                     .action(LoadbalancerFrontendAclActionArgs.builder()
 *                         .type(&#34;allow&#34;)
 *                         .build())
 *                     .match(LoadbalancerFrontendAclMatchArgs.builder()
 *                         .httpFilter(&#34;http_header_match&#34;)
 *                         .httpFilterValues(&#34;foo&#34;)
 *                         .httpValueOption(&#34;bar&#34;)
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Load-Balancer frontend can be imported using the `{zone}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/loadbalancerFrontend:LoadbalancerFrontend frontend01 fr-par-1/11111111-1111-1111-1111-111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/loadbalancerFrontend:LoadbalancerFrontend")
public class LoadbalancerFrontend extends com.pulumi.resources.CustomResource {
    /**
     * A list of ACL rules to apply to the load-balancer frontend.  Defined below.
     * 
     */
    @Export(name="acls", type=List.class, parameters={LoadbalancerFrontendAcl.class})
    private Output</* @Nullable */ List<LoadbalancerFrontendAcl>> acls;

    /**
     * @return A list of ACL rules to apply to the load-balancer frontend.  Defined below.
     * 
     */
    public Output<Optional<List<LoadbalancerFrontendAcl>>> acls() {
        return Codegen.optional(this.acls);
    }
    /**
     * The load-balancer backend ID this frontend is attached to.
     * 
     */
    @Export(name="backendId", type=String.class, parameters={})
    private Output<String> backendId;

    /**
     * @return The load-balancer backend ID this frontend is attached to.
     * 
     */
    public Output<String> backendId() {
        return this.backendId;
    }
    /**
     * (Deprecated) first certificate ID used by the frontend.
     * 
     * @deprecated
     * Please use certificate_ids
     * 
     */
    @Deprecated /* Please use certificate_ids */
    @Export(name="certificateId", type=String.class, parameters={})
    private Output<String> certificateId;

    /**
     * @return (Deprecated) first certificate ID used by the frontend.
     * 
     */
    public Output<String> certificateId() {
        return this.certificateId;
    }
    /**
     * List of Certificate IDs that should be used by the frontend.
     * 
     */
    @Export(name="certificateIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> certificateIds;

    /**
     * @return List of Certificate IDs that should be used by the frontend.
     * 
     */
    public Output<Optional<List<String>>> certificateIds() {
        return Codegen.optional(this.certificateIds);
    }
    /**
     * TCP port to listen on the front side.
     * 
     */
    @Export(name="inboundPort", type=Integer.class, parameters={})
    private Output<Integer> inboundPort;

    /**
     * @return TCP port to listen on the front side.
     * 
     */
    public Output<Integer> inboundPort() {
        return this.inboundPort;
    }
    /**
     * The load-balancer ID this frontend is attached to.
     * 
     */
    @Export(name="lbId", type=String.class, parameters={})
    private Output<String> lbId;

    /**
     * @return The load-balancer ID this frontend is attached to.
     * 
     */
    public Output<String> lbId() {
        return this.lbId;
    }
    /**
     * The ACL name. If not provided it will be randomly generated.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The ACL name. If not provided it will be randomly generated.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Maximum inactivity time on the client side. (e.g.: `1s`)
     * 
     */
    @Export(name="timeoutClient", type=String.class, parameters={})
    private Output</* @Nullable */ String> timeoutClient;

    /**
     * @return Maximum inactivity time on the client side. (e.g.: `1s`)
     * 
     */
    public Output<Optional<String>> timeoutClient() {
        return Codegen.optional(this.timeoutClient);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadbalancerFrontend(String name) {
        this(name, LoadbalancerFrontendArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadbalancerFrontend(String name, LoadbalancerFrontendArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadbalancerFrontend(String name, LoadbalancerFrontendArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/loadbalancerFrontend:LoadbalancerFrontend", name, args == null ? LoadbalancerFrontendArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadbalancerFrontend(String name, Output<String> id, @Nullable LoadbalancerFrontendState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/loadbalancerFrontend:LoadbalancerFrontend", name, state, makeResourceOptions(options, id));
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
    public static LoadbalancerFrontend get(String name, Output<String> id, @Nullable LoadbalancerFrontendState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadbalancerFrontend(name, id, state, options);
    }
}
