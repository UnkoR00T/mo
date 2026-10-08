package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.places.internal.n41;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class d implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BaseAutocompleteImplFragment f34594a;

    /* synthetic */ d(BaseAutocompleteImplFragment baseAutocompleteImplFragment, byte[] bArr) {
        Objects.requireNonNull(baseAutocompleteImplFragment);
        this.f34594a = baseAutocompleteImplFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.f34594a;
            baseAutocompleteImplFragment.a2().b9(editable.toString(), baseAutocompleteImplFragment.b2().getSelectionEnd());
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i15, int i16, int i17) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i15, int i16, int i17) {
    }
}
