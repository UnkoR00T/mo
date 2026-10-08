package p143z0;

import c1.e;
import fr.t;
import java.util.Arrays;
import java.util.List;
import p071kotlin.Metadata;
import pq.n;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0019\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010\u0012J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010+R\u001a\u0010.\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010&¨\u0006/"}, d2 = {"Lz0/f0;", "T", "Lz0/v0;", "", "keys", "", "anchors", "<init>", "(Ljava/util/List;[F)V", "", "j", "([F)F", "i", "anchor", "c", "(Ljava/lang/Object;)F", "", "d", "(Ljava/lang/Object;)Z", "position", "b", "(F)Ljava/lang/Object;", "searchUpwards", "a", "(FZ)Ljava/lang/Object;", "e", "()F", "g", "", "index", "f", "(I)Ljava/lang/Object;", "k", "(I)F", "", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "[F", "I", "h", "size", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f0<T> implements v0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<T> keys;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float[] anchors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(List<? extends T> list, float[] fArr) {
        this.keys = list;
        this.anchors = fArr;
        if (!(list.size() == fArr.length)) {
            e.a("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + n.k1(fArr));
        }
        this.size = fArr.length;
    }

    private final float i(float[] fArr) {
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMax = fArr[0];
        int iS0 = n.s0(fArr);
        int i15 = 1;
        if (1 <= iS0) {
            while (true) {
                fMax = Math.max(fMax, fArr[i15]);
                if (i15 == iS0) {
                    break;
                }
                i15++;
            }
        }
        return fMax;
    }

    private final float j(float[] fArr) {
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMin = fArr[0];
        int iS0 = n.s0(fArr);
        int i15 = 1;
        if (1 <= iS0) {
            while (true) {
                fMin = Math.min(fMin, fArr[i15]);
                if (i15 == iS0) {
                    break;
                }
                i15++;
            }
        }
        return fMin;
    }

    @Override // p143z0.v0
    public T a(float position, boolean searchUpwards) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i15 = 0;
        int i16 = -1;
        float f15 = Float.POSITIVE_INFINITY;
        int i17 = 0;
        while (i15 < length) {
            float f16 = fArr[i15];
            int i18 = i17 + 1;
            float f17 = searchUpwards ? f16 - position : position - f16;
            if (f17 < 0.0f) {
                f17 = Float.POSITIVE_INFINITY;
            }
            if (f17 <= f15) {
                i16 = i17;
                f15 = f17;
            }
            i15++;
            i17 = i18;
        }
        if (i16 == -1) {
            return null;
        }
        return this.keys.get(i16);
    }

    @Override // p143z0.v0
    public T b(float position) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        float f15 = Float.POSITIVE_INFINITY;
        int i15 = 0;
        int i16 = -1;
        int i17 = 0;
        while (i15 < length) {
            int i18 = i17 + 1;
            float fAbs = Math.abs(position - fArr[i15]);
            if (fAbs <= f15) {
                i16 = i17;
                f15 = fAbs;
            }
            i15++;
            i17 = i18;
        }
        if (i16 == -1) {
            return null;
        }
        return this.keys.get(i16);
    }

    @Override // p143z0.v0
    public float c(T anchor) {
        int iIndexOf = this.keys.indexOf(anchor);
        float[] fArr = this.anchors;
        return (iIndexOf < 0 || iIndexOf >= fArr.length) ? ((Number) j.f231338b.b(Integer.valueOf(iIndexOf))).floatValue() : fArr[iIndexOf];
    }

    @Override // p143z0.v0
    public boolean d(T anchor) {
        return this.keys.indexOf(anchor) != -1;
    }

    @Override // p143z0.v0
    public float e() {
        return j(this.anchors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) other;
        return t.c(this.keys, f0Var.keys) && Arrays.equals(this.anchors, f0Var.anchors) && getSize() == f0Var.getSize();
    }

    @Override // p143z0.v0
    public T f(int index) {
        return (T) v.o0(this.keys, index);
    }

    @Override // p143z0.v0
    public float g() {
        return i(this.anchors);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((this.keys.hashCode() * 31) + Arrays.hashCode(this.anchors)) * 31) + getSize();
    }

    public float k(int index) {
        float[] fArr = this.anchors;
        return (index < 0 || index >= fArr.length) ? ((Number) j.f231338b.b(Integer.valueOf(index))).floatValue() : fArr[index];
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("DraggableAnchors(anchors={");
        int size = getSize();
        for (int i15 = 0; i15 < size; i15++) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(f(i15));
            sb6.append('=');
            sb6.append(k(i15));
            sb5.append(sb6.toString());
            if (i15 < getSize() - 1) {
                sb5.append(", ");
            }
        }
        sb5.append("})");
        return sb5.toString();
    }
}
