package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class n3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f29471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ f3 f29472d;

    private n3(f3 f3Var) {
        this.f29472d = f3Var;
        this.f29469a = -1;
    }

    private final Iterator a() {
        if (this.f29471c == null) {
            this.f29471c = this.f29472d.f29338c.entrySet().iterator();
        }
        return this.f29471c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29469a + 1 < this.f29472d.f29337b.size() || (!this.f29472d.f29338c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f29470b = true;
        int i15 = this.f29469a + 1;
        this.f29469a = i15;
        return (Map.Entry) (i15 < this.f29472d.f29337b.size() ? this.f29472d.f29337b.get(this.f29469a) : a().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f29470b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f29470b = false;
        this.f29472d.p();
        if (this.f29469a >= this.f29472d.f29337b.size()) {
            a().remove();
            return;
        }
        f3 f3Var = this.f29472d;
        int i15 = this.f29469a;
        this.f29469a = i15 - 1;
        f3Var.h(i15);
    }

    /* synthetic */ n3(f3 f3Var, g3 g3Var) {
        this(f3Var);
    }
}
