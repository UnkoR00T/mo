package fz;

import fr.k;
import fr.t;
import java.time.Instant;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lfz/b;", "", "<init>", "()V", "f", "g", "c", "d", "h", "e", "a", "i", "b", "Lfz/b$a;", "Lfz/b$b;", "Lfz/b$c;", "Lfz/b$d;", "Lfz/b$e;", "Lfz/b$f;", "Lfz/b$g;", "Lfz/b$h;", "Lfz/b$i;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: fz.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfz/b$a;", "Lfz/b;", "Ljava/util/Date;", "date", "<init>", "(Ljava/util/Date;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Date;", "()Ljava/util/Date;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Date extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final java.util.Date date;

        public Date(java.util.Date date) {
            super(null);
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final java.util.Date getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Date) && t.c(this.date, ((Date) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public java.lang.String toString() {
            return "Date(date=" + this.date + ")";
        }
    }

    /* JADX INFO: renamed from: fz.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfz/b$b;", "Lfz/b;", "Ljava/time/Instant;", "instant", "Ljava/time/Instant;", "a", "()Ljava/time/Instant;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1545b extends b {
        public final Instant a() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: fz.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfz/b$c;", "Lfz/b;", "Ljava/time/LocalDate;", "date", "<init>", "(Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocalDate extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f68860b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final java.time.LocalDate date;

        public LocalDate(java.time.LocalDate localDate) {
            super(null);
            this.date = localDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final java.time.LocalDate getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LocalDate) && t.c(this.date, ((LocalDate) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public java.lang.String toString() {
            return "LocalDate(date=" + this.date + ")";
        }
    }

    /* JADX INFO: renamed from: fz.b$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfz/b$d;", "Lfz/b;", "Ljava/time/LocalDateTime;", "date", "<init>", "(Ljava/time/LocalDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDateTime;", "()Ljava/time/LocalDateTime;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocalDateTime extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f68862b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final java.time.LocalDateTime date;

        public LocalDateTime(java.time.LocalDateTime localDateTime) {
            super(null);
            this.date = localDateTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final java.time.LocalDateTime getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LocalDateTime) && t.c(this.date, ((LocalDateTime) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public java.lang.String toString() {
            return "LocalDateTime(date=" + this.date + ")";
        }
    }

    /* JADX INFO: renamed from: fz.b$e, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfz/b$e;", "Lfz/b;", "", "date", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Long extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long date;

        public Long(long j15) {
            super(null);
            this.date = j15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Long) && this.date == ((Long) other).date;
        }

        public int hashCode() {
            return java.lang.Long.hashCode(this.date);
        }

        public java.lang.String toString() {
            return "Long(date=" + this.date + ")";
        }
    }

    /* JADX INFO: renamed from: fz.b$f, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfz/b$f;", "Lfz/b;", "Ljava/time/OffsetDateTime;", "date", "<init>", "(Ljava/time/OffsetDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OffsetDateTime extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f68865b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final java.time.OffsetDateTime date;

        public OffsetDateTime(java.time.OffsetDateTime offsetDateTime) {
            super(null);
            this.date = offsetDateTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final java.time.OffsetDateTime getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OffsetDateTime) && t.c(this.date, ((OffsetDateTime) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public java.lang.String toString() {
            return "OffsetDateTime(date=" + this.date + ")";
        }
    }

    /* JADX INFO: renamed from: fz.b$g, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfz/b$g;", "Lfz/b;", "Ljava/time/OffsetTime;", "date", "<init>", "(Ljava/time/OffsetTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetTime;", "()Ljava/time/OffsetTime;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OffsetTime extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f68867b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final java.time.OffsetTime date;

        public OffsetTime(java.time.OffsetTime offsetTime) {
            super(null);
            this.date = offsetTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final java.time.OffsetTime getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OffsetTime) && t.c(this.date, ((OffsetTime) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public java.lang.String toString() {
            return "OffsetTime(date=" + this.date + ")";
        }
    }

    /* JADX INFO: renamed from: fz.b$i, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfz/b$i;", "Lfz/b;", "Ljava/time/YearMonth;", "yearMonth", "<init>", "(Ljava/time/YearMonth;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/YearMonth;", "()Ljava/time/YearMonth;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class YearMonth extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f68872b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final java.time.YearMonth yearMonth;

        public YearMonth(java.time.YearMonth yearMonth) {
            super(null);
            this.yearMonth = yearMonth;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final java.time.YearMonth getYearMonth() {
            return this.yearMonth;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof YearMonth) && t.c(this.yearMonth, ((YearMonth) other).yearMonth);
        }

        public int hashCode() {
            return this.yearMonth.hashCode();
        }

        public java.lang.String toString() {
            return "YearMonth(yearMonth=" + this.yearMonth + ")";
        }
    }

    public /* synthetic */ b(k kVar) {
        this();
    }

    private b() {
    }

    /* JADX INFO: renamed from: fz.b$h, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lfz/b$h;", "Lfz/b;", "", "date", "Lfz/c;", "formatType", "", "useDailySavings", "<init>", "(Ljava/lang/String;Lfz/c;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lfz/c;", "()Lfz/c;", "c", "Z", "()Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class String extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final java.lang.String date;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final c formatType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean useDailySavings;

        public String(java.lang.String str, c cVar, boolean z15) {
            super(null);
            this.date = str;
            this.formatType = cVar;
            this.useDailySavings = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final java.lang.String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getFormatType() {
            return this.formatType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getUseDailySavings() {
            return this.useDailySavings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof String)) {
                return false;
            }
            String string = (String) other;
            return t.c(this.date, string.date) && this.formatType == string.formatType && this.useDailySavings == string.useDailySavings;
        }

        public int hashCode() {
            int iHashCode = this.date.hashCode() * 31;
            c cVar = this.formatType;
            return ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.useDailySavings);
        }

        public java.lang.String toString() {
            return "String(date=" + this.date + ", formatType=" + this.formatType + ", useDailySavings=" + this.useDailySavings + ")";
        }

        public /* synthetic */ String(java.lang.String str, c cVar, boolean z15, int i15, k kVar) {
            this(str, (i15 & 2) != 0 ? null : cVar, (i15 & 4) != 0 ? false : z15);
        }
    }
}
