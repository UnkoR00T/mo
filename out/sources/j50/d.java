package j50;

import androidx.compose.ui.graphics.Color;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f99464a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.p<p076m2.r, Integer, i0> f99465b = y2.m.b(815181915, false, new er.p() { // from class: j50.a
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return d.g((p076m2.r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static er.p<p076m2.r, Integer, i0> f99466c = y2.m.b(724730658, false, new er.p() { // from class: j50.b
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return d.f((p076m2.r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static er.p<p076m2.r, Integer, i0> f99467d = y2.m.b(-429116259, false, new er.p() { // from class: j50.c
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return d.h((p076m2.r) obj, ((Integer) obj2).intValue());
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f99468a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(446138708);
            if (p076m2.t.k()) {
                p076m2.t.o(446138708, i15, -1, "pl.gov.coi.common.ui.ds.searchbar.ComposableSingletons$SearchBarKt.lambda$815181915.<anonymous>.<anonymous> (SearchBar.kt:268)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(724730658, i15, -1, "pl.gov.coi.common.ui.ds.searchbar.ComposableSingletons$SearchBarKt.lambda$724730658.<anonymous> (SearchBar.kt:405)");
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(815181915, i15, -1, "pl.gov.coi.common.ui.ds.searchbar.ComposableSingletons$SearchBarKt.lambda$815181915.<anonymous> (SearchBar.kt:265)");
            }
            d40.h.f(null, new d40.b.C0864b(null, jz.a.S, d40.i.f.f39709e, a.f99468a, null, null, 33, null), true, rVar, MLKEMEngine.KyberPolyBytes, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-429116259, i15, -1, "pl.gov.coi.common.ui.ds.searchbar.ComposableSingletons$SearchBarKt.lambda$-429116259.<anonymous> (SearchBar.kt:463)");
            }
            j70.h.g(null, null, mx.b.b("Inner content - results of the search should be placed in InnerContent", "searchBarText"), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final er.p<p076m2.r, Integer, i0> d() {
        return f99466c;
    }

    public final er.p<p076m2.r, Integer, i0> e() {
        return f99465b;
    }
}
