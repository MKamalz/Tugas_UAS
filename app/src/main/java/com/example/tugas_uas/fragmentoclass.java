package com.example.tugas_uas;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
public class fragmentoclass extends Fragment implements View.OnClickListener {

    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento, container, false);
            i1 = (ImageView) view.findViewById(R.id.game1);
            i2 = (ImageView) view.findViewById(R.id.game2);
            i3 = (ImageView) view.findViewById(R.id.game3);
            i4 = (ImageView) view.findViewById(R.id.game4);
            i5 = (ImageView) view.findViewById(R.id.game5);
            i6 = (ImageView) view.findViewById(R.id.game6);
            i7 = (ImageView) view.findViewById(R.id.game7);
            i8 = (ImageView) view.findViewById(R.id.game8);
            i9 = (ImageView) view.findViewById(R.id.game9);
            i10 = (ImageView) view.findViewById(R.id.game10);
            i11 = (ImageView) view.findViewById(R.id.game11);
            i12 = (ImageView) view.findViewById(R.id.game12);
            i13 = (ImageView) view.findViewById(R.id.game13);
            i14 = (ImageView) view.findViewById(R.id.game14);
            i15 = (ImageView) view.findViewById(R.id.game15);
            i16 = (ImageView) view.findViewById(R.id.game16);
            i17 = (ImageView) view.findViewById(R.id.game17);
            i18 = (ImageView) view.findViewById(R.id.game18);
            i19 = (ImageView) view.findViewById(R.id.game19);
            i20 = (ImageView) view.findViewById(R.id.game20);
            i21 = (ImageView) view.findViewById(R.id.game21);
            i22 = (ImageView) view.findViewById(R.id.game22);
            i23 = (ImageView) view.findViewById(R.id.game23);
            i24 = (ImageView) view.findViewById(R.id.game24);
            i1.setOnClickListener(this);
            i2.setOnClickListener(this);
            i3.setOnClickListener(this);
            i4.setOnClickListener(this);
            i5.setOnClickListener(this);
            i6.setOnClickListener(this);
            i7.setOnClickListener(this);
            i8.setOnClickListener(this);
            i9.setOnClickListener(this);
            i10.setOnClickListener(this);
            i11.setOnClickListener(this);
            i12.setOnClickListener(this);
            i13.setOnClickListener(this);
            i14.setOnClickListener(this);
            i15.setOnClickListener(this);
            i16.setOnClickListener(this);
            i17.setOnClickListener(this);
            i18.setOnClickListener(this);
            i19.setOnClickListener(this);
            i20.setOnClickListener(this);
            i21.setOnClickListener(this);
            i22.setOnClickListener(this);
            i23.setOnClickListener(this);
            i24.setOnClickListener(this);


        return view;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.game1 :
                Intent gem1 = new Intent(getActivity(), daftargame.class);
                gem1.putExtra("gam", R.drawable.game1);
                gem1.putExtra("gim", "Monster Hunter World (MHW) adalah game yang dikembangkan dan dikeluarkan oleh Capcom. bagian dari seri Monster Hunter" +
                        "gamenya rilis secara global pada Januari 2018.");
                startActivity(gem1);
                break;
            case R.id.game2 :
                Intent gem2 = new Intent(getActivity(), daftargame.class);
                gem2.putExtra("gam", R.drawable.game2);
                gem2.putExtra("gim", "Don't Starve Together");
                startActivity(gem2);
                break;
            case R.id.game3 :
                Intent gem3 = new Intent(getActivity(), daftargame.class);
                gem3.putExtra("gam", R.drawable.game3);
                gem3.putExtra("gim", "Cyberpunk 2077");
                startActivity(gem3);
                break;
            case R.id.game4 :
                Intent gem4 = new Intent(getActivity(), daftargame.class);
                gem4.putExtra("gam", R.drawable.game4);
                gem4.putExtra("gim", "Code Vein");
                startActivity(gem4);
                break;
            case R.id.game5 :
                Intent gem5 = new Intent(getActivity(), daftargame.class);
                gem5.putExtra("gam", R.drawable.game5);
                gem5.putExtra("gim", "Nier Automata");
                startActivity(gem5);
                break;
            case R.id.game6 :
                Intent gem6 = new Intent(getActivity(), daftargame.class);
                gem6.putExtra("gam", R.drawable.game6);
                gem6.putExtra("gim", "Grand Theft Auto V (GTA V)");
                startActivity(gem6);
                break;
            case R.id.game7 :
                Intent gem7 = new Intent(getActivity(), daftargame.class);
                gem7.putExtra("gam", R.drawable.game7);
                gem7.putExtra("gim", "Sekiro Shadows die twice");
                startActivity(gem7);
                break;
            case R.id.game8 :
                Intent gem8 = new Intent(getActivity(), daftargame.class);
                gem8.putExtra("gam", R.drawable.game8);
                gem8.putExtra("gim", "Detroit Become Human");
                startActivity(gem8);
                break;
            case R.id.game9 :
                Intent gem9 = new Intent(getActivity(), daftargame.class);
                gem9.putExtra("gam", R.drawable.game9);
                gem9.putExtra("gim", "Planet Zoo");
                startActivity(gem9);
                break;
            case R.id.game10 :
                Intent gem10 = new Intent(getActivity(), daftargame.class);
                gem10.putExtra("gam", R.drawable.game10);
                gem10.putExtra("gim", "Stardew Valley");
                startActivity(gem10);
                break;
            case R.id.game11 :
                Intent gem11 = new Intent(getActivity(), daftargame.class);
                gem11.putExtra("gam", R.drawable.game11);
                gem11.putExtra("gim", "Doraemon Story of Seasons");
                startActivity(gem11);
                break;
            case R.id.game12 :
                Intent gem12 = new Intent(getActivity(), daftargame.class);
                gem12.putExtra("gam", R.drawable.game12);
                gem12.putExtra("gim", "God Eater 3");
                startActivity(gem12);
                break;
            case R.id.game13 :
                Intent gem13 = new Intent(getActivity(), daftargame.class);
                gem13.putExtra("gam", R.drawable.game13);
                gem13.putExtra("gim", "Tales of Berseria");
                startActivity(gem13);
                break;
            case R.id.game14 :
                Intent gem14 = new Intent(getActivity(), daftargame.class);
                gem14.putExtra("gam", R.drawable.game14);
                gem14.putExtra("gim", "Atelier Ryza : Everlasting darkness and the secret hideout ");
                startActivity(gem14);
                break;
            case R.id.game15 :
                Intent gem15 = new Intent(getActivity(), daftargame.class);
                gem15.putExtra("gam", R.drawable.game15);
                gem15.putExtra("gim", "Dragonball Xenoverse 2");
                startActivity(gem15);
                break;
            case R.id.game16 :
                Intent gem16 = new Intent(getActivity(), daftargame.class);
                gem16.putExtra("gam", R.drawable.game16);
                gem16.putExtra("gim", "Battlefield 4");
                startActivity(gem16);
                break;
            case R.id.game17 :
                Intent gem17 = new Intent(getActivity(), daftargame.class);
                gem17.putExtra("gam", R.drawable.game17);
                gem17.putExtra("gim", "Call of Duty Modern Warfare");
                startActivity(gem17);
                break;
            case R.id.game18 :
                Intent gem18 = new Intent(getActivity(), daftargame.class);
                gem18.putExtra("gam", R.drawable.game18);
                gem18.putExtra("gim", "Death Stranding");
                startActivity(gem18);
                break;
            case R.id.game19 :
                Intent gem19 = new Intent(getActivity(), daftargame.class);
                gem19.putExtra("gam", R.drawable.game19);
                gem19.putExtra("gim", "Resident Evil 2 : Remake");
                startActivity(gem19);
                break;
            case R.id.game20 :
                Intent gem20 = new Intent(getActivity(), daftargame.class);
                gem20.putExtra("gam", R.drawable.game20);
                gem20.putExtra("gim", "Ni no Kuni II");
                startActivity(gem20);
                break;
            case R.id.game21 :
                Intent gem21 = new Intent(getActivity(), daftargame.class);
                gem21.putExtra("gam", R.drawable.game21);
                gem21.putExtra("gim", "Sword Art Online : Fatal Bullet");
                startActivity(gem21);
                break;
            case R.id.game22 :
                Intent gem22 = new Intent(getActivity(), daftargame.class);
                gem22.putExtra("gam", R.drawable.game22);
                gem22.putExtra("gim", "Dynasty Warrior 9 ");
                startActivity(gem22);
                break;
            case R.id.game23 :
                Intent gem23 = new Intent(getActivity(), daftargame.class);
                gem23.putExtra("gam", R.drawable.game23);
                gem23.putExtra("gim", "Samurai Warriors 4");
                startActivity(gem23);
                break;
            case R.id.game24 :
                Intent gem24 = new Intent(getActivity(), daftargame.class);
                gem24.putExtra("gam", R.drawable.game24);
                gem24.putExtra("gim", "Fate Extella/Link");
                startActivity(gem24);
                break;
        }
    }
}
