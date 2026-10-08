package dh;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements el.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.d f42068d = new dl.d() { // from class: dh.m
        @Override // dl.d
        public final void a(Object obj, Object obj2) {
            int i15 = n.f42069e;
            throw new dl.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f42069e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f42070a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f42071b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dl.d f42072c = f42068d;

    @Override // el.b
    public final /* bridge */ /* synthetic */ el.b a(Class cls, dl.d dVar) {
        this.f42070a.put(cls, dVar);
        this.f42071b.remove(cls);
        return this;
    }

    public final o b() {
        return new o(new HashMap(this.f42070a), new HashMap(this.f42071b), this.f42072c);
    }
}
