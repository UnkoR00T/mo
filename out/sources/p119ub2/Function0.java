package p119ub2;

import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import er.l;
import er.p;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q;
import fr.q0;
import mr.g;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p115tc2.n;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import q7.b;
import q7.d;
import y2.m;

/* JADX INFO: renamed from: ub2.n, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "f", "(Ler/a;Lm2/r;I)V", "identitycardinvalidation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: ub2.n$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, n.class, "exitWizardProcess", "exitWizardProcess()V", 0);
        }

        public final void E() {
            ((n) this.f66391b).j9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    public static final void f(final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1327537251);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1327537251, i16, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NavContent (NavContent.kt:15)");
            }
            s sVarJ = f00.r.J(null, rVarH, 0, 1);
            h1.n nVar = h1.n.f197348b;
            boolean z15 = (i16 & 14) == 4;
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: ub2.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.g(aVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, nVar, (l) objE, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: ub2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.k(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final er.a aVar, d1 d1Var) {
        f00.r.u(d1Var, h1.n.f197348b, null, m.b(-251382212, true, new er.r() { // from class: ub2.k
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.h(aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(final er.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-251382212, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NavContent.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:25)");
        }
        y0 y0VarC = b.f165175a.c(rVar, b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        final n nVar = (n) d.c(q0.c(n.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<p115tc2.f> bVarY1 = nVar.Y1();
        boolean zW = rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: ub2.l
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.i(aVar, (p115tc2.f) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        p115tc2.Function0.b(m.d(-563383680, true, new p() { // from class: ub2.m
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Function0.j(nVar, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(er.a aVar, p115tc2.f fVar) {
        if (!fr.t.c(fVar, tc2.f.a.f189473a)) {
            throw new oq.p();
        }
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(n nVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-563383680, i15, -1, "pl.gov.coi.mobywatel.feature.identitycardinvalidation.presentation.NavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:33)");
            }
            boolean zG = rVar.G(nVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new a(nVar);
                rVar.v(objE);
            }
            g1.S(nVar, (er.a) ((g) objE), rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(er.a aVar, int i15, r rVar, int i16) {
        f(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
