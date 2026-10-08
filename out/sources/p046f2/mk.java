package p046f2;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import er.p;
import ip.a;
import ju.p0;
import ju.q0;
import lr.e;
import lr.m;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.m5;
import p076m2.x2;
import p076m2.x3;
import p076m2.y2;
import p143z0.a2;
import p143z0.d1;
import p143z0.u0;
import vq.k;
import w0.b2;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Y2\u00020\u0001:\u0001\u001eB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J<\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\"\u0010\u001d\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0019H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010+\u001a\u0004\b,\u0010-R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R+\u0010>\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010\"R0\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010I\u001a\u00020G8\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010Q\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010N\u001a\u0004\bO\u0010PR+\u0010W\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010-\"\u0004\bU\u0010VR+\u0010[\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010S\u001a\u0004\bY\u0010-\"\u0004\bZ\u0010VR\"\u0010_\u001a\u00020G8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010H\u001a\u0004\b]\u0010J\"\u0004\b^\u0010LR+\u0010b\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010S\u001a\u0004\b`\u0010-\"\u0004\ba\u0010VR+\u0010e\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010S\u001a\u0004\bc\u0010-\"\u0004\bd\u0010VR\"\u0010l\u001a\u00020f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bg\u0010i\"\u0004\bj\u0010kR\"\u0010p\u001a\u00020G8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bm\u0010H\u001a\u0004\bn\u0010J\"\u0004\bo\u0010LR+\u0010u\u001a\u00020G2\u0006\u00108\u001a\u00020G8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010J\"\u0004\bt\u0010LR \u0010v\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010/\u001a\u0004\b\\\u00101R+\u0010w\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010:\u001a\u0004\bq\u0010<\"\u0004\b+\u0010\"R+\u0010y\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bc\u0010:\u001a\u0004\bm\u0010<\"\u0004\bx\u0010\"R\u0014\u0010{\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010zR\u0014\u0010~\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010}R%\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b\u007f\u0010<\"\u0005\b\u0080\u0001\u0010\"R\u0012\u0010\u0081\u0001\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bX\u0010<¨\u0006\u0082\u0001"}, d2 = {"Lf2/mk;", "Lz0/d1;", "", "value", "", "steps", "Lkotlin/Function0;", "Loq/i0;", "onValueChangeFinished", "Llr/e;", "valueRange", "<init>", "(FILer/a;Llr/e;)V", "newVal", "f", "(F)F", "minPx", "maxPx", "offset", a.f96138c, "(FFF)F", "userValue", "C", "Lw0/z1;", "dragPriority", "Lkotlin/Function2;", "Lz0/u0;", "Ltq/e;", "", "block", "a", "(Lw0/z1;Ler/p;Ltq/e;)Ljava/lang/Object;", "delta", "g", "(F)V", "newTotalWidth", "newTotalHeight", "Q", "(II)V", "Lm3/e;", "pos", "B", "(J)V", "I", "q", "()I", "b", "Ler/a;", "l", "()Ler/a;", "G", "(Ler/a;)V", "c", "Llr/e;", "x", "()Llr/e;", "<set-?>", "d", "Lm2/x2;", "y", "()F", i.f37086m, "valueState", "Lkotlin/Function1;", "e", "Ler/l;", "k", "()Ler/l;", "F", "(Ler/l;)V", "onValueChange", "", "Z", "shouldAutoSnap", "()Z", "setShouldAutoSnap", "(Z)V", "", "[F", "t", "()[F", "tickFractions", "h", "Lm2/y2;", "v", "N", "(I)V", "totalWidth", "i", "u", "M", "totalHeight", "j", "A", "J", "isRtl", "s", i.f37094u, "thumbWidth", "r", "K", "thumbHeight", "Lz0/a2;", "m", "Lz0/a2;", "()Lz0/a2;", "setOrientation$material3", "(Lz0/a2;)V", "orientation", "n", "p", "setReverseVerticalDirection$material3", "reverseVerticalDirection", "o", "Lm2/a3;", "z", "E", "isDragging", "gestureEndAction", "rawOffset", i.f37087n, "pressOffset", "Lz0/u0;", "dragScope", "Lw0/b2;", "Lw0/b2;", "scrollMutex", "w", "O", "coercedValueAsFraction", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class mk implements d1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f56893v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int steps;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> onValueChangeFinished;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e<Float> valueRange;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x2 valueState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private l<? super Float, i0> onValueChange;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean shouldAutoSnap;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float[] tickFractions;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final y2 totalWidth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final y2 totalHeight;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isRtl;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final y2 thumbWidth;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final y2 thumbHeight;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private a2 orientation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean reverseVerticalDirection;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final a3 isDragging;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> gestureEndAction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final x2 rawOffset;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final x2 pressOffset;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final u0 dragScope;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final b2 scrollMutex;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56914e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1 f56916g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p<u0, tq.e<? super i0>, Object> f56917h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(z1 z1Var, p<? super u0, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f56916g = z1Var;
            this.f56917h = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56914e;
            try {
                if (i15 == 0) {
                    u.b(obj);
                    mk.this.E(true);
                    b2 b2Var = mk.this.scrollMutex;
                    u0 u0Var = mk.this.dragScope;
                    z1 z1Var = this.f56916g;
                    p<u0, tq.e<? super i0>, Object> pVar = this.f56917h;
                    this.f56914e = 1;
                    if (b2Var.f(u0Var, z1Var, pVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                mk.this.E(false);
                return i0.f148189a;
            } catch (Throwable th4) {
                mk.this.E(false);
                throw th4;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return mk.this.new b(this.f56916g, this.f56917h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"f2/mk$c", "Lz0/u0;", "", "pixels", "Loq/i0;", "a", "(F)V", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements u0 {
        c() {
        }

        @Override // p143z0.u0
        public void a(float pixels) {
            mk.this.g(pixels);
        }
    }

    public mk() {
        this(0.0f, 0, null, null, 15, null);
    }

    private final float C(float minPx, float maxPx, float userValue) {
        return ik.M(this.valueRange.e().floatValue(), this.valueRange.h().floatValue(), userValue, minPx, maxPx);
    }

    private final float D(float minPx, float maxPx, float offset) {
        return ik.M(minPx, maxPx, offset, this.valueRange.e().floatValue(), this.valueRange.h().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(boolean z15) {
        this.isDragging.setValue(Boolean.valueOf(z15));
    }

    private final void H(float f15) {
        this.pressOffset.p(f15);
    }

    private final void I(float f15) {
        this.rawOffset.p(f15);
    }

    private final void M(int i15) {
        this.totalHeight.g(i15);
    }

    private final void N(int i15) {
        this.totalWidth.g(i15);
    }

    private final void P(float f15) {
        this.valueState.p(f15);
    }

    private final float f(float newVal) {
        return ik.S(m.m(newVal, this.valueRange.e().floatValue(), this.valueRange.h().floatValue()), this.tickFractions, this.valueRange.e().floatValue(), this.valueRange.h().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(mk mkVar) {
        er.a<i0> aVar;
        if (!mkVar.z() && (aVar = mkVar.onValueChangeFinished) != null) {
            aVar.a();
        }
        return i0.f148189a;
    }

    private final float n() {
        return this.pressOffset.a();
    }

    private final float o() {
        return this.rawOffset.a();
    }

    private final int u() {
        return this.totalHeight.d();
    }

    private final int v() {
        return this.totalWidth.d();
    }

    private final float y() {
        return this.valueState.a();
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getIsRtl() {
        return this.isRtl;
    }

    public final void B(long pos) {
        float fIntBitsToFloat;
        float fV;
        float fIntBitsToFloat2;
        if (this.orientation == a2.Vertical) {
            if (this.reverseVerticalDirection) {
                fV = u();
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (pos & BodyPartID.bodyIdMax));
                fIntBitsToFloat = fV - fIntBitsToFloat2;
            } else {
                fIntBitsToFloat = Float.intBitsToFloat((int) (pos & BodyPartID.bodyIdMax));
            }
        } else if (this.isRtl) {
            fV = v();
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (pos >> 32));
            fIntBitsToFloat = fV - fIntBitsToFloat2;
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (pos >> 32));
        }
        H(fIntBitsToFloat - o());
    }

    public final void F(l<? super Float, i0> lVar) {
        this.onValueChange = lVar;
    }

    public final void G(er.a<i0> aVar) {
        this.onValueChangeFinished = aVar;
    }

    public final void J(boolean z15) {
        this.isRtl = z15;
    }

    public final void K(int i15) {
        this.thumbHeight.g(i15);
    }

    public final void L(int i15) {
        this.thumbWidth.g(i15);
    }

    public final void O(float f15) {
        if (this.shouldAutoSnap) {
            f15 = f(f15);
        }
        P(f15);
    }

    public final void Q(int newTotalWidth, int newTotalHeight) {
        N(newTotalWidth);
        M(newTotalHeight);
    }

    @Override // p143z0.d1
    public Object a(z1 z1Var, p<? super u0, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super i0> eVar) {
        Object objE = q0.e(new b(z1Var, pVar, null), eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    public void g(float delta) {
        float fMax;
        float fMin;
        if (this.orientation == a2.Vertical) {
            fMax = Math.max(u() - (r() / 2.0f), 0.0f);
            fMin = Math.min(r() / 2.0f, fMax);
        } else {
            fMax = Math.max(v() - (s() / 2.0f), 0.0f);
            fMin = Math.min(s() / 2.0f, fMax);
        }
        I(o() + delta + n());
        H(0.0f);
        float fD = D(fMin, fMax, ik.S(o(), this.tickFractions, fMin, fMax));
        if (fD == w()) {
            return;
        }
        l<? super Float, i0> lVar = this.onValueChange;
        if (lVar == null) {
            O(fD);
        } else if (lVar != null) {
            lVar.b(Float.valueOf(fD));
        }
    }

    public final float i() {
        return ik.I(this.valueRange.e().floatValue(), this.valueRange.h().floatValue(), m.m(w(), this.valueRange.e().floatValue(), this.valueRange.h().floatValue()));
    }

    public final er.a<i0> j() {
        return this.gestureEndAction;
    }

    public final l<Float, i0> k() {
        return this.onValueChange;
    }

    public final er.a<i0> l() {
        return this.onValueChangeFinished;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final a2 getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getReverseVerticalDirection() {
        return this.reverseVerticalDirection;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    public final int r() {
        return this.thumbHeight.d();
    }

    public final int s() {
        return this.thumbWidth.d();
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final float[] getTickFractions() {
        return this.tickFractions;
    }

    public final float w() {
        return y();
    }

    public final e<Float> x() {
        return this.valueRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z() {
        return ((Boolean) this.isDragging.getValue()).booleanValue();
    }

    public mk(float f15, int i15, er.a<i0> aVar, e<Float> eVar) {
        this.steps = i15;
        this.onValueChangeFinished = aVar;
        this.valueRange = eVar;
        this.valueState = x3.a(f15);
        this.shouldAutoSnap = true;
        this.tickFractions = ik.T(i15);
        this.totalWidth = m5.a(0);
        this.totalHeight = m5.a(0);
        this.thumbWidth = m5.a(0);
        this.thumbHeight = m5.a(0);
        this.orientation = a2.Horizontal;
        this.isDragging = c6.e(Boolean.FALSE, null, 2, null);
        this.gestureEndAction = new er.a() { // from class: f2.lk
            @Override // er.a
            public final Object a() {
                return mk.h(this.f56762a);
            }
        };
        this.rawOffset = x3.a(C(0.0f, 0.0f, f15));
        this.pressOffset = x3.a(0.0f);
        this.dragScope = new c();
        this.scrollMutex = new b2();
    }

    public /* synthetic */ mk(float f15, int i15, er.a aVar, e eVar, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 0.0f : f15, (i16 & 2) != 0 ? 0 : i15, (i16 & 4) != 0 ? null : aVar, (i16 & 8) != 0 ? m.b(0.0f, 1.0f) : eVar);
    }
}
