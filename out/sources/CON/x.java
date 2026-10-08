package CON;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\u000e\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\" \u0010\u0011\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\t\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000b\"\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LCON/p;", "LCON/v0;", "statusBarStyle", "navigationBarStyle", "Loq/i0;", "b", "(LCON/p;LCON/v0;LCON/v0;)V", "", "a", "I", "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultLightScrim", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "DefaultDarkScrim", "LCON/f0;", "c", "LCON/f0;", "Impl", "activity"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f237a = Color.argb(230, GF2Field.MASK, GF2Field.MASK, GF2Field.MASK);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f238b = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static f0 f239c;

    public static final void a(p pVar) {
        c(pVar, null, null, 3, null);
    }

    public static final void b(p pVar, v0 v0Var, v0 v0Var2) {
        View decorView = pVar.getWindow().getDecorView();
        boolean zBooleanValue = v0Var.a().b(decorView.getResources()).booleanValue();
        boolean zBooleanValue2 = v0Var2.a().b(decorView.getResources()).booleanValue();
        f0 a0Var = f239c;
        if (a0Var == null) {
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 35) {
                a0Var = new d0();
            } else if (i15 >= 30) {
                a0Var = new c0();
            } else if (i15 >= 29) {
                a0Var = new b0();
            } else {
                a0Var = i15 >= 28 ? new a0() : new y();
            }
            f239c = a0Var;
        }
        f0 f0Var = a0Var;
        f0Var.a(v0Var, v0Var2, pVar.getWindow(), decorView, zBooleanValue, zBooleanValue2);
        f0Var.b(pVar.getWindow());
    }

    public static /* synthetic */ void c(p pVar, v0 v0Var, v0 v0Var2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            v0Var = v0.Companion.c(v0.INSTANCE, 0, 0, null, 4, null);
        }
        if ((i15 & 2) != 0) {
            v0Var2 = v0.Companion.c(v0.INSTANCE, f237a, f238b, null, 4, null);
        }
        b(pVar, v0Var, v0Var2);
    }
}
