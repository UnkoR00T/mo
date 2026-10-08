package n2;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000b\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\b\u001a\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"", "", "index", "Loq/i0;", "a", "(Ljava/util/List;I)V", "size", "c", "(II)V", "fromIndex", "toIndex", "b", "(Ljava/util/List;II)V", "e", "d", "(I)V", "f", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final void a(List<?> list, int i15) {
        int size = list.size();
        if (i15 < 0 || i15 >= size) {
            c(i15, size);
        }
    }

    public static final void b(List<?> list, int i15, int i16) {
        if (i15 > i16) {
            f(i15, i16);
        }
        if (i15 < 0) {
            d(i15);
        }
        if (i16 > list.size()) {
            e(i16, list.size());
        }
    }

    private static final void c(int i15, int i16) {
        throw new IndexOutOfBoundsException("Index " + i15 + " is out of bounds. The list has " + i16 + " elements.");
    }

    private static final void d(int i15) {
        throw new IndexOutOfBoundsException("fromIndex (" + i15 + ") is less than 0.");
    }

    private static final void e(int i15, int i16) {
        throw new IndexOutOfBoundsException("toIndex (" + i15 + ") is more than than the list size (" + i16 + ')');
    }

    private static final void f(int i15, int i16) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i15 + ") is greater than toIndex (" + i16 + ").");
    }
}
