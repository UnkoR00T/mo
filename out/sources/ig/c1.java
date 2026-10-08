package ig;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.a f92152b;

    public c1(int i15, com.google.android.gms.common.api.internal.a aVar) {
        super(i15);
        this.f92152b = (com.google.android.gms.common.api.internal.a) jg.s.m(aVar, "Null methods are not runnable.");
    }

    @Override // ig.g1
    public final void a(Status status) {
        try {
            this.f92152b.o(status);
        } catch (IllegalStateException e15) {
            c2.h("ApiCallRunner", "Exception reporting failure", e15);
        }
    }

    @Override // ig.g1
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb5 = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb5.append(simpleName);
        sb5.append(": ");
        sb5.append(localizedMessage);
        try {
            this.f92152b.o(new Status(10, sb5.toString()));
        } catch (IllegalStateException e15) {
            c2.h("ApiCallRunner", "Exception reporting failure", e15);
        }
    }

    @Override // ig.g1
    public final void c(v vVar, boolean z15) {
        vVar.a(this.f92152b, z15);
    }

    @Override // ig.g1
    public final void d(e0 e0Var) throws DeadObjectException {
        try {
            this.f92152b.m(e0Var.t());
        } catch (RuntimeException e15) {
            b(e15);
        }
    }
}
