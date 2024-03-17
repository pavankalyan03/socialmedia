package com.example.socialmedia;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class homefragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Datamodel> mList;
    private ItemAdapter adapter;

    String[] books = {"Book Name: Bhagavad Gita \n\nAuthor name: Vedavyasa",
            "Book Name: The Alchemist \n\nAuthor name: Paulo Coelho",
            "Book Name: The Power of Your Subconscious Mind \n\nAuthor name: Joseph Murphy",
            "Book Name: The Secret \n\nAuthor name: Rhonda Byrne",
            "Book Name: The 5 AM Club \n\nAuthor name: Robin Sharma",
            "Book Name: Atomic Habits \n\nAuthor name: Jamnes clear"};

    int[] images = {R.drawable.bhagadvadgita, R.drawable.alchemist, R.drawable.powerofmind, R.drawable.secret, R.drawable.amclub, R.drawable.atomichabits};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_homefragment, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mList = new ArrayList<>();

        //list1
        List<String> nestedList1 = new ArrayList<>();
        nestedList1.add("Jams and Honey");


        List<String> nestedList2 = new ArrayList<>();
        nestedList2.add("Book");


        List<String> nestedList3 = new ArrayList<>();
        nestedList3.add("Decorates");


        List<String> nestedList4 = new ArrayList<>();
        nestedList4.add("Pasta");


        List<String> nestedList5 = new ArrayList<>();
        nestedList5.add("Jams and Honey");


        List<String> nestedList6 = new ArrayList<>();
        nestedList6.add("Pasta");

        List<String> nestedList7 = new ArrayList<>();
        nestedList7.add("Decorates");


        mList.add(new Datamodel(books[0],images[0], "Atomic Habits"));
        mList.add(new Datamodel(books[1],images[1], "The Alchemist"));
        mList.add(new Datamodel(books[2],images[2], "The Power of Your Subconscious Mind"));
        mList.add(new Datamodel(books[3],images[3], "The Secret"));
        mList.add(new Datamodel(books[4],images[4], "The 5 AM Club"));
        mList.add(new Datamodel(books[5],images[5], "Bhagavad Gita"));

        adapter = new ItemAdapter(mList);
        recyclerView.setAdapter(adapter);


        return view;
    }
}