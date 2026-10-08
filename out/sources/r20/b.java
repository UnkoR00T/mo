package r20;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.x;
import er.p;
import f3.m;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import s20.DocumentIconWithStatusData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ls20/a;", "documentIconWithStatusData", "Loq/i0;", "b", "(Ls20/a;Lm2/r;I)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f170849a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1411908775);
            if (t.k()) {
                t.o(-1411908775, i15, -1, "pl.gov.coi.common.ui.document.documentsrefresh.DocumentIconWithStatus.<anonymous>.<anonymous> (DocumentIconWithStatus.kt:32)");
            }
            long jH = Color.INSTANCE.h();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jH;
        }
    }

    /* JADX INFO: renamed from: r20.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4329b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4329b f170850a = new C4329b();

        C4329b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1246550758);
            if (t.k()) {
                t.o(1246550758, i15, -1, "pl.gov.coi.common.ui.document.documentsrefresh.DocumentIconWithStatus.<anonymous>.<anonymous>.<anonymous> (DocumentIconWithStatus.kt:42)");
            }
            long jH = Color.INSTANCE.h();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jH;
        }
    }

    public static final void b(final DocumentIconWithStatusData documentIconWithStatusData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-889908762);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(documentIconWithStatusData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-889908762, i16, -1, "pl.gov.coi.common.ui.document.documentsrefresh.DocumentIconWithStatus (DocumentIconWithStatus.kt:24)");
            }
            m.Companion companion = m.INSTANCE;
            m mVarT = androidx.compose.foundation.layout.d.t(a3.r(companion, 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50(), 0.0f, 0.0f, 13, null), c5.h.n(36));
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVarT);
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
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            x xVar = x.f39368a;
            d40.b.C0864b c0864b = new d40.b.C0864b(null, documentIconWithStatusData.getIconResId(), d40.i.g.f39710e, a.f170849a, documentIconWithStatusData.getIconContentDescription(), null, 33, null);
            int i17 = d40.b.C0864b.f39687h;
            d40.h.f(null, c0864b, false, rVarH, i17 << 3, 5);
            s20.d statusIconData = documentIconWithStatusData.getStatusIconData();
            if (statusIconData == null) {
                rVarH.X(579586034);
            } else {
                rVarH.X(579586035);
                d40.h.f(xVar.d(companion, companion2.c()), new d40.b.C0864b(null, statusIconData.getIconResId(), d40.i.c.f39706e, C4329b.f170850a, statusIconData.getContentDescription(), null, 33, null), false, rVarH, i17 << 3, 4);
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: r20.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(documentIconWithStatusData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(DocumentIconWithStatusData documentIconWithStatusData, int i15, r rVar, int i16) {
        b(documentIconWithStatusData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
