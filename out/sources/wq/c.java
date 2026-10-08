package wq;

import java.io.Serializable;
import java.lang.Enum;
import java.util.RandomAccess;
import p071kotlin.Metadata;
import pq.d;
import pq.n;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u00062\u00060\u0007j\u0002`\bB\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lwq/c;", "", "T", "Lwq/a;", "Lpq/d;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "entries", "<init>", "([Ljava/lang/Enum;)V", "", "index", "i", "(I)Ljava/lang/Enum;", "element", "", "h", "(Ljava/lang/Enum;)Z", "k", "(Ljava/lang/Enum;)I", "n", "b", "[Ljava/lang/Enum;", "f", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class c<T extends Enum<T>> extends d<T> implements a<T>, RandomAccess, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T[] entries;

    public c(T[] tArr) {
        this.entries = tArr;
    }

    @Override // pq.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return h((Enum) obj);
        }
        return false;
    }

    @Override // pq.b
    /* JADX INFO: renamed from: f */
    public int get_size() {
        return this.entries.length;
    }

    public boolean h(T element) {
        return ((Enum) n.y0(this.entries, element.ordinal())) == element;
    }

    @Override // pq.d, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public T get(int index) {
        d.INSTANCE.b(index, this.entries.length);
        return this.entries[index];
    }

    @Override // pq.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return k((Enum) obj);
        }
        return -1;
    }

    public int k(T element) {
        int iOrdinal = element.ordinal();
        if (((Enum) n.y0(this.entries, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // pq.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return n((Enum) obj);
        }
        return -1;
    }

    public int n(T element) {
        return k(element);
    }
}
