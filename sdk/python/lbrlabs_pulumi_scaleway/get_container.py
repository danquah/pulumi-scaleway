# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetContainerResult',
    'AwaitableGetContainerResult',
    'get_container',
    'get_container_output',
]

@pulumi.output_type
class GetContainerResult:
    """
    A collection of values returned by getContainer.
    """
    def __init__(__self__, container_id=None, cpu_limit=None, cron_status=None, deploy=None, description=None, domain_name=None, environment_variables=None, error_message=None, id=None, max_concurrency=None, max_scale=None, memory_limit=None, min_scale=None, name=None, namespace_id=None, port=None, privacy=None, protocol=None, region=None, registry_image=None, registry_sha256=None, status=None, timeout=None):
        if container_id and not isinstance(container_id, str):
            raise TypeError("Expected argument 'container_id' to be a str")
        pulumi.set(__self__, "container_id", container_id)
        if cpu_limit and not isinstance(cpu_limit, int):
            raise TypeError("Expected argument 'cpu_limit' to be a int")
        pulumi.set(__self__, "cpu_limit", cpu_limit)
        if cron_status and not isinstance(cron_status, str):
            raise TypeError("Expected argument 'cron_status' to be a str")
        pulumi.set(__self__, "cron_status", cron_status)
        if deploy and not isinstance(deploy, bool):
            raise TypeError("Expected argument 'deploy' to be a bool")
        pulumi.set(__self__, "deploy", deploy)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if domain_name and not isinstance(domain_name, str):
            raise TypeError("Expected argument 'domain_name' to be a str")
        pulumi.set(__self__, "domain_name", domain_name)
        if environment_variables and not isinstance(environment_variables, dict):
            raise TypeError("Expected argument 'environment_variables' to be a dict")
        pulumi.set(__self__, "environment_variables", environment_variables)
        if error_message and not isinstance(error_message, str):
            raise TypeError("Expected argument 'error_message' to be a str")
        pulumi.set(__self__, "error_message", error_message)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if max_concurrency and not isinstance(max_concurrency, int):
            raise TypeError("Expected argument 'max_concurrency' to be a int")
        pulumi.set(__self__, "max_concurrency", max_concurrency)
        if max_scale and not isinstance(max_scale, int):
            raise TypeError("Expected argument 'max_scale' to be a int")
        pulumi.set(__self__, "max_scale", max_scale)
        if memory_limit and not isinstance(memory_limit, int):
            raise TypeError("Expected argument 'memory_limit' to be a int")
        pulumi.set(__self__, "memory_limit", memory_limit)
        if min_scale and not isinstance(min_scale, int):
            raise TypeError("Expected argument 'min_scale' to be a int")
        pulumi.set(__self__, "min_scale", min_scale)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if namespace_id and not isinstance(namespace_id, str):
            raise TypeError("Expected argument 'namespace_id' to be a str")
        pulumi.set(__self__, "namespace_id", namespace_id)
        if port and not isinstance(port, int):
            raise TypeError("Expected argument 'port' to be a int")
        pulumi.set(__self__, "port", port)
        if privacy and not isinstance(privacy, str):
            raise TypeError("Expected argument 'privacy' to be a str")
        pulumi.set(__self__, "privacy", privacy)
        if protocol and not isinstance(protocol, str):
            raise TypeError("Expected argument 'protocol' to be a str")
        pulumi.set(__self__, "protocol", protocol)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if registry_image and not isinstance(registry_image, str):
            raise TypeError("Expected argument 'registry_image' to be a str")
        pulumi.set(__self__, "registry_image", registry_image)
        if registry_sha256 and not isinstance(registry_sha256, str):
            raise TypeError("Expected argument 'registry_sha256' to be a str")
        pulumi.set(__self__, "registry_sha256", registry_sha256)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if timeout and not isinstance(timeout, int):
            raise TypeError("Expected argument 'timeout' to be a int")
        pulumi.set(__self__, "timeout", timeout)

    @property
    @pulumi.getter(name="containerId")
    def container_id(self) -> Optional[str]:
        return pulumi.get(self, "container_id")

    @property
    @pulumi.getter(name="cpuLimit")
    def cpu_limit(self) -> int:
        """
        The amount of vCPU computing resources to allocate to each container. Defaults  to 70.
        """
        return pulumi.get(self, "cpu_limit")

    @property
    @pulumi.getter(name="cronStatus")
    def cron_status(self) -> str:
        """
        The cron status of the container.
        """
        return pulumi.get(self, "cron_status")

    @property
    @pulumi.getter
    def deploy(self) -> bool:
        """
        Boolean indicating whether the container is on a production environment.
        """
        return pulumi.get(self, "deploy")

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> str:
        """
        The container domain name.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="environmentVariables")
    def environment_variables(self) -> Mapping[str, str]:
        """
        The [environment](https://www.scaleway.com/en/docs/compute/containers/concepts/#environment-variables) variables of the container.
        """
        return pulumi.get(self, "environment_variables")

    @property
    @pulumi.getter(name="errorMessage")
    def error_message(self) -> str:
        """
        The error message of the container.
        """
        return pulumi.get(self, "error_message")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="maxConcurrency")
    def max_concurrency(self) -> int:
        """
        The maximum number of simultaneous requests your container can handle at the same time. Defaults to 50.
        """
        return pulumi.get(self, "max_concurrency")

    @property
    @pulumi.getter(name="maxScale")
    def max_scale(self) -> int:
        """
        The maximum of number of instances this container can scale to. Default to 20.
        """
        return pulumi.get(self, "max_scale")

    @property
    @pulumi.getter(name="memoryLimit")
    def memory_limit(self) -> int:
        """
        The memory computing resources in MB to allocate to each container. Defaults to 128.
        """
        return pulumi.get(self, "memory_limit")

    @property
    @pulumi.getter(name="minScale")
    def min_scale(self) -> int:
        """
        The minimum of running container instances continuously. Defaults to 0.
        """
        return pulumi.get(self, "min_scale")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> str:
        return pulumi.get(self, "namespace_id")

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        The port to expose the container. Defaults to 8080.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def privacy(self) -> str:
        """
        The privacy type define the way to authenticate to your container. Please check our dedicated [section](https://developers.scaleway.com/en/products/containers/api/#protocol-9dd4c8).
        """
        return pulumi.get(self, "privacy")

    @property
    @pulumi.getter
    def protocol(self) -> str:
        """
        The communication [protocol](https://developers.scaleway.com/en/products/containers/api/#protocol-9dd4c8) http1 or h2c. Defaults to http1.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter
    def region(self) -> Optional[str]:
        """
        (Defaults to provider `region`) The region in which the container was created.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="registryImage")
    def registry_image(self) -> str:
        """
        The registry image address. e.g: **"rg.fr-par.scw.cloud/$NAMESPACE/$IMAGE"**.
        """
        return pulumi.get(self, "registry_image")

    @property
    @pulumi.getter(name="registrySha256")
    def registry_sha256(self) -> str:
        """
        The sha256 of your source registry image, changing it will re-apply the deployment. Can be any string.
        """
        return pulumi.get(self, "registry_sha256")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The container status.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def timeout(self) -> int:
        """
        The maximum amount of time in seconds during which your container can process a request before we stop it. Defaults to 300s.
        """
        return pulumi.get(self, "timeout")


class AwaitableGetContainerResult(GetContainerResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetContainerResult(
            container_id=self.container_id,
            cpu_limit=self.cpu_limit,
            cron_status=self.cron_status,
            deploy=self.deploy,
            description=self.description,
            domain_name=self.domain_name,
            environment_variables=self.environment_variables,
            error_message=self.error_message,
            id=self.id,
            max_concurrency=self.max_concurrency,
            max_scale=self.max_scale,
            memory_limit=self.memory_limit,
            min_scale=self.min_scale,
            name=self.name,
            namespace_id=self.namespace_id,
            port=self.port,
            privacy=self.privacy,
            protocol=self.protocol,
            region=self.region,
            registry_image=self.registry_image,
            registry_sha256=self.registry_sha256,
            status=self.status,
            timeout=self.timeout)


def get_container(container_id: Optional[str] = None,
                  name: Optional[str] = None,
                  namespace_id: Optional[str] = None,
                  region: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetContainerResult:
    """
    Gets information about the Scaleway Container.

    For more information consult the [documentation](https://www.scaleway.com/en/docs/faq/serverless-containers/).

    For more details about the limitation check [containers-limitations](https://www.scaleway.com/en/docs/compute/containers/reference-content/containers-limitations/).

    You can check also our [containers guide](https://www.scaleway.com/en/docs/compute/containers/concepts/).

    ## Example Usage

    ```python
    import pulumi
    import lbrlabs_pulumi_scaleway as scaleway
    import pulumi_scaleway as scaleway

    main_container_namespace = scaleway.ContainerNamespace("mainContainerNamespace")
    main_container = scaleway.Container("mainContainer", namespace_id=main_container_namespace.id)
    by_name = scaleway.get_container_output(namespace_id=main_container_namespace.id,
        name=main_container.name)
    by_id = scaleway.get_container_output(namespace_id=main_container_namespace.id,
        container_id=main_container.id)
    ```


    :param str name: The unique name of the container name.
    :param str namespace_id: The container namespace ID of the container.
    :param str region: (Defaults to provider `region`) The region in which the container was created.
    """
    __args__ = dict()
    __args__['containerId'] = container_id
    __args__['name'] = name
    __args__['namespaceId'] = namespace_id
    __args__['region'] = region
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scaleway:index/getContainer:getContainer', __args__, opts=opts, typ=GetContainerResult).value

    return AwaitableGetContainerResult(
        container_id=__ret__.container_id,
        cpu_limit=__ret__.cpu_limit,
        cron_status=__ret__.cron_status,
        deploy=__ret__.deploy,
        description=__ret__.description,
        domain_name=__ret__.domain_name,
        environment_variables=__ret__.environment_variables,
        error_message=__ret__.error_message,
        id=__ret__.id,
        max_concurrency=__ret__.max_concurrency,
        max_scale=__ret__.max_scale,
        memory_limit=__ret__.memory_limit,
        min_scale=__ret__.min_scale,
        name=__ret__.name,
        namespace_id=__ret__.namespace_id,
        port=__ret__.port,
        privacy=__ret__.privacy,
        protocol=__ret__.protocol,
        region=__ret__.region,
        registry_image=__ret__.registry_image,
        registry_sha256=__ret__.registry_sha256,
        status=__ret__.status,
        timeout=__ret__.timeout)


@_utilities.lift_output_func(get_container)
def get_container_output(container_id: Optional[pulumi.Input[Optional[str]]] = None,
                         name: Optional[pulumi.Input[Optional[str]]] = None,
                         namespace_id: Optional[pulumi.Input[str]] = None,
                         region: Optional[pulumi.Input[Optional[str]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetContainerResult]:
    """
    Gets information about the Scaleway Container.

    For more information consult the [documentation](https://www.scaleway.com/en/docs/faq/serverless-containers/).

    For more details about the limitation check [containers-limitations](https://www.scaleway.com/en/docs/compute/containers/reference-content/containers-limitations/).

    You can check also our [containers guide](https://www.scaleway.com/en/docs/compute/containers/concepts/).

    ## Example Usage

    ```python
    import pulumi
    import lbrlabs_pulumi_scaleway as scaleway
    import pulumi_scaleway as scaleway

    main_container_namespace = scaleway.ContainerNamespace("mainContainerNamespace")
    main_container = scaleway.Container("mainContainer", namespace_id=main_container_namespace.id)
    by_name = scaleway.get_container_output(namespace_id=main_container_namespace.id,
        name=main_container.name)
    by_id = scaleway.get_container_output(namespace_id=main_container_namespace.id,
        container_id=main_container.id)
    ```


    :param str name: The unique name of the container name.
    :param str namespace_id: The container namespace ID of the container.
    :param str region: (Defaults to provider `region`) The region in which the container was created.
    """
    ...
