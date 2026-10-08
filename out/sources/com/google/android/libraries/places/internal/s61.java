package com.google.android.libraries.places.internal;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class s61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33652a;

    public s61(Context context) {
        this.f33652a = context;
    }

    public final Object a(Uri uri, u61 u61Var, tq.e eVar) {
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX == uq.b.e() ? objX : oq.i0.f148189a;
    }
}
