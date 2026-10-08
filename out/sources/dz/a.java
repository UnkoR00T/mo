package dz;

import java.math.BigDecimal;
import java.util.Locale;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Ldz/a;", "", "Ljava/math/BigDecimal;", "amount", "", "currency", "b", "(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Locale;", "locale", "c", "(Ljava/math/BigDecimal;Ljava/util/Locale;)Ljava/lang/String;", "d", "(Ljava/lang/String;)Ljava/lang/String;", "a", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f45589a;

    /* JADX INFO: renamed from: dz.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldz/a$a;", "", "<init>", "()V", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f45589a = new Companion();

        private Companion() {
        }
    }

    static /* synthetic */ String a(a aVar, BigDecimal bigDecimal, Locale locale, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFormattedString");
        }
        if ((i15 & 2) != 0) {
            locale = Locale.getDefault();
        }
        return aVar.c(bigDecimal, locale);
    }

    String b(BigDecimal amount, String currency);

    String c(BigDecimal amount, Locale locale);

    String d(String currency);
}
