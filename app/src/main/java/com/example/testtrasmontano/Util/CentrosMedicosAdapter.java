package com.example.testtrasmontano.Util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.testtrasmontano.Model.CentrosMedicosModel;
import com.example.testtrasmontano.R;

import java.util.List;

public class CentrosMedicosAdapter extends RecyclerView.Adapter {

    private List<CentrosMedicosModel> sedes;
    private Context mContext;

    public CentrosMedicosAdapter(List<CentrosMedicosModel> sedes, Context mContext) {
        this.sedes = sedes;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View root = LayoutInflater.from(mContext).inflate(R.layout.item_centros_medicos, parent, false);
        return new ViewHolderSedes(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolderSedes holderSedes = (ViewHolderSedes) holder;
        CentrosMedicosModel centroMedico = sedes.get(position);
        holderSedes.localidade.setText(centroMedico.getLocalidade());
        holderSedes.endereco.setText(centroMedico.getEndereco());
        holderSedes.numero.setText(centroMedico.getNumero());
        holderSedes.bairro.setText(centroMedico.getBairro());
        holderSedes.horaInicial.setText(centroMedico.getHoraInicial());
        holderSedes.horaFinal.setText(centroMedico.getHoraFinal());
    }

    @Override
    public int getItemCount() {
        if(sedes == null){
            return 0;
        }
        return sedes.size();
    }

    private class ViewHolderSedes extends RecyclerView.ViewHolder  {
        final TextView localidade;
        final TextView endereco;
        final TextView numero;
        final TextView bairro;
        final TextView horaInicial;
        final TextView horaFinal;


        public ViewHolderSedes(@NonNull View itemView) {
            super(itemView);

            localidade = itemView.findViewById(R.id.tv_sede);
            endereco = itemView.findViewById(R.id.tv_end);
            numero = itemView.findViewById(R.id.tv_num_pred);
            bairro = itemView.findViewById(R.id.tv_bairro);
            horaInicial = itemView.findViewById(R.id.tv_hora_inicial);
            horaFinal = itemView.findViewById(R.id.tv_hora_final);
        }
    }
}
