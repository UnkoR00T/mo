package ya3;

import a4.k0;
import ab3.Transformation;
import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d1.a3;
import d1.d3;
import fx.Rectangle;
import i50.BaseScaffoldData;
import java.util.List;
import n3.b2;
import n3.l0;
import n3.z1;
import n4.f0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p036e4.a2;
import p036e4.q1;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p143z0.k3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0011\u001a\u00020\t*\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lya3/e$c;", "viewModel", "Loq/i0;", "p", "(Lya3/e$c;Lm2/r;I)V", "Lya3/e$c$a;", "data", "h", "(Lya3/e$c$a;Lm2/r;I)V", "Lf3/m;", "modifier", "Lya3/e$c$a$a;", "l", "(Lf3/m;Lya3/e$c$a$a;Lm2/r;II)V", "Lkotlin/Function1;", "Lab3/b;", "onTransform", "s", "(Lf3/m;Ler/l;)Lf3/m;", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f225845a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b(a2.a aVar) {
            return i0.f148189a;
        }

        @Override // p036e4.w0
        public /* bridge */ int c(p036e4.w wVar, List<? extends p036e4.v> list, int i15) {
            return super.c(wVar, list, i15);
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            return y0.j2(y0Var, c5.b.n(j15), c5.b.m(j15), null, new er.l() { // from class: ya3.o
                @Override // er.l
                public final Object b(Object obj) {
                    return p.a.b((a2.a) obj);
                }
            }, 4, null);
        }

        @Override // p036e4.w0
        public /* bridge */ int f(p036e4.w wVar, List<? extends p036e4.v> list, int i15) {
            return super.f(wVar, list, i15);
        }

        @Override // p036e4.w0
        public /* bridge */ int h(p036e4.w wVar, List<? extends p036e4.v> list, int i15) {
            return super.h(wVar, list, i15);
        }

        @Override // p036e4.w0
        public /* bridge */ int i(p036e4.w wVar, List<? extends p036e4.v> list, int i15) {
            return super.i(wVar, list, i15);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l<Transformation, i0> f225846a;

        /* JADX WARN: Multi-variable type inference failed */
        b(er.l<? super Transformation, i0> lVar) {
            this.f225846a = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b(er.l lVar, m3.e eVar, m3.e eVar2, float f15, float f16) {
            lVar.b(new Transformation(eVar.getPackedValue(), f15, eVar2.getPackedValue(), null));
            return i0.f148189a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, tq.e<? super i0> eVar) {
            final er.l<Transformation, i0> lVar = this.f225846a;
            Object objK = k3.k(k0Var, false, new er.r() { // from class: ya3.q
                @Override // er.r
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                    return p.b.b(lVar, (m3.e) obj, (m3.e) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue());
                }
            }, eVar, 1, null);
            return objK == uq.b.e() ? objK : i0.f148189a;
        }
    }

    private static final void h(final e.c.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1613987183);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1613987183, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.mappreview.Content (MapPreviewScreen.kt:44)");
            }
            rVar2 = rVarH;
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-623076732, true, new er.q() { // from class: ya3.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.i(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ya3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.k(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final e.c.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-623076732, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.mappreview.Content.<anonymous> (MapPreviewScreen.kt:48)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null);
            boolean zG = rVar.G(data);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ya3.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.j(data, (c5.r) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarA = q1.a(mVarF, (er.l) objE);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarA);
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
            l(null, data.getImage(), rVar, 0, 1);
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
    public static final i0 j(e.c.Data data, c5.r rVar) {
        data.b().b(new Rectangle((int) (rVar.getPackedValue() >> 32), (int) (rVar.getPackedValue() & BodyPartID.bodyIdMax)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(e.c.Data data, int i15, p076m2.r rVar, int i16) {
        h(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(f3.m mVar, final e.c.Data.ImageData imageData, p076m2.r rVar, final int i15, final int i16) {
        f3.m mVar2;
        int i17;
        final f3.m mVar3;
        p076m2.r rVarH = rVar.h(655118453);
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
            i17 |= rVarH.G(imageData) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            mVar3 = i18 != 0 ? f3.m.INSTANCE : mVar2;
            if (p076m2.t.k()) {
                p076m2.t.o(655118453, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.mappreview.Image (MapPreviewScreen.kt:70)");
            }
            boolean zW = rVarH.W(imageData.getBitmap());
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = l0.c(imageData.getBitmap());
                rVarH.v(objE);
            }
            b2 b2Var = (b2) objE;
            boolean zW2 = rVarH.W(b2Var);
            Object objE2 = rVarH.E();
            if (zW2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = r3.a.b(b2Var, 0L, 0L, p3.f.INSTANCE.b(), 6, null);
                rVarH.v(objE2);
            }
            BitmapPainter bitmapPainter = (BitmapPainter) objE2;
            boolean zG = rVarH.G(imageData);
            Object objE3 = rVarH.E();
            if (zG || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new er.l() { // from class: ya3.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.m(imageData, (n4.i0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            f3.m mVarS = s(androidx.compose.foundation.layout.d.f(n4.v.d(mVar3, false, (er.l) objE3, 1, null), 0.0f, 1, null), imageData.d());
            boolean zG2 = rVarH.G(imageData);
            Object objE4 = rVarH.E();
            if (zG2 || objE4 == p076m2.r.INSTANCE.a()) {
                objE4 = new er.l() { // from class: ya3.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.n(imageData, (n3.a2) obj);
                    }
                };
                rVarH.v(objE4);
            }
            f3.m mVarB = androidx.compose.ui.draw.a.b(z1.c(mVarS, (er.l) objE4), bitmapPainter, false, null, p036e4.l.INSTANCE.a(), 0.0f, null, 54, null);
            Object objE5 = rVarH.E();
            if (objE5 == p076m2.r.INSTANCE.a()) {
                objE5 = a.f225845a;
                rVarH.v(objE5);
            }
            w0 w0Var = (w0) objE5;
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            f3.m mVarE = f3.j.e(rVarH, mVarB);
            e0 e0VarT = rVarH.t();
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0Var, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ya3.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.o(mVar3, imageData, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(e.c.Data.ImageData imageData, n4.i0 i0Var) {
        f0.c0(i0Var, imageData.getContentDescription().getText());
        f0.r0(i0Var, n4.l.INSTANCE.e());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(e.c.Data.ImageData imageData, n3.a2 a2Var) {
        a2Var.s(imageData.getScale());
        a2Var.D(imageData.getScale());
        a2Var.N(Float.intBitsToFloat((int) (imageData.getOffset() >> 32)));
        a2Var.j(Float.intBitsToFloat((int) (imageData.getOffset() & BodyPartID.bodyIdMax)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(f3.m mVar, e.c.Data.ImageData imageData, int i15, int i16, p076m2.r rVar, int i17) {
        l(mVar, imageData, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void p(final e.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(574275340);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(574275340, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.mappreview.MapPreviewScreen (MapPreviewScreen.kt:36)");
            }
            h(q(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ya3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.r(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.c.Data q(f6<e.c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(e.c cVar, int i15, p076m2.r rVar, int i16) {
        p(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @SuppressLint({"SuspiciousModifierThen"})
    private static final f3.m s(f3.m mVar, er.l<? super Transformation, i0> lVar) {
        return mVar.u(a4.w0.c(mVar, i0.f148189a, new b(lVar)));
    }
}
