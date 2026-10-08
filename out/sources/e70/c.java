package e70;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.e0;
import d1.i0;
import d1.r3;
import er.p;
import f3.j;
import f3.m;
import h30.ButtonData;
import h30.q;
import j70.h;
import mx.Label;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;
import w0.i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Le70/a;", "data", "Loq/i0;", "b", "(Le70/a;Lm2/r;I)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47921a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-765806411);
            if (t.k()) {
                t.o(-765806411, i15, -1, "pl.gov.coi.common.ui.scanner.camerapermission.QrScannerPermissionNotGrantedContent.<anonymous>.<anonymous> (QrScannerPermissionNotGrantedContent.kt:53)");
            }
            long jI = Color.INSTANCE.i();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jI;
        }
    }

    public static final void b(final CameraPermissionNotGrantedData cameraPermissionNotGrantedData, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1059187824);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(cameraPermissionNotGrantedData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1059187824, i16, -1, "pl.gov.coi.common.ui.scanner.camerapermission.QrScannerPermissionNotGrantedContent (QrScannerPermissionNotGrantedContent.kt:28)");
            }
            m.Companion companion = m.INSTANCE;
            Color.Companion companion2 = Color.INSTANCE;
            m mVarD = i.d(companion, companion2.g(), null, 2, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarP = a3.p(mVarD, aVar.b(rVarH, i17).getSpacing700(), 0.0f, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarP);
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
            i0 i0Var = i0.f39176a;
            Label title = cameraPermissionNotGrantedData.getTitle();
            long jI = companion2.i();
            TextStyle textStyleA = aVar.f(rVarH, i17).a();
            b5.j.Companion companion4 = b5.j.INSTANCE;
            rVar2 = rVarH;
            h.g(null, null, title, null, null, jI, 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, textStyleA, null, null, false, false, null, rVar2, 196608, 0, 0, 33026011);
            r3.a(d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            h.g(null, null, cameraPermissionNotGrantedData.getMessage(), null, null, companion2.i(), 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).d(), null, null, false, false, null, rVar2, 196608, 0, 0, 33026011);
            r3.a(d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            q.p(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(cameraPermissionNotGrantedData.getButtonLabel(), null, 2, null), new k30.d.Secondary(a.f47921a), null, cameraPermissionNotGrantedData.b(), 35, null), false, null, rVar2, 0, 6);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: e70.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.c(cameraPermissionNotGrantedData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(CameraPermissionNotGrantedData cameraPermissionNotGrantedData, int i15, r rVar, int i16) {
        b(cameraPermissionNotGrantedData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
