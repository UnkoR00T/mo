package l1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u0001\u0010\u0010\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0002\u0010\u0013\u001a5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u001a\u001a\u00020\u00112\b\b\u0003\u0010\u001b\u001a\u00020\u00112\b\b\u0003\u0010\u001c\u001a\u00020\u00112\b\b\u0003\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001f\"\u0017\u0010#\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Ll1/g;", "a", "b", "", "t", "k", "(Ll1/g;Ll1/g;F)Ll1/g;", "Ll1/b;", "j", "(Ll1/b;Ll1/b;F)Ll1/b;", "corner", "d", "(Ll1/b;)Ll1/g;", "Lc5/h;", "size", "f", "(F)Ll1/g;", "", "percent", "(I)Ll1/g;", "topStart", "topEnd", "bottomEnd", "bottomStart", "g", "(FFFF)Ll1/g;", "topStartPercent", "topEndPercent", "bottomEndPercent", "bottomStartPercent", "c", "(IIII)Ll1/g;", "Ll1/g;", "i", "()Ll1/g;", "CircleShape", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final RoundedCornerShape f114005a = b(50);

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"l1/h$a", "Ll1/b;", "Lm3/k;", "shapeSize", "Lc5/d;", "density", "", "a", "(JLc5/d;)F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f114006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f114007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f114008c;

        a(b bVar, b bVar2, float f15) {
            this.f114006a = bVar;
            this.f114007b = bVar2;
            this.f114008c = f15;
        }

        @Override // l1.b
        public float a(long shapeSize, c5.d density) {
            return e5.c.b(this.f114006a.a(shapeSize, density), this.f114007b.a(shapeSize, density), this.f114008c);
        }
    }

    public static final RoundedCornerShape a(float f15) {
        return d(c.a(f15));
    }

    public static final RoundedCornerShape b(int i15) {
        return d(c.b(i15));
    }

    public static final RoundedCornerShape c(int i15, int i16, int i17, int i18) {
        return new RoundedCornerShape(c.b(i15), c.b(i16), c.b(i17), c.b(i18));
    }

    public static final RoundedCornerShape d(b bVar) {
        return new RoundedCornerShape(bVar, bVar, bVar, bVar);
    }

    public static /* synthetic */ RoundedCornerShape e(int i15, int i16, int i17, int i18, int i19, Object obj) {
        if ((i19 & 1) != 0) {
            i15 = 0;
        }
        if ((i19 & 2) != 0) {
            i16 = 0;
        }
        if ((i19 & 4) != 0) {
            i17 = 0;
        }
        if ((i19 & 8) != 0) {
            i18 = 0;
        }
        return c(i15, i16, i17, i18);
    }

    public static final RoundedCornerShape f(float f15) {
        return d(c.c(f15));
    }

    public static final RoundedCornerShape g(float f15, float f16, float f17, float f18) {
        return new RoundedCornerShape(c.c(f15), c.c(f16), c.c(f17), c.c(f18));
    }

    public static /* synthetic */ RoundedCornerShape h(float f15, float f16, float f17, float f18, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = c5.h.n(0);
        }
        if ((i15 & 2) != 0) {
            f16 = c5.h.n(0);
        }
        if ((i15 & 4) != 0) {
            f17 = c5.h.n(0);
        }
        if ((i15 & 8) != 0) {
            f18 = c5.h.n(0);
        }
        return g(f15, f16, f17, f18);
    }

    public static final RoundedCornerShape i() {
        return f114005a;
    }

    public static final b j(b bVar, b bVar2, float f15) {
        return new a(bVar, bVar2, f15);
    }

    public static final RoundedCornerShape k(RoundedCornerShape roundedCornerShape, RoundedCornerShape roundedCornerShape2, float f15) {
        return new RoundedCornerShape(j(roundedCornerShape.getTopStart(), roundedCornerShape2.getTopStart(), f15), j(roundedCornerShape.getTopEnd(), roundedCornerShape2.getTopEnd(), f15), j(roundedCornerShape.getBottomEnd(), roundedCornerShape2.getBottomEnd(), f15), j(roundedCornerShape.getBottomStart(), roundedCornerShape2.getBottomStart(), f15));
    }
}
