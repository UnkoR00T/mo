package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class r4 extends IOException {
    r4(int i15, int i16) {
        StringBuilder sb5 = new StringBuilder(108);
        sb5.append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
        sb5.append(i15);
        sb5.append(" limit ");
        sb5.append(i16);
        sb5.append(").");
        super(sb5.toString());
    }
}
