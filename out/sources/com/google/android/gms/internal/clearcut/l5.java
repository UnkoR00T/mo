package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class l5 extends com.google.android.gms.common.api.internal.a<Status, p5> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final eg.f f29407r;

    l5(eg.f fVar, hg.f fVar2) {
        super(eg.a.f49919p, fVar2);
        this.f29407r = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ hg.l b(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.a
    protected final /* synthetic */ void k(hg.a.b bVar) {
        p5 p5Var = (p5) bVar;
        o5 o5Var = new o5(this);
        try {
            eg.f fVar = this.f29407r;
            fVar.getClass();
            m5 m5Var = fVar.f49961j;
            int iE = m5Var.e();
            byte[] bArr = new byte[iE];
            w4.c(m5Var, bArr, 0, iE);
            fVar.f49954b = bArr;
            ((t5) p5Var.A()).d1(o5Var, this.f29407r);
        } catch (RuntimeException e15) {
            io.sentry.android.core.c2.f("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e15);
            o(new Status(10, "MessageProducer"));
        }
    }
}
