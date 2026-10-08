package ch;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class t2 implements el.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.d f26350d = new dl.d() { // from class: ch.s2
        @Override // dl.d
        public final void a(Object obj, Object obj2) {
            int i15 = t2.f26351e;
            throw new dl.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f26351e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f26352a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f26353b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dl.d f26354c = f26350d;

    @Override // el.b
    public final /* bridge */ /* synthetic */ el.b a(Class cls, dl.d dVar) {
        this.f26352a.put(cls, dVar);
        this.f26353b.remove(cls);
        return this;
    }

    public final u2 b() {
        return new u2(new HashMap(this.f26352a), new HashMap(this.f26353b), this.f26354c);
    }
}
