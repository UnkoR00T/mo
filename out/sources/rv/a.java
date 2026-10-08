package rv;

import fr.t;
import fv.b0;
import fv.d0;
import fv.e0;
import fv.f;
import fv.r;
import fv.x;
import fv.z;
import gv.d;
import java.io.IOException;
import kv.e;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010$\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010+R\u0016\u0010\u0014\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010-¨\u0006."}, d2 = {"Lrv/a;", "Luv/a;", "Lrv/b$a;", "Lfv/f;", "Lfv/b0;", "request", "Luv/b;", "listener", "<init>", "(Lfv/b0;Luv/b;)V", "Lfv/e0;", "", "f", "(Lfv/e0;)Z", "Lfv/z;", "client", "Loq/i0;", "e", "(Lfv/z;)V", "Lfv/e;", "call", "Lfv/d0;", "response", "a", "(Lfv/e;Lfv/d0;)V", "g", "(Lfv/d0;)V", "Ljava/io/IOException;", "d", "(Lfv/e;Ljava/io/IOException;)V", "cancel", "()V", "", "id", "type", "data", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "timeMs", "b", "(J)V", "Lfv/b0;", "Luv/b;", "Lkv/e;", "Lkv/e;", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements uv.a, b.a, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 request;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final uv.b listener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private e call;

    public a(b0 b0Var, uv.b bVar) {
        this.request = b0Var;
        this.listener = bVar;
    }

    private final boolean f(e0 e0Var) {
        x f67343c = e0Var.getF67343c();
        return f67343c != null && t.c(f67343c.getType(), "text") && t.c(f67343c.getSubtype(), "event-stream");
    }

    @Override // fv.f
    public void a(fv.e call, d0 response) {
        g(response);
    }

    @Override // rv.b.a
    public void b(long timeMs) {
    }

    @Override // rv.b.a
    public void c(String id5, String type, String data) {
        this.listener.b(this, id5, type, data);
    }

    @Override // uv.a
    public void cancel() {
        e eVar = this.call;
        if (eVar == null) {
            eVar = null;
        }
        eVar.cancel();
    }

    @Override // fv.f
    public void d(fv.e call, IOException e15) {
        this.listener.c(this, e15, null);
    }

    public final void e(z client) {
        e eVar = (e) client.H().j(r.f67486b).b().b(this.request);
        this.call = eVar;
        if (eVar == null) {
            eVar = null;
        }
        eVar.s1(this);
    }

    public final void g(d0 response) {
        try {
            if (!response.isSuccessful()) {
                this.listener.c(this, null, response);
                ar.b.a(response, null);
                return;
            }
            e0 body = response.getBody();
            if (!f(body)) {
                this.listener.c(this, new IllegalStateException("Invalid content-type: " + body.getF67343c()), response);
                ar.b.a(response, null);
                return;
            }
            e eVar = this.call;
            if (eVar == null) {
                eVar = null;
            }
            eVar.H();
            d0 d0VarC = response.K().b(d.f77105c).c();
            b bVar = new b(body.getSource(), this);
            try {
                this.listener.d(this, d0VarC);
                do {
                } while (bVar.d());
                this.listener.a(this);
                i0 i0Var = i0.f148189a;
                ar.b.a(response, null);
            } catch (Exception e15) {
                this.listener.c(this, e15, d0VarC);
                ar.b.a(response, null);
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ar.b.a(response, th4);
                throw th5;
            }
        }
    }
}
