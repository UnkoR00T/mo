package p036e4;

import m3.e;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\n\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u00020\u0002*\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Le4/s0;", "", "Le4/b0;", "e", "(Le4/b0;)Le4/b0;", "sourceCoordinates", "Lm3/e;", "relativeToSource", "", "includeMotionFrameOfReference", "h", "(Le4/b0;Le4/b0;JZ)J", "Le4/a2$a;", "i", "(Le4/a2$a;)Le4/b0;", "lookaheadScopeCoordinates", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface s0 {
    static /* synthetic */ long y(s0 s0Var, b0 b0Var, b0 b0Var2, long j15, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-au-aQtc");
        }
        if ((i15 & 2) != 0) {
            j15 = e.INSTANCE.c();
        }
        long j16 = j15;
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        return s0Var.h(b0Var, b0Var2, j16, z15);
    }

    b0 e(b0 b0Var);

    default long h(b0 b0Var, b0 b0Var2, long j15, boolean z15) {
        return Function1.b(this, b0Var, b0Var2, j15, z15);
    }

    b0 i(a2.a aVar);
}
