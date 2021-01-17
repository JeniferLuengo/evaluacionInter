package com.example.evaluacioninter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.evaluacioninter.databinding.FragmentMessageBinding;


public class MessageFragment extends Fragment {
    private FragmentMessageBinding mbinding;



    public MessageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mbinding = FragmentMessageBinding.inflate(inflater,container,false);
        return mbinding.getRoot();
        mbinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mbinding.button.setVisibility(View.GONE);
                mbinding.textInputLayout.setVisibility(View.VISIBLE);
                mbinding.button2.setVisibility(View.VISIBLE);

                mbinding.button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        if (mbinding.editttextmsg.getText().toString().length() != 0) {
                            String message = mbinding.editttextmsg.getText().toString();
                            SendMessage(message);
                        } else {
                            Toast.makeText(getContext(), "Porfavor Ingrese un mensaje valido",
                                    Toast.LENGTH_SHORT).show();
                        }
                        mbinding.button.setVisibility(View.GONE);
                        mbinding.textInputLayout.setVisibility(View.VISIBLE);
                        mbinding.button2.setVisibility(View.VISIBLE);
                    }


                    private void SendMessage(String message) {
                        String[] Emails = {"jenifersusana0505@gmail.com"};
                        Intent mintent = new Intent(Intent.ACTION_SENDTO);

                        mintent.setData(Uri.parse("mailto;"));
                        mintent.putExtra(Intent.EXTRA_EMAIL, Emails);
                        mintent.putExtra(Intent.EXTRA_SUBJECT, "Contacto Acercade_APP");
                        mintent.putExtra(Intent.EXTRA_TEXT, message);
                        if (mintent.resolveActivity(getActivity().getPackageManager()) != null) {
                            startActivity(mintent);
                        } else {
                            Toast.makeText(getContext(), "Porfavor Instale una App de Correo para contactar",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        }
    }
}

