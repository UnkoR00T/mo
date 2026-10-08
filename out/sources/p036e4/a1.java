package p036e4;

import c5.r;
import er.l;
import n3.a2;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001:\u0004\u0011\u0010\u000f\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ-\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\rJ-\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Le4/a1;", "", "<init>", "()V", "Le4/k0;", "modifier", "Le4/w;", "intrinsicMeasureScope", "Le4/v;", "intrinsicMeasurable", "", "h", "d", "(Le4/k0;Le4/w;Le4/v;I)I", "w", "c", "b", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1 f47175a = new a1();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Le4/a1$a;", "Le4/v0;", "Le4/v;", "measurable", "Le4/a1$c;", "minMax", "Le4/a1$d;", "widthHeight", "<init>", "(Le4/v;Le4/a1$c;Le4/a1$d;)V", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/a2;", "o0", "(J)Le4/a2;", "", "height", "e0", "(I)I", "m0", "width", "U", "n", "a", "Le4/v;", "getMeasurable", "()Le4/v;", "b", "Le4/a1$c;", "getMinMax", "()Le4/a1$c;", "c", "Le4/a1$d;", "getWidthHeight", "()Le4/a1$d;", "", "e", "()Ljava/lang/Object;", "parentData", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a implements v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final v measurable;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final c minMax;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final d widthHeight;

        public a(v vVar, c cVar, d dVar) {
            this.measurable = vVar;
            this.minMax = cVar;
            this.widthHeight = dVar;
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
            if (this.widthHeight == d.Width) {
                return new b(this.minMax == c.Max ? this.measurable.m0(c5.b.k(constraints)) : this.measurable.e0(c5.b.k(constraints)), c5.b.g(constraints) ? c5.b.k(constraints) : 32767);
            }
            return new b(c5.b.h(constraints) ? c5.b.l(constraints) : 32767, this.minMax == c.Max ? this.measurable.n(c5.b.l(constraints)) : this.measurable.U(c5.b.l(constraints)));
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Le4/a1$b;", "Le4/a2;", "", "width", "height", "<init>", "(II)V", "Le4/a;", "alignmentLine", "I", "(Le4/a;)I", "Lc5/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Ln3/a2;", "Loq/i0;", "layerBlock", "W0", "(JFLer/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b extends a2 {
        public b(int i15, int i16) {
            d1(r.c((((long) i16) & BodyPartID.bodyIdMax) | (((long) i15) << 32)));
        }

        @Override // p036e4.z0
        public int I(p036e4.a alignmentLine) {
            return PKIFailureInfo.systemUnavail;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p036e4.a2
        public void W0(long position, float zIndex, l<? super a2, i0> layerBlock) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Le4/a1$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum c {
        Min,
        Max;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f47182d = wq.b.a(b());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Le4/a1$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum d {
        Width,
        Height;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f47186d = wq.b.a(b());
    }

    private a1() {
    }

    public final int a(k0 modifier, w intrinsicMeasureScope, v intrinsicMeasurable, int w15) {
        return modifier.c(new z(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Max, d.Height), c5.c.b(0, w15, 0, 0, 13, null)).getF47487b();
    }

    public final int b(k0 modifier, w intrinsicMeasureScope, v intrinsicMeasurable, int h15) {
        return modifier.c(new z(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Max, d.Width), c5.c.b(0, 0, 0, h15, 7, null)).getF47486a();
    }

    public final int c(k0 modifier, w intrinsicMeasureScope, v intrinsicMeasurable, int w15) {
        return modifier.c(new z(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Min, d.Height), c5.c.b(0, w15, 0, 0, 13, null)).getF47487b();
    }

    public final int d(k0 modifier, w intrinsicMeasureScope, v intrinsicMeasurable, int h15) {
        return modifier.c(new z(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.Min, d.Width), c5.c.b(0, 0, 0, h15, 7, null)).getF47486a();
    }
}
