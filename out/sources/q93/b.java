package q93;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lq93/b;", "Lf93/b;", "Lgx/d;", "globalEventManager", "<init>", "(Lgx/d;)V", "", "Le93/a;", "securityThreats", "Loq/i0;", "b", "(Ljava/util/List;)V", "d", "e", "()V", "Lf93/b$a;", "params", "c", "(Lf93/b$a;)V", "a", "Lgx/d;", "threatdetection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f93.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final gx.d globalEventManager;

    public b(gx.d dVar) {
        this.globalEventManager = dVar;
    }

    private final void b(List<? extends e93.a> securityThreats) {
        this.globalEventManager.c(new e93.b.SecurityThreatsDetected(securityThreats));
    }

    private final void d(List<? extends e93.a> securityThreats) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : securityThreats) {
            if (obj instanceof e93.a.Malware) {
                arrayList.add(obj);
            }
        }
        e93.a.Malware malware = (e93.a.Malware) v.l0(arrayList);
        this.globalEventManager.c(new e93.b.MalwareDetected(malware.getPackageName(), malware.getName()));
    }

    private final void e() {
        this.globalEventManager.c(e93.b.c.f48789a);
    }

    @Override // gz.a
    public /* bridge */ /* synthetic */ i0 a(gz.b.a aVar) {
        c((f93.b.Params) aVar);
        return i0.f148189a;
    }

    public void c(f93.b.Params params) {
        if (params.a().isEmpty()) {
            return;
        }
        List<e93.a> listA = params.a();
        if (!(listA instanceof Collection) || !listA.isEmpty()) {
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                if (((e93.a) it.next()) instanceof e93.a.Malware) {
                    d(params.a());
                    return;
                }
            }
        }
        List<e93.a> listA2 = params.a();
        if (!(listA2 instanceof Collection) || !listA2.isEmpty()) {
            Iterator<T> it4 = listA2.iterator();
            while (it4.hasNext()) {
                if (((e93.a) it4.next()) instanceof e93.a.d.C1138a) {
                    e();
                    return;
                }
            }
        }
        b(params.a());
    }
}
