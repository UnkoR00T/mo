package fh;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e2 implements el.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.d f63006d = new dl.d() { // from class: fh.d2
        @Override // dl.d
        public final void a(Object obj, Object obj2) {
            int i15 = e2.f63007e;
            throw new dl.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f63007e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f63008a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f63009b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dl.d f63010c = f63006d;

    @Override // el.b
    public final /* bridge */ /* synthetic */ el.b a(Class cls, dl.d dVar) {
        this.f63008a.put(cls, dVar);
        this.f63009b.remove(cls);
        return this;
    }

    public final f2 b() {
        return new f2(new HashMap(this.f63008a), new HashMap(this.f63009b), this.f63010c);
    }
}
