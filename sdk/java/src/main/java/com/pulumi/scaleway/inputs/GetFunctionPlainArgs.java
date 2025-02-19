// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFunctionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionPlainArgs Empty = new GetFunctionPlainArgs();

    @Import(name="functionId")
    private @Nullable String functionId;

    public Optional<String> functionId() {
        return Optional.ofNullable(this.functionId);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="namespaceId", required=true)
    private String namespaceId;

    public String namespaceId() {
        return this.namespaceId;
    }

    private GetFunctionPlainArgs() {}

    private GetFunctionPlainArgs(GetFunctionPlainArgs $) {
        this.functionId = $.functionId;
        this.name = $.name;
        this.namespaceId = $.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionPlainArgs $;

        public Builder() {
            $ = new GetFunctionPlainArgs();
        }

        public Builder(GetFunctionPlainArgs defaults) {
            $ = new GetFunctionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder functionId(@Nullable String functionId) {
            $.functionId = functionId;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder namespaceId(String namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        public GetFunctionPlainArgs build() {
            $.namespaceId = Objects.requireNonNull($.namespaceId, "expected parameter 'namespaceId' to be non-null");
            return $;
        }
    }

}
