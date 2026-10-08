package k94;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.y0;
import f00.f0;
import fr.q0;
import m94.h0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll94/a;", "colorScheme", "Lh94/a;", "featureConfig", "", "studentId", "Lkotlin/Function0;", "Loq/i0;", "navResult", "l", "(Ll94/a;Lh94/a;Ljava/lang/String;Ler/a;Lm2/r;I)V", "o", "(Lh94/a;Ljava/lang/String;Ler/a;Lm2/r;I)V", "schoolbehavior_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {
    public static final void l(final l94.a aVar, final h94.a aVar2, final String str, final er.a<i0> aVar3, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(26007543);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.c(aVar2.ordinal()) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(str) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar3) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(26007543, i16, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.SchoolBehaviorNavContent (SchoolBehaviorNavContent.kt:30)");
            }
            d0.c(l94.c.c().d(aVar), y2.m.d(-1508057929, true, new er.p() { // from class: k94.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.m(aVar2, str, aVar3, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: k94.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.n(aVar, aVar2, str, aVar3, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(h94.a aVar, String str, er.a aVar2, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1508057929, i15, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.SchoolBehaviorNavContent.<anonymous> (SchoolBehaviorNavContent.kt:34)");
            }
            o(aVar, str, aVar2, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(l94.a aVar, h94.a aVar2, String str, er.a aVar3, int i15, p076m2.r rVar, int i16) {
        l(aVar, aVar2, str, aVar3, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static final void o(final h94.a aVar, final String str, final er.a<i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1881213416);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.c(aVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(str) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar2) ? 256 : 128;
        }
        int i17 = i16;
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1881213416, i17, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.SchoolBehaviorNavGraph (SchoolBehaviorNavContent.kt:48)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            boolean z15 = ((i17 & 14) == 4) | ((i17 & 112) == 32);
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: k94.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o.p(aVar, str, (t.a) obj);
                    }
                };
                rVarH.v(objE);
            }
            er.l lVar = (er.l) objE;
            y0 y0VarC = q7.b.f165175a.c(rVarH, q7.b.f165177c);
            if (y0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            final t tVar = (t) q7.d.c(q0.c(t.class), y0VarC, null, j7.a.a(y0VarC, rVarH, 0), y0VarC instanceof androidx.p016lifecycle.h ? kq.a.b(((androidx.p016lifecycle.h) y0VarC).x(), lVar) : kq.a.b(CreationExtras.b.f153222c, lVar), rVarH, 0, 0);
            a aVar3 = a.f109264a;
            boolean zG = rVarH.G(tVar) | ((i17 & 896) == 256) | rVarH.G(sVarJ);
            Object objE2 = rVarH.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: k94.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o.q(tVar, aVar2, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f00.d0.j(sVarJ, aVar3, (er.l) objE2, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: k94.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.x(aVar, str, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t p(h94.a aVar, String str, t.a aVar2) {
        return aVar2.a(aVar, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final t tVar, final er.a aVar, final f00.s sVar, d1 d1Var) {
        f00.r.u(d1Var, a.f109264a, null, y2.m.b(248409783, true, new er.r() { // from class: k94.j
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return o.r(tVar, aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, b.f109266a, null, y2.m.b(231065262, true, new er.r() { // from class: k94.k
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return o.u(tVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final t tVar, final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(248409783, i15, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.SchoolBehaviorNavGraph.<anonymous>.<anonymous>.<anonymous> (SchoolBehaviorNavContent.kt:61)");
        }
        boolean zG = rVar.G(tVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: k94.n
                @Override // er.l
                public final Object b(Object obj) {
                    return o.s(tVar, (h0.a) obj);
                }
            };
            rVar.v(objE);
        }
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        h0 h0Var = (h0) q7.d.c(q0.c(h0.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<m94.a.c> bVarY1 = h0Var.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: k94.e
                @Override // er.l
                public final Object b(Object obj) {
                    return o.t(aVar, sVar, (m94.a.c) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        m94.w.L(h0Var, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 s(t tVar, h0.a aVar) {
        return aVar.a(tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(er.a aVar, f00.s sVar, m94.a.c cVar) {
        if (fr.t.c(cVar, m94.a.c.C3071a.f124843a)) {
            aVar.a();
        } else {
            if (!(cVar instanceof m94.a.c.b)) {
                throw new oq.p();
            }
            f00.s.m(sVar, b.f109266a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(final t tVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(231065262, i15, -1, "pl.gov.coi.shared.feature.schoolbehavior.presentation.SchoolBehaviorNavGraph.<anonymous>.<anonymous>.<anonymous> (SchoolBehaviorNavContent.kt:78)");
        }
        boolean zG = rVar.G(tVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: k94.l
                @Override // er.l
                public final Object b(Object obj) {
                    return o.v(tVar, (p94.n.a) obj);
                }
            };
            rVar.v(objE);
        }
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), wVar.w());
        CreationExtras creationExtrasB = kq.a.b(wVar.x(), (er.l) objE);
        p94.n nVar = (p94.n) q7.d.c(q0.c(p94.n.class), wVar, null, cVarA, creationExtrasB, rVar, (((i15 >> 3) & 14) << 3) & 112, 0);
        xw.b<p94.g.a> bVarY1 = nVar.Y1();
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: k94.m
                @Override // er.l
                public final Object b(Object obj) {
                    return o.w(sVar, (p94.g.a) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        p94.f.f(nVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p94.n v(t tVar, p94.n.a aVar) {
        return aVar.a(tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(f00.s sVar, p94.g.a aVar) {
        if (!fr.t.c(aVar, p94.g.a.C3802a.f153725a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(h94.a aVar, String str, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        o(aVar, str, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
