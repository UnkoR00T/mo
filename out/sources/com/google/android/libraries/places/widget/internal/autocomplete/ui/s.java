package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.n41;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class s extends RecyclerView.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BaseAutocompleteImplFragment f34611a;

    s(BaseAutocompleteImplFragment baseAutocompleteImplFragment) {
        Objects.requireNonNull(baseAutocompleteImplFragment);
        this.f34611a = baseAutocompleteImplFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public final void a(RecyclerView recyclerView, int i15) {
        if (i15 == 1) {
            try {
                BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.f34611a;
                baseAutocompleteImplFragment.a2().d9();
                baseAutocompleteImplFragment.b2().clearFocus();
            } catch (Error | RuntimeException e15) {
                n41.b(e15);
                throw e15;
            }
        }
    }
}
