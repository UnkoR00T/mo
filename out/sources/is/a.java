package is;

import es.t;
import fr.k;
import fr.q0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements gs.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2261a f96844e = new C2261a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final gs.f f96845f = new gs.f(q0.c(a.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<t> f96846a = new ArrayList(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f96847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f96848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f96849d;

    /* JADX INFO: renamed from: is.a$a, reason: collision with other inner class name */
    public static final class C2261a {
        public /* synthetic */ C2261a(k kVar) {
            this();
        }

        public final gs.f a() {
            return a.f96845f;
        }

        private C2261a() {
        }
    }

    public final List<t> b() {
        return this.f96846a;
    }

    public final void c(String str) {
        this.f96848c = str;
    }

    public final void d(int i15) {
        this.f96849d = i15;
    }

    public final void e(String str) {
        this.f96847b = str;
    }

    @Override // gs.e
    public gs.f getType() {
        return f96845f;
    }
}
