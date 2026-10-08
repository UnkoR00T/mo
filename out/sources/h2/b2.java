package h2;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.Locale;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00022\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lh2/a2;", "string", "", "b", "(ILm2/r;I)Ljava/lang/String;", "", "", "formatArgs", "c", "(I[Ljava/lang/Object;Lm2/r;I)Ljava/lang/String;", "a", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b2 {
    public static final String a(String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final String b(int i15, p076m2.r rVar, int i16) {
        if (p076m2.t.k()) {
            p076m2.t.o(-907677715, i16, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:29)");
        }
        rVar.N(AndroidCompositionLocals_androidKt.b());
        String string = ((Resources) rVar.N(AndroidCompositionLocals_androidKt.f())).getString(i15);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return string;
    }

    public static final String c(int i15, Object[] objArr, p076m2.r rVar, int i16) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1427268608, i16, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:37)");
        }
        String strB = b(i15, rVar, i16 & 14);
        Locale platformLocale = ((x4.c) rVar.N(androidx.compose.ui.platform.g1.m())).getPlatformLocale();
        fr.v0 v0Var = fr.v0.f66418a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str = String.format(platformLocale, strB, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return str;
    }
}
