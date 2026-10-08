package com.google.firebase.messaging;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f36589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, vh.l<String>> f36590b = new r0.a();

    interface a {
        vh.l<String> start();
    }

    s0(Executor executor) {
        this.f36589a = executor;
    }

    public static /* synthetic */ vh.l a(s0 s0Var, String str, vh.l lVar) {
        synchronized (s0Var) {
            s0Var.f36590b.remove(str);
        }
        return lVar;
    }

    synchronized vh.l<String> b(final String str, a aVar) {
        vh.l<String> lVar = this.f36590b.get(str);
        if (lVar != null) {
            return lVar;
        }
        vh.l lVarJ = aVar.start().j(this.f36589a, new vh.c() { // from class: com.google.firebase.messaging.r0
            @Override // vh.c
            public final Object a(vh.l lVar2) {
                return s0.a(this.f36586a, str, lVar2);
            }
        });
        this.f36590b.put(str, (vh.l<String>) lVarJ);
        return lVarJ;
    }
}
