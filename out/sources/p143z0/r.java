package p143z0;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import er.p;
import er.q;
import fr.t;
import ip.a;
import lr.m;
import oq.i0;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.f6;
import p076m2.x2;
import p076m2.x3;
import p076m2.x5;
import u0.c0;
import vq.k;
import w0.b2;
import w0.g0;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\b\u000b*\u0001y\b\u0007\u0018\u0000 \u0082\u0001*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001,B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0004\u0010\tJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\u00172\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\b\b\u0002\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0087@¢\u0006\u0004\b\u001b\u0010\u001cJJ\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u001d2.\u0010\"\u001a*\b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170!\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001fH\u0086@¢\u0006\u0004\b#\u0010$JX\u0010&\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00028\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u001d24\u0010\"\u001a0\b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170!\u0012\u0006\u0012\u0004\u0018\u00010\u00020%H\u0086@¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0000¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n¢\u0006\u0004\b+\u0010*R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R.\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R(\u0010=\u001a\b\u0012\u0004\u0012\u00020\n068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R<\u0010H\u001a\b\u0012\u0004\u0012\u00020\n0>2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0>8\u0006@@X\u0087.¢\u0006\u0018\n\u0004\b@\u0010A\u0012\u0004\bF\u0010G\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER<\u0010Q\u001a\b\u0012\u0004\u0012\u00020\n0I2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0I8\u0006@@X\u0087.¢\u0006\u0018\n\u0004\bJ\u0010K\u0012\u0004\bP\u0010G\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR+\u0010\\\u001a\u00028\u00002\u0006\u0010V\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\u0005R+\u0010`\u001a\u00028\u00002\u0006\u0010V\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010X\u001a\u0004\b^\u0010Z\"\u0004\b_\u0010\u0005R\u001b\u0010\u000f\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010ZR+\u0010h\u001a\u00020\n2\u0006\u0010V\u001a\u00020\n8G@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010d\u001a\u0004\be\u0010\u0013\"\u0004\bf\u0010gR!\u0010k\u001a\u00020\n8GX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b#\u0010b\u0012\u0004\bj\u0010G\u001a\u0004\bi\u0010\u0013R+\u0010o\u001a\u00020\n2\u0006\u0010V\u001a\u00020\n8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bl\u0010d\u001a\u0004\bm\u0010\u0013\"\u0004\bn\u0010gR/\u0010s\u001a\u0004\u0018\u00018\u00002\b\u0010V\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bp\u0010X\u001a\u0004\bq\u0010Z\"\u0004\br\u0010\u0005R7\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010X\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0014\u0010{\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010zR\u001a\u0010\u007f\u001a\u00020\u00078@X\u0080\u0004¢\u0006\f\u0012\u0004\b~\u0010G\u001a\u0004\b|\u0010}R\u0013\u0010\u0081\u0001\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010}¨\u0006\u0083\u0001"}, d2 = {"Lz0/r;", "T", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "", "confirmValueChange", "(Ljava/lang/Object;Ler/l;)V", "", "currentOffset", "n", "(F)Ljava/lang/Object;", "o", "targetValue", "U", "(Ljava/lang/Object;)Z", i.f37087n, "()F", "Lz0/v0;", "newAnchors", "newTarget", "Loq/i0;", "V", "(Lz0/v0;Ljava/lang/Object;)V", "velocity", a.f96137b, "(FLtq/e;)Ljava/lang/Object;", "Lw0/z1;", "dragPriority", "Lkotlin/Function3;", "Lz0/b;", "Ltq/e;", "block", "k", "(Lw0/z1;Ler/q;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function4;", "j", "(Ljava/lang/Object;Lw0/z1;Ler/r;Ltq/e;)Ljava/lang/Object;", "delta", "F", "(F)F", "q", "a", "Ler/l;", "s", "()Ler/l;", "setConfirmValueChange$foundation", "(Ler/l;)V", "b", "y", "O", "positionalThreshold", "Lkotlin/Function0;", "c", "Ler/a;", a.f96138c, "()Ler/a;", "R", "(Ler/a;)V", "velocityThreshold", "Lu0/l;", "value", "d", "Lu0/l;", "A", "()Lu0/l;", "Q", "(Lu0/l;)V", "getSnapAnimationSpec$annotations", "()V", "snapAnimationSpec", "Lu0/c0;", "e", "Lu0/c0;", "u", "()Lu0/c0;", "K", "(Lu0/c0;)V", "getDecayAnimationSpec$annotations", "decayAnimationSpec", "Lw0/b2;", "f", "Lw0/b2;", "dragMutex", "<set-?>", "g", "Lm2/a3;", "t", "()Ljava/lang/Object;", "J", "currentValue", "h", "z", i.f37086m, "settledValue", "i", "Lm2/f6;", "B", "Lm2/x2;", "x", "N", "(F)V", "offset", "getProgress", "getProgress$annotations", "progress", "l", "w", "M", "lastVelocity", "m", "v", i.f37094u, "dragTarget", "r", "()Lz0/v0;", "I", "(Lz0/v0;)V", "anchors", "z0/r$e", "Lz0/r$e;", "anchoredDragScope", "C", "()Z", "getUsePreModifierChangeBehavior$foundation$annotations", "usePreModifierChangeBehavior", "E", "isAnimationRunning", "p", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private l<? super T, Boolean> confirmValueChange;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public l<? super Float, Float> positionalThreshold;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public er.a<Float> velocityThreshold;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public u0.l<Float> snapAnimationSpec;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public c0<Float> decayAnimationSpec;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final b2 dragMutex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a3 currentValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a3 settledValue;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final f6 targetValue;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final x2 offset;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final f6 progress;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final x2 lastVelocity;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a3 dragTarget;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final a3 anchors;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final e anchoredDragScope;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231650e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ r<T> f231651f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<p143z0.b, v0<T>, tq.e<? super i0>, Object> f231652g;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lz0/v0;", "latestAnchors", "Loq/i0;", "<anonymous>", "(Lz0/v0;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends k implements p<v0<T>, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f231653e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f231654f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ q<p143z0.b, v0<T>, tq.e<? super i0>, Object> f231655g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ r<T> f231656h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(q<? super p143z0.b, ? super v0<T>, ? super tq.e<? super i0>, ? extends Object> qVar, r<T> rVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f231655g = qVar;
                this.f231656h = rVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f231653e;
                if (i15 == 0) {
                    u.b(obj);
                    v0<T> v0Var = (v0) this.f231654f;
                    q<p143z0.b, v0<T>, tq.e<? super i0>, Object> qVar = this.f231655g;
                    e eVar = ((r) this.f231656h).anchoredDragScope;
                    this.f231653e = 1;
                    if (qVar.w(eVar, v0Var, this) == objE) {
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
            public final Object B(v0<T> v0Var, tq.e<? super i0> eVar) {
                return ((a) v(v0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f231655g, this.f231656h, eVar);
                aVar.f231654f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(r<T> rVar, q<? super p143z0.b, ? super v0<T>, ? super tq.e<? super i0>, ? extends Object> qVar, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f231651f = rVar;
            this.f231652g = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v0 V(r rVar) {
            return rVar.r();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231650e;
            if (i15 == 0) {
                u.b(obj);
                final r<T> rVar = this.f231651f;
                er.a aVar = new er.a() { // from class: z0.s
                    @Override // er.a
                    public final Object a() {
                        return r.b.V(rVar);
                    }
                };
                a aVar2 = new a(this.f231652g, this.f231651f, null);
                this.f231650e = 1;
                if (j.C(aVar, aVar2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            T tB = this.f231651f.r().b(this.f231651f.x());
            if (tB != null) {
                if (Math.abs(this.f231651f.x() - this.f231651f.r().c(tB)) < 0.5f && this.f231651f.s().b(tB).booleanValue()) {
                    this.f231651f.P(tB);
                    this.f231651f.J(tB);
                }
            }
            return i0.f148189a;
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return new b(this.f231651f, this.f231652g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((b) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f231657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ r<T> f231658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f231659f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r<T> rVar, tq.e<? super c> eVar) {
            super(eVar);
            this.f231658e = rVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231657d = obj;
            this.f231659f |= PKIFailureInfo.systemUnavail;
            return this.f231658e.j(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class d extends k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ r<T> f231661f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ T f231662g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.r<p143z0.b, v0<T>, T, tq.e<? super i0>, Object> f231663h;

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Loq/r;", "Lz0/v0;", "<destruct>", "Loq/i0;", "<anonymous>", "(Loq/r;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends k implements p<oq.r<? extends v0<T>, ? extends T>, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f231664e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f231665f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ er.r<p143z0.b, v0<T>, T, tq.e<? super i0>, Object> f231666g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ r<T> f231667h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(er.r<? super p143z0.b, ? super v0<T>, ? super T, ? super tq.e<? super i0>, ? extends Object> rVar, r<T> rVar2, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f231666g = rVar;
                this.f231667h = rVar2;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to z0.r$d$a for r5v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r5.f231664e
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    oq.u.b(r6)
                    goto L39
                Lf:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L17:
                    oq.u.b(r6)
                    java.lang.Object r6 = r5.f231665f
                    oq.r r6 = (oq.r) r6
                    java.lang.Object r1 = r6.a()
                    z0.v0 r1 = (p143z0.v0) r1
                    java.lang.Object r6 = r6.b()
                    er.r<z0.b, z0.v0<T>, T, tq.e<? super oq.i0>, java.lang.Object> r3 = r5.f231666g
                    z0.r<T> r4 = r5.f231667h
                    z0.r$e r4 = p143z0.r.d(r4)
                    r5.f231664e = r2
                    java.lang.Object r6 = r3.g(r4, r1, r6, r5)
                    if (r6 != r0) goto L39
                    return r0
                L39:
                    oq.i0 r6 = oq.i0.f148189a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: z0.r.d.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(oq.r<? extends v0<T>, ? extends T> rVar, tq.e<? super i0> eVar) {
                return ((a) v(rVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f231666g, this.f231667h, eVar);
                aVar.f231665f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(r<T> rVar, T t15, er.r<? super p143z0.b, ? super v0<T>, ? super T, ? super tq.e<? super i0>, ? extends Object> rVar2, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f231661f = rVar;
            this.f231662g = t15;
            this.f231663h = rVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.r V(r rVar) {
            return y.a(rVar.r(), rVar.B());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231660e;
            if (i15 == 0) {
                u.b(obj);
                this.f231661f.L(this.f231662g);
                final r<T> rVar = this.f231661f;
                er.a aVar = new er.a() { // from class: z0.t
                    @Override // er.a
                    public final Object a() {
                        return r.d.V(rVar);
                    }
                };
                a aVar2 = new a(this.f231663h, this.f231661f, null);
                this.f231660e = 1;
                if (j.C(aVar, aVar2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            if (this.f231661f.s().b(this.f231662g).booleanValue()) {
                ((r) this.f231661f).anchoredDragScope.a(this.f231661f.r().c(this.f231662g), this.f231661f.w());
                this.f231661f.P(this.f231662g);
                this.f231661f.J(this.f231662g);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return new d(this.f231661f, this.f231662g, this.f231663h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((d) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bR$\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"z0/r$e", "Lz0/b;", "", "newOffset", "lastKnownVelocity", "Loq/i0;", "a", "(FF)V", "", "isMovingForward", "d", "(Z)V", "c", "Ljava/lang/Object;", "getLeftBound", "()Ljava/lang/Object;", "setLeftBound", "(Ljava/lang/Object;)V", "leftBound", "b", "getRightBound", "setRightBound", "rightBound", "F", "getDistance", "()F", "setDistance", "(F)V", "distance", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements p143z0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private T leftBound;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private T rightBound;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private float distance = Float.NaN;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r<T> f231671d;

        e(r<T> rVar) {
            this.f231671d = rVar;
        }

        @Override // p143z0.b
        public void a(float newOffset, float lastKnownVelocity) {
            float fX = this.f231671d.x();
            this.f231671d.N(newOffset);
            this.f231671d.M(lastKnownVelocity);
            if (Float.isNaN(fX)) {
                return;
            }
            d(newOffset >= fX);
        }

        public final void c(boolean isMovingForward) {
            if (this.f231671d.x() == this.f231671d.r().c(this.f231671d.t())) {
                T tA = this.f231671d.r().a(this.f231671d.x() + (isMovingForward ? 1.0f : -1.0f), isMovingForward);
                if (tA == null) {
                    tA = this.f231671d.t();
                }
                if (isMovingForward) {
                    this.leftBound = this.f231671d.t();
                    this.rightBound = tA;
                } else {
                    this.leftBound = tA;
                    this.rightBound = this.f231671d.t();
                }
            } else {
                T tA2 = this.f231671d.r().a(this.f231671d.x(), false);
                if (tA2 == null) {
                    tA2 = this.f231671d.t();
                }
                T tA3 = this.f231671d.r().a(this.f231671d.x(), true);
                if (tA3 == null) {
                    tA3 = this.f231671d.t();
                }
                this.leftBound = tA2;
                this.rightBound = tA3;
            }
            this.distance = Math.abs(this.f231671d.r().c(this.leftBound) - this.f231671d.r().c(this.rightBound));
        }

        public final void d(boolean isMovingForward) {
            c(isMovingForward);
            if (Math.abs(this.f231671d.x() - this.f231671d.r().c(this.f231671d.t())) >= this.distance / 2.0f) {
                T t15 = isMovingForward ? this.rightBound : this.leftBound;
                if (t15 == null) {
                    t15 = this.f231671d.t();
                }
                if (((Boolean) this.f231671d.s().b(t15)).booleanValue()) {
                    this.f231671d.J(t15);
                }
            }
        }
    }

    public r(T t15) {
        this.confirmValueChange = new l() { // from class: z0.o
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(r.p(obj));
            }
        };
        this.dragMutex = new b2();
        this.currentValue = c6.e(t15, null, 2, null);
        this.settledValue = c6.e(t15, null, 2, null);
        this.targetValue = x5.d(new er.a() { // from class: z0.p
            @Override // er.a
            public final Object a() {
                return r.T(this.f231523a);
            }
        });
        this.offset = x3.a(Float.NaN);
        this.progress = x5.e(x5.r(), new er.a() { // from class: z0.q
            @Override // er.a
            public final Object a() {
                return Float.valueOf(r.G(this.f231566a));
            }
        });
        this.lastVelocity = x3.a(0.0f);
        this.dragTarget = c6.e(null, null, 2, null);
        this.anchors = c6.e(j.B(), null, 2, null);
        this.anchoredDragScope = new e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float G(r rVar) {
        float fC = rVar.r().c(rVar.z());
        float fC2 = rVar.r().c(rVar.B()) - fC;
        float fAbs = Math.abs(fC2);
        if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
            return 1.0f;
        }
        float fH = (rVar.H() - fC) / fC2;
        if (fH < 1.0E-6f) {
            return 0.0f;
        }
        if (fH > 0.999999f) {
            return 1.0f;
        }
        return fH;
    }

    private final void I(v0<T> v0Var) {
        this.anchors.setValue(v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(T t15) {
        this.currentValue.setValue(t15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(T t15) {
        this.dragTarget.setValue(t15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(float f15) {
        this.lastVelocity.p(f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(float f15) {
        this.offset.p(f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(T t15) {
        this.settledValue.setValue(t15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object T(r rVar) {
        Object objV = rVar.v();
        return objV == null ? rVar.n(rVar.x()) : objV;
    }

    private final boolean U(T targetValue) {
        b2 b2Var = this.dragMutex;
        boolean zG = b2Var.g();
        if (!zG) {
            return zG;
        }
        try {
            e eVar = this.anchoredDragScope;
            float fC = r().c(targetValue);
            if (!Float.isNaN(fC)) {
                p143z0.b.b(eVar, fC, 0.0f, 2, null);
                L(null);
            }
            J(targetValue);
            P(targetValue);
            return zG;
        } finally {
            b2Var.i();
        }
    }

    public static /* synthetic */ Object l(r rVar, Object obj, z1 z1Var, er.r rVar2, tq.e eVar, int i15, Object obj2) throws Throwable {
        if ((i15 & 2) != 0) {
            z1Var = z1.Default;
        }
        return rVar.j(obj, z1Var, rVar2, eVar);
    }

    public static /* synthetic */ Object m(r rVar, z1 z1Var, q qVar, tq.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z1Var = z1.Default;
        }
        return rVar.k(z1Var, qVar, eVar);
    }

    private final T n(float currentOffset) {
        T tB;
        if (g0.isAnchoredDraggableTargetValueCalculationFixEnabled) {
            return o(currentOffset);
        }
        return (Float.isNaN(currentOffset) || (tB = r().b(currentOffset)) == null) ? t() : tB;
    }

    private final T o(float currentOffset) {
        if (Float.isNaN(currentOffset)) {
            return t();
        }
        float fC = r().c(t());
        if (Float.isNaN(fC) || currentOffset == fC) {
            return t();
        }
        T tB = r().b(currentOffset);
        return tB == null ? t() : tB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(Object obj) {
        return true;
    }

    private final T v() {
        return this.dragTarget.getValue();
    }

    public final u0.l<Float> A() {
        u0.l<Float> lVar = this.snapAnimationSpec;
        if (lVar != null) {
            return lVar;
        }
        return null;
    }

    public final T B() {
        return (T) this.targetValue.getValue();
    }

    public final boolean C() {
        return (this.positionalThreshold == null || this.velocityThreshold == null || this.snapAnimationSpec == null || this.decayAnimationSpec == null) ? false : true;
    }

    public final er.a<Float> D() {
        er.a<Float> aVar = this.velocityThreshold;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final boolean E() {
        return v() != null;
    }

    public final float F(float delta) {
        return m.m((Float.isNaN(x()) ? 0.0f : x()) + delta, r().e(), r().g());
    }

    public final float H() {
        if (Float.isNaN(x())) {
            c1.e.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return x();
    }

    public final void K(c0<Float> c0Var) {
        this.decayAnimationSpec = c0Var;
    }

    public final void O(l<? super Float, Float> lVar) {
        this.positionalThreshold = lVar;
    }

    public final void Q(u0.l<Float> lVar) {
        this.snapAnimationSpec = lVar;
    }

    public final void R(er.a<Float> aVar) {
        this.velocityThreshold = aVar;
    }

    @oq.a
    public final Object S(float f15, tq.e<? super Float> eVar) {
        if (!C()) {
            c1.e.a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        T t15 = t();
        Object objA = j.A(r(), H(), f15, y(), D());
        return this.confirmValueChange.b(objA).booleanValue() ? j.y(this, objA, f15, null, null, eVar, 12, null) : j.y(this, t15, f15, null, null, eVar, 12, null);
    }

    public final void V(v0<T> newAnchors, T newTarget) {
        if (t.c(r(), newAnchors)) {
            return;
        }
        I(newAnchors);
        if (U(newTarget)) {
            return;
        }
        L(newTarget);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(T t15, z1 z1Var, er.r<? super p143z0.b, ? super v0<T>, ? super T, ? super tq.e<? super i0>, ? extends Object> rVar, tq.e<? super i0> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f231659f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f231659f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(this, eVar);
            }
        } else {
            cVar = new c(this, eVar);
        }
        Object obj = cVar.f231657d;
        Object objE = uq.b.e();
        int i16 = cVar.f231659f;
        try {
            if (i16 == 0) {
                u.b(obj);
                if (r().d(t15)) {
                    b2 b2Var = this.dragMutex;
                    d dVar = new d(this, t15, rVar, null);
                    cVar.f231659f = 1;
                    if (b2Var.d(z1Var, dVar, cVar) == objE) {
                        return objE;
                    }
                } else if (this.confirmValueChange.b(t15).booleanValue()) {
                    P(t15);
                    J(t15);
                }
                return i0.f148189a;
            }
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            L(null);
            return i0.f148189a;
        } catch (Throwable th4) {
            L(null);
            throw th4;
        }
    }

    public final Object k(z1 z1Var, q<? super p143z0.b, ? super v0<T>, ? super tq.e<? super i0>, ? extends Object> qVar, tq.e<? super i0> eVar) {
        Object objD = this.dragMutex.d(z1Var, new b(this, qVar, null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    public final float q(float delta) {
        float F = F(delta);
        float fH = F - H();
        p143z0.b.b(this.anchoredDragScope, F, 0.0f, 2, null);
        return fH;
    }

    public final v0<T> r() {
        return (v0) this.anchors.getValue();
    }

    public final l<T, Boolean> s() {
        return this.confirmValueChange;
    }

    public final T t() {
        return this.currentValue.getValue();
    }

    public final c0<Float> u() {
        c0<Float> c0Var = this.decayAnimationSpec;
        if (c0Var != null) {
            return c0Var;
        }
        return null;
    }

    public final float w() {
        return this.lastVelocity.a();
    }

    public final float x() {
        return this.offset.a();
    }

    public final l<Float, Float> y() {
        l lVar = this.positionalThreshold;
        if (lVar != null) {
            return lVar;
        }
        return null;
    }

    public final T z() {
        return this.settledValue.getValue();
    }

    @oq.a
    public r(T t15, l<? super T, Boolean> lVar) {
        this(t15);
        this.confirmValueChange = lVar;
    }
}
