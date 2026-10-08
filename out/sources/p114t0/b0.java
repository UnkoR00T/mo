package p114t0;

import c5.n;
import c5.r;
import er.l;
import fr.t;
import fr.w;
import oq.i0;
import oq.p;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.f6;
import u0.j0;
import u0.k2;
import u0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001aJ#\u0010%\u001a\u00020$*\u00020\u001f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b'\u0010\u001aR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R:\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R:\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\b\u0012\u0010H\"\u0004\bI\u0010JR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010V\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR$\u0010[\u001a\u00020\"2\u0006\u0010W\u001a\u00020\"8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bX\u0010U\"\u0004\bY\u0010ZR$\u0010c\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR/\u0010k\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060f0d8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR/\u0010n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0f0d8\u0006¢\u0006\f\n\u0004\bl\u0010h\u001a\u0004\bm\u0010jR\u0013\u0010p\u001a\u0004\u0018\u00010\\8F¢\u0006\u0006\u001a\u0004\bo\u0010`¨\u0006q"}, d2 = {"Lt0/b0;", "Lt0/l0;", "Lu0/k2;", "Lt0/x;", "transition", "Lu0/k2$a;", "Lc5/r;", "Lu0/q;", "sizeAnimation", "Lc5/n;", "offsetAnimation", "slideAnimation", "Lt0/c0;", "enter", "Lt0/e0;", "exit", "Lkotlin/Function0;", "", "isEnabled", "Lt0/j0;", "graphicsLayerBlock", "<init>", "(Lu0/k2;Lu0/k2$a;Lu0/k2$a;Lu0/k2$a;Lt0/c0;Lt0/e0;Ler/a;Lt0/j0;)V", "targetState", "fullSize", "z3", "(Lt0/x;J)J", "Loq/i0;", "W2", "()V", "B3", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "A3", "s", "Lu0/k2;", "getTransition", "()Lu0/k2;", "y3", "(Lu0/k2;)V", "t", "Lu0/k2$a;", "getSizeAnimation", "()Lu0/k2$a;", "w3", "(Lu0/k2$a;)V", "v", "getOffsetAnimation", "v3", "w", "getSlideAnimation", "x3", "x", "Lt0/c0;", "o3", "()Lt0/c0;", "r3", "(Lt0/c0;)V", "y", "Lt0/e0;", "p3", "()Lt0/e0;", "s3", "(Lt0/e0;)V", "z", "Ler/a;", "()Ler/a;", "q3", "(Ler/a;)V", "A", "Lt0/j0;", "getGraphicsLayerBlock", "()Lt0/j0;", "t3", "(Lt0/j0;)V", "B", "Z", "lookaheadConstraintsAvailable", "C", "J", "lookaheadSize", "value", ip.a.f96138c, "u3", "(J)V", "lookaheadConstraints", "Lf3/c;", "E", "Lf3/c;", "getCurrentAlignment", "()Lf3/c;", "setCurrentAlignment", "(Lf3/c;)V", "currentAlignment", "Lkotlin/Function1;", "Lu0/k2$b;", "Lu0/j0;", "F", "Ler/l;", "getSizeTransitionSpec", "()Ler/l;", "sizeTransitionSpec", "G", "getSlideSpec", "slideSpec", "n3", "alignment", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b0 extends l0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private j0 graphicsLayerBlock;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean lookaheadConstraintsAvailable;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private f3.c currentAlignment;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private k2<x> transition;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private k2<x>.a<r, q> sizeAnimation;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private k2<x>.a<n, q> offsetAnimation;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private k2<x>.a<n, q> slideAnimation;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private c0 enter;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private e0 exit;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private er.a<Boolean> isEnabled;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private long lookaheadSize = n.c();

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private long lookaheadConstraints = c5.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final l<k2.b<x>, j0<r>> sizeTransitionSpec = new i();

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final l<k2.b<x>, j0<n>> slideSpec = new j();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186208a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f186208a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends w implements l<a2.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f186209b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a2 a2Var) {
            super(1);
            this.f186209b = a2Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(a2.a aVar) {
            a2.a.E(aVar, this.f186209b, 0, 0, 0.0f, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements l<a2.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f186210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f186211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f186212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<n3.a2, i0> f186213e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(a2 a2Var, long j15, long j16, l<? super n3.a2, i0> lVar) {
            super(1);
            this.f186210b = a2Var;
            this.f186211c = j15;
            this.f186212d = j16;
            this.f186213e = lVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(a2.a aVar) {
            aVar.Y(this.f186210b, n.i(this.f186212d) + n.i(this.f186211c), n.j(this.f186212d) + n.j(this.f186211c), 0.0f, this.f186213e);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends w implements l<a2.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f186214b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a2 a2Var) {
            super(1);
            this.f186214b = a2Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(a2.a aVar) {
            a2.a.E(aVar, this.f186214b, 0, 0, 0.0f, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt0/x;", "it", "Lc5/r;", "c", "(Lt0/x;)J"}, k = 3, mv = {2, 1, 0})
    static final class e extends w implements l<x, r> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f186216c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j15) {
            super(1);
            this.f186216c = j15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ r b(x xVar) {
            return r.b(c(xVar));
        }

        public final long c(x xVar) {
            return b0.this.z3(xVar, this.f186216c);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu0/k2$b;", "Lt0/x;", "Lu0/j0;", "Lc5/n;", "c", "(Lu0/k2$b;)Lu0/j0;"}, k = 3, mv = {2, 1, 0})
    static final class f extends w implements l<k2.b<x>, j0<n>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f186217b = new f();

        f() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j0<n> b(k2.b<x> bVar) {
            return a0.f186160d;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt0/x;", "it", "Lc5/n;", "c", "(Lt0/x;)J"}, k = 3, mv = {2, 1, 0})
    static final class g extends w implements l<x, n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f186219c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j15) {
            super(1);
            this.f186219c = j15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ n b(x xVar) {
            return n.c(c(xVar));
        }

        public final long c(x xVar) {
            return b0.this.B3(xVar, this.f186219c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt0/x;", "it", "Lc5/n;", "c", "(Lt0/x;)J"}, k = 3, mv = {2, 1, 0})
    static final class h extends w implements l<x, n> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f186221c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j15) {
            super(1);
            this.f186221c = j15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ n b(x xVar) {
            return n.c(c(xVar));
        }

        public final long c(x xVar) {
            return b0.this.A3(xVar, this.f186221c);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu0/k2$b;", "Lt0/x;", "Lu0/j0;", "Lc5/r;", "c", "(Lu0/k2$b;)Lu0/j0;"}, k = 3, mv = {2, 1, 0})
    static final class i extends w implements l<k2.b<x>, j0<r>> {
        i() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j0<r> b(k2.b<x> bVar) {
            x xVar = x.PreEnter;
            x xVar2 = x.Visible;
            j0<r> j0VarB = null;
            if (bVar.c(xVar, xVar2)) {
                ChangeSize changeSize = b0.this.getEnter().getData().getChangeSize();
                if (changeSize != null) {
                    j0VarB = changeSize.b();
                }
            } else if (bVar.c(xVar2, x.PostExit)) {
                ChangeSize changeSize2 = b0.this.getExit().getData().getChangeSize();
                if (changeSize2 != null) {
                    j0VarB = changeSize2.b();
                }
            } else {
                j0VarB = a0.f186161e;
            }
            return j0VarB == null ? a0.f186161e : j0VarB;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu0/k2$b;", "Lt0/x;", "Lu0/j0;", "Lc5/n;", "c", "(Lu0/k2$b;)Lu0/j0;"}, k = 3, mv = {2, 1, 0})
    static final class j extends w implements l<k2.b<x>, j0<n>> {
        j() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j0<n> b(k2.b<x> bVar) {
            j0<n> j0VarA;
            j0<n> j0VarA2;
            x xVar = x.PreEnter;
            x xVar2 = x.Visible;
            if (bVar.c(xVar, xVar2)) {
                Slide slide = b0.this.getEnter().getData().getSlide();
                return (slide == null || (j0VarA2 = slide.a()) == null) ? a0.f186160d : j0VarA2;
            }
            if (!bVar.c(xVar2, x.PostExit)) {
                return a0.f186160d;
            }
            Slide slide2 = b0.this.getExit().getData().getSlide();
            return (slide2 == null || (j0VarA = slide2.a()) == null) ? a0.f186160d : j0VarA;
        }
    }

    public b0(k2<x> k2Var, k2<x>.a<r, q> aVar, k2<x>.a<n, q> aVar2, k2<x>.a<n, q> aVar3, c0 c0Var, e0 e0Var, er.a<Boolean> aVar4, j0 j0Var) {
        this.transition = k2Var;
        this.sizeAnimation = aVar;
        this.offsetAnimation = aVar2;
        this.slideAnimation = aVar3;
        this.enter = c0Var;
        this.exit = e0Var;
        this.isEnabled = aVar4;
        this.graphicsLayerBlock = j0Var;
    }

    private final void u3(long j15) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = j15;
    }

    public final long A3(x targetState, long fullSize) {
        l<r, n> lVarB;
        l<r, n> lVarB2;
        Slide slide = this.enter.getData().getSlide();
        long jB = (slide == null || (lVarB2 = slide.b()) == null) ? n.INSTANCE.b() : lVarB2.b(r.b(fullSize)).getPackedValue();
        Slide slide2 = this.exit.getData().getSlide();
        long jB2 = (slide2 == null || (lVarB = slide2.b()) == null) ? n.INSTANCE.b() : lVarB.b(r.b(fullSize)).getPackedValue();
        int i15 = a.f186208a[targetState.ordinal()];
        if (i15 == 1) {
            return n.INSTANCE.b();
        }
        if (i15 == 2) {
            return jB;
        }
        if (i15 == 3) {
            return jB2;
        }
        throw new p();
    }

    public final long B3(x targetState, long fullSize) {
        int i15;
        if (this.currentAlignment != null && n3() != null && !t.c(this.currentAlignment, n3()) && (i15 = a.f186208a[targetState.ordinal()]) != 1 && i15 != 2) {
            if (i15 != 3) {
                throw new p();
            }
            ChangeSize changeSize = this.exit.getData().getChangeSize();
            if (changeSize == null) {
                return n.INSTANCE.b();
            }
            long packedValue = changeSize.d().b(r.b(fullSize)).getPackedValue();
            f3.c cVarN3 = n3();
            c5.t tVar = c5.t.Ltr;
            return n.l(cVarN3.a(fullSize, packedValue, tVar), this.currentAlignment.a(fullSize, packedValue, tVar));
        }
        return n.INSTANCE.b();
    }

    @Override // f3.m.c
    public void W2() {
        super.W2();
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = n.c();
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        f6<n> f6VarA;
        f6<n> f6VarA2;
        if (this.transition.p() == this.transition.w()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            f3.c cVarN3 = n3();
            if (cVarN3 == null) {
                cVarN3 = f3.c.INSTANCE.o();
            }
            this.currentAlignment = cVarN3;
        }
        if (y0Var.J0()) {
            a2 a2VarO0 = v0Var.o0(j15);
            long jC = r.c((((long) a2VarO0.getWidth()) << 32) | (((long) a2VarO0.getHeight()) & BodyPartID.bodyIdMax));
            this.lookaheadSize = jC;
            u3(j15);
            return y0.j2(y0Var, (int) (jC >> 32), (int) (jC & BodyPartID.bodyIdMax), null, new b(a2VarO0), 4, null);
        }
        if (!this.isEnabled.a().booleanValue()) {
            a2 a2VarO1 = v0Var.o0(j15);
            return y0.j2(y0Var, a2VarO1.getWidth(), a2VarO1.getHeight(), null, new d(a2VarO1), 4, null);
        }
        l<n3.a2, i0> lVarInit = this.graphicsLayerBlock.init();
        a2 a2VarO2 = v0Var.o0(j15);
        long jC2 = r.c((((long) a2VarO2.getWidth()) << 32) | (((long) a2VarO2.getHeight()) & BodyPartID.bodyIdMax));
        long j16 = n.d(this.lookaheadSize) ? this.lookaheadSize : jC2;
        k2<x>.a<r, q> aVar = this.sizeAnimation;
        f6<r> f6VarA3 = aVar != null ? aVar.a(this.sizeTransitionSpec, new e(j16)) : null;
        if (f6VarA3 != null) {
            jC2 = f6VarA3.getValue().getPackedValue();
        }
        long jD = c5.c.d(j15, jC2);
        k2<x>.a<n, q> aVar2 = this.offsetAnimation;
        long jB = (aVar2 == null || (f6VarA2 = aVar2.a(f.f186217b, new g(j16))) == null) ? n.INSTANCE.b() : f6VarA2.getValue().getPackedValue();
        k2<x>.a<n, q> aVar3 = this.slideAnimation;
        long jB2 = (aVar3 == null || (f6VarA = aVar3.a(this.slideSpec, new h(j16))) == null) ? n.INSTANCE.b() : f6VarA.getValue().getPackedValue();
        f3.c cVar = this.currentAlignment;
        return y0.j2(y0Var, (int) (jD >> 32), (int) (jD & BodyPartID.bodyIdMax), null, new c(a2VarO2, n.m(cVar != null ? cVar.a(j16, jD, c5.t.Ltr) : n.INSTANCE.b(), jB2), jB, lVarInit), 4, null);
    }

    public final f3.c n3() {
        f3.c alignment;
        f3.c alignment2;
        if (this.transition.u().c(x.PreEnter, x.Visible)) {
            ChangeSize changeSize = this.enter.getData().getChangeSize();
            if (changeSize != null && (alignment2 = changeSize.getAlignment()) != null) {
                return alignment2;
            }
            ChangeSize changeSize2 = this.exit.getData().getChangeSize();
            if (changeSize2 != null) {
                return changeSize2.getAlignment();
            }
            return null;
        }
        ChangeSize changeSize3 = this.exit.getData().getChangeSize();
        if (changeSize3 != null && (alignment = changeSize3.getAlignment()) != null) {
            return alignment;
        }
        ChangeSize changeSize4 = this.enter.getData().getChangeSize();
        if (changeSize4 != null) {
            return changeSize4.getAlignment();
        }
        return null;
    }

    /* JADX INFO: renamed from: o3, reason: from getter */
    public final c0 getEnter() {
        return this.enter;
    }

    /* JADX INFO: renamed from: p3, reason: from getter */
    public final e0 getExit() {
        return this.exit;
    }

    public final void q3(er.a<Boolean> aVar) {
        this.isEnabled = aVar;
    }

    public final void r3(c0 c0Var) {
        this.enter = c0Var;
    }

    public final void s3(e0 e0Var) {
        this.exit = e0Var;
    }

    public final void t3(j0 j0Var) {
        this.graphicsLayerBlock = j0Var;
    }

    public final void v3(k2<x>.a<n, q> aVar) {
        this.offsetAnimation = aVar;
    }

    public final void w3(k2<x>.a<r, q> aVar) {
        this.sizeAnimation = aVar;
    }

    public final void x3(k2<x>.a<n, q> aVar) {
        this.slideAnimation = aVar;
    }

    public final void y3(k2<x> k2Var) {
        this.transition = k2Var;
    }

    public final long z3(x targetState, long fullSize) {
        l<r, r> lVarD;
        l<r, r> lVarD2;
        int i15 = a.f186208a[targetState.ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                ChangeSize changeSize = this.enter.getData().getChangeSize();
                if (changeSize != null && (lVarD = changeSize.d()) != null) {
                    return lVarD.b(r.b(fullSize)).getPackedValue();
                }
            } else {
                if (i15 != 3) {
                    throw new p();
                }
                ChangeSize changeSize2 = this.exit.getData().getChangeSize();
                if (changeSize2 != null && (lVarD2 = changeSize2.d()) != null) {
                    return lVarD2.b(r.b(fullSize)).getPackedValue();
                }
            }
        }
        return fullSize;
    }
}
