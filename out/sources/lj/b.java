package lj;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f118472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f118473b;

    public b(float f15, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f118472a;
            f15 += ((b) dVar).f118473b;
        }
        this.f118472a = dVar;
        this.f118473b = f15;
    }

    @Override // lj.d
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f118472a.a(rectF) + this.f118473b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f118472a.equals(bVar.f118472a) && this.f118473b == bVar.f118473b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f118472a, Float.valueOf(this.f118473b)});
    }
}
