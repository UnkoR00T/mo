package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"AppCompatCustomView"})
public class r extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35438a;

    public final void b(int i15, boolean z15) {
        super.setVisibility(i15);
        if (z15) {
            this.f35438a = i15;
        }
    }

    public final int getUserSetVisibility() {
        return this.f35438a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i15) {
        b(i15, true);
    }
}
