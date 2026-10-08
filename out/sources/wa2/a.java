package wa2;

import fr.k;
import fr.t;
import java.time.OffsetDateTime;
import mx.Label;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lwa2/a;", "", "<init>", "()V", "b", "a", "Lwa2/a$a;", "Lwa2/a$b;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: wa2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwa2/a$a;", "Lwa2/a;", "Lmx/a;", "date", "<init>", "(Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateDivider extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label date;

        public DateDivider(Label label) {
            super(null);
            this.date = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DateDivider) && t.c(this.date, ((DateDivider) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return "DateDivider(date=" + this.date + ')';
        }
    }

    /* JADX INFO: renamed from: wa2.a$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwa2/a$b;", "Lwa2/a;", "Ljava/time/OffsetDateTime;", "itemDate", "Ln50/g;", "singleCardData", "<init>", "(Ljava/time/OffsetDateTime;Ln50/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetDateTime;", "getItemDate", "()Ljava/time/OffsetDateTime;", "b", "Ln50/g;", "()Ln50/g;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoggingToAppEvent extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime itemDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DefaultSingleCardData singleCardData;

        public LoggingToAppEvent(OffsetDateTime offsetDateTime, DefaultSingleCardData defaultSingleCardData) {
            super(null);
            this.itemDate = offsetDateTime;
            this.singleCardData = defaultSingleCardData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DefaultSingleCardData getSingleCardData() {
            return this.singleCardData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoggingToAppEvent)) {
                return false;
            }
            LoggingToAppEvent loggingToAppEvent = (LoggingToAppEvent) other;
            return t.c(this.itemDate, loggingToAppEvent.itemDate) && t.c(this.singleCardData, loggingToAppEvent.singleCardData);
        }

        public int hashCode() {
            return (this.itemDate.hashCode() * 31) + this.singleCardData.hashCode();
        }

        public String toString() {
            return "LoggingToAppEvent(itemDate=" + this.itemDate + ", singleCardData=" + this.singleCardData + ')';
        }
    }

    public /* synthetic */ a(k kVar) {
        this();
    }

    private a() {
    }
}
