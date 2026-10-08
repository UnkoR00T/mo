package p099p31;

import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import c51.b0;
import e41.o;
import er.a;
import er.l;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import h41.SetupData;
import h41.z;
import java.time.LocalDate;
import k41.x;
import mu.g;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import uw.j;
import v41.c;
import xw.b;
import y2.m;
import y41.y;
import z31.i;
import zx.d;

/* JADX INFO: renamed from: p31.k2, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "o0", "(Ler/a;Lm2/r;I)V", "childbirthregistration_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A0(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1023937435, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:459)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.b2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.B0(sVar, aVar, (i51.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A1(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(779780388, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:386)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.j1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.B1(sVar, aVar, (o41.a.InterfaceC3514a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B0(s sVar, a aVar, i51.a.b bVar) {
        if (fr.t.c(bVar, i51.a.b.C2113a.f89502a)) {
            sVar.c();
        } else if (fr.t.c(bVar, i51.a.b.C2114b.f89503a)) {
            aVar.a();
        } else if (bVar instanceof i51.a.b.ShowDialog) {
            s.l(sVar, e.f152733a, ((i51.a.b.ShowDialog) bVar).getDialogData(), null, 4, null);
        } else if (fr.t.c(bVar, i51.a.b.d.f89505a)) {
            s.m(sVar, m.f152800a, null, 2, null);
        } else if (fr.t.c(bVar, i51.a.b.e.f89506a)) {
            s.m(sVar, s.f152835a, null, 2, null);
        } else if (fr.t.c(bVar, i51.a.b.f.f89507a)) {
            s.m(sVar, t.f152841a, null, 2, null);
        } else {
            if (!fr.t.c(bVar, i51.a.b.c.f89504a)) {
                throw new p();
            }
            s.m(sVar, c.f152698a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B1(s sVar, a aVar, o41.a.InterfaceC3514a interfaceC3514a) {
        if (fr.t.c(interfaceC3514a, o41.a.InterfaceC3514a.C3515a.f142270a)) {
            sVar.c();
        } else if (fr.t.c(interfaceC3514a, o41.a.InterfaceC3514a.b.f142271a)) {
            aVar.a();
        } else if (fr.t.c(interfaceC3514a, o41.a.InterfaceC3514a.d.f142273a)) {
            s.m(sVar, u.f152847a, null, 2, null);
        } else if (fr.t.c(interfaceC3514a, o41.a.InterfaceC3514a.c.f142272a)) {
            s.m(sVar, r.f152829a, null, 2, null);
        } else {
            if (!(interfaceC3514a instanceof o41.a.InterfaceC3514a.ShowDialog)) {
                throw new p();
            }
            s.l(sVar, e.f152733a, ((o41.a.InterfaceC3514a.ShowDialog) interfaceC3514a).getDialogData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C0(i iVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1111573101, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:495)");
        }
        f00.r.o(wVar, q0.c(l51.p.class), iVar, m.d(1950692188, true, new q() { // from class: p31.u0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.D0(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.u(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C1(a aVar, int i15, r rVar, int i16) {
        o0(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D0(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1950692188, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:499)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.w1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.E0(sVar, aVar, (l51.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E0(s sVar, a aVar, l51.a.b bVar) {
        if (fr.t.c(bVar, l51.a.b.C2804a.f116086a)) {
            sVar.c();
        } else if (fr.t.c(bVar, l51.a.b.C2805b.f116087a)) {
            aVar.a();
        } else if (bVar instanceof l51.a.b.ShowDialog) {
            s.l(sVar, e.f152733a, ((l51.a.b.ShowDialog) bVar).getDialogData(), null, 4, null);
        } else if (fr.t.c(bVar, l51.a.b.c.f116088a)) {
            s.m(sVar, m.f152800a, null, 2, null);
        } else if (bVar instanceof l51.a.b.ShowError) {
            s.l(sVar, g.f152751a, ((l51.a.b.ShowError) bVar).getErrorData(), null, 4, null);
        } else {
            if (!(bVar instanceof l51.a.b.ShowSearch)) {
                throw new p();
            }
            s.l(sVar, a.f152682a, ((l51.a.b.ShowSearch) bVar).getAddressSearchData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F0(i iVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2038327854, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:532)");
        }
        f00.r.o(wVar, q0.c(f51.q.class), iVar, m.d(-1417520355, true, new q() { // from class: p31.e1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.G0(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.C(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G0(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1417520355, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:536)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.s1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.H0(sVar, aVar, (f51.a.InterfaceC1326a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H0(s sVar, a aVar, f51.a.InterfaceC1326a interfaceC1326a) {
        if (fr.t.c(interfaceC1326a, f51.a.InterfaceC1326a.C1327a.f59273a)) {
            sVar.c();
        } else if (fr.t.c(interfaceC1326a, f51.a.InterfaceC1326a.b.f59274a)) {
            aVar.a();
        } else if (interfaceC1326a instanceof f51.a.InterfaceC1326a.ShowDialog) {
            s.l(sVar, e.f152733a, ((f51.a.InterfaceC1326a.ShowDialog) interfaceC1326a).getDialogData(), null, 4, null);
        } else if (fr.t.c(interfaceC1326a, f51.a.InterfaceC1326a.c.f59275a)) {
            s.m(sVar, m.f152800a, null, 2, null);
        } else if (interfaceC1326a instanceof f51.a.InterfaceC1326a.ShowError) {
            s.l(sVar, g.f152751a, ((f51.a.InterfaceC1326a.ShowError) interfaceC1326a).getErrorData(), null, 4, null);
        } else {
            if (!(interfaceC1326a instanceof f51.a.InterfaceC1326a.ShowSearch)) {
                throw new p();
            }
            s.l(sVar, a.f152682a, ((f51.a.InterfaceC1326a.ShowSearch) interfaceC1326a).getAddressSearchData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1329884689, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:569)");
        }
        f00.r.n(wVar, q0.c(u31.l.class), m.d(917445149, true, new q() { // from class: p31.t0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.J0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.s(), rVar, ((i15 >> 3) & 14) | 3456);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(917445149, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:572)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.q1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.K0(sVar, (u31.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K0(s sVar, u31.a aVar) {
        if (!fr.t.c(aVar, u31.a.C5076a.f194963a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L0(i iVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-403129936, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:585)");
        }
        f00.r.o(wVar, q0.c(r41.q.class), iVar, m.d(435989151, true, new q() { // from class: p31.f1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.M0(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.E(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M0(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(435989151, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:589)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.e2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.N0(sVar, aVar, (r41.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N0(s sVar, a aVar, r41.a.b bVar) {
        if (fr.t.c(bVar, r41.a.b.C4358a.f171571a)) {
            sVar.c();
        } else if (fr.t.c(bVar, r41.a.b.c.f171573a)) {
            s.m(sVar, v.f152853a, null, 2, null);
        } else if (fr.t.c(bVar, r41.a.b.C4359b.f171572a)) {
            aVar.a();
        } else {
            if (!(bVar instanceof r41.a.b.ShowDialog)) {
                throw new p();
            }
            s.l(sVar, e.f152733a, ((r41.a.b.ShowDialog) bVar).getDialogData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O0(i iVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(523624817, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:612)");
        }
        f00.r.o(wVar, q0.c(s51.w.class), iVar, m.d(1362743904, true, new q() { // from class: p31.p0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.P0(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.G(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P0(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1362743904, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:616)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.n1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.Q0(sVar, aVar, (s51.f.e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q0(s sVar, a aVar, s51.f.e eVar) {
        if (fr.t.c(eVar, s51.f.e.a.f178056a)) {
            sVar.c();
        } else if (fr.t.c(eVar, s51.f.e.d.f178059a) || fr.t.c(eVar, s51.f.e.b.f178057a)) {
            aVar.a();
        } else if (eVar instanceof s51.f.e.ShowDialog) {
            s.l(sVar, e.f152733a, ((s51.f.e.ShowDialog) eVar).getDialogData(), null, 4, null);
        } else {
            if (!(eVar instanceof s51.f.e.GoToEdorAuth)) {
                throw new p();
            }
            s.l(sVar, f.f152742a, ((s51.f.e.GoToEdorAuth) eVar).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1450379570, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:648)");
        }
        e eVar = e.f152733a;
        f00.r.r(wVar, eVar, sVar.g(eVar), m.d(1642980423, true, new q() { // from class: p31.g1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.S0(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S0(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1642980423, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:652)");
        }
        b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.m1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.T0(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T0(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1917832973, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:662)");
        }
        g gVar = g.f152751a;
        f00.r.r(wVar, gVar, sVar.g(gVar), m.d(-1091744654, true, new q() { // from class: p31.y0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.V0(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V0(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1091744654, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:666)");
        }
        b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.c2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.W0(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W0(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-991078220, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:676)");
        }
        a aVar = a.f152682a;
        f00.r.r(wVar, aVar, sVar.g(aVar), m.d(-1080355865, true, new q() { // from class: p31.b1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.Y0(sVar, (tt3.d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y0(final s sVar, tt3.d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1080355865, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:680)");
        }
        b<tt3.d.a> bVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.y1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.Z0(sVar, (tt3.d.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z0(s sVar, tt3.d.a aVar) {
        if (!fr.t.c(aVar, tt3.d.a.C5021a.f192310a)) {
            throw new p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a1(i iVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-746867284, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:149)");
        }
        f00.r.o(wVar, q0.c(v41.p.class), iVar, m.d(-1412535587, true, new q() { // from class: p31.w0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.b1(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.x(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b1(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1412535587, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:153)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.p1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.c1(sVar, aVar, (c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c1(s sVar, a aVar, c cVar) {
        if (fr.t.c(cVar, c.a.f203797a)) {
            sVar.c();
        } else if (fr.t.c(cVar, c.b.f203798a)) {
            aVar.a();
        } else if (fr.t.c(cVar, c.C5305c.f203799a)) {
            s.m(sVar, p.f152818a, null, 2, null);
        } else {
            if (!(cVar instanceof c.ShowDialog)) {
                throw new p();
            }
            s.l(sVar, e.f152733a, ((c.ShowDialog) cVar).getDialogData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d1(final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2077310134, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:692)");
        }
        f fVar2 = f.f152742a;
        f00.r.r(wVar, fVar2, sVar.g(fVar2), m.d(1647265701, true, new q() { // from class: p31.o0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.e1(sVar, aVar, (mv3.c) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e1(final s sVar, final a aVar, mv3.c cVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1647265701, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:699)");
        }
        b<mv3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.r1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.f1(sVar, aVar, (mv3.c.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f1(s sVar, a aVar, mv3.c.a aVar2) {
        if (fr.t.c(aVar2, mv3.c.a.C3193a.f128686a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar2, mv3.c.a.b.f128687a)) {
                throw new p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g1(i iVar, final a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(179887469, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:176)");
        }
        f00.r.o(wVar, q0.c(y.class), iVar, m.d(-485780834, true, new q() { // from class: p31.z0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.h1(aVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.y(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h1(final a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-485780834, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:180)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.v1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.i1(aVar, sVar, (y41.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i1(a aVar, s sVar, final y41.a.b bVar) {
        if (fr.t.c(bVar, y41.a.b.C5984b.f223868a)) {
            aVar.a();
        } else if (fr.t.c(bVar, y41.a.b.C5983a.f223867a)) {
            sVar.c();
        } else if (fr.t.c(bVar, y41.a.b.d.f223869a)) {
            s.m(sVar, k.f152787a, null, 2, null);
        } else if (bVar instanceof y41.a.b.ShowDataPicker) {
            y41.a.b.ShowDataPicker fVar = (y41.a.b.ShowDataPicker) bVar;
            s.l(sVar, d.f152723a, new j.Single(null, fVar.getInitialDate().getDate(), new l() { // from class: p31.w
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.j1(bVar, (LocalDate) obj);
                }
            }, null, fVar.getMaxDate().getDate(), 9, null), null, 4, null);
        } else if (bVar instanceof y41.a.b.GoToSearch) {
            s.l(sVar, a.f152682a, ((y41.a.b.GoToSearch) bVar).getModel(), null, 4, null);
        } else if (bVar instanceof y41.a.b.ShowDialog) {
            s.l(sVar, e.f152733a, ((y41.a.b.ShowDialog) bVar).getDialogData(), null, 4, null);
        } else {
            if (!(bVar instanceof y41.a.b.c)) {
                throw new p();
            }
            s.l(sVar, g.f152751a, ((y41.a.b.c) bVar).a(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j1(y41.a.b bVar, LocalDate localDate) {
        ((y41.a.b.ShowDataPicker) bVar).a().b(new fz.b.LocalDate(localDate));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k1(i iVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1106642222, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:222)");
        }
        f00.r.o(wVar, q0.c(x.class), iVar, m.d(440973919, true, new q() { // from class: p31.c1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.l1(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.r(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l1(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(440973919, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:226)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.a2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.m1(sVar, aVar, (k41.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m1(s sVar, a aVar, k41.a.b bVar) {
        if (fr.t.c(bVar, k41.a.b.C2573a.f108245a)) {
            sVar.c();
        } else if (fr.t.c(bVar, k41.a.b.C2574b.f108246a)) {
            aVar.a();
        } else if (fr.t.c(bVar, k41.a.b.c.f108247a)) {
            s.m(sVar, j.f152778a, null, 2, null);
        } else if (bVar instanceof k41.a.b.ShowDatePicker) {
            s.l(sVar, d.f152723a, ((k41.a.b.ShowDatePicker) bVar).getDatePickerDialogData(), null, 4, null);
        } else {
            if (!(bVar instanceof k41.a.b.ShowDialog)) {
                throw new p();
            }
            s.l(sVar, e.f152733a, ((k41.a.b.ShowDialog) bVar).getDialogData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n1(i iVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2033396975, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:254)");
        }
        f00.r.o(wVar, q0.c(a41.t.class), iVar, m.d(1367728672, true, new q() { // from class: p31.m0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.o1(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.w(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
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
    public static final void o0(final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(924980437);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(924980437, i16, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent (ChildBirthRegistrationNavContent.kt:74)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            y0 y0VarC = q7.b.f165175a.c(rVarH, q7.b.f165177c);
            if (y0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            final i iVar = (i) q7.d.c(q0.c(i.class), y0VarC, null, j7.a.a(y0VarC, rVarH, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVarH, 0, 0);
            n nVar = n.f152805a;
            boolean zG = rVarH.G(iVar) | ((i16 & 14) == 4) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: p31.h0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.p0(sVarJ, iVar, aVar, (d1) obj);
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
            d5VarM.a(new er.p() { // from class: p31.s0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.C1(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o1(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1367728672, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:258)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.u1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.p1(sVar, aVar, (a41.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 p0(final s sVar, final i iVar, final a aVar, d1 d1Var) {
        f00.r.u(d1Var, n.f152805a, null, m.b(449065140, true, new er.r() { // from class: p31.d1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.q0(iVar, aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, q.f152824a, null, m.b(-1673622037, true, new er.r() { // from class: p31.b0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.t0(iVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, o.f152811a, null, m.b(-746867284, true, new er.r() { // from class: p31.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.a1(iVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p.f152818a, null, m.b(179887469, true, new er.r() { // from class: p31.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.g1(iVar, aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.f152787a, null, m.b(1106642222, true, new er.r() { // from class: p31.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.k1(iVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, j.f152778a, null, m.b(2033396975, true, new er.r() { // from class: p31.g0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.n1(iVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, h.f152760a, null, m.b(-1334815568, true, new er.r() { // from class: p31.i0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.q1(iVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, i.f152770a, null, m.b(-408060815, true, new er.r() { // from class: p31.j0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.t1(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, b.f152690a, null, m.b(518693938, true, new er.r() { // from class: p31.k0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.w1(sVar, iVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.f152793a, null, m.b(1445448691, true, new er.r() { // from class: p31.l0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.z1(iVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, u.f152847a, null, m.b(-741936405, true, new er.r() { // from class: p31.o1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.w0(iVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, r.f152829a, null, m.b(184818348, true, new er.r() { // from class: p31.z1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.z0(iVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, t.f152841a, null, m.b(1111573101, true, new er.r() { // from class: p31.g2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.C0(iVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s.f152835a, null, m.b(2038327854, true, new er.r() { // from class: p31.h2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.F0(iVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, c.f152698a, null, m.b(-1329884689, true, new er.r() { // from class: p31.i2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.I0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.f152800a, null, m.b(-403129936, true, new er.r() { // from class: p31.j2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.L0(iVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, v.f152853a, null, m.b(523624817, true, new er.r() { // from class: p31.x
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.O0(iVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, e.f152733a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(1450379570, true, new er.r() { // from class: p31.y
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.R0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, g.f152751a, null, m.b(-1917832973, true, new er.r() { // from class: p31.z
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.U0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, a.f152682a, null, m.b(-991078220, true, new er.r() { // from class: p31.a0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.X0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, f.f152742a, null, m.b(-2077310134, true, new er.r() { // from class: p31.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.d1(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        uw.m.c(d1Var, d.f152723a, sVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p1(s sVar, a aVar, a41.c cVar) {
        if (fr.t.c(cVar, a41.c.a.f2803a)) {
            sVar.c();
        } else if (fr.t.c(cVar, a41.c.b.f2804a)) {
            aVar.a();
        } else if (fr.t.c(cVar, a41.c.C0040c.f2805a)) {
            s.m(sVar, h.f152760a, null, 2, null);
        } else {
            if (!(cVar instanceof a41.c.ShowDialog)) {
                throw new p();
            }
            s.l(sVar, e.f152733a, ((a41.c.ShowDialog) cVar).getDialogData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q0(i iVar, final a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(449065140, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:84)");
        }
        f00.r.o(wVar, q0.c(w31.p.class), iVar, m.d(-34308571, true, new q() { // from class: p31.r0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.r0(aVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.B(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q1(final i iVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1334815568, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:281)");
        }
        f00.r.o(wVar, q0.c(o.class), iVar, m.d(-2000483871, true, new q() { // from class: p31.a1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.r1(sVar, aVar, iVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.H(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r0(final a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-34308571, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:88)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.d2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.s0(aVar, sVar, (w31.a.e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r1(final s sVar, final a aVar, final i iVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2000483871, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:285)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar) | rVar.G(iVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.t1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.s1(sVar, aVar, iVar, (e41.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s0(a aVar, s sVar, w31.a.e eVar) {
        if (fr.t.c(eVar, w31.a.e.C5518a.f210101a)) {
            aVar.a();
        } else if (fr.t.c(eVar, w31.a.e.d.f210104a)) {
            s.m(sVar, q.f152824a, null, 2, null);
        } else if (eVar instanceof w31.a.e.Error) {
            s.l(sVar, g.f152751a, ((w31.a.e.Error) eVar).getErrorData(), null, 4, null);
        } else {
            if (!(eVar instanceof w31.a.e.GoToEdorAuth)) {
                throw new p();
            }
            s.l(sVar, f.f152742a, ((w31.a.e.GoToEdorAuth) eVar).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s1(s sVar, a aVar, i iVar, e41.a.b bVar) {
        if (fr.t.c(bVar, e41.a.b.C1090a.f47513a)) {
            sVar.c();
        } else if (fr.t.c(bVar, e41.a.b.C1091b.f47514a)) {
            aVar.a();
        } else if (fr.t.c(bVar, e41.a.b.d.f47516a)) {
            s.l(sVar, i.f152770a, new SetupData(iVar, null), null, 4, null);
        } else if (bVar instanceof e41.a.b.ShowDialog) {
            s.l(sVar, e.f152733a, ((e41.a.b.ShowDialog) bVar).getDialogData(), null, 4, null);
        } else if (bVar instanceof e41.a.b.GoToError) {
            s.l(sVar, g.f152751a, ((e41.a.b.GoToError) bVar).getErrorData(), null, 4, null);
        } else {
            if (!(bVar instanceof e41.a.b.GoToSearch)) {
                throw new p();
            }
            s.l(sVar, a.f152682a, ((e41.a.b.GoToSearch) bVar).getModel(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t0(i iVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1673622037, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:116)");
        }
        f00.r.o(wVar, q0.c(b0.class), iVar, m.d(1955676956, true, new q() { // from class: p31.n0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.u0(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.F(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t1(final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-408060815, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:322)");
        }
        f00.r.o(wVar, q0.c(z.class), sVar.g(i.f152770a), m.d(-1073729118, true, new q() { // from class: p31.v0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.u1(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.A(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u0(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1955676956, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:120)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.f2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.v0(sVar, aVar, (c51.a.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u1(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1073729118, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:328)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.k1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.v1(sVar, aVar, (h41.a.e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v0(s sVar, a aVar, c51.a.c cVar) {
        if (fr.t.c(cVar, c51.a.c.C0621a.f23445a)) {
            sVar.c();
        } else if (fr.t.c(cVar, c51.a.c.b.f23446a)) {
            aVar.a();
        } else if (fr.t.c(cVar, c51.a.c.C0622c.f23447a)) {
            s.m(sVar, o.f152811a, null, 2, null);
        } else if (cVar instanceof c51.a.c.ShowError) {
            s.l(sVar, g.f152751a, ((c51.a.c.ShowError) cVar).getErrorData(), null, 4, null);
        } else {
            if (!(cVar instanceof c51.a.c.ShowDialog)) {
                throw new p();
            }
            s.l(sVar, e.f152733a, ((c51.a.c.ShowDialog) cVar).getDialogData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v1(s sVar, a aVar, h41.a.e eVar) {
        if (fr.t.c(eVar, h41.a.e.C1855a.f80817a)) {
            sVar.c();
        } else if (fr.t.c(eVar, h41.a.e.b.f80818a)) {
            aVar.a();
        } else if (eVar instanceof h41.a.e.ShowDialog) {
            s.l(sVar, e.f152733a, ((h41.a.e.ShowDialog) eVar).getDialogData(), null, 4, null);
        } else if (eVar instanceof h41.a.e.GoToOfficeSearch) {
            s.l(sVar, b.f152690a, ((h41.a.e.GoToOfficeSearch) eVar).getSetupData(), null, 4, null);
        } else {
            if (!fr.t.c(eVar, h41.a.e.c.f80819a)) {
                throw new p();
            }
            s.m(sVar, l.f152793a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w0(i iVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-741936405, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:413)");
        }
        f00.r.o(wVar, q0.c(p51.p.class), iVar, m.d(97182682, true, new q() { // from class: p31.h1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.x0(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.z(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w1(final s sVar, final i iVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(518693938, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:356)");
        }
        f00.r.o(wVar, q0.c(r31.t.class), sVar.g(b.f152690a), m.d(-146974365, true, new q() { // from class: p31.i1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.x1(sVar, iVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.v(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x0(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(97182682, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:417)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.l1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.y0(sVar, aVar, (p51.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x1(final s sVar, final i iVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-146974365, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:362)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(iVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: p31.x1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.y1(sVar, iVar, (r31.a.InterfaceC4344a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y0(s sVar, a aVar, p51.a.b bVar) {
        if (fr.t.c(bVar, p51.a.b.C3764a.f153039a)) {
            sVar.c();
        } else if (fr.t.c(bVar, p51.a.b.C3765b.f153040a)) {
            aVar.a();
        } else if (fr.t.c(bVar, p51.a.b.d.f153042a)) {
            s.m(sVar, r.f152829a, null, 2, null);
        } else if (bVar instanceof p51.a.b.ShowDialog) {
            s.l(sVar, e.f152733a, ((p51.a.b.ShowDialog) bVar).getDialogData(), null, 4, null);
        } else if (bVar instanceof p51.a.b.GoToError) {
            s.l(sVar, g.f152751a, ((p51.a.b.GoToError) bVar).getErrorData(), null, 4, null);
        } else if (bVar instanceof p51.a.b.GoToSearch) {
            s.l(sVar, a.f152682a, ((p51.a.b.GoToSearch) bVar).getModel(), null, 4, null);
        } else {
            if (!(bVar instanceof p51.a.b.ShowDatePicker)) {
                throw new p();
            }
            s.l(sVar, d.f152723a, ((p51.a.b.ShowDatePicker) bVar).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y1(s sVar, i iVar, r31.a.InterfaceC4344a interfaceC4344a) {
        if (fr.t.c(interfaceC4344a, r31.a.InterfaceC4344a.C4345a.f171274a)) {
            sVar.c();
        } else {
            if (!(interfaceC4344a instanceof r31.a.InterfaceC4344a.SelectedItem)) {
                throw new p();
            }
            s.l(sVar, i.f152770a, new SetupData(iVar, ((r31.a.InterfaceC4344a.SelectedItem) interfaceC4344a).getResultData()), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z0(i iVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(184818348, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:455)");
        }
        f00.r.o(wVar, q0.c(i51.m.class), iVar, m.d(1023937435, true, new q() { // from class: p31.q0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.A0(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.D(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z1(i iVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1445448691, i15, -1, "pl.gov.coi.mobywatel.feature.childbirthregistration.presentation.ChildBirthRegistrationNavContent.<anonymous>.<anonymous>.<anonymous> (ChildBirthRegistrationNavContent.kt:382)");
        }
        f00.r.o(wVar, q0.c(o41.m.class), iVar, m.d(779780388, true, new q() { // from class: p31.x0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.A1(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), c3.f152705a.t(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }
}
