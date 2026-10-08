package bh;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class e extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f19420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f19421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ f f19422f;

    e(f fVar, int i15, int i16) {
        this.f19422f = fVar;
        this.f19420d = i15;
        this.f19421e = i16;
    }

    @Override // bh.c
    final int f() {
        return this.f19422f.g() + this.f19420d + this.f19421e;
    }

    @Override // bh.c
    final int g() {
        return this.f19422f.g() + this.f19420d;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        x0.a(i15, this.f19421e, "index");
        return this.f19422f.get(i15 + this.f19420d);
    }

    @Override // bh.c
    final Object[] h() {
        return this.f19422f.h();
    }

    @Override // bh.f
    /* JADX INFO: renamed from: i */
    public final f subList(int i15, int i16) {
        x0.c(i15, i16, this.f19421e);
        int i17 = this.f19420d;
        return this.f19422f.subList(i15 + i17, i16 + i17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19421e;
    }

    @Override // bh.f, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i15, int i16) {
        return subList(i15, i16);
    }
}
