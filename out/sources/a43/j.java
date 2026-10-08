package a43;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n50.h0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"La43/c;", "viewModel", "Loq/i0;", "m", "(La43/c;Lm2/r;I)V", "La43/c$a$a;", "data", "g", "(La43/c$a$a;Lm2/r;I)V", "La43/c$a;", "state", "sanitary_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void g(final c.a.Content content, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-2328789);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(content) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2328789, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.welcome.WelcomeContent (WelcomeScreen.kt:50)");
            }
            rVar2 = rVarH;
            i50.s.r(content.getBaseScaffoldData(), y2.m.d(109089302, true, new er.p() { // from class: a43.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.h(content, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(988581662, true, new er.q() { // from class: a43.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.i(content, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: a43.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.l(content, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(c.a.Content content, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(109089302, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.welcome.WelcomeContent.<anonymous> (WelcomeScreen.kt:54)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h30.q.p(content.getNextButtonData(), false, null, rVar, 0, 6);
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
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    public static final i0 i(final c.a.Content content, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        ?? r15;
        int i16;
        p076m2.r rVar2 = rVar;
        char c15 = 2;
        int i17 = (i15 & 6) == 0 ? i15 | (rVar2.W(d3Var) ? 4 : 2) : i15;
        boolean z15 = true;
        boolean z16 = false;
        if (rVar2.r((i17 & 19) != 18, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(988581662, i17, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.welcome.WelcomeContent.<anonymous> (WelcomeScreen.kt:61)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            Object obj = null;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar2, 0, 1), rVar2, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            o40.j.i(content.getHeaderData(), rVar2, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
            final c.a.Content.InterfaceC0048a body = content.getBody();
            if (body instanceof c.a.Content.InterfaceC0048a.BodyList) {
                rVar2.X(1140826258);
                List<c.a.Content.InterfaceC0048a.BodyList.Group> listA = ((c.a.Content.InterfaceC0048a.BodyList) body).a();
                char c16 = '\n';
                ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
                for (c.a.Content.InterfaceC0048a.BodyList.Group group : listA) {
                    Label time = group.getTime();
                    k70.a aVar = k70.a.f108864a;
                    int i18 = k70.a.f108865b;
                    ArrayList arrayList2 = arrayList;
                    j70.h.g(null, null, time, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i18).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                    rVar2 = rVar;
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar2, i18).getSpacing200()), rVar2, 0);
                    rVar2.X(1145186779);
                    List<n50.k> listA2 = group.a();
                    ArrayList arrayList3 = new ArrayList(pq.v.y(listA2, 10));
                    Iterator<T> it = listA2.iterator();
                    while (it.hasNext()) {
                        h0.v((n50.k) it.next(), null, rVar2, 0, 2);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
                        arrayList3.add(i0.f148189a);
                    }
                    rVar2.R();
                    arrayList2.add(arrayList3);
                    z16 = false;
                    c15 = 2;
                    arrayList = arrayList2;
                    c16 = '\n';
                    obj = null;
                    z15 = true;
                }
                r15 = z16;
                rVar2.R();
                i16 = 1;
            } else {
                r15 = 0;
                if (!(body instanceof c.a.Content.InterfaceC0048a.Empty)) {
                    rVar2.X(1145176234);
                    rVar2.R();
                    throw new oq.p();
                }
                rVar2.X(1145194732);
                i16 = 1;
                x30.c.c(null, 0.0f, y2.m.d(1050517414, true, new er.p() { // from class: a43.h
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return j.j(body, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
                rVar2.R();
            }
            rVar2.x();
            boolean zG = rVar2.G(content);
            Object objE = rVar2.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: a43.i
                    @Override // er.a
                    public final Object a() {
                        return j.k(content);
                    }
                };
                rVar2.v(objE);
            }
            q0.g(r15, (er.a) objE, rVar2, r15, i16);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.a.Content.InterfaceC0048a interfaceC0048a, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1050517414, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.welcome.WelcomeContent.<anonymous>.<anonymous>.<anonymous> (WelcomeScreen.kt:89)");
            }
            k40.d.c(null, ((c.a.Content.InterfaceC0048a.Empty) interfaceC0048a).getEmptyStateData(), rVar, EmptyStateData.f108236d << 3, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(c.a.Content content) {
        content.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(c.a.Content content, int i15, p076m2.r rVar, int i16) {
        g(content, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1778818385);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1778818385, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.welcome.WelcomeScreen (WelcomeScreen.kt:33)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(cVar.getLifecycleConnector(), rVarH, 0);
            c.a aVarN = n(f6VarC);
            if (aVarN instanceof c.a.C0051c) {
                rVarH.X(47491746);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarN instanceof c.a.Error) {
                rVarH.X(47494233);
                ((c.a.Error) aVarN).getErrorVMSAdapter().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarN instanceof c.a.Content)) {
                    rVarH.X(47489824);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(47495865);
                g((c.a.Content) aVarN, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: a43.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.o(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a n(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(c cVar, int i15, p076m2.r rVar, int i16) {
        m(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
