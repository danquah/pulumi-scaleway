// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.IotDeviceArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.IotDeviceState;
import com.pulumi.scaleway.outputs.IotDeviceCertificate;
import com.pulumi.scaleway.outputs.IotDeviceMessageFilters;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * IoT devices can be imported using the `{region}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/iotDevice:IotDevice device01 fr-par/11111111-1111-1111-1111-111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/iotDevice:IotDevice")
public class IotDevice extends com.pulumi.resources.CustomResource {
    /**
     * Allow plain and server-authenticated TLS connections in addition to mutually-authenticated ones.
     * 
     */
    @Export(name="allowInsecure", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowInsecure;

    /**
     * @return Allow plain and server-authenticated TLS connections in addition to mutually-authenticated ones.
     * 
     */
    public Output<Optional<Boolean>> allowInsecure() {
        return Codegen.optional(this.allowInsecure);
    }
    /**
     * Allow more than one simultaneous connection using the same device credentials.
     * 
     */
    @Export(name="allowMultipleConnections", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowMultipleConnections;

    /**
     * @return Allow more than one simultaneous connection using the same device credentials.
     * 
     */
    public Output<Optional<Boolean>> allowMultipleConnections() {
        return Codegen.optional(this.allowMultipleConnections);
    }
    /**
     * The certificate bundle of the device.
     * 
     */
    @Export(name="certificate", type=IotDeviceCertificate.class, parameters={})
    private Output<IotDeviceCertificate> certificate;

    /**
     * @return The certificate bundle of the device.
     * 
     */
    public Output<IotDeviceCertificate> certificate() {
        return this.certificate;
    }
    /**
     * The date and time the device was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The date and time the device was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The description of the IoT device (e.g. `living room`).
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the IoT device (e.g. `living room`).
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the hub on which this device will be created.
     * 
     */
    @Export(name="hubId", type=String.class, parameters={})
    private Output<String> hubId;

    /**
     * @return The ID of the hub on which this device will be created.
     * 
     */
    public Output<String> hubId() {
        return this.hubId;
    }
    /**
     * The current connection status of the device.
     * 
     */
    @Export(name="isConnected", type=Boolean.class, parameters={})
    private Output<Boolean> isConnected;

    /**
     * @return The current connection status of the device.
     * 
     */
    public Output<Boolean> isConnected() {
        return this.isConnected;
    }
    /**
     * The last MQTT activity of the device.
     * 
     */
    @Export(name="lastActivityAt", type=String.class, parameters={})
    private Output<String> lastActivityAt;

    /**
     * @return The last MQTT activity of the device.
     * 
     */
    public Output<String> lastActivityAt() {
        return this.lastActivityAt;
    }
    /**
     * Rules that define which messages are authorized or denied based on their topic.
     * 
     */
    @Export(name="messageFilters", type=IotDeviceMessageFilters.class, parameters={})
    private Output</* @Nullable */ IotDeviceMessageFilters> messageFilters;

    /**
     * @return Rules that define which messages are authorized or denied based on their topic.
     * 
     */
    public Output<Optional<IotDeviceMessageFilters>> messageFilters() {
        return Codegen.optional(this.messageFilters);
    }
    /**
     * The name of the IoT device you want to create (e.g. `my-device`).
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the IoT device you want to create (e.g. `my-device`).
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
     * The current status of the device.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The current status of the device.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The date and time the device resource was updated.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The date and time the device resource was updated.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IotDevice(String name) {
        this(name, IotDeviceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IotDevice(String name, IotDeviceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IotDevice(String name, IotDeviceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/iotDevice:IotDevice", name, args == null ? IotDeviceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IotDevice(String name, Output<String> id, @Nullable IotDeviceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/iotDevice:IotDevice", name, state, makeResourceOptions(options, id));
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
    public static IotDevice get(String name, Output<String> id, @Nullable IotDeviceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IotDevice(name, id, state, options);
    }
}
