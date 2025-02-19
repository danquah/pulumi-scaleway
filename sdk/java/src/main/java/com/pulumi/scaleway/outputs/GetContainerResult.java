// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetContainerResult {
    private @Nullable String containerId;
    /**
     * @return The amount of vCPU computing resources to allocate to each container. Defaults  to 70.
     * 
     */
    private Integer cpuLimit;
    /**
     * @return The cron status of the container.
     * 
     */
    private String cronStatus;
    /**
     * @return Boolean indicating whether the container is on a production environment.
     * 
     */
    private Boolean deploy;
    private String description;
    /**
     * @return The container domain name.
     * 
     */
    private String domainName;
    /**
     * @return The [environment](https://www.scaleway.com/en/docs/compute/containers/concepts/#environment-variables) variables of the container.
     * 
     */
    private Map<String,String> environmentVariables;
    /**
     * @return The error message of the container.
     * 
     */
    private String errorMessage;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The maximum number of simultaneous requests your container can handle at the same time. Defaults to 50.
     * 
     */
    private Integer maxConcurrency;
    /**
     * @return The maximum of number of instances this container can scale to. Default to 20.
     * 
     */
    private Integer maxScale;
    /**
     * @return The memory computing resources in MB to allocate to each container. Defaults to 128.
     * 
     */
    private Integer memoryLimit;
    /**
     * @return The minimum of running container instances continuously. Defaults to 0.
     * 
     */
    private Integer minScale;
    private @Nullable String name;
    private String namespaceId;
    /**
     * @return The port to expose the container. Defaults to 8080.
     * 
     */
    private Integer port;
    /**
     * @return The privacy type define the way to authenticate to your container. Please check our dedicated [section](https://developers.scaleway.com/en/products/containers/api/#protocol-9dd4c8).
     * 
     */
    private String privacy;
    /**
     * @return The communication [protocol](https://developers.scaleway.com/en/products/containers/api/#protocol-9dd4c8) http1 or h2c. Defaults to http1.
     * 
     */
    private String protocol;
    /**
     * @return (Defaults to provider `region`) The region in which the container was created.
     * 
     */
    private @Nullable String region;
    /**
     * @return The registry image address. e.g: **&#34;rg.fr-par.scw.cloud/$NAMESPACE/$IMAGE&#34;**.
     * 
     */
    private String registryImage;
    /**
     * @return The sha256 of your source registry image, changing it will re-apply the deployment. Can be any string.
     * 
     */
    private String registrySha256;
    /**
     * @return The container status.
     * 
     */
    private String status;
    /**
     * @return The maximum amount of time in seconds during which your container can process a request before we stop it. Defaults to 300s.
     * 
     */
    private Integer timeout;

    private GetContainerResult() {}
    public Optional<String> containerId() {
        return Optional.ofNullable(this.containerId);
    }
    /**
     * @return The amount of vCPU computing resources to allocate to each container. Defaults  to 70.
     * 
     */
    public Integer cpuLimit() {
        return this.cpuLimit;
    }
    /**
     * @return The cron status of the container.
     * 
     */
    public String cronStatus() {
        return this.cronStatus;
    }
    /**
     * @return Boolean indicating whether the container is on a production environment.
     * 
     */
    public Boolean deploy() {
        return this.deploy;
    }
    public String description() {
        return this.description;
    }
    /**
     * @return The container domain name.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return The [environment](https://www.scaleway.com/en/docs/compute/containers/concepts/#environment-variables) variables of the container.
     * 
     */
    public Map<String,String> environmentVariables() {
        return this.environmentVariables;
    }
    /**
     * @return The error message of the container.
     * 
     */
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The maximum number of simultaneous requests your container can handle at the same time. Defaults to 50.
     * 
     */
    public Integer maxConcurrency() {
        return this.maxConcurrency;
    }
    /**
     * @return The maximum of number of instances this container can scale to. Default to 20.
     * 
     */
    public Integer maxScale() {
        return this.maxScale;
    }
    /**
     * @return The memory computing resources in MB to allocate to each container. Defaults to 128.
     * 
     */
    public Integer memoryLimit() {
        return this.memoryLimit;
    }
    /**
     * @return The minimum of running container instances continuously. Defaults to 0.
     * 
     */
    public Integer minScale() {
        return this.minScale;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String namespaceId() {
        return this.namespaceId;
    }
    /**
     * @return The port to expose the container. Defaults to 8080.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The privacy type define the way to authenticate to your container. Please check our dedicated [section](https://developers.scaleway.com/en/products/containers/api/#protocol-9dd4c8).
     * 
     */
    public String privacy() {
        return this.privacy;
    }
    /**
     * @return The communication [protocol](https://developers.scaleway.com/en/products/containers/api/#protocol-9dd4c8) http1 or h2c. Defaults to http1.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return (Defaults to provider `region`) The region in which the container was created.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return The registry image address. e.g: **&#34;rg.fr-par.scw.cloud/$NAMESPACE/$IMAGE&#34;**.
     * 
     */
    public String registryImage() {
        return this.registryImage;
    }
    /**
     * @return The sha256 of your source registry image, changing it will re-apply the deployment. Can be any string.
     * 
     */
    public String registrySha256() {
        return this.registrySha256;
    }
    /**
     * @return The container status.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The maximum amount of time in seconds during which your container can process a request before we stop it. Defaults to 300s.
     * 
     */
    public Integer timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String containerId;
        private Integer cpuLimit;
        private String cronStatus;
        private Boolean deploy;
        private String description;
        private String domainName;
        private Map<String,String> environmentVariables;
        private String errorMessage;
        private String id;
        private Integer maxConcurrency;
        private Integer maxScale;
        private Integer memoryLimit;
        private Integer minScale;
        private @Nullable String name;
        private String namespaceId;
        private Integer port;
        private String privacy;
        private String protocol;
        private @Nullable String region;
        private String registryImage;
        private String registrySha256;
        private String status;
        private Integer timeout;
        public Builder() {}
        public Builder(GetContainerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerId = defaults.containerId;
    	      this.cpuLimit = defaults.cpuLimit;
    	      this.cronStatus = defaults.cronStatus;
    	      this.deploy = defaults.deploy;
    	      this.description = defaults.description;
    	      this.domainName = defaults.domainName;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.errorMessage = defaults.errorMessage;
    	      this.id = defaults.id;
    	      this.maxConcurrency = defaults.maxConcurrency;
    	      this.maxScale = defaults.maxScale;
    	      this.memoryLimit = defaults.memoryLimit;
    	      this.minScale = defaults.minScale;
    	      this.name = defaults.name;
    	      this.namespaceId = defaults.namespaceId;
    	      this.port = defaults.port;
    	      this.privacy = defaults.privacy;
    	      this.protocol = defaults.protocol;
    	      this.region = defaults.region;
    	      this.registryImage = defaults.registryImage;
    	      this.registrySha256 = defaults.registrySha256;
    	      this.status = defaults.status;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder containerId(@Nullable String containerId) {
            this.containerId = containerId;
            return this;
        }
        @CustomType.Setter
        public Builder cpuLimit(Integer cpuLimit) {
            this.cpuLimit = Objects.requireNonNull(cpuLimit);
            return this;
        }
        @CustomType.Setter
        public Builder cronStatus(String cronStatus) {
            this.cronStatus = Objects.requireNonNull(cronStatus);
            return this;
        }
        @CustomType.Setter
        public Builder deploy(Boolean deploy) {
            this.deploy = Objects.requireNonNull(deploy);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        @CustomType.Setter
        public Builder environmentVariables(Map<String,String> environmentVariables) {
            this.environmentVariables = Objects.requireNonNull(environmentVariables);
            return this;
        }
        @CustomType.Setter
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder maxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = Objects.requireNonNull(maxConcurrency);
            return this;
        }
        @CustomType.Setter
        public Builder maxScale(Integer maxScale) {
            this.maxScale = Objects.requireNonNull(maxScale);
            return this;
        }
        @CustomType.Setter
        public Builder memoryLimit(Integer memoryLimit) {
            this.memoryLimit = Objects.requireNonNull(memoryLimit);
            return this;
        }
        @CustomType.Setter
        public Builder minScale(Integer minScale) {
            this.minScale = Objects.requireNonNull(minScale);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = Objects.requireNonNull(namespaceId);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder privacy(String privacy) {
            this.privacy = Objects.requireNonNull(privacy);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder registryImage(String registryImage) {
            this.registryImage = Objects.requireNonNull(registryImage);
            return this;
        }
        @CustomType.Setter
        public Builder registrySha256(String registrySha256) {
            this.registrySha256 = Objects.requireNonNull(registrySha256);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder timeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public GetContainerResult build() {
            final var o = new GetContainerResult();
            o.containerId = containerId;
            o.cpuLimit = cpuLimit;
            o.cronStatus = cronStatus;
            o.deploy = deploy;
            o.description = description;
            o.domainName = domainName;
            o.environmentVariables = environmentVariables;
            o.errorMessage = errorMessage;
            o.id = id;
            o.maxConcurrency = maxConcurrency;
            o.maxScale = maxScale;
            o.memoryLimit = memoryLimit;
            o.minScale = minScale;
            o.name = name;
            o.namespaceId = namespaceId;
            o.port = port;
            o.privacy = privacy;
            o.protocol = protocol;
            o.region = region;
            o.registryImage = registryImage;
            o.registrySha256 = registrySha256;
            o.status = status;
            o.timeout = timeout;
            return o;
        }
    }
}
