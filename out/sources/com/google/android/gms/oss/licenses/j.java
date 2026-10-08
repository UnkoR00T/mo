package com.google.android.gms.oss.licenses;

import android.content.Context;
import com.google.android.gms.internal.oss_licenses.k4;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import vh.o;

/* JADX INFO: loaded from: classes3.dex */
final class j extends s7.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List f31444o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c f31445p;

    j(Context context, c cVar) {
        super(context.getApplicationContext());
        this.f31445p = cVar;
    }

    @Override // s7.a
    public final /* bridge */ /* synthetic */ Object B() {
        ArrayList arrayListA = k4.a(i(), oh.c.f145730a);
        i iVarC = this.f31445p.c();
        vh.l lVarG = o.g(iVarC.p(new h(iVarC, arrayListA)), 2L, TimeUnit.SECONDS);
        try {
            o.a(lVarG);
            if (lVarG.q()) {
                return (List) lVarG.m();
            }
        } catch (InterruptedException | ExecutionException e15) {
            c2.g("OssLicensesLoader", "Error getting license list from service: ".concat(String.valueOf(e15.getMessage())));
        }
        return arrayListA;
    }

    @Override // s7.b
    public final /* synthetic */ void f(Object obj) {
        List list = (List) obj;
        this.f31444o = list;
        super.f(list);
    }

    @Override // s7.b
    protected final void p() {
        List list = this.f31444o;
        if (list != null) {
            super.f(list);
        } else {
            h();
        }
    }

    @Override // s7.b
    protected final void q() {
        b();
    }
}
