package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

/* JADX INFO: loaded from: classes4.dex */
public class c implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f36974a;

    public c() {
        this.f36974a = new bp.d();
    }

    @Override // hp.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f36974a;
    }

    public boolean b() {
        return this.f36974a.i4("Marked", false);
    }

    public boolean c() {
        return this.f36974a.i4("Suspects", false);
    }

    public void d(boolean z15) {
        this.f36974a.R4("Marked", z15);
    }

    public void e(boolean z15) {
        this.f36974a.R4("Suspects", false);
    }

    public void f(boolean z15) {
        this.f36974a.R4(j.f36983c, z15);
    }

    public boolean g() {
        return this.f36974a.i4(j.f36983c, false);
    }

    public c(bp.d dVar) {
        this.f36974a = dVar;
    }
}
