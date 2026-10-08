package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes4.dex */
final class a extends d {
    a() {
    }

    @Override // com.google.android.material.behavior.d
    <V extends View> int a(V v15, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return v15.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override // com.google.android.material.behavior.d
    int b() {
        return 0;
    }

    @Override // com.google.android.material.behavior.d
    int c() {
        return 1;
    }

    @Override // com.google.android.material.behavior.d
    <V extends View> ViewPropertyAnimator d(V v15, int i15) {
        return v15.animate().translationY(i15);
    }

    @Override // com.google.android.material.behavior.d
    <V extends View> void e(V v15, int i15) {
        v15.setTranslationY(i15);
    }
}
