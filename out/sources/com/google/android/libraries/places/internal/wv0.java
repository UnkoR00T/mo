package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class wv0 implements com.google.common.util.concurrent.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ xv0 f34203a;

    wv0(xv0 xv0Var) {
        this.f34203a = xv0Var;
    }

    @Override // com.google.common.util.concurrent.j
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        s20 s20Var = (s20) obj;
        if (s20Var.I().length() > 0) {
            this.f34203a.f34313c.b(s20Var.I());
        }
    }

    @Override // com.google.common.util.concurrent.j
    public final void b(Throwable th4) {
        io.sentry.android.core.c2.h("ZBCC", "Failed to get session", th4);
    }
}
