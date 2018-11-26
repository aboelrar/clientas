package com.example.lenovo.client.interfaces;

import java.util.ArrayList;

public interface MVPP {
    public interface interfaces {
        interface  View
        {
            void element();
            void setviewImagedata(ArrayList data);
            void setviewCategorydata(ArrayList data);

        }
        interface Model{
            ArrayList getImagedata();
            ArrayList getCategorydata();

        }
        interface presenter{
            void getImageData();
            void getCategoryData();
        }

    }
}
