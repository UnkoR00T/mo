package h8;

import android.net.Uri;
import java.io.EOFException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o8.u f81464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o8.p f81465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o8.q f81466c;

    public c(o8.u uVar) {
        this.f81464a = uVar;
    }

    @Override // h8.o0
    public void a(long j15, long j16) {
        ((o8.p) zj.p.q(this.f81465b)).a(j15, j16);
    }

    @Override // h8.o0
    public void b() {
        o8.p pVar = this.f81465b;
        if (pVar != null) {
            pVar.b();
            this.f81465b = null;
        }
        this.f81466c = null;
    }

    @Override // h8.o0
    public void c() {
        o8.p pVar = this.f81465b;
        if (pVar == null) {
            return;
        }
        o8.p pVarE = pVar.e();
        if (pVarE instanceof h9.g) {
            ((h9.g) pVarE).n();
        }
    }

    @Override // h8.o0
    public long d() {
        o8.q qVar = this.f81466c;
        if (qVar != null) {
            return qVar.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    @Override // h8.o0
    public void e(t7.h hVar, Uri uri, Map<String, List<String>> map, long j15, long j16, o8.r rVar) throws k1 {
        o8.j jVar = new o8.j(hVar, j15, j16);
        this.f81466c = jVar;
        if (this.f81465b != null) {
            return;
        }
        o8.p[] pVarArrD = this.f81464a.d(uri, map);
        ak.n0.a aVarT = ak.n0.t(pVarArrD.length);
        if (pVarArrD.length == 1) {
            this.f81465b = pVarArrD[0];
        } else {
            for (o8.p pVar : pVarArrD) {
                try {
                    if (pVar.c(jVar)) {
                        this.f81465b = pVar;
                        zj.p.w(true);
                        jVar.g();
                        break;
                    } else {
                        aVarT.j(pVar.f());
                        boolean z15 = this.f81465b != null || jVar.getPosition() == j15;
                        zj.p.w(z15);
                        jVar.g();
                    }
                } catch (EOFException unused) {
                    if (this.f81465b != null || jVar.getPosition() == j15) {
                    }
                } catch (Throwable th4) {
                    zj.p.w(this.f81465b != null || jVar.getPosition() == j15);
                    jVar.g();
                    throw th4;
                }
                zj.p.w(z15);
                jVar.g();
            }
            if (this.f81465b == null) {
                throw new k1("None of the available extractors (" + zj.i.h(", ").e(ak.a1.k(ak.n0.w(pVarArrD), new zj.g() { // from class: h8.b
                    @Override // zj.g
                    public final Object apply(Object obj) {
                        return ((o8.p) obj).e().getClass().getSimpleName();
                    }
                })) + ") could read the stream.", (Uri) zj.p.q(uri), aVarT.k());
            }
        }
        this.f81465b.d(rVar);
    }

    @Override // h8.o0
    public int f(o8.k0 k0Var) {
        return ((o8.p) zj.p.q(this.f81465b)).g((o8.q) zj.p.q(this.f81466c), k0Var);
    }
}
