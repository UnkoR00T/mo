package p024c42;

import a52.x;
import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import c52.k;
import cb4.DialogData;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import e52.CommitmentVariantAssistedData;
import e52.CommitmentVariantEntryData;
import er.a;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import h52.z;
import l52.n;
import mr.c;
import mu.g;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import p52.StampDutyPaymentsResultRequiredData;
import p7.CreationExtras;
import pq.v;
import q7.b;
import qx3.MakePaymentInitialData;
import v52.d;
import y2.m;
import y52.StampDutyCommitmentTypeData;

/* JADX INFO: renamed from: c42.m4, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\t\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Lcb4/d;", "Loq/i0;", "showDialog", "Lkotlin/Function0;", "closeProcess", "Lqx3/d;", "toPayNow", "closeWithRefresh", i.f37087n, "(Ler/l;Ler/a;Ler/l;Ler/a;Lm2/r;I)V", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function1 {
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
    public static final void H(final l<? super DialogData, i0> lVar, final a<i0> aVar, final l<? super MakePaymentInitialData, i0> lVar2, final a<i0> aVar2, r rVar, final int i15) {
        int i16;
        final s sVar;
        r rVarH = rVar.h(1412728123);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(lVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar2) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (t.k()) {
                t.o(1412728123, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav (StampDutyProcessNav.kt:52)");
            }
            s sVarJ = f00.r.J(null, rVarH, 0, 1);
            y0 y0VarC = b.f165175a.c(rVarH, b.f165177c);
            if (y0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            int i17 = i16;
            final d dVar = (d) q7.d.c(q0.c(d.class), y0VarC, null, j7.a.a(y0VarC, rVarH, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVarH, 0, 0);
            xw.b<v52.a> bVarY1 = dVar.Y1();
            int i18 = i17 & 112;
            boolean z15 = ((i17 & 14) == 4) | (i18 == 32);
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: c42.c4
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function1.I(aVar, lVar, (v52.a) obj);
                    }
                };
                rVarH.v(objE);
            }
            f0.b(bVarY1, (l) objE, rVarH, xw.b.f221619c);
            w2 w2Var = w2.f23343a;
            boolean zG = rVarH.G(sVarJ) | (i18 == 32) | rVarH.G(dVar) | ((i17 & 7168) == 2048) | ((i17 & 896) == 256);
            Object objE2 = rVarH.E();
            if (zG || objE2 == r.INSTANCE.a()) {
                sVar = sVarJ;
                l lVar3 = new l() { // from class: c42.d4
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function1.J(aVar, sVar, dVar, aVar2, lVar2, (d1) obj);
                    }
                };
                rVarH.v(lVar3);
                objE2 = lVar3;
            } else {
                sVar = sVarJ;
            }
            d0.j(sVar, w2Var, (l) objE2, rVarH, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: c42.e4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function1.o0(lVar, aVar, lVar2, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(a aVar, l lVar, v52.a aVar2) {
        if (fr.t.c(aVar2, v52.a.C5317a.f204040a)) {
            aVar.a();
        } else {
            if (!(aVar2 instanceof v52.a.ShowCloseProcessDialog)) {
                throw new oq.p();
            }
            lVar.b(((v52.a.ShowCloseProcessDialog) aVar2).getDialogData());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(final a aVar, final s sVar, final d dVar, final a aVar2, final l lVar, d1 d1Var) {
        f00.r.u(d1Var, w2.f23343a, null, m.b(-1372798340, true, new er.r() { // from class: c42.f3
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.K(aVar, sVar, dVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, r2.f23298a, null, m.b(1471503205, true, new er.r() { // from class: c42.q3
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.N(dVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s2.f23303a, null, m.b(2064991876, true, new er.r() { // from class: c42.b4
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.Q(dVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, v2.f23327a, null, m.b(-1636486749, true, new er.r() { // from class: c42.f4
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.T(dVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, b3.f23139a, null, m.b(-1042998078, true, new er.r() { // from class: c42.g4
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.W(dVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, y2.f23361a, null, m.b(-449509407, true, new er.r() { // from class: c42.h4
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.Z(dVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a3.f23132a, null, m.b(143979264, true, new er.r() { // from class: c42.i4
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.c0(dVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, z2.f23369a, null, m.b(737467935, true, new er.r() { // from class: c42.j4
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.f0(sVar, aVar2, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, u2.f23320a, null, m.b(1330956606, true, new er.r() { // from class: c42.k4
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.i0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, t2.f23312a, new g0.Dialog(null, 1, null), m.b(1924445277, true, new er.r() { // from class: c42.l4
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function1.l0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(final a aVar, final s sVar, final d dVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1372798340, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:69)");
        }
        f00.r.n(wVar, q0.c(j52.l.class), m.d(1417191338, true, new q() { // from class: c42.p3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.L(aVar, sVar, dVar, (zx.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), w.f23331a.o(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(final a aVar, final s sVar, final d dVar, zx.d dVar2, r rVar, int i15) {
        if (t.k()) {
            t.o(1417191338, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:72)");
        }
        g gVarY1 = dVar2.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.G(dVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.t3
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.M(aVar, sVar, dVar, (j52.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(a aVar, s sVar, d dVar, j52.b bVar) {
        if (fr.t.c(bVar, j52.b.a.f99530a)) {
            aVar.a();
        } else {
            if (!fr.t.c(bVar, j52.b.C2332b.f99531a)) {
                throw new oq.p();
            }
            r2 r2Var = r2.f23298a;
            StampDutyCommitmentTypeData stampDutyCommitmentTypeDataX0 = dVar.X0();
            if (stampDutyCommitmentTypeDataX0 == null) {
                stampDutyCommitmentTypeDataX0 = new StampDutyCommitmentTypeData("", "");
            }
            s.l(sVar, r2Var, stampDutyCommitmentTypeDataX0, null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(final d dVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1471503205, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:90)");
        }
        f00.r.o(wVar, q0.c(x.class), dVar, m.d(-1934238956, true, new q() { // from class: c42.k3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.O(sVar, dVar, aVar, (zx.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), w.f23331a.i(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(final s sVar, final d dVar, final a aVar, zx.d dVar2, r rVar, int i15) {
        if (t.k()) {
            t.o(-1934238956, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:94)");
        }
        g gVarY1 = dVar2.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(dVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.s3
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.P(sVar, dVar, aVar, (a52.a.j) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(s sVar, d dVar, a aVar, a52.a.j jVar) {
        if (fr.t.c(jVar, a52.a.j.C0056a.f3516a)) {
            sVar.c();
        } else if (jVar instanceof a52.a.j.Error) {
            s.l(sVar, u2.f23320a, ((a52.a.j.Error) jVar).getErrorData(), null, 4, null);
        } else if (jVar instanceof a52.a.j.ToCommitmentVariant) {
            s.l(sVar, s2.f23303a, new CommitmentVariantAssistedData(dVar, ((a52.a.j.ToCommitmentVariant) jVar).getCommitmentVariantEntryData()), null, 4, null);
        } else if (fr.t.c(jVar, a52.a.j.b.f3517a)) {
            dVar.a9();
        } else if (fr.t.c(jVar, a52.a.j.f.f3521a)) {
            s.l(sVar, v2.f23327a, dVar, null, 4, null);
        } else {
            if (!fr.t.c(jVar, a52.a.j.c.f3518a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(final d dVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        CommitmentVariantEntryData commitmentVariantEntryData;
        if (t.k()) {
            t.o(2064991876, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:125)");
        }
        c cVarC = q0.c(k.class);
        CommitmentVariantAssistedData commitmentVariantAssistedData = (CommitmentVariantAssistedData) sVar.g(s2.f23303a);
        if (commitmentVariantAssistedData == null || (commitmentVariantEntryData = commitmentVariantAssistedData.getCommitmentVariantEntryData()) == null) {
            commitmentVariantEntryData = new CommitmentVariantEntryData(v.n());
        }
        f00.r.o(wVar, cVarC, new CommitmentVariantAssistedData(dVar, commitmentVariantEntryData), m.d(-1340750285, true, new q() { // from class: c42.h3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.R(sVar, dVar, (zx.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), w.f23331a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(final s sVar, final d dVar, zx.d dVar2, r rVar, int i15) {
        if (t.k()) {
            t.o(-1340750285, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:134)");
        }
        g gVarY1 = dVar2.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(dVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.v3
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.S(sVar, dVar, (c52.a.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(s sVar, d dVar, c52.a.c cVar) {
        if (fr.t.c(cVar, c52.a.c.C0627a.f23623a)) {
            sVar.c();
        } else if (fr.t.c(cVar, c52.a.c.b.f23624a)) {
            dVar.a9();
        } else {
            if (!fr.t.c(cVar, c52.a.c.C0628c.f23625a)) {
                throw new oq.p();
            }
            s.l(sVar, v2.f23327a, dVar, null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(final d dVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1636486749, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:150)");
        }
        f00.r.o(wVar, q0.c(z.class), dVar, m.d(-747261614, true, new q() { // from class: c42.n3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.U(sVar, dVar, aVar, (zx.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), w.f23331a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(final s sVar, final d dVar, final a aVar, zx.d dVar2, r rVar, int i15) {
        if (t.k()) {
            t.o(-747261614, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:154)");
        }
        g gVarY1 = dVar2.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(dVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.y3
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.V(sVar, dVar, aVar, (h52.f.j) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(s sVar, d dVar, a aVar, h52.f.j jVar) {
        if (fr.t.c(jVar, h52.f.j.a.f81036a)) {
            sVar.c();
        } else if (fr.t.c(jVar, h52.f.j.b.f81037a)) {
            dVar.a9();
        } else if (jVar instanceof h52.f.j.Error) {
            s.l(sVar, u2.f23320a, ((h52.f.j.Error) jVar).getErrorData(), null, 4, null);
        } else if (fr.t.c(jVar, h52.f.j.C1866f.f81041a)) {
            s.l(sVar, b3.f23139a, dVar, null, 4, null);
        } else if (fr.t.c(jVar, h52.f.j.c.f81038a)) {
            aVar.a();
        } else {
            if (!(jVar instanceof h52.f.j.ShowConfirmInstitutionDialog)) {
                throw new oq.p();
            }
            s.l(sVar, t2.f23312a, ((h52.f.j.ShowConfirmInstitutionDialog) jVar).getDialogData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(final d dVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1042998078, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:181)");
        }
        f00.r.o(wVar, q0.c(t52.l.class), dVar, m.d(-153772943, true, new q() { // from class: c42.g3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.X(sVar, dVar, (zx.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), w.f23331a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(final s sVar, final d dVar, zx.d dVar2, r rVar, int i15) {
        if (t.k()) {
            t.o(-153772943, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:185)");
        }
        g gVarY1 = dVar2.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(dVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.x3
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.Y(sVar, dVar, (t52.a.f) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(s sVar, d dVar, t52.a.f fVar) {
        if (fVar instanceof t52.a.f.e) {
            s.l(sVar, a3.f23132a, dVar, null, 4, null);
        } else if (fr.t.c(fVar, t52.a.f.d.f187752a)) {
            s.l(sVar, y2.f23361a, dVar, null, 4, null);
        } else if (fVar instanceof t52.a.f.Error) {
            s.l(sVar, u2.f23320a, ((t52.a.f.Error) fVar).getErrorData(), null, 4, null);
        } else if (fr.t.c(fVar, t52.a.f.b.f187750a)) {
            dVar.a9();
        } else {
            if (!(fVar instanceof t52.a.f.C4880a)) {
                throw new oq.p();
            }
            sVar.c();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(final d dVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-449509407, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:209)");
        }
        f00.r.o(wVar, q0.c(n.class), dVar, m.d(439715728, true, new q() { // from class: c42.m3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.a0(sVar, dVar, (zx.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), w.f23331a.p(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a0(final s sVar, final d dVar, zx.d dVar2, r rVar, int i15) {
        if (t.k()) {
            t.o(439715728, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:213)");
        }
        g gVarY1 = dVar2.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(dVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.a4
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.b0(sVar, dVar, (l52.a.e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b0(s sVar, d dVar, l52.a.e eVar) {
        if (eVar instanceof l52.a.e.c) {
            s.l(sVar, a3.f23132a, dVar, null, 4, null);
        } else if (fr.t.c(eVar, l52.a.e.b.f116180a)) {
            dVar.a9();
        } else {
            if (!(eVar instanceof l52.a.e.C2809a)) {
                throw new oq.p();
            }
            sVar.c();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c0(final d dVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(143979264, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:229)");
        }
        f00.r.o(wVar, q0.c(q52.k.class), dVar, m.d(1033204399, true, new q() { // from class: c42.i3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.d0(sVar, dVar, aVar, (zx.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), w.f23331a.l(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d0(final s sVar, final d dVar, final a aVar, zx.d dVar2, r rVar, int i15) {
        if (t.k()) {
            t.o(1033204399, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:233)");
        }
        g gVarY1 = dVar2.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(dVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.u3
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.e0(sVar, dVar, aVar, (q52.a.f) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e0(s sVar, d dVar, a aVar, q52.a.f fVar) {
        if (fr.t.c(fVar, q52.a.f.C4096a.f164813a)) {
            sVar.c();
        } else if (fr.t.c(fVar, q52.a.f.b.f164814a)) {
            dVar.a9();
        } else if (fVar instanceof q52.a.f.ToCreatePayment) {
            s.l(sVar, z2.f23369a, new StampDutyPaymentsResultRequiredData(((q52.a.f.ToCreatePayment) fVar).getStampDuty().getPaymentId()), null, 4, null);
        } else if (fVar instanceof q52.a.f.Error) {
            s.l(sVar, u2.f23320a, ((q52.a.f.Error) fVar).getErrorData(), null, 4, null);
        } else {
            if (!fr.t.c(fVar, q52.a.f.c.f164815a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f0(final s sVar, final a aVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(737467935, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:256)");
        }
        c cVarC = q0.c(n52.m.class);
        StampDutyPaymentsResultRequiredData stampDutyPaymentsResultRequiredData = (StampDutyPaymentsResultRequiredData) sVar.g(z2.f23369a);
        if (stampDutyPaymentsResultRequiredData == null) {
            stampDutyPaymentsResultRequiredData = new StampDutyPaymentsResultRequiredData("");
        }
        f00.r.o(wVar, cVarC, stampDutyPaymentsResultRequiredData, m.d(1626693070, true, new q() { // from class: c42.l3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.g0(sVar, aVar, lVar, (zx.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), w.f23331a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g0(final s sVar, final a aVar, final l lVar, zx.d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1626693070, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:262)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.z3
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.h0(sVar, aVar, lVar, (n52.c.e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h0(s sVar, a aVar, l lVar, n52.c.e eVar) {
        if (fr.t.c(eVar, n52.c.e.a.f132174a)) {
            sVar.c();
        } else if (fr.t.c(eVar, n52.c.e.b.f132175a)) {
            aVar.a();
        } else if (eVar instanceof n52.c.e.ToMakePayments) {
            lVar.b(((n52.c.e.ToMakePayments) eVar).getPaymentData());
        } else {
            if (!(eVar instanceof n52.c.e.Error)) {
                throw new oq.p();
            }
            s.l(sVar, u2.f23320a, ((n52.c.e.Error) eVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1330956606, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:280)");
        }
        u2 u2Var = u2.f23320a;
        f00.r.r(wVar, u2Var, sVar.g(u2Var), m.d(947349373, true, new q() { // from class: c42.j3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.j0(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j0(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(947349373, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:284)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.w3
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.k0(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k0(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1924445277, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:296)");
        }
        t2 t2Var = t2.f23312a;
        f00.r.r(wVar, t2Var, sVar.g(t2Var), m.d(2105374130, true, new q() { // from class: c42.o3
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function1.m0(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m0(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2105374130, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.StampDutyProcessNav.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StampDutyProcessNav.kt:300)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: c42.r3
                @Override // er.l
                public final Object b(Object obj) {
                    return Function1.n0(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n0(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o0(l lVar, a aVar, l lVar2, a aVar2, int i15, r rVar, int i16) {
        H(lVar, aVar, lVar2, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
