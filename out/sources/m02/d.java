package m02;

import fu.r;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "b", "(Ljava/lang/String;)Ljava/lang/String;", "a", "", "Lm02/c;", "", "c", "(Ljava/util/List;)F", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final String a(String str) {
        return r.g1(str, ".", null, 2, null);
    }

    public static final String b(String str) {
        return r.o1(str, ".", null, 2, null);
    }

    public static final float c(List<? extends c> list) {
        Iterator<T> it = list.iterator();
        double sizeInBytes = 0.0d;
        while (it.hasNext()) {
            sizeInBytes += (double) ((c) it.next()).getMetadata().getSizeInBytes();
        }
        return (float) sizeInBytes;
    }
}
