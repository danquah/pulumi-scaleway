// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DomainRecordViewArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainRecordViewArgs Empty = new DomainRecordViewArgs();

    /**
     * The data of the view record
     * 
     */
    @Import(name="data", required=true)
    private Output<String> data;

    /**
     * @return The data of the view record
     * 
     */
    public Output<String> data() {
        return this.data;
    }

    /**
     * The subnet of the view
     * 
     */
    @Import(name="subnet", required=true)
    private Output<String> subnet;

    /**
     * @return The subnet of the view
     * 
     */
    public Output<String> subnet() {
        return this.subnet;
    }

    private DomainRecordViewArgs() {}

    private DomainRecordViewArgs(DomainRecordViewArgs $) {
        this.data = $.data;
        this.subnet = $.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainRecordViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainRecordViewArgs $;

        public Builder() {
            $ = new DomainRecordViewArgs();
        }

        public Builder(DomainRecordViewArgs defaults) {
            $ = new DomainRecordViewArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param data The data of the view record
         * 
         * @return builder
         * 
         */
        public Builder data(Output<String> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data The data of the view record
         * 
         * @return builder
         * 
         */
        public Builder data(String data) {
            return data(Output.of(data));
        }

        /**
         * @param subnet The subnet of the view
         * 
         * @return builder
         * 
         */
        public Builder subnet(Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet The subnet of the view
         * 
         * @return builder
         * 
         */
        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        public DomainRecordViewArgs build() {
            $.data = Objects.requireNonNull($.data, "expected parameter 'data' to be non-null");
            $.subnet = Objects.requireNonNull($.subnet, "expected parameter 'subnet' to be non-null");
            return $;
        }
    }

}
