package p114t0;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.g1;
import c5.b;
import c5.c;
import c5.d;
import c5.h;
import c5.r;
import c5.s;
import c5.t;
import f3.m;
import fr.w;
import g4.q;
import m3.g;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.b0;
import p036e4.e;
import p036e4.f;
import p036e4.s0;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import q4.v3;
import u4.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\r*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010%\u001a\u00020$*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020\u0013*\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R4\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010=R\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010IR$\u0010P\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010\u0015R$\u0010X\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010`\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_¨\u0006a"}, d2 = {"Lt0/p;", "Le4/e;", "Lf3/m$c;", "Lg4/e;", "Lg4/q;", "Le4/s0;", "lookaheadScope", "Lt0/q;", "boundsTransform", "Lkotlin/Function2;", "Lc5/r;", "Lc5/b;", "onChooseMeasureConstraints", "", "animateMotionFrameOfReference", "<init>", "(Le4/s0;Lt0/q;Ler/p;Z)V", "Lu4/l$b;", "fontFamilyResolver", "Loq/i0;", "u3", "(Lu4/l$b;)V", "lookaheadSize", "y1", "(J)Z", "W2", "()V", "Le4/a2$a;", "Le4/b0;", "lookaheadCoordinates", "N1", "(Le4/a2$a;Le4/b0;)Z", "Le4/f;", "Le4/v0;", "measurable", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "R1", "(Le4/f;Le4/v0;J)Le4/x0;", "Lp3/c;", "y", "(Lp3/c;)V", "r", "Le4/s0;", "p3", "()Le4/s0;", "s3", "(Le4/s0;)V", "s", "Lt0/q;", "getBoundsTransform", "()Lt0/q;", "r3", "(Lt0/q;)V", "t", "Ler/p;", "getOnChooseMeasureConstraints", "()Ler/p;", "t3", "(Ler/p;)V", "v", "Z", "o3", "()Z", "q3", "(Z)V", "w", "directManipulationParentsDirty", "Lt0/r;", "x", "Lt0/r;", "boundsAnimation", "Lq4/v3;", "Lq4/v3;", "textMeasurer", "z", "Lu4/l$b;", "getCurrentResolver", "()Lu4/l$b;", "setCurrentResolver", "currentResolver", "Lc5/d;", "A", "Lc5/d;", "getCurrentDensity", "()Lc5/d;", "setCurrentDensity", "(Lc5/d;)V", "currentDensity", "Lc5/t;", "B", "Lc5/t;", "getCurrentLayoutDirection", "()Lc5/t;", "setCurrentLayoutDirection", "(Lc5/t;)V", "currentLayoutDirection", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p extends m.c implements e, g4.e, q {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private d currentDensity;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private t currentLayoutDirection;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private s0 lookaheadScope;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private q boundsTransform;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private er.p<? super r, ? super b, b> onChooseMeasureConstraints;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean animateMotionFrameOfReference;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean directManipulationParentsDirty = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final r boundsAnimation = new r();

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private v3 textMeasurer;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private l.b currentResolver;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements er.l<a2.a, i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a2 f186425c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a2 a2Var) {
            super(1);
            this.f186425c = a2Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(a2.a aVar) {
            long jN;
            g gVarH = p.this.boundsAnimation.h();
            s0 lookaheadScope = p.this.getLookaheadScope();
            p pVar = p.this;
            b0 b0VarM = aVar.m();
            m3.e eVarD = b0VarM != null ? m3.e.d(lookaheadScope.i(aVar).Q(b0VarM, m3.e.INSTANCE.c(), pVar.getAnimateMotionFrameOfReference())) : null;
            if (gVarH != null) {
                p.this.boundsAnimation.l(gVarH.n(), gVarH.l());
                jN = gVarH.n();
            } else {
                g gVarC = p.this.boundsAnimation.c();
                jN = gVarC != null ? gVarC.n() : m3.e.INSTANCE.c();
            }
            long jP = eVarD != null ? m3.e.p(jN, eVarD.getPackedValue()) : m3.e.INSTANCE.c();
            a2.a.E(aVar, this.f186425c, Math.round(Float.intBitsToFloat((int) (jP >> 32))), Math.round(Float.intBitsToFloat((int) (jP & BodyPartID.bodyIdMax))), 0.0f, 4, null);
        }
    }

    public p(s0 s0Var, q qVar, er.p<? super r, ? super b, b> pVar, boolean z15) {
        this.lookaheadScope = s0Var;
        this.boundsTransform = qVar;
        this.onChooseMeasureConstraints = pVar;
        this.animateMotionFrameOfReference = z15;
    }

    private final void u3(l.b fontFamilyResolver) {
        if (this.textMeasurer == null || !fr.t.c(this.currentResolver, fontFamilyResolver)) {
            this.textMeasurer = new v3(fontFamilyResolver, this.currentDensity, this.currentLayoutDirection, 0, 8, null);
            this.currentResolver = fontFamilyResolver;
        }
    }

    @Override // p036e4.e
    public boolean N1(a2.a aVar, b0 b0Var) {
        if (k0.a() && this.boundsAnimation.getLookaheadAnimationVisualDebugHelper() == null) {
            this.boundsAnimation.k(new n0());
        }
        this.boundsAnimation.n(this.lookaheadScope, aVar, M2(), this.directManipulationParentsDirty, this.animateMotionFrameOfReference, this.boundsTransform);
        this.directManipulationParentsDirty = this.animateMotionFrameOfReference;
        return !this.boundsAnimation.i();
    }

    @Override // p036e4.e
    public x0 R1(f fVar, v0 v0Var, long j15) {
        long jE = this.boundsAnimation.getCurrentSize() == 9205357640488583168L ? s.e(fVar.u1()) : this.boundsAnimation.getCurrentSize();
        g gVarH = this.boundsAnimation.h();
        if (gVarH != null) {
            jE = gVarH.l();
        }
        long jC = s.c(jE);
        long value = this.onChooseMeasureConstraints.B(r.b(jC), b.a(j15)).getValue();
        a2 a2VarO0 = v0Var.o0(value);
        long jD = c.d(value, jC);
        return y0.j2(fVar, (int) (jD >> 32), (int) (jD & BodyPartID.bodyIdMax), null, new a(a2VarO0), 4, null);
    }

    @Override // f3.m.c
    public void W2() {
        this.directManipulationParentsDirty = true;
    }

    /* JADX INFO: renamed from: o3, reason: from getter */
    public final boolean getAnimateMotionFrameOfReference() {
        return this.animateMotionFrameOfReference;
    }

    /* JADX INFO: renamed from: p3, reason: from getter */
    public final s0 getLookaheadScope() {
        return this.lookaheadScope;
    }

    public final void q3(boolean z15) {
        this.animateMotionFrameOfReference = z15;
    }

    public final void r3(q qVar) {
        this.boundsTransform = qVar;
    }

    public final void s3(s0 s0Var) {
        this.lookaheadScope = s0Var;
    }

    public final void t3(er.p<? super r, ? super b, b> pVar) {
        this.onChooseMeasureConstraints = pVar;
    }

    @Override // g4.q
    public void y(p3.c cVar) throws Throwable {
        cVar.H2();
        if (k0.a() && b.j(this.onChooseMeasureConstraints.B(r.b(r.INSTANCE.a()), b.a(c.b(0, 0, 0, 0, 15, null))).getValue())) {
            LookaheadAnimationVisualDebugConfig lookaheadAnimationVisualDebugConfig = (LookaheadAnimationVisualDebugConfig) g4.f.a(this, u.b());
            if (lookaheadAnimationVisualDebugConfig.getIsEnabled()) {
                if (this.currentDensity == null) {
                    this.currentDensity = (d) g4.f.a(this, g1.f());
                    this.currentLayoutDirection = (t) g4.f.a(this, g1.l());
                }
                n0 lookaheadAnimationVisualDebugHelper = this.boundsAnimation.getLookaheadAnimationVisualDebugHelper();
                long jM20unboximpl = ((Color) g4.f.a(this, u.a())).m20unboximpl();
                u3((l.b) g4.f.a(this, g1.h()));
                if (this.boundsAnimation.i()) {
                    lookaheadAnimationVisualDebugHelper.d(cVar, jM20unboximpl, lookaheadAnimationVisualDebugConfig.getIsShowKeyLabelEnabled(), cVar.l2(h.n((float) 2.5d)), this.boundsAnimation.toString().substring(60), this.textMeasurer);
                } else {
                    lookaheadAnimationVisualDebugHelper.e(cVar, jM20unboximpl, this.boundsAnimation.getTargetOffset(), this.boundsAnimation.getTargetSize(), this.boundsAnimation.h(), cVar.y2(), lookaheadAnimationVisualDebugConfig.getIsShowKeyLabelEnabled(), cVar.l2(h.n((float) 2.5d)), this.boundsAnimation.toString().substring(60), this.textMeasurer);
                }
            }
        }
    }

    @Override // p036e4.e
    public boolean y1(long lookaheadSize) {
        this.boundsAnimation.o(s.e(lookaheadSize));
        return !this.boundsAnimation.i();
    }
}
