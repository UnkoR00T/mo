package td;

import fd.f0;
import io.sentry.android.core.c2;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f189580a = new HashSet();

    @Override // fd.f0
    public void a(String str) {
        d(str, null);
    }

    @Override // fd.f0
    public void b(String str, Throwable th4) {
        int i15 = fd.e.f61222k;
    }

    @Override // fd.f0
    public void c(String str) {
        e(str, null);
    }

    @Override // fd.f0
    public void d(String str, Throwable th4) {
        Set<String> set = f189580a;
        if (set.contains(str)) {
            return;
        }
        c2.h("LOTTIE", str, th4);
        set.add(str);
    }

    public void e(String str, Throwable th4) {
        int i15 = fd.e.f61222k;
    }
}
