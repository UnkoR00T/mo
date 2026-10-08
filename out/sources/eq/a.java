package eq;

import android.content.Context;
import cq.b;
import java.util.Set;
import lq.d;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: eq.a$a, reason: collision with other inner class name */
    public interface InterfaceC1240a {
        Set<Boolean> b();
    }

    public static boolean a(Context context) {
        Set<Boolean> setB = ((InterfaceC1240a) b.a(context, InterfaceC1240a.class)).b();
        d.c(setB.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setB.isEmpty()) {
            return true;
        }
        return setB.iterator().next().booleanValue();
    }
}
