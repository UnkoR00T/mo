package p056h1;

import c5.t;
import er.l;
import java.util.List;
import java.util.Map;
import oq.i0;
import p036e4.a;
import p036e4.a2;
import p036e4.k2;
import p036e4.s2;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import r0.j0;
import r0.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0010*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u000f*\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u000f*\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u001b*\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJH\u0010*\u001a\u00020)2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\"2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0096\u0001¢\u0006\u0004\b*\u0010+J^\u0010.\u001a\u00020)2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\"2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020'\u0018\u00010%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0096\u0001¢\u0006\u0004\b.\u0010/J\u0014\u00100\u001a\u00020\u0015*\u00020\u0010H\u0097\u0001¢\u0006\u0004\b0\u0010\u0017J\u0014\u00101\u001a\u00020\u0015*\u00020\u000fH\u0097\u0001¢\u0006\u0004\b1\u0010\u0012J\u0014\u00102\u001a\u00020\t*\u00020\u0010H\u0097\u0001¢\u0006\u0004\b2\u00103J\u0014\u00104\u001a\u00020\t*\u00020\u000fH\u0097\u0001¢\u0006\u0004\b4\u00105R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u000b0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010AR\u0014\u0010H\u001a\u00020E8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020\u00158\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00158\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bP\u0010N¨\u0006R"}, d2 = {"Lh1/a1;", "Lh1/z0;", "Le4/y0;", "Lh1/k0;", "itemContentFactory", "Le4/s2;", "subcomposeMeasureScope", "<init>", "(Lh1/k0;Le4/s2;)V", "", "index", "", "Le4/v0;", "u2", "(I)Ljava/util/List;", "Lc5/v;", "Lc5/h;", "h0", "(J)F", "b2", "(I)F", "", "d2", "(F)F", "y0", "(F)J", "Z", "Lc5/k;", "Lm3/k;", "B2", "(J)J", "a0", "width", "height", "", "Le4/a;", "alignmentLines", "Lkotlin/Function1;", "Le4/a2$a;", "Loq/i0;", "placementBlock", "Le4/x0;", "x1", "(IILjava/util/Map;Ler/l;)Le4/x0;", "Le4/k2;", "rulers", "E0", "(IILjava/util/Map;Ler/l;Ler/l;)Le4/x0;", "l2", "e1", "X0", "(F)I", "q2", "(J)I", "a", "Lh1/k0;", "b", "Le4/s2;", "Lh1/o0;", "c", "Lh1/o0;", "itemProvider", "Lr0/j0;", "Le4/a2;", "d", "Lr0/j0;", "placeablesCache", "e", "measurablesCache", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "layoutDirection", "", "J0", "()Z", "isLookingAhead", "getDensity", "()F", "density", "i2", "fontScale", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a1 implements z0, y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k0 itemContentFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s2 subcomposeMeasureScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o0 itemProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j0<List<a2>> placeablesCache = r.c();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j0<List<v0>> measurablesCache = r.c();

    public a1(k0 k0Var, s2 s2Var) {
        this.itemContentFactory = k0Var;
        this.subcomposeMeasureScope = s2Var;
        this.itemProvider = k0Var.d().a();
    }

    @Override // c5.d
    public long B2(long j15) {
        return this.subcomposeMeasureScope.B2(j15);
    }

    @Override // p036e4.y0
    public x0 E0(int width, int height, Map<a, Integer> alignmentLines, l<? super k2, i0> rulers, l<? super a2.a, i0> placementBlock) {
        return this.subcomposeMeasureScope.E0(width, height, alignmentLines, rulers, placementBlock);
    }

    @Override // p036e4.w
    public boolean J0() {
        return this.subcomposeMeasureScope.J0();
    }

    @Override // c5.d
    public int X0(float f15) {
        return this.subcomposeMeasureScope.X0(f15);
    }

    @Override // c5.l
    public long Z(float f15) {
        return this.subcomposeMeasureScope.Z(f15);
    }

    @Override // c5.d
    public long a0(long j15) {
        return this.subcomposeMeasureScope.a0(j15);
    }

    @Override // c5.d
    public float b2(int i15) {
        return this.subcomposeMeasureScope.b2(i15);
    }

    @Override // c5.d
    public float d2(float f15) {
        return this.subcomposeMeasureScope.d2(f15);
    }

    @Override // c5.d
    public float e1(long j15) {
        return this.subcomposeMeasureScope.e1(j15);
    }

    @Override // c5.d
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // p036e4.w
    public t getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // c5.l
    public float h0(long j15) {
        return this.subcomposeMeasureScope.h0(j15);
    }

    @Override // c5.l
    /* JADX INFO: renamed from: i2 */
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // c5.d
    public float l2(float f15) {
        return this.subcomposeMeasureScope.l2(f15);
    }

    @Override // c5.d
    public int q2(long j15) {
        return this.subcomposeMeasureScope.q2(j15);
    }

    @Override // p056h1.z0
    public List<v0> u2(int index) {
        List<v0> listB = this.measurablesCache.b(index);
        if (listB != null) {
            return listB;
        }
        Object objD = this.itemProvider.d(index);
        List<v0> listG0 = this.subcomposeMeasureScope.g0(objD, this.itemContentFactory.b(index, objD, this.itemProvider.f(index)));
        this.measurablesCache.r(index, listG0);
        return listG0;
    }

    @Override // p036e4.y0
    public x0 x1(int width, int height, Map<a, Integer> alignmentLines, l<? super a2.a, i0> placementBlock) {
        return this.subcomposeMeasureScope.x1(width, height, alignmentLines, placementBlock);
    }

    @Override // c5.d
    public long y0(float f15) {
        return this.subcomposeMeasureScope.y0(f15);
    }
}
