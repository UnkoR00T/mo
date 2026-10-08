package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class cy implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30394a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f30396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ gy f30397d;

    /* synthetic */ cy(gy gyVar, ay ayVar) {
        this.f30397d = gyVar;
    }

    private final Iterator a() {
        if (this.f30396c == null) {
            this.f30396c = this.f30397d.f30438c.entrySet().iterator();
        }
        return this.f30396c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i15 = this.f30394a + 1;
        gy gyVar = this.f30397d;
        if (i15 >= gyVar.f30437b) {
            return !gyVar.f30438c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f30395b = true;
        int i15 = this.f30394a + 1;
        this.f30394a = i15;
        gy gyVar = this.f30397d;
        return i15 < gyVar.f30437b ? (zx) gyVar.f30436a[i15] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f30395b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f30395b = false;
        this.f30397d.p();
        int i15 = this.f30394a;
        gy gyVar = this.f30397d;
        if (i15 >= gyVar.f30437b) {
            a().remove();
        } else {
            this.f30394a = i15 - 1;
            gyVar.n(i15);
        }
    }
}
