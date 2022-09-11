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
    'GetVpcPublicPatRuleResult',
    'AwaitableGetVpcPublicPatRuleResult',
    'get_vpc_public_pat_rule',
    'get_vpc_public_pat_rule_output',
]

@pulumi.output_type
class GetVpcPublicPatRuleResult:
    """
    A collection of values returned by getVpcPublicPatRule.
    """
    def __init__(__self__, created_at=None, gateway_id=None, id=None, organization_id=None, pat_rule_id=None, private_ip=None, private_port=None, protocol=None, public_port=None, updated_at=None, zone=None):
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if gateway_id and not isinstance(gateway_id, str):
            raise TypeError("Expected argument 'gateway_id' to be a str")
        pulumi.set(__self__, "gateway_id", gateway_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if organization_id and not isinstance(organization_id, str):
            raise TypeError("Expected argument 'organization_id' to be a str")
        pulumi.set(__self__, "organization_id", organization_id)
        if pat_rule_id and not isinstance(pat_rule_id, str):
            raise TypeError("Expected argument 'pat_rule_id' to be a str")
        pulumi.set(__self__, "pat_rule_id", pat_rule_id)
        if private_ip and not isinstance(private_ip, str):
            raise TypeError("Expected argument 'private_ip' to be a str")
        pulumi.set(__self__, "private_ip", private_ip)
        if private_port and not isinstance(private_port, int):
            raise TypeError("Expected argument 'private_port' to be a int")
        pulumi.set(__self__, "private_port", private_port)
        if protocol and not isinstance(protocol, str):
            raise TypeError("Expected argument 'protocol' to be a str")
        pulumi.set(__self__, "protocol", protocol)
        if public_port and not isinstance(public_port, int):
            raise TypeError("Expected argument 'public_port' to be a int")
        pulumi.set(__self__, "public_port", public_port)
        if updated_at and not isinstance(updated_at, str):
            raise TypeError("Expected argument 'updated_at' to be a str")
        pulumi.set(__self__, "updated_at", updated_at)
        if zone and not isinstance(zone, str):
            raise TypeError("Expected argument 'zone' to be a str")
        pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="gatewayId")
    def gateway_id(self) -> str:
        """
        The ID of the public gateway.
        """
        return pulumi.get(self, "gateway_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> str:
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="patRuleId")
    def pat_rule_id(self) -> str:
        return pulumi.get(self, "pat_rule_id")

    @property
    @pulumi.getter(name="privateIp")
    def private_ip(self) -> str:
        """
        The Private IP to forward data to (IP address).
        """
        return pulumi.get(self, "private_ip")

    @property
    @pulumi.getter(name="privatePort")
    def private_port(self) -> int:
        """
        The Private port to translate to.
        """
        return pulumi.get(self, "private_port")

    @property
    @pulumi.getter
    def protocol(self) -> str:
        """
        The Protocol the rule should apply to. Possible values are both, tcp and udp.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter(name="publicPort")
    def public_port(self) -> int:
        """
        The Public port to listen on.
        """
        return pulumi.get(self, "public_port")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> str:
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter
    def zone(self) -> Optional[str]:
        return pulumi.get(self, "zone")


class AwaitableGetVpcPublicPatRuleResult(GetVpcPublicPatRuleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVpcPublicPatRuleResult(
            created_at=self.created_at,
            gateway_id=self.gateway_id,
            id=self.id,
            organization_id=self.organization_id,
            pat_rule_id=self.pat_rule_id,
            private_ip=self.private_ip,
            private_port=self.private_port,
            protocol=self.protocol,
            public_port=self.public_port,
            updated_at=self.updated_at,
            zone=self.zone)


def get_vpc_public_pat_rule(pat_rule_id: Optional[str] = None,
                            zone: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVpcPublicPatRuleResult:
    """
    Gets information about a public gateway PAT rule. For further information please check the
    API [documentation](https://developers.scaleway.com/en/products/vpc-gw/api/v1/#get-8faeea)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scaleway as scaleway
    import lbrlabs_scaleway as scaleway

    pg01 = scaleway.VpcPublicGateway("pg01", type="VPC-GW-S")
    dhcp01 = scaleway.VpcPublicGatewayDhcp("dhcp01", subnet="192.168.1.0/24")
    pn01 = scaleway.VpcPrivateNetwork("pn01")
    gn01 = scaleway.VpcGatewayNetwork("gn01",
        gateway_id=pg01.id,
        private_network_id=pn01.id,
        dhcp_id=dhcp01.id,
        cleanup_dhcp=True,
        enable_masquerade=True,
        opts=pulumi.ResourceOptions(depends_on=[pn01]))
    main_vpc_public_gateway_pat_rule = scaleway.VpcPublicGatewayPatRule("mainVpcPublicGatewayPatRule",
        gateway_id=pg01.id,
        private_ip=dhcp01.address,
        private_port=42,
        public_port=42,
        protocol="both",
        opts=pulumi.ResourceOptions(depends_on=[
                gn01,
                pn01,
            ]))
    main_vpc_public_pat_rule = scaleway.get_vpc_public_pat_rule_output(pat_rule_id=main_vpc_public_gateway_pat_rule.id)
    ```


    :param str pat_rule_id: The ID of the PAT rule to retrieve
    :param str zone: `zone`) The zone in which
           the image exists.
    """
    __args__ = dict()
    __args__['patRuleId'] = pat_rule_id
    __args__['zone'] = zone
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scaleway:index/getVpcPublicPatRule:getVpcPublicPatRule', __args__, opts=opts, typ=GetVpcPublicPatRuleResult).value

    return AwaitableGetVpcPublicPatRuleResult(
        created_at=__ret__.created_at,
        gateway_id=__ret__.gateway_id,
        id=__ret__.id,
        organization_id=__ret__.organization_id,
        pat_rule_id=__ret__.pat_rule_id,
        private_ip=__ret__.private_ip,
        private_port=__ret__.private_port,
        protocol=__ret__.protocol,
        public_port=__ret__.public_port,
        updated_at=__ret__.updated_at,
        zone=__ret__.zone)


@_utilities.lift_output_func(get_vpc_public_pat_rule)
def get_vpc_public_pat_rule_output(pat_rule_id: Optional[pulumi.Input[str]] = None,
                                   zone: Optional[pulumi.Input[Optional[str]]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVpcPublicPatRuleResult]:
    """
    Gets information about a public gateway PAT rule. For further information please check the
    API [documentation](https://developers.scaleway.com/en/products/vpc-gw/api/v1/#get-8faeea)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scaleway as scaleway
    import lbrlabs_scaleway as scaleway

    pg01 = scaleway.VpcPublicGateway("pg01", type="VPC-GW-S")
    dhcp01 = scaleway.VpcPublicGatewayDhcp("dhcp01", subnet="192.168.1.0/24")
    pn01 = scaleway.VpcPrivateNetwork("pn01")
    gn01 = scaleway.VpcGatewayNetwork("gn01",
        gateway_id=pg01.id,
        private_network_id=pn01.id,
        dhcp_id=dhcp01.id,
        cleanup_dhcp=True,
        enable_masquerade=True,
        opts=pulumi.ResourceOptions(depends_on=[pn01]))
    main_vpc_public_gateway_pat_rule = scaleway.VpcPublicGatewayPatRule("mainVpcPublicGatewayPatRule",
        gateway_id=pg01.id,
        private_ip=dhcp01.address,
        private_port=42,
        public_port=42,
        protocol="both",
        opts=pulumi.ResourceOptions(depends_on=[
                gn01,
                pn01,
            ]))
    main_vpc_public_pat_rule = scaleway.get_vpc_public_pat_rule_output(pat_rule_id=main_vpc_public_gateway_pat_rule.id)
    ```


    :param str pat_rule_id: The ID of the PAT rule to retrieve
    :param str zone: `zone`) The zone in which
           the image exists.
    """
    ...
