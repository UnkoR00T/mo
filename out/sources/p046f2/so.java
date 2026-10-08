package p046f2;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"", "a", "(Lm2/r;I)Z", "is24HourFormat", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class so {
    public static final boolean a(r rVar, int i15) {
        if (t.k()) {
            t.o(-972868615, i15, -1, "androidx.compose.material3.<get-is24HourFormat> (TimeFormat.android.kt:24)");
        }
        boolean zIs24HourFormat = DateFormat.is24HourFormat((Context) rVar.N(AndroidCompositionLocals_androidKt.c()));
        if (t.k()) {
            t.n();
        }
        return zIs24HourFormat;
    }
}
