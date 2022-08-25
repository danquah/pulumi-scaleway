// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.FunctionArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.FunctionState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages Scaleway Functions.
 * For more information see [the documentation](https://developers.scaleway.com/en/products/functions/api/).
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
 * import com.pulumi.scaleway.FunctionNamespace;
 * import com.pulumi.scaleway.FunctionNamespaceArgs;
 * import com.pulumi.scaleway.Function;
 * import com.pulumi.scaleway.FunctionArgs;
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
 *         var mainFunctionNamespace = new FunctionNamespace(&#34;mainFunctionNamespace&#34;, FunctionNamespaceArgs.builder()        
 *             .description(&#34;Main function namespace&#34;)
 *             .build());
 * 
 *         var mainFunction = new Function(&#34;mainFunction&#34;, FunctionArgs.builder()        
 *             .namespaceId(mainFunctionNamespace.id())
 *             .runtime(&#34;go118&#34;)
 *             .handler(&#34;Handle&#34;)
 *             .privacy(&#34;private&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Functions can be imported using the `{region}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/function:Function main fr-par/11111111-1111-1111-1111-111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/function:Function")
public class Function extends com.pulumi.resources.CustomResource {
    /**
     * The CPU limit in mCPU for your function. More infos on resources [here](https://developers.scaleway.com/en/products/functions/api/#functions)
     * 
     */
    @Export(name="cpuLimit", type=Integer.class, parameters={})
    private Output<Integer> cpuLimit;

    /**
     * @return The CPU limit in mCPU for your function. More infos on resources [here](https://developers.scaleway.com/en/products/functions/api/#functions)
     * 
     */
    public Output<Integer> cpuLimit() {
        return this.cpuLimit;
    }
    /**
     * Define if the function should be deployed, terraform will wait for function to be deployed
     * 
     */
    @Export(name="deploy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deploy;

    /**
     * @return Define if the function should be deployed, terraform will wait for function to be deployed
     * 
     */
    public Output<Optional<Boolean>> deploy() {
        return Codegen.optional(this.deploy);
    }
    /**
     * The description of the function.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the function.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The native domain name of the function
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The native domain name of the function
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The environment variables of the function.
     * 
     */
    @Export(name="environmentVariables", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> environmentVariables;

    /**
     * @return The environment variables of the function.
     * 
     */
    public Output<Optional<Map<String,String>>> environmentVariables() {
        return Codegen.optional(this.environmentVariables);
    }
    /**
     * Handler of the function. Depends on the runtime ([function guide](https://developers.scaleway.com/en/products/functions/api/#create-a-function))
     * 
     */
    @Export(name="handler", type=String.class, parameters={})
    private Output<String> handler;

    /**
     * @return Handler of the function. Depends on the runtime ([function guide](https://developers.scaleway.com/en/products/functions/api/#create-a-function))
     * 
     */
    public Output<String> handler() {
        return this.handler;
    }
    /**
     * Maximum replicas for your function (defaults to 20), our system will scale your functions automatically based on incoming workload, but will never scale the number of replicas above the configured max_scale.
     * 
     */
    @Export(name="maxScale", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxScale;

    /**
     * @return Maximum replicas for your function (defaults to 20), our system will scale your functions automatically based on incoming workload, but will never scale the number of replicas above the configured max_scale.
     * 
     */
    public Output<Optional<Integer>> maxScale() {
        return Codegen.optional(this.maxScale);
    }
    /**
     * Memory limit in MB for your function, defaults to 128MB
     * 
     */
    @Export(name="memoryLimit", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> memoryLimit;

    /**
     * @return Memory limit in MB for your function, defaults to 128MB
     * 
     */
    public Output<Optional<Integer>> memoryLimit() {
        return Codegen.optional(this.memoryLimit);
    }
    /**
     * Minimum replicas for your function, defaults to 0, Note that a function is billed when it gets executed, and using a min_scale greater than 0 will cause your function container to run constantly.
     * 
     */
    @Export(name="minScale", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minScale;

    /**
     * @return Minimum replicas for your function, defaults to 0, Note that a function is billed when it gets executed, and using a min_scale greater than 0 will cause your function container to run constantly.
     * 
     */
    public Output<Optional<Integer>> minScale() {
        return Codegen.optional(this.minScale);
    }
    /**
     * The unique name of the function.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique name of the function.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The namespace ID associated with this function
     * 
     */
    @Export(name="namespaceId", type=String.class, parameters={})
    private Output<String> namespaceId;

    /**
     * @return The namespace ID associated with this function
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }
    /**
     * The organization ID the function is associated with.
     * 
     */
    @Export(name="organizationId", type=String.class, parameters={})
    private Output<String> organizationId;

    /**
     * @return The organization ID the function is associated with.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * Privacy of the function. Can be either `private` or `public`. Read more on [authentication](https://developers.scaleway.com/en/products/functions/api/#authentication)
     * 
     */
    @Export(name="privacy", type=String.class, parameters={})
    private Output<String> privacy;

    /**
     * @return Privacy of the function. Can be either `private` or `public`. Read more on [authentication](https://developers.scaleway.com/en/products/functions/api/#authentication)
     * 
     */
    public Output<String> privacy() {
        return this.privacy;
    }
    /**
     * `project_id`) The ID of the project the namespace is associated with.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the namespace is associated with.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * `region`). The region in which the namespace should be created.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return `region`). The region in which the namespace should be created.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Runtime of the function. Runtimes can be fetched using [specific route](https://developers.scaleway.com/en/products/functions/api/#get-f7de6a)
     * 
     */
    @Export(name="runtime", type=String.class, parameters={})
    private Output<String> runtime;

    /**
     * @return Runtime of the function. Runtimes can be fetched using [specific route](https://developers.scaleway.com/en/products/functions/api/#get-f7de6a)
     * 
     */
    public Output<String> runtime() {
        return this.runtime;
    }
    /**
     * Holds the max duration (in seconds) the function is allowed for responding to a request
     * 
     */
    @Export(name="timeout", type=String.class, parameters={})
    private Output<String> timeout;

    /**
     * @return Holds the max duration (in seconds) the function is allowed for responding to a request
     * 
     */
    public Output<String> timeout() {
        return this.timeout;
    }
    /**
     * Location of the zip file to upload containing your function sources
     * 
     */
    @Export(name="zipFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> zipFile;

    /**
     * @return Location of the zip file to upload containing your function sources
     * 
     */
    public Output<Optional<String>> zipFile() {
        return Codegen.optional(this.zipFile);
    }
    /**
     * The hash of your source zip file, changing it will re-apply function. Can be any string
     * 
     */
    @Export(name="zipHash", type=String.class, parameters={})
    private Output</* @Nullable */ String> zipHash;

    /**
     * @return The hash of your source zip file, changing it will re-apply function. Can be any string
     * 
     */
    public Output<Optional<String>> zipHash() {
        return Codegen.optional(this.zipHash);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Function(String name) {
        this(name, FunctionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Function(String name, FunctionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Function(String name, FunctionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/function:Function", name, args == null ? FunctionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Function(String name, Output<String> id, @Nullable FunctionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/function:Function", name, state, makeResourceOptions(options, id));
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
    public static Function get(String name, Output<String> id, @Nullable FunctionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Function(name, id, state, options);
    }
}
