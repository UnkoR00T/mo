package m10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, d2 = {"Lm10/b;", "", "<init>", "()V", "", "value", "Ljava/time/LocalDate;", "b", "(Ljava/lang/String;)Ljava/time/LocalDate;", "date", "a", "(Ljava/time/LocalDate;)Ljava/lang/String;", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "Ljava/time/format/DateTimeFormatter;", "formatter", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f122453a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

    private b() {
    }

    public static final String a(LocalDate date) {
        if (date != null) {
            return date.format(formatter);
        }
        return null;
    }

    public static final LocalDate b(String value) {
        if (value != null) {
            return (LocalDate) formatter.parse(value, new a());
        }
        return null;
    }
}
