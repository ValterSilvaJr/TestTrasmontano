package com.example.testtrasmontano.Util;

import android.content.Context;

import com.example.testtrasmontano.Model.CentrosMedicosModel;

import java.util.Arrays;
import java.util.List;

public class CarregarLista {

    public static List<CentrosMedicosModel> getCentrosMedicos(Context context) {

        return Arrays.asList(
                new CentrosMedicosModel("São Paulo", "Rua Dois","255","Centro", "7", "17", context),
                new CentrosMedicosModel("São Paulo", "Rua Dois","255","Centro", "7", "17", context),
                new CentrosMedicosModel("São Paulo", "Rua Dois","255","Centro", "7", "17", context),
                new CentrosMedicosModel("São Paulo", "Rua Dois","255","Centro", "7", "17", context),
                new CentrosMedicosModel("São Paulo", "Rua Dois","255","Centro", "7", "17", context),
                new CentrosMedicosModel("São Paulo", "Rua Dois","255","Centro", "7", "17", context),
                new CentrosMedicosModel("São Paulo", "Rua Dois","255","Centro", "7", "17", context),
                new CentrosMedicosModel("São Paulo", "Rua Dois","255","Centro", "7", "17", context),
                new CentrosMedicosModel("São Paulo", "Rua Dois","255","Centro", "7", "17", context),
                new CentrosMedicosModel("São Paulo", "Rua Dois","255","Centro", "7", "17", context),
                new CentrosMedicosModel("São Paulo", "Rua Dois","255","Centro", "7", "17", context)

        );

    }
}
