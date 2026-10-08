package u2;

import java.util.NoSuchElementException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lu2/m;", "E", "Lu2/a;", "", "", "root", "", "index", "size", "height", "<init>", "([Ljava/lang/Object;III)V", "startLevel", "Loq/i0;", "i", "(II)V", "indexPredicate", "k", "(I)V", "h", "()Ljava/lang/Object;", "l", "next", "previous", "c", "I", "d", "[Ljava/lang/Object;", "path", "", "e", "Z", "isInRightEdge", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m<E> extends a<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Object[] path;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isInRightEdge;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public m(Object[] objArr, int i15, int i16, int i17) {
        super(i15, i16);
        this.height = i17;
        Object[] objArr2 = new Object[i17];
        this.path = objArr2;
        ?? r15 = i15 == i16 ? 1 : 0;
        this.isInRightEdge = r15;
        objArr2[0] = objArr;
        i(i15 - r15, 1);
    }

    private final E h() {
        return (E) ((Object[]) this.path[this.height - 1])[getIndex() & 31];
    }

    private final void i(int index, int startLevel) {
        int i15 = (this.height - startLevel) * 5;
        while (startLevel < this.height) {
            Object[] objArr = this.path;
            objArr[startLevel] = ((Object[]) objArr[startLevel - 1])[n.a(index, i15)];
            i15 -= 5;
            startLevel++;
        }
    }

    private final void k(int indexPredicate) {
        int i15 = 0;
        while (n.a(getIndex(), i15) == indexPredicate) {
            i15 += 5;
        }
        if (i15 > 0) {
            i(getIndex(), ((this.height - 1) - (i15 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void l(Object[] root, int index, int size, int height) {
        f(index);
        g(size);
        this.height = height;
        if (this.path.length < height) {
            this.path = new Object[height];
        }
        this.path[0] = root;
        ?? r15 = index == size ? 1 : 0;
        this.isInRightEdge = r15;
        i(index - r15, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eH = h();
        f(getIndex() + 1);
        if (getIndex() == getSize()) {
            this.isInRightEdge = true;
            return eH;
        }
        k(0);
        return eH;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        f(getIndex() - 1);
        if (this.isInRightEdge) {
            this.isInRightEdge = false;
            return h();
        }
        k(31);
        return h();
    }
}
