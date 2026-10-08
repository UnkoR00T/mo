package g4;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001:\u0006\u0015\u0011\u0017\u0010\u0016\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\rJ/\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\rJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\rJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\u0014J/\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0014J/\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0014J/\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lg4/u0;", "", "<init>", "()V", "Lg4/u0$a;", "measureBlock", "Le4/c;", "intrinsicMeasureScope", "Le4/v;", "intrinsicMeasurable", "", "h", "g", "(Lg4/u0$a;Le4/c;Le4/v;I)I", "w", "e", "c", "a", "Lg4/u0$f;", "Le4/w;", "(Lg4/u0$f;Le4/w;Le4/v;I)I", "f", "d", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f70396a = new u0();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J#\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lg4/u0$a;", "", "Le4/f;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "a", "(Le4/f;Le4/v0;J)Le4/x0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        p036e4.x0 a(p036e4.f fVar, p036e4.v0 v0Var, long j15);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lg4/u0$b;", "Le4/v0;", "Le4/v;", "measurable", "Lg4/u0$d;", "minMax", "Lg4/u0$e;", "widthHeight", "<init>", "(Le4/v;Lg4/u0$d;Lg4/u0$e;)V", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/a2;", "o0", "(J)Le4/a2;", "", "height", "e0", "(I)I", "m0", "width", "U", "n", "a", "Le4/v;", "getMeasurable", "()Le4/v;", "b", "Lg4/u0$d;", "getMinMax", "()Lg4/u0$d;", "c", "Lg4/u0$e;", "getWidthHeight", "()Lg4/u0$e;", "", "e", "()Ljava/lang/Object;", "parentData", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b implements p036e4.v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final p036e4.v measurable;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final d minMax;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final e widthHeight;

        public b(p036e4.v vVar, d dVar, e eVar) {
            this.measurable = vVar;
            this.minMax = dVar;
            this.widthHeight = eVar;
        }

        @Override // p036e4.v
        public int U(int width) {
            return this.measurable.U(width);
        }

        @Override // p036e4.v
        /* JADX INFO: renamed from: e */
        public Object getParentData() {
            return this.measurable.getParentData();
        }

        @Override // p036e4.v
        public int e0(int height) {
            return this.measurable.e0(height);
        }

        @Override // p036e4.v
        public int m0(int height) {
            return this.measurable.m0(height);
        }

        @Override // p036e4.v
        public int n(int width) {
            return this.measurable.n(width);
        }

        @Override // p036e4.v0
        public a2 o0(long constraints) {
            if (this.widthHeight == e.Width) {
                return new c(this.minMax == d.Max ? this.measurable.m0(c5.b.k(constraints)) : this.measurable.e0(c5.b.k(constraints)), c5.b.g(constraints) ? c5.b.k(constraints) : 32767);
            }
            return new c(c5.b.h(constraints) ? c5.b.l(constraints) : 32767, this.minMax == d.Max ? this.measurable.n(c5.b.l(constraints)) : this.measurable.U(c5.b.l(constraints)));
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lg4/u0$c;", "Le4/a2;", "", "width", "height", "<init>", "(II)V", "Le4/a;", "alignmentLine", "I", "(Le4/a;)I", "Lc5/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Ln3/a2;", "Loq/i0;", "layerBlock", "W0", "(JFLer/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c extends a2 {
        public c(int i15, int i16) {
            d1(c5.r.c((((long) i16) & BodyPartID.bodyIdMax) | (((long) i15) << 32)));
        }

        @Override // p036e4.z0
        public int I(p036e4.a alignmentLine) {
            return PKIFailureInfo.systemUnavail;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p036e4.a2
        public void W0(long position, float zIndex, er.l<? super n3.a2, oq.i0> layerBlock) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lg4/u0$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum d {
        Min,
        Max;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f70403d = wq.b.a(b());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lg4/u0$e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum e {
        Width,
        Height;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f70407d = wq.b.a(b());
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J#\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lg4/u0$f;", "", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface f {
        p036e4.x0 c(p036e4.y0 y0Var, p036e4.v0 v0Var, long j15);
    }

    private u0() {
    }

    public final int a(a measureBlock, p036e4.c intrinsicMeasureScope, p036e4.v intrinsicMeasurable, int w15) {
        return measureBlock.a(new p036e4.d(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Max, e.Height), c5.c.b(0, w15, 0, 0, 13, null)).getF47224b();
    }

    public final int b(f measureBlock, p036e4.w intrinsicMeasureScope, p036e4.v intrinsicMeasurable, int w15) {
        return measureBlock.c(new p036e4.z(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Max, e.Height), c5.c.b(0, w15, 0, 0, 13, null)).getF47224b();
    }

    public final int c(a measureBlock, p036e4.c intrinsicMeasureScope, p036e4.v intrinsicMeasurable, int h15) {
        return measureBlock.a(new p036e4.d(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Max, e.Width), c5.c.b(0, 0, 0, h15, 7, null)).getF47223a();
    }

    public final int d(f measureBlock, p036e4.w intrinsicMeasureScope, p036e4.v intrinsicMeasurable, int h15) {
        return measureBlock.c(new p036e4.z(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Max, e.Width), c5.c.b(0, 0, 0, h15, 7, null)).getF47223a();
    }

    public final int e(a measureBlock, p036e4.c intrinsicMeasureScope, p036e4.v intrinsicMeasurable, int w15) {
        return measureBlock.a(new p036e4.d(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Min, e.Height), c5.c.b(0, w15, 0, 0, 13, null)).getF47224b();
    }

    public final int f(f measureBlock, p036e4.w intrinsicMeasureScope, p036e4.v intrinsicMeasurable, int w15) {
        return measureBlock.c(new p036e4.z(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Min, e.Height), c5.c.b(0, w15, 0, 0, 13, null)).getF47224b();
    }

    public final int g(a measureBlock, p036e4.c intrinsicMeasureScope, p036e4.v intrinsicMeasurable, int h15) {
        return measureBlock.a(new p036e4.d(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Min, e.Width), c5.c.b(0, 0, 0, h15, 7, null)).getF47223a();
    }

    public final int h(f measureBlock, p036e4.w intrinsicMeasureScope, p036e4.v intrinsicMeasurable, int h15) {
        return measureBlock.c(new p036e4.z(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.Min, e.Width), c5.c.b(0, 0, 0, h15, 7, null)).getF47223a();
    }
}
