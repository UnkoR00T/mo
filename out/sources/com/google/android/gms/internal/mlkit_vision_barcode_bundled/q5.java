package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class q5 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30204a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f30206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ u5 f30207d;

    /* synthetic */ q5(u5 u5Var, p5 p5Var) {
        this.f30207d = u5Var;
    }

    private final Iterator a() {
        if (this.f30206c == null) {
            this.f30206c = this.f30207d.f30267c.entrySet().iterator();
        }
        return this.f30206c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i15 = this.f30204a + 1;
        u5 u5Var = this.f30207d;
        if (i15 >= u5Var.f30266b) {
            return !u5Var.f30267c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f30205b = true;
        int i15 = this.f30204a + 1;
        this.f30204a = i15;
        u5 u5Var = this.f30207d;
        return i15 < u5Var.f30266b ? (o5) u5Var.f30265a[i15] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f30205b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f30205b = false;
        this.f30207d.p();
        int i15 = this.f30204a;
        u5 u5Var = this.f30207d;
        if (i15 >= u5Var.f30266b) {
            a().remove();
        } else {
            this.f30204a = i15 - 1;
            u5Var.n(i15);
        }
    }
}
