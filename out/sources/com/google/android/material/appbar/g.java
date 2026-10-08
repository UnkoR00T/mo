package com.google.android.material.appbar;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f34744a = {R.attr.stateListAnimator};

    static void a(View view, float f15) {
        int integer = view.getResources().getInteger(ri.g.f174017a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j15 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, ri.b.R, -ri.b.S}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j15));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f15).setDuration(j15));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
