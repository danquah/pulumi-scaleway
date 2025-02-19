// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.LoadbalancerFrontendAclActionArgs;
import com.pulumi.scaleway.inputs.LoadbalancerFrontendAclMatchArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadbalancerFrontendAclArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadbalancerFrontendAclArgs Empty = new LoadbalancerFrontendAclArgs();

    /**
     * Action to undertake when an ACL filter matches.
     * 
     */
    @Import(name="action", required=true)
    private Output<LoadbalancerFrontendAclActionArgs> action;

    /**
     * @return Action to undertake when an ACL filter matches.
     * 
     */
    public Output<LoadbalancerFrontendAclActionArgs> action() {
        return this.action;
    }

    /**
     * The ACL match rule. At least `ip_subnet` or `http_filter` and `http_filter_value` are required.
     * 
     */
    @Import(name="match", required=true)
    private Output<LoadbalancerFrontendAclMatchArgs> match;

    /**
     * @return The ACL match rule. At least `ip_subnet` or `http_filter` and `http_filter_value` are required.
     * 
     */
    public Output<LoadbalancerFrontendAclMatchArgs> match() {
        return this.match;
    }

    /**
     * The ACL name. If not provided it will be randomly generated.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The ACL name. If not provided it will be randomly generated.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private LoadbalancerFrontendAclArgs() {}

    private LoadbalancerFrontendAclArgs(LoadbalancerFrontendAclArgs $) {
        this.action = $.action;
        this.match = $.match;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadbalancerFrontendAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadbalancerFrontendAclArgs $;

        public Builder() {
            $ = new LoadbalancerFrontendAclArgs();
        }

        public Builder(LoadbalancerFrontendAclArgs defaults) {
            $ = new LoadbalancerFrontendAclArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action to undertake when an ACL filter matches.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<LoadbalancerFrontendAclActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Action to undertake when an ACL filter matches.
         * 
         * @return builder
         * 
         */
        public Builder action(LoadbalancerFrontendAclActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param match The ACL match rule. At least `ip_subnet` or `http_filter` and `http_filter_value` are required.
         * 
         * @return builder
         * 
         */
        public Builder match(Output<LoadbalancerFrontendAclMatchArgs> match) {
            $.match = match;
            return this;
        }

        /**
         * @param match The ACL match rule. At least `ip_subnet` or `http_filter` and `http_filter_value` are required.
         * 
         * @return builder
         * 
         */
        public Builder match(LoadbalancerFrontendAclMatchArgs match) {
            return match(Output.of(match));
        }

        /**
         * @param name The ACL name. If not provided it will be randomly generated.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The ACL name. If not provided it will be randomly generated.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public LoadbalancerFrontendAclArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.match = Objects.requireNonNull($.match, "expected parameter 'match' to be non-null");
            return $;
        }
    }

}
