package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class o5 extends IllegalArgumentException {
    o5(int i15, int i16) {
        StringBuilder sb5 = new StringBuilder(54);
        sb5.append("Unpaired surrogate at index ");
        sb5.append(i15);
        sb5.append(" of ");
        sb5.append(i16);
        super(sb5.toString());
    }
}
