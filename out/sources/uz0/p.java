package uz0;

import androidx.p016lifecycle.y0;
import f00.f0;
import f00.s;
import fr.q;
import fr.q0;
import iq0.ApplicationFormServiceGroup;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import tz0.ApplicationData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxz0/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "Ltz0/a;", "applicationData", "B", "(Lxz0/a;Ler/a;Ltz0/a;Lm2/r;I)V", "o", "(Ler/a;Ltz0/a;Lm2/r;I)V", "applicationforms_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends q implements er.l<ApplicationFormServiceGroup, i0> {
        a(Object obj) {
            super(1, obj, b01.o.class, "setup", "setup(Lpl/gov/coi/mobywatel/be/mobilesettingsservice/contract/model/ApplicationFormServiceGroup;)V", 0);
        }

        public final void E(ApplicationFormServiceGroup applicationFormServiceGroup) {
            ((b01.o) this.f66391b).u9(applicationFormServiceGroup);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(ApplicationFormServiceGroup applicationFormServiceGroup) {
            E(applicationFormServiceGroup);
            return i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(er.a aVar, ApplicationData applicationData, int i15, r rVar, int i16) {
        o(aVar, applicationData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void B(final xz0.a aVar, final er.a<i0> aVar2, final ApplicationData applicationData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1905318872);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(applicationData) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(-1905318872, i16, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.GenericApplicationsNavContent (ApplicationFormsNavContent.kt:32)");
            }
            d0.c(xz0.c.c().d(aVar), y2.m.d(866068328, true, new er.p() { // from class: uz0.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.C(aVar2, applicationData, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: uz0.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.D(aVar, aVar2, applicationData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(er.a aVar, ApplicationData applicationData, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(866068328, i15, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.GenericApplicationsNavContent.<anonymous> (ApplicationFormsNavContent.kt:36)");
            }
            o(aVar, applicationData, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(xz0.a aVar, er.a aVar2, ApplicationData applicationData, int i15, r rVar, int i16) {
        B(aVar, aVar2, applicationData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void o(final er.a<i0> aVar, final ApplicationData applicationData, r rVar, final int i15) {
        int i16;
        zx.a aVar2;
        r rVarH = rVar.h(-1104194299);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(applicationData) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1104194299, i16, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.GenericApplicationsGraph (ApplicationFormsNavContent.kt:44)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            if (applicationData == null || (aVar2 = uz0.a.d.f202355a) == null) {
                aVar2 = uz0.a.C5261a.f202349a;
            }
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4) | rVarH.G(applicationData);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: uz0.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.p(aVar, sVarJ, applicationData, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, aVar2, (er.l) objE, rVarH, s.f54562e);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: uz0.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.A(aVar, applicationData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final er.a aVar, final s sVar, final ApplicationData applicationData, d1 d1Var) {
        f00.r.u(d1Var, uz0.a.C5261a.f202349a, null, y2.m.b(1707096164, true, new er.r() { // from class: uz0.k
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return p.q(aVar, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, uz0.a.b.f202351a, null, y2.m.b(1601161499, true, new er.r() { // from class: uz0.l
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return p.s(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, uz0.a.d.f202355a, null, y2.m.b(-1221527204, true, new er.r() { // from class: uz0.m
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return p.u(applicationData, sVar, aVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, uz0.a.c.f202353a, null, y2.m.b(250751389, true, new er.r() { // from class: uz0.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return p.x(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final er.a aVar, final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1707096164, i15, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.GenericApplicationsGraph.<anonymous>.<anonymous>.<anonymous> (ApplicationFormsNavContent.kt:53)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        vz0.o oVar = (vz0.o) q7.d.c(q0.c(vz0.o.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<vz0.g.d> bVarY1 = oVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new er.l() { // from class: uz0.f
                @Override // er.l
                public final Object b(Object obj) {
                    return p.r(aVar, sVar, (vz0.g.d) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        vz0.f.f(oVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(er.a aVar, s sVar, vz0.g.d dVar) {
        if (fr.t.c(dVar, vz0.g.d.a.f208737a)) {
            aVar.a();
        } else if (dVar instanceof vz0.g.d.ShowError) {
            s.i(sVar, uz0.a.c.f202353a, ((vz0.g.d.ShowError) dVar).getError(), null, 4, null);
        } else {
            if (!(dVar instanceof vz0.g.d.GoToApplicationList)) {
                throw new oq.p();
            }
            s.i(sVar, uz0.a.b.f202351a, ((vz0.g.d.GoToApplicationList) dVar).getGroup(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1601161499, i15, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.GenericApplicationsGraph.<anonymous>.<anonymous>.<anonymous> (ApplicationFormsNavContent.kt:73)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        b01.o oVar = (b01.o) q7.d.c(q0.c(b01.o.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<b01.g.c> bVarY1 = oVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.l() { // from class: uz0.o
                @Override // er.l
                public final Object b(Object obj) {
                    return p.t(sVar, (b01.g.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        uz0.a.b bVar = uz0.a.b.f202351a;
        boolean zG2 = rVar.G(oVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new a(oVar);
            rVar.v(objE2);
        }
        sVar.f(bVar, (er.l) ((mr.g) objE2));
        b01.f.f(oVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(s sVar, b01.g.c cVar) {
        if (fr.t.c(cVar, b01.g.c.a.f15791a)) {
            sVar.c();
        } else if (cVar instanceof b01.g.c.ShowError) {
            s.i(sVar, uz0.a.c.f202353a, ((b01.g.c.ShowError) cVar).getError(), null, 4, null);
        } else {
            if (!(cVar instanceof b01.g.c.GoToGenericApplications)) {
                throw new oq.p();
            }
            s.i(sVar, uz0.a.d.f202355a, ((b01.g.c.GoToGenericApplications) cVar).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(ApplicationData applicationData, final s sVar, final er.a aVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        i0 i0Var;
        if (t.k()) {
            t.o(-1221527204, i15, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.GenericApplicationsGraph.<anonymous>.<anonymous>.<anonymous> (ApplicationFormsNavContent.kt:98)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        final yz0.l lVar = (yz0.l) q7.d.c(q0.c(yz0.l.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        if (applicationData != null) {
            lVar.o9(applicationData, a01.a.GLOBAL);
            i0Var = i0.f148189a;
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            rVar.X(-1361562575);
            uz0.a.d dVar = uz0.a.d.f202355a;
            boolean zG = rVar.G(lVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: uz0.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.v(lVar, (ApplicationData) obj);
                    }
                };
                rVar.v(objE);
            }
            sVar.f(dVar, (er.l) objE);
            rVar.R();
        } else {
            rVar.X(-1361568186);
            rVar.R();
        }
        xw.b<yz0.e.d> bVarY1 = lVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zW || objE2 == r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: uz0.e
                @Override // er.l
                public final Object b(Object obj) {
                    return p.w(aVar, sVar, (yz0.e.d) obj);
                }
            };
            rVar.v(objE2);
        }
        f0.b(bVarY1, (er.l) objE2, rVar, xw.b.f221619c);
        yz0.d.d(lVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(yz0.l lVar, ApplicationData applicationData) {
        lVar.o9(applicationData, a01.a.LOCAL);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(er.a aVar, s sVar, yz0.e.d dVar) {
        if (fr.t.c(dVar, yz0.e.d.b.f230862a)) {
            aVar.a();
        } else if (fr.t.c(dVar, yz0.e.d.a.f230861a)) {
            sVar.c();
        } else {
            if (!(dVar instanceof yz0.e.d.ShowError)) {
                throw new oq.p();
            }
            s.i(sVar, uz0.a.c.f202353a, ((yz0.e.d.ShowError) dVar).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(250751389, i15, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.GenericApplicationsGraph.<anonymous>.<anonymous>.<anonymous> (ApplicationFormsNavContent.kt:129)");
        }
        uz0.a.c cVar = uz0.a.c.f202353a;
        f00.r.D(wVar, cVar, sVar.e(cVar), y2.m.d(-1873279748, true, new er.q() { // from class: uz0.c
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return p.y(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1873279748, i15, -1, "pl.gov.coi.mobywatel.feature.applicationforms.presentation.GenericApplicationsGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ApplicationFormsNavContent.kt:133)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.l() { // from class: uz0.b
                @Override // er.l
                public final Object b(Object obj) {
                    return p.z(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }
}
