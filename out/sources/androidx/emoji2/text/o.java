package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<a7.a> f12329d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f12331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f12332c = 0;

    o(m mVar, int i15) {
        this.f12331b = mVar;
        this.f12330a = i15;
    }

    private a7.a g() {
        ThreadLocal<a7.a> threadLocal = f12329d;
        a7.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a7.a();
            threadLocal.set(aVar);
        }
        this.f12331b.d().j(aVar, this.f12330a);
        return aVar;
    }

    public void a(Canvas canvas, float f15, float f16, Paint paint) {
        Typeface typefaceG = this.f12331b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f12331b.c(), this.f12330a * 2, 2, f15, f16, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i15) {
        return g().h(i15);
    }

    public int c() {
        return g().i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int d() {
        return this.f12332c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f12332c & 4) > 0;
    }

    public void l(boolean z15) {
        int iD = d();
        if (z15) {
            this.f12332c = iD | 4;
        } else {
            this.f12332c = iD;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void m(boolean z15) {
        int i15 = this.f12332c & 4;
        this.f12332c = z15 ? i15 | 2 : i15 | 1;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(super.toString());
        sb5.append(", id:");
        sb5.append(Integer.toHexString(f()));
        sb5.append(", codepoints:");
        int iC = c();
        for (int i15 = 0; i15 < iC; i15++) {
            sb5.append(Integer.toHexString(b(i15)));
            sb5.append(" ");
        }
        return sb5.toString();
    }
}
