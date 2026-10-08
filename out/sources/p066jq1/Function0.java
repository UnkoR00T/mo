package p066jq1;

import android.content.Context;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.a3;
import d1.e0;
import d1.r3;
import er.l;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import i30.ButtonIconData;
import j70.h;
import mx.Label;
import mx.b;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p70.n;
import t70.s;
import w0.i;
import x40.LinkData;

/* JADX INFO: renamed from: jq1.d, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "d", "(Ler/a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: jq1.d$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f104367a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1291616455);
            if (t.k()) {
                t.o(-1291616455, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.link.DeveloperLinkScreen.<anonymous>.<anonymous> (DeveloperLinkScreen.kt:33)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public static final void d(final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1639044434);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1639044434, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.link.DeveloperLinkScreen (DeveloperLinkScreen.kt:26)");
            }
            final Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            m.Companion companion = m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarD = i.d(companion, aVar2.a(rVarH, i17).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            c.Companion companion2 = c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarD);
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
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            n.g(null, null, b.b("Link 1.1.0", ""), null, null, 0L, null, new ButtonIconData(null, jz.a.U, a.f104367a, null, c70.a.f23835a.a().R(), aVar, 9, null), rVarH, ButtonIconData.f88935g << 21, 123);
            c.b bVarK = companion2.k();
            m mVarS = t70.i.S(a3.p(d.f(companion, 0.0f, 1, null), aVar2.b(rVarH, i17).getSpacing200(), 0.0f, 2, null), null, rVarH, 0, 1);
            w0 w0VarA2 = e0.a(iVar.k(), bVarK, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarS);
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
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            h.g(null, null, b.b("Link - Enabled", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            Label labelB = b.b(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.L, "");
            LinkData.EnumC5775a enumC5775a = LinkData.EnumC5775a.WEBSITE;
            boolean zG = rVarH.G(context);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: jq1.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.e(context, (String) obj);
                    }
                };
                rVarH.v(objE);
            }
            LinkData linkData = new LinkData(null, labelB, "https://exampleUrl.pl", enumC5775a, false, (l) objE, 17, null);
            int i18 = LinkData.f216731g;
            x40.h.g(linkData, rVarH, i18);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            h.g(null, null, b.b("Link - Disabled", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            Label labelB2 = b.b(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.L, "");
            LinkData.EnumC5775a enumC5775a2 = LinkData.EnumC5775a.E_MAIL;
            boolean zG2 = rVarH.G(context);
            Object objE2 = rVarH.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new l() { // from class: jq1.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.f(context, (String) obj);
                    }
                };
                rVarH.v(objE2);
            }
            x40.h.g(new LinkData(null, labelB2, "test@example.pl", enumC5775a2, false, (l) objE2, 1, null), rVarH, i18);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: jq1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.g(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(Context context, String str) {
        s.M(context, "Click -> " + str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Context context, String str) {
        s.M(context, "Click -> " + str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(er.a aVar, int i15, r rVar, int i16) {
        d(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
