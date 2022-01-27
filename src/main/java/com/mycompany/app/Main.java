package com.mycompany.app;

import software.constructs.Construct;

import com.hashicorp.cdktf.App;
import com.hashicorp.cdktf.TerraformStack;

// Datadog provider
// https://github.com/hashicorp/cdktf-provider-datadog/blob/main/README.md
import com.hashicorp.cdktf.providers.datadog.ApiKey;
import com.hashicorp.cdktf.providers.datadog.ApplicationKey;
import com.hashicorp.cdktf.providers.datadog.Dashboard;
import com.hashicorp.cdktf.providers.datadog.DashboardList;

public class Main extends TerraformStack
{
    public Main(final Construct scope, final String id) {
        super(scope, id);

        // define resources here
    }

    public static void main(String[] args) {
        final App app = new App();
        new Main(app, "foo");
        app.synth();
    }
}