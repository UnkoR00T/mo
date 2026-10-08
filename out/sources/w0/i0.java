package w0;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Lm2/r;I)Z", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i0 {
    public static final boolean a(p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-882615028, i15, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:45)");
        }
        boolean z15 = (((Configuration) rVar.N(AndroidCompositionLocals_androidKt.b())).uiMode & 48) == 32;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return z15;
    }
}
