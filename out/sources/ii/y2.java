package ii;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class y2 extends u0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f92869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f92870b;

    y2() {
    }

    @Override // ii.u0.a
    public final u0 a() {
        List list = this.f92869a;
        if (list != null) {
            return new m6(list, this.f92870b);
        }
        throw new IllegalStateException("Missing required properties: legs");
    }

    @Override // ii.u0.a
    public final List<z> c() {
        List<z> list = this.f92869a;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"legs\" has not been set");
    }

    @Override // ii.u0.a
    public final u0.a d(Uri uri) {
        this.f92870b = uri;
        return this;
    }

    @Override // ii.u0.a
    public final u0.a e(List<z> list) {
        if (list == null) {
            throw new NullPointerException("Null legs");
        }
        this.f92869a = list;
        return this;
    }
}
