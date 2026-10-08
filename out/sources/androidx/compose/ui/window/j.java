package androidx.compose.ui.window;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f11095a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er.p<p076m2.r, Integer, i0> f11096b = y2.m.b(-1131826196, false, a.f11097b);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f11097b = new a();

        a() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            if (!rVar.r((i15 & 3) != 2, i15 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1131826196, i15, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt.lambda$-1131826196.<anonymous> (AndroidPopup.android.kt:698)");
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    public final er.p<p076m2.r, Integer, i0> a() {
        return f11096b;
    }
}
