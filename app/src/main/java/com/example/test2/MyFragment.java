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

public class MyFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("My onAttach = ","called");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("My onCreate = ","called");

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("My onCreateView = ","called");
        return inflater.inflate(R.layout.flayout, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("My onStart = ","called");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("My onResume = ","called");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("My onPause = ","called");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("My onStop = ","called");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("My onDestroyView = ","called");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("My onDestroy = ","called");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("My onDetach = ","called");

    }
}
