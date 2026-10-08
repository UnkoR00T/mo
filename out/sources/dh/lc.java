package dh;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class lc extends mc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient int f42023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f42024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ mc f42025e;

    lc(mc mcVar, int i15, int i16) {
        this.f42025e = mcVar;
        this.f42023c = i15;
        this.f42024d = i16;
    }

    @Override // dh.la
    final int f() {
        return this.f42025e.g() + this.f42023c + this.f42024d;
    }

    @Override // dh.la
    final int g() {
        return this.f42025e.g() + this.f42023c;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        f4.a(i15, this.f42024d, "index");
        return this.f42025e.get(i15 + this.f42023c);
    }

    @Override // dh.la
    final Object[] h() {
        return this.f42025e.h();
    }

    @Override // dh.mc
    /* JADX INFO: renamed from: i */
    public final mc subList(int i15, int i16) {
        f4.c(i15, i16, this.f42024d);
        mc mcVar = this.f42025e;
        int i17 = this.f42023c;
        return mcVar.subList(i15 + i17, i16 + i17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42024d;
    }

    @Override // dh.mc, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i15, int i16) {
        return subList(i15, i16);
    }
}
