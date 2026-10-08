package c9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f24609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f24610f;

    public l(int i15, int i16, int i17, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f24606b = i15;
        this.f24607c = i16;
        this.f24608d = i17;
        this.f24609e = iArr;
        this.f24610f = iArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f24606b == lVar.f24606b && this.f24607c == lVar.f24607c && this.f24608d == lVar.f24608d && Arrays.equals(this.f24609e, lVar.f24609e) && Arrays.equals(this.f24610f, lVar.f24610f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f24606b) * 31) + this.f24607c) * 31) + this.f24608d) * 31) + Arrays.hashCode(this.f24609e)) * 31) + Arrays.hashCode(this.f24610f);
    }
}
