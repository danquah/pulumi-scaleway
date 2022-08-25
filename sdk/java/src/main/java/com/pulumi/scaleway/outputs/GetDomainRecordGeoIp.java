// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scaleway.outputs.GetDomainRecordGeoIpMatch;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDomainRecordGeoIp {
    private List<GetDomainRecordGeoIpMatch> matches;

    private GetDomainRecordGeoIp() {}
    public List<GetDomainRecordGeoIpMatch> matches() {
        return this.matches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainRecordGeoIp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDomainRecordGeoIpMatch> matches;
        public Builder() {}
        public Builder(GetDomainRecordGeoIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matches = defaults.matches;
        }

        @CustomType.Setter
        public Builder matches(List<GetDomainRecordGeoIpMatch> matches) {
            this.matches = Objects.requireNonNull(matches);
            return this;
        }
        public Builder matches(GetDomainRecordGeoIpMatch... matches) {
            return matches(List.of(matches));
        }
        public GetDomainRecordGeoIp build() {
            final var o = new GetDomainRecordGeoIp();
            o.matches = matches;
            return o;
        }
    }
}
