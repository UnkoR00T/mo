package kb;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<h> f109667c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f109668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f109669b;

    public static class a extends h {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    public static class b extends h {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    h(String str, String str2) {
        this.f109668a = str;
        this.f109669b = str2;
        f109667c.add(this);
    }
}
