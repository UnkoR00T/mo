package a14;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"La14/a;", "Lgz/b;", "La14/a$a;", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends gz.b<Params, dx.i<? extends dx.b.Business, ? extends i0>> {

    /* JADX INFO: renamed from: a14.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b \u0010\u000e¨\u0006$"}, d2 = {"La14/a$a;", "Lgz/b$a;", "", "eventTitle", "", "eventStartTimeMillis", "eventEndTimeMillis", "", "eventAllDay", "eventDescription", "eventLocation", "<init>", "(Ljava/lang/String;JLjava/lang/Long;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "J", "f", "()J", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "d", "Z", "()Z", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String eventTitle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long eventStartTimeMillis;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long eventEndTimeMillis;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean eventAllDay;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String eventDescription;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String eventLocation;

        public Params(String str, long j15, Long l15, boolean z15, String str2, String str3) {
            this.eventTitle = str;
            this.eventStartTimeMillis = j15;
            this.eventEndTimeMillis = l15;
            this.eventAllDay = z15;
            this.eventDescription = str2;
            this.eventLocation = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEventAllDay() {
            return this.eventAllDay;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEventDescription() {
            return this.eventDescription;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getEventEndTimeMillis() {
            return this.eventEndTimeMillis;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getEventLocation() {
            return this.eventLocation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.eventTitle, params.eventTitle) && this.eventStartTimeMillis == params.eventStartTimeMillis && fr.t.c(this.eventEndTimeMillis, params.eventEndTimeMillis) && this.eventAllDay == params.eventAllDay && fr.t.c(this.eventDescription, params.eventDescription) && fr.t.c(this.eventLocation, params.eventLocation);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getEventStartTimeMillis() {
            return this.eventStartTimeMillis;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getEventTitle() {
            return this.eventTitle;
        }

        public int hashCode() {
            int iHashCode = ((this.eventTitle.hashCode() * 31) + Long.hashCode(this.eventStartTimeMillis)) * 31;
            Long l15 = this.eventEndTimeMillis;
            int iHashCode2 = (((iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31) + Boolean.hashCode(this.eventAllDay)) * 31;
            String str = this.eventDescription;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.eventLocation;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Params(eventTitle=" + this.eventTitle + ", eventStartTimeMillis=" + this.eventStartTimeMillis + ", eventEndTimeMillis=" + this.eventEndTimeMillis + ", eventAllDay=" + this.eventAllDay + ", eventDescription=" + this.eventDescription + ", eventLocation=" + this.eventLocation + ")";
        }

        public /* synthetic */ Params(String str, long j15, Long l15, boolean z15, String str2, String str3, int i15, fr.k kVar) {
            this(str, j15, (i15 & 4) != 0 ? null : l15, z15, (i15 & 16) != 0 ? null : str2, (i15 & 32) != 0 ? null : str3);
        }
    }
}
