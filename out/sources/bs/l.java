package bs;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends h implements qs.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f21248c;

    public l(zs.f fVar, Object[] objArr) {
        super(fVar, null);
        this.f21248c = objArr;
    }

    @Override // qs.e
    public List<h> c() {
        Object[] objArr = this.f21248c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(h.f21242b.a(obj, null));
        }
        return arrayList;
    }
}
