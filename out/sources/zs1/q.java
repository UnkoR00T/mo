package zs1;

import b5.TextGeometricTransform;
import d1.m3;
import d1.q3;
import d1.r3;
import java.util.List;
import mx.Label;
import n3.Shadow;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.x3;
import q4.SpanStyle;
import q4.TextLayoutResult;
import q4.TextStyle;
import x4.LocaleList;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0011\u0010\u0004¨\u0006\u0013²\u0006\u000e\u0010\u0012\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lzs1/t0$a$b$a;", "data", "Loq/i0;", "v", "(Lzs1/t0$a$b$a;Lm2/r;I)V", "model", "s", "Lmx/a;", AnnotatedPrivateKey.LABEL, "k", "(Lmx/a;Lm2/r;I)V", "", "test", "Lc5/h;", "distanceToText", "i", "(FFLm2/r;II)V", "p", "middleOfTheFirstLine", "diia_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f236832a = new a();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(n50.k kVar) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f236833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f236834b;

        public b(er.l lVar, List list) {
            this.f236833a = lVar;
            this.f236834b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f236833a.b(this.f236834b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.r<f1.e, Integer, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f236835a;

        public c(List list) {
            this.f236835a = list;
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
            n50.k kVar = (n50.k) this.f236835a.get(i15);
            rVar.X(-530513544);
            n50.h0.v(kVar, null, rVar, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
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

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    private static final void i(final float f15, float f16, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        float f17;
        boolean z15;
        final float fN;
        d5 d5VarM;
        float fD2;
        float f18;
        float fN2;
        p076m2.r rVarH = rVar.h(1856023449);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.b(f15) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 == 0) {
            if ((i15 & 48) == 0) {
                f17 = f16;
                i17 |= rVarH.b(f17) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i18 != 0) {
                    fN = c5.h.n(18);
                } else {
                    fN = f17;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1856023449, i17, -1, "pl.gov.coi.mobywatel.feature.diia.presentation.screens.document.BulletListIndicator (RefugeeChildrenScreen.kt:176)");
                }
                fD2 = ((c5.d) rVarH.N(androidx.compose.ui.platform.g1.f())).d2(f15);
                f18 = 3;
                if (c5.h.l(fD2, c5.h.n(f18)) > 0) {
                    fN2 = c5.h.n(fD2 - c5.h.n(f18));
                } else {
                    fN2 = c5.h.n(0);
                }
                d1.r.b(w0.i.c(androidx.compose.foundation.layout.d.t(d1.a3.r(f3.m.INSTANCE, 0.0f, fN2, fN, 0.0f, 9, null), c5.h.n(6)), k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), l1.h.b(100)), rVarH, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
                fN = f17;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: zs1.p
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return q.j(f15, fN, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        f17 = f16;
        if ((i17 & 19) != 18) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i18 != 0) {
                fN = c5.h.n(18);
            } else {
                fN = f17;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1856023449, i17, -1, "pl.gov.coi.mobywatel.feature.diia.presentation.screens.document.BulletListIndicator (RefugeeChildrenScreen.kt:176)");
            }
            fD2 = ((c5.d) rVarH.N(androidx.compose.ui.platform.g1.f())).d2(f15);
            f18 = 3;
            if (c5.h.l(fD2, c5.h.n(f18)) > 0) {
                fN2 = c5.h.n(fD2 - c5.h.n(f18));
            } else {
                fN2 = c5.h.n(0);
            }
            d1.r.b(w0.i.c(androidx.compose.foundation.layout.d.t(d1.a3.r(f3.m.INSTANCE, 0.0f, fN2, fN, 0.0f, 9, null), c5.h.n(6)), k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), l1.h.b(100)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
            fN = f17;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zs1.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.j(f15, fN, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(float f15, float f16, int i15, int i16, p076m2.r rVar, int i17) {
        i(f15, f16, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void k(final Label label, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(101228271);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(101228271, i16, -1, "pl.gov.coi.mobywatel.feature.diia.presentation.screens.document.BulletListItem (RefugeeChildrenScreen.kt:158)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = x3.a(0.0f);
                rVarH.v(objE);
            }
            final p076m2.x2 x2Var = (p076m2.x2) objE;
            f3.m.Companion companion2 = f3.m.INSTANCE;
            p036e4.w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion2);
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
            q3 q3Var = q3.f39261a;
            i(l(x2Var), 0.0f, rVarH, 0, 2);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            TextStyle textStyleA = aVar.f(rVarH, i17).a();
            long jB = aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new er.l() { // from class: zs1.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.n(x2Var, (TextLayoutResult) obj);
                    }
                };
                rVarH.v(objE2);
            }
            rVar2 = rVarH;
            j70.h.g(null, null, label, null, null, jB, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (er.l) objE2, textStyleA, null, null, false, false, null, rVar2, (i16 << 6) & 896, 100663296, 0, 32767963);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zs1.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.o(label, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float l(p076m2.x2 x2Var) {
        return x2Var.a();
    }

    private static final void m(p076m2.x2 x2Var, float f15) {
        x2Var.p(f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(p076m2.x2 x2Var, TextLayoutResult textLayoutResult) {
        m(x2Var, textLayoutResult.m(0) / 2);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(Label label, int i15, p076m2.r rVar, int i16) {
        k(label, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void p(final t0.a.b.ChildrenList childrenList, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1349041029);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(childrenList) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1349041029, i16, -1, "pl.gov.coi.mobywatel.feature.diia.presentation.screens.document.ChildrenListContent (RefugeeChildrenScreen.kt:195)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(d1.a3.q(w0.i.d(companion, aVar.a(rVarH, i17).getBase().a(), null, 2, null), aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing100(), aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing200()), 0.0f, 1, null);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarF);
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            f3.m mVarB = d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null);
            boolean zG = rVarH.G(childrenList);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: zs1.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.q(childrenList, (f1.q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(mVarB, null, null, false, null, null, null, false, null, (er.l) objE, rVarH, 0, 510);
            h30.q.p(childrenList.getButtonData(), false, null, rVarH, 0, 6);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zs1.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.r(childrenList, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(t0.a.b.ChildrenList childrenList, f1.q0 q0Var) {
        List<n50.k> listO = childrenList.o();
        q0Var.j(listO.size(), null, new b(a.f236832a, listO), y2.m.b(802480018, true, new c(listO)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(t0.a.b.ChildrenList childrenList, int i15, p076m2.r rVar, int i16) {
        p(childrenList, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void s(t0.a.b.ChildrenList childrenList, p076m2.r rVar, final int i15) {
        int i16;
        final t0.a.b.ChildrenList childrenList2;
        p076m2.r rVarH = rVar.h(1563399070);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(childrenList) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1563399070, i16, -1, "pl.gov.coi.mobywatel.feature.diia.presentation.screens.document.EmptyStateContent (RefugeeChildrenScreen.kt:57)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(d1.a3.q(w0.i.d(companion, aVar.a(rVarH, i17).getBase().a(), null, 2, null), aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing100(), aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing200()), 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.f fVarH = iVar.h();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(fVarH, companion2.k(), rVarH, 6);
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
            f3.m mVarS = t70.i.S(d1.h0.b(d1.i0.f39176a, androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), 1.0f, false, 2, null), null, rVarH, 0, 1);
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarS);
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            f3.m mVarR = d1.a3.r(d1.a3.p(companion, aVar.b(rVarH, i17).getSpacing400(), 0.0f, 2, null), 0.0f, aVar.b(rVarH, i17).getSpacing300(), 0.0f, 0.0f, 13, null);
            Label emptyStateHeader = childrenList.getEmptyStateHeader();
            TextStyle textStyleQ = aVar.f(rVarH, i17).q();
            long jI = aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
            b5.j.Companion companion4 = b5.j.INSTANCE;
            j70.h.g(mVarR, null, emptyStateHeader, null, null, jI, 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, textStyleQ, null, null, false, false, null, rVarH, 0, 0, 0, 33026010);
            f3.m mVarR2 = d1.a3.r(d1.a3.p(companion, aVar.b(rVarH, i17).getSpacing400(), 0.0f, 2, null), 0.0f, aVar.b(rVarH, i17).getSpacing250(), 0.0f, 0.0f, 13, null);
            Label labelO = childrenList.getEmptyStateDescriptionPart1().o(childrenList.getEmptyStateDescriptionButton()).o(childrenList.getEmptyStateDescriptionPart2());
            TextStyle textStyleA = aVar.f(rVarH, i17).a();
            long jI2 = aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
            int iA = companion4.a();
            rVarH.X(1581293566);
            q4.e.b bVar = new q4.e.b(0, 1, null);
            TextStyle textStyleB = aVar.f(rVarH, i17).b();
            int iO = bVar.o(new SpanStyle(aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), textStyleB.n(), textStyleB.q(), (u4.y) null, (u4.z) null, textStyleB.l(), (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (b5.k) null, (Shadow) null, (q4.j0) null, (p3.g) null, 65496, (fr.k) null));
            try {
                bVar.f(childrenList.getEmptyStateDescriptionPart1().getText());
                bVar.f(" ");
                bVar.l(iO);
                TextStyle textStyleA2 = aVar.f(rVarH, i17).a();
                int iO2 = bVar.o(new SpanStyle(aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), textStyleA2.n(), textStyleA2.q(), (u4.y) null, (u4.z) null, textStyleA2.l(), (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (b5.k) null, (Shadow) null, (q4.j0) null, (p3.g) null, 65496, (fr.k) null));
                try {
                    bVar.f(childrenList.getEmptyStateDescriptionButton().getText());
                    bVar.l(iO2);
                    int iO3 = bVar.o(new SpanStyle(aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), textStyleB.n(), textStyleB.q(), (u4.y) null, (u4.z) null, textStyleB.l(), (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (b5.k) null, (Shadow) null, (q4.j0) null, (p3.g) null, 65496, (fr.k) null));
                    try {
                        bVar.f(" ");
                        bVar.f(childrenList.getEmptyStateDescriptionPart2().getText());
                        bVar.l(iO3);
                        q4.e eVarP = bVar.p();
                        rVarH.R();
                        j70.h.g(mVarR2, null, labelO, null, eVarP, jI2, 0L, null, null, null, 0L, null, b5.j.h(iA), 0L, 0, false, 0, 0, null, textStyleA, null, null, false, false, null, rVarH, 0, 0, 0, 33025994);
                        rVarH = rVarH;
                        r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing400()), rVarH, 0);
                        childrenList2 = childrenList;
                        x30.c.c(null, 0.0f, y2.m.d(1249673323, true, new er.p() { // from class: zs1.j
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return q.t(childrenList2, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
                        rVarH.x();
                        r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing400()), rVarH, 0);
                        h30.q.p(childrenList2.getButtonData(), false, null, rVarH, 0, 6);
                        rVarH.x();
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    } catch (Throwable th4) {
                        bVar.l(iO3);
                        throw th4;
                    }
                } catch (Throwable th5) {
                    bVar.l(iO2);
                    throw th5;
                }
            } catch (Throwable th6) {
                bVar.l(iO);
                throw th6;
            }
        } else {
            childrenList2 = childrenList;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zs1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.u(childrenList2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(t0.a.b.ChildrenList childrenList, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1249673323, i15, -1, "pl.gov.coi.mobywatel.feature.diia.presentation.screens.document.EmptyStateContent.<anonymous>.<anonymous>.<anonymous> (RefugeeChildrenScreen.kt:115)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            Label emptyStateConditionHeader = childrenList.getEmptyStateConditionHeader();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, emptyStateConditionHeader, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).a(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing250()), rVar, 0);
            k(childrenList.getEmptyStateFirstCondition(), rVar, 0);
            k(childrenList.getEmptyStateSecondCondition(), rVar, 0);
            f3.m mVarH = androidx.compose.foundation.layout.d.h(d1.a3.r(companion, 0.0f, aVar.b(rVar, i16).getSpacing300(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            p036e4.w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarH);
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
            h60.f.e(null, null, Integer.valueOf(jz.a.H1), h60.g.Medium, aVar.a(rVar, i16).getBase().getPrimary(), 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVar, 3072, 0, 4067);
            j70.h.g(d1.a3.r(companion, aVar.b(rVar, i16).getSpacing100(), 0.0f, 0.0f, 0.0f, 14, null), null, childrenList.getEmptyStateConditionInfo(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
            rVar.x();
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
    public static final oq.i0 u(t0.a.b.ChildrenList childrenList, int i15, p076m2.r rVar, int i16) {
        s(childrenList, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void v(final t0.a.b.ChildrenList childrenList, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1262817017);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(childrenList) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1262817017, i16, -1, "pl.gov.coi.mobywatel.feature.diia.presentation.screens.document.RefugeeChildrenScreen (RefugeeChildrenScreen.kt:42)");
            }
            if (childrenList.o().isEmpty()) {
                rVarH.X(-1908587323);
                s(childrenList, rVarH, i16 & 14);
                rVarH.R();
            } else {
                rVarH.X(-1908585465);
                p(childrenList, rVarH, i16 & 14);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: zs1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.w(childrenList, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(t0.a.b.ChildrenList childrenList, int i15, p076m2.r rVar, int i16) {
        v(childrenList, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
