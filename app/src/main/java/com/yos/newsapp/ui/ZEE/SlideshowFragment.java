package com.yos.newsapp.ui.ZEE;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.yos.newsapp.R;
import com.yos.newsapp.WebViewController;
import com.yos.newsapp.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);


        View root = inflater.inflate(R.layout.fragment_slideshow,container,false);
        WebView webView = root.findViewById(R.id.webviewzee);
        webView.loadUrl("https://zeenews.india.com/");
        webView.setWebViewClient(new WebViewController());




        return root;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}