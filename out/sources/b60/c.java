package b60;

import androidx.compose.ui.graphics.Color;
import er.p;
import n3.o1;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lb60/a;", "a", "Lb60/a;", "c", "()Lb60/a;", "DefaultWhatsNewColorScheme", "Lm2/b4;", "b", "Lm2/b4;", "d", "()Lm2/b4;", "LocalWhatsNewColorScheme", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final WhatsNewColorScheme f16796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b4<WhatsNewColorScheme> f16797b;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16798a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1117640330);
            if (t.k()) {
                t.o(1117640330, i15, -1, "pl.gov.coi.common.ui.ds.whatsnew.DefaultWhatsNewColorScheme.<anonymous> (WhatsNewColorScheme.kt:22)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jC;
        }
    }

    static {
        long jD = o1.d(4278202778L);
        long jD2 = o1.d(4278208996L);
        Color.Companion companion = Color.INSTANCE;
        f16796a = new WhatsNewColorScheme(jD, jD2, companion.i(), Color.m9copywmQWz5c$default(companion.i(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null), a.f16798a, null);
        f16797b = d0.j(new er.a() { // from class: b60.b
            @Override // er.a
            public final Object a() {
                return c.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WhatsNewColorScheme b() {
        return f16796a;
    }

    public static final WhatsNewColorScheme c() {
        return f16796a;
    }

    public static final b4<WhatsNewColorScheme> d() {
        return f16797b;
    }
}
