package p143z0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p071kotlin.Metadata;
import pq.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001c\u0010\t\u001a\u00020\u0005*\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\"\u0010\u0019\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lz0/w0;", "T", "", "<init>", "()V", "Loq/i0;", "d", "", "position", "a", "(Ljava/lang/Object;F)V", "", "c", "()[F", "", "b", "()Ljava/util/List;", "", "Ljava/util/List;", "getKeys$foundation", "keys", "[F", "getPositions$foundation", "setPositions$foundation", "([F)V", "positions", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<T> keys = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float[] positions;

    public w0() {
        float[] fArr = new float[5];
        for (int i15 = 0; i15 < 5; i15++) {
            fArr[i15] = Float.NaN;
        }
        this.positions = fArr;
    }

    private final void d() {
        this.positions = Arrays.copyOf(this.positions, this.keys.size() + 2);
    }

    public final void a(T t15, float f15) {
        this.keys.add(t15);
        if (this.positions.length < this.keys.size()) {
            d();
        }
        this.positions[this.keys.size() - 1] = f15;
    }

    public final List<T> b() {
        return this.keys;
    }

    public final float[] c() {
        return n.u(this.positions, 0, this.keys.size());
    }
}
