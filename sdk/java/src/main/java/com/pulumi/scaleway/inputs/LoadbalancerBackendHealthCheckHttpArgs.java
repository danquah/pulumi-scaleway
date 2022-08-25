// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadbalancerBackendHealthCheckHttpArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadbalancerBackendHealthCheckHttpArgs Empty = new LoadbalancerBackendHealthCheckHttpArgs();

    /**
     * The expected HTTP status code.
     * 
     */
    @Import(name="code")
    private @Nullable Output<Integer> code;

    /**
     * @return The expected HTTP status code.
     * 
     */
    public Optional<Output<Integer>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * The HTTP method to use for HC requests.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return The HTTP method to use for HC requests.
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * The HTTPS endpoint URL to call for HC requests.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return The HTTPS endpoint URL to call for HC requests.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private LoadbalancerBackendHealthCheckHttpArgs() {}

    private LoadbalancerBackendHealthCheckHttpArgs(LoadbalancerBackendHealthCheckHttpArgs $) {
        this.code = $.code;
        this.method = $.method;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadbalancerBackendHealthCheckHttpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadbalancerBackendHealthCheckHttpArgs $;

        public Builder() {
            $ = new LoadbalancerBackendHealthCheckHttpArgs();
        }

        public Builder(LoadbalancerBackendHealthCheckHttpArgs defaults) {
            $ = new LoadbalancerBackendHealthCheckHttpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param code The expected HTTP status code.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<Integer> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code The expected HTTP status code.
         * 
         * @return builder
         * 
         */
        public Builder code(Integer code) {
            return code(Output.of(code));
        }

        /**
         * @param method The HTTP method to use for HC requests.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method The HTTP method to use for HC requests.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param uri The HTTPS endpoint URL to call for HC requests.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The HTTPS endpoint URL to call for HC requests.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public LoadbalancerBackendHealthCheckHttpArgs build() {
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
