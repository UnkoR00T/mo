package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import CON.m0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class a extends m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AutocompleteImplFragment f34586d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(AutocompleteImplFragment autocompleteImplFragment, boolean z15) {
        super(true);
        Objects.requireNonNull(autocompleteImplFragment);
        this.f34586d = autocompleteImplFragment;
    }

    @Override // CON.m0
    public final void d() {
        this.f34586d.X1().i9();
    }
}
