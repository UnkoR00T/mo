package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import com.google.android.libraries.places.internal.a71;
import com.google.android.libraries.places.internal.xu0;
import com.google.android.libraries.places.internal.y41;
import com.google.android.libraries.places.internal.z61;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ji.n f34604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y41 f34605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a71 f34606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final xu0 f34607f;

    public n(int i15, z61 z61Var, y41 y41Var) {
        this.f34603b = i15;
        this.f34604c = z61Var.a();
        this.f34605d = y41Var;
        this.f34606e = z61Var.c();
        this.f34607f = z61Var.zzb();
    }

    @Override // androidx.fragment.app.s
    public final androidx.fragment.app.o a(ClassLoader classLoader, String str) {
        return androidx.fragment.app.s.d(classLoader, str) == AutocompleteImplFragment.class ? new AutocompleteImplFragment(this.f34603b, this.f34604c, this.f34605d, this.f34606e, this.f34607f, null) : super.a(classLoader, str);
    }
}
