package p128wp1;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.e0;
import d1.i;
import d1.r3;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import i30.ButtonIconData;
import j70.h;
import mx.b;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p70.n;

/* JADX INFO: renamed from: wp1.d, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "b", "(Ler/a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: wp1.d$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f214293a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-789543423);
            if (t.k()) {
                t.o(-789543423, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.contentbox.DeveloperContentBoxScreen.<anonymous>.<anonymous> (DeveloperContentBoxScreen.kt:31)");
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
        r rVarH = rVar.h(-1030166566);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1030166566, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.contentbox.DeveloperContentBoxScreen (DeveloperContentBoxScreen.kt:25)");
            }
            m.Companion companion = m.INSTANCE;
            i iVar = i.f39152a;
            i.n nVarK = iVar.k();
            c.Companion companion2 = c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion);
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
            n.g(null, null, b.b("ContentBox (1.1.0)", ""), null, null, 0L, null, new ButtonIconData(null, jz.a.U, a.f214293a, null, c70.a.f23835a.a().R(), aVar, 9, null), rVarH, ButtonIconData.f88935g << 21, 123);
            c.b bVarK = companion2.k();
            m mVarF = d.f(companion, 0.0f, 1, null);
            k70.a aVar3 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarS = t70.i.S(a3.n(w0.i.d(mVarF, aVar3.a(rVarH, i17).getBase().a(), null, 2, null), aVar3.b(rVarH, i17).getSpacing300()), null, rVarH, 0, 1);
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
            rVar2 = rVarH;
            h.g(null, null, b.b("ContentBox", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).q(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            h.g(null, null, b.b("Contentbox służy do grupowania i prezentacji treści w ramach elastycznego kontenera. Stanowi podstawowy element do budowania innych komponentów.", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing200()), rVarH, 0);
            h.g(null, null, b.b("Przykład", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar3.b(rVarH, i17).getSpacing200()), rVarH, 0);
            x30.c.c(null, 0.0f, b.f214289a.b(), rVar2, MLKEMEngine.KyberPolyBytes, 3);
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
            d5VarM.a(new p() { // from class: wp1.c
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
