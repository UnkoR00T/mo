package ig;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class k {
    public static <L> j<L> a(L l15, Looper looper, String str) {
        jg.s.m(l15, "Listener must not be null");
        jg.s.m(looper, "Looper must not be null");
        jg.s.m(str, "Listener type must not be null");
        return new j<>(looper, l15, str);
    }

    public static <L> j<L> b(L l15, Executor executor, String str) {
        jg.s.m(l15, "Listener must not be null");
        jg.s.m(executor, "Executor must not be null");
        jg.s.m(str, "Listener type must not be null");
        return new j<>(executor, l15, str);
    }

    public static <L> j.a<L> c(L l15, String str) {
        jg.s.m(l15, "Listener must not be null");
        jg.s.m(str, "Listener type must not be null");
        jg.s.g(str, "Listener type must not be empty");
        return new j.a<>(l15, str);
    }
}
