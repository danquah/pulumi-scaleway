# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['DatabaseUserArgs', 'DatabaseUser']

@pulumi.input_type
class DatabaseUserArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 password: pulumi.Input[str],
                 is_admin: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DatabaseUser resource.
        :param pulumi.Input[str] instance_id: The instance on which to create the user.
        :param pulumi.Input[str] password: Database User password.
        :param pulumi.Input[bool] is_admin: Grant admin permissions to the Database User.
        :param pulumi.Input[str] name: Database User name.
        :param pulumi.Input[str] region: The region you want to attach the resource to
        """
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "password", password)
        if is_admin is not None:
            pulumi.set(__self__, "is_admin", is_admin)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The instance on which to create the user.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def password(self) -> pulumi.Input[str]:
        """
        Database User password.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: pulumi.Input[str]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="isAdmin")
    def is_admin(self) -> Optional[pulumi.Input[bool]]:
        """
        Grant admin permissions to the Database User.
        """
        return pulumi.get(self, "is_admin")

    @is_admin.setter
    def is_admin(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_admin", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Database User name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The region you want to attach the resource to
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)


@pulumi.input_type
class _DatabaseUserState:
    def __init__(__self__, *,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 is_admin: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DatabaseUser resources.
        :param pulumi.Input[str] instance_id: The instance on which to create the user.
        :param pulumi.Input[bool] is_admin: Grant admin permissions to the Database User.
        :param pulumi.Input[str] name: Database User name.
        :param pulumi.Input[str] password: Database User password.
        :param pulumi.Input[str] region: The region you want to attach the resource to
        """
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if is_admin is not None:
            pulumi.set(__self__, "is_admin", is_admin)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The instance on which to create the user.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="isAdmin")
    def is_admin(self) -> Optional[pulumi.Input[bool]]:
        """
        Grant admin permissions to the Database User.
        """
        return pulumi.get(self, "is_admin")

    @is_admin.setter
    def is_admin(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_admin", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Database User name.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        Database User password.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The region you want to attach the resource to
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)


class DatabaseUser(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 is_admin: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates and manages Scaleway Database Users.
        For more information, see [the documentation](https://developers.scaleway.com/en/products/rdb/api).

        ## Examples

        ### Basic

        ```python
        import pulumi
        import pulumi_random as random
        import pulumi_scaleway as scaleway

        db_password = random.RandomPassword("dbPassword",
            length=16,
            special=True)
        db_admin = scaleway.DatabaseUser("dbAdmin",
            instance_id=scaleway_rdb_instance["main"]["id"],
            password=db_password.result,
            is_admin=True)
        ```

        ## Import

        Database User can be imported using `{region}/{instance_id}/{name}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/databaseUser:DatabaseUser admin fr-par/11111111-1111-1111-1111-111111111111/admin
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: The instance on which to create the user.
        :param pulumi.Input[bool] is_admin: Grant admin permissions to the Database User.
        :param pulumi.Input[str] name: Database User name.
        :param pulumi.Input[str] password: Database User password.
        :param pulumi.Input[str] region: The region you want to attach the resource to
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DatabaseUserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages Scaleway Database Users.
        For more information, see [the documentation](https://developers.scaleway.com/en/products/rdb/api).

        ## Examples

        ### Basic

        ```python
        import pulumi
        import pulumi_random as random
        import pulumi_scaleway as scaleway

        db_password = random.RandomPassword("dbPassword",
            length=16,
            special=True)
        db_admin = scaleway.DatabaseUser("dbAdmin",
            instance_id=scaleway_rdb_instance["main"]["id"],
            password=db_password.result,
            is_admin=True)
        ```

        ## Import

        Database User can be imported using `{region}/{instance_id}/{name}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/databaseUser:DatabaseUser admin fr-par/11111111-1111-1111-1111-111111111111/admin
        ```

        :param str resource_name: The name of the resource.
        :param DatabaseUserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatabaseUserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 is_admin: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatabaseUserArgs.__new__(DatabaseUserArgs)

            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["is_admin"] = is_admin
            __props__.__dict__["name"] = name
            if password is None and not opts.urn:
                raise TypeError("Missing required property 'password'")
            __props__.__dict__["password"] = password
            __props__.__dict__["region"] = region
        super(DatabaseUser, __self__).__init__(
            'scaleway:index/databaseUser:DatabaseUser',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            is_admin: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None) -> 'DatabaseUser':
        """
        Get an existing DatabaseUser resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: The instance on which to create the user.
        :param pulumi.Input[bool] is_admin: Grant admin permissions to the Database User.
        :param pulumi.Input[str] name: Database User name.
        :param pulumi.Input[str] password: Database User password.
        :param pulumi.Input[str] region: The region you want to attach the resource to
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatabaseUserState.__new__(_DatabaseUserState)

        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["is_admin"] = is_admin
        __props__.__dict__["name"] = name
        __props__.__dict__["password"] = password
        __props__.__dict__["region"] = region
        return DatabaseUser(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The instance on which to create the user.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="isAdmin")
    def is_admin(self) -> pulumi.Output[Optional[bool]]:
        """
        Grant admin permissions to the Database User.
        """
        return pulumi.get(self, "is_admin")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Database User name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[str]:
        """
        Database User password.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The region you want to attach the resource to
        """
        return pulumi.get(self, "region")

