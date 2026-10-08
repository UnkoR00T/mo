package oh0;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oh0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\u001e¨\u0006 "}, d2 = {"Loh0/c;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getExpired", "()Z", "expired", "Loh0/b;", "b", "Loh0/b;", "()Loh0/b;", "location", "Loh0/c$a;", "c", "Loh0/c$a;", "()Loh0/c$a;", "rateCode", "Ljava/time/OffsetDateTime;", "d", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "timestamp", "airqualityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirQualityWidgetPointDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("expired")
    private final boolean expired;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("location")
    private final AirQualityWidgetLocationDto location;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("rateCode")
    private final a rateCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("timestamp")
    private final OffsetDateTime timestamp;

    /* JADX INFO: renamed from: oh0.c$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Loh0/c$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "h", "airqualityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        A("A"),
        B("B"),
        C("C"),
        D(ip.a.f96138c),
        E("E"),
        F("F"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ wq.a f145758k = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        a(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AirQualityWidgetLocationDto getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getRateCode() {
        return this.rateCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirQualityWidgetPointDto)) {
            return false;
        }
        AirQualityWidgetPointDto airQualityWidgetPointDto = (AirQualityWidgetPointDto) other;
        return this.expired == airQualityWidgetPointDto.expired && t.c(this.location, airQualityWidgetPointDto.location) && this.rateCode == airQualityWidgetPointDto.rateCode && t.c(this.timestamp, airQualityWidgetPointDto.timestamp);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.expired) * 31) + this.location.hashCode()) * 31) + this.rateCode.hashCode()) * 31) + this.timestamp.hashCode();
    }

    public String toString() {
        return "AirQualityWidgetPointDto(expired=" + this.expired + ", location=" + this.location + ", rateCode=" + this.rateCode + ", timestamp=" + this.timestamp + ')';
    }
}
