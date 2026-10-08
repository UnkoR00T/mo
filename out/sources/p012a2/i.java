package p012a2;

import er.l;
import er.p;
import er.q;
import er.r;
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
import p143z0.d1;
import p143z0.u0;
import vq.k;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\b\u0001\u0018\u0000 d*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00012BU\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\b\b\u0002\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b!\u0010\"JJ\u0010)\u001a\u00020\u001e2\b\b\u0002\u0010$\u001a\u00020#2.\u0010(\u001a*\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020%H\u0086@¢\u0006\u0004\b)\u0010*JX\u0010,\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010$\u001a\u00020#24\u0010(\u001a0\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020+H\u0086@¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0000¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005¢\u0006\u0004\b1\u00100R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u00103\u001a\u0004\b?\u00105R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010I\u001a\u00020D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR+\u0010\u0010\u001a\u00028\u00002\u0006\u0010J\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001b\u0010\u0016\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010NR\u001b\u0010U\u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b,\u0010R\u001a\u0004\bT\u0010NR+\u0010\u000f\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010V\u001a\u0004\bW\u0010\u001a\"\u0004\bX\u0010YR\u001b\u0010\\\u001a\u00020\u00058GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010R\u001a\u0004\b[\u0010\u001aR+\u0010`\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010V\u001a\u0004\b^\u0010\u001a\"\u0004\b_\u0010YR/\u0010c\u001a\u0004\u0018\u00018\u00002\b\u0010J\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010L\u001a\u0004\ba\u0010N\"\u0004\bb\u0010PR7\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010L\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010iR\u0011\u0010m\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006n"}, d2 = {"La2/i;", "T", "", "initialValue", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Lu0/l;", "animationSpec", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;Ler/l;Ler/a;Lu0/l;Ler/l;)V", "offset", "currentValue", "velocity", "m", "(FLjava/lang/Object;F)Ljava/lang/Object;", "n", "(FLjava/lang/Object;)Ljava/lang/Object;", "targetValue", "K", "(Ljava/lang/Object;)Z", "C", "()F", "La2/r1;", "newAnchors", "newTarget", "Loq/i0;", "M", "(La2/r1;Ljava/lang/Object;)V", "I", "(FLtq/e;)Ljava/lang/Object;", "Lw0/z1;", "dragPriority", "Lkotlin/Function3;", "La2/b;", "Ltq/e;", "block", "j", "(Lw0/z1;Ler/q;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function4;", "i", "(Ljava/lang/Object;Lw0/z1;Ler/r;Ltq/e;)Ljava/lang/Object;", "delta", "A", "(F)F", "o", "a", "Ler/l;", "getPositionalThreshold$material", "()Ler/l;", "b", "Ler/a;", "getVelocityThreshold$material", "()Ler/a;", "c", "Lu0/l;", "q", "()Lu0/l;", "d", "s", "La2/k2;", "e", "La2/k2;", "dragMutex", "Lz0/d1;", "f", "Lz0/d1;", "v", "()Lz0/d1;", "draggableState", "<set-?>", "g", "Lm2/a3;", "t", "()Ljava/lang/Object;", "E", "(Ljava/lang/Object;)V", "h", "Lm2/f6;", "y", "r", "closestValue", "Lm2/x2;", "x", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(F)V", "k", "getProgress", "progress", "l", "w", "G", "lastVelocity", "u", "F", "dragTarget", "p", "()La2/r1;", a.f96138c, "(La2/r1;)V", "anchors", "La2/b;", "anchoredDragScope", "z", "()Z", "isAnimationRunning", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<Float, Float> positionalThreshold;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.a<Float> velocityThreshold;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u0.l<Float> animationSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l<T, Boolean> confirmValueChange;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a3 currentValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k2 dragMutex = new k2();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d1 draggableState = new g(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final f6 targetValue = x5.d(new er.a() { // from class: a2.e
        @Override // er.a
        public final Object a() {
            return i.J(this.f1518a);
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final f6 closestValue = x5.d(new er.a() { // from class: a2.f
        @Override // er.a
        public final Object a() {
            return i.l(this.f1539a);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final x2 offset = x3.a(Float.NaN);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final f6 progress = x5.e(x5.r(), new er.a() { // from class: a2.g
        @Override // er.a
        public final Object a() {
            return Float.valueOf(i.B(this.f1545a));
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final x2 lastVelocity = x3.a(0.0f);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a3 dragTarget = c6.e(null, null, 2, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final a3 anchors = c6.e(p012a2.c.i(), null, 2, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final p012a2.b anchoredDragScope = new f(this);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f1645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i<T> f1646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1647f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i<T> iVar, tq.e<? super b> eVar) {
            super(eVar);
            this.f1646e = iVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f1645d = obj;
            this.f1647f |= PKIFailureInfo.systemUnavail;
            return this.f1646e.j(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
    static final class c extends k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i<T> f1649f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<p012a2.b, r1<T>, tq.e<? super i0>, Object> f1650g;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "La2/r1;", "latestAnchors", "Loq/i0;", "<anonymous>", "(La2/r1;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends k implements p<r1<T>, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f1651e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f1652f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ q<p012a2.b, r1<T>, tq.e<? super i0>, Object> f1653g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ i<T> f1654h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(q<? super p012a2.b, ? super r1<T>, ? super tq.e<? super i0>, ? extends Object> qVar, i<T> iVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f1653g = qVar;
                this.f1654h = iVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f1651e;
                if (i15 == 0) {
                    u.b(obj);
                    r1<T> r1Var = (r1) this.f1652f;
                    q<p012a2.b, r1<T>, tq.e<? super i0>, Object> qVar = this.f1653g;
                    p012a2.b bVar = ((i) this.f1654h).anchoredDragScope;
                    this.f1651e = 1;
                    if (qVar.w(bVar, r1Var, this) == objE) {
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
            public final Object B(r1<T> r1Var, tq.e<? super i0> eVar) {
                return ((a) v(r1Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f1653g, this.f1654h, eVar);
                aVar.f1652f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(i<T> iVar, q<? super p012a2.b, ? super r1<T>, ? super tq.e<? super i0>, ? extends Object> qVar, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f1649f = iVar;
            this.f1650g = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r1 V(i iVar) {
            return iVar.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f1648e;
            if (i15 == 0) {
                u.b(obj);
                final i<T> iVar = this.f1649f;
                er.a aVar = new er.a() { // from class: a2.j
                    @Override // er.a
                    public final Object a() {
                        return i.c.V(iVar);
                    }
                };
                a aVar2 = new a(this.f1650g, this.f1649f, null);
                this.f1648e = 1;
                if (p012a2.c.j(aVar, aVar2, this) == objE) {
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

        public final tq.e<i0> N(tq.e<?> eVar) {
            return new c(this.f1649f, this.f1650g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((c) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f1655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i<T> f1656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1657f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i<T> iVar, tq.e<? super d> eVar) {
            super(eVar);
            this.f1656e = iVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f1655d = obj;
            this.f1657f |= PKIFailureInfo.systemUnavail;
            return this.f1656e.i(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
    static final class e extends k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i<T> f1659f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ T f1660g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ r<p012a2.b, r1<T>, T, tq.e<? super i0>, Object> f1661h;

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Loq/r;", "La2/r1;", "<destruct>", "Loq/i0;", "<anonymous>", "(Loq/r;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends k implements p<oq.r<? extends r1<T>, ? extends T>, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f1662e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f1663f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ r<p012a2.b, r1<T>, T, tq.e<? super i0>, Object> f1664g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ i<T> f1665h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(r<? super p012a2.b, ? super r1<T>, ? super T, ? super tq.e<? super i0>, ? extends Object> rVar, i<T> iVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f1664g = rVar;
                this.f1665h = iVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to a2.i$e$a for r5v1 'this'  java.lang.Object
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
                    int r1 = r5.f1662e
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
                    java.lang.Object r6 = r5.f1663f
                    oq.r r6 = (oq.r) r6
                    java.lang.Object r1 = r6.a()
                    a2.r1 r1 = (p012a2.r1) r1
                    java.lang.Object r6 = r6.b()
                    er.r<a2.b, a2.r1<T>, T, tq.e<? super oq.i0>, java.lang.Object> r3 = r5.f1664g
                    a2.i<T> r4 = r5.f1665h
                    a2.b r4 = p012a2.i.e(r4)
                    r5.f1662e = r2
                    java.lang.Object r6 = r3.g(r4, r1, r6, r5)
                    if (r6 != r0) goto L39
                    return r0
                L39:
                    oq.i0 r6 = oq.i0.f148189a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: a2.i.e.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(oq.r<? extends r1<T>, ? extends T> rVar, tq.e<? super i0> eVar) {
                return ((a) v(rVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f1664g, this.f1665h, eVar);
                aVar.f1663f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(i<T> iVar, T t15, r<? super p012a2.b, ? super r1<T>, ? super T, ? super tq.e<? super i0>, ? extends Object> rVar, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f1659f = iVar;
            this.f1660g = t15;
            this.f1661h = rVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.r V(i iVar) {
            return y.a(iVar.p(), iVar.y());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f1658e;
            if (i15 == 0) {
                u.b(obj);
                this.f1659f.F(this.f1660g);
                final i<T> iVar = this.f1659f;
                er.a aVar = new er.a() { // from class: a2.k
                    @Override // er.a
                    public final Object a() {
                        return i.e.V(iVar);
                    }
                };
                a aVar2 = new a(this.f1661h, this.f1659f, null);
                this.f1658e = 1;
                if (p012a2.c.j(aVar, aVar2, this) == objE) {
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

        public final tq.e<i0> N(tq.e<?> eVar) {
            return new e(this.f1659f, this.f1660g, this.f1661h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((e) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"a2/i$f", "La2/b;", "", "newOffset", "lastKnownVelocity", "Loq/i0;", "a", "(FF)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements p012a2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i<T> f1666a;

        f(i<T> iVar) {
            this.f1666a = iVar;
        }

        @Override // p012a2.b
        public void a(float newOffset, float lastKnownVelocity) {
            this.f1666a.H(newOffset);
            this.f1666a.G(lastKnownVelocity);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0004*\u0002\u0000\f\b\n\u0018\u00002\u00020\u0001J<\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"a2/i$g", "Lz0/d1;", "Lw0/z1;", "dragPriority", "Lkotlin/Function2;", "Lz0/u0;", "Ltq/e;", "Loq/i0;", "", "block", "a", "(Lw0/z1;Ler/p;Ltq/e;)Ljava/lang/Object;", "a2/i$g$b", "La2/i$g$b;", "dragScope", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g implements d1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b dragScope;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i<T> f1668b;

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "La2/b;", "La2/r1;", "it", "Loq/i0;", "<anonymous>", "(La2/b;La2/r1;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends k implements q<p012a2.b, r1<T>, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f1669e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p<u0, tq.e<? super i0>, Object> f1671g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super u0, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super a> eVar) {
                super(3, eVar);
                this.f1671g = pVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f1669e;
                if (i15 == 0) {
                    u.b(obj);
                    b bVar = g.this.dragScope;
                    p<u0, tq.e<? super i0>, Object> pVar = this.f1671g;
                    this.f1669e = 1;
                    if (pVar.B(bVar, this) == objE) {
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

            @Override // er.q
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object w(p012a2.b bVar, r1<T> r1Var, tq.e<? super i0> eVar) {
                return g.this.new a(this.f1671g, eVar).J(i0.f148189a);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"a2/i$g$b", "Lz0/u0;", "", "pixels", "Loq/i0;", "a", "(F)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b implements u0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i<T> f1672a;

            b(i<T> iVar) {
                this.f1672a = iVar;
            }

            @Override // p143z0.u0
            public void a(float pixels) {
                p012a2.b.b(((i) this.f1672a).anchoredDragScope, this.f1672a.A(pixels), 0.0f, 2, null);
            }
        }

        g(i<T> iVar) {
            this.f1668b = iVar;
            this.dragScope = new b(iVar);
        }

        @Override // p143z0.d1
        public Object a(z1 z1Var, p<? super u0, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super i0> eVar) throws Throwable {
            Object objJ = this.f1668b.j(z1Var, new a(pVar, null), eVar);
            return objJ == uq.b.e() ? objJ : i0.f148189a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(T t15, l<? super Float, Float> lVar, er.a<Float> aVar, u0.l<Float> lVar2, l<? super T, Boolean> lVar3) {
        this.positionalThreshold = lVar;
        this.velocityThreshold = aVar;
        this.animationSpec = lVar2;
        this.confirmValueChange = lVar3;
        this.currentValue = c6.e(t15, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float B(i iVar) {
        float fC = iVar.p().c(iVar.t());
        float fC2 = iVar.p().c(iVar.r()) - fC;
        float fAbs = Math.abs(fC2);
        if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
            return 1.0f;
        }
        float fC3 = (iVar.C() - fC) / fC2;
        if (fC3 < 1.0E-6f) {
            return 0.0f;
        }
        if (fC3 > 0.999999f) {
            return 1.0f;
        }
        return fC3;
    }

    private final void D(r1<T> r1Var) {
        this.anchors.setValue(r1Var);
    }

    private final void E(T t15) {
        this.currentValue.setValue(t15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(T t15) {
        this.dragTarget.setValue(t15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(float f15) {
        this.lastVelocity.p(f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(float f15) {
        this.offset.p(f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object J(i iVar) {
        Object objU = iVar.u();
        if (objU != null) {
            return objU;
        }
        float fX = iVar.x();
        return !Float.isNaN(fX) ? iVar.m(fX, iVar.t(), 0.0f) : iVar.t();
    }

    private final boolean K(final T targetValue) {
        return this.dragMutex.e(new er.a() { // from class: a2.h
            @Override // er.a
            public final Object a() {
                return i.L(this.f1590a, targetValue);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 L(i iVar, Object obj) {
        p012a2.b bVar = iVar.anchoredDragScope;
        float fC = iVar.p().c(obj);
        if (!Float.isNaN(fC)) {
            p012a2.b.b(bVar, fC, 0.0f, 2, null);
            iVar.F(null);
        }
        iVar.E(obj);
        return i0.f148189a;
    }

    public static /* synthetic */ Object k(i iVar, Object obj, z1 z1Var, r rVar, tq.e eVar, int i15, Object obj2) {
        if ((i15 & 2) != 0) {
            z1Var = z1.Default;
        }
        return iVar.i(obj, z1Var, rVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object l(i iVar) {
        Object objU = iVar.u();
        if (objU != null) {
            return objU;
        }
        float fX = iVar.x();
        return !Float.isNaN(fX) ? iVar.n(fX, iVar.t()) : iVar.t();
    }

    private final T m(float offset, T currentValue, float velocity) {
        r1<T> r1VarP = p();
        float fC = r1VarP.c(currentValue);
        float fFloatValue = this.velocityThreshold.a().floatValue();
        if (fC != offset && !Float.isNaN(fC)) {
            if (fC < offset) {
                if (velocity >= fFloatValue) {
                    return r1VarP.a(offset, true);
                }
                T tA = r1VarP.a(offset, true);
                if (offset >= Math.abs(fC + Math.abs(this.positionalThreshold.b(Float.valueOf(Math.abs(r1VarP.c(tA) - fC))).floatValue()))) {
                    return tA;
                }
            } else {
                if (velocity <= (-fFloatValue)) {
                    return r1VarP.a(offset, false);
                }
                T tA2 = r1VarP.a(offset, false);
                float fAbs = Math.abs(fC - Math.abs(this.positionalThreshold.b(Float.valueOf(Math.abs(fC - r1VarP.c(tA2)))).floatValue()));
                if (offset >= 0.0f ? offset <= fAbs : Math.abs(offset) >= fAbs) {
                    return tA2;
                }
            }
        }
        return currentValue;
    }

    private final T n(float offset, T currentValue) {
        r1<T> r1VarP = p();
        float fC = r1VarP.c(currentValue);
        if (fC != offset && !Float.isNaN(fC)) {
            if (fC < offset) {
                T tA = r1VarP.a(offset, true);
                if (tA != null) {
                    return tA;
                }
            } else {
                T tA2 = r1VarP.a(offset, false);
                if (tA2 != null) {
                    return tA2;
                }
            }
        }
        return currentValue;
    }

    private final T u() {
        return this.dragTarget.getValue();
    }

    public final float A(float delta) {
        return m.m((Float.isNaN(x()) ? 0.0f : x()) + delta, p().e(), p().f());
    }

    public final float C() {
        if (Float.isNaN(x())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return x();
    }

    public final Object I(float f15, tq.e<? super i0> eVar) {
        T t15 = t();
        T tM = m(C(), t15, f15);
        if (this.confirmValueChange.b(tM).booleanValue()) {
            Object objF = p012a2.c.f(this, tM, f15, eVar);
            return objF == uq.b.e() ? objF : i0.f148189a;
        }
        Object objF2 = p012a2.c.f(this, t15, f15, eVar);
        return objF2 == uq.b.e() ? objF2 : i0.f148189a;
    }

    public final void M(r1<T> newAnchors, T newTarget) {
        if (t.c(p(), newAnchors)) {
            return;
        }
        D(newAnchors);
        if (K(newTarget)) {
            return;
        }
        F(newTarget);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(T t15, z1 z1Var, r<? super p012a2.b, ? super r1<T>, ? super T, ? super tq.e<? super i0>, ? extends Object> rVar, tq.e<? super i0> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f1657f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f1657f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(this, eVar);
            }
        } else {
            dVar = new d(this, eVar);
        }
        Object obj = dVar.f1655d;
        Object objE = uq.b.e();
        int i16 = dVar.f1657f;
        try {
            if (i16 == 0) {
                u.b(obj);
                if (p().d(t15)) {
                    k2 k2Var = this.dragMutex;
                    e eVar2 = new e(this, t15, rVar, null);
                    dVar.f1657f = 1;
                    if (k2Var.d(z1Var, eVar2, dVar) == objE) {
                        return objE;
                    }
                } else {
                    E(t15);
                }
                return i0.f148189a;
            }
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            F(null);
            T tB = p().b(x());
            if (tB != null && Math.abs(x() - p().c(tB)) <= 0.5f && this.confirmValueChange.b(tB).booleanValue()) {
                E(tB);
            }
            return i0.f148189a;
        } catch (Throwable th4) {
            F(null);
            T tB2 = p().b(x());
            if (tB2 != null && Math.abs(x() - p().c(tB2)) <= 0.5f && this.confirmValueChange.b(tB2).booleanValue()) {
                E(tB2);
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(z1 z1Var, q<? super p012a2.b, ? super r1<T>, ? super tq.e<? super i0>, ? extends Object> qVar, tq.e<? super i0> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f1647f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f1647f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(this, eVar);
            }
        } else {
            bVar = new b(this, eVar);
        }
        Object obj = bVar.f1645d;
        Object objE = uq.b.e();
        int i16 = bVar.f1647f;
        try {
            if (i16 == 0) {
                u.b(obj);
                k2 k2Var = this.dragMutex;
                c cVar = new c(this, qVar, null);
                bVar.f1647f = 1;
                if (k2Var.d(z1Var, cVar, bVar) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            T tB = p().b(x());
            if (tB != null && Math.abs(x() - p().c(tB)) <= 0.5f && this.confirmValueChange.b(tB).booleanValue()) {
                E(tB);
            }
            return i0.f148189a;
        } catch (Throwable th4) {
            T tB2 = p().b(x());
            if (tB2 != null && Math.abs(x() - p().c(tB2)) <= 0.5f && this.confirmValueChange.b(tB2).booleanValue()) {
                E(tB2);
            }
            throw th4;
        }
    }

    public final float o(float delta) {
        float fA = A(delta);
        float fX = Float.isNaN(x()) ? 0.0f : x();
        H(fA);
        return fA - fX;
    }

    public final r1<T> p() {
        return (r1) this.anchors.getValue();
    }

    public final u0.l<Float> q() {
        return this.animationSpec;
    }

    public final T r() {
        return (T) this.closestValue.getValue();
    }

    public final l<T, Boolean> s() {
        return this.confirmValueChange;
    }

    public final T t() {
        return this.currentValue.getValue();
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final d1 getDraggableState() {
        return this.draggableState;
    }

    public final float w() {
        return this.lastVelocity.a();
    }

    public final float x() {
        return this.offset.a();
    }

    public final T y() {
        return (T) this.targetValue.getValue();
    }

    public final boolean z() {
        return u() != null;
    }
}
