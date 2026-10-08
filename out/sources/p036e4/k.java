package p036e4;

import er.p;
import fr.w;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f47288a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static p<r, Integer, i0> f47289b = m.b(641200809, false, a.f47290b);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements p<r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f47290b = new a();

        a() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(r rVar, int i15) {
            if (!rVar.r((i15 & 3) != 2, i15 & 1)) {
                rVar.O();
                return;
            }
            if (t.k()) {
                t.o(641200809, i15, -1, "androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.lambda$641200809.<anonymous> (SubcomposeLayout.kt:640)");
            }
            if (t.k()) {
                t.n();
            }
        }
    }

    public final p<r, Integer, i0> a() {
        return f47289b;
    }
}
