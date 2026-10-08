package l84;

import j84.NotificationsHistoryData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ll84/e;", "", "c", "a", "b", "Ll84/e$a;", "Ll84/e$b;", "Ll84/e$c;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    /* JADX INFO: renamed from: l84.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Ll84/e$a;", "Ll84/e;", "Lj84/a;", "history", "", "notificationsEnabled", "showAlert", "<init>", "(Lj84/a;ZZ)V", "a", "(Lj84/a;ZZ)Ll84/e$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lj84/a;", "c", "()Lj84/a;", "b", "Z", "d", "()Z", "e", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataLoaded implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final NotificationsHistoryData history;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean notificationsEnabled;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showAlert;

        public DataLoaded(NotificationsHistoryData notificationsHistoryData, boolean z15, boolean z16) {
            this.history = notificationsHistoryData;
            this.notificationsEnabled = z15;
            this.showAlert = z16;
        }

        public static /* synthetic */ DataLoaded b(DataLoaded dataLoaded, NotificationsHistoryData notificationsHistoryData, boolean z15, boolean z16, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                notificationsHistoryData = dataLoaded.history;
            }
            if ((i15 & 2) != 0) {
                z15 = dataLoaded.notificationsEnabled;
            }
            if ((i15 & 4) != 0) {
                z16 = dataLoaded.showAlert;
            }
            return dataLoaded.a(notificationsHistoryData, z15, z16);
        }

        public final DataLoaded a(NotificationsHistoryData history, boolean notificationsEnabled, boolean showAlert) {
            return new DataLoaded(history, notificationsEnabled, showAlert);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final NotificationsHistoryData getHistory() {
            return this.history;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getNotificationsEnabled() {
            return this.notificationsEnabled;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getShowAlert() {
            return this.showAlert;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataLoaded)) {
                return false;
            }
            DataLoaded dataLoaded = (DataLoaded) other;
            return fr.t.c(this.history, dataLoaded.history) && this.notificationsEnabled == dataLoaded.notificationsEnabled && this.showAlert == dataLoaded.showAlert;
        }

        public int hashCode() {
            return (((this.history.hashCode() * 31) + Boolean.hashCode(this.notificationsEnabled)) * 31) + Boolean.hashCode(this.showAlert);
        }

        public String toString() {
            return "DataLoaded(history=" + this.history + ", notificationsEnabled=" + this.notificationsEnabled + ", showAlert=" + this.showAlert + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ll84/e$b;", "Ll84/e;", "<init>", "()V", "a", "b", "Ll84/e$b$a;", "Ll84/e$b$b;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b implements e {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll84/e$b$a;", "Ll84/e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f117048a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1754308570;
            }

            public String toString() {
                return "NoData";
            }
        }

        /* JADX INFO: renamed from: l84.e$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll84/e$b$b;", "Ll84/e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C2833b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2833b f117049a = new C2833b();

            private C2833b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2833b);
            }

            public int hashCode() {
                return -2078455651;
            }

            public String toString() {
                return "NoNotificationPermissions";
            }
        }

        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll84/e$c;", "Ll84/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f117050a = new c();

        private c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -1573979755;
        }

        public String toString() {
            return "Initial";
        }
    }
}
