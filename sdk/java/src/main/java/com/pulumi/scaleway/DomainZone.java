// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.DomainZoneArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.DomainZoneState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates and manages Scaleway Domain zone.\
 * For more information, see [the documentation](https://www.scaleway.com/en/docs/scaleway-dns/).
 * 
 * ## Examples
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.DomainZone;
 * import com.pulumi.scaleway.DomainZoneArgs;
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
 *         var test = new DomainZone(&#34;test&#34;, DomainZoneArgs.builder()        
 *             .domain(&#34;scaleway-terraform.com&#34;)
 *             .subdomain(&#34;test&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Zone can be imported using the `{subdomain}.{domain}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/domainZone:DomainZone test test.scaleway-terraform.com
 * ```
 * 
 */
@ResourceType(type="scaleway:index/domainZone:DomainZone")
public class DomainZone extends com.pulumi.resources.CustomResource {
    /**
     * The domain where the DNS zone will be created.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The domain where the DNS zone will be created.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * Message
     * 
     */
    @Export(name="message", type=String.class, parameters={})
    private Output<String> message;

    /**
     * @return Message
     * 
     */
    public Output<String> message() {
        return this.message;
    }
    /**
     * NameServer list for zone.
     * 
     */
    @Export(name="ns", type=List.class, parameters={String.class})
    private Output<List<String>> ns;

    /**
     * @return NameServer list for zone.
     * 
     */
    public Output<List<String>> ns() {
        return this.ns;
    }
    /**
     * NameServer default list for zone.
     * 
     */
    @Export(name="nsDefaults", type=List.class, parameters={String.class})
    private Output<List<String>> nsDefaults;

    /**
     * @return NameServer default list for zone.
     * 
     */
    public Output<List<String>> nsDefaults() {
        return this.nsDefaults;
    }
    /**
     * NameServer master list for zone.
     * 
     */
    @Export(name="nsMasters", type=List.class, parameters={String.class})
    private Output<List<String>> nsMasters;

    /**
     * @return NameServer master list for zone.
     * 
     */
    public Output<List<String>> nsMasters() {
        return this.nsMasters;
    }
    /**
     * `project_id`) The ID of the project the domain is associated with.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the domain is associated with.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * The domain zone status.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The domain zone status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The subdomain(zone name) to create in the domain.
     * 
     */
    @Export(name="subdomain", type=String.class, parameters={})
    private Output<String> subdomain;

    /**
     * @return The subdomain(zone name) to create in the domain.
     * 
     */
    public Output<String> subdomain() {
        return this.subdomain;
    }
    /**
     * The date and time of the last update of the DNS zone.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The date and time of the last update of the DNS zone.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainZone(String name) {
        this(name, DomainZoneArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainZone(String name, DomainZoneArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainZone(String name, DomainZoneArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/domainZone:DomainZone", name, args == null ? DomainZoneArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainZone(String name, Output<String> id, @Nullable DomainZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/domainZone:DomainZone", name, state, makeResourceOptions(options, id));
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
    public static DomainZone get(String name, Output<String> id, @Nullable DomainZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainZone(name, id, state, options);
    }
}
