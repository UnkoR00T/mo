package fh;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class l0 extends m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f63357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f63358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ m0 f63359f;

    l0(m0 m0Var, int i15, int i16) {
        this.f63359f = m0Var;
        this.f63357d = i15;
        this.f63358e = i16;
    }

    @Override // fh.h0
    final int f() {
        return this.f63359f.g() + this.f63357d + this.f63358e;
    }

    @Override // fh.h0
    final int g() {
        return this.f63359f.g() + this.f63357d;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        hl.a(i15, this.f63358e, "index");
        return this.f63359f.get(i15 + this.f63357d);
    }

    @Override // fh.h0
    final Object[] h() {
        return this.f63359f.h();
    }

    @Override // fh.m0
    /* JADX INFO: renamed from: i */
    public final m0 subList(int i15, int i16) {
        hl.c(i15, i16, this.f63358e);
        int i17 = this.f63357d;
        return this.f63359f.subList(i15 + i17, i16 + i17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f63358e;
    }

    @Override // fh.m0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i15, int i16) {
        return subList(i15, i16);
    }
}
