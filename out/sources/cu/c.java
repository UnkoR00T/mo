package cu;

import fr.t;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static final boolean a(Throwable th4) {
        Class<?> superclass = th4.getClass();
        while (!t.c(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable th4) throws Throwable {
        throw th4;
    }
}
