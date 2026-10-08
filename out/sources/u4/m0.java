package u4;

import android.content.Context;
import android.os.Build;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lu4/c0;", "Lc5/d;", "density", "", "weightAdjustment", "", "e", "(Lu4/c0;Lc5/d;I)Ljava/lang/String;", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)I", "d", "(Lu4/c0;Landroid/content/Context;)Ljava/lang/String;", "", "b", "(F)F", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m0 {
    private static final float b(float f15) {
        return lr.m.m(f15, 1.0f, 1000.0f);
    }

    public static final int c(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) {
            return 0;
        }
        return context.getResources().getConfiguration().fontWeightAdjustment;
    }

    public static final String d(c0 c0Var, Context context) {
        return e(c0Var, c5.a.a(context), c(context));
    }

    public static final String e(c0 c0Var, final c5.d dVar, int i15) {
        boolean z15;
        float fB;
        if (i15 == 0) {
            return e5.b.e(c0Var.a(), null, null, null, 0, null, new er.l() { // from class: u4.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return m0.f(dVar, (b0) obj);
                }
            }, 31, null);
        }
        List<b0> listA = c0Var.a();
        int size = listA.size();
        int i16 = 0;
        String str = "";
        boolean z16 = false;
        while (i16 < size) {
            b0 b0Var = listA.get(i16);
            if (fr.t.c(b0Var.c(), "wght")) {
                fB = b(b0Var.b(dVar) + i15);
                z15 = true;
            } else {
                z15 = z16;
                fB = b0Var.b(dVar);
            }
            if (i16 != 0) {
                str = str + ',';
            }
            str = str + '\'' + b0Var.c() + "' " + fB;
            i16++;
            z16 = z15;
        }
        if (z16) {
            return str;
        }
        float fB2 = b(i15 + 400.0f);
        if (!c0Var.a().isEmpty()) {
            str = str + ',';
        }
        return str + "'wght' " + fB2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(c5.d dVar, b0 b0Var) {
        return '\'' + b0Var.c() + "' " + b0Var.b(dVar);
    }
}
