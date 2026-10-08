package p143z0;

import c5.y;
import c5.z;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import er.p;
import er.q;
import fr.m0;
import fr.t;
import g4.h;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.k;
import w0.g2;
import z3.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\u00020 *\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\u001fJ\u0013\u0010\"\u001a\u00020\u0019*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\u0019*\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010#J\u0013\u0010%\u001a\u00020 *\u00020 H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\u001d*\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010\u0015J\u000f\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010\u0015J@\u00100\u001a\u00020\u00132.\u0010/\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00130+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130-\u0012\u0006\u0012\u0004\u0018\u00010.0*H\u0096@¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u001dH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00132\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b9\u0010:J]\u0010;\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b;\u0010\u0012R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010AR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\"\u0010K\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010F\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010\u0018R\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010:¨\u0006R"}, d2 = {"Lz0/n;", "T", "Lz0/t0;", "Lz0/r;", "state", "Lz0/a2;", "orientation", "", "enabled", "reverseDirection", "Lb1/l;", "interactionSource", "Lw0/g2;", "overscrollEffect", "startDragImmediately", "Lz0/e1;", "flingBehavior", "<init>", "(Lz0/r;Lz0/a2;ZLjava/lang/Boolean;Lb1/l;Lw0/g2;Ljava/lang/Boolean;Lz0/e1;)V", "Loq/i0;", "G4", "()V", "newFlingBehavior", i.f37091r, "(Lz0/e1;)V", "", "velocity", "v4", "(FLtq/e;)Ljava/lang/Object;", "Lm3/e;", "D4", "(F)J", "Lc5/y;", "E4", "B4", "(J)F", "C4", "y4", "(J)J", "z4", "W2", "I", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lz0/m0$b;", "Ltq/e;", "", "forEachDelta", "A3", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "startedPosition", "Q3", "(J)V", "Lz0/m0$d;", "event", "R3", "(Lz0/m0$d;)V", "i4", "()Z", "F4", "X", "Lz0/r;", "Y", "Lz0/a2;", "Z", "Ljava/lang/Boolean;", "h0", "Lw0/g2;", "q0", "r0", "Lz0/e1;", "s0", "w4", "()Lz0/e1;", "A4", "resolvedFlingBehavior", "Lc5/d;", "t0", "Lc5/d;", "density", "x4", "isReverseDirection", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n<T> extends t0 {

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private r<T> state;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private a2 orientation;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private Boolean reverseDirection;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private g2 overscrollEffect;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private Boolean startDragImmediately;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private e1 flingBehavior;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public e1 resolvedFlingBehavior;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private c5.d density;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lz0/b;", "Lz0/v0;", "it", "Loq/i0;", "<anonymous>", "(Lz0/b;Lz0/v0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements q<p143z0.b, v0<T>, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231465f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<l<? super m0.b, i0>, e<? super i0>, Object> f231466g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ n<T> f231467h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super l<? super m0.b, i0>, ? super e<? super i0>, ? extends Object> pVar, n<T> nVar, e<? super a> eVar) {
            super(3, eVar);
            this.f231466g = pVar;
            this.f231467h = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(final n nVar, final p143z0.b bVar, m0.b bVar2) {
            float fC4 = nVar.C4(nVar.z4(bVar2.getDelta()));
            if (nVar.overscrollEffect == null) {
                p143z0.b.b(bVar, nVar.state.F(fC4), 0.0f, 2, null);
            } else {
                m3.e.d(nVar.overscrollEffect.c(nVar.D4(fC4), g.INSTANCE.b(), new l() { // from class: z0.m
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.a.X(nVar, bVar, (m3.e) obj);
                    }
                }));
            }
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m3.e X(n nVar, p143z0.b bVar, m3.e eVar) {
            float F = nVar.state.F(nVar.C4(eVar.getPackedValue()));
            long jD4 = nVar.D4(F - nVar.state.H());
            p143z0.b.b(bVar, F, 0.0f, 2, null);
            return m3.e.d(jD4);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231464e;
            if (i15 == 0) {
                u.b(obj);
                final p143z0.b bVar = (p143z0.b) this.f231465f;
                p<l<? super m0.b, i0>, e<? super i0>, Object> pVar = this.f231466g;
                final n<T> nVar = this.f231467h;
                l<? super m0.b, i0> lVar = new l() { // from class: z0.l
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.a.V(nVar, bVar, (m0.b) obj2);
                    }
                };
                this.f231464e = 1;
                if (pVar.B(lVar, this) == objE) {
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
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(p143z0.b bVar, v0<T> v0Var, e<? super i0> eVar) {
            a aVar = new a(this.f231466g, this.f231467h, eVar);
            aVar.f231465f = bVar;
            return aVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f231468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f231469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n<T> f231470f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231471g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n<T> nVar, e<? super b> eVar) {
            super(eVar);
            this.f231470f = nVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231469e = obj;
            this.f231471g |= PKIFailureInfo.systemUnavail;
            return this.f231470f.v4(0.0f, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lz0/b;", "Lz0/v0;", "it", "Loq/i0;", "<anonymous>", "(Lz0/b;Lz0/v0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends k implements q<p143z0.b, v0<T>, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231473f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ n<T> f231474g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ m0 f231475h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f231476j;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"z0/n$c$a", "Lz0/h2;", "", "pixels", "d", "(F)F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements h2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n<T> f231477a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p143z0.b f231478b;

            a(n<T> nVar, p143z0.b bVar) {
                this.f231477a = nVar;
                this.f231478b = bVar;
            }

            @Override // p143z0.h2
            public float d(float pixels) {
                float F = ((n) this.f231477a).state.F(pixels);
                float fX = F - ((n) this.f231477a).state.x();
                p143z0.b.b(this.f231478b, F, 0.0f, 2, null);
                return fX;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n<T> nVar, m0 m0Var, float f15, e<? super c> eVar) {
            super(3, eVar);
            this.f231474g = nVar;
            this.f231475h = m0Var;
            this.f231476j = f15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m0 m0Var;
            Object objE = uq.b.e();
            int i15 = this.f231472e;
            if (i15 == 0) {
                u.b(obj);
                a aVar = new a(this.f231474g, (p143z0.b) this.f231473f);
                e1 e1VarW4 = this.f231474g.w4();
                m0 m0Var2 = this.f231475h;
                float f15 = this.f231476j;
                this.f231473f = m0Var2;
                this.f231472e = 1;
                obj = e1VarW4.a(aVar, f15, this);
                if (obj == objE) {
                    return objE;
                }
                m0Var = m0Var2;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m0Var = (m0) this.f231473f;
                u.b(obj);
            }
            m0Var.f66406a = ((Number) obj).floatValue();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p143z0.b bVar, v0<T> v0Var, e<? super i0> eVar) {
            c cVar = new c(this.f231474g, this.f231475h, this.f231476j, eVar);
            cVar.f231473f = bVar;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n<T> f231480f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ m0.d f231481g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc5/y;", "availableVelocity", "<anonymous>", "(Lc5/y;)Lc5/y;"}, k = 3, mv = {2, 1, 0})
        static final class a extends k implements p<y, e<? super y>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f231482e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ long f231483f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ n<T> f231484g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n<T> nVar, e<? super a> eVar) {
                super(2, eVar);
                this.f231484g = nVar;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Object B(y yVar, e<? super y> eVar) {
                return M(yVar.getPackedValue(), eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                long jE4;
                Object objE = uq.b.e();
                int i15 = this.f231482e;
                if (i15 == 0) {
                    u.b(obj);
                    long j15 = this.f231483f;
                    n<T> nVar = this.f231484g;
                    float fB4 = nVar.B4(j15);
                    this.f231483f = j15;
                    this.f231482e = 1;
                    obj = nVar.v4(fB4, this);
                    if (obj == objE) {
                        return objE;
                    }
                    jE4 = j15;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jE4 = this.f231483f;
                    u.b(obj);
                }
                float fFloatValue = ((Number) obj).floatValue();
                float fH = ((n) this.f231484g).state.H();
                float fE = ((n) this.f231484g).state.r().e();
                if (fH >= ((n) this.f231484g).state.r().g() || fH <= fE) {
                    jE4 = this.f231484g.E4(fFloatValue);
                }
                return y.b(jE4);
            }

            public final Object M(long j15, e<? super y> eVar) {
                return ((a) v(y.b(j15), eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                a aVar = new a(this.f231484g, eVar);
                aVar.f231483f = ((y) obj).getPackedValue();
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n<T> nVar, m0.d dVar, e<? super d> eVar) {
            super(2, eVar);
            this.f231480f = nVar;
            this.f231481g = dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r1.v4(r8, r7) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        
            if (r1.a(r3, r8, r7) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f231479e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r8)
                goto L61
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                oq.u.b(r8)
                goto L63
            L1e:
                oq.u.b(r8)
                z0.n<T> r8 = r7.f231480f
                z0.m0$d r1 = r7.f231481g
                long r4 = r1.getVelocity()
                long r4 = p143z0.n.p4(r8, r4)
                float r8 = p143z0.n.r4(r8, r4)
                z0.n<T> r1 = r7.f231480f
                w0.g2 r1 = p143z0.n.n4(r1)
                if (r1 != 0) goto L44
                z0.n<T> r1 = r7.f231480f
                r7.f231479e = r3
                java.lang.Object r8 = p143z0.n.m4(r1, r8, r7)
                if (r8 != r0) goto L63
                goto L60
            L44:
                z0.n<T> r1 = r7.f231480f
                w0.g2 r1 = p143z0.n.n4(r1)
                z0.n<T> r3 = r7.f231480f
                long r3 = p143z0.n.u4(r3, r8)
                z0.n$d$a r8 = new z0.n$d$a
                z0.n<T> r5 = r7.f231480f
                r6 = 0
                r8.<init>(r5, r6)
                r7.f231479e = r2
                java.lang.Object r8 = r1.a(r3, r8, r7)
                if (r8 != r0) goto L61
            L60:
                return r0
            L61:
                oq.i0 r8 = oq.i0.f148189a
            L63:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.n.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new d(this.f231480f, this.f231481g, eVar);
        }
    }

    public n(r<T> rVar, a2 a2Var, boolean z15, Boolean bool, b1.l lVar, g2 g2Var, Boolean bool2, e1 e1Var) {
        super(j.f231337a, z15, lVar, a2Var);
        this.state = rVar;
        this.orientation = a2Var;
        this.reverseDirection = bool;
        this.overscrollEffect = g2Var;
        this.startDragImmediately = bool2;
        this.flingBehavior = e1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float B4(long j15) {
        return this.orientation == a2.Vertical ? y.i(j15) : y.h(j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float C4(long j15) {
        return Float.intBitsToFloat((int) (this.orientation == a2.Vertical ? j15 & BodyPartID.bodyIdMax : j15 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long D4(float f15) {
        a2 a2Var = this.orientation;
        float f16 = a2Var == a2.Horizontal ? f15 : 0.0f;
        if (a2Var != a2.Vertical) {
            f15 = 0.0f;
        }
        return m3.e.e((((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f15)) & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long E4(float f15) {
        a2 a2Var = this.orientation;
        float f16 = a2Var == a2.Horizontal ? f15 : 0.0f;
        if (a2Var != a2.Vertical) {
            f15 = 0.0f;
        }
        return z.a(f16, f15);
    }

    private final void G4() {
        c5.d dVarO = h.o(this);
        c5.d dVar = this.density;
        if (dVar == null || !t.c(dVar, dVarO)) {
            this.density = dVarO;
            H4(this.flingBehavior);
        }
    }

    private final void H4(e1 newFlingBehavior) {
        if (newFlingBehavior == null) {
            p143z0.d dVar = p143z0.d.f231212a;
            u0.l<Float> lVarF = dVar.f();
            l<Float, Float> lVarE = dVar.e();
            c5.d dVarO = h.o(this);
            this.density = dVarO;
            newFlingBehavior = j.s(this.state, dVarO, lVarE, lVarF);
        }
        A4(newFlingBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object v4(float f15, e<? super Float> eVar) throws Throwable {
        b bVar;
        m0 m0Var;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f231471g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f231471g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(this, eVar);
            }
        } else {
            bVar = new b(this, eVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f231469e;
        Object objE = uq.b.e();
        int i16 = bVar2.f231471g;
        if (i16 == 0) {
            u.b(obj);
            if (this.state.C()) {
                r<T> rVar = this.state;
                bVar2.f231471g = 1;
                Object objS = rVar.S(f15, bVar2);
                if (objS != objE) {
                    return objS;
                }
            } else {
                m0 m0Var2 = new m0();
                m0Var2.f66406a = f15;
                r<T> rVar2 = this.state;
                c cVar = new c(this, m0Var2, f15, null);
                bVar2.f231468d = m0Var2;
                bVar2.f231471g = 2;
                if (r.m(rVar2, null, cVar, bVar2, 1, null) != objE) {
                    m0Var = m0Var2;
                }
            }
            return objE;
        }
        if (i16 == 1) {
            u.b(obj);
            return obj;
        }
        if (i16 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m0Var = (m0) bVar2.f231468d;
        u.b(obj);
        return vq.b.d(m0Var.f66406a);
    }

    private final boolean x4() {
        Boolean bool = this.reverseDirection;
        if (bool == null) {
            return h.r(this) == c5.t.Rtl && this.orientation == a2.Horizontal;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y4(long j15) {
        return y.m(j15, x4() ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long z4(long j15) {
        return m3.e.r(j15, x4() ? -1.0f : 1.0f);
    }

    @Override // p143z0.t0
    public Object A3(p<? super l<? super m0.b, i0>, ? super e<? super i0>, ? extends Object> pVar, e<? super i0> eVar) {
        Object objM = r.m(this.state, null, new a(pVar, this, null), eVar, 1, null);
        return objM == uq.b.e() ? objM : i0.f148189a;
    }

    public final void A4(e1 e1Var) {
        this.resolvedFlingBehavior = e1Var;
    }

    public final void F4(r<T> state, a2 orientation, boolean enabled, Boolean reverseDirection, b1.l interactionSource, g2 overscrollEffect, Boolean startDragImmediately, e1 flingBehavior) {
        boolean z15;
        boolean z16;
        this.flingBehavior = flingBehavior;
        if (t.c(this.state, state)) {
            z15 = false;
        } else {
            this.state = state;
            H4(flingBehavior);
            z15 = true;
        }
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z15 = true;
        }
        if (t.c(this.reverseDirection, reverseDirection)) {
            z16 = z15;
        } else {
            this.reverseDirection = reverseDirection;
            z16 = true;
        }
        this.startDragImmediately = startDragImmediately;
        this.overscrollEffect = overscrollEffect;
        t0.l4(this, null, enabled, interactionSource, orientation, z16, 1, null);
    }

    @Override // g4.g, g4.f1
    public void I() {
        Z1();
        if (getIsAttached()) {
            G4();
        }
    }

    @Override // p143z0.t0
    public void Q3(long startedPosition) {
    }

    @Override // p143z0.t0
    public void R3(m0.d event) {
        if (getIsAttached()) {
            ju.k.d(M2(), null, null, new d(this, event, null), 3, null);
        }
    }

    @Override // f3.m.c
    public void W2() {
        H4(this.flingBehavior);
    }

    @Override // p143z0.t0
    /* JADX INFO: renamed from: i4 */
    public boolean getStartDragImmediately() {
        Boolean bool = this.startDragImmediately;
        return bool != null ? bool.booleanValue() : this.state.E();
    }

    public final e1 w4() {
        e1 e1Var = this.resolvedFlingBehavior;
        if (e1Var != null) {
            return e1Var;
        }
        return null;
    }
}
