package bb3;

import androidx.compose.ui.graphics.Color;
import er.p;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u000fj\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lbb3/a;", "", "", "iconResId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "iconColorProvider", "<init>", "(Ljava/lang/String;IILer/p;)V", "a", "I", "g", "()I", "b", "Ler/p;", "e", "()Ler/p;", "c", "d", "f", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a {
    LEVEL_1(jz.a.B1, new p<r, Integer, Color>() { // from class: bb3.a.a
        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(228181776);
            if (t.k()) {
                t.o(228181776, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.model.SafetyLevelResource.<anonymous> (SafetyLevelResource.kt:14)");
            }
            long jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().d();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jD;
        }
    }),
    LEVEL_2(jz.a.D1, new p<r, Integer, Color>() { // from class: bb3.a.b
        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-64204049);
            if (t.k()) {
                t.o(-64204049, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.model.SafetyLevelResource.<anonymous> (SafetyLevelResource.kt:18)");
            }
            long jH = Color.INSTANCE.h();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jH;
        }
    }),
    LEVEL_3(jz.a.f106911z1, new p<r, Integer, Color>() { // from class: bb3.a.c
        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-356589874);
            if (t.k()) {
                t.o(-356589874, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.model.SafetyLevelResource.<anonymous> (SafetyLevelResource.kt:22)");
            }
            long jE = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().e();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jE;
        }
    }),
    LEVEL_4(jz.a.C1, new p<r, Integer, Color>() { // from class: bb3.a.d
        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-648975699);
            if (t.k()) {
                t.o(-648975699, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.model.SafetyLevelResource.<anonymous> (SafetyLevelResource.kt:26)");
            }
            long jB = ((ja3.a) rVar.N(ja3.c.c())).b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    });


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ wq.a f18068h = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int iconResId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<r, Integer, Color> iconColorProvider;

    a(int i15, p pVar) {
        this.iconResId = i15;
        this.iconColorProvider = pVar;
    }

    public final p<r, Integer, Color> e() {
        return this.iconColorProvider;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }
}
