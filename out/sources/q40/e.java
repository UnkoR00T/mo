package q40;

import d1.r3;
import er.q;
import h30.ButtonData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import t40.InfoRowListData;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f164658a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q f164659b = m.b(-1117135844, false, new q() { // from class: q40.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return e.j(obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q f164660c = m.b(662335772, false, new q() { // from class: q40.b
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return e.h(obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static q<Object, r, Integer, i0> f164661d = m.b(-1056462389, false, new q() { // from class: q40.c
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return e.i(obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static q<Object, r, Integer, i0> f164662e = m.b(1424712204, false, new q() { // from class: q40.d
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return e.g(obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(Object obj, r rVar, int i15) {
        r rVar2;
        if (t.k()) {
            t.o(1424712204, i15, -1, "pl.gov.coi.common.ui.ds.iconpage.ComposableSingletons$IconPageKt.lambda$1424712204.<anonymous> (IconPage.kt:144)");
        }
        if (obj instanceof IconPageBottomContentData) {
            rVar.X(734541837);
            IconPageBottomContentData iconPageBottomContentData = (IconPageBottomContentData) obj;
            rVar2 = rVar;
            h30.q.p(iconPageBottomContentData.getPrimaryButtonData(), false, null, rVar2, 0, 6);
            ButtonData secondaryButtonData = iconPageBottomContentData.getSecondaryButtonData();
            if (secondaryButtonData == null) {
                rVar2.X(734649158);
            } else {
                rVar2.X(734649159);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing150()), rVar2, 0);
                h30.q.p(secondaryButtonData, false, null, rVar2, 0, 6);
            }
            rVar2.R();
        } else {
            rVar2 = rVar;
            rVar2.X(729488310);
        }
        rVar2.R();
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Object obj, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(662335772, i15, -1, "pl.gov.coi.common.ui.ds.iconpage.ComposableSingletons$IconPageKt.lambda$662335772.<anonymous> (IconPage.kt:35)");
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Object obj, r rVar, int i15) {
        if (t.k()) {
            t.o(-1056462389, i15, -1, "pl.gov.coi.common.ui.ds.iconpage.ComposableSingletons$IconPageKt.lambda$-1056462389.<anonymous> (IconPage.kt:141)");
        }
        if (obj instanceof InfoRowListData) {
            rVar.X(-1648071990);
            s40.g.c((InfoRowListData) obj, 0.0f, rVar, i15 & 14, 2);
        } else {
            rVar.X(444475415);
        }
        rVar.R();
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(Object obj, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-1117135844, i15, -1, "pl.gov.coi.common.ui.ds.iconpage.ComposableSingletons$IconPageKt.lambda$-1117135844.<anonymous> (IconPage.kt:34)");
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final q e() {
        return f164659b;
    }

    public final q f() {
        return f164660c;
    }
}
