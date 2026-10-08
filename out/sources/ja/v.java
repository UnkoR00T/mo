package ja;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B)\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lja/v;", "T", "Lpq/d;", "", "placeholdersBefore", "placeholdersAfter", "", "items", "<init>", "(IILjava/util/List;)V", "index", "get", "(I)Ljava/lang/Object;", "b", "I", "getPlaceholdersBefore", "()I", "c", "getPlaceholdersAfter", "d", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "f", "size", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v<T> extends pq.d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int placeholdersBefore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int placeholdersAfter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<T> items;

    /* JADX WARN: Multi-variable type inference failed */
    public v(int i15, int i16, List<? extends T> list) {
        this.placeholdersBefore = i15;
        this.placeholdersAfter = i16;
        this.items = list;
    }

    @Override // pq.b
    /* JADX INFO: renamed from: f */
    public int get_size() {
        return this.placeholdersBefore + this.items.size() + this.placeholdersAfter;
    }

    @Override // pq.d, java.util.List
    public T get(int index) {
        if (index >= 0 && index < this.placeholdersBefore) {
            return null;
        }
        int i15 = this.placeholdersBefore;
        if (index < this.items.size() + i15 && i15 <= index) {
            return this.items.get(index - this.placeholdersBefore);
        }
        int size = this.placeholdersBefore + this.items.size();
        if (index < size() && size <= index) {
            return null;
        }
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + index + " in ItemSnapshotList of size " + size());
    }
}
