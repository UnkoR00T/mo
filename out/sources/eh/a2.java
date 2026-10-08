package eh;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 implements el.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final dl.d f50227d = new dl.d() { // from class: eh.z1
        @Override // dl.d
        public final void a(Object obj, Object obj2) {
            int i15 = a2.f50228e;
            throw new dl.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f50228e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f50229a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f50230b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dl.d f50231c = f50227d;

    @Override // el.b
    public final /* bridge */ /* synthetic */ el.b a(Class cls, dl.d dVar) {
        this.f50229a.put(cls, dVar);
        this.f50230b.remove(cls);
        return this;
    }

    public final b2 b() {
        return new b2(new HashMap(this.f50229a), new HashMap(this.f50230b), this.f50231c);
    }
}
