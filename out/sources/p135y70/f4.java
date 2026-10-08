package p135y70;

import fr.k;
import fr.t;
import p071kotlin.Metadata;
import r74.DefaultNotificationDetailsData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Ly70/f4;", "", "<init>", "()V", "a", "Ly70/f4$a;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class f4 {

    /* JADX INFO: renamed from: y70.f4$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly70/f4$a;", "Ly70/f4;", "Lr74/a;", "data", "<init>", "(Lr74/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr74/a;", "()Lr74/a;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DefaultNotification extends f4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DefaultNotificationDetailsData data;

        public DefaultNotification(DefaultNotificationDetailsData defaultNotificationDetailsData) {
            super(null);
            this.data = defaultNotificationDetailsData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DefaultNotificationDetailsData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DefaultNotification) && t.c(this.data, ((DefaultNotification) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "DefaultNotification(data=" + this.data + ')';
        }
    }

    public /* synthetic */ f4(k kVar) {
        this();
    }

    private f4() {
    }
}
