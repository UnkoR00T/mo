package gu;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u000fB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0019"}, d2 = {"Lgu/n;", "", "", "year", "month", "day", "hour", "minute", "second", "nanosecond", "<init>", "(IIIIIII)V", "", "toString", "()Ljava/lang/String;", "a", "I", "g", "()I", "b", "d", "c", "e", "f", "h", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class n {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int year;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int month;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int day;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int hour;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int minute;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int second;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int nanosecond;

    /* JADX INFO: renamed from: gu.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgu/n$a;", "", "<init>", "()V", "Lgu/h;", "instant", "Lgu/n;", "a", "(Lgu/h;)Lgu/n;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final n a(h instant) {
            long j15;
            long epochSeconds = instant.getEpochSeconds();
            long j16 = epochSeconds / 86400;
            if ((epochSeconds ^ 86400) < 0 && j16 * 86400 != epochSeconds) {
                j16--;
            }
            long j17 = epochSeconds % 86400;
            int i15 = (int) (j17 + (86400 & (((j17 ^ 86400) & ((-j17) | j17)) >> 63)));
            long j18 = (j16 + ((long) 719528)) - ((long) 60);
            if (j18 < 0) {
                long j19 = 146097;
                long j25 = ((j18 + 1) / j19) - 1;
                j15 = ((long) 400) * j25;
                j18 += (-j25) * j19;
            } else {
                j15 = 0;
            }
            long j26 = 400;
            long j27 = ((j26 * j18) + ((long) 591)) / ((long) 146097);
            long j28 = 365;
            long j29 = 4;
            long j35 = 100;
            long j36 = j18 - ((((j28 * j27) + (j27 / j29)) - (j27 / j35)) + (j27 / j26));
            if (j36 < 0) {
                j27--;
                j36 = j18 - ((((j28 * j27) + (j27 / j29)) - (j27 / j35)) + (j27 / j26));
            }
            int i16 = (int) j36;
            int i17 = ((i16 * 5) + 2) / 153;
            int i18 = i15 / 3600;
            int i19 = i15 - (i18 * 3600);
            int i25 = i19 / 60;
            return new n((int) (j27 + j15 + ((long) (i17 / 10))), ((i17 + 2) % 12) + 1, (i16 - (((i17 * 306) + 5) / 10)) + 1, i18, i25, i19 - (i25 * 60), instant.getNanosecondsOfSecond());
        }

        private Companion() {
        }
    }

    public n(int i15, int i16, int i17, int i18, int i19, int i25, int i26) {
        this.year = i15;
        this.month = i16;
        this.day = i17;
        this.hour = i18;
        this.minute = i19;
        this.second = i25;
        this.nanosecond = i26;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getNanosecond() {
        return this.nanosecond;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSecond() {
        return this.second;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    public String toString() {
        return "UnboundLocalDateTime(" + this.year + '-' + this.month + '-' + this.day + ' ' + this.hour + ':' + this.minute + ':' + this.second + '.' + this.nanosecond + ')';
    }
}
