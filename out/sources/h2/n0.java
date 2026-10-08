package h2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "localeFormat", "Lh2/w0;", "a", "(Ljava/lang/String;)Lh2/w0;", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n0 {
    public static final DateInputFormat a(String str) {
        String strO0 = fu.r.O0(fu.r.P(new fu.o("y{1,4}").h(new fu.o("M{1,2}").h(new fu.o("d{1,2}").h(new fu.o("[^dMy/\\-.]").h(str, ""), "dd"), "MM"), "yyyy"), "My", "M/y", false, 4, null), ".");
        return new DateInputFormat(strO0, fu.o.c(new fu.o("[/\\-.]"), strO0, 0, 2, null).b().get(0).getValue().charAt(0));
    }
}
