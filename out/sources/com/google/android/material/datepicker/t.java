package com.google.android.material.datepicker;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
abstract class t<S> extends androidx.fragment.app.o {
    protected final LinkedHashSet<s<S>> F0 = new LinkedHashSet<>();

    t() {
    }

    boolean R1(s<S> sVar) {
        return this.F0.add(sVar);
    }

    void S1() {
        this.F0.clear();
    }
}
