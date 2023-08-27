package com.yos.newsapp.ui.BBC;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.yos.newsapp.R;
import com.yos.newsapp.WebViewController;
import com.yos.newsapp.databinding.FragmentGalleryBinding;
import com.yos.newsapp.databinding.FragmentHomeBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);


        View root = inflater.inflate(R.layout.fragment_gallery,container,false);
        WebView webView = root.findViewById(R.id.webviewbbc);
        webView.loadUrl("https://www.bbc.com/");
        webView.setWebViewClient(new WebViewController());




        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}