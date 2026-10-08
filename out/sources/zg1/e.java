package zg1;

import fr.t;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzg1/e;", "Lxw/f;", "Lzg1/e$a;", "Lgx/b;", "Lj34/b;", "documentToNavigationMapper", "<init>", "(Lj34/b;)V", "Lr54/c$a;", "notificationItem", "c", "(Lr54/c$a;)Lgx/b;", "Lr54/c$b;", "Lwm3/c$a;", "f", "(Lr54/c$b;)Lwm3/c$a;", "params", "e", "(Lzg1/e$a;)Lgx/b;", "a", "Lj34/b;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, gx.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j34.b documentToNavigationMapper;

    /* JADX INFO: renamed from: zg1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lzg1/e$a;", "", "Lr54/c;", "localNotificationItem", "<init>", "(Lr54/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr54/c;", "()Lr54/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final r54.c localNotificationItem;

        public Params(r54.c cVar) {
            this.localNotificationItem = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final r54.c getLocalNotificationItem() {
            return this.localNotificationItem;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.localNotificationItem, ((Params) other).localNotificationItem);
        }

        public int hashCode() {
            return this.localNotificationItem.hashCode();
        }

        public String toString() {
            return "Params(localNotificationItem=" + this.localNotificationItem + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f235145a;

        static {
            int[] iArr = new int[r54.b.values().length];
            try {
                iArr[r54.b.TEMPORARY_DRIVING_LICENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f235145a = iArr;
        }
    }

    public e(j34.b bVar) {
        this.documentToNavigationMapper = bVar;
    }

    private final gx.b c(r54.c.a notificationItem) {
        String documentSubTypeReferenceName = notificationItem.getDocumentSubTypeReferenceName();
        r54.b bVarValueOf = documentSubTypeReferenceName != null ? r54.b.valueOf(documentSubTypeReferenceName) : null;
        rq0.b bVarA = rq0.b.INSTANCE.a(notificationItem.getDocumentReferenceName());
        if ((bVarValueOf == null ? -1 : b.f235145a[bVarValueOf.ordinal()]) == 1) {
            return ju1.a.b.f105877a;
        }
        if (bVarA != null) {
            return this.documentToNavigationMapper.b(bVarA);
        }
        return null;
    }

    private final wm3.c.ToVehicleCard f(r54.c.b notificationItem) {
        return new wm3.c.ToVehicleCard(new wm3.a.VehicleDetails(notificationItem.getRegistrationNumber()));
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public gx.b b(Params params) {
        r54.c localNotificationItem = params.getLocalNotificationItem();
        if (localNotificationItem instanceof r54.c.a) {
            return c((r54.c.a) localNotificationItem);
        }
        if (localNotificationItem instanceof r54.c.b) {
            return f((r54.c.b) localNotificationItem);
        }
        throw new p();
    }
}
