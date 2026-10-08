package p056h1;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import fr.t;
import java.util.Locale;
import p071kotlin.Metadata;
import p076m2.r;
import w0.r2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\"\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lh1/z2;", "a", "(Lm2/r;I)Lh1/z2;", "h1/a3$a", "Lh1/a3$a;", "getRobolectricImpl$annotations", "()V", "RobolectricImpl", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f79306a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"h1/a3$a", "Lh1/z2;", "Lh1/x2;", "prefetchRequest", "Loq/i0;", "a", "(Lh1/x2;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements z2 {
        a() {
        }

        @Override // p056h1.z2
        public void a(x2 prefetchRequest) {
        }
    }

    static {
        String str = Build.FINGERPRINT;
        f79306a = (str == null || !t.c(str.toLowerCase(Locale.ROOT), "robolectric")) ? null : new a();
    }

    public static final z2 a(r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1141871251, i15, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:36)");
        }
        z2 z2Var = f79306a;
        if (z2Var != null) {
            rVar.X(1345554384);
        } else {
            rVar.X(1345603457);
            View view = (View) rVar.N(AndroidCompositionLocals_androidKt.g());
            boolean zW = rVar.W(view);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                Object tag = view.getTag(r2.f209046a);
                Object bVar = tag instanceof z2 ? (z2) tag : null;
                if (bVar == null) {
                    bVar = new b(view);
                    view.setTag(r2.f209046a, bVar);
                }
                objE = bVar;
                rVar.v(objE);
            }
            z2Var = (z2) objE;
        }
        rVar.R();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return z2Var;
    }
}
