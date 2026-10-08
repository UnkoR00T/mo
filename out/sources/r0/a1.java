package r0;

import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00028\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u0006J\u0015\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u0017JY\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u001c2\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001c\u0018\u00010\"H\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b*\u0010\nJ\u000f\u0010+\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,R$\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020-8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\t\u0010.\u0012\u0004\b/\u00100R\u001c\u00104\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\r\u00102\u0012\u0004\b3\u00100R\u0011\u00106\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b5\u0010(\u0082\u0001\u00017¨\u00068"}, d2 = {"Lr0/a1;", "E", "", "", "initialCapacity", "<init>", "(I)V", "element", "", "a", "(Ljava/lang/Object;)Z", "", "elements", "b", "(Ljava/lang/Iterable;)Z", "c", "()Ljava/lang/Object;", "index", "d", "(I)Ljava/lang/Object;", "Loq/i0;", "l", "f", "(Ljava/lang/Object;)I", "g", "()Z", "h", "k", "", "separator", "prefix", "postfix", "limit", "truncated", "Lkotlin/Function1;", "transform", "", "i", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ler/l;)Ljava/lang/String;", "hashCode", "()I", "other", "equals", "toString", "()Ljava/lang/String;", "", "[Ljava/lang/Object;", "getContent$annotations", "()V", "content", "I", "get_size$annotations", "_size", "e", "size", "Lr0/q0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class a1<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Object[] content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int _size;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "element", "", "c", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class a extends fr.w implements er.l<E, CharSequence> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1<E> f169802b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a1<E> a1Var) {
            super(1);
            this.f169802b = a1Var;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CharSequence b(E e15) {
            return e15 == this.f169802b ? "(this)" : String.valueOf(e15);
        }
    }

    public /* synthetic */ a1(int i15, fr.k kVar) {
        this(i15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String j(a1 a1Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, er.l lVar, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i16 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i16 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i16 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i16 & 8) != 0) {
            i15 = -1;
        }
        if ((i16 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i16 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        er.l lVar2 = lVar;
        return a1Var.i(charSequence, charSequence2, charSequence3, i15, charSequence5, lVar2);
    }

    public final boolean a(E element) {
        return f(element) >= 0;
    }

    public final boolean b(Iterable<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!a(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final E c() {
        if (g()) {
            s0.d.d("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    public final E d(int index) {
        if (index < 0 || index >= this._size) {
            l(index);
        }
        return (E) this.content[index];
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public boolean equals(Object other) {
        if (other instanceof a1) {
            a1 a1Var = (a1) other;
            int i15 = a1Var._size;
            int i16 = this._size;
            if (i15 == i16) {
                Object[] objArr = this.content;
                Object[] objArr2 = a1Var.content;
                lr.i iVarW = lr.m.w(0, i16);
                int first = iVarW.getFirst();
                int last = iVarW.getLast();
                if (first > last) {
                    return true;
                }
                while (fr.t.c(objArr[first], objArr2[first])) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(E element) {
        int i15 = 0;
        if (element == null) {
            Object[] objArr = this.content;
            int i16 = this._size;
            while (i15 < i16) {
                if (objArr[i15] == null) {
                    return i15;
                }
                i15++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i17 = this._size;
        while (i15 < i17) {
            if (element.equals(objArr2[i15])) {
                return i15;
            }
            i15++;
        }
        return -1;
    }

    public final boolean g() {
        return this._size == 0;
    }

    public final boolean h() {
        return this._size != 0;
    }

    public int hashCode() {
        Object[] objArr = this.content;
        int i15 = this._size;
        int iHashCode = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            Object obj = objArr[i16];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String i(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, er.l<? super E, ? extends CharSequence> transform) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(prefix);
        Object[] objArr = this.content;
        int i15 = this._size;
        for (int i16 = 0; i16 < i15; i16++) {
            Object obj = objArr[i16];
            if (i16 == limit) {
                sb5.append(truncated);
                return sb5.toString();
            }
            if (i16 != 0) {
                sb5.append(separator);
            }
            if (transform == null) {
                sb5.append(obj);
            } else {
                sb5.append(transform.b(obj));
            }
        }
        sb5.append(postfix);
        return sb5.toString();
    }

    public final int k(E element) {
        if (element == null) {
            Object[] objArr = this.content;
            for (int i15 = this._size - 1; -1 < i15; i15--) {
                if (objArr[i15] == null) {
                    return i15;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i16 = this._size - 1; -1 < i16; i16--) {
                if (element.equals(objArr2[i16])) {
                    return i16;
                }
            }
        }
        return -1;
    }

    public final void l(int index) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Index ");
        sb5.append(index);
        sb5.append(" must be in 0..");
        sb5.append(this._size - 1);
        s0.d.c(sb5.toString());
    }

    public String toString() {
        return j(this, null, "[", "]", 0, null, new a(this), 25, null);
    }

    private a1(int i15) {
        this.content = i15 == 0 ? b1.f169808a : new Object[i15];
    }
}
