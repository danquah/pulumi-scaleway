// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class KubernetesClusterAutoUpgradeArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterAutoUpgradeArgs Empty = new KubernetesClusterAutoUpgradeArgs();

    /**
     * Set to `true` to enable Kubernetes patch version auto upgrades.
     * &gt; **Important:** When enabling auto upgrades, the `version` field take a minor version like x.y (ie 1.18).
     * 
     */
    @Import(name="enable", required=true)
    private Output<Boolean> enable;

    /**
     * @return Set to `true` to enable Kubernetes patch version auto upgrades.
     * &gt; **Important:** When enabling auto upgrades, the `version` field take a minor version like x.y (ie 1.18).
     * 
     */
    public Output<Boolean> enable() {
        return this.enable;
    }

    /**
     * The day of the auto upgrade maintenance window (`monday` to `sunday`, or `any`).
     * 
     */
    @Import(name="maintenanceWindowDay", required=true)
    private Output<String> maintenanceWindowDay;

    /**
     * @return The day of the auto upgrade maintenance window (`monday` to `sunday`, or `any`).
     * 
     */
    public Output<String> maintenanceWindowDay() {
        return this.maintenanceWindowDay;
    }

    /**
     * The start hour (UTC) of the 2-hour auto upgrade maintenance window (0 to 23).
     * 
     */
    @Import(name="maintenanceWindowStartHour", required=true)
    private Output<Integer> maintenanceWindowStartHour;

    /**
     * @return The start hour (UTC) of the 2-hour auto upgrade maintenance window (0 to 23).
     * 
     */
    public Output<Integer> maintenanceWindowStartHour() {
        return this.maintenanceWindowStartHour;
    }

    private KubernetesClusterAutoUpgradeArgs() {}

    private KubernetesClusterAutoUpgradeArgs(KubernetesClusterAutoUpgradeArgs $) {
        this.enable = $.enable;
        this.maintenanceWindowDay = $.maintenanceWindowDay;
        this.maintenanceWindowStartHour = $.maintenanceWindowStartHour;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterAutoUpgradeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterAutoUpgradeArgs $;

        public Builder() {
            $ = new KubernetesClusterAutoUpgradeArgs();
        }

        public Builder(KubernetesClusterAutoUpgradeArgs defaults) {
            $ = new KubernetesClusterAutoUpgradeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable Set to `true` to enable Kubernetes patch version auto upgrades.
         * &gt; **Important:** When enabling auto upgrades, the `version` field take a minor version like x.y (ie 1.18).
         * 
         * @return builder
         * 
         */
        public Builder enable(Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Set to `true` to enable Kubernetes patch version auto upgrades.
         * &gt; **Important:** When enabling auto upgrades, the `version` field take a minor version like x.y (ie 1.18).
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param maintenanceWindowDay The day of the auto upgrade maintenance window (`monday` to `sunday`, or `any`).
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowDay(Output<String> maintenanceWindowDay) {
            $.maintenanceWindowDay = maintenanceWindowDay;
            return this;
        }

        /**
         * @param maintenanceWindowDay The day of the auto upgrade maintenance window (`monday` to `sunday`, or `any`).
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowDay(String maintenanceWindowDay) {
            return maintenanceWindowDay(Output.of(maintenanceWindowDay));
        }

        /**
         * @param maintenanceWindowStartHour The start hour (UTC) of the 2-hour auto upgrade maintenance window (0 to 23).
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowStartHour(Output<Integer> maintenanceWindowStartHour) {
            $.maintenanceWindowStartHour = maintenanceWindowStartHour;
            return this;
        }

        /**
         * @param maintenanceWindowStartHour The start hour (UTC) of the 2-hour auto upgrade maintenance window (0 to 23).
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowStartHour(Integer maintenanceWindowStartHour) {
            return maintenanceWindowStartHour(Output.of(maintenanceWindowStartHour));
        }

        public KubernetesClusterAutoUpgradeArgs build() {
            $.enable = Objects.requireNonNull($.enable, "expected parameter 'enable' to be non-null");
            $.maintenanceWindowDay = Objects.requireNonNull($.maintenanceWindowDay, "expected parameter 'maintenanceWindowDay' to be non-null");
            $.maintenanceWindowStartHour = Objects.requireNonNull($.maintenanceWindowStartHour, "expected parameter 'maintenanceWindowStartHour' to be non-null");
            return $;
        }
    }

}
