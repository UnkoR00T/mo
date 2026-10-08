package ym;

import jg.s;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f227887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pm.d f227888b;

    d(f fVar, pm.d dVar) {
        this.f227887a = fVar;
        this.f227888b = dVar;
    }

    public final a a() {
        return b(a.f227877j);
    }

    public final a b(xm.e eVar) {
        s.m(eVar, "You must provide a valid FaceDetectorOptions.");
        return new a((i) this.f227887a.b(eVar), this.f227888b, eVar, null);
    }
}
