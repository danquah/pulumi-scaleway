// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LoadbalancerFrontendAclActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadbalancerFrontendAclActionArgs Empty = new LoadbalancerFrontendAclActionArgs();

    /**
     * The action type. Possible values are: `allow` or `deny`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The action type. Possible values are: `allow` or `deny`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private LoadbalancerFrontendAclActionArgs() {}

    private LoadbalancerFrontendAclActionArgs(LoadbalancerFrontendAclActionArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadbalancerFrontendAclActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadbalancerFrontendAclActionArgs $;

        public Builder() {
            $ = new LoadbalancerFrontendAclActionArgs();
        }

        public Builder(LoadbalancerFrontendAclActionArgs defaults) {
            $ = new LoadbalancerFrontendAclActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The action type. Possible values are: `allow` or `deny`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The action type. Possible values are: `allow` or `deny`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public LoadbalancerFrontendAclActionArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
