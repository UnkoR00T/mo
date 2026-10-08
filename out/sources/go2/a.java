package go2;

import fr.k;
import gx.b;
import java.io.Serializable;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lgo2/a;", "Lgx/b;", "<init>", "()V", "a", "Lgo2/a$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a implements b {

    /* JADX INFO: renamed from: go2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo2/a$a;", "Lgo2/a;", "Lgo2/a$a$a;", "destination", "<init>", "(Lgo2/a$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgo2/a$a$a;", "()Lgo2/a$a$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToNotification extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC1705a destination;

        /* JADX INFO: renamed from: go2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lgo2/a$a$a;", "Ljava/io/Serializable;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum EnumC1705a implements Serializable {
            NOTIFICATION_HISTORY,
            NOTIFICATION_SETTINGS;


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ wq.a f75193d = wq.b.a(b());
        }

        public ToNotification(EnumC1705a enumC1705a) {
            super(null);
            this.destination = enumC1705a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC1705a getDestination() {
            return this.destination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToNotification) && this.destination == ((ToNotification) other).destination;
        }

        public int hashCode() {
            return this.destination.hashCode();
        }

        public String toString() {
            return "ToNotification(destination=" + this.destination + ")";
        }
    }

    public /* synthetic */ a(k kVar) {
        this();
    }

    private a() {
    }
}
