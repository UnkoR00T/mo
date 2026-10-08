package p143z0;

import c5.r;
import c5.s;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import er.p;
import f3.m;
import g4.e;
import g4.f;
import g4.k0;
import java.util.concurrent.CancellationException;
import ju.CoroutineName;
import ju.d2;
import ju.g2;
import ju.h2;
import ju.n;
import ju.p0;
import ju.r0;
import m3.g;
import oq.i0;
import oq.t;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import vq.k;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001UB9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\t*\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010%J'\u0010(\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0014H\u0002¢\u0006\u0004\b(\u0010)J\u001c\u0010,\u001a\u00020+*\u00020!2\u0006\u0010*\u001a\u00020!H\u0082\u0002¢\u0006\u0004\b,\u0010-J\u001c\u0010/\u001a\u00020+*\u00020.2\u0006\u0010*\u001a\u00020.H\u0082\u0002¢\u0006\u0004\b/\u0010-J\u0017\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u0010 J \u00102\u001a\u00020\u00162\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0096@¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b4\u0010\u0018J'\u00105\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b5\u00106R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010D\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010<R$\u0010P\u001a\u00020!2\u0006\u0010K\u001a\u00020!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010<R\u0014\u0010T\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010O¨\u0006V"}, d2 = {"Lz0/b0;", "Lf3/m$c;", "Lj1/i;", "Lg4/e;", "Lg4/k0;", "Lz0/a2;", "orientation", "Lz0/a3;", "scrollingLogic", "", "reverseDirection", "Lz0/y;", "bringIntoViewSpec", "Lkotlin/Function0;", "Lm3/g;", "getFocusedRect", "<init>", "(Lz0/a2;Lz0/a3;ZLz0/y;Ler/a;)V", i.f37090q, "()Lz0/y;", "Lc5/n;", "viewportAdjustmentForReverseScroll", "Loq/i0;", "E3", "(J)V", "", "w3", "(Lz0/y;J)F", "A3", "()Lm3/g;", "childBounds", "z3", "(Lm3/g;)Lm3/g;", "Lc5/r;", "size", "containerOffset", "C3", "(Lm3/g;JJ)Z", "containerSize", "Lm3/e;", "G3", "(Lm3/g;JJ)J", "other", "", "x3", "(JJ)I", "Lm3/k;", "y3", "localRect", "G0", "N0", "(Ler/a;Ltq/e;)Ljava/lang/Object;", "e", "I3", "(Lz0/a2;ZLz0/y;)V", "r", "Lz0/a2;", "s", "Lz0/a3;", "t", "Z", "v", "Lz0/y;", "w", "Ler/a;", "x", "R2", "()Z", "shouldAutoInvalidate", "Lz0/x;", "y", "Lz0/x;", "bringIntoViewRequests", "z", "trackingFocusedChild", "value", "A", "J", "getViewportSize-YbymL2g$foundation", "()J", "viewportSize", "B", "isAnimationRunning", "B3", "viewportSizeOrZero", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 extends m.c implements j1.i, e, k0 {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean isAnimationRunning;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private a2 orientation;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final a3 scrollingLogic;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private y bringIntoViewSpec;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private er.a<g> getFocusedRect;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean trackingFocusedChild;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final x bringIntoViewRequests = new x();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private long viewportSize = e0.f231228a;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Lz0/b0$a;", "", "Lkotlin/Function0;", "Lm3/g;", "currentBounds", "Lju/n;", "Loq/i0;", "continuation", "<init>", "(Ler/a;Lju/n;)V", "", "toString", "()Ljava/lang/String;", "a", "Ler/a;", "b", "()Ler/a;", "Lju/n;", "()Lju/n;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final er.a<g> currentBounds;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final n<i0> continuation;

        /* JADX WARN: Multi-variable type inference failed */
        public a(er.a<g> aVar, n<? super i0> nVar) {
            this.currentBounds = aVar;
            this.continuation = nVar;
        }

        public final n<i0> a() {
            return this.continuation;
        }

        public final er.a<g> b() {
            return this.currentBounds;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004b  */
        public String toString() {
            String str;
            CoroutineName coroutineName = (CoroutineName) this.continuation.getContext().m(CoroutineName.INSTANCE);
            String name = coroutineName != null ? coroutineName.getName() : null;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Request@");
            sb5.append(Integer.toString(hashCode(), fu.a.a(16)));
            if (name != null) {
                str = '[' + name + "](";
                if (str == null) {
                    str = "(";
                }
            } else {
                str = "(";
            }
            sb5.append(str);
            sb5.append("currentBounds()=");
            sb5.append(this.currentBounds.a());
            sb5.append(", continuation=");
            sb5.append(this.continuation);
            sb5.append(')');
            return sb5.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f231064a;

        static {
            int[] iArr = new int[a2.values().length];
            try {
                iArr[a2.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a2.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f231064a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231065e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f231066f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ n3 f231068h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ y f231069j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f231070k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/s1;", "Loq/i0;", "<anonymous>", "(Lz0/s1;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends k implements p<s1, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f231071e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f231072f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ n3 f231073g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ b0 f231074h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ y f231075j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ long f231076k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ d2 f231077l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n3 n3Var, b0 b0Var, y yVar, long j15, d2 d2Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f231073g = n3Var;
                this.f231074h = b0Var;
                this.f231075j = yVar;
                this.f231076k = j15;
                this.f231077l = d2Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 V(b0 b0Var, n3 n3Var, d2 d2Var, s1 s1Var, float f15) {
                float f16 = b0Var.reverseDirection ? 1.0f : -1.0f;
                a3 a3Var = b0Var.scrollingLogic;
                float fG = f16 * a3Var.G(a3Var.A(s1Var.b(a3Var.A(a3Var.H(f16 * f15)), z3.g.INSTANCE.b())));
                if (Math.abs(fG) < Math.abs(f15)) {
                    h2.e(d2Var, "Scroll animation cancelled because scroll was not consumed (" + fG + " < " + f15 + ')', null, 2, null);
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 X(b0 b0Var, n3 n3Var, y yVar) {
                b0 b0Var2;
                boolean zD3;
                x xVar = b0Var.bringIntoViewRequests;
                while (true) {
                    if (xVar.requests.getSize() == 0) {
                        b0Var2 = b0Var;
                        break;
                    }
                    g gVarA = ((a) xVar.requests.q()).b().a();
                    if (gVarA == null) {
                        b0Var2 = b0Var;
                        zD3 = true;
                    } else {
                        b0Var2 = b0Var;
                        zD3 = b0.D3(b0Var2, gVarA, 0L, 0L, 3, null);
                    }
                    if (!zD3) {
                        break;
                    }
                    ((a) xVar.requests.v(xVar.requests.getSize() - 1)).a().i(t.b(i0.f148189a));
                    b0Var = b0Var2;
                }
                if (b0Var2.trackingFocusedChild) {
                    g gVar = (g) b0Var2.getFocusedRect.a();
                    if (gVar != null && b0.D3(b0Var2, gVar, 0L, 0L, 3, null)) {
                        b0Var2.trackingFocusedChild = false;
                    }
                }
                n3Var.f(b0Var2.w3(yVar, c5.n.INSTANCE.b()));
                return i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f231071e;
                if (i15 == 0) {
                    u.b(obj);
                    final s1 s1Var = (s1) this.f231072f;
                    this.f231073g.f(this.f231074h.w3(this.f231075j, this.f231076k));
                    final n3 n3Var = this.f231073g;
                    final b0 b0Var = this.f231074h;
                    final d2 d2Var = this.f231077l;
                    l<? super Float, i0> lVar = new l() { // from class: z0.c0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.c.a.V(b0Var, n3Var, d2Var, s1Var, ((Float) obj2).floatValue());
                        }
                    };
                    final b0 b0Var2 = this.f231074h;
                    final n3 n3Var2 = this.f231073g;
                    final y yVar = this.f231075j;
                    er.a<i0> aVar = new er.a() { // from class: z0.d0
                        @Override // er.a
                        public final Object a() {
                            return b0.c.a.X(b0Var2, n3Var2, yVar);
                        }
                    };
                    this.f231071e = 1;
                    if (n3Var.c(lVar, aVar, this) == objE) {
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
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object B(s1 s1Var, tq.e<? super i0> eVar) {
                return ((a) v(s1Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f231073g, this.f231074h, this.f231075j, this.f231076k, this.f231077l, eVar);
                aVar.f231072f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n3 n3Var, y yVar, long j15, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f231068h = n3Var;
            this.f231069j = yVar;
            this.f231070k = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f231065e;
            try {
                try {
                    if (i15 == 0) {
                        u.b(obj);
                        d2 d2VarK = g2.k(((p0) this.f231066f).getCoroutineContext());
                        b0.this.isAnimationRunning = true;
                        a3 a3Var = b0.this.scrollingLogic;
                        z1 z1Var = z1.Default;
                        a aVar = new a(this.f231068h, b0.this, this.f231069j, this.f231070k, d2VarK, null);
                        this.f231065e = 1;
                        if (a3Var.B(z1Var, aVar, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj);
                    }
                    b0.this.bringIntoViewRequests.f();
                    b0.this.isAnimationRunning = false;
                    b0.this.bringIntoViewRequests.c(null);
                    b0.this.trackingFocusedChild = false;
                    return i0.f148189a;
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (Throwable th4) {
                b0.this.isAnimationRunning = false;
                b0.this.bringIntoViewRequests.c(null);
                b0.this.trackingFocusedChild = false;
                throw th4;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = b0.this.new c(this.f231068h, this.f231069j, this.f231070k, eVar);
            cVar.f231066f = obj;
            return cVar;
        }
    }

    public b0(a2 a2Var, a3 a3Var, boolean z15, y yVar, er.a<g> aVar) {
        this.orientation = a2Var;
        this.scrollingLogic = a3Var;
        this.reverseDirection = z15;
        this.bringIntoViewSpec = yVar;
        this.getFocusedRect = aVar;
    }

    private final g A3() {
        n2.c cVar = this.bringIntoViewRequests.requests;
        int size = cVar.getSize() - 1;
        Object[] objArr = cVar.content;
        g gVar = null;
        if (size < objArr.length) {
            while (size >= 0) {
                g gVarA = ((a) objArr[size]).b().a();
                if (gVarA != null) {
                    if (y3(gVarA.l(), s.e(B3())) > 0) {
                        return gVar == null ? gVarA : gVar;
                    }
                    gVar = gVarA;
                }
                size--;
            }
        }
        return gVar;
    }

    private final boolean C3(g gVar, long j15, long j16) {
        long jG3 = G3(gVar, j15, j16);
        return Math.abs(Float.intBitsToFloat((int) (jG3 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jG3 & BodyPartID.bodyIdMax))) <= 0.5f;
    }

    static /* synthetic */ boolean D3(b0 b0Var, g gVar, long j15, long j16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j15 = b0Var.B3();
        }
        long j17 = j15;
        if ((i15 & 2) != 0) {
            j16 = c5.n.INSTANCE.b();
        }
        return b0Var.C3(gVar, j17, j16);
    }

    private final void E3(long viewportAdjustmentForReverseScroll) {
        y yVarH3 = H3();
        if (this.isAnimationRunning) {
            c1.e.c("launchAnimation called when previous animation was running");
        }
        ju.k.d(M2(), null, r0.UNDISPATCHED, new c(new n3(H3().b()), yVarH3, viewportAdjustmentForReverseScroll, null), 1, null);
    }

    static /* synthetic */ void F3(b0 b0Var, long j15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j15 = c5.n.INSTANCE.b();
        }
        b0Var.E3(j15);
    }

    private final long G3(g childBounds, long containerSize, long containerOffset) {
        long jE = s.e(containerSize);
        int i15 = b.f231064a[this.orientation.ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                throw new oq.p();
            }
            return m3.e.e((((long) Float.floatToRawIntBits(H3().a(childBounds.getLeft() - c5.n.i(containerOffset), childBounds.getRight() - childBounds.getLeft(), Float.intBitsToFloat((int) (jE >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax));
        }
        return m3.e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(H3().a(childBounds.getTop() - c5.n.j(containerOffset), childBounds.getBottom() - childBounds.getTop(), Float.intBitsToFloat((int) (jE & BodyPartID.bodyIdMax))))) & BodyPartID.bodyIdMax));
    }

    private final y H3() {
        y yVar = this.bringIntoViewSpec;
        return yVar == null ? (y) f.a(this, a0.c()) : yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float w3(y bringIntoViewSpec, long viewportAdjustmentForReverseScroll) {
        long j15 = this.viewportSize;
        g gVarA3 = A3();
        if (gVarA3 == null) {
            gVarA3 = this.trackingFocusedChild ? this.getFocusedRect.a() : null;
            if (gVarA3 == null) {
                return 0.0f;
            }
        }
        long jE = s.e(j15);
        int i15 = b.f231064a[this.orientation.ordinal()];
        if (i15 == 1) {
            return bringIntoViewSpec.a(gVarA3.getTop() - c5.n.j(viewportAdjustmentForReverseScroll), gVarA3.getBottom() - gVarA3.getTop(), Float.intBitsToFloat((int) (jE & BodyPartID.bodyIdMax)));
        }
        if (i15 == 2) {
            return bringIntoViewSpec.a(gVarA3.getLeft() - c5.n.i(viewportAdjustmentForReverseScroll), gVarA3.getRight() - gVarA3.getLeft(), Float.intBitsToFloat((int) (jE >> 32)));
        }
        throw new oq.p();
    }

    private final int x3(long j15, long j16) {
        int i15 = b.f231064a[this.orientation.ordinal()];
        if (i15 == 1) {
            return fr.t.d((int) (j15 & BodyPartID.bodyIdMax), (int) (j16 & BodyPartID.bodyIdMax));
        }
        if (i15 == 2) {
            return fr.t.d((int) (j15 >> 32), (int) (j16 >> 32));
        }
        throw new oq.p();
    }

    private final int y3(long j15, long j16) {
        int i15 = b.f231064a[this.orientation.ordinal()];
        if (i15 == 1) {
            return Float.compare(Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j16 & BodyPartID.bodyIdMax)));
        }
        if (i15 == 2) {
            return Float.compare(Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j16 >> 32)));
        }
        throw new oq.p();
    }

    private final g z3(g childBounds) {
        return childBounds.u(m3.e.e(G3(childBounds, B3(), c5.n.INSTANCE.b()) ^ (-9223372034707292160L)));
    }

    public final long B3() {
        long j15 = this.viewportSize;
        return r.e(j15, e0.f231228a) ? r.INSTANCE.a() : j15;
    }

    @Override // j1.i
    public g G0(g localRect) {
        if (r.e(this.viewportSize, e0.f231228a)) {
            c1.e.c("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return z3(localRect);
    }

    public final void I3(a2 orientation, boolean reverseDirection, y bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = reverseDirection;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    @Override // j1.i
    public Object N0(er.a<g> aVar, tq.e<? super i0> eVar) {
        g gVarA = aVar.a();
        if (gVarA != null && !D3(this, gVarA, 0L, 0L, 3, null)) {
            ju.p pVar = new ju.p(uq.b.c(eVar), 1);
            pVar.D();
            if (this.bringIntoViewRequests.d(new a(aVar, pVar)) && !this.isAnimationRunning) {
                F3(this, 0L, 1, null);
            }
            Object objX = pVar.x();
            if (objX == uq.b.e()) {
                vq.g.c(eVar);
            }
            return objX == uq.b.e() ? objX : i0.f148189a;
        }
        return i0.f148189a;
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // g4.k0
    public void e(long size) {
        long jB;
        long jB3 = B3();
        this.viewportSize = size;
        if (x3(size, jB3) < 0) {
            if (this.reverseDirection) {
                jB = c5.n.INSTANCE.b();
            } else if (this.orientation == a2.Vertical) {
                jB = c5.n.d((((long) 0) << 32) | (((long) (((int) (jB3 & BodyPartID.bodyIdMax)) - ((int) (size & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
            } else {
                jB = c5.n.d((((long) (((int) (jB3 >> 32)) - ((int) (size >> 32)))) << 32) | (((long) 0) & BodyPartID.bodyIdMax));
            }
            long j15 = jB;
            g gVarA = this.getFocusedRect.a();
            if (gVarA != null && !this.isAnimationRunning && !this.trackingFocusedChild && D3(this, gVarA, jB3, 0L, 2, null)) {
                if (D3(this, gVarA, 0L, j15, 1, null)) {
                    return;
                }
                this.trackingFocusedChild = true;
                E3(j15);
            }
        }
    }
}
