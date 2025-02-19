// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadbalancerFrontendAclMatch {
    /**
     * @return The HTTP filter to match. This filter is supported only if your backend protocol has an HTTP forward protocol.
     * It extracts the request&#39;s URL path, which starts at the first slash and ends before the question mark (without the host part).
     * Possible values are: `acl_http_filter_none`, `path_begin`, `path_end`, `http_header_match` or `regex`.
     * 
     */
    private @Nullable String httpFilter;
    private @Nullable String httpFilterOption;
    /**
     * @return A list of possible values to match for the given HTTP filter.
     * Keep in mind that in the case of `http_header_match` the HTTP header field name is case-insensitive.
     * 
     */
    private @Nullable List<String> httpFilterValues;
    /**
     * @return If set to `true`, the condition will be of type &#34;unless&#34;.
     * 
     */
    private @Nullable Boolean invert;
    /**
     * @return A list of IPs or CIDR v4/v6 addresses of the client of the session to match.
     * 
     */
    private @Nullable List<String> ipSubnets;

    private LoadbalancerFrontendAclMatch() {}
    /**
     * @return The HTTP filter to match. This filter is supported only if your backend protocol has an HTTP forward protocol.
     * It extracts the request&#39;s URL path, which starts at the first slash and ends before the question mark (without the host part).
     * Possible values are: `acl_http_filter_none`, `path_begin`, `path_end`, `http_header_match` or `regex`.
     * 
     */
    public Optional<String> httpFilter() {
        return Optional.ofNullable(this.httpFilter);
    }
    public Optional<String> httpFilterOption() {
        return Optional.ofNullable(this.httpFilterOption);
    }
    /**
     * @return A list of possible values to match for the given HTTP filter.
     * Keep in mind that in the case of `http_header_match` the HTTP header field name is case-insensitive.
     * 
     */
    public List<String> httpFilterValues() {
        return this.httpFilterValues == null ? List.of() : this.httpFilterValues;
    }
    /**
     * @return If set to `true`, the condition will be of type &#34;unless&#34;.
     * 
     */
    public Optional<Boolean> invert() {
        return Optional.ofNullable(this.invert);
    }
    /**
     * @return A list of IPs or CIDR v4/v6 addresses of the client of the session to match.
     * 
     */
    public List<String> ipSubnets() {
        return this.ipSubnets == null ? List.of() : this.ipSubnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadbalancerFrontendAclMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String httpFilter;
        private @Nullable String httpFilterOption;
        private @Nullable List<String> httpFilterValues;
        private @Nullable Boolean invert;
        private @Nullable List<String> ipSubnets;
        public Builder() {}
        public Builder(LoadbalancerFrontendAclMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpFilter = defaults.httpFilter;
    	      this.httpFilterOption = defaults.httpFilterOption;
    	      this.httpFilterValues = defaults.httpFilterValues;
    	      this.invert = defaults.invert;
    	      this.ipSubnets = defaults.ipSubnets;
        }

        @CustomType.Setter
        public Builder httpFilter(@Nullable String httpFilter) {
            this.httpFilter = httpFilter;
            return this;
        }
        @CustomType.Setter
        public Builder httpFilterOption(@Nullable String httpFilterOption) {
            this.httpFilterOption = httpFilterOption;
            return this;
        }
        @CustomType.Setter
        public Builder httpFilterValues(@Nullable List<String> httpFilterValues) {
            this.httpFilterValues = httpFilterValues;
            return this;
        }
        public Builder httpFilterValues(String... httpFilterValues) {
            return httpFilterValues(List.of(httpFilterValues));
        }
        @CustomType.Setter
        public Builder invert(@Nullable Boolean invert) {
            this.invert = invert;
            return this;
        }
        @CustomType.Setter
        public Builder ipSubnets(@Nullable List<String> ipSubnets) {
            this.ipSubnets = ipSubnets;
            return this;
        }
        public Builder ipSubnets(String... ipSubnets) {
            return ipSubnets(List.of(ipSubnets));
        }
        public LoadbalancerFrontendAclMatch build() {
            final var o = new LoadbalancerFrontendAclMatch();
            o.httpFilter = httpFilter;
            o.httpFilterOption = httpFilterOption;
            o.httpFilterValues = httpFilterValues;
            o.invert = invert;
            o.ipSubnets = ipSubnets;
            return o;
        }
    }
}
