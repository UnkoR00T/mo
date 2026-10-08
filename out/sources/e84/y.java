package e84;

import d84.NotificationSettingsSection;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Le84/y;", "", "Lw74/a;", "a", "()Lw74/a;", "config", "b", "Le84/y$a;", "Le84/y$b;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface y {

    /* JADX INFO: renamed from: e84.y$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, d2 = {"Le84/y$a;", "Le84/y;", "", "Ld84/c;", "notificationSettings", "Lw74/a;", "config", "<init>", "(Ljava/util/List;Lw74/a;)V", "b", "(Ljava/util/List;Lw74/a;)Le84/y$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lw74/a;", "()Lw74/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<NotificationSettingsSection> notificationSettings;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final w74.a config;

        public Initialized(List<NotificationSettingsSection> list, w74.a aVar) {
            this.notificationSettings = list;
            this.config = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized c(Initialized initialized, List list, w74.a aVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                list = initialized.notificationSettings;
            }
            if ((i15 & 2) != 0) {
                aVar = initialized.config;
            }
            return initialized.b(list, aVar);
        }

        @Override // e84.y
        /* JADX INFO: renamed from: a, reason: from getter */
        public w74.a getConfig() {
            return this.config;
        }

        public final Initialized b(List<NotificationSettingsSection> notificationSettings, w74.a config) {
            return new Initialized(notificationSettings, config);
        }

        public final List<NotificationSettingsSection> d() {
            return this.notificationSettings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.notificationSettings, initialized.notificationSettings) && this.config == initialized.config;
        }

        public int hashCode() {
            return (this.notificationSettings.hashCode() * 31) + this.config.hashCode();
        }

        public String toString() {
            return "Initialized(notificationSettings=" + this.notificationSettings + ", config=" + this.config + ')';
        }
    }

    /* JADX INFO: renamed from: e84.y$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Le84/y$b;", "Le84/y;", "Li84/b$b;", "notificationsStatus", "Lw74/a;", "config", "<init>", "(Li84/b$b;Lw74/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li84/b$b;", "b", "()Li84/b$b;", "Lw74/a;", "()Lw74/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoPermission implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i84.b.InterfaceC2143b notificationsStatus;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final w74.a config;

        public NoPermission(i84.b.InterfaceC2143b interfaceC2143b, w74.a aVar) {
            this.notificationsStatus = interfaceC2143b;
            this.config = aVar;
        }

        @Override // e84.y
        /* JADX INFO: renamed from: a, reason: from getter */
        public w74.a getConfig() {
            return this.config;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final i84.b.InterfaceC2143b getNotificationsStatus() {
            return this.notificationsStatus;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoPermission)) {
                return false;
            }
            NoPermission noPermission = (NoPermission) other;
            return fr.t.c(this.notificationsStatus, noPermission.notificationsStatus) && this.config == noPermission.config;
        }

        public int hashCode() {
            return (this.notificationsStatus.hashCode() * 31) + this.config.hashCode();
        }

        public String toString() {
            return "NoPermission(notificationsStatus=" + this.notificationsStatus + ", config=" + this.config + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    w74.a getConfig();
}
