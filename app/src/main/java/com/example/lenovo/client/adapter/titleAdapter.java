package com.example.lenovo.client.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.example.lenovo.client.R;
import com.example.lenovo.client.lists.titleList;
import com.example.lenovo.client.view.chooseMarket;

import java.util.ArrayList;

import static android.content.Context.MODE_PRIVATE;

public class titleAdapter extends RecyclerView.Adapter<titleAdapter.titleHodler> {
    Context context;
    ArrayList<titleList>mylist;
    int resource;
    int num;

    public titleAdapter(Context context, ArrayList<titleList> mylist,int resource) {
        this.context = context;
        this.mylist = mylist;
        this.resource=resource;
    }

    @NonNull
    @Override
    public titleHodler onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(resource,viewGroup,false);
        titleHodler titleHodler=new titleHodler(view);
        return titleHodler;
    }

    @Override
    public void onBindViewHolder(@NonNull final titleHodler viewHolder, int i) {

        if(resource==R.layout.city) {
            viewHolder.cityname.setText(mylist.get(i).getCityName().toString());
            viewHolder.titleName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, chooseMarket.class);
                    intent.putExtra("title", viewHolder.cityname.getText().toString());
                    v.getContext().startActivity(intent);
                }
            });
        }else if(resource==R.layout.categoryitem)
        {
                      viewHolder.title.setText(mylist.get(i).getCategoryTitle().toString());
                      viewHolder.categoryImg.setImageResource(mylist.get(i).getCategoryImg());
        }      else if(resource==R.layout.productitem)
                    {
                      viewHolder.favTitle.setText(mylist.get(i).getFavName().toString());
                      viewHolder.favImage.setImageResource(mylist.get(i).getFavImg());
                      viewHolder.favPrice.setText(mylist.get(i).getFavPrice().toString());
                      incraesedecrease(viewHolder);
                     }
               else if(resource==R.layout.carttitem)
                     {
                       incraesedecrease(viewHolder);
                        int price=incraesedecrease(viewHolder);
                     }
                else if (resource==R.layout.gridproductitem)
                     {
                        incraesedecrease(viewHolder);
                     }


    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }
    public class titleHodler extends RecyclerView.ViewHolder {
        TextView cityname;
        ImageView increase,decrease;
        LinearLayout titleName;
        ImageView categoryImg,favImage;
        LinearLayout goToProducts;
        TextView title,textnum;
        TextView favTitle,favPrice,ttlpriceprd;
        ViewSwitcher switcher1;
        public titleHodler(@NonNull View itemView) {
            super(itemView);
            cityname=(TextView)itemView.findViewById(R.id.cityname);
            titleName=(LinearLayout)itemView.findViewById(R.id.titleName);
            categoryImg=(ImageView)itemView.findViewById(R.id.catimg);
            title=(TextView) itemView.findViewById(R.id.catttle);
            goToProducts=(LinearLayout)itemView.findViewById(R.id.goToProducts);
            favImage=(ImageView)itemView.findViewById(R.id.favicon);
            favTitle=(TextView) itemView.findViewById(R.id.favTitle);
            favPrice=(TextView)itemView.findViewById(R.id.favprice);
            switcher1= (ViewSwitcher)itemView.findViewById(R.id.my_switcher);
            increase=(ImageView) itemView.findViewById(R.id.increase);
            decrease=(ImageView) itemView.findViewById(R.id.decrease);
            textnum=(TextView)itemView.findViewById(R.id.textnum);
            ttlpriceprd=(TextView)itemView.findViewById(R.id.ttlpriceprd);

        }
    }
    public void sendNum(String num)
    {
        SharedPreferences sharedPreferences=context.getSharedPreferences("title",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("title", num);
        editor.commit();
    }
    public int incraesedecrease( final titleHodler viewHolder)
    {
        num=Integer.parseInt(viewHolder.textnum.getText().toString());

        viewHolder.increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;
                String txtnum=Integer.toString(num);
                viewHolder.textnum.setText(txtnum);
                int total=num*9;
                viewHolder.ttlpriceprd.setText(""+total);

            }
        });
        viewHolder.decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num--;
                String txtnum=Integer.toString(num);
                if(num>0) {
                    viewHolder.textnum.setText(txtnum);
                    int total=num*9;
                    viewHolder.ttlpriceprd.setText(""+total);

                }

            }
        });

        return num;
    }
}
