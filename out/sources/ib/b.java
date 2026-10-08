package ib;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends RecyclerView.f0 {
    private b(FrameLayout frameLayout) {
        super(frameLayout);
    }

    static b O(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new b(frameLayout);
    }

    FrameLayout P() {
        return (FrameLayout) this.f13091a;
    }
}
