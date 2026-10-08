package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes4.dex */
class b implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35871a;

    public b(int i15) {
        this.f35871a = i15;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i15, int i16, Spanned spanned, int i17, int i18) {
        try {
            StringBuilder sb5 = new StringBuilder(spanned);
            sb5.replace(i17, i18, charSequence.subSequence(i15, i16).toString());
            if (Integer.parseInt(sb5.toString()) <= this.f35871a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
