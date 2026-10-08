package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class g4 extends IllegalArgumentException {
    g4(int i15, int i16) {
        StringBuilder sb5 = new StringBuilder(54);
        sb5.append("Unpaired surrogate at index ");
        sb5.append(i15);
        sb5.append(" of ");
        sb5.append(i16);
        super(sb5.toString());
    }
}
