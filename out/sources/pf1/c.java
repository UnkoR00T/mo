package pf1;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lpf1/c;", "", "Ljava/time/LocalDate;", "from", "to", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LocalDate from;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocalDate to;

    public c(LocalDate localDate, LocalDate localDate2) {
        this.from = localDate;
        this.to = localDate2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getTo() {
        return this.to;
    }
}
