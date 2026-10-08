package y2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: y2.o, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\u0005¨\u0006\r"}, d2 = {"Ly2/o;", "", "", "element", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "a", "I", "()I", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntRef {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int element;

    public IntRef() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getElement() {
        return this.element;
    }

    public final void b(int i15) {
        this.element = i15;
    }

    public String toString() {
        return "IntRef(element = " + this.element + ")@" + Integer.toString(hashCode(), fu.a.a(16));
    }

    public IntRef(int i15) {
        this.element = i15;
    }

    public /* synthetic */ IntRef(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 0 : i15);
    }
}
