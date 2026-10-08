package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class r implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BaseAutocompleteImplFragment f34610a;

    r(BaseAutocompleteImplFragment baseAutocompleteImplFragment) {
        Objects.requireNonNull(baseAutocompleteImplFragment);
        this.f34610a = baseAutocompleteImplFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f34610a.Z1();
    }
}
