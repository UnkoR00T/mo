package p052fr1;

import androidx.compose.ui.graphics.Color;
import b60.WhatsNewData;
import b60.WhatsNewSlideData;
import b60.n;
import er.p;
import h30.ButtonData;
import j30.ButtonTextData;
import java.util.List;
import k30.c;
import k30.d;
import mx.b;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import pq.v;

/* JADX INFO: renamed from: fr1.d, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "d", "(Ler/a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: fr1.d$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f66489a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(882946469);
            if (t.k()) {
                t.o(882946469, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.whatsnew.DeveloperWhatsNewScreen.<anonymous> (DeveloperWhatsNewScreen.kt:51)");
            }
            long jI = Color.INSTANCE.i();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jI;
        }
    }

    public static final void d(er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        final er.a<i0> aVar2;
        r rVarH = rVar.h(-460950469);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-460950469, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.whatsnew.DeveloperWhatsNewScreen (DeveloperWhatsNewScreen.kt:16)");
            }
            List listQ = v.q(new WhatsNewSlideData("https://picsum.photos/800/600.jpg", b.b("Co nowego?", "WhatsNewTitle1"), b.b("Opis pierwszej zmiany w aplikacji.", "WhatsNewDesc1")), new WhatsNewSlideData("https://picsum.photos/800/601.jpg", b.b("Nowa funkcjonalność!", "WhatsNewTitle2"), b.b("Opis drugiej zmiany w aplikacji.", "WhatsNewDesc2")), new WhatsNewSlideData("https://picsum.photos/800/602.jpg", b.b("Gotowe!", "WhatsNewTitle3"), b.b("Opis trzeciej zmiany w aplikacji.", "WhatsNewDesc3")));
            k30.a.b bVar = k30.a.b.f107765a;
            c.WithText withText = new c.WithText(b.b("Dalej", ""), null, 2, null);
            d.a aVar3 = d.a.f107773a;
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = new er.a() { // from class: fr1.a
                    @Override // er.a
                    public final Object a() {
                        return Function0.e();
                    }
                };
                rVarH.v(objE);
            }
            ButtonData buttonData = new ButtonData(null, null, bVar, withText, aVar3, null, (er.a) objE, 35, null);
            ButtonData buttonData2 = new ButtonData(null, null, bVar, new c.WithText(b.b("Zakończ", ""), null, 2, null), aVar3, null, aVar, 35, null);
            c.WithText withText2 = new c.WithText(b.b("Wstecz", ""), null, 2, null);
            d.Secondary secondary = new d.Secondary(a.f66489a);
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new er.a() { // from class: fr1.b
                    @Override // er.a
                    public final Object a() {
                        return Function0.f();
                    }
                };
                rVarH.v(objE2);
            }
            aVar2 = aVar;
            n.r(new WhatsNewData(listQ, buttonData, buttonData2, new ButtonData(null, null, bVar, withText2, secondary, null, (er.a) objE2, 35, null), new ButtonTextData(null, b.b("Pomiń", ""), null, null, aVar, 13, null)), rVarH, WhatsNewData.f16799f);
            if (t.k()) {
                t.n();
            }
        } else {
            aVar2 = aVar;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: fr1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.g(aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(er.a aVar, int i15, r rVar, int i16) {
        d(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
