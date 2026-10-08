package p143z0;

import a1.n;
import a4.p0;
import c5.h;
import er.l;
import er.p;
import er.r;
import f3.m;
import fr.m0;
import ju.d2;
import ju.q0;
import ju.r0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.x5;
import pq.v;
import u0.c0;
import u0.e0;
import u0.e2;
import u0.l0;
import vq.k;
import w0.g2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001ac\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\b\b\u0000\u0010\u0000*\u00020\u00112\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0017\u0010\u0018\u001aw\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0019\u001a\u00028\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0 2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0012H\u0007¢\u0006\u0004\b#\u0010$\u001aT\u0010*\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010)\u001a\u00028\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001eH\u0082@¢\u0006\u0004\b*\u0010+\u001a8\u0010.\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010,\u001a\u00028\u00002\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001eH\u0086@¢\u0006\u0004\b.\u0010/\u001aP\u00100\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010,\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0 H\u0086@¢\u0006\u0004\b0\u00101\u001aQ\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u00102\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cH\u0002¢\u0006\u0004\b3\u00104\u001a\u001b\u00106\u001a\u00020\u001a*\u00020\u001a2\u0006\u00105\u001a\u00020\u001aH\u0002¢\u0006\u0004\b6\u00107\u001aH\u0010=\u001a\u00020\u0014\"\u0004\b\u0000\u001082\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\"\u0010<\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140;\u0012\u0006\u0012\u0004\u0018\u00010\u00110:H\u0082@¢\u0006\u0004\b=\u0010>\u001a\u001b\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\b@\u0010A\u001aM\u0010E\u001a\u00020D\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010C\u001a\u00020B2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001eH\u0000¢\u0006\u0004\bE\u0010F\u001aE\u0010H\u001a\u00020G\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cH\u0002¢\u0006\u0004\bH\u0010I\" \u0010M\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L\" \u0010P\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u001a0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010L\"\u001a\u0010V\u001a\u00020Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001a0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Z"}, d2 = {"T", "Lf3/m;", "Lz0/r;", "state", "", "reverseDirection", "Lz0/a2;", "orientation", "enabled", "Lb1/l;", "interactionSource", "Lw0/g2;", "overscrollEffect", "Lz0/e1;", "flingBehavior", "q", "(Lf3/m;Lz0/r;ZLz0/a2;ZLb1/l;Lw0/g2;Lz0/e1;)Lf3/m;", "", "Lkotlin/Function1;", "Lz0/w0;", "Loq/i0;", "builder", "Lz0/v0;", "h", "(Ler/l;)Lz0/v0;", "initialValue", "", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Lu0/l;", "snapAnimationSpec", "Lu0/c0;", "decayAnimationSpec", "confirmValueChange", "g", "(Ljava/lang/Object;Ler/l;Ler/a;Lu0/l;Lu0/c0;Ler/l;)Lz0/r;", "velocity", "Lz0/b;", "anchoredDragScope", "anchors", "latestTarget", "u", "(Lz0/r;FLz0/b;Lz0/v0;Ljava/lang/Object;Lu0/l;Ltq/e;)Ljava/lang/Object;", "targetValue", "animationSpec", "v", "(Lz0/r;Ljava/lang/Object;Lu0/l;Ltq/e;)Ljava/lang/Object;", "x", "(Lz0/r;Ljava/lang/Object;FLu0/l;Lu0/c0;Ltq/e;)Ljava/lang/Object;", "currentOffset", "A", "(Lz0/v0;FFLer/l;Ler/a;)Ljava/lang/Object;", "target", "z", "(FF)F", "I", "inputs", "Lkotlin/Function2;", "Ltq/e;", "block", "C", "(Ler/a;Ler/p;Ltq/e;)Ljava/lang/Object;", "Lz0/f0;", "B", "()Lz0/f0;", "Lc5/d;", "density", "Lz0/d3;", "s", "(Lz0/r;Lc5/d;Ler/l;Lu0/l;)Lz0/d3;", "La1/n;", "f", "(Lz0/r;Ler/l;Ler/a;)La1/n;", "La4/p0;", "a", "Ler/l;", "AlwaysDrag", "", "b", "GetOrNan", "Lc5/h;", "c", "F", "getAnchoredDraggableMinFlingVelocity", "()F", "AnchoredDraggableMinFlingVelocity", "d", "Lu0/c0;", "NoOpDecayAnimationSpec", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l<p0, Boolean> f231337a = new l() { // from class: z0.h
        @Override // er.l
        public final Object b(Object obj) {
            return Boolean.valueOf(j.e((p0) obj));
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l<Integer, Float> f231338b = new l() { // from class: z0.i
        @Override // er.l
        public final Object b(Object obj) {
            return Float.valueOf(j.i(((Integer) obj).intValue()));
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f231339c = h.n(125);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c0<Float> f231340d = e0.d(new b());

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"z0/j$a", "La1/n;", "", "velocity", "decayOffset", "b", "(FF)F", "a", "(F)F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r<T> f231341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Float, Float> f231342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.a<Float> f231343c;

        /* JADX WARN: Multi-variable type inference failed */
        a(r<T> rVar, l<? super Float, Float> lVar, er.a<Float> aVar) {
            this.f231341a = rVar;
            this.f231342b = lVar;
            this.f231343c = aVar;
        }

        @Override // a1.n
        public float a(float velocity) {
            float fH = this.f231341a.H();
            Object objA = j.A(this.f231341a.r(), fH, velocity, this.f231342b, this.f231343c);
            if (!((Boolean) this.f231341a.s().b(objA)).booleanValue()) {
                objA = this.f231341a.z();
            }
            return this.f231341a.r().c(objA) - fH;
        }

        @Override // a1.n
        public float b(float velocity, float decayOffset) {
            return 0.0f;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"z0/j$b", "Lu0/l0;", "", "playTimeNanos", "", "initialValue", "initialVelocity", "e", "(JFF)F", "c", "(FF)J", "b", "d", "(FF)F", "a", "F", "()F", "absVelocityThreshold", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float absVelocityThreshold;

        b() {
        }

        @Override // u0.l0
        /* JADX INFO: renamed from: a, reason: from getter */
        public float getAbsVelocityThreshold() {
            return this.absVelocityThreshold;
        }

        @Override // u0.l0
        public float b(long playTimeNanos, float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // u0.l0
        public long c(float initialValue, float initialVelocity) {
            return 0L;
        }

        @Override // u0.l0
        public float d(float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // u0.l0
        public float e(long playTimeNanos, float initialValue, float initialVelocity) {
            return 0.0f;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"T", "Lz0/b;", "Lz0/v0;", "anchors", "latestTarget", "Loq/i0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class c<T> extends k implements r<p143z0.b, v0<T>, T, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231345e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231346f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f231347g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f231348h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ r<T> f231349j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ u0.l<Float> f231350k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r<T> rVar, u0.l<Float> lVar, tq.e<? super c> eVar) {
            super(4, eVar);
            this.f231349j = rVar;
            this.f231350k = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231345e;
            if (i15 == 0) {
                u.b(obj);
                p143z0.b bVar = (p143z0.b) this.f231346f;
                v0 v0Var = (v0) this.f231347g;
                Object obj2 = this.f231348h;
                r<T> rVar = this.f231349j;
                float fW = rVar.w();
                u0.l<Float> lVar = this.f231350k;
                this.f231346f = null;
                this.f231347g = null;
                this.f231345e = 1;
                if (j.u(rVar, fW, bVar, v0Var, obj2, lVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.r
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object g(p143z0.b bVar, v0<T> v0Var, T t15, tq.e<? super i0> eVar) {
            c cVar = new c(this.f231349j, this.f231350k, eVar);
            cVar.f231346f = bVar;
            cVar.f231347g = v0Var;
            cVar.f231348h = t15;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f231351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231352e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f231353f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231354g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231353f = obj;
            this.f231354g |= PKIFailureInfo.systemUnavail;
            return j.x(null, null, 0.0f, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"T", "Lz0/b;", "Lz0/v0;", "anchors", "latestTarget", "Loq/i0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    static final class e<T> extends k implements r<p143z0.b, v0<T>, T, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231356f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f231357g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f231358h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ r<T> f231359j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f231360k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ u0.l<Float> f231361l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ m0 f231362m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ c0<Float> f231363n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(r<T> rVar, float f15, u0.l<Float> lVar, m0 m0Var, c0<Float> c0Var, tq.e<? super e> eVar) {
            super(4, eVar);
            this.f231359j = rVar;
            this.f231360k = f15;
            this.f231361l = lVar;
            this.f231362m = m0Var;
            this.f231363n = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(float f15, m0 m0Var, p143z0.b bVar, m0 m0Var2, u0.k kVar) {
            if ((((Number) kVar.e()).floatValue() >= f15 || m0Var.f66406a <= f15) && (((Number) kVar.e()).floatValue() <= f15 || m0Var.f66406a >= f15)) {
                bVar.a(((Number) kVar.e()).floatValue(), ((Number) kVar.f()).floatValue());
                m0Var2.f66406a = ((Number) kVar.f()).floatValue();
                m0Var.f66406a = ((Number) kVar.e()).floatValue();
            } else {
                float fZ = j.z(((Number) kVar.e()).floatValue(), f15);
                bVar.a(fZ, ((Number) kVar.f()).floatValue());
                m0Var2.f66406a = Float.isNaN(((Number) kVar.f()).floatValue()) ? 0.0f : ((Number) kVar.f()).floatValue();
                m0Var.f66406a = fZ;
                kVar.a();
            }
            return i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
        
            if (u0.e2.v(r1, r1, false, r3, r24, 2, null) == r7) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
        
            if (p143z0.j.u(r0, r11, r0, r4, r5, r5, r24) == r7) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
        
            if (p143z0.j.u(r0, r12, r0, r4, r5, r5, r24) == r7) goto L44;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.j.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.r
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object g(p143z0.b bVar, v0<T> v0Var, T t15, tq.e<? super i0> eVar) {
            e eVar2 = new e(this.f231359j, this.f231360k, this.f231361l, this.f231362m, this.f231363n, eVar);
            eVar2.f231356f = bVar;
            eVar2.f231357g = v0Var;
            eVar2.f231358h = t15;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f<I> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f231364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231365e;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231364d = obj;
            this.f231365e |= PKIFailureInfo.systemUnavail;
            return j.C(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends k implements p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231367f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.a<I> f231368g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p<I, tq.e<? super i0>, Object> f231369h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ fr.p0<d2> f231370a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ju.p0 f231371b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<I, tq.e<? super i0>, Object> f231372c;

            /* JADX INFO: renamed from: z0.j$g$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class C6220a extends k implements p<ju.p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f231373e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ p<I, tq.e<? super i0>, Object> f231374f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ I f231375g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ ju.p0 f231376h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C6220a(p<? super I, ? super tq.e<? super i0>, ? extends Object> pVar, I i15, ju.p0 p0Var, tq.e<? super C6220a> eVar) {
                    super(2, eVar);
                    this.f231374f = pVar;
                    this.f231375g = i15;
                    this.f231376h = p0Var;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f231373e;
                    if (i15 == 0) {
                        u.b(obj);
                        p<I, tq.e<? super i0>, Object> pVar = this.f231374f;
                        I i16 = this.f231375g;
                        this.f231373e = 1;
                        if (pVar.B(i16, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj);
                    }
                    q0.c(this.f231376h, new p143z0.a());
                    return i0.f148189a;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
                    return ((C6220a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new C6220a(this.f231374f, this.f231375g, this.f231376h, eVar);
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class b extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f231377d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f231378e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                /* synthetic */ Object f231379f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ a<T> f231380g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                int f231381h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(a<? super T> aVar, tq.e<? super b> eVar) {
                    super(eVar);
                    this.f231380g = aVar;
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f231379f = obj;
                    this.f231381h |= PKIFailureInfo.systemUnavail;
                    return this.f231380g.F(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(fr.p0<d2> p0Var, ju.p0 p0Var2, p<? super I, ? super tq.e<? super i0>, ? extends Object> pVar) {
                this.f231370a = p0Var;
                this.f231371b = p0Var2;
                this.f231372c = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(I i15, tq.e<? super i0> eVar) throws Throwable {
                b bVar;
                Object obj;
                if (eVar instanceof b) {
                    bVar = (b) eVar;
                    int i16 = bVar.f231381h;
                    if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                        bVar.f231381h = i16 - PKIFailureInfo.systemUnavail;
                    } else {
                        bVar = new b(this, eVar);
                    }
                } else {
                    bVar = new b(this, eVar);
                }
                Object obj2 = bVar.f231379f;
                Object objE = uq.b.e();
                int i17 = bVar.f231381h;
                if (i17 == 0) {
                    u.b(obj2);
                    d2 d2Var = this.f231370a.f66410a;
                    if (d2Var != null) {
                        d2Var.u(new p143z0.a());
                        bVar.f231377d = i15;
                        bVar.f231378e = d2Var;
                        bVar.f231381h = 1;
                        if (d2Var.T0(bVar) == objE) {
                            obj = i15;
                            obj = i15;
                            return objE;
                        }
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = bVar.f231377d;
                    u.b(obj2);
                    obj = obj3;
                }
                obj = i15;
                obj = i15;
                obj = i15;
                fr.p0<d2> p0Var = this.f231370a;
                ju.p0 p0Var2 = this.f231371b;
                p0Var.f66410a = (T) ju.k.d(p0Var2, null, r0.UNDISPATCHED, new C6220a(this.f231372c, obj, p0Var2, null), 1, null);
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(er.a<? extends I> aVar, p<? super I, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f231368g = aVar;
            this.f231369h = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231366e;
            if (i15 == 0) {
                u.b(obj);
                ju.p0 p0Var = (ju.p0) this.f231367f;
                fr.p0 p0Var2 = new fr.p0();
                mu.g gVarQ = x5.q(this.f231368g);
                a aVar = new a(p0Var2, p0Var, this.f231369h);
                this.f231366e = 1;
                if (gVarQ.a(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            g gVar = new g(this.f231368g, this.f231369h, eVar);
            gVar.f231367f = obj;
            return gVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x007f A[RETURN] */
    public static final <T> T A(v0<T> v0Var, float f15, float f16, l<? super Float, Float> lVar, er.a<Float> aVar) {
        if (Float.isNaN(f15)) {
            throw new IllegalArgumentException("The offset provided to computeTarget must not be NaN.");
        }
        boolean z15 = Math.abs(f16) > 0.0f;
        boolean z16 = z15 && f16 > 0.0f;
        if (!z15) {
            return v0Var.b(f15);
        }
        if (Math.abs(f16) >= Math.abs(aVar.a().floatValue())) {
            return v0Var.a(f15, z16);
        }
        T tA = v0Var.a(f15, false);
        float fC = v0Var.c(tA);
        T tA2 = v0Var.a(f15, true);
        float fC2 = v0Var.c(tA2);
        float fAbs = Math.abs(lVar.b(Float.valueOf(Math.abs(fC - fC2))).floatValue());
        if (!z16) {
            fC = fC2;
        }
        boolean z17 = Math.abs(fC - f15) >= fAbs;
        if (z17) {
            if (z16) {
                return tA2;
            }
            return tA;
        }
        if (z17) {
            throw new oq.p();
        }
        if (z16) {
            return tA;
        }
        return tA2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> f0<T> B() {
        return new f0<>(v.n(), new float[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <I> Object C(er.a<? extends I> aVar, p<? super I, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super i0> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f231365e;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f231365e = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object obj = fVar.f231364d;
        Object objE = uq.b.e();
        int i16 = fVar.f231365e;
        try {
            if (i16 == 0) {
                u.b(obj);
                g gVar = new g(aVar, pVar, null);
                fVar.f231365e = 1;
                if (q0.e(gVar, fVar) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
        } catch (p143z0.a unused) {
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(p0 p0Var) {
        return true;
    }

    private static final <T> n f(r<T> rVar, l<? super Float, Float> lVar, er.a<Float> aVar) {
        return new a(rVar, lVar, aVar);
    }

    @oq.a
    public static final <T> r<T> g(T t15, l<? super Float, Float> lVar, er.a<Float> aVar, u0.l<Float> lVar2, c0<Float> c0Var, l<? super T, Boolean> lVar3) {
        r<T> rVar = new r<>(t15, lVar3);
        rVar.O(lVar);
        rVar.R(aVar);
        rVar.Q(lVar2);
        rVar.K(c0Var);
        return rVar;
    }

    public static final <T> v0<T> h(l<? super w0<T>, i0> lVar) {
        w0 w0Var = new w0();
        lVar.b(w0Var);
        return new f0(w0Var.b(), w0Var.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(int i15) {
        return Float.NaN;
    }

    public static final <T> m q(m mVar, r<T> rVar, boolean z15, a2 a2Var, boolean z16, b1.l lVar, g2 g2Var, e1 e1Var) {
        return mVar.u(new p143z0.e(rVar, a2Var, z16, Boolean.valueOf(z15), lVar, null, g2Var, e1Var, 32, null));
    }

    public static /* synthetic */ m r(m mVar, r rVar, boolean z15, a2 a2Var, boolean z16, b1.l lVar, g2 g2Var, e1 e1Var, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            z16 = true;
        }
        return q(mVar, rVar, z15, a2Var, z16, (i15 & 16) != 0 ? null : lVar, (i15 & 32) != 0 ? null : g2Var, (i15 & 64) != 0 ? null : e1Var);
    }

    public static final <T> d3 s(r<T> rVar, final c5.d dVar, l<? super Float, Float> lVar, u0.l<Float> lVar2) {
        return a1.m.q(f(rVar, lVar, new er.a() { // from class: z0.f
            @Override // er.a
            public final Object a() {
                return Float.valueOf(j.t(dVar));
            }
        }), f231340d, lVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(c5.d dVar) {
        return dVar.l2(h.n(125));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object u(r<T> rVar, float f15, final p143z0.b bVar, v0<T> v0Var, T t15, u0.l<Float> lVar, tq.e<? super i0> eVar) {
        Object objJ;
        float fC = v0Var.c(t15);
        final m0 m0Var = new m0();
        m0Var.f66406a = Float.isNaN(rVar.x()) ? 0.0f : rVar.x();
        if (!Float.isNaN(fC)) {
            float f16 = m0Var.f66406a;
            if (f16 != fC && (objJ = e2.j(f16, fC, f15, lVar, new p() { // from class: z0.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.w(bVar, m0Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                }
            }, eVar)) == uq.b.e()) {
                return objJ;
            }
        }
        return i0.f148189a;
    }

    public static final <T> Object v(r<T> rVar, T t15, u0.l<Float> lVar, tq.e<? super i0> eVar) throws Throwable {
        Object objL = r.l(rVar, t15, null, new c(rVar, lVar, null), eVar, 2, null);
        return objL == uq.b.e() ? objL : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(p143z0.b bVar, m0 m0Var, float f15, float f16) {
        bVar.a(f15, f16);
        m0Var.f66406a = f15;
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final <T> Object x(r<T> rVar, T t15, float f15, u0.l<Float> lVar, c0<Float> c0Var, tq.e<? super Float> eVar) throws Throwable {
        d dVar;
        float f16;
        m0 m0Var;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f231354g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f231354g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f231353f;
        Object objE = uq.b.e();
        int i16 = dVar2.f231354g;
        if (i16 == 0) {
            u.b(obj);
            m0 m0Var2 = new m0();
            m0Var2.f66406a = f15;
            e eVar2 = new e(rVar, f15, lVar, m0Var2, c0Var, null);
            dVar2.f231352e = m0Var2;
            dVar2.f231351d = f15;
            dVar2.f231354g = 1;
            if (r.l(rVar, t15, null, eVar2, dVar2, 2, null) == objE) {
                return objE;
            }
            f16 = f15;
            m0Var = m0Var2;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f16 = dVar2.f231351d;
            m0Var = (m0) dVar2.f231352e;
            u.b(obj);
        }
        return vq.b.d(f16 - m0Var.f66406a);
    }

    public static /* synthetic */ Object y(r rVar, Object obj, float f15, u0.l lVar, c0 c0Var, tq.e eVar, int i15, Object obj2) {
        if ((i15 & 4) != 0) {
            lVar = rVar.C() ? rVar.A() : p143z0.d.f231212a.f();
        }
        u0.l lVar2 = lVar;
        if ((i15 & 8) != 0) {
            c0Var = rVar.C() ? rVar.u() : p143z0.d.f231212a.d();
        }
        return x(rVar, obj, f15, lVar2, c0Var, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float z(float f15, float f16) {
        if (f16 == 0.0f) {
            return 0.0f;
        }
        return f16 > 0.0f ? lr.m.i(f15, f16) : lr.m.d(f15, f16);
    }
}
