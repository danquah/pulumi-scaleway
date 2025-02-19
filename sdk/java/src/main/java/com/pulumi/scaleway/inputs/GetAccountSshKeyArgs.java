// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountSshKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountSshKeyArgs Empty = new GetAccountSshKeyArgs();

    /**
     * The SSH key name. Only one of `name` and `ssh_key_id` should be specified.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The SSH key name. Only one of `name` and `ssh_key_id` should be specified.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The SSH key id. Only one of `name` and `ssh_key_id` should be specified.
     * 
     */
    @Import(name="sshKeyId")
    private @Nullable Output<String> sshKeyId;

    /**
     * @return The SSH key id. Only one of `name` and `ssh_key_id` should be specified.
     * 
     */
    public Optional<Output<String>> sshKeyId() {
        return Optional.ofNullable(this.sshKeyId);
    }

    private GetAccountSshKeyArgs() {}

    private GetAccountSshKeyArgs(GetAccountSshKeyArgs $) {
        this.name = $.name;
        this.sshKeyId = $.sshKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountSshKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountSshKeyArgs $;

        public Builder() {
            $ = new GetAccountSshKeyArgs();
        }

        public Builder(GetAccountSshKeyArgs defaults) {
            $ = new GetAccountSshKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The SSH key name. Only one of `name` and `ssh_key_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The SSH key name. Only one of `name` and `ssh_key_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sshKeyId The SSH key id. Only one of `name` and `ssh_key_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder sshKeyId(@Nullable Output<String> sshKeyId) {
            $.sshKeyId = sshKeyId;
            return this;
        }

        /**
         * @param sshKeyId The SSH key id. Only one of `name` and `ssh_key_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder sshKeyId(String sshKeyId) {
            return sshKeyId(Output.of(sshKeyId));
        }

        public GetAccountSshKeyArgs build() {
            return $;
        }
    }

}
