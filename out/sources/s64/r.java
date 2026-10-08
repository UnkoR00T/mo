package s64;

import iq0.CategoryDashboardServices;
import iq0.DashboardServiceEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import q64.RemoteSettingsData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ls64/r;", "Lh64/n;", "Lq64/b;", "settingsHolder", "<init>", "(Lq64/b;)V", "Lh64/n$a;", "params", "", "d", "(Lh64/n$a;Ltq/e;)Ljava/lang/Object;", "a", "Lq64/b;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements h64.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q64.b settingsHolder;

    public r(q64.b bVar) {
        this.settingsHolder = bVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(h64.n.Params params, tq.e<? super Boolean> eVar) {
        List<CategoryDashboardServices> listE;
        Object next;
        RemoteSettingsData value = this.settingsHolder.j0().getValue();
        boolean z15 = true;
        if (value != null && (listE = value.e()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listE.iterator();
            while (it.hasNext()) {
                pq.v.D(arrayList, ((CategoryDashboardServices) it.next()).b());
            }
            Iterator it4 = arrayList.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (((DashboardServiceEntry) next).getType() != params.getServiceType());
            DashboardServiceEntry dashboardServiceEntry = (DashboardServiceEntry) next;
            if (dashboardServiceEntry != null && dashboardServiceEntry.getTemporaryInterruption() == null) {
                z15 = false;
            }
        }
        return vq.b.a(z15);
    }
}
