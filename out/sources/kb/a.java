package kb;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements kb.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<a> f109660c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f109661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f109662b;

    /* JADX INFO: renamed from: kb.a$a, reason: collision with other inner class name */
    private static class C2621a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Set<String> f109663a = new HashSet(Arrays.asList(k.d().a()));
    }

    public static class b extends a {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean c() {
            return true;
        }
    }

    public static class c extends a {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean c() {
            return true;
        }
    }

    public static class d extends a {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean c() {
            return false;
        }
    }

    public static class e extends a {
        e(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean c() {
            return true;
        }
    }

    public static class f extends a {
        f(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    public static class g extends a {
        g(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class h extends a {
        h(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class i extends a {
        i(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    a(String str, String str2) {
        this.f109661a = str;
        this.f109662b = str2;
        f109660c.add(this);
    }

    public static Set<a> e() {
        return Collections.unmodifiableSet(f109660c);
    }

    @Override // kb.e
    public boolean a() {
        return c() || d();
    }

    @Override // kb.e
    public String b() {
        return this.f109661a;
    }

    public abstract boolean c();

    public boolean d() {
        return xv.a.b(C2621a.f109663a, this.f109662b);
    }
}
