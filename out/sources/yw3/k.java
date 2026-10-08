package yw3;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.d3;
import d1.r3;
import e70.CameraPermissionNotGrantedData;
import fx.Rectangle;
import h30.ButtonData;
import i20.ScannerViewData;
import i50.BaseScaffoldData;
import jw3.MaskDefinition;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p036e4.q1;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lyw3/f;", "viewModel", "", "isPreview", "Loq/i0;", "e", "(Lyw3/f;ZLm2/r;II)V", "Lyw3/f$a;", "data", "isFaceValid", "identityphoto_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static final void e(final f fVar, boolean z15, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        boolean z16;
        boolean z17;
        final boolean z18;
        d5 d5VarM;
        final boolean z19;
        p076m2.r rVarH = rVar.h(-1818282525);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 == 0) {
            if ((i15 & 48) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i18 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1818282525, i17, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.takephoto.TakePhotoScreen (TakePhotoScreen.kt:43)");
                }
                final f6 f6VarC = m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7);
                final f6 f6VarC2 = m7.b.c(f(f6VarC).getFaceValidationVMS().a(), null, null, null, rVarH, 0, 7);
                oz.l.b(fVar.getLifecycleConnector(), rVarH, 0);
                z18 = z19;
                i50.s.r(f(f6VarC).getScaffoldData(), y2.m.d(87246926, true, new er.p() { // from class: yw3.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return k.h(f6VarC, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-492570282, true, new er.q() { // from class: yw3.h
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return k.i(f6VarC, z19, f6VarC2, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32764);
                rVarH = rVarH;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
                z18 = z16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: yw3.i
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return k.k(fVar, z18, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        z16 = z15;
        if ((i17 & 19) != 18) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i18 != 0) {
                z19 = false;
            } else {
                z19 = z16;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1818282525, i17, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.takephoto.TakePhotoScreen (TakePhotoScreen.kt:43)");
            }
            final f6 f6VarC3 = m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7);
            final f6 f6VarC4 = m7.b.c(f(f6VarC3).getFaceValidationVMS().a(), null, null, null, rVarH, 0, 7);
            oz.l.b(fVar.getLifecycleConnector(), rVarH, 0);
            z18 = z19;
            i50.s.r(f(f6VarC3).getScaffoldData(), y2.m.d(87246926, true, new er.p() { // from class: yw3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.h(f6VarC3, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-492570282, true, new er.q() { // from class: yw3.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.i(f6VarC3, z19, f6VarC4, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32764);
            rVarH = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
            z18 = z16;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yw3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.k(fVar, z18, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.Data f(f6<f.Data> f6Var) {
        return f6Var.getValue();
    }

    private static final boolean g(f6<Boolean> f6Var) {
        return f6Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(87246926, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.takephoto.TakePhotoScreen.<anonymous> (TakePhotoScreen.kt:114)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            h30.q.p(f(f6Var).getButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final f6 f6Var, boolean z15, f6 f6Var2, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        long jC;
        float fH;
        k70.a aVar;
        f3.m.Companion companion;
        int i17;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-492570282, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.takephoto.TakePhotoScreen.<anonymous> (TakePhotoScreen.kt:51)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), d3Var), null, rVar2, 0, 1), rVar2, 0);
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion3.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarN);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            c30.e.c(null, f(f6Var).getAlertData(), rVar2, c30.b.f22944i << 3, 1);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i18).getSpacing200()), rVar2, 0);
            f3.m mVarD = w0.i.d(d1.k.b(k3.f.a(androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), aVar2.e(rVar2, i18).getRadius300()), 0.7777778f, false, 2, null), Color.INSTANCE.a(), null, 2, null);
            boolean zW = rVar2.W(f6Var);
            Object objE = rVar2.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: yw3.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k.j(f6Var, (c5.r) obj);
                    }
                };
                rVar2.v(objE);
            }
            f3.m mVarA = q1.a(mVarD, (er.l) objE);
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            e0 e0VarT2 = rVar2.t();
            f3.m mVarE2 = f3.j.e(rVar2, mVarA);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB2);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC2 = n6.c(rVar2);
            n6.i(rVarC2, w0VarI, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            d1.x xVar = d1.x.f39368a;
            if (f(f6Var).getIsCameraPermissionGranted()) {
                rVar2.X(2068569614);
                i20.h.h(androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), f(f6Var).getScannerData(), z15, f(f6Var).getConnector(), rVar2, (ScannerViewData.f88411c << 3) | 6, 0);
                MaskDefinition maskDefinition = f(f6Var).getMaskDefinition();
                if (maskDefinition == null) {
                    rVar2.X(2068793464);
                    rVar2.R();
                    companion = companion2;
                    aVar = aVar2;
                    i17 = i18;
                    rVar2 = rVar2;
                } else {
                    rVar2.X(2068793465);
                    f3.m mVarF = androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null);
                    if (g(f6Var2)) {
                        rVar2.X(-1488729719);
                        jC = ((rw3.a) rVar2.N(rw3.c.c())).b();
                        rVar2.R();
                    } else {
                        rVar2.X(-1488726825);
                        jC = ((rw3.a) rVar2.N(rw3.c.c())).c();
                        rVar2.R();
                    }
                    if (g(f6Var2)) {
                        rVar2.X(-1488722345);
                        fH = t70.s.H(aVar2.b(rVar2, i18).getSpacing100(), rVar2, 0);
                        rVar2.R();
                    } else {
                        rVar2.X(-1488720233);
                        fH = t70.s.H(kw3.d.l(), rVar2, 6);
                        rVar2.R();
                    }
                    aVar = aVar2;
                    companion = companion2;
                    i17 = i18;
                    rVar2 = rVar;
                    kw3.d.d(mVarF, maskDefinition, jC, fH, 0.0f, 0.0f, 0.0f, 0L, 0.0f, rVar2, 6, 496);
                    i0 i0Var2 = i0.f148189a;
                    rVar2.R();
                }
                ButtonData switchCameraButtonData = f(f6Var).getSwitchCameraButtonData();
                if (switchCameraButtonData == null) {
                    rVar2.X(2069412999);
                } else {
                    rVar2.X(2069413000);
                    f3.m mVarN2 = a3.n(xVar.d(companion, companion3.c()), aVar.b(rVar2, i17).getSpacing250());
                    w0 w0VarI2 = d1.r.i(companion3.o(), false);
                    int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
                    e0 e0VarT3 = rVar2.t();
                    f3.m mVarE3 = f3.j.e(rVar2, mVarN2);
                    er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
                    if (rVar2.l() == null) {
                        p076m2.m.d();
                    }
                    rVar2.K();
                    if (rVar2.getInserting()) {
                        rVar2.H(aVarB3);
                    } else {
                        rVar2.u();
                    }
                    p076m2.r rVarC3 = n6.c(rVar2);
                    n6.i(rVarC3, w0VarI2, companion4.d());
                    n6.i(rVarC3, e0VarT3, companion4.f());
                    n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                    n6.g(rVarC3, companion4.a());
                    n6.i(rVarC3, mVarE3, companion4.e());
                    h30.q.p(switchCameraButtonData, false, null, rVar2, 0, 6);
                    rVar2.x();
                    i0 i0Var3 = i0.f148189a;
                }
                rVar2.R();
                rVar2.R();
            } else {
                rVar2.X(2069715901);
                f3.m mVarD2 = xVar.d(companion2, companion3.e());
                w0 w0VarI3 = d1.r.i(companion3.o(), false);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVar2, 0));
                e0 e0VarT4 = rVar2.t();
                f3.m mVarE4 = f3.j.e(rVar2, mVarD2);
                er.a<androidx.compose.ui.node.c> aVarB4 = companion4.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB4);
                } else {
                    rVar2.u();
                }
                p076m2.r rVarC4 = n6.c(rVar2);
                n6.i(rVarC4, w0VarI3, companion4.d());
                n6.i(rVarC4, e0VarT4, companion4.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
                n6.g(rVarC4, companion4.a());
                n6.i(rVarC4, mVarE4, companion4.e());
                e70.c.b(f(f6Var).getCameraPermissionNotGrantedData(), rVar2, CameraPermissionNotGrantedData.f47914e);
                rVar2.x();
                rVar2.R();
                i0 i0Var4 = i0.f148189a;
            }
            rVar2.x();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f6 f6Var, c5.r rVar) {
        f(f6Var).g().b(new Rectangle((int) (rVar.getPackedValue() >> 32), (int) (rVar.getPackedValue() & BodyPartID.bodyIdMax)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(f fVar, boolean z15, int i15, int i16, p076m2.r rVar, int i17) {
        e(fVar, z15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
