// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.DatabaseBackupArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.DatabaseBackupState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages Scaleway RDB database backup.
 * For more information, see [the documentation](https://developers.scaleway.com/en/products/rdb/api).
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
 * import com.pulumi.scaleway.DatabaseBackup;
 * import com.pulumi.scaleway.DatabaseBackupArgs;
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
 *         var main = new DatabaseBackup(&#34;main&#34;, DatabaseBackupArgs.builder()        
 *             .instanceId(data.scaleway_rdb_instance().main().id())
 *             .databaseName(data.scaleway_rdb_database().main().name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ### With expiration
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.DatabaseBackup;
 * import com.pulumi.scaleway.DatabaseBackupArgs;
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
 *         var main = new DatabaseBackup(&#34;main&#34;, DatabaseBackupArgs.builder()        
 *             .instanceId(data.scaleway_rdb_instance().main().id())
 *             .databaseName(data.scaleway_rdb_database().main().name())
 *             .expiresAt(&#34;2022-06-16T07:48:44Z&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * RDB Database can be imported using the `{region}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/databaseBackup:DatabaseBackup mybackup fr-par/11111111-1111-1111-1111-111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/databaseBackup:DatabaseBackup")
public class DatabaseBackup extends com.pulumi.resources.CustomResource {
    /**
     * Creation date (Format ISO 8601).
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Creation date (Format ISO 8601).
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Name of the database of this backup.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return Name of the database of this backup.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    /**
     * Expiration date (Format ISO 8601).
     * 
     */
    @Export(name="expiresAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> expiresAt;

    /**
     * @return Expiration date (Format ISO 8601).
     * 
     */
    public Output<Optional<String>> expiresAt() {
        return Codegen.optional(this.expiresAt);
    }
    /**
     * UUID of the instance where the database to backup is.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return UUID of the instance where the database to backup is.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Name of the instance of the backup.
     * 
     */
    @Export(name="instanceName", type=String.class, parameters={})
    private Output<String> instanceName;

    /**
     * @return Name of the instance of the backup.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }
    /**
     * Name of the database (e.g. `my-database`).
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the database (e.g. `my-database`).
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The region you want to attach the resource to
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region you want to attach the resource to
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Size of the backup (in bytes).
     * 
     */
    @Export(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    /**
     * @return Size of the backup (in bytes).
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }
    /**
     * Updated date (Format ISO 8601).
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return Updated date (Format ISO 8601).
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseBackup(String name) {
        this(name, DatabaseBackupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseBackup(String name, DatabaseBackupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseBackup(String name, DatabaseBackupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/databaseBackup:DatabaseBackup", name, args == null ? DatabaseBackupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseBackup(String name, Output<String> id, @Nullable DatabaseBackupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/databaseBackup:DatabaseBackup", name, state, makeResourceOptions(options, id));
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
    public static DatabaseBackup get(String name, Output<String> id, @Nullable DatabaseBackupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseBackup(name, id, state, options);
    }
}
