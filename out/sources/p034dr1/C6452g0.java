package p034dr1;

import androidx.compose.ui.graphics.Color;
import er.p;
import i50.BaseScaffoldData;
import i50.s;
import mx.Label;
import mx.b;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import x50.NavigationButtonData;
import x50.i;

/* JADX INFO: renamed from: dr1.g0, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "back", "c", "(Ler/a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class C6452g0 {

    /* JADX INFO: renamed from: dr1.g0$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f44190a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1381453022);
            if (t.k()) {
                t.o(1381453022, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.topappbar.DeveloperTopAppBarSmallScreen.<anonymous> (DeveloperTopAppBarSmallScreen.kt:35)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public static final void c(final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1444916351);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1444916351, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.topappbar.DeveloperTopAppBarSmallScreen (DeveloperTopAppBarSmallScreen.kt:25)");
            }
            Label labelB = b.b("Small Title", "");
            NavigationButtonData navigationButtonData = new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), aVar);
            x50.a.MenuButtonData.b bVar = x50.a.MenuButtonData.b.f216850f;
            a aVar2 = a.f44190a;
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: dr1.e0
                    @Override // er.a
                    public final Object a() {
                        return C6452g0.d();
                    }
                };
                rVarH.v(objE);
            }
            rVar2 = rVarH;
            s.r(new BaseScaffoldData(BaseScaffoldData.EnumC2111a.EnterAlwaysScroll, new i.Small(navigationButtonData, labelB, null, new x50.a.Icon(new x50.a.MenuButtonData(bVar, aVar2, null, (er.a) objE, 4, null)), null, 20, null), null, null, null, null, 60, null), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, i.f44193a.c(), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: dr1.f0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6452g0.e(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(er.a aVar, int i15, r rVar, int i16) {
        c(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
