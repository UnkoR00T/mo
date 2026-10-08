package fz;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b+\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u0006-"}, d2 = {"Lfz/c;", "", "", "format", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getFormat", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z", "A", "B", "C", ip.a.f96138c, "E", "F", "G", i.f37087n, "I", "K", i.f37094u, "O", i.f37086m, "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum c {
    DOTTED("dd.MM.yyyy"),
    DOTTED_PLUS_HOUR("dd.MM.yyyy HH:mm"),
    DOTTED_PLUS_HOUR_WITH_COMMA("dd.MM.yyyy, HH:mm"),
    DOTTED_PLUS_HOUR_WITH_SEC("dd.MM.yyyy HH:mm:ss"),
    DOTTED_PLUS_HOUR_WITH_COMMA_SEC("dd.MM.yyyy, HH:mm:ss"),
    DOTTED_PLUS_HOUR_WITH_SPACER_SEC("dd.MM.yyyy | HH:mm:ss"),
    DOTTED_TIME_PLUS_DATE("HH:mm:ss dd.MM.yyyy"),
    SLASHED("dd/MM/yyyy"),
    SLASHED_MONTH_YEAR("MM/yyyy"),
    SPACED("dd MMMM yyyy"),
    MONTH_YEAR("LLLL yyyy"),
    ONLY_HOUR("HH:mm"),
    WITH_SECONDS("HH:mm:ss"),
    FULLDAY_DATEDOT("EEEE, dd.MM.yyyy"),
    FULLDAY_DATEDOT_PLUS_HOUR("EEEE, dd.MM.yyyy, HH:mm"),
    DASHED_REVERSED("yyyy-MM-dd"),
    DASHED_REVERSED_WITH_SEC("yyyy-MM-dd'T'HH:mm:ss"),
    DASHED_REVERSED_WITH_TIME("yyyy-MM-dd (HH:mm:ss)"),
    DASHED_WITH_SEPARATE_TIME_SEC("yyyy-MM-dd'T'HH:mm:ss.SSS"),
    OFFSET_DATE_TIME_ZONE("yyyy-MM-dd'T'HH:mmZ"),
    OFFSET_DATE_TIME_SEC("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"),
    ZONED_DATE_TIME_SEC("yyyy-MM-dd'T'HH:mm:ssXXX"),
    BLANK_REVERSED("yyyyMMdd"),
    FULL_TIME_NO_SPACES("yyyyMMddHHmmssSSS"),
    FULL_TIME_WITHOUT_MS("yyyyMMddHHmmss"),
    NO_SPACES("yyyyMMdd_HHmmss"),
    FULL_MONTH_DATE_TIME("dd MMMM yyyy, HH:mm"),
    DATE_WITH_DAY_OF_THE_WEEK("dd MMMM, EEEE"),
    DATE_DAY_SHORT_MONTH("d MMM"),
    DAY_OF_WEEK_NUMBER("u"),
    DAY_ONLY("EEEE"),
    FULL_MONTH_DATE_TIME_SEC_DOT("dd.MM.yyyy HH:mm:ss"),
    FULL_MONTH_DATE_TIME_COMMA("dd.MM.yyyy, HH:mm"),
    MONTH_DATE_DOT("dd.MM"),
    DAY_MONTH_YEAR_WEEK_DAY_DOTTED("dd.MM.yyyy, EEEE");

    private static final /* synthetic */ wq.a T = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String format;

    c(String str) {
        this.format = str;
    }

    public final String getFormat() {
        return this.format;
    }
}
