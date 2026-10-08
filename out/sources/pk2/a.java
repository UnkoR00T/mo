package pk2;

import ez.e;
import fu.r;
import fz.c;
import java.time.OffsetDateTime;
import mx.Label;
import mx.b;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lez/e;", "Ljava/time/OffsetDateTime;", "date", "", "tag", "Lmx/a;", "a", "(Lez/e;Ljava/time/OffsetDateTime;Ljava/lang/String;)Lmx/a;", "Lmx/c;", "labelProvider", "b", "(Ljava/lang/String;Lmx/c;)Ljava/lang/String;", "midcard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final Label a(e eVar, OffsetDateTime offsetDateTime, String str) {
        return b.d(offsetDateTime != null ? eVar.d(new fz.b.OffsetDateTime(offsetDateTime), c.DOTTED) : null, str);
    }

    public static final String b(String str, mx.c cVar) {
        return (str == null || str.length() == 0 || r.b0(str, cVar.c(ik2.a.f93204k0).getText(), true)) ? cVar.c(ik2.a.f93204k0).getText() : str;
    }
}
