package lj;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f118471a;

    public a(float f15) {
        this.f118471a = f15;
    }

    @Override // lj.d
    public float a(RectF rectF) {
        return this.f118471a;
    }

    public float b() {
        return this.f118471a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f118471a == ((a) obj).f118471a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f118471a)});
    }

    public String toString() {
        return b() + "px";
    }
}
