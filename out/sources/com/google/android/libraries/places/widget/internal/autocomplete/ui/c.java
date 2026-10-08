package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import com.google.android.libraries.places.internal.a71;
import com.google.android.libraries.places.internal.xu0;
import com.google.android.libraries.places.internal.y41;
import com.google.android.libraries.places.internal.z61;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ji.n f34589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y41 f34590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a71 f34591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final xu0 f34592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f34593g;

    public c(int i15, z61 z61Var, y41 y41Var, int i16) {
        this.f34588b = i15;
        this.f34589c = z61Var.a();
        this.f34590d = y41Var;
        this.f34591e = z61Var.c();
        this.f34592f = z61Var.zzb();
        this.f34593g = i16;
    }

    @Override // androidx.fragment.app.s
    public final androidx.fragment.app.o a(ClassLoader classLoader, String str) {
        return androidx.fragment.app.s.d(classLoader, str) == BaseAutocompleteImplFragment.class ? new BaseAutocompleteImplFragment(this.f34588b, this.f34589c, this.f34590d, this.f34591e, this.f34592f, this.f34593g, null) : super.a(classLoader, str);
    }
}
