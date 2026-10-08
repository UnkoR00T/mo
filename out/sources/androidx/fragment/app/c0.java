package androidx.fragment.app;

import android.view.ViewGroup;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f12417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f12418b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f12420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f12421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f12422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f12423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f12424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f12425i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f12427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f12428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    CharSequence f12429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f12430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    CharSequence f12431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList<String> f12432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList<String> f12433q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ArrayList<Runnable> f12435s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList<a> f12419c = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f12426j = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f12434r = false;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f12436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        o f12437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f12438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f12439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f12440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f12441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f12442g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        androidx.lifecycle.j.b f12443h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        androidx.lifecycle.j.b f12444i;

        a() {
        }

        a(int i15, o oVar) {
            this.f12436a = i15;
            this.f12437b = oVar;
            this.f12438c = false;
            androidx.lifecycle.j.b bVar = androidx.lifecycle.j.b.RESUMED;
            this.f12443h = bVar;
            this.f12444i = bVar;
        }

        a(int i15, o oVar, boolean z15) {
            this.f12436a = i15;
            this.f12437b = oVar;
            this.f12438c = z15;
            androidx.lifecycle.j.b bVar = androidx.lifecycle.j.b.RESUMED;
            this.f12443h = bVar;
            this.f12444i = bVar;
        }

        a(int i15, o oVar, androidx.lifecycle.j.b bVar) {
            this.f12436a = i15;
            this.f12437b = oVar;
            this.f12438c = false;
            this.f12443h = oVar.f12612u0;
            this.f12444i = bVar;
        }
    }

    c0(s sVar, ClassLoader classLoader) {
        this.f12417a = sVar;
        this.f12418b = classLoader;
    }

    public c0 b(int i15, o oVar) {
        m(i15, oVar, null, 1);
        return this;
    }

    public c0 c(int i15, o oVar, String str) {
        m(i15, oVar, str, 1);
        return this;
    }

    public final c0 d(ViewGroup viewGroup, o oVar, String str) {
        oVar.P = viewGroup;
        oVar.f12610t = true;
        return c(viewGroup.getId(), oVar, str);
    }

    public c0 e(o oVar, String str) {
        m(0, oVar, str, 1);
        return this;
    }

    void f(a aVar) {
        this.f12419c.add(aVar);
        aVar.f12439d = this.f12420d;
        aVar.f12440e = this.f12421e;
        aVar.f12441f = this.f12422f;
        aVar.f12442g = this.f12423g;
    }

    public c0 g(String str) {
        if (!this.f12426j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f12425i = true;
        this.f12427k = str;
        return this;
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public c0 l() {
        if (this.f12425i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f12426j = false;
        return this;
    }

    void m(int i15, o oVar, String str, int i16) {
        String str2 = oVar.f12611t0;
        if (str2 != null) {
            f7.c.f(oVar, str2);
        }
        Class<?> cls = oVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = oVar.E;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + oVar + ": was " + oVar.E + " now " + str);
            }
            oVar.E = str;
        }
        if (i15 != 0) {
            if (i15 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + oVar + " with tag " + str + " to container view with no id");
            }
            int i17 = oVar.C;
            if (i17 != 0 && i17 != i15) {
                throw new IllegalStateException("Can't change container ID of fragment " + oVar + ": was " + oVar.C + " now " + i15);
            }
            oVar.C = i15;
            oVar.D = i15;
        }
        f(new a(i16, oVar));
    }

    public abstract boolean n();

    public c0 o(o oVar) {
        f(new a(3, oVar));
        return this;
    }

    public c0 p(int i15, o oVar) {
        return q(i15, oVar, null);
    }

    public c0 q(int i15, o oVar, String str) {
        if (i15 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m(i15, oVar, str, 2);
        return this;
    }

    c0 r(boolean z15, Runnable runnable) {
        if (!z15) {
            l();
        }
        if (this.f12435s == null) {
            this.f12435s = new ArrayList<>();
        }
        this.f12435s.add(runnable);
        return this;
    }

    public c0 s(int i15, int i16, int i17, int i18) {
        this.f12420d = i15;
        this.f12421e = i16;
        this.f12422f = i17;
        this.f12423g = i18;
        return this;
    }

    public c0 t(o oVar, androidx.lifecycle.j.b bVar) {
        f(new a(10, oVar, bVar));
        return this;
    }

    public c0 u(boolean z15) {
        this.f12434r = z15;
        return this;
    }

    public c0 v(o oVar) {
        f(new a(5, oVar));
        return this;
    }
}
