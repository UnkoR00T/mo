package u4;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a'\u0010\b\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lu4/o0;", "a", "()Lu4/o0;", "Landroid/graphics/Typeface;", "Lu4/c0;", "variationSettings", "Landroid/content/Context;", "context", "c", "(Landroid/graphics/Typeface;Lu4/c0;Landroid/content/Context;)Landroid/graphics/Typeface;", "", "name", "Lu4/d0;", "fontWeight", "b", "(Ljava/lang/String;Lu4/d0;)Ljava/lang/String;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r0 {
    public static final o0 a() {
        return Build.VERSION.SDK_INT >= 28 ? new p0() : new q0();
    }

    public static final String b(String str, FontWeight fontWeight) {
        int iP = fontWeight.p() / 100;
        if (iP >= 0 && iP < 2) {
            return str + "-thin";
        }
        if (2 <= iP && iP < 4) {
            return str + "-light";
        }
        if (iP == 4) {
            return str;
        }
        if (iP == 5) {
            return str + "-medium";
        }
        if ((6 <= iP && iP < 8) || 8 > iP || iP >= 11) {
            return str;
        }
        return str + "-black";
    }

    public static final Typeface c(Typeface typeface, c0 c0Var, Context context) {
        return v0.f195296a.a(typeface, c0Var, context);
    }
}
