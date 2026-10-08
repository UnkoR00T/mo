package pr;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Ljava/lang/Class;", "Las/k;", "a", "(Ljava/lang/Class;)Las/k;", "Ljava/util/concurrent/ConcurrentMap;", "Lpr/z3;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<z3, WeakReference<as.k>> f161878a = new ConcurrentHashMap();

    public static final as.k a(Class<?> cls) {
        ClassLoader classLoaderJ = bs.f.j(cls);
        z3 z3Var = new z3(classLoaderJ);
        ConcurrentMap<z3, WeakReference<as.k>> concurrentMap = f161878a;
        WeakReference<as.k> weakReference = concurrentMap.get(z3Var);
        if (weakReference != null) {
            as.k kVar = weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(z3Var, weakReference);
        }
        as.k kVarA = as.k.f14287c.a(classLoaderJ);
        while (true) {
            try {
                ConcurrentMap<z3, WeakReference<as.k>> concurrentMap2 = f161878a;
                WeakReference<as.k> weakReferencePutIfAbsent = concurrentMap2.putIfAbsent(z3Var, new WeakReference<>(kVarA));
                if (weakReferencePutIfAbsent == null) {
                    z3Var.a(null);
                    return kVarA;
                }
                as.k kVar2 = weakReferencePutIfAbsent.get();
                if (kVar2 != null) {
                    z3Var.a(null);
                    return kVar2;
                }
                concurrentMap2.remove(z3Var, weakReferencePutIfAbsent);
            } catch (Throwable th4) {
                z3Var.a(null);
                throw th4;
            }
        }
    }
}
