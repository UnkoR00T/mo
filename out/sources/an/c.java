package an;

import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static boolean a(AtomicReference<Boolean> atomicReference, String str) {
        if (atomicReference.get() != null) {
            return atomicReference.get().booleanValue();
        }
        boolean z15 = DynamiteModule.a(pm.i.c().b(), str) > 0;
        atomicReference.set(Boolean.valueOf(z15));
        return z15;
    }
}
