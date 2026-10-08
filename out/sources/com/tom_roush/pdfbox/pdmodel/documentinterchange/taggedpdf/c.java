package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import bp.j;

/* JADX INFO: loaded from: classes4.dex */
public class c implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.a f36998a;

    public c() {
        bp.a aVar = new bp.a();
        this.f36998a = aVar;
        j jVar = j.f20954c;
        aVar.A3(jVar);
        aVar.A3(jVar);
        aVar.A3(jVar);
        aVar.A3(jVar);
    }

    private op.f c(int i15) {
        bp.b bVarK4 = this.f36998a.k4(i15);
        if (bVarK4 instanceof bp.a) {
            return new op.f((bp.a) bVarK4);
        }
        return null;
    }

    private void h(int i15, op.f fVar) {
        this.f36998a.p4(i15, fVar == null ? j.f20954c : fVar.a());
    }

    @Override // hp.c
    public bp.b D1() {
        return this.f36998a;
    }

    public op.f a() {
        return c(1);
    }

    public op.f b() {
        return c(0);
    }

    public op.f d() {
        return c(3);
    }

    public op.f e() {
        return c(2);
    }

    public void f(op.f fVar) {
        h(1, fVar);
    }

    public void g(op.f fVar) {
        h(0, fVar);
    }

    public void i(op.f fVar) {
        h(3, fVar);
    }

    public void j(op.f fVar) {
        h(2, fVar);
    }

    public c(bp.a aVar) {
        this.f36998a = aVar;
        if (aVar.size() < 4) {
            for (int size = aVar.size() - 1; size < 4; size++) {
                this.f36998a.A3(j.f20954c);
            }
        }
    }
}
