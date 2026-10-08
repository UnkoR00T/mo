package p043er1;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.e0;
import d1.r3;
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
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p70.n;
import q4.TextStyle;
import t70.i;
import u4.FontWeight;

/* JADX INFO: renamed from: er1.b, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "b", "(Ler/a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: er1.b$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f52949a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1987458620);
            if (t.k()) {
                t.o(-1987458620, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.typography.DeveloperTypographyScreen.<anonymous>.<anonymous> (DeveloperTypographyScreen.kt:35)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public static final void b(er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        final er.a<i0> aVar2;
        r rVar2;
        r rVarH = rVar.h(2066885533);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(2066885533, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.typography.DeveloperTypographyScreen (DeveloperTypographyScreen.kt:24)");
            }
            m.Companion companion = m.INSTANCE;
            m mVarF = d.f(companion, 0.0f, 1, null);
            k70.a aVar3 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarS = i.S(w0.i.d(mVarF, aVar3.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().e(), null, 2, null), null, rVarH, 0, 1);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            c.Companion companion2 = c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarS);
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
            aVar2 = aVar;
            n.g(null, null, b.b("TypographyScreen 1.1.0", ""), null, null, 0L, null, new ButtonIconData(null, jz.a.U, a.f52949a, null, c70.a.f23835a.a().R(), aVar, 9, null), rVarH, ButtonIconData.f88935g << 21, 123);
            m mVarR = a3.r(companion, aVar3.b(rVarH, i17).getSpacing200(), 0.0f, aVar3.b(rVarH, i17).getSpacing200(), 0.0f, 10, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarR);
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
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing300()), rVarH, 0);
            Label labelB = b.b("headlineLargeRegular 28dp / 36dp", "");
            TextStyle textStyleL = aVar3.f(rVarH, i17).l();
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            h.g(d.h(companion, 0.0f, 1, null), null, labelB, null, null, aVar3.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, companion4.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleL, null, null, false, false, null, rVarH, 100663302, 0, 0, 33029850);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            vb.h(null, 0.0f, 0L, rVarH, 0, 7);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            h.g(d.h(companion, 0.0f, 1, null), null, b.b("headlineLargeMedium 28dp / 36dp", ""), null, null, aVar3.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, companion4.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).k(), null, null, false, false, null, rVarH, 100663302, 0, 0, 33029850);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            vb.h(null, 0.0f, 0L, rVarH, 0, 7);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            h.g(d.h(companion, 0.0f, 1, null), null, b.b("headlineRegular 24dp / 32dp", ""), null, null, aVar3.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, companion4.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).n(), null, null, false, false, null, rVarH, 100663302, 0, 0, 33029850);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            vb.h(null, 0.0f, 0L, rVarH, 0, 7);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            h.g(d.h(companion, 0.0f, 1, null), null, b.b("headlineMedium 24dp / 32dp", ""), null, null, aVar3.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, companion4.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).m(), null, null, false, false, null, rVarH, 100663302, 0, 0, 33029850);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            vb.h(null, 0.0f, 0L, rVarH, 0, 7);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            h.g(d.h(companion, 0.0f, 1, null), null, b.b("titleMedium 20dp / 28dp", ""), null, null, aVar3.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, companion4.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 100663302, 0, 0, 33029850);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            vb.h(null, 0.0f, 0L, rVarH, 0, 7);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            h.g(d.h(companion, 0.0f, 1, null), null, b.b("headerTertiary 18dp / 24dp", ""), null, null, aVar3.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, companion4.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 100663302, 0, 0, 33029850);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            vb.h(null, 0.0f, 0L, rVarH, 0, 7);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            h.g(d.h(companion, 0.0f, 1, null), null, b.b("bodyLargeMedium 16dp / 24dp", ""), null, null, aVar3.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, companion4.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).a(), null, null, false, false, null, rVarH, 100663302, 0, 0, 33029850);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            vb.h(null, 0.0f, 0L, rVarH, 0, 7);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            h.g(d.h(companion, 0.0f, 1, null), null, b.b("bodyMediumMedium 14dp / 20dp", ""), null, null, aVar3.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, companion4.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).c(), null, null, false, false, null, rVarH, 100663302, 0, 0, 33029850);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            vb.h(null, 0.0f, 0L, rVarH, 0, 7);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            h.g(d.h(companion, 0.0f, 1, null), null, b.b("bodySmallMedium 12dp / 16dp", ""), null, null, aVar3.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, companion4.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).e(), null, null, false, false, null, rVarH, 100663302, 0, 0, 33029850);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            vb.h(null, 0.0f, 0L, rVarH, 0, 7);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            h.g(d.h(companion, 0.0f, 1, null), null, b.b("bodyLargeRegular 16dp / 24dp", ""), null, null, aVar3.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, companion4.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 100663302, 0, 0, 33029850);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            vb.h(null, 0.0f, 0L, rVarH, 0, 7);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            h.g(d.h(companion, 0.0f, 1, null), null, b.b("bodyMediumRegular 14dp / 20dp", ""), null, null, aVar3.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, companion4.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 100663302, 0, 0, 33029850);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing150()), rVarH, 0);
            rVar2 = rVarH;
            vb.h(null, 0.0f, 0L, rVar2, 0, 7);
            r3.a(d.i(companion, aVar3.b(rVar2, i17).getSpacing150()), rVar2, 0);
            h.g(d.h(companion, 0.0f, 1, null), null, b.b("bodySmallRegular 12dp / 16dp", ""), null, null, aVar3.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, companion4.d(), null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i17).f(), null, null, false, false, null, rVarH, 100663302, 0, 0, 33029850);
            r3.a(d.i(companion, aVar3.b(rVar2, i17).getSpacing150()), rVar2, 0);
            vb.h(null, 0.0f, 0L, rVar2, 0, 7);
            r3.a(d.i(companion, aVar3.b(rVar2, i17).getSpacing150()), rVar2, 0);
            rVar2.x();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            aVar2 = aVar;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: er1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.c(aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(er.a aVar, int i15, r rVar, int i16) {
        b(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
