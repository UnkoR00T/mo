package tq3;

import iq0.Announcement;
import iq0.Announcements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import oq.i0;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltq3/a;", "Lgz/b;", "Liq0/c;", "Loq/i0;", "Lsq3/b;", "displayedIdsDataSource", "Lsq3/a;", "announcementsDataSource", "<init>", "(Lsq3/b;Lsq3/a;)V", "params", "d", "(Liq0/c;Ltq/e;)Ljava/lang/Object;", "a", "Lsq3/b;", "b", "Lsq3/a;", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<Announcements, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sq3.b displayedIdsDataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sq3.a announcementsDataSource;

    public a(sq3.b bVar, sq3.a aVar) {
        this.displayedIdsDataSource = bVar;
        this.announcementsDataSource = aVar;
    }

    public Object d(Announcements announcements, tq.e<? super i0> eVar) {
        Set<Long> setB = this.displayedIdsDataSource.b();
        List<Announcement> listA = announcements.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(vq.b.f(((Announcement) it.next()).getId()));
        }
        this.displayedIdsDataSource.a(v.k1(e1.l(setB, arrayList)));
        this.announcementsDataSource.a(null);
        return i0.f148189a;
    }
}
