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

    public sealed class DomainRecordGeoIpMatchGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("continents")]
        private InputList<string>? _continents;

        /// <summary>
        /// List of continents (eg: `EU` for Europe, `NA` for North America, `AS` for Asia...). [List of all continents code](https://api.scaleway.com/domain-private/v2beta1/continents)
        /// </summary>
        public InputList<string> Continents
        {
            get => _continents ?? (_continents = new InputList<string>());
            set => _continents = value;
        }

        [Input("countries")]
        private InputList<string>? _countries;

        /// <summary>
        /// List of countries (eg: `FR` for France, `US` for the United States, `GB` for Great Britain...). [List of all countries code](https://api.scaleway.com/domain-private/v2beta1/countries)
        /// </summary>
        public InputList<string> Countries
        {
            get => _countries ?? (_countries = new InputList<string>());
            set => _countries = value;
        }

        /// <summary>
        /// The data of the view record
        /// </summary>
        [Input("data", required: true)]
        public Input<string> Data { get; set; } = null!;

        public DomainRecordGeoIpMatchGetArgs()
        {
        }
        public static new DomainRecordGeoIpMatchGetArgs Empty => new DomainRecordGeoIpMatchGetArgs();
    }
}
