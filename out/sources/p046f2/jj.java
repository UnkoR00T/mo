package p046f2;

import c5.d;
import c5.t;
import d1.c4;
import lr.m;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u0019"}, d2 = {"Lf2/jj;", "Ld1/c4;", "Lf2/hj;", "state", "<init>", "(Lf2/hj;)V", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "", "c", "(Lc5/d;Lc5/t;)I", "b", "(Lc5/d;)I", "d", "a", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lf2/hj;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class jj implements c4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hj state;

    public jj(hj hjVar) {
        this.state = hjVar;
    }

    @Override // d1.c4
    public int a(d density) {
        return 0;
    }

    @Override // d1.c4
    public int b(d density) {
        float fL = this.state.d().l();
        if (Float.isNaN(fL)) {
            return 0;
        }
        return m.e((int) fL, 0);
    }

    @Override // d1.c4
    public int c(d density, t layoutDirection) {
        return 0;
    }

    @Override // d1.c4
    public int d(d density, t layoutDirection) {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof jj) {
            return fr.t.c(this.state, ((jj) other).state);
        }
        return false;
    }

    public int hashCode() {
        return this.state.hashCode();
    }
}
