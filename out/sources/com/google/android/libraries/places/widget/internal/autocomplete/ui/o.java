package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.places.internal.n41;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class o implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AutocompleteImplFragment f34608a;

    /* synthetic */ o(AutocompleteImplFragment autocompleteImplFragment, byte[] bArr) {
        Objects.requireNonNull(autocompleteImplFragment);
        this.f34608a = autocompleteImplFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            AutocompleteImplFragment autocompleteImplFragment = this.f34608a;
            autocompleteImplFragment.X1().b9(editable.toString(), autocompleteImplFragment.Y1().getSelectionEnd());
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
