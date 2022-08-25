// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.InstanceIpReverseDnsArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.InstanceIpReverseDnsState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages Scaleway Compute Instance IPs Reverse DNS.
 * 
 * Please check our [guide](https://www.scaleway.com/en/docs/compute/instances/how-to/configure-reverse-dns/) for more details
 * 
 * ## Import
 * 
 * IPs reverse DNS can be imported using the `{zone}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/instanceIpReverseDns:InstanceIpReverseDns reverse fr-par-1/11111111-1111-1111-1111-111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/instanceIpReverseDns:InstanceIpReverseDns")
public class InstanceIpReverseDns extends com.pulumi.resources.CustomResource {
    /**
     * The IP ID
     * 
     */
    @Export(name="ipId", type=String.class, parameters={})
    private Output<String> ipId;

    /**
     * @return The IP ID
     * 
     */
    public Output<String> ipId() {
        return this.ipId;
    }
    /**
     * The reverse DNS for this IP.
     * 
     */
    @Export(name="reverse", type=String.class, parameters={})
    private Output<String> reverse;

    /**
     * @return The reverse DNS for this IP.
     * 
     */
    public Output<String> reverse() {
        return this.reverse;
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
    public InstanceIpReverseDns(String name) {
        this(name, InstanceIpReverseDnsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceIpReverseDns(String name, InstanceIpReverseDnsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceIpReverseDns(String name, InstanceIpReverseDnsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/instanceIpReverseDns:InstanceIpReverseDns", name, args == null ? InstanceIpReverseDnsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceIpReverseDns(String name, Output<String> id, @Nullable InstanceIpReverseDnsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/instanceIpReverseDns:InstanceIpReverseDns", name, state, makeResourceOptions(options, id));
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
    public static InstanceIpReverseDns get(String name, Output<String> id, @Nullable InstanceIpReverseDnsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceIpReverseDns(name, id, state, options);
    }
}
