package r0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJA\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\u00020\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0011\u0010 \u0012\u0004\b!\u0010\u001e\u0082\u0001\u0001#¨\u0006$"}, d2 = {"Lr0/h;", "", "", "initialCapacity", "<init>", "(I)V", "index", "", "a", "(I)F", "", "separator", "prefix", "postfix", "limit", "truncated", "", "b", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "[F", "getContent$annotations", "()V", "content", "I", "get_size$annotations", "_size", "Lr0/f0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public float[] content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int _size;

    public /* synthetic */ h(int i15, fr.k kVar) {
        this(i15);
    }

    public static /* synthetic */ String c(h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, int i16, Object obj) {
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
        return hVar.b(charSequence, charSequence2, charSequence6, i15, charSequence5);
    }

    public final float a(int index) {
        if (index < 0 || index >= this._size) {
            s0.d.c("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public final String b(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(prefix);
        float[] fArr = this.content;
        int i15 = this._size;
        for (int i16 = 0; i16 < i15; i16++) {
            float f15 = fArr[i16];
            if (i16 == limit) {
                sb5.append(truncated);
                return sb5.toString();
            }
            if (i16 != 0) {
                sb5.append(separator);
            }
            sb5.append(f15);
        }
        sb5.append(postfix);
        return sb5.toString();
    }

    public boolean equals(Object other) {
        if (other instanceof h) {
            h hVar = (h) other;
            int i15 = hVar._size;
            int i16 = this._size;
            if (i15 == i16) {
                float[] fArr = this.content;
                float[] fArr2 = hVar.content;
                lr.i iVarW = lr.m.w(0, i16);
                int first = iVarW.getFirst();
                int last = iVarW.getLast();
                if (first > last) {
                    return true;
                }
                while (fArr[first] == fArr2[first]) {
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

    public int hashCode() {
        float[] fArr = this.content;
        int i15 = this._size;
        int iHashCode = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode += Float.hashCode(fArr[i16]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return c(this, null, "[", "]", 0, null, 25, null);
    }

    private h(int i15) {
        this.content = i15 == 0 ? j.a() : new float[i15];
    }
}
