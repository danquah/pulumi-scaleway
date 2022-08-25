// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DomainRecordView {
    /**
     * @return The data of the view record
     * 
     */
    private String data;
    /**
     * @return The subnet of the view
     * 
     */
    private String subnet;

    private DomainRecordView() {}
    /**
     * @return The data of the view record
     * 
     */
    public String data() {
        return this.data;
    }
    /**
     * @return The subnet of the view
     * 
     */
    public String subnet() {
        return this.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainRecordView defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String data;
        private String subnet;
        public Builder() {}
        public Builder(DomainRecordView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.subnet = defaults.subnet;
        }

        @CustomType.Setter
        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        @CustomType.Setter
        public Builder subnet(String subnet) {
            this.subnet = Objects.requireNonNull(subnet);
            return this;
        }
        public DomainRecordView build() {
            final var o = new DomainRecordView();
            o.data = data;
            o.subnet = subnet;
            return o;
        }
    }
}
