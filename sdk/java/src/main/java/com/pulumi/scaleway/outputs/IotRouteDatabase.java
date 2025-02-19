// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IotRouteDatabase {
    private String dbname;
    private String host;
    private String password;
    private Integer port;
    private String query;
    private String username;

    private IotRouteDatabase() {}
    public String dbname() {
        return this.dbname;
    }
    public String host() {
        return this.host;
    }
    public String password() {
        return this.password;
    }
    public Integer port() {
        return this.port;
    }
    public String query() {
        return this.query;
    }
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotRouteDatabase defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dbname;
        private String host;
        private String password;
        private Integer port;
        private String query;
        private String username;
        public Builder() {}
        public Builder(IotRouteDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbname = defaults.dbname;
    	      this.host = defaults.host;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.query = defaults.query;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder dbname(String dbname) {
            this.dbname = Objects.requireNonNull(dbname);
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public IotRouteDatabase build() {
            final var o = new IotRouteDatabase();
            o.dbname = dbname;
            o.host = host;
            o.password = password;
            o.port = port;
            o.query = query;
            o.username = username;
            return o;
        }
    }
}
