package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.n41;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class f extends RecyclerView.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AutocompleteImplFragment f34595a;

    f(AutocompleteImplFragment autocompleteImplFragment) {
        Objects.requireNonNull(autocompleteImplFragment);
        this.f34595a = autocompleteImplFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void a(RecyclerView recyclerView, int i15) {
        if (i15 == 1) {
            try {
                AutocompleteImplFragment autocompleteImplFragment = this.f34595a;
                autocompleteImplFragment.X1().d9();
                autocompleteImplFragment.Y1().clearFocus();
            } catch (Error | RuntimeException e15) {
                n41.b(e15);
                throw e15;
            }
        }
    }
}
