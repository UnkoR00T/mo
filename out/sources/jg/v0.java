package jg;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import io.sentry.android.core.c2;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class v0 extends xg.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f102564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(c cVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(cVar);
        this.f102564b = cVar;
    }

    private static final void a(Message message) {
        w0 w0Var = (w0) message.obj;
        if (w0Var != null) {
            w0Var.c();
        }
    }

    private static final boolean b(Message message) {
        int i15 = message.what;
        return i15 == 2 || i15 == 1 || i15 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c cVar = this.f102564b;
        if (cVar.E.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i15 = message.what;
        if ((i15 == 1 || i15 == 7 || ((i15 == 4 && !cVar.q()) || message.what == 5)) && !cVar.c()) {
            a(message);
            return;
        }
        int i16 = message.what;
        if (i16 == 4) {
            cVar.d0(new gg.a(message.arg2));
            if (cVar.W() && !cVar.e0()) {
                cVar.T(3, null);
                return;
            }
            gg.a aVarC0 = cVar.c0() != null ? cVar.c0() : new gg.a(8);
            cVar.f102424p.d(aVarC0);
            cVar.I(aVarC0);
            return;
        }
        if (i16 == 5) {
            gg.a aVarC1 = cVar.c0() != null ? cVar.c0() : new gg.a(8);
            cVar.f102424p.d(aVarC1);
            cVar.I(aVarC1);
            return;
        }
        if (i16 == 3) {
            Object obj = message.obj;
            gg.a aVar = new gg.a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            cVar.f102424p.d(aVar);
            cVar.I(aVar);
            return;
        }
        if (i16 == 6) {
            cVar.T(5, null);
            if (cVar.a0() != null) {
                cVar.a0().onConnectionSuspended(message.arg2);
            }
            cVar.J(message.arg2);
            cVar.U(5, 1, null);
            return;
        }
        if (i16 == 2 && !cVar.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((w0) message.obj).b();
            return;
        }
        int i17 = message.what;
        StringBuilder sb5 = new StringBuilder(String.valueOf(i17).length() + 34);
        sb5.append("Don't know how to handle message: ");
        sb5.append(i17);
        c2.k("GmsClient", sb5.toString(), new Exception());
    }
}
