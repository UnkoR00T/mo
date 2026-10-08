package uv0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Luv0/j;", "", "Ljava/time/LocalDate;", "date", "", "state", "country", "<init>", "(Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/time/LocalDate;", "b", "()Ljava/time/LocalDate;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LocalDate date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String country;

    public j(LocalDate localDate, String str, String str2) {
        this.date = localDate;
        this.state = str;
        this.country = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getState() {
        return this.state;
    }
}
