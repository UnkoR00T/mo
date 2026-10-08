package mx;

import fu.o;
import fu.r;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u0004*\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "c", "(Ljava/lang/String;)Ljava/lang/String;", "tag", "Lmx/a;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lmx/a;", "d", "", "a", "(Lmx/a;)Z", "domain"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final boolean a(Label label) {
        String text = label != null ? label.getText() : null;
        return text == null || text.length() == 0;
    }

    public static final Label b(String str, String str2) {
        return new Label(str, str2);
    }

    public static final String c(String str) {
        List listN;
        List<String> listI = new o("_").i(str, 0);
        if (listI.isEmpty()) {
            listN = v.n();
            break;
        }
        ListIterator<String> listIterator = listI.listIterator(listI.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listN = v.n();
                break;
            }
            if (listIterator.previous().length() != 0) {
                listN = v.X0(listI, listIterator.nextIndex() + 1);
                break;
            }
        }
        String str2 = "";
        for (String str3 : (String[]) listN.toArray(new String[0])) {
            str2 = str2 + (str3.substring(0, 1).toUpperCase(Locale.getDefault()) + str3.substring(1));
        }
        return str2;
    }

    public static final Label d(String str, String str2) {
        if (str == null) {
            str = "-";
        }
        return new Label(r.t0(str) ? "-" : str, str2);
    }
}
