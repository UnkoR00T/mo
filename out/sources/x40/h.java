package x40;

import androidx.compose.ui.graphics.Color;
import b1.k;
import b1.l;
import b5.TextGeometricTransform;
import b5.j;
import c5.w;
import f3.m;
import mx.Label;
import n3.Shadow;
import n4.f0;
import n4.i0;
import n4.v;
import oq.p;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import q4.SpanStyle;
import q4.TextStyle;
import q4.j0;
import q4.n;
import q4.u3;
import t70.s;
import u4.y;
import u4.z;
import w0.r1;
import x4.LocaleList;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lx40/a;", "data", "Loq/i0;", "g", "(Lx40/a;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f216752a;

        static {
            int[] iArr = new int[LinkData.EnumC5775a.values().length];
            try {
                iArr[LinkData.EnumC5775a.WEBSITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkData.EnumC5775a.E_MAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkData.EnumC5775a.EXTERNAL_APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f216752a = iArr;
        }
    }

    public static final void g(final LinkData linkData, r rVar, final int i15) {
        int i16;
        r rVar2;
        Label labelA;
        r rVarH = rVar.h(1829336597);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(linkData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1829336597, i16, -1, "pl.gov.coi.common.ui.ds.link.Link (Link.kt:35)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = s.I();
                rVarH.v(objE);
            }
            final cx.a aVar = (cx.a) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = k.a();
                rVarH.v(objE2);
            }
            l lVar = (l) objE2;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            int i17 = i16;
            String testTag = linkData.getTestTag();
            m.Companion companion2 = m.INSTANCE;
            int i18 = i17 & 14;
            boolean z15 = i18 == 4;
            Object objE3 = rVarH.E();
            if (z15 || objE3 == companion.a()) {
                objE3 = new er.l() { // from class: x40.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.h(linkData, (i0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            m mVarD = v.d(companion2, false, (er.l) objE3, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            m mVarA = k3.f.a(s.w(mVarD, f6VarA, aVar2.b(rVarH, i19).getSpacing25(), 0.0f, 4, null), aVar2.e(rVarH, i19).getRadius50());
            boolean enabled = linkData.getEnabled();
            r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
            boolean zG = rVarH.G(aVar) | (i18 == 4);
            Object objE4 = rVarH.E();
            if (zG || objE4 == companion.a()) {
                objE4 = new er.a() { // from class: x40.c
                    @Override // er.a
                    public final Object a() {
                        return h.i(aVar, linkData);
                    }
                };
                rVarH.v(objE4);
            }
            m mVarL = androidx.compose.foundation.b.l(mVarA, lVar, r1VarE, enabled, null, null, (er.a) objE4, 24, null);
            int i25 = a.f216752a[linkData.getLinkType().ordinal()];
            if (i25 == 1) {
                labelA = c70.a.f23835a.a().a();
            } else if (i25 == 2) {
                labelA = c70.a.f23835a.a().G();
            } else {
                if (i25 != 3) {
                    throw new p();
                }
                labelA = c70.a.f23835a.a().Q();
            }
            Label labelN = labelA.n("linkLabel");
            int iF = j.INSTANCE.f();
            Label label = linkData.getLabel();
            rVarH.X(1350885894);
            q4.e.b bVar = new q4.e.b(0, 1, null);
            if (linkData.getEnabled()) {
                rVarH.X(-254571503);
                String url = linkData.getUrl();
                rVarH.X(1100170211);
                TextStyle textStyleC = aVar2.f(rVarH, i19).c();
                u4.l lVarL = textStyleC.l();
                SpanStyle spanStyle = new SpanStyle(aVar2.a(rVarH, i19).getBase().getPrimary(), textStyleC.n(), textStyleC.q(), (y) null, (z) null, lVarL, (String) null, w.d(0), (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (b5.k) null, (Shadow) null, (j0) null, (p3.g) null, 65368, (fr.k) null);
                rVarH.R();
                rVarH.X(1100181809);
                TextStyle textStyleC2 = aVar2.f(rVarH, i19).c();
                u4.l lVarL2 = textStyleC2.l();
                SpanStyle spanStyle2 = new SpanStyle(l70.b.a(aVar2.a(rVarH, i19).getBase().getPrimary()), textStyleC2.n(), textStyleC2.q(), (y) null, (z) null, lVarL2, (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, Color.m9copywmQWz5c$default(aVar2.a(rVarH, i19).getNeutral().i(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), b5.k.INSTANCE.d(), (Shadow) null, (j0) null, (p3.g) null, 59352, (fr.k) null);
                rVarH.R();
                u3 u3Var = new u3(spanStyle, spanStyle2, null, null, 12, null);
                boolean zG2 = rVarH.G(aVar) | (i18 == 4);
                Object objE5 = rVarH.E();
                if (zG2 || objE5 == companion.a()) {
                    objE5 = new n() { // from class: x40.d
                        @Override // q4.n
                        public final void a(q4.m mVar) {
                            h.k(aVar, linkData, mVar);
                        }
                    };
                    rVarH.v(objE5);
                }
                int iM = bVar.m(new q4.m.b(url, u3Var, (n) objE5));
                try {
                    bVar.f(linkData.getLabel().getText());
                    oq.i0 i0Var = oq.i0.f148189a;
                    bVar.l(iM);
                    rVarH.R();
                } catch (Throwable th4) {
                    bVar.l(iM);
                    throw th4;
                }
            } else {
                rVarH.X(-253433245);
                TextStyle textStyleC3 = aVar2.f(rVarH, i19).c();
                int iO = bVar.o(new SpanStyle(aVar2.a(rVarH, i19).getNeutral().d(), textStyleC3.n(), textStyleC3.q(), (y) null, (z) null, textStyleC3.l(), (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (b5.k) null, (Shadow) null, (j0) null, (p3.g) null, 65496, (fr.k) null));
                try {
                    bVar.f(linkData.getLabel().getText());
                    oq.i0 i0Var2 = oq.i0.f148189a;
                    bVar.l(iO);
                    rVarH.R();
                } catch (Throwable th5) {
                    bVar.l(iO);
                    throw th5;
                }
            }
            q4.e eVarP = bVar.p();
            rVarH.R();
            rVar2 = rVarH;
            j70.h.g(mVarL, testTag, label, labelN, eVarP, 0L, 0L, null, null, null, 0L, b5.k.INSTANCE.d(), j.h(iF), 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar2, 0, 48, MLKEMEngine.KyberPolyBytes, 29353952);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: x40.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.m(linkData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(LinkData linkData, i0 i0Var) {
        if (!linkData.getEnabled()) {
            f0.j(i0Var);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(cx.a aVar, final LinkData linkData) {
        cx.a.a(aVar, 0L, new er.a() { // from class: x40.g
            @Override // er.a
            public final Object a() {
                return h.j(linkData);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(LinkData linkData) {
        linkData.d().b(linkData.getUrl());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(cx.a aVar, final LinkData linkData, q4.m mVar) {
        cx.a.a(aVar, 0L, new er.a() { // from class: x40.f
            @Override // er.a
            public final Object a() {
                return h.l(linkData);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(LinkData linkData) {
        linkData.d().b(linkData.getUrl());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(LinkData linkData, int i15, r rVar, int i16) {
        g(linkData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
