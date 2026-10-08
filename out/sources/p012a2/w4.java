package p012a2;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.node.c;
import c5.h;
import d1.a3;
import d1.i;
import d1.p3;
import d1.x;
import er.l;
import er.p;
import er.q;
import f3.j;
import fr.t;
import java.util.ArrayList;
import java.util.List;
import lr.m;
import n3.y2;
import oq.g;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p036e4.f0;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\u001ak\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a]\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0019\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010 \u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\"\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001d\"\u0014\u0010$\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001d\"\u0014\u0010&\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001d\"\u0014\u0010(\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001d\"\u0014\u0010*\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001d\"\u0014\u0010,\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001d\"\u0014\u0010.\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001d¨\u0006/"}, d2 = {"Lf3/m;", "modifier", "Lkotlin/Function0;", "Loq/i0;", "action", "", "actionOnNewLine", "Ln3/y2;", "shape", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Lc5/h;", "elevation", "content", "q", "(Lf3/m;Ler/p;ZLn3/y2;JJFLer/p;Lm2/r;II)V", "La2/v3;", "snackbarData", "actionColor", "r", "(La2/v3;Lf3/m;ZLn3/y2;JJJFLm2/r;II)V", "B", "(Ler/p;Lm2/r;I)V", "text", "m", "(Ler/p;Ler/p;Lm2/r;I)V", "o", "a", "F", "HeightToFirstLine", "b", "HorizontalSpacing", "c", "HorizontalSpacingButtonSide", "d", "SeparateButtonExtraY", "e", "SnackbarVerticalPadding", "f", "TextEndExtraSpacing", "g", "LongButtonVerticalOffset", "h", "SnackbarMinHeightOneLine", "i", "SnackbarMinHeightTwoLines", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class w4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f1986c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f1989f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f1984a = h.n(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f1985b = h.n(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f1987d = h.n(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f1988e = h.n(6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f1990g = h.n(12);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f1991h = h.n(48);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f1992i = h.n(68);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1994b;

        a(String str, String str2) {
            this.f1993a = str;
            this.f1994b = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b(a2 a2Var, int i15, a2 a2Var2, int i16, int i17, a2.a aVar) {
            a2.a.I(aVar, a2Var, 0, i15, 0.0f, 4, null);
            a2.a.I(aVar, a2Var2, i16, i17, 0.0f, 4, null);
            return i0.f148189a;
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            int iX0;
            int iMax;
            String str = this.f1993a;
            int size = list.size();
            int height = 0;
            for (int i15 = 0; i15 < size; i15++) {
                v0 v0Var = list.get(i15);
                if (t.c(f0.a(v0Var), str)) {
                    long j16 = j15;
                    final a2 a2VarO0 = v0Var.o0(j16);
                    int iE = m.e((c5.b.l(j16) - a2VarO0.getWidth()) - y0Var.X0(w4.f1989f), c5.b.n(j16));
                    String str2 = this.f1994b;
                    int size2 = list.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        v0 v0Var2 = list.get(i16);
                        if (t.c(f0.a(v0Var2), str2)) {
                            final a2 a2VarO1 = v0Var2.o0(c5.b.d(j16, 0, iE, 0, 0, 9, null));
                            int I = a2VarO1.I(p036e4.b.a());
                            int I2 = a2VarO1.I(p036e4.b.b());
                            boolean z15 = true;
                            boolean z16 = (I == Integer.MIN_VALUE || I2 == Integer.MIN_VALUE) ? false : true;
                            if (I != I2 && z16) {
                                z15 = false;
                            }
                            final int iL = c5.b.l(j15) - a2VarO0.getWidth();
                            if (z15) {
                                iMax = Math.max(y0Var.X0(w4.f1991h), a2VarO0.getHeight());
                                iX0 = (iMax - a2VarO1.getHeight()) / 2;
                                int I3 = a2VarO0.I(p036e4.b.a());
                                if (I3 != Integer.MIN_VALUE) {
                                    height = (I + iX0) - I3;
                                }
                            } else {
                                iX0 = y0Var.X0(w4.f1984a) - I;
                                iMax = Math.max(y0Var.X0(w4.f1992i), a2VarO1.getHeight() + iX0);
                                height = (iMax - a2VarO0.getHeight()) / 2;
                            }
                            final int i17 = height;
                            final int i18 = iX0;
                            return y0.j2(y0Var, c5.b.l(j15), iMax, null, new l() { // from class: a2.v4
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return w4.a.b(a2VarO1, i18, a2VarO0, iL, i17, (a2.a) obj);
                                }
                            }, 4, null);
                        }
                        i16++;
                        y0Var = y0Var;
                        j16 = j15;
                    }
                    e5.b.f("Collection contains no element matching the predicate.");
                    throw new g();
                }
            }
            e5.b.f("Collection contains no element matching the predicate.");
            throw new g();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f1995a = new b();

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b(ArrayList arrayList, int i15, a2.a aVar) {
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                a2 a2Var = (a2) arrayList.get(i16);
                a2.a.I(aVar, a2Var, 0, (i15 - a2Var.getHeight()) / 2, 0.0f, 4, null);
            }
            return i0.f148189a;
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            final ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            boolean z15 = false;
            int I = Integer.MIN_VALUE;
            int I2 = Integer.MIN_VALUE;
            int iMax = 0;
            for (int i15 = 0; i15 < size; i15++) {
                a2 a2VarO0 = list.get(i15).o0(j15);
                arrayList.add(a2VarO0);
                if (a2VarO0.I(p036e4.b.a()) != Integer.MIN_VALUE && (I == Integer.MIN_VALUE || a2VarO0.I(p036e4.b.a()) < I)) {
                    I = a2VarO0.I(p036e4.b.a());
                }
                if (a2VarO0.I(p036e4.b.b()) != Integer.MIN_VALUE && (I2 == Integer.MIN_VALUE || a2VarO0.I(p036e4.b.b()) > I2)) {
                    I2 = a2VarO0.I(p036e4.b.b());
                }
                iMax = Math.max(iMax, a2VarO0.getHeight());
            }
            if (I != Integer.MIN_VALUE && I2 != Integer.MIN_VALUE) {
                z15 = true;
            }
            final int iMax2 = Math.max(y0Var.X0((I == I2 || !z15) ? w4.f1991h : w4.f1992i), iMax);
            return y0.j2(y0Var, c5.b.l(j15), iMax2, null, new l() { // from class: a2.x4
                @Override // er.l
                public final Object b(Object obj) {
                    return w4.b.b(arrayList, iMax2, (a2.a) obj);
                }
            }, 4, null);
        }
    }

    static {
        float f15 = 8;
        f1986c = h.n(f15);
        f1989f = h.n(f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(v3 v3Var, f3.m mVar, boolean z15, y2 y2Var, long j15, long j16, long j17, float f15, int i15, int i16, r rVar, int i17) {
        r(v3Var, mVar, z15, y2Var, j15, j16, j17, f15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void B(final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(343813818);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(343813818, i16, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:235)");
            }
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = b.f1995a;
                rVarH.v(objE);
            }
            w0 w0Var = (w0) objE;
            f3.m.Companion companion = f3.m.INSTANCE;
            int iA = p076m2.m.a(rVarH, 0);
            e0 e0VarT = rVarH.t();
            f3.m mVarE = j.e(rVarH, companion);
            c.Companion companion2 = c.INSTANCE;
            er.a<c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0Var, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            p<c, Integer, i0> pVarC = companion2.c();
            if (rVarC.getInserting() || !t.c(rVarC.E(), Integer.valueOf(iA))) {
                rVarC.v(Integer.valueOf(iA));
                rVarC.j(Integer.valueOf(iA), pVarC);
            }
            n6.i(rVarC, mVarE, companion2.e());
            f3.m mVarO = a3.o(companion, f1985b, f1988e);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iA2 = p076m2.m.a(rVarH, 0);
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = j.e(rVarH, mVarO);
            er.a<c> aVarB2 = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarI, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            p<c, Integer, i0> pVarC2 = companion2.c();
            if (rVarC2.getInserting() || !t.c(rVarC2.E(), Integer.valueOf(iA2))) {
                rVarC2.v(Integer.valueOf(iA2));
                rVarC2.j(Integer.valueOf(iA2), pVarC2);
            }
            n6.i(rVarC2, mVarE2, companion2.e());
            x xVar = x.f39368a;
            pVar.B(rVarH, Integer.valueOf(i16 & 14));
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
            d5VarM.a(new p() { // from class: a2.u4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w4.C(pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(p pVar, int i15, r rVar, int i16) {
        B(pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void m(final p<? super r, ? super Integer, i0> pVar, final p<? super r, ? super Integer, i0> pVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1534293206);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1534293206, i16, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:289)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = d.h(companion, 0.0f, 1, null);
            float f15 = f1985b;
            float f16 = f1986c;
            f3.m mVarR = a3.r(mVarH, f15, 0.0f, f16, f1987d, 2, null);
            i.n nVarK = i.f39152a.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iA = p076m2.m.a(rVarH, 0);
            e0 e0VarT = rVarH.t();
            f3.m mVarE = j.e(rVarH, mVarR);
            c.Companion companion3 = c.INSTANCE;
            er.a<c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            p<c, Integer, i0> pVarC = companion3.c();
            if (rVarC.getInserting() || !t.c(rVarC.E(), Integer.valueOf(iA))) {
                rVarC.v(Integer.valueOf(iA));
                rVarC.j(Integer.valueOf(iA), pVarC);
            }
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarR2 = a3.r(d1.b.h(companion, f1984a, f1990g), 0.0f, 0.0f, f16, 0.0f, 11, null);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iA2 = p076m2.m.a(rVarH, 0);
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = j.e(rVarH, mVarR2);
            er.a<c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            p<c, Integer, i0> pVarC2 = companion3.c();
            if (rVarC2.getInserting() || !t.c(rVarC2.E(), Integer.valueOf(iA2))) {
                rVarC2.v(Integer.valueOf(iA2));
                rVarC2.j(Integer.valueOf(iA2), pVarC2);
            }
            n6.i(rVarC2, mVarE2, companion3.e());
            x xVar = x.f39368a;
            pVar.B(rVarH, Integer.valueOf(i16 & 14));
            rVarH.x();
            f3.m mVarC = i0Var.c(companion, companion2.j());
            w0 w0VarI2 = d1.r.i(companion2.o(), false);
            int iA3 = p076m2.m.a(rVarH, 0);
            e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = j.e(rVarH, mVarC);
            er.a<c> aVarB3 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarI2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            p<c, Integer, i0> pVarC3 = companion3.c();
            if (rVarC3.getInserting() || !t.c(rVarC3.E(), Integer.valueOf(iA3))) {
                rVarC3.v(Integer.valueOf(iA3));
                rVarC3.j(Integer.valueOf(iA3), pVarC3);
            }
            n6.i(rVarC3, mVarE3, companion3.e());
            pVar2.B(rVarH, Integer.valueOf((i16 >> 3) & 14));
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
            d5VarM.a(new p() { // from class: a2.l4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w4.n(pVar, pVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(p pVar, p pVar2, int i15, r rVar, int i16) {
        m(pVar, pVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void o(final p<? super r, ? super Integer, i0> pVar, final p<? super r, ? super Integer, i0> pVar2, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1302703572);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1302703572, i16, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:310)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarR = a3.r(companion, f1985b, 0.0f, f1986c, 0.0f, 10, null);
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new a("action", "text");
                rVarH.v(objE);
            }
            w0 w0Var = (w0) objE;
            int iA = p076m2.m.a(rVarH, 0);
            e0 e0VarT = rVarH.t();
            f3.m mVarE = j.e(rVarH, mVarR);
            c.Companion companion2 = c.INSTANCE;
            er.a<c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0Var, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            p<c, Integer, i0> pVarC = companion2.c();
            if (rVarC.getInserting() || !t.c(rVarC.E(), Integer.valueOf(iA))) {
                rVarC.v(Integer.valueOf(iA));
                rVarC.j(Integer.valueOf(iA), pVarC);
            }
            n6.i(rVarC, mVarE, companion2.e());
            f3.m mVarP = a3.p(f0.b(companion, "text"), 0.0f, f1988e, 1, null);
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iA2 = p076m2.m.a(rVarH, 0);
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = j.e(rVarH, mVarP);
            er.a<c> aVarB2 = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarI, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            p<c, Integer, i0> pVarC2 = companion2.c();
            if (rVarC2.getInserting() || !t.c(rVarC2.E(), Integer.valueOf(iA2))) {
                rVarC2.v(Integer.valueOf(iA2));
                rVarC2.j(Integer.valueOf(iA2), pVarC2);
            }
            n6.i(rVarC2, mVarE2, companion2.e());
            x xVar = x.f39368a;
            pVar.B(rVarH, Integer.valueOf(i16 & 14));
            rVarH.x();
            f3.m mVarB = f0.b(companion, "action");
            w0 w0VarI2 = d1.r.i(companion3.o(), false);
            int iA3 = p076m2.m.a(rVarH, 0);
            e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = j.e(rVarH, mVarB);
            er.a<c> aVarB3 = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarI2, companion2.d());
            n6.i(rVarC3, e0VarT3, companion2.f());
            p<c, Integer, i0> pVarC3 = companion2.c();
            if (rVarC3.getInserting() || !t.c(rVarC3.E(), Integer.valueOf(iA3))) {
                rVarC3.v(Integer.valueOf(iA3));
                rVarC3.j(Integer.valueOf(iA3), pVarC3);
            }
            n6.i(rVarC3, mVarE3, companion2.e());
            pVar2.B(rVarH, Integer.valueOf((i16 >> 3) & 14));
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
            d5VarM.a(new p() { // from class: a2.k4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w4.p(pVar, pVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(p pVar, p pVar2, int i15, r rVar, int i16) {
        o(pVar, pVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0137  */
    /* JADX WARN: Code duplicated, block: B:108:0x013a  */
    /* JADX WARN: Code duplicated, block: B:110:0x013e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0140  */
    /* JADX WARN: Code duplicated, block: B:114:0x0144  */
    /* JADX WARN: Code duplicated, block: B:117:0x014b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0158  */
    /* JADX WARN: Code duplicated, block: B:121:0x015d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0166  */
    /* JADX WARN: Code duplicated, block: B:125:0x016b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0178  */
    /* JADX WARN: Code duplicated, block: B:128:0x017b  */
    /* JADX WARN: Code duplicated, block: B:129:0x018d  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:140:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    public static final void q(f3.m mVar, p<? super r, ? super Integer, i0> pVar, boolean z15, y2 y2Var, long j15, long j16, float f15, final p<? super r, ? super Integer, i0> pVar2, r rVar, final int i15, final int i16) {
        int i17;
        p<? super r, ? super Integer, i0> pVar3;
        int i18;
        final boolean z16;
        int i19;
        y2 y2Var2;
        long j17;
        long j18;
        int i25;
        int i26;
        boolean z17;
        r rVar2;
        final f3.m mVar2;
        final p<? super r, ? super Integer, i0> pVar4;
        final boolean z18;
        final y2 y2Var3;
        final long j19;
        final long j25;
        final float f16;
        d5 d5VarM;
        f3.m mVar3;
        final p<? super r, ? super Integer, i0> pVar5;
        boolean z19;
        y2 small;
        long jA;
        long jL;
        f3.m mVar4;
        long j26;
        y2 y2Var4;
        long j27;
        float fN;
        int i27;
        int i28;
        int i29;
        r rVarH = rVar.h(-662779944);
        int i35 = i16 & 1;
        if (i35 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i36 = i16 & 2;
        if (i36 == 0) {
            if ((i15 & 48) == 0) {
                pVar3 = pVar;
                i17 |= rVarH.G(pVar3) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i15 & 3072) == 0) {
                    if ((i16 & 8) == 0) {
                        y2Var2 = y2Var;
                        int i37 = rVarH.W(y2Var2) ? 2048 : 1024;
                        i17 |= i37;
                    } else {
                        y2Var2 = y2Var;
                    }
                    i17 |= i37;
                } else {
                    y2Var2 = y2Var;
                }
                if ((i15 & 24576) == 0) {
                    if ((i16 & 16) == 0) {
                        j17 = j15;
                        if (rVarH.d(j17)) {
                            i29 = 16384;
                        }
                        i17 |= i29;
                    } else {
                        j17 = j15;
                    }
                    i29 = PKIFailureInfo.certRevoked;
                    i17 |= i29;
                } else {
                    j17 = j15;
                }
                if ((196608 & i15) == 0) {
                    if ((i16 & 32) == 0) {
                        j18 = j16;
                        if (rVarH.d(j18)) {
                            i28 = PKIFailureInfo.unsupportedVersion;
                        }
                        i17 |= i28;
                    } else {
                        j18 = j16;
                    }
                    i28 = PKIFailureInfo.notAuthorized;
                    i17 |= i28;
                } else {
                    j18 = j16;
                }
                i25 = i16 & 64;
                if (i25 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.b(f15)) {
                        i26 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i26 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i26;
                }
                if ((i15 & 12582912) == 0) {
                    if (rVarH.G(pVar2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i17 |= i27;
                }
                if ((i17 & 4793491) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0 || rVarH.Q()) {
                        if (i35 != 0) {
                            mVar3 = f3.m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i36 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar3;
                        }
                        z19 = i18 == 0 ? z16 : false;
                        if ((i16 & 8) != 0) {
                            small = m2.f1788a.b(rVarH, 6).getSmall();
                            i17 &= -7169;
                        } else {
                            small = y2Var2;
                        }
                        if ((i16 & 16) != 0) {
                            jA = w3.f1983a.a(rVarH, 6);
                            i17 &= -57345;
                        } else {
                            jA = j17;
                        }
                        if ((i16 & 32) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i17 = (-458753) & i17;
                        } else {
                            jL = j18;
                        }
                        if (i25 != 0) {
                            long j28 = jL;
                            mVar4 = mVar3;
                            j26 = j28;
                            y2Var4 = small;
                            j27 = jA;
                            z16 = z19;
                            fN = h.n(6);
                        } else {
                            long j29 = jL;
                            mVar4 = mVar3;
                            j26 = j29;
                            y2Var4 = small;
                            j27 = jA;
                            z16 = z19;
                            fN = f15;
                        }
                    } else {
                        rVarH.O();
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                        }
                        fN = f15;
                        pVar5 = pVar3;
                        j26 = j18;
                        j27 = j17;
                        mVar4 = mVar;
                        y2Var4 = y2Var2;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-662779944, i17, -1, "androidx.compose.material.Snackbar (Snackbar.kt:93)");
                    }
                    int i38 = i17 >> 6;
                    rVar2 = rVarH;
                    f5.f(mVar4, y2Var4, j27, j26, null, fN, y2.m.d(-1429068516, true, new p() { // from class: a2.o4
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return w4.s(pVar5, pVar2, z16, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVar2, 1572864 | (i17 & 14) | (i38 & 112) | (i38 & 896) | (i38 & 7168) | ((i17 >> 3) & 458752), 16);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    pVar4 = pVar5;
                    z18 = z16;
                    mVar2 = mVar4;
                    y2Var3 = y2Var4;
                    j19 = j27;
                    j25 = j26;
                    f16 = fN;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar2 = mVar;
                    pVar4 = pVar3;
                    z18 = z16;
                    y2Var3 = y2Var2;
                    j19 = j17;
                    j25 = j18;
                    f16 = f15;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.p4
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return w4.v(mVar2, pVar4, z18, y2Var3, j19, j25, f16, pVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            z16 = z15;
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    y2Var2 = y2Var;
                    if (rVarH.W(y2Var2)) {
                    }
                    i17 |= i37;
                } else {
                    y2Var2 = y2Var;
                }
                i17 |= i37;
            } else {
                y2Var2 = y2Var;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    j17 = j15;
                    if (rVarH.d(j17)) {
                        i29 = 16384;
                    }
                    i17 |= i29;
                } else {
                    j17 = j15;
                }
                i29 = PKIFailureInfo.certRevoked;
                i17 |= i29;
            } else {
                j17 = j15;
            }
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    j18 = j16;
                    if (rVarH.d(j18)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i28;
                } else {
                    j18 = j16;
                }
                i28 = PKIFailureInfo.notAuthorized;
                i17 |= i28;
            } else {
                j18 = j16;
            }
            i25 = i16 & 64;
            if (i25 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.b(f15)) {
                    i26 = PKIFailureInfo.badCertTemplate;
                } else {
                    i26 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i26;
            }
            if ((i15 & 12582912) == 0) {
                if (rVarH.G(pVar2)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i17 |= i27;
            }
            if ((i17 & 4793491) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i35 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i36 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar3;
                    }
                    if (i18 == 0) {
                    }
                    if ((i16 & 8) != 0) {
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                        i17 &= -7169;
                    } else {
                        small = y2Var2;
                    }
                    if ((i16 & 16) != 0) {
                        jA = w3.f1983a.a(rVarH, 6);
                        i17 &= -57345;
                    } else {
                        jA = j17;
                    }
                    if ((i16 & 32) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i17 = (-458753) & i17;
                    } else {
                        jL = j18;
                    }
                    if (i25 != 0) {
                        long j210 = jL;
                        mVar4 = mVar3;
                        j26 = j210;
                        y2Var4 = small;
                        j27 = jA;
                        z16 = z19;
                        fN = h.n(6);
                    } else {
                        long j211 = jL;
                        mVar4 = mVar3;
                        j26 = j211;
                        y2Var4 = small;
                        j27 = jA;
                        z16 = z19;
                        fN = f15;
                    }
                } else {
                    if (i35 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i36 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar3;
                    }
                    if (i18 == 0) {
                    }
                    if ((i16 & 8) != 0) {
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                        i17 &= -7169;
                    } else {
                        small = y2Var2;
                    }
                    if ((i16 & 16) != 0) {
                        jA = w3.f1983a.a(rVarH, 6);
                        i17 &= -57345;
                    } else {
                        jA = j17;
                    }
                    if ((i16 & 32) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i17 = (-458753) & i17;
                    } else {
                        jL = j18;
                    }
                    if (i25 != 0) {
                        long j212 = jL;
                        mVar4 = mVar3;
                        j26 = j212;
                        y2Var4 = small;
                        j27 = jA;
                        z16 = z19;
                        fN = h.n(6);
                    } else {
                        long j213 = jL;
                        mVar4 = mVar3;
                        j26 = j213;
                        y2Var4 = small;
                        j27 = jA;
                        z16 = z19;
                        fN = f15;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-662779944, i17, -1, "androidx.compose.material.Snackbar (Snackbar.kt:93)");
                }
                int i39 = i17 >> 6;
                rVar2 = rVarH;
                f5.f(mVar4, y2Var4, j27, j26, null, fN, y2.m.d(-1429068516, true, new p() { // from class: a2.o4
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return w4.s(pVar5, pVar2, z16, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, 1572864 | (i17 & 14) | (i39 & 112) | (i39 & 896) | (i39 & 7168) | ((i17 >> 3) & 458752), 16);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                pVar4 = pVar5;
                z18 = z16;
                mVar2 = mVar4;
                y2Var3 = y2Var4;
                j19 = j27;
                j25 = j26;
                f16 = fN;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                pVar4 = pVar3;
                z18 = z16;
                y2Var3 = y2Var2;
                j19 = j17;
                j25 = j18;
                f16 = f15;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.p4
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return w4.v(mVar2, pVar4, z18, y2Var3, j19, j25, f16, pVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        pVar3 = pVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    y2Var2 = y2Var;
                    if (rVarH.W(y2Var2)) {
                    }
                    i17 |= i37;
                } else {
                    y2Var2 = y2Var;
                }
                i17 |= i37;
            } else {
                y2Var2 = y2Var;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    j17 = j15;
                    if (rVarH.d(j17)) {
                        i29 = 16384;
                    }
                    i17 |= i29;
                } else {
                    j17 = j15;
                }
                i29 = PKIFailureInfo.certRevoked;
                i17 |= i29;
            } else {
                j17 = j15;
            }
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    j18 = j16;
                    if (rVarH.d(j18)) {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i28;
                } else {
                    j18 = j16;
                }
                i28 = PKIFailureInfo.notAuthorized;
                i17 |= i28;
            } else {
                j18 = j16;
            }
            i25 = i16 & 64;
            if (i25 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.b(f15)) {
                    i26 = PKIFailureInfo.badCertTemplate;
                } else {
                    i26 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i26;
            }
            if ((i15 & 12582912) == 0) {
                if (rVarH.G(pVar2)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i17 |= i27;
            }
            if ((i17 & 4793491) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i35 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i36 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar3;
                    }
                    if (i18 == 0) {
                    }
                    if ((i16 & 8) != 0) {
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                        i17 &= -7169;
                    } else {
                        small = y2Var2;
                    }
                    if ((i16 & 16) != 0) {
                        jA = w3.f1983a.a(rVarH, 6);
                        i17 &= -57345;
                    } else {
                        jA = j17;
                    }
                    if ((i16 & 32) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i17 = (-458753) & i17;
                    } else {
                        jL = j18;
                    }
                    if (i25 != 0) {
                        long j214 = jL;
                        mVar4 = mVar3;
                        j26 = j214;
                        y2Var4 = small;
                        j27 = jA;
                        z16 = z19;
                        fN = h.n(6);
                    } else {
                        long j215 = jL;
                        mVar4 = mVar3;
                        j26 = j215;
                        y2Var4 = small;
                        j27 = jA;
                        z16 = z19;
                        fN = f15;
                    }
                } else {
                    if (i35 != 0) {
                        mVar3 = f3.m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i36 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar3;
                    }
                    if (i18 == 0) {
                    }
                    if ((i16 & 8) != 0) {
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                        i17 &= -7169;
                    } else {
                        small = y2Var2;
                    }
                    if ((i16 & 16) != 0) {
                        jA = w3.f1983a.a(rVarH, 6);
                        i17 &= -57345;
                    } else {
                        jA = j17;
                    }
                    if ((i16 & 32) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i17 = (-458753) & i17;
                    } else {
                        jL = j18;
                    }
                    if (i25 != 0) {
                        long j216 = jL;
                        mVar4 = mVar3;
                        j26 = j216;
                        y2Var4 = small;
                        j27 = jA;
                        z16 = z19;
                        fN = h.n(6);
                    } else {
                        long j217 = jL;
                        mVar4 = mVar3;
                        j26 = j217;
                        y2Var4 = small;
                        j27 = jA;
                        z16 = z19;
                        fN = f15;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-662779944, i17, -1, "androidx.compose.material.Snackbar (Snackbar.kt:93)");
                }
                int i310 = i17 >> 6;
                rVar2 = rVarH;
                f5.f(mVar4, y2Var4, j27, j26, null, fN, y2.m.d(-1429068516, true, new p() { // from class: a2.o4
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return w4.s(pVar5, pVar2, z16, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, 1572864 | (i17 & 14) | (i310 & 112) | (i310 & 896) | (i310 & 7168) | ((i17 >> 3) & 458752), 16);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                pVar4 = pVar5;
                z18 = z16;
                mVar2 = mVar4;
                y2Var3 = y2Var4;
                j19 = j27;
                j25 = j26;
                f16 = fN;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar2 = mVar;
                pVar4 = pVar3;
                z18 = z16;
                y2Var3 = y2Var2;
                j19 = j17;
                j25 = j18;
                f16 = f15;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.p4
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return w4.v(mVar2, pVar4, z18, y2Var3, j19, j25, f16, pVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                y2Var2 = y2Var;
                if (rVarH.W(y2Var2)) {
                }
                i17 |= i37;
            } else {
                y2Var2 = y2Var;
            }
            i17 |= i37;
        } else {
            y2Var2 = y2Var;
        }
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                j17 = j15;
                if (rVarH.d(j17)) {
                    i29 = 16384;
                }
                i17 |= i29;
            } else {
                j17 = j15;
            }
            i29 = PKIFailureInfo.certRevoked;
            i17 |= i29;
        } else {
            j17 = j15;
        }
        if ((196608 & i15) == 0) {
            if ((i16 & 32) == 0) {
                j18 = j16;
                if (rVarH.d(j18)) {
                    i28 = PKIFailureInfo.unsupportedVersion;
                }
                i17 |= i28;
            } else {
                j18 = j16;
            }
            i28 = PKIFailureInfo.notAuthorized;
            i17 |= i28;
        } else {
            j18 = j16;
        }
        i25 = i16 & 64;
        if (i25 != 0) {
            i17 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            if (rVarH.b(f15)) {
                i26 = PKIFailureInfo.badCertTemplate;
            } else {
                i26 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i26;
        }
        if ((i15 & 12582912) == 0) {
            if (rVarH.G(pVar2)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i17 |= i27;
        }
        if ((i17 & 4793491) != 4793490) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i35 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if (i36 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar3;
                }
                if (i18 == 0) {
                }
                if ((i16 & 8) != 0) {
                    small = m2.f1788a.b(rVarH, 6).getSmall();
                    i17 &= -7169;
                } else {
                    small = y2Var2;
                }
                if ((i16 & 16) != 0) {
                    jA = w3.f1983a.a(rVarH, 6);
                    i17 &= -57345;
                } else {
                    jA = j17;
                }
                if ((i16 & 32) != 0) {
                    jL = m2.f1788a.a(rVarH, 6).l();
                    i17 = (-458753) & i17;
                } else {
                    jL = j18;
                }
                if (i25 != 0) {
                    long j218 = jL;
                    mVar4 = mVar3;
                    j26 = j218;
                    y2Var4 = small;
                    j27 = jA;
                    z16 = z19;
                    fN = h.n(6);
                } else {
                    long j219 = jL;
                    mVar4 = mVar3;
                    j26 = j219;
                    y2Var4 = small;
                    j27 = jA;
                    z16 = z19;
                    fN = f15;
                }
            } else {
                if (i35 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if (i36 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar3;
                }
                if (i18 == 0) {
                }
                if ((i16 & 8) != 0) {
                    small = m2.f1788a.b(rVarH, 6).getSmall();
                    i17 &= -7169;
                } else {
                    small = y2Var2;
                }
                if ((i16 & 16) != 0) {
                    jA = w3.f1983a.a(rVarH, 6);
                    i17 &= -57345;
                } else {
                    jA = j17;
                }
                if ((i16 & 32) != 0) {
                    jL = m2.f1788a.a(rVarH, 6).l();
                    i17 = (-458753) & i17;
                } else {
                    jL = j18;
                }
                if (i25 != 0) {
                    long j2110 = jL;
                    mVar4 = mVar3;
                    j26 = j2110;
                    y2Var4 = small;
                    j27 = jA;
                    z16 = z19;
                    fN = h.n(6);
                } else {
                    long j2111 = jL;
                    mVar4 = mVar3;
                    j26 = j2111;
                    y2Var4 = small;
                    j27 = jA;
                    z16 = z19;
                    fN = f15;
                }
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-662779944, i17, -1, "androidx.compose.material.Snackbar (Snackbar.kt:93)");
            }
            int i311 = i17 >> 6;
            rVar2 = rVarH;
            f5.f(mVar4, y2Var4, j27, j26, null, fN, y2.m.d(-1429068516, true, new p() { // from class: a2.o4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w4.s(pVar5, pVar2, z16, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVar2, 1572864 | (i17 & 14) | (i311 & 112) | (i311 & 896) | (i311 & 7168) | ((i17 >> 3) & 458752), 16);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            pVar4 = pVar5;
            z18 = z16;
            mVar2 = mVar4;
            y2Var3 = y2Var4;
            j19 = j27;
            j25 = j26;
            f16 = fN;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar2 = mVar;
            pVar4 = pVar3;
            z18 = z16;
            y2Var3 = y2Var2;
            j19 = j17;
            j25 = j18;
            f16 = f15;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a2.p4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w4.v(mVar2, pVar4, z18, y2Var3, j19, j25, f16, pVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0143  */
    /* JADX WARN: Code duplicated, block: B:114:0x0148  */
    /* JADX WARN: Code duplicated, block: B:117:0x014f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0160  */
    /* JADX WARN: Code duplicated, block: B:123:0x016c  */
    /* JADX WARN: Code duplicated, block: B:126:0x017c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0186  */
    /* JADX WARN: Code duplicated, block: B:129:0x018a  */
    /* JADX WARN: Code duplicated, block: B:131:0x019e  */
    /* JADX WARN: Code duplicated, block: B:134:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:137:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:142:0x021b  */
    /* JADX WARN: Code duplicated, block: B:144:0x022b  */
    /* JADX WARN: Code duplicated, block: B:147:0x0241  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:93:0x0100  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    public static final void r(final v3 v3Var, f3.m mVar, boolean z15, y2 y2Var, long j15, long j16, long j17, float f15, r rVar, final int i15, final int i16) {
        int i17;
        f3.m mVar2;
        int i18;
        boolean z16;
        int i19;
        y2 small;
        long jA;
        long jL;
        int i25;
        int i26;
        boolean z17;
        r rVar2;
        final float f16;
        final f3.m mVar3;
        final boolean z18;
        final y2 y2Var2;
        final long j18;
        final long j19;
        final long j25;
        d5 d5VarM;
        long jB;
        float fN;
        long j26;
        final long j27;
        boolean z19;
        y2 y2Var3;
        long j28;
        final String strB;
        final v3 v3Var2;
        f fVarD;
        int i27;
        int i28;
        int i29;
        r rVarH = rVar.h(258660814);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(v3Var) : rVarH.G(v3Var) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i35 = i16 & 2;
        if (i35 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i15 & 3072) == 0) {
                    if ((i16 & 8) == 0) {
                        small = y2Var;
                        int i36 = rVarH.W(small) ? 2048 : 1024;
                        i17 |= i36;
                    } else {
                        small = y2Var;
                    }
                    i17 |= i36;
                } else {
                    small = y2Var;
                }
                if ((i15 & 24576) == 0) {
                    if ((i16 & 16) == 0) {
                        jA = j15;
                        if (rVarH.d(jA)) {
                            i29 = 16384;
                        }
                        i17 |= i29;
                    } else {
                        jA = j15;
                    }
                    i29 = PKIFailureInfo.certRevoked;
                    i17 |= i29;
                } else {
                    jA = j15;
                }
                if ((196608 & i15) == 0) {
                    jL = j16;
                    if ((i16 & 32) == 0 || !rVarH.d(jL)) {
                        i28 = PKIFailureInfo.notAuthorized;
                    } else {
                        i28 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i28;
                } else {
                    jL = j16;
                }
                if ((1572864 & i15) != 0) {
                    if ((i16 & 64) == 0 || !rVarH.d(j17)) {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i27 = PKIFailureInfo.badCertTemplate;
                    }
                    i17 |= i27;
                }
                i25 = i16 & 128;
                if (i25 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.b(f15)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i17 |= i26;
                }
                if ((4793491 & i17) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0 || rVarH.Q()) {
                        if (i35 != 0) {
                            mVar2 = f3.m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = false;
                        }
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                            small = m2.f1788a.b(rVarH, 6).getSmall();
                        }
                        if ((i16 & 16) != 0) {
                            jA = w3.f1983a.a(rVarH, 6);
                            i17 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i17 &= -458753;
                        }
                        if ((i16 & 64) != 0) {
                            jB = w3.f1983a.b(rVarH, 6);
                            i17 &= -3670017;
                        } else {
                            jB = j17;
                        }
                        if (i25 != 0) {
                            fN = h.n(6);
                        } else {
                            fN = f15;
                        }
                        j26 = jL;
                        j27 = jB;
                        z19 = z16;
                        y2Var3 = small;
                        j28 = jA;
                    } else {
                        rVarH.O();
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            i17 &= -458753;
                        }
                        if ((i16 & 64) != 0) {
                            i17 &= -3670017;
                        }
                        j27 = j17;
                        fN = f15;
                        y2Var3 = small;
                        j28 = jA;
                        j26 = jL;
                        z19 = z16;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(258660814, i17, -1, "androidx.compose.material.Snackbar (Snackbar.kt:165)");
                    }
                    strB = v3Var.b();
                    if (strB != null) {
                        rVarH.X(593497188);
                        v3Var2 = v3Var;
                        fVarD = y2.m.d(1843479216, true, new p() { // from class: a2.j4
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return w4.w(j27, v3Var2, strB, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    } else {
                        v3Var2 = v3Var;
                        rVarH.X(593796152);
                        rVarH.R();
                        fVarD = null;
                    }
                    rVar2 = rVarH;
                    q(a3.n(mVar2, h.n(12)), fVarD, z19, y2Var3, j28, j26, fN, y2.m.d(-261845785, true, new p() { // from class: a2.m4
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return w4.z(v3Var2, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVar2, (i17 & 896) | 12582912 | (i17 & 7168) | (57344 & i17) | (458752 & i17) | ((i17 >> 3) & 3670016), 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    j25 = j27;
                    mVar3 = mVar2;
                    z18 = z19;
                    y2Var2 = y2Var3;
                    j18 = j28;
                    j19 = j26;
                    f16 = fN;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f16 = f15;
                    mVar3 = mVar2;
                    z18 = z16;
                    y2Var2 = small;
                    j18 = jA;
                    j19 = jL;
                    j25 = j17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.n4
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return w4.A(v3Var, mVar3, z18, y2Var2, j18, j19, j25, f16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            z16 = z15;
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    small = y2Var;
                    if (rVarH.W(small)) {
                    }
                    i17 |= i36;
                } else {
                    small = y2Var;
                }
                i17 |= i36;
            } else {
                small = y2Var;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    jA = j15;
                    if (rVarH.d(jA)) {
                        i29 = 16384;
                    }
                    i17 |= i29;
                } else {
                    jA = j15;
                }
                i29 = PKIFailureInfo.certRevoked;
                i17 |= i29;
            } else {
                jA = j15;
            }
            if ((196608 & i15) == 0) {
                jL = j16;
                if ((i16 & 32) == 0) {
                    i28 = PKIFailureInfo.notAuthorized;
                } else {
                    i28 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i28;
            } else {
                jL = j16;
            }
            if ((1572864 & i15) != 0) {
                if ((i16 & 64) == 0) {
                    i27 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i27;
            }
            i25 = i16 & 128;
            if (i25 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.b(f15)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i17 |= i26;
            }
            if ((4793491 & i17) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i35 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                    }
                    if ((i16 & 16) != 0) {
                        jA = w3.f1983a.a(rVarH, 6);
                        i17 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i17 &= -458753;
                    }
                    if ((i16 & 64) != 0) {
                        jB = w3.f1983a.b(rVarH, 6);
                        i17 &= -3670017;
                    } else {
                        jB = j17;
                    }
                    if (i25 != 0) {
                        fN = h.n(6);
                    } else {
                        fN = f15;
                    }
                    j26 = jL;
                    j27 = jB;
                    z19 = z16;
                    y2Var3 = small;
                    j28 = jA;
                } else {
                    if (i35 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                    }
                    if ((i16 & 16) != 0) {
                        jA = w3.f1983a.a(rVarH, 6);
                        i17 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i17 &= -458753;
                    }
                    if ((i16 & 64) != 0) {
                        jB = w3.f1983a.b(rVarH, 6);
                        i17 &= -3670017;
                    } else {
                        jB = j17;
                    }
                    if (i25 != 0) {
                        fN = h.n(6);
                    } else {
                        fN = f15;
                    }
                    j26 = jL;
                    j27 = jB;
                    z19 = z16;
                    y2Var3 = small;
                    j28 = jA;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(258660814, i17, -1, "androidx.compose.material.Snackbar (Snackbar.kt:165)");
                }
                strB = v3Var.b();
                if (strB != null) {
                    rVarH.X(593497188);
                    v3Var2 = v3Var;
                    fVarD = y2.m.d(1843479216, true, new p() { // from class: a2.j4
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return w4.w(j27, v3Var2, strB, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                } else {
                    v3Var2 = v3Var;
                    rVarH.X(593796152);
                    rVarH.R();
                    fVarD = null;
                }
                rVar2 = rVarH;
                q(a3.n(mVar2, h.n(12)), fVarD, z19, y2Var3, j28, j26, fN, y2.m.d(-261845785, true, new p() { // from class: a2.m4
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return w4.z(v3Var2, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, (i17 & 896) | 12582912 | (i17 & 7168) | (57344 & i17) | (458752 & i17) | ((i17 >> 3) & 3670016), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                j25 = j27;
                mVar3 = mVar2;
                z18 = z19;
                y2Var2 = y2Var3;
                j18 = j28;
                j19 = j26;
                f16 = fN;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                f16 = f15;
                mVar3 = mVar2;
                z18 = z16;
                y2Var2 = small;
                j18 = jA;
                j19 = jL;
                j25 = j17;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.n4
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return w4.A(v3Var, mVar3, z18, y2Var2, j18, j19, j25, f16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    small = y2Var;
                    if (rVarH.W(small)) {
                    }
                    i17 |= i36;
                } else {
                    small = y2Var;
                }
                i17 |= i36;
            } else {
                small = y2Var;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    jA = j15;
                    if (rVarH.d(jA)) {
                        i29 = 16384;
                    }
                    i17 |= i29;
                } else {
                    jA = j15;
                }
                i29 = PKIFailureInfo.certRevoked;
                i17 |= i29;
            } else {
                jA = j15;
            }
            if ((196608 & i15) == 0) {
                jL = j16;
                if ((i16 & 32) == 0) {
                    i28 = PKIFailureInfo.notAuthorized;
                } else {
                    i28 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i28;
            } else {
                jL = j16;
            }
            if ((1572864 & i15) != 0) {
                if ((i16 & 64) == 0) {
                    i27 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i27;
            }
            i25 = i16 & 128;
            if (i25 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.b(f15)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i17 |= i26;
            }
            if ((4793491 & i17) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i35 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                    }
                    if ((i16 & 16) != 0) {
                        jA = w3.f1983a.a(rVarH, 6);
                        i17 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i17 &= -458753;
                    }
                    if ((i16 & 64) != 0) {
                        jB = w3.f1983a.b(rVarH, 6);
                        i17 &= -3670017;
                    } else {
                        jB = j17;
                    }
                    if (i25 != 0) {
                        fN = h.n(6);
                    } else {
                        fN = f15;
                    }
                    j26 = jL;
                    j27 = jB;
                    z19 = z16;
                    y2Var3 = small;
                    j28 = jA;
                } else {
                    if (i35 != 0) {
                        mVar2 = f3.m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if ((i16 & 8) != 0) {
                        i17 &= -7169;
                        small = m2.f1788a.b(rVarH, 6).getSmall();
                    }
                    if ((i16 & 16) != 0) {
                        jA = w3.f1983a.a(rVarH, 6);
                        i17 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i17 &= -458753;
                    }
                    if ((i16 & 64) != 0) {
                        jB = w3.f1983a.b(rVarH, 6);
                        i17 &= -3670017;
                    } else {
                        jB = j17;
                    }
                    if (i25 != 0) {
                        fN = h.n(6);
                    } else {
                        fN = f15;
                    }
                    j26 = jL;
                    j27 = jB;
                    z19 = z16;
                    y2Var3 = small;
                    j28 = jA;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(258660814, i17, -1, "androidx.compose.material.Snackbar (Snackbar.kt:165)");
                }
                strB = v3Var.b();
                if (strB != null) {
                    rVarH.X(593497188);
                    v3Var2 = v3Var;
                    fVarD = y2.m.d(1843479216, true, new p() { // from class: a2.j4
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return w4.w(j27, v3Var2, strB, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                } else {
                    v3Var2 = v3Var;
                    rVarH.X(593796152);
                    rVarH.R();
                    fVarD = null;
                }
                rVar2 = rVarH;
                q(a3.n(mVar2, h.n(12)), fVarD, z19, y2Var3, j28, j26, fN, y2.m.d(-261845785, true, new p() { // from class: a2.m4
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return w4.z(v3Var2, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, (i17 & 896) | 12582912 | (i17 & 7168) | (57344 & i17) | (458752 & i17) | ((i17 >> 3) & 3670016), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                j25 = j27;
                mVar3 = mVar2;
                z18 = z19;
                y2Var2 = y2Var3;
                j18 = j28;
                j19 = j26;
                f16 = fN;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                f16 = f15;
                mVar3 = mVar2;
                z18 = z16;
                y2Var2 = small;
                j18 = jA;
                j19 = jL;
                j25 = j17;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.n4
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return w4.A(v3Var, mVar3, z18, y2Var2, j18, j19, j25, f16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                small = y2Var;
                if (rVarH.W(small)) {
                }
                i17 |= i36;
            } else {
                small = y2Var;
            }
            i17 |= i36;
        } else {
            small = y2Var;
        }
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                jA = j15;
                if (rVarH.d(jA)) {
                    i29 = 16384;
                }
                i17 |= i29;
            } else {
                jA = j15;
            }
            i29 = PKIFailureInfo.certRevoked;
            i17 |= i29;
        } else {
            jA = j15;
        }
        if ((196608 & i15) == 0) {
            jL = j16;
            if ((i16 & 32) == 0) {
                i28 = PKIFailureInfo.notAuthorized;
            } else {
                i28 = PKIFailureInfo.notAuthorized;
            }
            i17 |= i28;
        } else {
            jL = j16;
        }
        if ((1572864 & i15) != 0) {
            if ((i16 & 64) == 0) {
                i27 = PKIFailureInfo.signerNotTrusted;
            } else {
                i27 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i27;
        }
        i25 = i16 & 128;
        if (i25 != 0) {
            i17 |= 12582912;
        } else if ((i15 & 12582912) == 0) {
            if (rVarH.b(f15)) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i17 |= i26;
        }
        if ((4793491 & i17) != 4793490) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i35 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if (i18 != 0) {
                    z16 = false;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    small = m2.f1788a.b(rVarH, 6).getSmall();
                }
                if ((i16 & 16) != 0) {
                    jA = w3.f1983a.a(rVarH, 6);
                    i17 &= -57345;
                }
                if ((i16 & 32) != 0) {
                    jL = m2.f1788a.a(rVarH, 6).l();
                    i17 &= -458753;
                }
                if ((i16 & 64) != 0) {
                    jB = w3.f1983a.b(rVarH, 6);
                    i17 &= -3670017;
                } else {
                    jB = j17;
                }
                if (i25 != 0) {
                    fN = h.n(6);
                } else {
                    fN = f15;
                }
                j26 = jL;
                j27 = jB;
                z19 = z16;
                y2Var3 = small;
                j28 = jA;
            } else {
                if (i35 != 0) {
                    mVar2 = f3.m.INSTANCE;
                }
                if (i18 != 0) {
                    z16 = false;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    small = m2.f1788a.b(rVarH, 6).getSmall();
                }
                if ((i16 & 16) != 0) {
                    jA = w3.f1983a.a(rVarH, 6);
                    i17 &= -57345;
                }
                if ((i16 & 32) != 0) {
                    jL = m2.f1788a.a(rVarH, 6).l();
                    i17 &= -458753;
                }
                if ((i16 & 64) != 0) {
                    jB = w3.f1983a.b(rVarH, 6);
                    i17 &= -3670017;
                } else {
                    jB = j17;
                }
                if (i25 != 0) {
                    fN = h.n(6);
                } else {
                    fN = f15;
                }
                j26 = jL;
                j27 = jB;
                z19 = z16;
                y2Var3 = small;
                j28 = jA;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(258660814, i17, -1, "androidx.compose.material.Snackbar (Snackbar.kt:165)");
            }
            strB = v3Var.b();
            if (strB != null) {
                rVarH.X(593497188);
                v3Var2 = v3Var;
                fVarD = y2.m.d(1843479216, true, new p() { // from class: a2.j4
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return w4.w(j27, v3Var2, strB, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54);
                rVarH.R();
            } else {
                v3Var2 = v3Var;
                rVarH.X(593796152);
                rVarH.R();
                fVarD = null;
            }
            rVar2 = rVarH;
            q(a3.n(mVar2, h.n(12)), fVarD, z19, y2Var3, j28, j26, fN, y2.m.d(-261845785, true, new p() { // from class: a2.m4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w4.z(v3Var2, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVar2, (i17 & 896) | 12582912 | (i17 & 7168) | (57344 & i17) | (458752 & i17) | ((i17 >> 3) & 3670016), 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            j25 = j27;
            mVar3 = mVar2;
            z18 = z19;
            y2Var2 = y2Var3;
            j18 = j28;
            j19 = j26;
            f16 = fN;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            f16 = f15;
            mVar3 = mVar2;
            z18 = z16;
            y2Var2 = small;
            j18 = jA;
            j19 = jL;
            j25 = j17;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a2.n4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w4.A(v3Var, mVar3, z18, y2Var2, j18, j19, j25, f16, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final p pVar, final p pVar2, final boolean z15, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1429068516, i15, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:101)");
            }
            d0.c(l1.c().d(Float.valueOf(j1.f1722a.c(rVar, 6))), y2.m.d(1236486620, true, new p() { // from class: a2.s4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w4.t(pVar, pVar2, z15, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final p pVar, final p pVar2, final boolean z15, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1236486620, i15, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:102)");
            }
            j5.e(m2.f1788a.c(rVar, 6).getBody2(), y2.m.d(1789628237, true, new p() { // from class: a2.t4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w4.u(pVar, pVar2, z15, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(p pVar, p pVar2, boolean z15, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1789628237, i15, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:104)");
            }
            if (pVar == null) {
                rVar.X(1845819398);
                B(pVar2, rVar, 0);
                rVar.R();
            } else if (z15) {
                rVar.X(1845821491);
                m(pVar2, pVar, rVar, 0);
                rVar.R();
            } else {
                rVar.X(1845823628);
                o(pVar2, pVar, rVar, 0);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(f3.m mVar, p pVar, boolean z15, y2 y2Var, long j15, long j16, float f15, p pVar2, int i15, int i16, r rVar, int i17) {
        q(mVar, pVar, z15, y2Var, j15, j16, f15, pVar2, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(long j15, final v3 v3Var, final String str, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1843479216, i15, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:170)");
            }
            r0 r0VarG = s0.f1901a.g(0L, j15, 0L, rVar, 3072, 5);
            boolean zG = rVar.G(v3Var);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: a2.q4
                    @Override // er.a
                    public final Object a() {
                        return w4.x(v3Var);
                    }
                };
                rVar.v(objE);
            }
            Function0.m((er.a) objE, null, false, null, null, null, null, r0VarG, null, y2.m.d(-929149933, true, new q() { // from class: a2.r4
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return w4.y(str, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 805306368, 382);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(v3 v3Var) {
        v3Var.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(String str, p3 p3Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-929149933, i15, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:173)");
            }
            j5.g(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131070);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(v3 v3Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-261845785, i15, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:181)");
            }
            j5.g(v3Var.a(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131070);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }
}
