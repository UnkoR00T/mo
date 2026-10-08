package lj;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f118525a;

    public j(float f15) {
        this.f118525a = f15;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // lj.d
    public float a(RectF rectF) {
        return this.f118525a * b(rectF);
    }

    public float c() {
        return this.f118525a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f118525a == ((j) obj).f118525a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f118525a)});
    }

    public String toString() {
        return ((int) (c() * 100.0f)) + "%";
    }
}
