package kn3;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b30.AccordionData;
import d1.a3;
import d1.d3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n50.DefaultSingleCardData;
import n50.h0;
import on3.VehicleDetailsScreenModel;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.ad;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\"\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$²\u0006\f\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lkn3/n;", "viewModel", "Loq/i0;", "q", "(Lkn3/n;Lm2/r;I)V", "Lon3/d;", "model", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "onSnackBarHidden", "v", "(Lon3/d;Li70/p;Ler/a;Lm2/r;I)V", "Lmx/a;", "vehicleName", "vehicleType", "", "vehicleIconResId", "m", "(Lmx/a;Lmx/a;ILm2/r;I)V", "Lf3/m;", "modifier", AnnotatedPrivateKey.LABEL, "subLabel", "Lj30/a;", "copyButtonData", "k", "(Lf3/m;Lmx/a;Lmx/a;Lj30/a;Lm2/r;II)V", "Lc5/h;", "a", "F", "getVEHICLE_DETAILS_ICON_WIDTH", "()F", "VEHICLE_DETAILS_ICON_WIDTH", "Lkn3/n$a;", "screenState", "vehicles_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f111542a = c5.h.n(137);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, n.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((n) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    private static final void k(f3.m mVar, final Label label, final Label label2, final ButtonTextData buttonTextData, p076m2.r rVar, final int i15, final int i16) {
        f3.m mVar2;
        int i17;
        final f3.m mVar3;
        p076m2.r rVarH = rVar.h(-1842636538);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(label) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(label2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= (i15 & PKIFailureInfo.certConfirmed) == 0 ? rVarH.W(buttonTextData) : rVarH.G(buttonTextData) ? 2048 : 1024;
        }
        if (rVarH.r((i17 & 1171) != 1170, i17 & 1)) {
            f3.m mVar4 = i18 != 0 ? f3.m.INSTANCE : mVar2;
            if (p076m2.t.k()) {
                p076m2.t.o(-1842636538, i17, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehicledetails.CopyableInformationLabel (VehicleDetailsScreen.kt:220)");
            }
            f3.c.Companion companion = f3.c.INSTANCE;
            f3.c.InterfaceC1317c interfaceC1317cI = companion.i();
            d1.i iVar = d1.i.f39152a;
            w0 w0VarB = m3.b(iVar.j(), interfaceC1317cI, rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVar4);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            f3.m mVarC = p3.c(q3.f39261a, androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
            w0 w0VarA = d1.e0.a(iVar.k(), companion.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
            n6.g(rVarC2, companion2.a());
            n6.i(rVarC2, mVarE2, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, aVar.a(rVarH, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i19).d(), null, null, false, false, null, rVarH, (i17 << 3) & 896, 0, 0, 33030107);
            j70.h.g(null, null, label2, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i19).a(), null, null, false, false, null, rVarH, i17 & 896, 0, 0, 33030139);
            rVarH.x();
            f3.m mVar5 = mVar4;
            j30.f.e(null, buttonTextData, false, rVarH, ((i17 >> 6) & 112) | (ButtonTextData.f99099f << 3), 5);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar3 = mVar5;
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: kn3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.l(mVar3, label, label2, buttonTextData, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(f3.m mVar, Label label, Label label2, ButtonTextData buttonTextData, int i15, int i16, p076m2.r rVar, int i17) {
        k(mVar, label, label2, buttonTextData, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void m(final Label label, Label label2, int i15, p076m2.r rVar, final int i16) {
        int i17;
        final int i18;
        p076m2.r rVar2;
        final Label label3 = label2;
        p076m2.r rVarH = rVar.h(1782896451);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.W(label) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.W(label3) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.c(i15) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1782896451, i17, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehicledetails.VehicleDetailsHeader (VehicleDetailsScreen.kt:176)");
            }
            final Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            d1.i.e eVarJ = iVar.j();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarB = m3.b(eVarJ, companion2.l(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarC = p3.c(q3.f39261a, androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            w0 w0VarA = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            int i25 = i17;
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i19).a(), null, null, false, false, null, rVarH, (i17 << 6) & 896, 0, 0, 33030139);
            j70.h.g(null, null, label2, null, null, aVar.a(rVarH, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i19).d(), null, null, false, false, null, rVarH, (i25 << 3) & 896, 0, 0, 33030107);
            label3 = label2;
            r3.a(a3.r(companion, 0.0f, 0.0f, 0.0f, aVar.b(rVarH, i19).getSpacing300(), 7, null), rVarH, 0);
            rVarH.x();
            Object objE = rVarH.E();
            p076m2.r.Companion companion4 = p076m2.r.INSTANCE;
            if (objE == companion4.a()) {
                objE = new er.l() { // from class: kn3.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k.n((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarD = n4.v.d(companion, false, (er.l) objE, 1, null);
            boolean zG = rVarH.G(context) | ((i25 & 896) == 256);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion4.a()) {
                i18 = i15;
                objE2 = new er.l() { // from class: kn3.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k.o(i18, context, (n4.i0) obj);
                    }
                };
                rVarH.v(objE2);
            } else {
                i18 = i15;
            }
            ad.d(l4.c.c(i18, rVarH, (i25 >> 6) & 14), null, androidx.compose.foundation.layout.d.y(a3.r(n4.v.d(mVarD, false, (er.l) objE2, 1, null), 0.0f, aVar.b(rVarH, i19).getZero(), 0.0f, 0.0f, 13, null), f111542a), Color.INSTANCE.h(), rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 3120, 0);
            rVar2 = rVarH;
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            i18 = i15;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: kn3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.p(label, label3, i18, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(n4.i0 i0Var) {
        n4.g0.a(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(int i15, Context context, n4.i0 i0Var) {
        n4.f0.y0(i0Var, "icon" + t70.y.a(Integer.valueOf(i15), context));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(Label label, Label label2, int i15, int i16, p076m2.r rVar, int i17) {
        m(label, label2, i15, rVar, g4.a(i16 | 1));
        return i0.f148189a;
    }

    public static final void q(final n nVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2072549273);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(nVar) : rVarH.G(nVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2072549273, i16, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehicledetails.VehicleDetailsScreen (VehicleDetailsScreen.kt:61)");
            }
            f6 f6VarC = m7.b.c(nVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(nVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            n.a aVarR = r(f6VarC);
            if (aVarR instanceof n.a.DataLoaded) {
                rVarH.X(1144984507);
                VehicleDetailsScreenModel model = ((n.a.DataLoaded) aVarR).getModel();
                i70.p pVarS = s(f6VarB);
                boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(nVar));
                Object objE = rVarH.E();
                if (z15 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new a(nVar);
                    rVarH.v(objE);
                }
                v(model, pVarS, (er.a) ((mr.g) objE), rVarH, 0);
                rVarH.R();
            } else {
                if (!fr.t.c(aVarR, n.a.b.f111581a)) {
                    rVarH.X(1144982406);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1134955385);
                rVarH.R();
            }
            boolean z16 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(nVar));
            Object objE2 = rVarH.E();
            if (z16 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: kn3.i
                    @Override // er.a
                    public final Object a() {
                        return k.t(nVar);
                    }
                };
                rVarH.v(objE2);
            }
            q0.g(false, (er.a) objE2, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: kn3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.u(nVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final n.a r(f6<? extends n.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p s(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(n nVar) {
        nVar.d();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(n nVar, int i15, p076m2.r rVar, int i16) {
        q(nVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    public static final void v(final VehicleDetailsScreenModel vehicleDetailsScreenModel, final i70.p pVar, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-546250545);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(vehicleDetailsScreenModel) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-546250545, i16, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehicledetails.VehicleDetailsScreenContent (VehicleDetailsScreen.kt:87)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, aVar, null, null, rVarH, (i16 & 112) | 6 | (i16 & 896), 24);
            i50.s.r(vehicleDetailsScreenModel.getScaffoldData(), null, y2.m.d(-2039933371, true, new er.p() { // from class: kn3.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.w(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1274355524, true, new er.q() { // from class: kn3.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.x(vehicleDetailsScreenModel, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: kn3.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.z(vehicleDetailsScreenModel, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2039933371, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehicledetails.VehicleDetailsScreenContent.<anonymous> (VehicleDetailsScreen.kt:99)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [f3.m, n50.j] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    public static final i0 x(final VehicleDetailsScreenModel vehicleDetailsScreenModel, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        ?? r15;
        ?? r16;
        int i17;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1274355524, i16, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehicledetails.VehicleDetailsScreenContent.<anonymous> (VehicleDetailsScreen.kt:102)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), null, rVar, 6, 1), d3Var), rVar, 0);
            f3.c.b bVarG = f3.c.INSTANCE.g();
            d1.i iVar = d1.i.f39152a;
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            w0 w0VarA = d1.e0.a(iVar.r(aVar.b(rVar, i18).getSpacing200()), bVarG, rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            j70.h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, vehicleDetailsScreenModel.getCurrentTime().n("currentTimeValue"), null, null, aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).f(), null, null, false, false, null, rVar, 6, 0, 0, 33026010);
            List<c30.b> listI = vehicleDetailsScreenModel.i();
            if (listI == null) {
                rVar.X(-2048644333);
                rVar.R();
                r15 = 0;
                r16 = 1;
            } else {
                rVar.X(-2048644332);
                Iterator<T> it = listI.iterator();
                while (it.hasNext()) {
                    c30.e.c(null, (c30.b) it.next(), rVar, c30.b.f22944i << 3, 1);
                }
                r15 = 0;
                r16 = 1;
                rVar.R();
            }
            x30.c.c(null, 0.0f, y2.m.d(-1863512045, r16, new er.p() { // from class: kn3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.y(vehicleDetailsScreenModel, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            ShortcutsLayoutData shortcutsLayoutData = vehicleDetailsScreenModel.getShortcutsLayoutData();
            if (shortcutsLayoutData == null) {
                rVar.X(-2047184388);
            } else {
                rVar.X(-2047184387);
                h70.g.f(shortcutsLayoutData, rVar, ShortcutsLayoutData.f81324c);
            }
            rVar.R();
            DefaultSingleCardData updateVehicleDataSection = vehicleDetailsScreenModel.getUpdateVehicleDataSection();
            if (updateVehicleDataSection == null) {
                rVar.X(-2047095418);
                rVar.R();
                i17 = 0;
            } else {
                rVar.X(-2047095417);
                i17 = 0;
                h0.v(updateVehicleDataSection, r15, rVar, 0, 2);
                rVar.R();
            }
            AccordionData technicalExaminationAccordionData = vehicleDetailsScreenModel.getTechnicalExaminationAccordionData();
            int i19 = AccordionData.f16343b;
            b30.j.g(technicalExaminationAccordionData, rVar, i19);
            b30.j.g(vehicleDetailsScreenModel.getInsuranceAccordionData(), rVar, i19);
            b30.j.g(vehicleDetailsScreenModel.getTemporaryPermissionAccordionData(), rVar, i19);
            b30.j.g(vehicleDetailsScreenModel.getRegistrationDocumentAccordionData(), rVar, i19);
            b30.j.g(vehicleDetailsScreenModel.getVehicleDetailsAccordionData(), rVar, i19);
            rVar.X(-1035854618);
            Iterator<T> it4 = vehicleDetailsScreenModel.k().iterator();
            while (it4.hasNext()) {
                c30.e.c(r15, (c30.b.c) it4.next(), rVar, i17, r16);
            }
            rVar.R();
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
    public static final i0 y(VehicleDetailsScreenModel vehicleDetailsScreenModel, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1863512045, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehicledetails.VehicleDetailsScreenContent.<anonymous>.<anonymous>.<anonymous> (VehicleDetailsScreen.kt:122)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            m(vehicleDetailsScreenModel.getHeaderDetails().getVehicleName(), vehicleDetailsScreenModel.getHeaderDetails().getCategoryName(), vehicleDetailsScreenModel.getHeaderDetails().getCategoryIcon(), rVar, 0);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            ln3.c.e(a3.r(companion, 0.0f, 0.0f, 0.0f, aVar.b(rVar, i16).getSpacing150(), 7, null), vehicleDetailsScreenModel.getHeaderDetails().getInsuranceValidity(), vehicleDetailsScreenModel.getHeaderDetails().getUpcomingInsuranceValidity(), rVar, 0, 0);
            ln3.c.e(a3.r(companion, 0.0f, 0.0f, 0.0f, aVar.b(rVar, i16).getSpacing300(), 7, null), vehicleDetailsScreenModel.getHeaderDetails().getTechnicalExamValidity(), null, rVar, 0, 4);
            f3.m mVarR = a3.r(companion, 0.0f, 0.0f, 0.0f, aVar.b(rVar, i16).getSpacing200(), 7, null);
            Label vinNumberLabel = vehicleDetailsScreenModel.getHeaderDetails().getVinNumberLabel();
            Label vinNumber = vehicleDetailsScreenModel.getHeaderDetails().getVinNumber();
            ButtonTextData copyVinButtonData = vehicleDetailsScreenModel.getHeaderDetails().getCopyVinButtonData();
            int i17 = ButtonTextData.f99099f;
            k(mVarR, vinNumberLabel, vinNumber, copyVinButtonData, rVar, i17 << 9, 0);
            k(null, vehicleDetailsScreenModel.getHeaderDetails().getRegistrationNumberLabel(), vehicleDetailsScreenModel.getHeaderDetails().getRegistrationNumber(), vehicleDetailsScreenModel.getHeaderDetails().getCopyRegistrationNumberButtonData(), rVar, i17 << 9, 1);
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
    public static final i0 z(VehicleDetailsScreenModel vehicleDetailsScreenModel, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        v(vehicleDetailsScreenModel, pVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
