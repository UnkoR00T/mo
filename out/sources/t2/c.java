package t2;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tJ%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lt2/c;", "E", "", "Lt2/b;", "", "fromIndex", "toIndex", "subList", "(II)Lt2/c;", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c<E> extends List<E>, b<E>, gr.a {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lt2/c$a;", "E", "Lt2/c;", "Lpq/d;", "source", "", "fromIndex", "toIndex", "<init>", "(Lt2/c;II)V", "index", "get", "(I)Ljava/lang/Object;", "subList", "(II)Lt2/c;", "b", "Lt2/c;", "c", "I", "d", "e", "_size", "f", "()I", "size", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a<E> extends pq.d<E> implements c<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final c<E> source;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int fromIndex;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int toIndex;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int _size;

        /* JADX WARN: Multi-variable type inference failed */
        public a(c<? extends E> cVar, int i15, int i16) {
            this.source = cVar;
            this.fromIndex = i15;
            this.toIndex = i16;
            x2.d.c(i15, i16, cVar.size());
            this._size = i16 - i15;
        }

        @Override // pq.b
        /* JADX INFO: renamed from: f, reason: from getter */
        public int get_size() {
            return this._size;
        }

        @Override // pq.d, java.util.List
        public E get(int index) {
            x2.d.a(index, this._size);
            return this.source.get(this.fromIndex + index);
        }

        @Override // pq.d, java.util.List
        public c<E> subList(int fromIndex, int toIndex) {
            x2.d.c(fromIndex, toIndex, this._size);
            c<E> cVar = this.source;
            int i15 = this.fromIndex;
            return new a(cVar, fromIndex + i15, i15 + toIndex);
        }
    }

    @Override // java.util.List
    default c<E> subList(int fromIndex, int toIndex) {
        return new a(this, fromIndex, toIndex);
    }
}
