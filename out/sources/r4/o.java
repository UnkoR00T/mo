package r4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001b"}, d2 = {"Lr4/o;", "", "Lr4/j0;", "layout", "<init>", "(Lr4/j0;)V", "", "offset", "", "upstream", "cache", "primary", "", "a", "(IZZZ)F", "b", "(I)F", "c", "d", "e", "Lr4/j0;", "getLayout", "()Lr4/j0;", "I", "cachedKey", "F", "cachedValue", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j0 layout;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int cachedKey = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float cachedValue;

    public o(j0 j0Var) {
        this.layout = j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    private final float a(int offset, boolean upstream, boolean cache, boolean primary) {
        boolean z15;
        int i15 = 1;
        if (upstream) {
            int iA = q.a(this.layout.getLayout(), offset, upstream);
            int iV = this.layout.v(iA);
            int iP = this.layout.p(iA);
            if (offset == iV || offset == iP) {
                z15 = true;
            } else {
                z15 = false;
            }
        } else {
            z15 = false;
        }
        int i16 = offset * 4;
        if (!primary) {
            i15 = z15 ? 2 : 3;
        } else if (z15) {
            i15 = 0;
        }
        int i17 = i16 + i15;
        if (this.cachedKey == i17) {
            return this.cachedValue;
        }
        float fA = primary ? this.layout.A(offset, upstream) : this.layout.D(offset, upstream);
        if (cache) {
            this.cachedKey = i17;
            this.cachedValue = fA;
        }
        return fA;
    }

    public final float b(int offset) {
        return a(offset, false, false, true);
    }

    public final float c(int offset) {
        return a(offset, true, true, true);
    }

    public final float d(int offset) {
        return a(offset, false, false, false);
    }

    public final float e(int offset) {
        return a(offset, true, true, false);
    }
}
