package ct;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public enum x {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<x> f37690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<x> f37691d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f37708a;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ wq.a f37707w = wq.b.a(b());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f37689b = new a(null);

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    static {
        x[] xVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (x xVar : xVarArrValues) {
            if (xVar.f37708a) {
                arrayList.add(xVar);
            }
        }
        f37690c = pq.v.k1(arrayList);
        f37691d = pq.n.B1(values());
    }

    x(boolean z15) {
        this.f37708a = z15;
    }
}
