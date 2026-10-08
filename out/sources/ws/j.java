package ws;

import java.util.List;
import pq.v;
import us.w;
import us.x;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f214769b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f214770c = new j(v.n());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<w> f214771a;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final j a(x xVar) {
            return xVar.y() == 0 ? b() : new j(xVar.A(), null);
        }

        public final j b() {
            return j.f214770c;
        }

        private a() {
        }
    }

    public /* synthetic */ j(List list, fr.k kVar) {
        this(list);
    }

    public final w b(int i15) {
        return (w) v.o0(this.f214771a, i15);
    }

    private j(List<w> list) {
        this.f214771a = list;
    }
}
