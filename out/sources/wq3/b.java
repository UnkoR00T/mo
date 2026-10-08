package wq3;

import fr.t;
import iq0.Announcements;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lwq3/b;", "", "b", "a", "Lwq3/b$a;", "Lwq3/b$b;", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: wq3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwq3/b$a;", "Lwq3/b;", "Liq0/c;", "announcements", "<init>", "(Liq0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liq0/c;", "()Liq0/c;", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Announcements announcements;

        public Initialized(Announcements announcements) {
            this.announcements = announcements;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Announcements getAnnouncements() {
            return this.announcements;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initialized) && t.c(this.announcements, ((Initialized) other).announcements);
        }

        public int hashCode() {
            return this.announcements.hashCode();
        }

        public String toString() {
            return "Initialized(announcements=" + this.announcements + ')';
        }
    }

    /* JADX INFO: renamed from: wq3.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwq3/b$b;", "Lwq3/b;", "<init>", "()V", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C5689b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5689b f214472a = new C5689b();

        private C5689b() {
        }
    }
}
