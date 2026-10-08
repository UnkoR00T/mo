package com.google.firebase.installations;

import vh.m;

/* JADX INFO: loaded from: classes4.dex */
class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f36428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m<g> f36429b;

    public e(i iVar, m<g> mVar) {
        this.f36428a = iVar;
        this.f36429b = mVar;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        this.f36429b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(nl.d dVar) {
        if (!dVar.k() || this.f36428a.f(dVar)) {
            return false;
        }
        this.f36429b.c(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
