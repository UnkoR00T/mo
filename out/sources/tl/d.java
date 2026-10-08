package tl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f190621b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<f> f190622a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar;
        d dVar2 = f190621b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f190621b;
                if (dVar == null) {
                    dVar = new d();
                    f190621b = dVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return dVar;
    }

    Set<f> b() {
        Set<f> setUnmodifiableSet;
        synchronized (this.f190622a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f190622a);
        }
        return setUnmodifiableSet;
    }
}
