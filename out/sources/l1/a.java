package l1;

import c5.t;
import m3.k;
import n3.f2;
import n3.i2;
import n3.y2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b'\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b#\u0010\u001f¨\u0006$"}, d2 = {"Ll1/a;", "Ln3/y2;", "Ln3/f2;", "Ll1/b;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(Ll1/b;Ll1/b;Ll1/b;Ll1/b;)V", "Lm3/k;", "size", "Lc5/t;", "layoutDirection", "Lc5/d;", "density", "Ln3/i2;", "a", "(JLc5/t;Lc5/d;)Ln3/i2;", "", "e", "(JFFFFLc5/t;)Ln3/i2;", "c", "(Ll1/b;Ll1/b;Ll1/b;Ll1/b;)Ll1/a;", "", "other", "t", "b", "(Ljava/lang/Object;F)Ljava/lang/Object;", "Ll1/b;", "i", "()Ll1/b;", "h", "d", "f", "g", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a implements y2, f2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b topStart;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b topEnd;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b bottomEnd;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b bottomStart;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.topStart = bVar;
        this.topEnd = bVar2;
        this.bottomEnd = bVar3;
        this.bottomStart = bVar4;
    }

    public static /* synthetic */ a d(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i15 & 1) != 0) {
            bVar = aVar.topStart;
        }
        if ((i15 & 2) != 0) {
            bVar2 = aVar.topEnd;
        }
        if ((i15 & 4) != 0) {
            bVar3 = aVar.bottomEnd;
        }
        if ((i15 & 8) != 0) {
            bVar4 = aVar.bottomStart;
        }
        return aVar.c(bVar, bVar2, bVar3, bVar4);
    }

    @Override // n3.y2
    public final i2 a(long size, t layoutDirection, c5.d density) {
        float fA = this.topStart.a(size, density);
        float fA2 = this.topEnd.a(size, density);
        float fA3 = this.bottomEnd.a(size, density);
        float fA4 = this.bottomStart.a(size, density);
        float fH = k.h(size);
        float f15 = fA + fA4;
        if (f15 > fH) {
            float f16 = fH / f15;
            fA *= f16;
            fA4 *= f16;
        }
        float f17 = fA2 + fA3;
        if (f17 > fH) {
            float f18 = fH / f17;
            fA2 *= f18;
            fA3 *= f18;
        }
        if (!(fA >= 0.0f && fA2 >= 0.0f && fA3 >= 0.0f && fA4 >= 0.0f)) {
            c1.e.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return e(size, fA, fA2, fA3, fA4, layoutDirection);
    }

    @Override // n3.f2
    public Object b(Object other, float t15) {
        return null;
    }

    public abstract a c(b topStart, b topEnd, b bottomEnd, b bottomStart);

    public abstract i2 e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, t layoutDirection);

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getBottomEnd() {
        return this.bottomEnd;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getBottomStart() {
        return this.bottomStart;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getTopEnd() {
        return this.topEnd;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final b getTopStart() {
        return this.topStart;
    }
}
