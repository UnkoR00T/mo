package ch;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class h1 extends i1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f25920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f25921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ i1 f25922f;

    h1(i1 i1Var, int i15, int i16) {
        this.f25922f = i1Var;
        this.f25920d = i15;
        this.f25921e = i16;
    }

    @Override // ch.d1
    final int f() {
        return this.f25922f.g() + this.f25920d + this.f25921e;
    }

    @Override // ch.d1
    final int g() {
        return this.f25922f.g() + this.f25920d;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        t.a(i15, this.f25921e, "index");
        return this.f25922f.get(i15 + this.f25920d);
    }

    @Override // ch.d1
    final Object[] i() {
        return this.f25922f.i();
    }

    @Override // ch.i1
    /* JADX INFO: renamed from: j */
    public final i1 subList(int i15, int i16) {
        t.d(i15, i16, this.f25921e);
        int i17 = this.f25920d;
        return this.f25922f.subList(i15 + i17, i16 + i17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25921e;
    }

    @Override // ch.i1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i15, int i16) {
        return subList(i15, i16);
    }
}
