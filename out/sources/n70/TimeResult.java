package n70;

import java.time.OffsetTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: n70.g, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0006\u0010\u001a¨\u0006\u001b"}, d2 = {"Ln70/g;", "", "", "hour", "minute", "", "is24hour", "<init>", "(IIZ)V", "Lfz/b$g;", "a", "()Lfz/b$g;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getHour", "b", "getMinute", "c", "Z", "()Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TimeResult {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f133390d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int hour;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minute;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean is24hour;

    public TimeResult(int i15, int i16, boolean z15) {
        this.hour = i15;
        this.minute = i16;
        this.is24hour = z15;
    }

    public final fz.b.OffsetTime a() {
        return new fz.b.OffsetTime(OffsetTime.of(this.hour, this.minute, 0, 0, OffsetTime.now().getOffset()));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeResult)) {
            return false;
        }
        TimeResult timeResult = (TimeResult) other;
        return this.hour == timeResult.hour && this.minute == timeResult.minute && this.is24hour == timeResult.is24hour;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.hour) * 31) + Integer.hashCode(this.minute)) * 31) + Boolean.hashCode(this.is24hour);
    }

    public String toString() {
        return "TimeResult(hour=" + this.hour + ", minute=" + this.minute + ", is24hour=" + this.is24hour + ')';
    }
}
