package p114t0;

import c5.r;
import er.p;
import fr.k;
import fr.t;
import fr.w;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import tq.e;
import u0.AnimationResult;
import u0.h;
import u0.l;
import u0.q;
import u0.s3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001:\u0001CB=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u000fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R6\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R$\u00105\u001a\u00020\f2\u0006\u00101\u001a\u00020\f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b2\u0010/\"\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R/\u0010B\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lt0/x0;", "Lt0/l0;", "Lu0/l;", "Lc5/r;", "animationSpec", "Lf3/c;", "alignment", "Lkotlin/Function2;", "Loq/i0;", "listener", "<init>", "(Lu0/l;Lf3/c;Ler/p;)V", "Lc5/b;", "default", "x3", "(J)J", "Y2", "()V", "W2", "Le4/y0;", "Le4/v0;", "measurable", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "targetSize", "n3", "s", "Lu0/l;", "q3", "()Lu0/l;", "u3", "(Lu0/l;)V", "t", "Lf3/c;", "o3", "()Lf3/c;", "s3", "(Lf3/c;)V", "v", "Ler/p;", "r3", "()Ler/p;", "v3", "(Ler/p;)V", "w", "J", "lookaheadSize", "value", "x", "w3", "(J)V", "lookaheadConstraints", "", "y", "Z", "lookaheadConstraintsAvailable", "Lt0/x0$a;", "<set-?>", "z", "Lm2/a3;", "p3", "()Lt0/x0$a;", "t3", "(Lt0/x0$a;)V", "animData", "a", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class x0 extends l0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private l<r> animationSpec;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private f3.c alignment;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private p<? super r, ? super r, i0> listener;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadConstraintsAvailable;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long lookaheadSize = n.c();

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private long lookaheadConstraints = c5.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final a3 animData = c6.e(null, null, 2, null);

    /* JADX INFO: renamed from: t0.x0$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lt0/x0$a;", "", "Lu0/c;", "Lc5/r;", "Lu0/q;", "anim", "startSize", "<init>", "(Lu0/c;JLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu0/c;", "()Lu0/c;", "b", "J", "()J", "c", "(J)V", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AnimData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final u0.c<r, q> anim;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private long startSize;

        public /* synthetic */ AnimData(u0.c cVar, long j15, k kVar) {
            this(cVar, j15);
        }

        public final u0.c<r, q> a() {
            return this.anim;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getStartSize() {
            return this.startSize;
        }

        public final void c(long j15) {
            this.startSize = j15;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) other;
            return t.c(this.anim, animData.anim) && r.e(this.startSize, animData.startSize);
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + r.h(this.startSize);
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) r.i(this.startSize)) + ')';
        }

        private AnimData(u0.c<r, q> cVar, long j15) {
            this.anim = cVar;
            this.startSize = j15;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186520e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ AnimData f186521f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f186522g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ x0 f186523h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AnimData animData, long j15, x0 x0Var, e<? super b> eVar) {
            super(2, eVar);
            this.f186521f = animData;
            this.f186522g = j15;
            this.f186523h = x0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b bVar;
            p<r, r, i0> pVarR3;
            Object objE = uq.b.e();
            int i15 = this.f186520e;
            if (i15 == 0) {
                u.b(obj);
                u0.c<r, q> cVarA = this.f186521f.a();
                r rVarB = r.b(this.f186522g);
                l<r> lVarQ3 = this.f186523h.q3();
                this.f186520e = 1;
                bVar = this;
                obj = u0.c.f(cVarA, rVarB, lVarQ3, null, null, bVar, 12, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                bVar = this;
            }
            AnimationResult animationResult = (AnimationResult) obj;
            if (animationResult.getEndReason() == h.Finished && (pVarR3 = bVar.f186523h.r3()) != 0) {
                pVarR3.B(r.b(bVar.f186521f.getStartSize()), animationResult.b().getValue());
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new b(this.f186521f, this.f186522g, this.f186523h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements er.l<a2.a, i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f186525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f186526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f186527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f186528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a2 f186529g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j15, int i15, int i16, y0 y0Var, a2 a2Var) {
            super(1);
            this.f186525c = j15;
            this.f186526d = i15;
            this.f186527e = i16;
            this.f186528f = y0Var;
            this.f186529g = a2Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(a2.a aVar) {
            a2.a.G(aVar, this.f186529g, x0.this.getAlignment().a(this.f186525c, r.c((((long) this.f186526d) << 32) | (((long) this.f186527e) & BodyPartID.bodyIdMax)), this.f186528f.getLayoutDirection()), 0.0f, 2, null);
        }
    }

    public x0(l<r> lVar, f3.c cVar, p<? super r, ? super r, i0> pVar) {
        this.animationSpec = lVar;
        this.alignment = cVar;
        this.listener = pVar;
    }

    private final void w3(long j15) {
        this.lookaheadConstraints = j15;
        this.lookaheadConstraintsAvailable = true;
    }

    private final long x3(long j15) {
        return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : j15;
    }

    @Override // f3.m.c
    public void W2() {
        super.W2();
        this.lookaheadSize = n.c();
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // f3.m.c
    public void Y2() {
        super.Y2();
        t3(null);
    }

    @Override // g4.z
    public p036e4.x0 c(y0 y0Var, v0 v0Var, long j15) {
        a2 a2VarO0;
        long jD;
        if (y0Var.J0()) {
            w3(j15);
            a2VarO0 = v0Var.o0(j15);
        } else {
            a2VarO0 = v0Var.o0(x3(j15));
        }
        a2 a2Var = a2VarO0;
        long jC = r.c((((long) a2Var.getWidth()) << 32) | (((long) a2Var.getHeight()) & BodyPartID.bodyIdMax));
        if (y0Var.J0()) {
            this.lookaheadSize = jC;
            jD = jC;
        } else {
            jD = c5.c.d(j15, n3(n.d(this.lookaheadSize) ? this.lookaheadSize : jC));
        }
        int i15 = (int) (jD >> 32);
        int i16 = (int) (jD & BodyPartID.bodyIdMax);
        return y0.j2(y0Var, i15, i16, null, new c(jC, i15, i16, y0Var, a2Var), 4, null);
    }

    public final long n3(long targetSize) {
        AnimData animDataP3 = p3();
        if (animDataP3 != null) {
            boolean z15 = (r.e(targetSize, animDataP3.a().m().getPackedValue()) || animDataP3.a().p()) ? false : true;
            if (!r.e(targetSize, animDataP3.a().k().getPackedValue()) || z15) {
                animDataP3.c(animDataP3.a().m().getPackedValue());
                ju.k.d(M2(), null, null, new b(animDataP3, targetSize, this, null), 3, null);
            }
        } else {
            long j15 = 1;
            animDataP3 = new AnimData(new u0.c(r.b(targetSize), s3.O(r.INSTANCE), r.b(r.c((j15 & BodyPartID.bodyIdMax) | (j15 << 32))), null, 8, null), targetSize, null);
        }
        t3(animDataP3);
        return animDataP3.a().m().getPackedValue();
    }

    /* JADX INFO: renamed from: o3, reason: from getter */
    public final f3.c getAlignment() {
        return this.alignment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnimData p3() {
        return (AnimData) this.animData.getValue();
    }

    public final l<r> q3() {
        return this.animationSpec;
    }

    public final p<r, r, i0> r3() {
        return this.listener;
    }

    public final void s3(f3.c cVar) {
        this.alignment = cVar;
    }

    public final void t3(AnimData animData) {
        this.animData.setValue(animData);
    }

    public final void u3(l<r> lVar) {
        this.animationSpec = lVar;
    }

    public final void v3(p<? super r, ? super r, i0> pVar) {
        this.listener = pVar;
    }
}
