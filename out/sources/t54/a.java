package t54;

import fr.t;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import y54.DocumentNotificationConfigItem;
import y54.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0012\u0010\r¨\u0006\u001a"}, d2 = {"Lt54/a;", "", "<init>", "()V", "", "configId", "Ly54/a;", "d", "(Ljava/lang/String;)Ly54/a;", "", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "idCardNotificationConfig", "f", "studentCardNotificationConfig", "familyCardNotificationConfig", "e", "h", "uutCardNotificationConfig", "a", "drivingLicenceNotificationConfig", "g", "temporaryDrivingLicenceNotificationConfig", "solidarityCardNotificationConfig", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f187954a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<DocumentNotificationConfigItem> idCardNotificationConfig = v.e(new DocumentNotificationConfigItem(rq0.b.d.ID_CARD, new f.After(1), p54.a.f153159n, p54.a.f153158m, null, 16, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final List<DocumentNotificationConfigItem> studentCardNotificationConfig;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final List<DocumentNotificationConfigItem> familyCardNotificationConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final List<DocumentNotificationConfigItem> uutCardNotificationConfig;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final List<DocumentNotificationConfigItem> drivingLicenceNotificationConfig;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final List<DocumentNotificationConfigItem> temporaryDrivingLicenceNotificationConfig;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final List<DocumentNotificationConfigItem> solidarityCardNotificationConfig;

    static {
        rq0.b.d dVar = rq0.b.d.STUDENT_CARD;
        studentCardNotificationConfig = v.q(new DocumentNotificationConfigItem(dVar, new f.OnTime(0L, 1, null), p54.a.f153149d, p54.a.f153162q, null, 16, null), new DocumentNotificationConfigItem(dVar, new f.After(3L), p54.a.f153152g, p54.a.f153162q, null, 16, null), new DocumentNotificationConfigItem(dVar, new f.Before(13L), p54.a.f153146a, p54.a.f153162q, null, 16, null));
        rq0.b.d dVar2 = rq0.b.d.FAMILY_CARD;
        familyCardNotificationConfig = v.q(new DocumentNotificationConfigItem(dVar2, new f.OnTime(0L, 1, null), p54.a.f153149d, p54.a.f153160o, null, 16, null), new DocumentNotificationConfigItem(dVar2, new f.After(3L), p54.a.f153152g, p54.a.f153160o, null, 16, null), new DocumentNotificationConfigItem(dVar2, new f.Before(13L), p54.a.f153146a, p54.a.f153160o, null, 16, null));
        rq0.b.d dVar3 = rq0.b.d.RAILWAY_CARD;
        uutCardNotificationConfig = v.q(new DocumentNotificationConfigItem(dVar3, new f.OnTime(0L, 1, null), p54.a.f153149d, p54.a.f153164s, null, 16, null), new DocumentNotificationConfigItem(dVar3, new f.After(3L), p54.a.f153152g, p54.a.f153164s, null, 16, null), new DocumentNotificationConfigItem(dVar3, new f.Before(13L), p54.a.f153146a, p54.a.f153164s, null, 16, null));
        rq0.b.d dVar4 = rq0.b.d.DRIVING_LICENCE;
        drivingLicenceNotificationConfig = v.q(new DocumentNotificationConfigItem(dVar4, new f.Before(13L), p54.a.f153146a, p54.a.f153157l, null, 16, null), new DocumentNotificationConfigItem(dVar4, new f.OnTime(0L, 1, null), p54.a.f153149d, p54.a.f153157l, null, 16, null), new DocumentNotificationConfigItem(dVar4, new f.After(3L), p54.a.f153152g, p54.a.f153157l, null, 16, null));
        f.Before before = new f.Before(13L);
        int i15 = p54.a.f153146a;
        int i16 = p54.a.f153163r;
        r54.b bVar = r54.b.TEMPORARY_DRIVING_LICENCE;
        temporaryDrivingLicenceNotificationConfig = v.q(new DocumentNotificationConfigItem(dVar4, before, i15, i16, bVar), new DocumentNotificationConfigItem(dVar4, new f.Before(6L), p54.a.f153156k, p54.a.f153163r, bVar), new DocumentNotificationConfigItem(dVar4, new f.Before(2L), p54.a.f153155j, p54.a.f153163r, bVar));
        rq0.b.EnumC4479b enumC4479b = rq0.b.EnumC4479b.SOLIDARITY_CARD;
        solidarityCardNotificationConfig = v.q(new DocumentNotificationConfigItem(enumC4479b, new f.OnTime(0L, 1, null), p54.a.f153149d, p54.a.f153161p, null, 16, null), new DocumentNotificationConfigItem(enumC4479b, new f.After(3L), p54.a.f153152g, p54.a.f153161p, null, 16, null), new DocumentNotificationConfigItem(enumC4479b, new f.Before(13L), p54.a.f153146a, p54.a.f153161p, null, 16, null));
    }

    private a() {
    }

    public final List<DocumentNotificationConfigItem> a() {
        return drivingLicenceNotificationConfig;
    }

    public final List<DocumentNotificationConfigItem> b() {
        return familyCardNotificationConfig;
    }

    public final List<DocumentNotificationConfigItem> c() {
        return idCardNotificationConfig;
    }

    public final DocumentNotificationConfigItem d(String configId) {
        Object next;
        Iterator it = v.A(v.q(idCardNotificationConfig, familyCardNotificationConfig, uutCardNotificationConfig, drivingLicenceNotificationConfig, temporaryDrivingLicenceNotificationConfig, studentCardNotificationConfig, solidarityCardNotificationConfig)).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (t.c(((DocumentNotificationConfigItem) next).b(), configId)) {
                return (DocumentNotificationConfigItem) next;
            }
        }
        next = null;
        return (DocumentNotificationConfigItem) next;
    }

    public final List<DocumentNotificationConfigItem> e() {
        return solidarityCardNotificationConfig;
    }

    public final List<DocumentNotificationConfigItem> f() {
        return studentCardNotificationConfig;
    }

    public final List<DocumentNotificationConfigItem> g() {
        return temporaryDrivingLicenceNotificationConfig;
    }

    public final List<DocumentNotificationConfigItem> h() {
        return uutCardNotificationConfig;
    }
}
