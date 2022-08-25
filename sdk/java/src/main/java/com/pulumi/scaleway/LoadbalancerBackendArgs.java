// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.LoadbalancerBackendHealthCheckHttpArgs;
import com.pulumi.scaleway.inputs.LoadbalancerBackendHealthCheckHttpsArgs;
import com.pulumi.scaleway.inputs.LoadbalancerBackendHealthCheckTcpArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadbalancerBackendArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadbalancerBackendArgs Empty = new LoadbalancerBackendArgs();

    /**
     * User sessions will be forwarded to this port of backend servers.
     * 
     */
    @Import(name="forwardPort", required=true)
    private Output<Integer> forwardPort;

    /**
     * @return User sessions will be forwarded to this port of backend servers.
     * 
     */
    public Output<Integer> forwardPort() {
        return this.forwardPort;
    }

    /**
     * Load balancing algorithm. Possible values are: `roundrobin`, `leastconn` and `first`.
     * 
     */
    @Import(name="forwardPortAlgorithm")
    private @Nullable Output<String> forwardPortAlgorithm;

    /**
     * @return Load balancing algorithm. Possible values are: `roundrobin`, `leastconn` and `first`.
     * 
     */
    public Optional<Output<String>> forwardPortAlgorithm() {
        return Optional.ofNullable(this.forwardPortAlgorithm);
    }

    /**
     * Backend protocol. Possible values are: `tcp` or `http`.
     * 
     */
    @Import(name="forwardProtocol", required=true)
    private Output<String> forwardProtocol;

    /**
     * @return Backend protocol. Possible values are: `tcp` or `http`.
     * 
     */
    public Output<String> forwardProtocol() {
        return this.forwardProtocol;
    }

    /**
     * Interval between two HC requests.
     * 
     */
    @Import(name="healthCheckDelay")
    private @Nullable Output<String> healthCheckDelay;

    /**
     * @return Interval between two HC requests.
     * 
     */
    public Optional<Output<String>> healthCheckDelay() {
        return Optional.ofNullable(this.healthCheckDelay);
    }

    /**
     * This block enable HTTP health check. Only one of `health_check_tcp`, `health_check_http` and `health_check_https` should be specified.
     * 
     */
    @Import(name="healthCheckHttp")
    private @Nullable Output<LoadbalancerBackendHealthCheckHttpArgs> healthCheckHttp;

    /**
     * @return This block enable HTTP health check. Only one of `health_check_tcp`, `health_check_http` and `health_check_https` should be specified.
     * 
     */
    public Optional<Output<LoadbalancerBackendHealthCheckHttpArgs>> healthCheckHttp() {
        return Optional.ofNullable(this.healthCheckHttp);
    }

    /**
     * This block enable HTTPS health check. Only one of `health_check_tcp`, `health_check_http` and `health_check_https` should be specified.
     * 
     */
    @Import(name="healthCheckHttps")
    private @Nullable Output<LoadbalancerBackendHealthCheckHttpsArgs> healthCheckHttps;

    /**
     * @return This block enable HTTPS health check. Only one of `health_check_tcp`, `health_check_http` and `health_check_https` should be specified.
     * 
     */
    public Optional<Output<LoadbalancerBackendHealthCheckHttpsArgs>> healthCheckHttps() {
        return Optional.ofNullable(this.healthCheckHttps);
    }

    /**
     * Number of allowed failed HC requests before the backend server is marked down.
     * 
     */
    @Import(name="healthCheckMaxRetries")
    private @Nullable Output<Integer> healthCheckMaxRetries;

    /**
     * @return Number of allowed failed HC requests before the backend server is marked down.
     * 
     */
    public Optional<Output<Integer>> healthCheckMaxRetries() {
        return Optional.ofNullable(this.healthCheckMaxRetries);
    }

    /**
     * Port the HC requests will be send to.
     * 
     */
    @Import(name="healthCheckPort")
    private @Nullable Output<Integer> healthCheckPort;

    /**
     * @return Port the HC requests will be send to.
     * 
     */
    public Optional<Output<Integer>> healthCheckPort() {
        return Optional.ofNullable(this.healthCheckPort);
    }

    /**
     * This block enable TCP health check. Only one of `health_check_tcp`, `health_check_http` and `health_check_https` should be specified.
     * 
     */
    @Import(name="healthCheckTcp")
    private @Nullable Output<LoadbalancerBackendHealthCheckTcpArgs> healthCheckTcp;

    /**
     * @return This block enable TCP health check. Only one of `health_check_tcp`, `health_check_http` and `health_check_https` should be specified.
     * 
     */
    public Optional<Output<LoadbalancerBackendHealthCheckTcpArgs>> healthCheckTcp() {
        return Optional.ofNullable(this.healthCheckTcp);
    }

    /**
     * Timeout before we consider a HC request failed.
     * 
     */
    @Import(name="healthCheckTimeout")
    private @Nullable Output<String> healthCheckTimeout;

    /**
     * @return Timeout before we consider a HC request failed.
     * 
     */
    public Optional<Output<String>> healthCheckTimeout() {
        return Optional.ofNullable(this.healthCheckTimeout);
    }

    /**
     * The load-balancer ID this backend is attached to.
     * &gt; **Important:** Updates to `lb_id` will recreate the backend.
     * 
     */
    @Import(name="lbId", required=true)
    private Output<String> lbId;

    /**
     * @return The load-balancer ID this backend is attached to.
     * &gt; **Important:** Updates to `lb_id` will recreate the backend.
     * 
     */
    public Output<String> lbId() {
        return this.lbId;
    }

    /**
     * The name of the load-balancer backend.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the load-balancer backend.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Modify what occurs when a backend server is marked down. Possible values are: `none` and `shutdown_sessions`.
     * 
     */
    @Import(name="onMarkedDownAction")
    private @Nullable Output<String> onMarkedDownAction;

    /**
     * @return Modify what occurs when a backend server is marked down. Possible values are: `none` and `shutdown_sessions`.
     * 
     */
    public Optional<Output<String>> onMarkedDownAction() {
        return Optional.ofNullable(this.onMarkedDownAction);
    }

    /**
     * Choose the type of PROXY protocol to enable (`none`, `v1`, `v2`, `v2_ssl`, `v2_ssl_cn`)
     * 
     */
    @Import(name="proxyProtocol")
    private @Nullable Output<String> proxyProtocol;

    /**
     * @return Choose the type of PROXY protocol to enable (`none`, `v1`, `v2`, `v2_ssl`, `v2_ssl_cn`)
     * 
     */
    public Optional<Output<String>> proxyProtocol() {
        return Optional.ofNullable(this.proxyProtocol);
    }

    /**
     * DEPRECATED please use `proxy_protocol` instead - (Default: `false`) Enables PROXY protocol version 2.
     * 
     * @deprecated
     * Please use proxy_protocol instead
     * 
     */
    @Deprecated /* Please use proxy_protocol instead */
    @Import(name="sendProxyV2")
    private @Nullable Output<Boolean> sendProxyV2;

    /**
     * @return DEPRECATED please use `proxy_protocol` instead - (Default: `false`) Enables PROXY protocol version 2.
     * 
     * @deprecated
     * Please use proxy_protocol instead
     * 
     */
    @Deprecated /* Please use proxy_protocol instead */
    public Optional<Output<Boolean>> sendProxyV2() {
        return Optional.ofNullable(this.sendProxyV2);
    }

    /**
     * List of backend server IP addresses. Addresses can be either IPv4 or IPv6.
     * 
     */
    @Import(name="serverIps")
    private @Nullable Output<List<String>> serverIps;

    /**
     * @return List of backend server IP addresses. Addresses can be either IPv4 or IPv6.
     * 
     */
    public Optional<Output<List<String>>> serverIps() {
        return Optional.ofNullable(this.serverIps);
    }

    /**
     * Load balancing algorithm. Possible values are: `none`, `cookie` and `table`.
     * 
     */
    @Import(name="stickySessions")
    private @Nullable Output<String> stickySessions;

    /**
     * @return Load balancing algorithm. Possible values are: `none`, `cookie` and `table`.
     * 
     */
    public Optional<Output<String>> stickySessions() {
        return Optional.ofNullable(this.stickySessions);
    }

    /**
     * Cookie name for for sticky sessions. Only applicable when sticky_sessions is set to `cookie`.
     * 
     */
    @Import(name="stickySessionsCookieName")
    private @Nullable Output<String> stickySessionsCookieName;

    /**
     * @return Cookie name for for sticky sessions. Only applicable when sticky_sessions is set to `cookie`.
     * 
     */
    public Optional<Output<String>> stickySessionsCookieName() {
        return Optional.ofNullable(this.stickySessionsCookieName);
    }

    /**
     * Maximum initial server connection establishment time. (e.g.: `1s`)
     * 
     */
    @Import(name="timeoutConnect")
    private @Nullable Output<String> timeoutConnect;

    /**
     * @return Maximum initial server connection establishment time. (e.g.: `1s`)
     * 
     */
    public Optional<Output<String>> timeoutConnect() {
        return Optional.ofNullable(this.timeoutConnect);
    }

    /**
     * Maximum server connection inactivity time. (e.g.: `1s`)
     * 
     */
    @Import(name="timeoutServer")
    private @Nullable Output<String> timeoutServer;

    /**
     * @return Maximum server connection inactivity time. (e.g.: `1s`)
     * 
     */
    public Optional<Output<String>> timeoutServer() {
        return Optional.ofNullable(this.timeoutServer);
    }

    /**
     * Maximum tunnel inactivity time. (e.g.: `1s`)
     * 
     */
    @Import(name="timeoutTunnel")
    private @Nullable Output<String> timeoutTunnel;

    /**
     * @return Maximum tunnel inactivity time. (e.g.: `1s`)
     * 
     */
    public Optional<Output<String>> timeoutTunnel() {
        return Optional.ofNullable(this.timeoutTunnel);
    }

    private LoadbalancerBackendArgs() {}

    private LoadbalancerBackendArgs(LoadbalancerBackendArgs $) {
        this.forwardPort = $.forwardPort;
        this.forwardPortAlgorithm = $.forwardPortAlgorithm;
        this.forwardProtocol = $.forwardProtocol;
        this.healthCheckDelay = $.healthCheckDelay;
        this.healthCheckHttp = $.healthCheckHttp;
        this.healthCheckHttps = $.healthCheckHttps;
        this.healthCheckMaxRetries = $.healthCheckMaxRetries;
        this.healthCheckPort = $.healthCheckPort;
        this.healthCheckTcp = $.healthCheckTcp;
        this.healthCheckTimeout = $.healthCheckTimeout;
        this.lbId = $.lbId;
        this.name = $.name;
        this.onMarkedDownAction = $.onMarkedDownAction;
        this.proxyProtocol = $.proxyProtocol;
        this.sendProxyV2 = $.sendProxyV2;
        this.serverIps = $.serverIps;
        this.stickySessions = $.stickySessions;
        this.stickySessionsCookieName = $.stickySessionsCookieName;
        this.timeoutConnect = $.timeoutConnect;
        this.timeoutServer = $.timeoutServer;
        this.timeoutTunnel = $.timeoutTunnel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadbalancerBackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadbalancerBackendArgs $;

        public Builder() {
            $ = new LoadbalancerBackendArgs();
        }

        public Builder(LoadbalancerBackendArgs defaults) {
            $ = new LoadbalancerBackendArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param forwardPort User sessions will be forwarded to this port of backend servers.
         * 
         * @return builder
         * 
         */
        public Builder forwardPort(Output<Integer> forwardPort) {
            $.forwardPort = forwardPort;
            return this;
        }

        /**
         * @param forwardPort User sessions will be forwarded to this port of backend servers.
         * 
         * @return builder
         * 
         */
        public Builder forwardPort(Integer forwardPort) {
            return forwardPort(Output.of(forwardPort));
        }

        /**
         * @param forwardPortAlgorithm Load balancing algorithm. Possible values are: `roundrobin`, `leastconn` and `first`.
         * 
         * @return builder
         * 
         */
        public Builder forwardPortAlgorithm(@Nullable Output<String> forwardPortAlgorithm) {
            $.forwardPortAlgorithm = forwardPortAlgorithm;
            return this;
        }

        /**
         * @param forwardPortAlgorithm Load balancing algorithm. Possible values are: `roundrobin`, `leastconn` and `first`.
         * 
         * @return builder
         * 
         */
        public Builder forwardPortAlgorithm(String forwardPortAlgorithm) {
            return forwardPortAlgorithm(Output.of(forwardPortAlgorithm));
        }

        /**
         * @param forwardProtocol Backend protocol. Possible values are: `tcp` or `http`.
         * 
         * @return builder
         * 
         */
        public Builder forwardProtocol(Output<String> forwardProtocol) {
            $.forwardProtocol = forwardProtocol;
            return this;
        }

        /**
         * @param forwardProtocol Backend protocol. Possible values are: `tcp` or `http`.
         * 
         * @return builder
         * 
         */
        public Builder forwardProtocol(String forwardProtocol) {
            return forwardProtocol(Output.of(forwardProtocol));
        }

        /**
         * @param healthCheckDelay Interval between two HC requests.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckDelay(@Nullable Output<String> healthCheckDelay) {
            $.healthCheckDelay = healthCheckDelay;
            return this;
        }

        /**
         * @param healthCheckDelay Interval between two HC requests.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckDelay(String healthCheckDelay) {
            return healthCheckDelay(Output.of(healthCheckDelay));
        }

        /**
         * @param healthCheckHttp This block enable HTTP health check. Only one of `health_check_tcp`, `health_check_http` and `health_check_https` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckHttp(@Nullable Output<LoadbalancerBackendHealthCheckHttpArgs> healthCheckHttp) {
            $.healthCheckHttp = healthCheckHttp;
            return this;
        }

        /**
         * @param healthCheckHttp This block enable HTTP health check. Only one of `health_check_tcp`, `health_check_http` and `health_check_https` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckHttp(LoadbalancerBackendHealthCheckHttpArgs healthCheckHttp) {
            return healthCheckHttp(Output.of(healthCheckHttp));
        }

        /**
         * @param healthCheckHttps This block enable HTTPS health check. Only one of `health_check_tcp`, `health_check_http` and `health_check_https` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckHttps(@Nullable Output<LoadbalancerBackendHealthCheckHttpsArgs> healthCheckHttps) {
            $.healthCheckHttps = healthCheckHttps;
            return this;
        }

        /**
         * @param healthCheckHttps This block enable HTTPS health check. Only one of `health_check_tcp`, `health_check_http` and `health_check_https` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckHttps(LoadbalancerBackendHealthCheckHttpsArgs healthCheckHttps) {
            return healthCheckHttps(Output.of(healthCheckHttps));
        }

        /**
         * @param healthCheckMaxRetries Number of allowed failed HC requests before the backend server is marked down.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckMaxRetries(@Nullable Output<Integer> healthCheckMaxRetries) {
            $.healthCheckMaxRetries = healthCheckMaxRetries;
            return this;
        }

        /**
         * @param healthCheckMaxRetries Number of allowed failed HC requests before the backend server is marked down.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckMaxRetries(Integer healthCheckMaxRetries) {
            return healthCheckMaxRetries(Output.of(healthCheckMaxRetries));
        }

        /**
         * @param healthCheckPort Port the HC requests will be send to.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckPort(@Nullable Output<Integer> healthCheckPort) {
            $.healthCheckPort = healthCheckPort;
            return this;
        }

        /**
         * @param healthCheckPort Port the HC requests will be send to.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckPort(Integer healthCheckPort) {
            return healthCheckPort(Output.of(healthCheckPort));
        }

        /**
         * @param healthCheckTcp This block enable TCP health check. Only one of `health_check_tcp`, `health_check_http` and `health_check_https` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckTcp(@Nullable Output<LoadbalancerBackendHealthCheckTcpArgs> healthCheckTcp) {
            $.healthCheckTcp = healthCheckTcp;
            return this;
        }

        /**
         * @param healthCheckTcp This block enable TCP health check. Only one of `health_check_tcp`, `health_check_http` and `health_check_https` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckTcp(LoadbalancerBackendHealthCheckTcpArgs healthCheckTcp) {
            return healthCheckTcp(Output.of(healthCheckTcp));
        }

        /**
         * @param healthCheckTimeout Timeout before we consider a HC request failed.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckTimeout(@Nullable Output<String> healthCheckTimeout) {
            $.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * @param healthCheckTimeout Timeout before we consider a HC request failed.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckTimeout(String healthCheckTimeout) {
            return healthCheckTimeout(Output.of(healthCheckTimeout));
        }

        /**
         * @param lbId The load-balancer ID this backend is attached to.
         * &gt; **Important:** Updates to `lb_id` will recreate the backend.
         * 
         * @return builder
         * 
         */
        public Builder lbId(Output<String> lbId) {
            $.lbId = lbId;
            return this;
        }

        /**
         * @param lbId The load-balancer ID this backend is attached to.
         * &gt; **Important:** Updates to `lb_id` will recreate the backend.
         * 
         * @return builder
         * 
         */
        public Builder lbId(String lbId) {
            return lbId(Output.of(lbId));
        }

        /**
         * @param name The name of the load-balancer backend.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the load-balancer backend.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param onMarkedDownAction Modify what occurs when a backend server is marked down. Possible values are: `none` and `shutdown_sessions`.
         * 
         * @return builder
         * 
         */
        public Builder onMarkedDownAction(@Nullable Output<String> onMarkedDownAction) {
            $.onMarkedDownAction = onMarkedDownAction;
            return this;
        }

        /**
         * @param onMarkedDownAction Modify what occurs when a backend server is marked down. Possible values are: `none` and `shutdown_sessions`.
         * 
         * @return builder
         * 
         */
        public Builder onMarkedDownAction(String onMarkedDownAction) {
            return onMarkedDownAction(Output.of(onMarkedDownAction));
        }

        /**
         * @param proxyProtocol Choose the type of PROXY protocol to enable (`none`, `v1`, `v2`, `v2_ssl`, `v2_ssl_cn`)
         * 
         * @return builder
         * 
         */
        public Builder proxyProtocol(@Nullable Output<String> proxyProtocol) {
            $.proxyProtocol = proxyProtocol;
            return this;
        }

        /**
         * @param proxyProtocol Choose the type of PROXY protocol to enable (`none`, `v1`, `v2`, `v2_ssl`, `v2_ssl_cn`)
         * 
         * @return builder
         * 
         */
        public Builder proxyProtocol(String proxyProtocol) {
            return proxyProtocol(Output.of(proxyProtocol));
        }

        /**
         * @param sendProxyV2 DEPRECATED please use `proxy_protocol` instead - (Default: `false`) Enables PROXY protocol version 2.
         * 
         * @return builder
         * 
         * @deprecated
         * Please use proxy_protocol instead
         * 
         */
        @Deprecated /* Please use proxy_protocol instead */
        public Builder sendProxyV2(@Nullable Output<Boolean> sendProxyV2) {
            $.sendProxyV2 = sendProxyV2;
            return this;
        }

        /**
         * @param sendProxyV2 DEPRECATED please use `proxy_protocol` instead - (Default: `false`) Enables PROXY protocol version 2.
         * 
         * @return builder
         * 
         * @deprecated
         * Please use proxy_protocol instead
         * 
         */
        @Deprecated /* Please use proxy_protocol instead */
        public Builder sendProxyV2(Boolean sendProxyV2) {
            return sendProxyV2(Output.of(sendProxyV2));
        }

        /**
         * @param serverIps List of backend server IP addresses. Addresses can be either IPv4 or IPv6.
         * 
         * @return builder
         * 
         */
        public Builder serverIps(@Nullable Output<List<String>> serverIps) {
            $.serverIps = serverIps;
            return this;
        }

        /**
         * @param serverIps List of backend server IP addresses. Addresses can be either IPv4 or IPv6.
         * 
         * @return builder
         * 
         */
        public Builder serverIps(List<String> serverIps) {
            return serverIps(Output.of(serverIps));
        }

        /**
         * @param serverIps List of backend server IP addresses. Addresses can be either IPv4 or IPv6.
         * 
         * @return builder
         * 
         */
        public Builder serverIps(String... serverIps) {
            return serverIps(List.of(serverIps));
        }

        /**
         * @param stickySessions Load balancing algorithm. Possible values are: `none`, `cookie` and `table`.
         * 
         * @return builder
         * 
         */
        public Builder stickySessions(@Nullable Output<String> stickySessions) {
            $.stickySessions = stickySessions;
            return this;
        }

        /**
         * @param stickySessions Load balancing algorithm. Possible values are: `none`, `cookie` and `table`.
         * 
         * @return builder
         * 
         */
        public Builder stickySessions(String stickySessions) {
            return stickySessions(Output.of(stickySessions));
        }

        /**
         * @param stickySessionsCookieName Cookie name for for sticky sessions. Only applicable when sticky_sessions is set to `cookie`.
         * 
         * @return builder
         * 
         */
        public Builder stickySessionsCookieName(@Nullable Output<String> stickySessionsCookieName) {
            $.stickySessionsCookieName = stickySessionsCookieName;
            return this;
        }

        /**
         * @param stickySessionsCookieName Cookie name for for sticky sessions. Only applicable when sticky_sessions is set to `cookie`.
         * 
         * @return builder
         * 
         */
        public Builder stickySessionsCookieName(String stickySessionsCookieName) {
            return stickySessionsCookieName(Output.of(stickySessionsCookieName));
        }

        /**
         * @param timeoutConnect Maximum initial server connection establishment time. (e.g.: `1s`)
         * 
         * @return builder
         * 
         */
        public Builder timeoutConnect(@Nullable Output<String> timeoutConnect) {
            $.timeoutConnect = timeoutConnect;
            return this;
        }

        /**
         * @param timeoutConnect Maximum initial server connection establishment time. (e.g.: `1s`)
         * 
         * @return builder
         * 
         */
        public Builder timeoutConnect(String timeoutConnect) {
            return timeoutConnect(Output.of(timeoutConnect));
        }

        /**
         * @param timeoutServer Maximum server connection inactivity time. (e.g.: `1s`)
         * 
         * @return builder
         * 
         */
        public Builder timeoutServer(@Nullable Output<String> timeoutServer) {
            $.timeoutServer = timeoutServer;
            return this;
        }

        /**
         * @param timeoutServer Maximum server connection inactivity time. (e.g.: `1s`)
         * 
         * @return builder
         * 
         */
        public Builder timeoutServer(String timeoutServer) {
            return timeoutServer(Output.of(timeoutServer));
        }

        /**
         * @param timeoutTunnel Maximum tunnel inactivity time. (e.g.: `1s`)
         * 
         * @return builder
         * 
         */
        public Builder timeoutTunnel(@Nullable Output<String> timeoutTunnel) {
            $.timeoutTunnel = timeoutTunnel;
            return this;
        }

        /**
         * @param timeoutTunnel Maximum tunnel inactivity time. (e.g.: `1s`)
         * 
         * @return builder
         * 
         */
        public Builder timeoutTunnel(String timeoutTunnel) {
            return timeoutTunnel(Output.of(timeoutTunnel));
        }

        public LoadbalancerBackendArgs build() {
            $.forwardPort = Objects.requireNonNull($.forwardPort, "expected parameter 'forwardPort' to be non-null");
            $.forwardProtocol = Objects.requireNonNull($.forwardProtocol, "expected parameter 'forwardProtocol' to be non-null");
            $.lbId = Objects.requireNonNull($.lbId, "expected parameter 'lbId' to be non-null");
            return $;
        }
    }

}
