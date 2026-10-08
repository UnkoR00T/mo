package ey0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ley0/a;", "", "<init>", "()V", "Ljava/time/OffsetDateTime;", "offsetDateTime", "", "a", "(Ljava/time/OffsetDateTime;)Ljava/lang/String;", "string", "b", "(Ljava/lang/String;)Ljava/time/OffsetDateTime;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final String a(OffsetDateTime offsetDateTime) {
        return offsetDateTime.toString();
    }

    public final OffsetDateTime b(String string) {
        try {
            return OffsetDateTime.parse(string);
        } catch (Exception unused) {
            return OffsetDateTime.now();
        }
    }
}
