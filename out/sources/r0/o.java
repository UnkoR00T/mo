package r0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u000bJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#R\u001c\u0010(\u001a\u00020$8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0013\u0010%\u0012\u0004\b&\u0010'R\u001c\u0010,\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010'\u0082\u0001\u0001-¨\u0006."}, d2 = {"Lr0/o;", "", "", "initialCapacity", "<init>", "(I)V", "element", "", "c", "(I)Z", "d", "()I", "index", "e", "(I)I", "f", "i", "fromIndex", "toIndex", "a", "(III)I", "", "separator", "prefix", "postfix", "limit", "truncated", "", "g", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "[I", "getContent$annotations", "()V", "content", "b", "I", "get_size$annotations", "_size", "Lr0/i0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int[] content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int _size;

    public /* synthetic */ o(int i15, fr.k kVar) {
        this(i15);
    }

    public static /* synthetic */ int b(o oVar, int i15, int i16, int i17, int i18, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i18 & 2) != 0) {
            i16 = 0;
        }
        if ((i18 & 4) != 0) {
            i17 = oVar._size;
        }
        return oVar.a(i15, i16, i17);
    }

    public static /* synthetic */ String h(o oVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, int i16, Object obj) {
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
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return oVar.g(charSequence, charSequence2, charSequence6, i15, charSequence5);
    }

    public final int a(int element, int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= toIndex || toIndex > this._size) {
            s0.d.c("");
        }
        int i15 = toIndex - 1;
        while (fromIndex <= i15) {
            int i16 = (fromIndex + i15) >>> 1;
            int i17 = this.content[i16];
            if (i17 < element) {
                fromIndex = i16 + 1;
            } else {
                if (i17 <= element) {
                    return i16;
                }
                i15 = i16 - 1;
            }
        }
        return -(fromIndex + 1);
    }

    public final boolean c(int element) {
        int[] iArr = this.content;
        int i15 = this._size;
        for (int i16 = 0; i16 < i15; i16++) {
            if (iArr[i16] == element) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        if (this._size == 0) {
            s0.d.d("IntList is empty.");
        }
        return this.content[0];
    }

    public final int e(int index) {
        if (index < 0 || index >= this._size) {
            s0.d.c("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public boolean equals(Object other) {
        if (other instanceof o) {
            o oVar = (o) other;
            int i15 = oVar._size;
            int i16 = this._size;
            if (i15 == i16) {
                int[] iArr = this.content;
                int[] iArr2 = oVar.content;
                lr.i iVarW = lr.m.w(0, i16);
                int first = iVarW.getFirst();
                int last = iVarW.getLast();
                if (first > last) {
                    return true;
                }
                while (iArr[first] == iArr2[first]) {
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

    public final int f(int element) {
        int[] iArr = this.content;
        int i15 = this._size;
        for (int i16 = 0; i16 < i15; i16++) {
            if (element == iArr[i16]) {
                return i16;
            }
        }
        return -1;
    }

    public final String g(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(prefix);
        int[] iArr = this.content;
        int i15 = this._size;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = iArr[i16];
            if (i16 == limit) {
                sb5.append(truncated);
                return sb5.toString();
            }
            if (i16 != 0) {
                sb5.append(separator);
            }
            sb5.append(i17);
        }
        sb5.append(postfix);
        return sb5.toString();
    }

    public int hashCode() {
        int[] iArr = this.content;
        int i15 = this._size;
        int iHashCode = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode += Integer.hashCode(iArr[i16]) * 31;
        }
        return iHashCode;
    }

    public final int i() {
        if (this._size == 0) {
            s0.d.d("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public String toString() {
        return h(this, null, "[", "]", 0, null, 25, null);
    }

    private o(int i15) {
        this.content = i15 == 0 ? t.a() : new int[i15];
    }
}
