package tg1;

import fr.k;
import fr.t;
import gx.b;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Ltg1/a;", "Lgx/b;", "<init>", "()V", "d", "e", "b", "a", "c", "f", "Ltg1/a$a;", "Ltg1/a$b;", "Ltg1/a$c;", "Ltg1/a$d;", "Ltg1/a$e;", "Ltg1/a$f;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a implements b {

    /* JADX INFO: renamed from: tg1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltg1/a$a;", "Ltg1/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C4953a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4953a f190065a = new C4953a();

        private C4953a() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C4953a);
        }

        public int hashCode() {
            return -1919593785;
        }

        public String toString() {
            return "MIdRefreshed";
        }
    }

    /* JADX INFO: renamed from: tg1.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltg1/a$b;", "Ltg1/a;", "Lr54/c;", "localNotificationItem", "<init>", "(Lr54/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr54/c;", "()Lr54/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavigateToNotificationDocument extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final r54.c localNotificationItem;

        public NavigateToNotificationDocument(r54.c cVar) {
            super(null);
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
            return (other instanceof NavigateToNotificationDocument) && t.c(this.localNotificationItem, ((NavigateToNotificationDocument) other).localNotificationItem);
        }

        public int hashCode() {
            return this.localNotificationItem.hashCode();
        }

        public String toString() {
            return "NavigateToNotificationDocument(localNotificationItem=" + this.localNotificationItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltg1/a$c;", "Ltg1/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f190067a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -370528708;
        }

        public String toString() {
            return "OpenDocumentsTab";
        }
    }

    /* JADX INFO: renamed from: tg1.a$e, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ltg1/a$e;", "Ltg1/a;", "", "clearProcesses", "Lr54/c;", "localNotificationItem", "<init>", "(ZLr54/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lr54/c;", "()Lr54/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToDashboardWithNotificationNavigation extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean clearProcesses;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final r54.c localNotificationItem;

        public ToDashboardWithNotificationNavigation(boolean z15, r54.c cVar) {
            super(null);
            this.clearProcesses = z15;
            this.localNotificationItem = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getClearProcesses() {
            return this.clearProcesses;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final r54.c getLocalNotificationItem() {
            return this.localNotificationItem;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToDashboardWithNotificationNavigation)) {
                return false;
            }
            ToDashboardWithNotificationNavigation toDashboardWithNotificationNavigation = (ToDashboardWithNotificationNavigation) other;
            return this.clearProcesses == toDashboardWithNotificationNavigation.clearProcesses && t.c(this.localNotificationItem, toDashboardWithNotificationNavigation.localNotificationItem);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.clearProcesses) * 31) + this.localNotificationItem.hashCode();
        }

        public String toString() {
            return "ToDashboardWithNotificationNavigation(clearProcesses=" + this.clearProcesses + ", localNotificationItem=" + this.localNotificationItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltg1/a$f;", "Ltg1/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f190071a = new f();

        private f() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return 1633788239;
        }

        public String toString() {
            return "ToHome";
        }
    }

    public /* synthetic */ a(k kVar) {
        this();
    }

    /* JADX INFO: renamed from: tg1.a$d, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Ltg1/a$d;", "Ltg1/a;", "", "clearProcesses", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToDashboard extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean clearProcesses;

        public ToDashboard(boolean z15) {
            super(null);
            this.clearProcesses = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getClearProcesses() {
            return this.clearProcesses;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToDashboard) && this.clearProcesses == ((ToDashboard) other).clearProcesses;
        }

        public int hashCode() {
            return Boolean.hashCode(this.clearProcesses);
        }

        public String toString() {
            return "ToDashboard(clearProcesses=" + this.clearProcesses + ")";
        }

        public /* synthetic */ ToDashboard(boolean z15, int i15, k kVar) {
            this((i15 & 1) != 0 ? false : z15);
        }
    }

    private a() {
    }
}
