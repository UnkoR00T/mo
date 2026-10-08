package p056h1;

import b3.i;
import c5.b;
import er.l;
import er.p;
import er.q;
import f3.m;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.p2;
import p036e4.r2;
import p036e4.s2;
import p036e4.x0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.t;
import p076m2.x5;

/* JADX INFO: renamed from: h1.x0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\n\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/Function0;", "Lh1/o0;", "itemProvider", "Lf3/m;", "modifier", "Lh1/l1;", "prefetchState", "Lh1/y0;", "measurePolicy", "Loq/i0;", "f", "(Ler/a;Lf3/m;Lh1/l1;Lh1/y0;Lm2/r;II)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: h1.x0$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"h1/x0$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l1 f79622a;

        public a(l1 l1Var) {
            this.f79622a = l1Var;
        }

        @Override // p076m2.r0
        public void j() {
            v2 prefetchHandleProvider = this.f79622a.getPrefetchHandleProvider();
            if (prefetchHandleProvider != null) {
                prefetchHandleProvider.g();
            }
            this.f79622a.k(null);
        }
    }

    public static final void f(final er.a<? extends o0> aVar, final m mVar, final l1 l1Var, final y0 y0Var, r rVar, final int i15, final int i16) {
        int i17;
        r rVarH = rVar.h(1055276397);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.W(mVar) ? 32 : 16;
        }
        int i19 = i16 & 4;
        if (i19 != 0) {
            i17 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(l1Var) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= (i15 & PKIFailureInfo.certConfirmed) == 0 ? rVarH.W(y0Var) : rVarH.G(y0Var) ? 2048 : 1024;
        }
        if (rVarH.r((i17 & 1171) != 1170, i17 & 1)) {
            if (i18 != 0) {
                mVar = m.INSTANCE;
            }
            if (i19 != 0) {
                l1Var = null;
            }
            if (t.k()) {
                t.o(1055276397, i17, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:111)");
            }
            final f6 f6VarP = x5.p(aVar, rVarH, i17 & 14);
            Function1.d(y2.m.d(-933153643, true, new q() { // from class: h1.s0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return Function0.g(l1Var, mVar, y0Var, f6VarP, (i) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        final m mVar2 = mVar;
        final l1 l1Var2 = l1Var;
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: h1.t0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.k(aVar, mVar2, l1Var2, y0Var, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final l1 l1Var, m mVar, final y0 y0Var, final f6 f6Var, i iVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-933153643, i15, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:115)");
        }
        Object objE = rVar.E();
        r.Companion companion = r.INSTANCE;
        if (objE == companion.a()) {
            objE = new k0(iVar, new er.a() { // from class: h1.u0
                @Override // er.a
                public final Object a() {
                    return Function0.h(f6Var);
                }
            });
            rVar.v(objE);
        }
        final k0 k0Var = (k0) objE;
        Object objE2 = rVar.E();
        if (objE2 == companion.a()) {
            objE2 = new r2(new q0(k0Var));
            rVar.v(objE2);
        }
        final r2 r2Var = (r2) objE2;
        if (l1Var != null) {
            rVar.X(1743490539);
            final z2 prefetchScheduler = l1Var.getPrefetchScheduler();
            if (prefetchScheduler == null) {
                rVar.X(887527095);
                prefetchScheduler = a3.a(rVar, 0);
            } else {
                rVar.X(887526010);
            }
            rVar.R();
            Object[] objArr = {l1Var, k0Var, r2Var, prefetchScheduler};
            boolean zW = rVar.W(l1Var) | rVar.G(k0Var) | rVar.G(r2Var) | rVar.G(prefetchScheduler);
            Object objE3 = rVar.E();
            if (zW || objE3 == companion.a()) {
                objE3 = new l() { // from class: h1.v0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.i(l1Var, k0Var, r2Var, prefetchScheduler, (s0) obj);
                    }
                };
                rVar.v(objE3);
            }
            p076m2.Function0.c(objArr, (l) objE3, rVar, 0);
            rVar.R();
        } else {
            rVar.X(1744076749);
            rVar.R();
        }
        m mVarA = m1.a(mVar, l1Var);
        boolean zW2 = rVar.W(k0Var) | rVar.W(y0Var);
        Object objE4 = rVar.E();
        if (zW2 || objE4 == companion.a()) {
            objE4 = new p() { // from class: h1.w0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.j(k0Var, y0Var, (s2) obj, (b) obj2);
                }
            };
            rVar.v(objE4);
        }
        p2.a(r2Var, mVarA, (p) objE4, rVar, r2.f47410f, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 h(f6 f6Var) {
        return (o0) ((er.a) f6Var.getValue()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 i(l1 l1Var, k0 k0Var, r2 r2Var, z2 z2Var, s0 s0Var) {
        l1Var.k(new v2(k0Var, r2Var, z2Var));
        return new a(l1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 j(k0 k0Var, y0 y0Var, s2 s2Var, b bVar) {
        return y0Var.a(new a1(k0Var, s2Var), bVar.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(er.a aVar, m mVar, l1 l1Var, y0 y0Var, int i15, int i16, r rVar, int i17) {
        f(aVar, mVar, l1Var, y0Var, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
