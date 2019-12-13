package com.example.tugas_uas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public  class fragmentclass extends Fragment{
    private String[] judul;
    private String[][] isinya;
    ExpandableListView exlist;
    public fragmentclass(){

    }


    @Nullable
    public View onCreateView( @NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        int i;
        judul = new String[]{"About us","Profil"};
        isinya = new String[][]{
                {"Toko game uap sudah berdiri sejak tahun 2003,dan di dirikan oleh Gabe Newton. Seorang mahasiswa lulusan Sistem Informasi dari salah satu universitas terkenal di indonesia" +
                        ".Kami Memiliki 24 game yang tersedia. "},{"Gabe Newton merupakan seorang Mahasiswa lulusan suatu universitas di Palembang jurusan Ssitem Informasi. Kelahiran Palembang tahun 1998. Gabe Newton membuka toko ini dengan harapan ia bisa mendapat pendapatan lebih untuk hidupnya."}
        };
        View view = inflater.inflate(R.layout.fragment, container, false);



    return view;

}


public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        exlist  = (ExpandableListView)getView().findViewById(R.id.listoe);
        exlist.setAdapter(new ExpandableListAdapter(judul,isinya));
        exlist.setGroupIndicator(null);
}
public class ExpandableListAdapter extends BaseExpandableListAdapter{
        private final LayoutInflater inf;
        private String[] judul;
        private String[][] isinya;

        public ExpandableListAdapter(String[] judul, String[][] isinya){
            this.judul = judul;
            this.isinya = isinya;
            inf = LayoutInflater.from(getActivity());
        }

    @Override
    public int getGroupCount() {
        return judul.length;
    }

    @Override
    public int getChildrenCount(int groupPos) {
        return isinya[groupPos].length;
    }

    @Override
    public Object getGroup(int groupPos) {
        return judul[groupPos];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return isinya[groupPosition][childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return groupPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    private class ViewHolder{
            ImageView img;
        TextView text;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition, boolean last, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            convertView = inf.inflate(R.layout.listdrop,parent,false);
            holder = new ViewHolder();

            holder.text = (TextView) convertView.findViewById(R.id.textView1);
                    holder.img = (ImageView) convertView.findViewById(R.id.imageView1);
                    convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }
String tekso = getGroup(groupPosition).toString();
        holder.text.setText(getChild(groupPosition, childPosition).toString());
        if (tekso == "About us"){
            holder.img.setImageResource(R.drawable.stim);
        }
        else if (tekso == "Profil"){
            holder.img.setImageResource(R.drawable.gaben);
        }
return convertView;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            convertView = inf.inflate(R.layout.listitem,parent,false);

            holder = new ViewHolder();
            holder.text = (TextView)convertView.findViewById(R.id.TextView2);
            convertView.setTag(holder);

        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.text.setText(getGroup(groupPosition).toString());

                return convertView;
    }


    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}



}
