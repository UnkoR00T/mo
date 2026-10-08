package v;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f202924a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Object, h0> f202925b = new HashMap();

    public static h0 a(Object obj) {
        h0 h0Var;
        synchronized (f202924a) {
            h0Var = f202925b.get(obj);
        }
        return h0Var == null ? h0.f202600a : h0Var;
    }
}
