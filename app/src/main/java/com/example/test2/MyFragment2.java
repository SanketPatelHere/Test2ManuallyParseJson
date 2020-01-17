package com.example.test2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment2 extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("My onAttach2 = ","called");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("My onCreate2 = ","called");

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("My onCreateView2 = ","called");
        return inflater.inflate(R.layout.flayout2, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("My onStart2 = ","called");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("My onResume2 = ","called");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("My onPause2 = ","called");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("My onStop2 = ","called");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("My onDestroyView2 = ","called");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("My onDestroy2 = ","called");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("My onDetach2 = ","called");

    }
}
