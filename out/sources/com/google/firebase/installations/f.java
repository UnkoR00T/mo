package com.google.firebase.installations;

import vh.m;

/* JADX INFO: loaded from: classes4.dex */
class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final m<String> f36430a;

    public f(m<String> mVar) {
        this.f36430a = mVar;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(nl.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f36430a.e(dVar.d());
        return true;
    }
}
