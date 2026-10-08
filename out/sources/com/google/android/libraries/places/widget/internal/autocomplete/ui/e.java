package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.places.internal.n41;

/* JADX INFO: loaded from: classes4.dex */
final class e implements View.OnFocusChangeListener {
    /* synthetic */ e(byte[] bArr) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z15) throws Throwable {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) u5.a.k(view.getContext(), InputMethodManager.class);
            if (inputMethodManager == null) {
                return;
            }
            if (z15) {
                inputMethodManager.showSoftInput(view, 1);
            } else {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Error e15) {
            e = e15;
            n41.b(e);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            n41.b(e);
            throw e;
        }
    }
}
