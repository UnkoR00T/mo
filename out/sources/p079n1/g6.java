package p079n1;

import androidx.compose.ui.platform.g1;
import c5.b;
import c5.d;
import er.q;
import f3.j;
import f3.m;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p036e4.a2;
import p036e4.m0;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;
import q4.c4;
import u4.FontWeight;
import u4.l;
import u4.y;
import u4.z;
import w0.g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lf3/m;", "Lq4/b4;", "style", "i", "(Lf3/m;Lq4/b4;)Lf3/m;", "d", "", "typeface", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g6 {
    public static final m d(m mVar, final TextStyle textStyle) {
        return j.c(mVar, null, new q() { // from class: n1.d6
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g6.e(textStyle, (m) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m e(TextStyle textStyle, m mVar, r rVar, int i15) {
        rVar.X(-390200690);
        if (t.k()) {
            t.o(-390200690, i15, -1, "androidx.compose.foundation.text.legacyTextFieldMinSize.<anonymous> (TextFieldSize.kt:163)");
        }
        d dVar = (d) rVar.N(g1.f());
        l.b bVar = (l.b) rVar.N(g1.h());
        c5.t tVar = (c5.t) rVar.N(g1.l());
        boolean zW = rVar.W(textStyle) | rVar.c(tVar.ordinal());
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = c4.d(textStyle, tVar);
            rVar.v(objE);
        }
        TextStyle textStyle2 = (TextStyle) objE;
        boolean zW2 = rVar.W(bVar) | rVar.W(textStyle2);
        Object objE2 = rVar.E();
        if (zW2 || objE2 == r.INSTANCE.a()) {
            l lVarL = textStyle2.l();
            FontWeight fontWeightQ = textStyle2.q();
            if (fontWeightQ == null) {
                fontWeightQ = FontWeight.INSTANCE.d();
            }
            y yVarO = textStyle2.o();
            int value = yVarO != null ? yVarO.getValue() : y.INSTANCE.b();
            z zVarP = textStyle2.p();
            objE2 = bVar.a(lVarL, fontWeightQ, value, zVarP != null ? zVarP.getValue() : z.INSTANCE.a());
            rVar.v(objE2);
        }
        f6 f6Var = (f6) objE2;
        Object objE3 = rVar.E();
        r.Companion companion = r.INSTANCE;
        if (objE3 == companion.a()) {
            objE3 = new n3(tVar, dVar, bVar, textStyle, f(f6Var));
            rVar.v(objE3);
        }
        final n3 n3Var = (n3) objE3;
        n3Var.c(tVar, dVar, bVar, textStyle2, f(f6Var));
        m.Companion companion2 = m.INSTANCE;
        boolean zG = rVar.G(n3Var);
        Object objE4 = rVar.E();
        if (zG || objE4 == companion.a()) {
            objE4 = new q() { // from class: n1.e6
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return g6.g(n3Var, (y0) obj, (v0) obj2, (b) obj3);
                }
            };
            rVar.v(objE4);
        }
        m mVarA = m0.a(companion2, (q) objE4);
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return mVarA;
    }

    private static final Object f(f6<? extends Object> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 g(n3 n3Var, y0 y0Var, v0 v0Var, b bVar) {
        long minSize = n3Var.getMinSize();
        final a2 a2VarO0 = v0Var.o0(b.d(bVar.getValue(), lr.m.n((int) (minSize >> 32), b.n(bVar.getValue()), b.l(bVar.getValue())), 0, lr.m.n((int) (minSize & BodyPartID.bodyIdMax), b.m(bVar.getValue()), b.k(bVar.getValue())), 0, 10, null));
        return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: n1.f6
            @Override // er.l
            public final Object b(Object obj) {
                return g6.h(a2VarO0, (a2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(a2 a2Var, a2.a aVar) {
        a2.a.I(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    public static final m i(m mVar, TextStyle textStyle) {
        return g0.isBasicTextFieldMinSizeOptimizationEnabled ? mVar.u(new c6(textStyle)) : d(mVar, textStyle);
    }
}
