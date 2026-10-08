package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class gq extends uy implements i00 {
    private gq() {
        throw null;
    }

    public final List A() {
        return Collections.unmodifiableList(((sq) this.f33991b).I());
    }

    public final gq D(Iterable iterable) {
        y();
        ((sq) this.f33991b).K(iterable);
        return this;
    }

    /* synthetic */ gq(byte[] bArr) {
        super(sq.zzq);
    }
}
