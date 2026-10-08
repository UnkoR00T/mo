package p079n1;

import p071kotlin.Metadata;
import v4.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Ln1/l7;", "Lv4/i0;", "delegate", "", "originalLength", "transformedLength", "<init>", "(Lv4/i0;II)V", "offset", "e", "(I)I", "b", "a", "Lv4/i0;", "I", "c", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l7 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i0 delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int originalLength;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int transformedLength;

    public l7(i0 i0Var, int i15, int i16) {
        this.delegate = i0Var;
        this.originalLength = i15;
        this.transformedLength = i16;
    }

    @Override // v4.i0
    public int b(int offset) {
        int iB = this.delegate.b(offset);
        if (offset >= 0 && offset <= this.transformedLength) {
            m7.h(iB, this.originalLength, offset);
        }
        return iB;
    }

    @Override // v4.i0
    public int e(int offset) {
        int iE = this.delegate.e(offset);
        if (offset >= 0 && offset <= this.originalLength) {
            m7.g(iE, this.transformedLength, offset);
        }
        return iE;
    }
}
