package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
class u extends LinearLayoutManager {

    class a extends androidx.recyclerview.widget.l {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.l
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    u(Context context, int i15, boolean z15) {
        super(context, i15, z15);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void M1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i15) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i15);
        N1(aVar);
    }
}
