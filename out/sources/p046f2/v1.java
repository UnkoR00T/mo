package p046f2;

import androidx.compose.ui.platform.g1;
import java.util.Locale;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import x4.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "a", "(Lm2/r;I)Ljava/util/Locale;", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v1 {
    public static final Locale a(r rVar, int i15) {
        if (t.k()) {
            t.o(-1612326743, i15, -1, "androidx.compose.material3.defaultLocale (CalendarLocale.android.kt:26)");
        }
        Locale platformLocale = ((c) rVar.N(g1.m())).getPlatformLocale();
        if (t.k()) {
            t.n();
        }
        return platformLocale;
    }
}
