package u70;

import java.time.OffsetDateTime;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lu70/s0;", "Lhz/e;", "Lu70/b;", "Ljava/time/OffsetDateTime;", "<init>", "()V", "Lgu/b;", "timeInterval", "date", "Lmx/a;", "message", "l", "(JLjava/time/OffsetDateTime;Lmx/a;)Lhz/e;", "j", "validators_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s0 extends b<OffsetDateTime> implements hz.e {
    @Override // hz.e
    public hz.e j(long timeInterval, OffsetDateTime date, Label message) {
        g(new p(timeInterval, date, message, null));
        return this;
    }

    @Override // hz.e
    public hz.e l(long timeInterval, OffsetDateTime date, Label message) {
        g(new o(timeInterval, date, message, null));
        return this;
    }
}
