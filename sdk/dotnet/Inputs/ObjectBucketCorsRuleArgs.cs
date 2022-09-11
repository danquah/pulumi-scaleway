// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace lbrlabs.Scaleway.Inputs
{

    public sealed class ObjectBucketCorsRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedHeaders")]
        private InputList<string>? _allowedHeaders;
        public InputList<string> AllowedHeaders
        {
            get => _allowedHeaders ?? (_allowedHeaders = new InputList<string>());
            set => _allowedHeaders = value;
        }

        [Input("allowedMethods", required: true)]
        private InputList<string>? _allowedMethods;
        public InputList<string> AllowedMethods
        {
            get => _allowedMethods ?? (_allowedMethods = new InputList<string>());
            set => _allowedMethods = value;
        }

        [Input("allowedOrigins", required: true)]
        private InputList<string>? _allowedOrigins;
        public InputList<string> AllowedOrigins
        {
            get => _allowedOrigins ?? (_allowedOrigins = new InputList<string>());
            set => _allowedOrigins = value;
        }

        [Input("exposeHeaders")]
        private InputList<string>? _exposeHeaders;
        public InputList<string> ExposeHeaders
        {
            get => _exposeHeaders ?? (_exposeHeaders = new InputList<string>());
            set => _exposeHeaders = value;
        }

        [Input("maxAgeSeconds")]
        public Input<int>? MaxAgeSeconds { get; set; }

        public ObjectBucketCorsRuleArgs()
        {
        }
        public static new ObjectBucketCorsRuleArgs Empty => new ObjectBucketCorsRuleArgs();
    }
}
