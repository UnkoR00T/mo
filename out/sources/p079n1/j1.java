package p079n1;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ln1/i1;", "string", "", "a", "(ILm2/r;I)Ljava/lang/String;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j1 {
    public static final String a(int i15, r rVar, int i16) {
        if (t.k()) {
            t.o(-2083411200, i16, -1, "androidx.compose.foundation.text.getString (ContextMenuStrings.android.kt:55)");
        }
        String string = ((Resources) rVar.N(AndroidCompositionLocals_androidKt.f())).getString(i15);
        if (t.k()) {
            t.n();
        }
        return string;
    }
}
