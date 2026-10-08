package g54;

import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg54/a;", "Lc54/a;", "Lf54/b;", "featureFlagRepository", "<init>", "(Lf54/b;)V", "Lgz/b$a$a;", "params", "", "Lb54/c;", "", "b", "(Lgz/b$a$a;)Ljava/util/Map;", "a", "Lf54/b;", "flags_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements c54.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f54.b featureFlagRepository;

    public a(f54.b bVar) {
        this.featureFlagRepository = bVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map<b54.c, Boolean> a(gz.b.a.C1792a params) {
        b54.c next;
        Map<b54.b, Boolean> mapB = this.featureFlagRepository.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<b54.b, Boolean> entry : mapB.entrySet()) {
            Iterator<b54.c> it = b54.c.w().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!t.c(next.getSerializedName(), entry.getKey().getSerializedName()));
            b54.c cVar = next;
            r rVarA = cVar != null ? y.a(cVar, entry.getValue()) : null;
            if (rVarA != null) {
                arrayList.add(rVarA);
            }
        }
        return v0.s(arrayList);
    }
}
