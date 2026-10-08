package yc;

import er.l;
import er.q;
import fv.d0;
import fv.f;
import java.io.IOException;
import ju.n;
import ju.p;
import oq.i0;
import oq.t;
import oq.u;
import p071kotlin.Metadata;
import tq.i;
import vq.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfv/e;", "Lfv/d0;", "a", "(Lfv/e;Ltq/e;)Ljava/lang/Object;", "coil-network-okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements l<Throwable, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fv.e f226301a;

        a(fv.e eVar) {
            this.f226301a = eVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Throwable th4) {
            c(th4);
            return i0.f148189a;
        }

        public final void c(Throwable th4) {
            this.f226301a.cancel();
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"yc/c$b", "Lfv/f;", "Lfv/e;", "call", "Ljava/io/IOException;", "Lokio/IOException;", "e", "Loq/i0;", "d", "(Lfv/e;Ljava/io/IOException;)V", "Lfv/d0;", "response", "a", "(Lfv/e;Lfv/d0;)V", "coil-network-okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<d0> f226302a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements q<Throwable, d0, i, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f226303a = new a();

            a() {
            }

            public final void c(Throwable th4, d0 d0Var, i iVar) {
                e.a(d0Var);
            }

            @Override // er.q
            public /* bridge */ /* synthetic */ i0 w(Throwable th4, d0 d0Var, i iVar) {
                c(th4, d0Var, iVar);
                return i0.f148189a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(n<? super d0> nVar) {
            this.f226302a = nVar;
        }

        @Override // fv.f
        public void a(fv.e call, d0 response) {
            this.f226302a.T(response, a.f226303a);
        }

        @Override // fv.f
        public void d(fv.e call, IOException e15) {
            n<d0> nVar = this.f226302a;
            t.Companion companion = t.INSTANCE;
            nVar.i(t.b(u.a(e15)));
        }
    }

    public static final Object a(fv.e eVar, tq.e<? super d0> eVar2) {
        p pVar = new p(uq.b.c(eVar2), 1);
        pVar.D();
        pVar.E(new a(eVar));
        eVar.s1(new b(pVar));
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            g.c(eVar2);
        }
        return objX;
    }
}
