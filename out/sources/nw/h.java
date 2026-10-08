package nw;

import fr.k;
import fr.t;
import java.util.ArrayList;
import java.util.List;
import nw.i.a;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lnw/h;", "", "a", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: nw.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnw/h$a;", "", "<init>", "()V", "Lnw/i$a;", "Lnw/i;", "info", "", "lookup", "", "c", "(Lnw/i$a;I)Z", "b", "tokensCache", "Llr/i;", "textRange", "", "a", "(Lnw/i;Llr/i;)Ljava/util/List;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final List<lr.i> a(i tokensCache, lr.i textRange) {
            ArrayList arrayList = new ArrayList();
            int first = textRange.getFirst();
            int last = textRange.getLast();
            int i15 = last - 1;
            if (first <= i15) {
                int i16 = first;
                while (true) {
                    if (t.c(tokensCache.new a(first).h(), yv.e.f229923d)) {
                        if (i16 < first) {
                            arrayList.add(new lr.i(i16, first - 1));
                        }
                        i16 = first + 1;
                    }
                    if (first == i15) {
                        break;
                    }
                    first++;
                }
                first = i16;
            }
            if (first < last) {
                arrayList.add(new lr.i(first, last));
            }
            return arrayList;
        }

        public final boolean b(i.a info, int lookup) {
            return p053fw.c.b(info.b(lookup));
        }

        public final boolean c(i.a info, int lookup) {
            return p053fw.c.c(info.b(lookup));
        }

        private Companion() {
        }
    }
}
