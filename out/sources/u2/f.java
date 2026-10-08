package u2;

import java.util.Arrays;
import java.util.ListIterator;
import p071kotlin.Metadata;
import p076m2.w3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\f\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J5\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#JA\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b%\u0010&J?\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)JA\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0001\u0010+J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b,\u0010-J%\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b,\u0010.J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u00100J)\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020201H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0016¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00028\u0000092\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b>\u0010.R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010\u000eR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010C¨\u0006E"}, d2 = {"Lu2/f;", "E", "Lt2/e;", "Lu2/c;", "", "", "root", "tail", "", "size", "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "C", "()I", "filledTail", "newTail", "v", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Lu2/f;", "shift", "w", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "tailIndex", "element", "s", "([Ljava/lang/Object;ILjava/lang/Object;)Lu2/f;", "index", "Lu2/e;", "elementCarry", "o", "([Ljava/lang/Object;IILjava/lang/Object;Lu2/e;)[Ljava/lang/Object;", "rootSize", "B", "([Ljava/lang/Object;III)Lt2/e;", "u", "([Ljava/lang/Object;II)Lt2/e;", "tailCarry", "t", "([Ljava/lang/Object;IILu2/e;)[Ljava/lang/Object;", "A", "k", "(I)[Ljava/lang/Object;", "e", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "add", "(Ljava/lang/Object;)Lt2/e;", "(ILjava/lang/Object;)Lt2/e;", "T0", "(I)Lt2/e;", "Lkotlin/Function1;", "", "predicate", "P2", "(Ler/l;)Lt2/e;", "Lu2/h;", "n", "()Lu2/h;", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "b", "[Ljava/lang/Object;", "c", "d", "I", "f", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f<E> extends c<E> implements t2.e<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object[] root;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object[] tail;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int rootShift;

    public f(Object[] objArr, Object[] objArr2, int i15, int i16) {
        this.root = objArr;
        this.tail = objArr2;
        this.size = i15;
        this.rootShift = i16;
        if (!(size() > 32)) {
            w3.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        x2.a.a(size() - n.d(size()) <= lr.m.j(objArr2.length, 32));
    }

    private final Object[] A(Object[] root, int shift, int index, e tailCarry) {
        int iA = n.a(index, shift);
        if (shift == 0) {
            Object[] objArrCopyOf = iA == 0 ? new Object[32] : Arrays.copyOf(root, 32);
            pq.n.n(root, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = tailCarry.getValue();
            tailCarry.b(root[iA]);
            return objArrCopyOf;
        }
        int iA2 = root[31] == null ? n.a(C() - 1, shift) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        int i15 = shift - 5;
        int i16 = iA + 1;
        if (i16 <= iA2) {
            while (true) {
                objArrCopyOf2[iA2] = A((Object[]) objArrCopyOf2[iA2], i15, 0, tailCarry);
                if (iA2 == i16) {
                    break;
                }
                iA2--;
            }
        }
        objArrCopyOf2[iA] = A((Object[]) objArrCopyOf2[iA], i15, index, tailCarry);
        return objArrCopyOf2;
    }

    private final t2.e<E> B(Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        x2.a.a(index < size);
        if (size == 1) {
            return u(root, rootSize, shift);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        int i15 = size - 1;
        if (index < i15) {
            pq.n.n(this.tail, objArrCopyOf, index, index + 1, size);
        }
        objArrCopyOf[i15] = null;
        return new f(root, objArrCopyOf, (rootSize + size) - 1, shift);
    }

    private final int C() {
        return n.d(size());
    }

    private final Object[] E(Object[] root, int shift, int index, Object e15) {
        int iA = n.a(index, shift);
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        if (shift == 0) {
            objArrCopyOf[iA] = e15;
            return objArrCopyOf;
        }
        objArrCopyOf[iA] = E((Object[]) objArrCopyOf[iA], shift - 5, index, e15);
        return objArrCopyOf;
    }

    private final Object[] k(int index) {
        if (C() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i15 = this.rootShift; i15 > 0; i15 -= 5) {
            objArr = objArr[n.a(index, i15)];
        }
        return objArr;
    }

    private final Object[] o(Object[] root, int shift, int index, Object element, e elementCarry) {
        int iA = n.a(index, shift);
        if (shift == 0) {
            Object[] objArrCopyOf = iA == 0 ? new Object[32] : Arrays.copyOf(root, 32);
            pq.n.n(root, objArrCopyOf, iA + 1, iA, 31);
            elementCarry.b(root[31]);
            objArrCopyOf[iA] = element;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(root, 32);
        int i15 = shift - 5;
        objArrCopyOf2[iA] = o((Object[]) root[iA], i15, index, element, elementCarry);
        while (true) {
            iA++;
            if (iA >= 32 || objArrCopyOf2[iA] == null) {
                break;
            }
            objArrCopyOf2[iA] = o((Object[]) root[iA], i15, 0, elementCarry.getValue(), elementCarry);
        }
        return objArrCopyOf2;
    }

    private final f<E> s(Object[] root, int tailIndex, Object element) {
        int size = size() - C();
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        if (size < 32) {
            pq.n.n(this.tail, objArrCopyOf, tailIndex + 1, tailIndex, size);
            objArrCopyOf[tailIndex] = element;
            return new f<>(root, objArrCopyOf, size() + 1, this.rootShift);
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        pq.n.n(objArr, objArrCopyOf, tailIndex + 1, tailIndex, size - 1);
        objArrCopyOf[tailIndex] = element;
        return v(root, objArrCopyOf, n.c(obj));
    }

    private final Object[] t(Object[] root, int shift, int index, e tailCarry) {
        Object[] objArrT;
        int iA = n.a(index, shift);
        if (shift == 5) {
            tailCarry.b(root[iA]);
            objArrT = null;
        } else {
            objArrT = t((Object[]) root[iA], shift - 5, index, tailCarry);
        }
        if (objArrT == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(root, 32);
        objArrCopyOf[iA] = objArrT;
        return objArrCopyOf;
    }

    private final t2.e<E> u(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            if (root.length == 33) {
                root = Arrays.copyOf(root, 32);
            }
            return new l(root);
        }
        e eVar = new e(null);
        Object[] objArrT = t(root, shift, rootSize - 1, eVar);
        Object[] objArr = (Object[]) eVar.getValue();
        return objArrT[1] == null ? new f((Object[]) objArrT[0], objArr, rootSize, shift - 5) : new f(objArrT, objArr, rootSize, shift);
    }

    private final f<E> v(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i15 = this.rootShift;
        if (size <= (1 << i15)) {
            return new f<>(w(root, i15, filledTail), newTail, size() + 1, this.rootShift);
        }
        Object[] objArrC = n.c(root);
        int i16 = this.rootShift + 5;
        return new f<>(w(objArrC, i16, filledTail), newTail, size() + 1, i16);
    }

    private final Object[] w(Object[] root, int shift, Object[] tail) {
        Object[] objArrCopyOf;
        int iA = n.a(size() - 1, shift);
        if (root == null || (objArrCopyOf = Arrays.copyOf(root, 32)) == null) {
            objArrCopyOf = new Object[32];
        }
        if (shift == 5) {
            objArrCopyOf[iA] = tail;
            return objArrCopyOf;
        }
        objArrCopyOf[iA] = w((Object[]) objArrCopyOf[iA], shift - 5, tail);
        return objArrCopyOf;
    }

    @Override // t2.e
    public t2.e<E> P2(er.l<? super E, Boolean> predicate) {
        h<E> hVarBuilder = builder();
        hVarBuilder.e0(predicate);
        return hVarBuilder.build();
    }

    @Override // t2.e
    public t2.e<E> T0(int index) {
        x2.d.a(index, size());
        int iC = C();
        return index >= iC ? B(this.root, iC, this.rootShift, index - iC) : B(A(this.root, this.rootShift, index, new e(this.tail[0])), iC, this.rootShift, 0);
    }

    @Override // java.util.Collection, java.util.List, t2.e
    public t2.e<E> add(E element) {
        int size = size() - C();
        if (size >= 32) {
            return v(this.root, this.tail, n.c(element));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        objArrCopyOf[size] = element;
        return new f(this.root, objArrCopyOf, size() + 1, this.rootShift);
    }

    @Override // pq.b
    /* JADX INFO: renamed from: f, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // pq.d, java.util.List
    public E get(int index) {
        x2.d.a(index, size());
        return (E) k(index)[index & 31];
    }

    @Override // pq.d, java.util.List
    public ListIterator<E> listIterator(int index) {
        x2.d.b(index, size());
        return new i(this.root, this.tail, index, size(), (this.rootShift / 5) + 1);
    }

    @Override // t2.e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public h<E> builder() {
        return new h<>(this, this.root, this.tail, this.rootShift);
    }

    @Override // pq.d, java.util.List
    public t2.e<E> set(int index, E element) {
        x2.d.a(index, size());
        if (C() > index) {
            return new f(E(this.root, this.rootShift, index, element), this.tail, size(), this.rootShift);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        objArrCopyOf[index & 31] = element;
        return new f(this.root, objArrCopyOf, size(), this.rootShift);
    }

    @Override // java.util.List, t2.e
    public t2.e<E> add(int index, E element) {
        x2.d.b(index, size());
        if (index == size()) {
            return add((Object) element);
        }
        int iC = C();
        if (index >= iC) {
            return s(this.root, index - iC, element);
        }
        e eVar = new e(null);
        return s(o(this.root, this.rootShift, index, element, eVar), 0, eVar.getValue());
    }
}
