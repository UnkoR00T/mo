package p046f2;

import b3.b;
import b3.b0;
import b3.x;
import er.a;
import er.l;
import er.p;
import fr.k;
import java.util.List;
import lr.m;
import p071kotlin.Metadata;
import p076m2.x2;
import p076m2.x3;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001\bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R$\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\rR\u0011\u0010&\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010\u000bR\u0011\u0010(\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010\u000b¨\u0006*"}, d2 = {"Lf2/yr;", "", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "<init>", "(FFF)V", "a", "F", "j", "()F", "o", "(F)V", "heightOffsetLimit", "<set-?>", "b", "Lm2/x2;", "h", "m", "contentOffset", "Lkotlin/Function0;", "", "c", "Ler/a;", "isScrollingContentAtStart$material3", "()Ler/a;", "p", "(Ler/a;)V", "isScrollingContentAtStart", "Lm2/x2;", "d", "_heightOffset", "newOffset", "i", "n", "heightOffset", "g", "collapsedFraction", "k", "overlappedFraction", "e", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class yr {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final x<yr, ?> f58440f = b.b(new p() { // from class: f2.vr
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return yr.d((b0) obj, (yr) obj2);
        }
    }, new l() { // from class: f2.wr
        @Override // er.l
        public final Object b(Object obj) {
            return yr.e((List) obj);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float heightOffsetLimit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x2 contentOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private a<Boolean> isScrollingContentAtStart = new a() { // from class: f2.xr
        @Override // er.a
        public final Object a() {
            return Boolean.valueOf(yr.l());
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private x2 _heightOffset;

    /* JADX INFO: renamed from: f2.yr$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf2/yr$a;", "", "<init>", "()V", "Lb3/x;", "Lf2/yr;", "Saver", "Lb3/x;", "a", "()Lb3/x;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final x<yr, ?> a() {
            return yr.f58440f;
        }

        private Companion() {
        }
    }

    public yr(float f15, float f16, float f17) {
        this.heightOffsetLimit = f15;
        this.contentOffset = x3.a(f17);
        this._heightOffset = x3.a(f16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(b0 b0Var, yr yrVar) {
        return v.q(Float.valueOf(yrVar.heightOffsetLimit), Float.valueOf(yrVar.i()), Float.valueOf(yrVar.h()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yr e(List list) {
        return new yr(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l() {
        return true;
    }

    public final float g() {
        if (this.heightOffsetLimit == 0.0f) {
            return 0.0f;
        }
        return i() / this.heightOffsetLimit;
    }

    public final float h() {
        return this.contentOffset.a();
    }

    public final float i() {
        return this._heightOffset.a();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getHeightOffsetLimit() {
        return this.heightOffsetLimit;
    }

    public final float k() {
        if (!this.isScrollingContentAtStart.a().booleanValue() && h() == 0.0f) {
            return 1.0f;
        }
        float f15 = this.heightOffsetLimit;
        if (f15 == 0.0f) {
            return 0.0f;
        }
        return 1 - (m.m(f15 + Math.abs(h()), this.heightOffsetLimit, 0.0f) / this.heightOffsetLimit);
    }

    public final void m(float f15) {
        this.contentOffset.p(f15);
    }

    public final void n(float f15) {
        this._heightOffset.p(m.m(f15, this.heightOffsetLimit, 0.0f));
    }

    public final void o(float f15) {
        this.heightOffsetLimit = f15;
    }

    public final void p(a<Boolean> aVar) {
        this.isScrollingContentAtStart = aVar;
    }
}
