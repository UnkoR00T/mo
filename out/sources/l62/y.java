package l62;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import o20.BaseDocumentData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ll62/o$a$a;", "screenState", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "Loq/i0;", "onSnackBarHidden", "j", "(Ll62/o$a$a;Li70/p;Ler/a;Lm2/r;II)V", "additionalData", "r", "(Ll62/o$a$a;Lm2/r;I)V", "familycard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class y {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f116706a = new a();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(n50.k kVar) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f116707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f116708b;

        public b(er.l lVar, List list) {
            this.f116707a = lVar;
            this.f116708b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f116707a.b(this.f116708b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.r<f1.e, Integer, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f116709a;

        public c(List list) {
            this.f116709a = list;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = (rVar.W(eVar) ? 4 : 2) | i16;
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(802480018, i17, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            n50.k kVar = (n50.k) this.f116709a.get(i15);
            rVar.X(-1351823341);
            n50.h0.v(kVar, null, rVar, 0, 2);
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ oq.i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116710a;

        static {
            int[] iArr = new int[y30.n.Switch.EnumC5973b.values().length];
            try {
                iArr[y30.n.Switch.EnumC5973b.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f116710a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a A[PHI: r1 r2
      0x007a: PHI (r1v14 int) = (r1v8 int), (r1v6 int), (r1v15 int) binds: [B:50:0x0085, B:44:0x0076, B:45:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x007a: PHI (r2v11 i70.p) = (r2v4 i70.p), (r2v2 i70.p), (r2v2 i70.p) binds: [B:50:0x0085, B:44:0x0076, B:45:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b  */
    /* JADX WARN: Code duplicated, block: B:64:0x010f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public static final void j(final o.a.DataLoaded dataLoaded, i70.p pVar, er.a<oq.i0> aVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        final i70.p pVar2;
        er.a<oq.i0> aVar2;
        boolean z15;
        final er.a<oq.i0> aVar3;
        d5 d5VarM;
        Object objE;
        i70.p pVar3;
        er.a<oq.i0> aVar4;
        Object objE2;
        p076m2.r rVarH = rVar.h(63624661);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(dataLoaded) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            if ((i16 & 2) == 0) {
                pVar2 = pVar;
                int i18 = rVarH.G(pVar2) ? 32 : 16;
                i17 |= i18;
            } else {
                pVar2 = pVar;
            }
            i17 |= i18;
        } else {
            pVar2 = pVar;
        }
        int i19 = i16 & 4;
        if (i19 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                aVar2 = aVar;
                i17 |= rVarH.G(aVar2) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if ((i16 & 2) != 0) {
                        pVar2 = i70.p.a.f89857a;
                        i17 &= -113;
                    }
                    if (i19 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new er.a() { // from class: l62.p
                                @Override // er.a
                                public final Object a() {
                                    return y.k();
                                }
                            };
                            rVarH.v(objE);
                        }
                        pVar3 = pVar2;
                        aVar4 = (er.a) objE;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(63624661, i17, -1, "pl.gov.coi.mobywatel.feature.familycard.presentation.screens.FamilyCardDocumentContent (FamilyCardDocumentContent.kt:47)");
                    }
                    objE2 = rVarH.E();
                    if (objE2 == p076m2.r.INSTANCE.a()) {
                        objE2 = new al();
                        rVarH.v(objE2);
                    }
                    final al alVar = (al) objE2;
                    i70.m.d(alVar, pVar3, aVar4, null, null, rVarH, (i17 & 112) | 6 | (i17 & 896), 24);
                    pVar2 = pVar3;
                    aVar3 = aVar4;
                    g30.t.f(dataLoaded.getBottomSheetData(), 0.0f, false, null, null, y2.m.d(-844928228, true, new er.p() { // from class: l62.q
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return y.l(dataLoaded, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), y2.m.d(-601391365, true, new er.p() { // from class: l62.r
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return y.n(dataLoaded, alVar, pVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 30);
                    rVarH = rVarH;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                    if ((i16 & 2) != 0) {
                        i17 &= -113;
                    }
                }
                pVar3 = pVar2;
                aVar4 = aVar2;
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(63624661, i17, -1, "pl.gov.coi.mobywatel.feature.familycard.presentation.screens.FamilyCardDocumentContent (FamilyCardDocumentContent.kt:47)");
                }
                objE2 = rVarH.E();
                if (objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new al();
                    rVarH.v(objE2);
                }
                final al alVar2 = (al) objE2;
                i70.m.d(alVar2, pVar3, aVar4, null, null, rVarH, (i17 & 112) | 6 | (i17 & 896), 24);
                pVar2 = pVar3;
                aVar3 = aVar4;
                g30.t.f(dataLoaded.getBottomSheetData(), 0.0f, false, null, null, y2.m.d(-844928228, true, new er.p() { // from class: l62.q
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return y.l(dataLoaded, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), y2.m.d(-601391365, true, new er.p() { // from class: l62.r
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return y.n(dataLoaded, alVar2, pVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 30);
                rVarH = rVarH;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
                aVar3 = aVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: l62.s
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return y.q(dataLoaded, pVar2, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        aVar2 = aVar;
        if ((i17 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if ((i16 & 2) != 0) {
                    pVar2 = i70.p.a.f89857a;
                    i17 &= -113;
                }
                if (i19 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: l62.p
                            @Override // er.a
                            public final Object a() {
                                return y.k();
                            }
                        };
                        rVarH.v(objE);
                    }
                    pVar3 = pVar2;
                    aVar4 = (er.a) objE;
                } else {
                    pVar3 = pVar2;
                    aVar4 = aVar2;
                }
            } else {
                if ((i16 & 2) != 0) {
                    pVar2 = i70.p.a.f89857a;
                    i17 &= -113;
                }
                if (i19 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: l62.p
                            @Override // er.a
                            public final Object a() {
                                return y.k();
                            }
                        };
                        rVarH.v(objE);
                    }
                    pVar3 = pVar2;
                    aVar4 = (er.a) objE;
                } else {
                    pVar3 = pVar2;
                    aVar4 = aVar2;
                }
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(63624661, i17, -1, "pl.gov.coi.mobywatel.feature.familycard.presentation.screens.FamilyCardDocumentContent (FamilyCardDocumentContent.kt:47)");
            }
            objE2 = rVarH.E();
            if (objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new al();
                rVarH.v(objE2);
            }
            final al alVar3 = (al) objE2;
            i70.m.d(alVar3, pVar3, aVar4, null, null, rVarH, (i17 & 112) | 6 | (i17 & 896), 24);
            pVar2 = pVar3;
            aVar3 = aVar4;
            g30.t.f(dataLoaded.getBottomSheetData(), 0.0f, false, null, null, y2.m.d(-844928228, true, new er.p() { // from class: l62.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.l(dataLoaded, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(-601391365, true, new er.p() { // from class: l62.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.n(dataLoaded, alVar3, pVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 30);
            rVarH = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
            aVar3 = aVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: l62.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.q(dataLoaded, pVar2, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(final o.a.DataLoaded dataLoaded, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-844928228, i15, -1, "pl.gov.coi.mobywatel.feature.familycard.presentation.screens.FamilyCardDocumentContent.<anonymous> (FamilyCardDocumentContent.kt:58)");
            }
            Bitmap qrQode = dataLoaded.getBottomSheetContentData().getQrQode();
            Label closeButton = dataLoaded.getBottomSheetContentData().getCloseButton();
            boolean zG = rVar.G(dataLoaded);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: l62.t
                    @Override // er.a
                    public final Object a() {
                        return y.m(dataLoaded);
                    }
                };
                rVar.v(objE);
            }
            a70.b.b(qrQode, closeButton, (er.a) objE, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(o.a.DataLoaded dataLoaded) {
        dataLoaded.h().b(Boolean.FALSE);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(final o.a.DataLoaded dataLoaded, final al alVar, final i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-601391365, i15, -1, "pl.gov.coi.mobywatel.feature.familycard.presentation.screens.FamilyCardDocumentContent.<anonymous> (FamilyCardDocumentContent.kt:65)");
            }
            i50.s.r(dataLoaded.getScaffoldData(), null, y2.m.d(1418803781, true, new er.p() { // from class: l62.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.o(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1705792430, true, new er.q() { // from class: l62.v
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return y.p(dataLoaded, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1418803781, i15, -1, "pl.gov.coi.mobywatel.feature.familycard.presentation.screens.FamilyCardDocumentContent.<anonymous>.<anonymous> (FamilyCardDocumentContent.kt:69)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(o.a.DataLoaded dataLoaded, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1705792430, i16, -1, "pl.gov.coi.mobywatel.feature.familycard.presentation.screens.FamilyCardDocumentContent.<anonymous>.<anonymous> (FamilyCardDocumentContent.kt:72)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.d(companion, 0.0f, 1, null), d3Var);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            f3.c.b bVarG = companion2.g();
            d1.i iVar = d1.i.f39152a;
            p036e4.w0 w0VarA = d1.e0.a(iVar.k(), bVarG, rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            y30.n.Switch controllersData = dataLoaded.getControllersData();
            if (controllersData == null) {
                rVar.X(-256370299);
            } else {
                rVar.X(-256370298);
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                f3.m mVarP = a3.p(a3.p(companion, 0.0f, aVar.b(rVar, i17).getSpacing100(), 1, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
                p036e4.w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = f3.j.e(rVar, mVarP);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB2);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC2 = n6.c(rVar);
                n6.i(rVarC2, w0VarB, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                q3 q3Var = q3.f39261a;
                y30.m.g(controllersData, rVar, y30.n.Switch.f223693f);
                rVar.x();
            }
            rVar.R();
            y30.n.Switch controllersData2 = dataLoaded.getControllersData();
            y30.n.Switch.EnumC5973b selectedItemType = controllersData2 != null ? controllersData2.getSelectedItemType() : null;
            if ((selectedItemType == null ? -1 : d.f116710a[selectedItemType.ordinal()]) == 1) {
                rVar.X(1792857991);
                r(dataLoaded, rVar, 0);
                rVar.R();
            } else {
                rVar.X(1792861175);
                o20.i.m(dataLoaded.getBaseDocumentData(), rVar, BaseDocumentData.f140741h);
                rVar.R();
            }
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(o.a.DataLoaded dataLoaded, i70.p pVar, er.a aVar, int i15, int i16, p076m2.r rVar, int i17) {
        j(dataLoaded, pVar, aVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void r(final o.a.DataLoaded dataLoaded, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1685665745);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(dataLoaded) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1685665745, i16, -1, "pl.gov.coi.mobywatel.feature.familycard.presentation.screens.FamilyMembersListContent (FamilyCardDocumentContent.kt:106)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarF);
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d1.i.f fVarR = iVar.r(aVar.b(rVarH, i17).getSpacing100());
            f3.m mVarF2 = androidx.compose.foundation.layout.d.f(d1.h0.b(i0Var, a3.p(companion, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null), 1.0f, false, 2, null), 0.0f, 1, null);
            d3 d3VarI = a3.i(0.0f, aVar.b(rVarH, i17).getSpacing100(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 5, null);
            boolean zG = rVarH.G(dataLoaded);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: l62.w
                    @Override // er.l
                    public final Object b(Object obj) {
                        return y.s(dataLoaded, (f1.q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(mVarF2, null, d3VarI, false, fVarR, null, null, false, null, (er.l) objE, rVarH, 0, 490);
            f3.m mVarN = a3.n(companion, aVar.b(rVarH, i17).getSpacing200());
            p036e4.w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarN);
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
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.x xVar = d1.x.f39368a;
            h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(dataLoaded.getUpdateButtonLabel(), null, 2, null), k30.d.a.f107773a, null, dataLoaded.f(), 35, null), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: l62.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.t(dataLoaded, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(o.a.DataLoaded dataLoaded, f1.q0 q0Var) {
        List<n50.k> listE = dataLoaded.e();
        q0Var.j(listE.size(), null, new b(a.f116706a, listE), y2.m.b(802480018, true, new c(listE)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(o.a.DataLoaded dataLoaded, int i15, p076m2.r rVar, int i16) {
        r(dataLoaded, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
