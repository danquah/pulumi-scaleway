// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDomainRecordGeoIpMatch {
    private List<String> continents;
    private List<String> countries;
    /**
     * @return The content of the record (an IPv4 for an `A`, a string for a `TXT`...).
     * Cannot be used with `record_id`.
     * 
     */
    private String data;

    private GetDomainRecordGeoIpMatch() {}
    public List<String> continents() {
        return this.continents;
    }
    public List<String> countries() {
        return this.countries;
    }
    /**
     * @return The content of the record (an IPv4 for an `A`, a string for a `TXT`...).
     * Cannot be used with `record_id`.
     * 
     */
    public String data() {
        return this.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainRecordGeoIpMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> continents;
        private List<String> countries;
        private String data;
        public Builder() {}
        public Builder(GetDomainRecordGeoIpMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continents = defaults.continents;
    	      this.countries = defaults.countries;
    	      this.data = defaults.data;
        }

        @CustomType.Setter
        public Builder continents(List<String> continents) {
            this.continents = Objects.requireNonNull(continents);
            return this;
        }
        public Builder continents(String... continents) {
            return continents(List.of(continents));
        }
        @CustomType.Setter
        public Builder countries(List<String> countries) {
            this.countries = Objects.requireNonNull(countries);
            return this;
        }
        public Builder countries(String... countries) {
            return countries(List.of(countries));
        }
        @CustomType.Setter
        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public GetDomainRecordGeoIpMatch build() {
            final var o = new GetDomainRecordGeoIpMatch();
            o.continents = continents;
            o.countries = countries;
            o.data = data;
            return o;
        }
    }
}
