package s64;

import iq0.CategoryDashboardServices;
import iq0.DashboardServiceEntry;
import iq0.FeatureFlag;
import iq0.TemporaryInterruption;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import q64.RemoteSettingsData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ls64/j;", "Lh64/j;", "Lq64/b;", "settingsHolder", "Lac4/d;", "getCurrentServerTimeUseCase", "<init>", "(Lq64/b;Lac4/d;)V", "", "f", "()Z", "Ljava/time/OffsetDateTime;", "serverTime", "displayUntil", "d", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)Z", "Lh64/j$a;", "params", "Liq0/g0;", "e", "(Lh64/j$a;Ltq/e;)Ljava/lang/Object;", "a", "Lq64/b;", "b", "Lac4/d;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements h64.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q64.b settingsHolder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.d getCurrentServerTimeUseCase;

    public j(q64.b bVar, ac4.d dVar) {
        this.settingsHolder = bVar;
        this.getCurrentServerTimeUseCase = dVar;
    }

    private final boolean d(OffsetDateTime serverTime, OffsetDateTime displayUntil) {
        return displayUntil.isAfter(serverTime);
    }

    private final boolean f() {
        List<FeatureFlag> listB;
        Object next;
        RemoteSettingsData value = this.settingsHolder.j0().getValue();
        if (value != null && (listB = value.b()) != null) {
            Iterator<T> it = listB.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((FeatureFlag) next).getType() != iq0.y.TEMPORARY_SERVICE_INTERRUPTIONS);
            FeatureFlag featureFlag = (FeatureFlag) next;
            if (featureFlag != null && featureFlag.getFeatureActive()) {
                return true;
            }
        }
        return false;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(h64.j.Params params, tq.e<? super TemporaryInterruption> eVar) {
        List<CategoryDashboardServices> listE;
        Object next;
        TemporaryInterruption temporaryInterruption;
        RemoteSettingsData value = this.settingsHolder.j0().getValue();
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
            if (dashboardServiceEntry != null && (temporaryInterruption = dashboardServiceEntry.getTemporaryInterruption()) != null && d(this.getCurrentServerTimeUseCase.a(gz.b.a.C1792a.f78542a), temporaryInterruption.getDisplayUntil()) && f()) {
                return temporaryInterruption;
            }
        }
        return null;
    }
}
