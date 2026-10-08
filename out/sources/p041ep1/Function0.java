package p041ep1;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import v50.c;
import w60.d;
import x50.NavigationButtonData;
import x50.i;
import x60.BasicPinInputScreenData;

/* JADX INFO: renamed from: ep1.e, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "onCloseButtonClicked", "e", "(Ler/a;Lm2/r;II)V", "Liy/b0;", "pinValue", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: ep1.e$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f52651a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1745939867);
            if (t.k()) {
                t.o(1745939867, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.pinInput.DeveloperPinInputScreen.<anonymous>.<anonymous> (DeveloperPinInputScreen.kt:40)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return primary;
        }
    }

    /* JADX INFO: renamed from: ep1.e$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f52652a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1890644550);
            if (t.k()) {
                t.o(-1890644550, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.pinInput.DeveloperPinInputScreen.<anonymous>.<anonymous> (DeveloperPinInputScreen.kt:41)");
            }
            long secondary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return secondary;
        }
    }

    public static final void e(er.a<i0> aVar, r rVar, final int i15, final int i16) {
        er.a<i0> aVar2;
        int i17;
        final er.a<i0> aVar3;
        r rVarH = rVar.h(1329507387);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            aVar2 = aVar;
        } else if ((i15 & 6) == 0) {
            aVar2 = aVar;
            i17 = (rVarH.G(aVar2) ? 4 : 2) | i15;
        } else {
            aVar2 = aVar;
            i17 = i15;
        }
        if (rVarH.r((i17 & 3) != 2, i17 & 1)) {
            if (i18 != 0) {
                Object objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new er.a() { // from class: ep1.a
                        @Override // er.a
                        public final Object a() {
                            return Function0.f();
                        }
                    };
                    rVarH.v(objE);
                }
                aVar3 = (er.a) objE;
            } else {
                aVar3 = aVar2;
            }
            if (t.k()) {
                t.o(1329507387, i17, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.pinInput.DeveloperPinInputScreen (DeveloperPinInputScreen.kt:25)");
            }
            Object objE2 = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE2 == companion.a()) {
                objE2 = c6.e(b0.INSTANCE.a(), null, 2, null);
                rVarH.v(objE2);
            }
            final a3 a3Var = (a3) objE2;
            Object objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                BasicPinInputScreenData basicPinInputScreenData = new BasicPinInputScreenData(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), new er.a() { // from class: ep1.b
                    @Override // er.a
                    public final Object a() {
                        return Function0.i();
                    }
                }), mx.b.b("DeveloperPinInputScreen", "changePinTitle"), null, null, null, 28, null), null, null, null, null, 61, null), new o40.a.Icon(jz.a.f106790i, a.f52651a, b.f52652a, mx.b.b("DeveloperInputScreenTitle", ""), mx.b.b("DeveloperPinInputScreenDescription", ""), null, 32, null), new c.Pin(null, null, mx.b.b(c0.e(g(a3Var)), ""), null, null, null, new l() { // from class: ep1.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.j(a3Var, (String) obj);
                    }
                }, null, false, 0, null, false, null, false, null, null, 0, null, 262075, null), false, aVar3);
                rVarH.v(basicPinInputScreenData);
                objE3 = basicPinInputScreenData;
            }
            d.d((BasicPinInputScreenData) objE3, rVarH, BasicPinInputScreenData.f216979g);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            aVar3 = aVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: ep1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.k(aVar3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f() {
        return i0.f148189a;
    }

    private static final b0 g(a3<b0> a3Var) {
        return a3Var.getValue();
    }

    private static final void h(a3<b0> a3Var, b0 b0Var) {
        a3Var.setValue(b0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(a3 a3Var, String str) {
        h(a3Var, c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(er.a aVar, int i15, int i16, r rVar, int i17) {
        e(aVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
