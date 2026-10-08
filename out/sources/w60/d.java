package w60;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import d60.e;
import er.l;
import er.p;
import er.q;
import f3.j;
import i50.BaseScaffoldData;
import i50.s;
import java.io.IOException;
import n4.v;
import oq.i0;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.i;
import u50.v0;
import w0.q0;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lx60/d;", "pinInputScreenData", "Loq/i0;", "d", "(Lx60/d;Lm2/r;I)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final void d(final x60.d dVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(731509430);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(731509430, i16, -1, "pl.gov.coi.common.ui.pinInputScreenData.PinInputScreen (PinInputScreen.kt:42)");
            }
            Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = Boolean.valueOf(i.u(context).b());
                rVarH.v(objE);
            }
            final boolean zBooleanValue = ((Boolean) objE).booleanValue();
            rVar2 = rVarH;
            s.r(dVar.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, m.d(-453422301, true, new q() { // from class: w60.a
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d.e(dVar, zBooleanValue, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: w60.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.g(dVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(x60.d dVar, boolean z15, d3 d3Var, r rVar, int i15) throws XmlPullParserException, IOException {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-453422301, i15, -1, "pl.gov.coi.common.ui.pinInputScreenData.PinInputScreen.<anonymous> (PinInputScreen.kt:48)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(i.S(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarN);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            o40.j.i(dVar.getHeaderData(), rVar, 0);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing300()), rVar, 0);
            v0.g(dVar.getPinInputData(), e.b(dVar.getShouldFocusWithKeyboard() && !z15, null, rVar, 0, 2), rVar, v50.c.Pin.N, 0);
            f3.m mVarC = q0.c(androidx.compose.foundation.layout.d.t(companion, aVar.b(rVar, i16).getStrokeWidth()), true, null, 2, null);
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: w60.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d.f((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            d1.r.b(v.d(mVarC, false, (l) objE, 1, null), rVar, 0);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(n4.i0 i0Var) {
        i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(x60.d dVar, int i15, r rVar, int i16) {
        d(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
