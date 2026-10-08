package q40;

import d1.a3;
import d1.e0;
import d1.h0;
import d1.r3;
import er.p;
import er.q;
import f3.m;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a[\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"CONTENT_DATA", "BOTTOM_CONTENT", "Lq40/g;", "data", "Lkotlin/Function1;", "Loq/i0;", "content", "bottomContent", "b", "(Lq40/g;Ler/q;Ler/q;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    /* JADX WARN: Code duplicated, block: B:102:0x0480  */
    /* JADX WARN: Code duplicated, block: B:105:0x0486  */
    /* JADX WARN: Code duplicated, block: B:108:0x0491  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x0120  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0130  */
    /* JADX WARN: Code duplicated, block: B:63:0x017e  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x021b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0235  */
    /* JADX WARN: Code duplicated, block: B:79:0x0266  */
    /* JADX WARN: Code duplicated, block: B:80:0x027d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0320  */
    /* JADX WARN: Code duplicated, block: B:85:0x032a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0398  */
    /* JADX WARN: Code duplicated, block: B:90:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:93:0x0410  */
    /* JADX WARN: Code duplicated, block: B:95:0x041a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0444  */
    /* JADX WARN: Code duplicated, block: B:99:0x0450  */
    public static final <CONTENT_DATA, BOTTOM_CONTENT> void b(final IconPageData<CONTENT_DATA, BOTTOM_CONTENT> iconPageData, q<? super CONTENT_DATA, ? super r, ? super Integer, i0> qVar, q<? super BOTTOM_CONTENT, ? super r, ? super Integer, i0> qVar2, r rVar, final int i15, final int i16) {
        int i17;
        q qVar3;
        int i18;
        q qVar4;
        int i19;
        boolean z15;
        final q qVar5;
        final q qVar6;
        d5 d5VarM;
        q qVarE;
        q qVarF;
        m mVar;
        k70.a aVar;
        int i25;
        m mVarR;
        er.a<androidx.compose.ui.node.c> aVarB;
        er.a<androidx.compose.ui.node.c> aVarB2;
        m mVar2;
        b5.j.Companion companion;
        q qVar7;
        q qVar8;
        int i26;
        Label descriptionFirst;
        Label descriptionSecond;
        CONTENT_DATA content_dataB;
        BOTTOM_CONTENT bottom_contentA;
        r rVarH = rVar.h(174957849);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(iconPageData) : rVarH.G(iconPageData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i27 = i16 & 2;
        if (i27 == 0) {
            if ((i15 & 48) == 0) {
                qVar3 = qVar;
                i17 |= rVarH.G(qVar3) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    qVar4 = qVar2;
                    if (rVarH.G(qVar4)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i17 & 147) != 146) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i27 != 0) {
                        qVarE = e.f164658a.e();
                    } else {
                        qVarE = qVar3;
                    }
                    if (i18 != 0) {
                        qVarF = e.f164658a.f();
                    } else {
                        qVarF = qVar4;
                    }
                    if (t.k()) {
                        t.o(174957849, i17, -1, "pl.gov.coi.common.ui.ds.iconpage.IconPage (IconPage.kt:36)");
                    }
                    mVar = m.INSTANCE;
                    m mVarF = androidx.compose.foundation.layout.d.f(mVar, 0.0f, 1, null);
                    aVar = k70.a.f108864a;
                    i25 = k70.a.f108865b;
                    m mVarP = a3.p(w0.i.d(mVarF, aVar.a(rVarH, i25).getBase().a(), null, 2, null), aVar.b(rVarH, i25).getSpacing200(), 0.0f, 2, null);
                    if (iconPageData.a() != null) {
                        rVarH.X(-1920578854);
                        mVarR = a3.r(mVar, 0.0f, 0.0f, 0.0f, aVar.b(rVarH, i25).getSpacing200(), 7, null);
                        rVarH.R();
                    } else {
                        rVarH.X(-1920496053);
                        rVarH.R();
                        mVarR = mVar;
                    }
                    m mVarU = mVarP.u(mVarR);
                    d1.i iVar = d1.i.f39152a;
                    d1.i.n nVarK = iVar.k();
                    f3.c.Companion companion2 = f3.c.INSTANCE;
                    w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
                    int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT = rVarH.t();
                    m mVarE = f3.j.e(rVarH, mVarU);
                    androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion3.b();
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
                    n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                    n6.g(rVarC, companion3.a());
                    n6.i(rVarC, mVarE, companion3.e());
                    m mVarB = h0.b(d1.i0.f39176a, t70.i.S(androidx.compose.foundation.layout.d.h(mVar, 0.0f, 1, null), null, rVarH, 6, 1), 1.0f, false, 2, null);
                    if (iconPageData.a() != null) {
                        rVarH.X(1702059599);
                        m mVarR2 = a3.r(mVar, 0.0f, aVar.b(rVarH, i25).getSpacing100(), 0.0f, 0.0f, 13, null);
                        rVarH.R();
                        mVar = mVarR2;
                    } else {
                        rVarH.X(1702143485);
                        rVarH.R();
                    }
                    m mVarU2 = mVarB.u(mVar);
                    w0 w0VarA2 = e0.a(iVar.e(), companion2.g(), rVarH, 54);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT2 = rVarH.t();
                    m mVarE2 = f3.j.e(rVarH, mVarU2);
                    aVarB2 = companion3.b();
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
                    n6.i(rVarC2, w0VarA2, companion3.d());
                    n6.i(rVarC2, e0VarT2, companion3.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                    n6.g(rVarC2, companion3.a());
                    n6.i(rVarC2, mVarE2, companion3.e());
                    if (iconPageData.b() != null) {
                        rVarH.X(-1263753491);
                        r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing100()), rVarH, 0);
                    } else {
                        rVarH.X(-524167275);
                    }
                    rVarH.R();
                    d40.h.f(null, iconPageData.getIconSection().getIcon(), false, rVarH, 0, 5);
                    r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                    if (iconPageData.getForceTitleFocus()) {
                        rVarH.X(-521386730);
                        m mVarB2 = d60.c.INSTANCE.b(mVar, d60.e.b(true, null, rVarH, 6, 2));
                        rVarH.R();
                        mVar2 = mVarB2;
                    } else {
                        rVarH.X(-521319305);
                        rVarH.R();
                        mVar2 = mVar;
                    }
                    Label title = iconPageData.getTitle();
                    TextStyle textStyleI = aVar.f(rVarH, i25).i();
                    companion = b5.j.INSTANCE;
                    qVar7 = qVarF;
                    qVar8 = qVarE;
                    i26 = i17;
                    j70.h.g(mVar2, null, title, iconPageData.getTitle(), null, aVar.a(rVarH, i25).getNeutral().i(), 0L, null, null, null, 0L, null, b5.j.h(companion.a()), 0L, 0, false, 0, 0, null, textStyleI, null, Float.valueOf(-1.0f), false, false, null, rVarH, 0, 0, 0, 30928850);
                    rVarH = rVarH;
                    descriptionFirst = iconPageData.getDescriptionFirst();
                    if (descriptionFirst == null) {
                        rVarH.X(-520999417);
                    } else {
                        rVarH.X(-520999416);
                        r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                        j70.h.g(null, null, descriptionFirst, null, null, aVar.a(rVarH, i25).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(companion.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i25).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
                        rVarH = rVarH;
                        i0 i0Var = i0.f148189a;
                    }
                    rVarH.R();
                    descriptionSecond = iconPageData.getDescriptionSecond();
                    if (descriptionSecond == null) {
                        rVarH.X(-520637275);
                    } else {
                        rVarH.X(-520637274);
                        r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                        r rVar2 = rVarH;
                        j70.h.g(null, null, descriptionSecond, null, null, aVar.a(rVarH, i25).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(companion.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i25).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33026011);
                        rVarH = rVar2;
                        i0 i0Var2 = i0.f148189a;
                    }
                    rVarH.R();
                    content_dataB = iconPageData.b();
                    if (content_dataB == null) {
                        rVarH.X(-520289393);
                    } else {
                        rVarH.X(-520289392);
                        r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                        qVar8.w(content_dataB, rVarH, Integer.valueOf(i26 & 112));
                        i0 i0Var3 = i0.f148189a;
                    }
                    rVarH.R();
                    rVarH.x();
                    bottom_contentA = iconPageData.a();
                    if (bottom_contentA == null) {
                        rVarH.X(1703863085);
                        rVarH.R();
                        qVar4 = qVar7;
                    } else {
                        rVarH.X(1703863086);
                        r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                        qVar4 = qVar7;
                        qVar4.w(bottom_contentA, rVarH, Integer.valueOf((i26 >> 3) & 112));
                        i0 i0Var4 = i0.f148189a;
                        rVarH.R();
                    }
                    rVarH.x();
                    if (t.k()) {
                        t.n();
                    }
                    qVar5 = qVar8;
                } else {
                    rVarH.O();
                    qVar5 = qVar3;
                }
                qVar6 = qVar4;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: q40.h
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i.c(iconPageData, qVar5, qVar6, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            qVar4 = qVar2;
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i27 != 0) {
                    qVarE = e.f164658a.e();
                } else {
                    qVarE = qVar3;
                }
                if (i18 != 0) {
                    qVarF = e.f164658a.f();
                } else {
                    qVarF = qVar4;
                }
                if (t.k()) {
                    t.o(174957849, i17, -1, "pl.gov.coi.common.ui.ds.iconpage.IconPage (IconPage.kt:36)");
                }
                mVar = m.INSTANCE;
                m mVarF2 = androidx.compose.foundation.layout.d.f(mVar, 0.0f, 1, null);
                aVar = k70.a.f108864a;
                i25 = k70.a.f108865b;
                m mVarP2 = a3.p(w0.i.d(mVarF2, aVar.a(rVarH, i25).getBase().a(), null, 2, null), aVar.b(rVarH, i25).getSpacing200(), 0.0f, 2, null);
                if (iconPageData.a() != null) {
                    rVarH.X(-1920578854);
                    mVarR = a3.r(mVar, 0.0f, 0.0f, 0.0f, aVar.b(rVarH, i25).getSpacing200(), 7, null);
                    rVarH.R();
                } else {
                    rVarH.X(-1920496053);
                    rVarH.R();
                    mVarR = mVar;
                }
                m mVarU3 = mVarP2.u(mVarR);
                d1.i iVar2 = d1.i.f39152a;
                d1.i.n nVarK2 = iVar2.k();
                f3.c.Companion companion4 = f3.c.INSTANCE;
                w0 w0VarA3 = e0.a(nVarK2, companion4.k(), rVarH, 0);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT3 = rVarH.t();
                m mVarE3 = f3.j.e(rVarH, mVarU3);
                androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion5.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC3 = n6.c(rVarH);
                n6.i(rVarC3, w0VarA3, companion5.d());
                n6.i(rVarC3, e0VarT3, companion5.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
                n6.g(rVarC3, companion5.a());
                n6.i(rVarC3, mVarE3, companion5.e());
                m mVarB3 = h0.b(d1.i0.f39176a, t70.i.S(androidx.compose.foundation.layout.d.h(mVar, 0.0f, 1, null), null, rVarH, 6, 1), 1.0f, false, 2, null);
                if (iconPageData.a() != null) {
                    rVarH.X(1702059599);
                    m mVarR3 = a3.r(mVar, 0.0f, aVar.b(rVarH, i25).getSpacing100(), 0.0f, 0.0f, 13, null);
                    rVarH.R();
                    mVar = mVarR3;
                } else {
                    rVarH.X(1702143485);
                    rVarH.R();
                }
                m mVarU4 = mVarB3.u(mVar);
                w0 w0VarA4 = e0.a(iVar2.e(), companion4.g(), rVarH, 54);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT4 = rVarH.t();
                m mVarE4 = f3.j.e(rVarH, mVarU4);
                aVarB2 = companion5.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC4 = n6.c(rVarH);
                n6.i(rVarC4, w0VarA4, companion5.d());
                n6.i(rVarC4, e0VarT4, companion5.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion5.c());
                n6.g(rVarC4, companion5.a());
                n6.i(rVarC4, mVarE4, companion5.e());
                if (iconPageData.b() != null) {
                    rVarH.X(-1263753491);
                    r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing100()), rVarH, 0);
                } else {
                    rVarH.X(-524167275);
                }
                rVarH.R();
                d40.h.f(null, iconPageData.getIconSection().getIcon(), false, rVarH, 0, 5);
                r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                if (iconPageData.getForceTitleFocus()) {
                    rVarH.X(-521386730);
                    m mVarB4 = d60.c.INSTANCE.b(mVar, d60.e.b(true, null, rVarH, 6, 2));
                    rVarH.R();
                    mVar2 = mVarB4;
                } else {
                    rVarH.X(-521319305);
                    rVarH.R();
                    mVar2 = mVar;
                }
                Label title2 = iconPageData.getTitle();
                TextStyle textStyleI2 = aVar.f(rVarH, i25).i();
                companion = b5.j.INSTANCE;
                qVar7 = qVarF;
                qVar8 = qVarE;
                i26 = i17;
                j70.h.g(mVar2, null, title2, iconPageData.getTitle(), null, aVar.a(rVarH, i25).getNeutral().i(), 0L, null, null, null, 0L, null, b5.j.h(companion.a()), 0L, 0, false, 0, 0, null, textStyleI2, null, Float.valueOf(-1.0f), false, false, null, rVarH, 0, 0, 0, 30928850);
                rVarH = rVarH;
                descriptionFirst = iconPageData.getDescriptionFirst();
                if (descriptionFirst == null) {
                    rVarH.X(-520999417);
                } else {
                    rVarH.X(-520999416);
                    r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                    j70.h.g(null, null, descriptionFirst, null, null, aVar.a(rVarH, i25).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(companion.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i25).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
                    rVarH = rVarH;
                    i0 i0Var5 = i0.f148189a;
                }
                rVarH.R();
                descriptionSecond = iconPageData.getDescriptionSecond();
                if (descriptionSecond == null) {
                    rVarH.X(-520637275);
                } else {
                    rVarH.X(-520637274);
                    r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                    r rVar3 = rVarH;
                    j70.h.g(null, null, descriptionSecond, null, null, aVar.a(rVarH, i25).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(companion.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i25).b(), null, null, false, false, null, rVar3, 0, 0, 0, 33026011);
                    rVarH = rVar3;
                    i0 i0Var6 = i0.f148189a;
                }
                rVarH.R();
                content_dataB = iconPageData.b();
                if (content_dataB == null) {
                    rVarH.X(-520289393);
                } else {
                    rVarH.X(-520289392);
                    r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                    qVar8.w(content_dataB, rVarH, Integer.valueOf(i26 & 112));
                    i0 i0Var7 = i0.f148189a;
                }
                rVarH.R();
                rVarH.x();
                bottom_contentA = iconPageData.a();
                if (bottom_contentA == null) {
                    rVarH.X(1703863085);
                    rVarH.R();
                    qVar4 = qVar7;
                } else {
                    rVarH.X(1703863086);
                    r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                    qVar4 = qVar7;
                    qVar4.w(bottom_contentA, rVarH, Integer.valueOf((i26 >> 3) & 112));
                    i0 i0Var8 = i0.f148189a;
                    rVarH.R();
                }
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                qVar5 = qVar8;
            } else {
                rVarH.O();
                qVar5 = qVar3;
            }
            qVar6 = qVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: q40.h
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.c(iconPageData, qVar5, qVar6, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        qVar3 = qVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                qVar4 = qVar2;
                if (rVarH.G(qVar4)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i27 != 0) {
                    qVarE = e.f164658a.e();
                } else {
                    qVarE = qVar3;
                }
                if (i18 != 0) {
                    qVarF = e.f164658a.f();
                } else {
                    qVarF = qVar4;
                }
                if (t.k()) {
                    t.o(174957849, i17, -1, "pl.gov.coi.common.ui.ds.iconpage.IconPage (IconPage.kt:36)");
                }
                mVar = m.INSTANCE;
                m mVarF3 = androidx.compose.foundation.layout.d.f(mVar, 0.0f, 1, null);
                aVar = k70.a.f108864a;
                i25 = k70.a.f108865b;
                m mVarP3 = a3.p(w0.i.d(mVarF3, aVar.a(rVarH, i25).getBase().a(), null, 2, null), aVar.b(rVarH, i25).getSpacing200(), 0.0f, 2, null);
                if (iconPageData.a() != null) {
                    rVarH.X(-1920578854);
                    mVarR = a3.r(mVar, 0.0f, 0.0f, 0.0f, aVar.b(rVarH, i25).getSpacing200(), 7, null);
                    rVarH.R();
                } else {
                    rVarH.X(-1920496053);
                    rVarH.R();
                    mVarR = mVar;
                }
                m mVarU5 = mVarP3.u(mVarR);
                d1.i iVar3 = d1.i.f39152a;
                d1.i.n nVarK3 = iVar3.k();
                f3.c.Companion companion6 = f3.c.INSTANCE;
                w0 w0VarA5 = e0.a(nVarK3, companion6.k(), rVarH, 0);
                int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT5 = rVarH.t();
                m mVarE5 = f3.j.e(rVarH, mVarU5);
                androidx.compose.ui.node.c.Companion companion7 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion7.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC5 = n6.c(rVarH);
                n6.i(rVarC5, w0VarA5, companion7.d());
                n6.i(rVarC5, e0VarT5, companion7.f());
                n6.i(rVarC5, Integer.valueOf(iHashCode5), companion7.c());
                n6.g(rVarC5, companion7.a());
                n6.i(rVarC5, mVarE5, companion7.e());
                m mVarB5 = h0.b(d1.i0.f39176a, t70.i.S(androidx.compose.foundation.layout.d.h(mVar, 0.0f, 1, null), null, rVarH, 6, 1), 1.0f, false, 2, null);
                if (iconPageData.a() != null) {
                    rVarH.X(1702059599);
                    m mVarR4 = a3.r(mVar, 0.0f, aVar.b(rVarH, i25).getSpacing100(), 0.0f, 0.0f, 13, null);
                    rVarH.R();
                    mVar = mVarR4;
                } else {
                    rVarH.X(1702143485);
                    rVarH.R();
                }
                m mVarU6 = mVarB5.u(mVar);
                w0 w0VarA6 = e0.a(iVar3.e(), companion6.g(), rVarH, 54);
                int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT6 = rVarH.t();
                m mVarE6 = f3.j.e(rVarH, mVarU6);
                aVarB2 = companion7.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC6 = n6.c(rVarH);
                n6.i(rVarC6, w0VarA6, companion7.d());
                n6.i(rVarC6, e0VarT6, companion7.f());
                n6.i(rVarC6, Integer.valueOf(iHashCode6), companion7.c());
                n6.g(rVarC6, companion7.a());
                n6.i(rVarC6, mVarE6, companion7.e());
                if (iconPageData.b() != null) {
                    rVarH.X(-1263753491);
                    r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing100()), rVarH, 0);
                } else {
                    rVarH.X(-524167275);
                }
                rVarH.R();
                d40.h.f(null, iconPageData.getIconSection().getIcon(), false, rVarH, 0, 5);
                r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                if (iconPageData.getForceTitleFocus()) {
                    rVarH.X(-521386730);
                    m mVarB6 = d60.c.INSTANCE.b(mVar, d60.e.b(true, null, rVarH, 6, 2));
                    rVarH.R();
                    mVar2 = mVarB6;
                } else {
                    rVarH.X(-521319305);
                    rVarH.R();
                    mVar2 = mVar;
                }
                Label title3 = iconPageData.getTitle();
                TextStyle textStyleI3 = aVar.f(rVarH, i25).i();
                companion = b5.j.INSTANCE;
                qVar7 = qVarF;
                qVar8 = qVarE;
                i26 = i17;
                j70.h.g(mVar2, null, title3, iconPageData.getTitle(), null, aVar.a(rVarH, i25).getNeutral().i(), 0L, null, null, null, 0L, null, b5.j.h(companion.a()), 0L, 0, false, 0, 0, null, textStyleI3, null, Float.valueOf(-1.0f), false, false, null, rVarH, 0, 0, 0, 30928850);
                rVarH = rVarH;
                descriptionFirst = iconPageData.getDescriptionFirst();
                if (descriptionFirst == null) {
                    rVarH.X(-520999417);
                } else {
                    rVarH.X(-520999416);
                    r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                    j70.h.g(null, null, descriptionFirst, null, null, aVar.a(rVarH, i25).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(companion.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i25).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
                    rVarH = rVarH;
                    i0 i0Var9 = i0.f148189a;
                }
                rVarH.R();
                descriptionSecond = iconPageData.getDescriptionSecond();
                if (descriptionSecond == null) {
                    rVarH.X(-520637275);
                } else {
                    rVarH.X(-520637274);
                    r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                    r rVar4 = rVarH;
                    j70.h.g(null, null, descriptionSecond, null, null, aVar.a(rVarH, i25).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(companion.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i25).b(), null, null, false, false, null, rVar4, 0, 0, 0, 33026011);
                    rVarH = rVar4;
                    i0 i0Var10 = i0.f148189a;
                }
                rVarH.R();
                content_dataB = iconPageData.b();
                if (content_dataB == null) {
                    rVarH.X(-520289393);
                } else {
                    rVarH.X(-520289392);
                    r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                    qVar8.w(content_dataB, rVarH, Integer.valueOf(i26 & 112));
                    i0 i0Var11 = i0.f148189a;
                }
                rVarH.R();
                rVarH.x();
                bottom_contentA = iconPageData.a();
                if (bottom_contentA == null) {
                    rVarH.X(1703863085);
                    rVarH.R();
                    qVar4 = qVar7;
                } else {
                    rVarH.X(1703863086);
                    r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                    qVar4 = qVar7;
                    qVar4.w(bottom_contentA, rVarH, Integer.valueOf((i26 >> 3) & 112));
                    i0 i0Var12 = i0.f148189a;
                    rVarH.R();
                }
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                qVar5 = qVar8;
            } else {
                rVarH.O();
                qVar5 = qVar3;
            }
            qVar6 = qVar4;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: q40.h
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i.c(iconPageData, qVar5, qVar6, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        qVar4 = qVar2;
        if ((i17 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i27 != 0) {
                qVarE = e.f164658a.e();
            } else {
                qVarE = qVar3;
            }
            if (i18 != 0) {
                qVarF = e.f164658a.f();
            } else {
                qVarF = qVar4;
            }
            if (t.k()) {
                t.o(174957849, i17, -1, "pl.gov.coi.common.ui.ds.iconpage.IconPage (IconPage.kt:36)");
            }
            mVar = m.INSTANCE;
            m mVarF4 = androidx.compose.foundation.layout.d.f(mVar, 0.0f, 1, null);
            aVar = k70.a.f108864a;
            i25 = k70.a.f108865b;
            m mVarP4 = a3.p(w0.i.d(mVarF4, aVar.a(rVarH, i25).getBase().a(), null, 2, null), aVar.b(rVarH, i25).getSpacing200(), 0.0f, 2, null);
            if (iconPageData.a() != null) {
                rVarH.X(-1920578854);
                mVarR = a3.r(mVar, 0.0f, 0.0f, 0.0f, aVar.b(rVarH, i25).getSpacing200(), 7, null);
                rVarH.R();
            } else {
                rVarH.X(-1920496053);
                rVarH.R();
                mVarR = mVar;
            }
            m mVarU7 = mVarP4.u(mVarR);
            d1.i iVar4 = d1.i.f39152a;
            d1.i.n nVarK4 = iVar4.k();
            f3.c.Companion companion8 = f3.c.INSTANCE;
            w0 w0VarA7 = e0.a(nVarK4, companion8.k(), rVarH, 0);
            int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT7 = rVarH.t();
            m mVarE7 = f3.j.e(rVarH, mVarU7);
            androidx.compose.ui.node.c.Companion companion9 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion9.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC7 = n6.c(rVarH);
            n6.i(rVarC7, w0VarA7, companion9.d());
            n6.i(rVarC7, e0VarT7, companion9.f());
            n6.i(rVarC7, Integer.valueOf(iHashCode7), companion9.c());
            n6.g(rVarC7, companion9.a());
            n6.i(rVarC7, mVarE7, companion9.e());
            m mVarB7 = h0.b(d1.i0.f39176a, t70.i.S(androidx.compose.foundation.layout.d.h(mVar, 0.0f, 1, null), null, rVarH, 6, 1), 1.0f, false, 2, null);
            if (iconPageData.a() != null) {
                rVarH.X(1702059599);
                m mVarR5 = a3.r(mVar, 0.0f, aVar.b(rVarH, i25).getSpacing100(), 0.0f, 0.0f, 13, null);
                rVarH.R();
                mVar = mVarR5;
            } else {
                rVarH.X(1702143485);
                rVarH.R();
            }
            m mVarU8 = mVarB7.u(mVar);
            w0 w0VarA8 = e0.a(iVar4.e(), companion8.g(), rVarH, 54);
            int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT8 = rVarH.t();
            m mVarE8 = f3.j.e(rVarH, mVarU8);
            aVarB2 = companion9.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC8 = n6.c(rVarH);
            n6.i(rVarC8, w0VarA8, companion9.d());
            n6.i(rVarC8, e0VarT8, companion9.f());
            n6.i(rVarC8, Integer.valueOf(iHashCode8), companion9.c());
            n6.g(rVarC8, companion9.a());
            n6.i(rVarC8, mVarE8, companion9.e());
            if (iconPageData.b() != null) {
                rVarH.X(-1263753491);
                r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing100()), rVarH, 0);
            } else {
                rVarH.X(-524167275);
            }
            rVarH.R();
            d40.h.f(null, iconPageData.getIconSection().getIcon(), false, rVarH, 0, 5);
            r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
            if (iconPageData.getForceTitleFocus()) {
                rVarH.X(-521386730);
                m mVarB8 = d60.c.INSTANCE.b(mVar, d60.e.b(true, null, rVarH, 6, 2));
                rVarH.R();
                mVar2 = mVarB8;
            } else {
                rVarH.X(-521319305);
                rVarH.R();
                mVar2 = mVar;
            }
            Label title4 = iconPageData.getTitle();
            TextStyle textStyleI4 = aVar.f(rVarH, i25).i();
            companion = b5.j.INSTANCE;
            qVar7 = qVarF;
            qVar8 = qVarE;
            i26 = i17;
            j70.h.g(mVar2, null, title4, iconPageData.getTitle(), null, aVar.a(rVarH, i25).getNeutral().i(), 0L, null, null, null, 0L, null, b5.j.h(companion.a()), 0L, 0, false, 0, 0, null, textStyleI4, null, Float.valueOf(-1.0f), false, false, null, rVarH, 0, 0, 0, 30928850);
            rVarH = rVarH;
            descriptionFirst = iconPageData.getDescriptionFirst();
            if (descriptionFirst == null) {
                rVarH.X(-520999417);
            } else {
                rVarH.X(-520999416);
                r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                j70.h.g(null, null, descriptionFirst, null, null, aVar.a(rVarH, i25).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(companion.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i25).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
                rVarH = rVarH;
                i0 i0Var13 = i0.f148189a;
            }
            rVarH.R();
            descriptionSecond = iconPageData.getDescriptionSecond();
            if (descriptionSecond == null) {
                rVarH.X(-520637275);
            } else {
                rVarH.X(-520637274);
                r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                r rVar5 = rVarH;
                j70.h.g(null, null, descriptionSecond, null, null, aVar.a(rVarH, i25).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(companion.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i25).b(), null, null, false, false, null, rVar5, 0, 0, 0, 33026011);
                rVarH = rVar5;
                i0 i0Var14 = i0.f148189a;
            }
            rVarH.R();
            content_dataB = iconPageData.b();
            if (content_dataB == null) {
                rVarH.X(-520289393);
            } else {
                rVarH.X(-520289392);
                r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                qVar8.w(content_dataB, rVarH, Integer.valueOf(i26 & 112));
                i0 i0Var15 = i0.f148189a;
            }
            rVarH.R();
            rVarH.x();
            bottom_contentA = iconPageData.a();
            if (bottom_contentA == null) {
                rVarH.X(1703863085);
                rVarH.R();
                qVar4 = qVar7;
            } else {
                rVarH.X(1703863086);
                r3.a(androidx.compose.foundation.layout.d.i(mVar, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                qVar4 = qVar7;
                qVar4.w(bottom_contentA, rVarH, Integer.valueOf((i26 >> 3) & 112));
                i0 i0Var16 = i0.f148189a;
                rVarH.R();
            }
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            qVar5 = qVar8;
        } else {
            rVarH.O();
            qVar5 = qVar3;
        }
        qVar6 = qVar4;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: q40.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.c(iconPageData, qVar5, qVar6, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(IconPageData iconPageData, q qVar, q qVar2, int i15, int i16, r rVar, int i17) {
        b(iconPageData, qVar, qVar2, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
