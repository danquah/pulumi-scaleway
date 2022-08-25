// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.DomainRecordGeoIpMatchArgs;
import java.util.List;
import java.util.Objects;


public final class DomainRecordGeoIpArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainRecordGeoIpArgs Empty = new DomainRecordGeoIpArgs();

    /**
     * The list of matches. *(Can be more than 1)*
     * 
     */
    @Import(name="matches", required=true)
    private Output<List<DomainRecordGeoIpMatchArgs>> matches;

    /**
     * @return The list of matches. *(Can be more than 1)*
     * 
     */
    public Output<List<DomainRecordGeoIpMatchArgs>> matches() {
        return this.matches;
    }

    private DomainRecordGeoIpArgs() {}

    private DomainRecordGeoIpArgs(DomainRecordGeoIpArgs $) {
        this.matches = $.matches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainRecordGeoIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainRecordGeoIpArgs $;

        public Builder() {
            $ = new DomainRecordGeoIpArgs();
        }

        public Builder(DomainRecordGeoIpArgs defaults) {
            $ = new DomainRecordGeoIpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param matches The list of matches. *(Can be more than 1)*
         * 
         * @return builder
         * 
         */
        public Builder matches(Output<List<DomainRecordGeoIpMatchArgs>> matches) {
            $.matches = matches;
            return this;
        }

        /**
         * @param matches The list of matches. *(Can be more than 1)*
         * 
         * @return builder
         * 
         */
        public Builder matches(List<DomainRecordGeoIpMatchArgs> matches) {
            return matches(Output.of(matches));
        }

        /**
         * @param matches The list of matches. *(Can be more than 1)*
         * 
         * @return builder
         * 
         */
        public Builder matches(DomainRecordGeoIpMatchArgs... matches) {
            return matches(List.of(matches));
        }

        public DomainRecordGeoIpArgs build() {
            $.matches = Objects.requireNonNull($.matches, "expected parameter 'matches' to be non-null");
            return $;
        }
    }

}
