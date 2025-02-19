// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadbalancerBackendHealthCheckHttps {
    /**
     * @return The expected HTTP status code.
     * 
     */
    private @Nullable Integer code;
    /**
     * @return The HTTP method to use for HC requests.
     * 
     */
    private @Nullable String method;
    /**
     * @return The HTTPS endpoint URL to call for HC requests.
     * 
     */
    private String uri;

    private LoadbalancerBackendHealthCheckHttps() {}
    /**
     * @return The expected HTTP status code.
     * 
     */
    public Optional<Integer> code() {
        return Optional.ofNullable(this.code);
    }
    /**
     * @return The HTTP method to use for HC requests.
     * 
     */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return The HTTPS endpoint URL to call for HC requests.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadbalancerBackendHealthCheckHttps defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer code;
        private @Nullable String method;
        private String uri;
        public Builder() {}
        public Builder(LoadbalancerBackendHealthCheckHttps defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.method = defaults.method;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder code(@Nullable Integer code) {
            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable String method) {
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public LoadbalancerBackendHealthCheckHttps build() {
            final var o = new LoadbalancerBackendHealthCheckHttps();
            o.code = code;
            o.method = method;
            o.uri = uri;
            return o;
        }
    }
}
