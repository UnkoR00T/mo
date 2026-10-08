package gz2;

import f00.j0;
import fr.q0;
import java.util.concurrent.CancellationException;
import jk0.ExternalQualifiedSignatureStartAuthenticationRequest;
import jk0.ExternalQualifiedSignatureStartResponse;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wy2.MidCardData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001PB[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010&\u001a\u00020%*\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010D\u001a\b\u0012\u0004\u0012\u00020?0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030E8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lgz2/x;", "Ll00/g;", "Lgz2/o;", "Lgz2/n;", "Lgz2/p;", "", "Lyy/a;", "stateMachineFactory", "Lvy2/a;", "documentStorageInteractor", "Lac4/a;", "callActionWithLoaderUseCase", "Lhz2/f;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lhz2/e;", "confirmMidErrorMapper", "Lhz2/h;", "exitDialogMapper", "Lkk0/f;", "startAuthenticationUC", "Liy/a;", "base64Coder", "Lgz2/a;", "setupContract", "<init>", "(Lyy/a;Lvy2/a;Lac4/a;Lhz2/f;Lhb4/d;Lhz2/e;Lhz2/h;Lkk0/f;Liy/a;Lgz2/a;)V", "state", "Lgz2/p$a;", "y9", "(Lgz2/o;)Lgz2/p$a;", "Ldx/b;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "Ljb4/b;", "w9", "(Ldx/b;Ler/a;Ler/a;)Ljb4/b;", "b", "Lvy2/a;", "c", "Lac4/a;", "d", "Lhz2/f;", "e", "Lhb4/d;", "f", "Lhz2/e;", "g", "Lhz2/h;", "h", "Lkk0/f;", "j", "Liy/a;", "k", "Lgz2/a;", "Lgz2/o$c;", "l", "Lgz2/o$c;", "initialState", "Lxw/b;", "Lgz2/n$f;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<o, n> implements p, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vy2.a documentStorageInteractor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hz2.f mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hz2.e confirmMidErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hz2.h exitDialogMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final kk0.f startAuthenticationUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final gz2.a setupContract;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final o.c initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<n.f> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<o, n> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<p.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lgz2/x$a;", "Lf00/j0;", "Lgz2/a;", "Lgz2/x;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<gz2.a, x> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<p.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f78631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f78632b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f78633a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f78634b;

            /* JADX INFO: renamed from: gz2.x$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1796a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f78635d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f78636e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f78637f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f78639h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f78640j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f78641k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f78642l;

                public C1796a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f78635d = obj;
                    this.f78636e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, x xVar) {
                this.f78633a = hVar;
                this.f78634b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1796a c1796a;
                if (eVar instanceof C1796a) {
                    c1796a = (C1796a) eVar;
                    int i15 = c1796a.f78636e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1796a.f78636e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1796a = new C1796a(eVar);
                    }
                } else {
                    c1796a = new C1796a(eVar);
                }
                Object obj2 = c1796a.f78635d;
                Object objE = uq.b.e();
                int i16 = c1796a.f78636e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f78633a;
                    p.a aVarY9 = this.f78634b.y9((o) obj);
                    c1796a.f78637f = vq.j.a(obj);
                    c1796a.f78639h = vq.j.a(c1796a);
                    c1796a.f78640j = vq.j.a(obj);
                    c1796a.f78641k = vq.j.a(hVar);
                    c1796a.f78642l = 0;
                    c1796a.f78636e = 1;
                    if (hVar.F(aVarY9, c1796a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, x xVar) {
            this.f78631a = gVar;
            this.f78632b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super p.a> hVar, tq.e eVar) {
            Object objA = this.f78631a.a(new a(hVar, this.f78632b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgz2/n$b;", "<unused var>", "Lgz2/o;", "Loq/i0;", "<anonymous>", "(Lgz2/n$b;Lgz2/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<n.b, o, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78643e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f78643e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<n.f> bVarY1 = x.this.Y1();
                n.f.a aVar = n.f.a.f78587a;
                this.f78643e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n.b bVar, o oVar, tq.e<? super oq.i0> eVar) {
            return x.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lgz2/o$c;", "state", "Lk10/l;", "Lgz2/o;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<o.c>, tq.e<? super k10.l<? extends o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78646f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lgz2/o;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends o>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f78648e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f78649f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f78650g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f78651h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f78652j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f78653k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f78654l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f78655m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f78656n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f78657p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f78658q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ x f78659r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ k10.c0<o.c> f78660s;

            /* JADX INFO: renamed from: gz2.x$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C1797a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f78661a;

                static {
                    int[] iArr = new int[i0.values().length];
                    try {
                        iArr[i0.QR_CODE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[i0.DEEPLINK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f78661a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, k10.c0<o.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f78659r = xVar;
                this.f78660s = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final o.Error X(x xVar, dx.b bVar, o.c cVar) {
                return new o.Error(xVar.errorVMSFactory.a(x.x9(xVar, bVar, xVar.b9(n.e.f78586a), null, 2, null)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final o.LoadMIdCardData Y(ExternalQualifiedSignatureStartResponse externalQualifiedSignatureStartResponse, o.c cVar) {
                return new o.LoadMIdCardData(new ConfirmMidSharedData(externalQualifiedSignatureStartResponse, null, null, null, null, 30, null));
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [dx.j, int, java.lang.Object] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
            	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
            	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
            	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
            	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i left;
                Object objB;
                jk0.p pVar;
                String strE;
                ex.b bVar;
                Object objE = uq.b.e();
                ?? r15 = this.f78658q;
                try {
                    try {
                        if (r15 == 0) {
                            oq.u.b(obj);
                            x xVar = this.f78659r;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            ex.a aVar = new ex.a();
                            String str = new String((byte[]) aVar.a(iy.a.f(xVar.base64Coder, ry.a.b(xVar.setupContract.n6().getToken()), null, 2, null)), fu.d.UTF_8);
                            kk0.f fVar = xVar.startAuthenticationUC;
                            i0 i0VarQ4 = xVar.setupContract.q4();
                            int[] iArr = C1797a.f78661a;
                            int i15 = iArr[i0VarQ4.ordinal()];
                            if (i15 == 1) {
                                pVar = jk0.p.QR_CODE;
                            } else {
                                if (i15 != 2) {
                                    throw new oq.p();
                                }
                                pVar = jk0.p.DEEPLINK;
                            }
                            int i16 = iArr[xVar.setupContract.q4().ordinal()];
                            if (i16 == 1) {
                                strE = iy.c0.e(xVar.setupContract.k5().getQrCode());
                            } else {
                                if (i16 != 2) {
                                    throw new oq.p();
                                }
                                strE = str;
                            }
                            kk0.f.Params params = new kk0.f.Params(new ExternalQualifiedSignatureStartAuthenticationRequest(pVar, strE));
                            this.f78653k = jVarA;
                            this.f78654l = vq.j.a(aVar);
                            this.f78655m = vq.j.a(aVar);
                            this.f78656n = vq.j.a(str);
                            this.f78657p = aVar;
                            this.f78648e = 0;
                            this.f78649f = 0;
                            this.f78650g = 0;
                            this.f78651h = 0;
                            this.f78652j = 0;
                            this.f78658q = 1;
                            obj = fVar.c(params, this);
                            if (obj == objE) {
                                return objE;
                            }
                            bVar = aVar;
                        } else {
                            if (r15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (ex.b) this.f78657p;
                            try {
                                oq.u.b(obj);
                            } catch (CancellationException e15) {
                                throw e15;
                            }
                        }
                        left = new dx.i.Right((ExternalQualifiedSignatureStartResponse) bVar.a((dx.i) obj));
                    } catch (Exception e16) {
                        px.f fVar2 = px.f.f163100a;
                        String message = e16.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e16, px.c.a(r15));
                        dx.i iVarA = r15.a(e16);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        left = new dx.i.Left(objB);
                    }
                } catch (ex.c e17) {
                    left = new dx.i.Left((dx.b) ex.d.a(e17));
                } catch (CancellationException e18) {
                    throw e18;
                }
                k10.c0<o.c> c0Var = this.f78660s;
                final x xVar2 = this.f78659r;
                if (left instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) left).b();
                    return c0Var.d(new er.l() { // from class: gz2.y
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return x.d.a.X(xVar2, bVar2, (o.c) obj2);
                        }
                    });
                }
                if (!(left instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final ExternalQualifiedSignatureStartResponse externalQualifiedSignatureStartResponse = (ExternalQualifiedSignatureStartResponse) ((dx.i.Right) left).b();
                return c0Var.d(new er.l() { // from class: gz2.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.d.a.Y(externalQualifiedSignatureStartResponse, (o.c) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f78659r, this.f78660s, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends o>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f78646f;
            Object objE = uq.b.e();
            int i15 = this.f78645e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = x.this.callActionWithLoaderUseCase;
            a aVar2 = new a(x.this, c0Var, null);
            this.f78646f = vq.j.a(c0Var);
            this.f78645e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<o.c> c0Var, tq.e<? super k10.l<? extends o>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = x.this.new d(eVar);
            dVar.f78646f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lgz2/o$e;", "state", "Lk10/l;", "Lgz2/o;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<o.LoadMIdCardData>, tq.e<? super k10.l<? extends o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78663f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lgz2/o;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends o>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f78665e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ x f78666f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<o.LoadMIdCardData> f78667g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, k10.c0<o.LoadMIdCardData> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f78666f = xVar;
                this.f78667g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final o.Error X(x xVar, dx.b bVar, o.LoadMIdCardData loadMIdCardData) {
                return new o.Error(xVar.errorVMSFactory.a(x.x9(xVar, bVar, xVar.b9(n.b.f78583a), null, 2, null)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final o.Initialized Y(MidCardData midCardData, o.LoadMIdCardData loadMIdCardData) {
                return new o.Initialized(ConfirmMidSharedData.b(loadMIdCardData.getConfirmMidSharedData(), null, midCardData.getName(), midCardData.getSecondName(), midCardData.getSurname(), midCardData.getPesel(), 1, null));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f78665e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    vy2.a aVar = this.f78666f.documentStorageInteractor;
                    this.f78665e = 1;
                    obj = aVar.a(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                k10.c0<o.LoadMIdCardData> c0Var = this.f78667g;
                final x xVar = this.f78666f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: gz2.a0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return x.e.a.X(xVar, bVar, (o.LoadMIdCardData) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final MidCardData midCardData = (MidCardData) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: gz2.b0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.e.a.Y(midCardData, (o.LoadMIdCardData) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f78666f, this.f78667g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends o>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f78663f;
            Object objE = uq.b.e();
            int i15 = this.f78662e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = x.this.callActionWithLoaderUseCase;
            a aVar2 = new a(x.this, c0Var, null);
            this.f78663f = vq.j.a(c0Var);
            this.f78662e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<o.LoadMIdCardData> c0Var, tq.e<? super k10.l<? extends o>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = x.this.new e(eVar);
            eVar2.f78663f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgz2/n$c;", "<unused var>", "Lk10/c0;", "Lgz2/o$d;", "state", "Lk10/l;", "Lgz2/o;", "<anonymous>", "(Lgz2/n$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<n.c, k10.c0<o.Initialized>, tq.e<? super k10.l<? extends o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78669f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o.b O(o.Initialized initialized) {
            return o.b.f78593a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f78669f;
            uq.b.e();
            if (this.f78668e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.setupContract.B4(((o.Initialized) c0Var.a()).getConfirmMidSharedData());
            return c0Var.d(new er.l() { // from class: gz2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.f.O((o.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n.c cVar, k10.c0<o.Initialized> c0Var, tq.e<? super k10.l<? extends o>> eVar) {
            f fVar = x.this.new f(eVar);
            fVar.f78669f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgz2/n$g;", "<unused var>", "Lgz2/o$d;", "Loq/i0;", "<anonymous>", "(Lgz2/n$g;Lgz2/o$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<n.g, o.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78671e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f78671e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<n.f> bVarY1 = x.this.Y1();
                n.f.ShowNavigationDialog showNavigationDialog = new n.f.ShowNavigationDialog(x.this.exitDialogMapper.b(new hz2.h.Params(x.this.b9(n.b.f78583a))));
                this.f78671e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n.g gVar, o.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return x.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgz2/n$a;", "<unused var>", "Lk10/c0;", "Lgz2/o$b;", "state", "Lk10/l;", "Lgz2/o;", "<anonymous>", "(Lgz2/n$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<n.a, k10.c0<o.b>, tq.e<? super k10.l<? extends o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78673e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78674f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o.Initialized O(x xVar, o.b bVar) {
            return new o.Initialized(xVar.setupContract.a5());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f78674f;
            uq.b.e();
            if (this.f78673e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final x xVar = x.this;
            return c0Var.d(new er.l() { // from class: gz2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.h.O(xVar, (o.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(n.a aVar, k10.c0<o.b> c0Var, tq.e<? super k10.l<? extends o>> eVar) {
            h hVar = x.this.new h(eVar);
            hVar.f78674f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgz2/n$d;", "<unused var>", "Lgz2/o$b;", "Loq/i0;", "<anonymous>", "(Lgz2/n$d;Lgz2/o$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<n.d, o.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78676e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f78676e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<n.f> bVarY1 = x.this.Y1();
                n.f.b bVar = n.f.b.f78588a;
                this.f78676e = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n.d dVar, o.b bVar, tq.e<? super oq.i0> eVar) {
            return x.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgz2/n$e;", "<unused var>", "Lgz2/o$a;", "state", "Loq/i0;", "<anonymous>", "(Lgz2/n$e;Lgz2/o$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<n.e, o.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78678e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f78678e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<n.f> bVarY1 = x.this.Y1();
                n.f.c cVar = n.f.c.f78589a;
                this.f78678e = 1;
                if (bVarY1.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n.e eVar, o.Error error, tq.e<? super oq.i0> eVar2) {
            return x.this.new j(eVar2).J(oq.i0.f148189a);
        }
    }

    public x(yy.a aVar, vy2.a aVar2, ac4.a aVar3, hz2.f fVar, hb4.d dVar, hz2.e eVar, hz2.h hVar, kk0.f fVar2, iy.a aVar4, gz2.a aVar5) {
        this.documentStorageInteractor = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.mapper = fVar;
        this.errorVMSFactory = dVar;
        this.confirmMidErrorMapper = eVar;
        this.exitDialogMapper = hVar;
        this.startAuthenticationUC = fVar2;
        this.base64Coder = aVar4;
        this.setupContract = aVar5;
        o.c cVar = o.c.f78594a;
        this.initialState = cVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar, new er.l() { // from class: gz2.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.A9(this.f78617a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), y9(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(final x xVar, k10.v vVar) {
        vVar.c(q0.c(o.class), new er.l() { // from class: gz2.q
            @Override // er.l
            public final Object b(Object obj) {
                return x.B9(this.f78611a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o.c.class), new er.l() { // from class: gz2.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.C9(this.f78612a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o.LoadMIdCardData.class), new er.l() { // from class: gz2.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.D9(this.f78613a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o.Initialized.class), new er.l() { // from class: gz2.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.E9(this.f78614a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o.b.class), new er.l() { // from class: gz2.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.F9(this.f78615a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o.Error.class), new er.l() { // from class: gz2.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.G9(this.f78616a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(x xVar, k10.z zVar) {
        c cVar = xVar.new c(null);
        zVar.x(q0.c(n.b.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(x xVar, k10.z zVar) {
        zVar.A(xVar.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(x xVar, k10.z zVar) {
        zVar.A(xVar.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(x xVar, k10.z zVar) {
        f fVar = xVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(n.c.class), oVar, fVar);
        zVar.x(q0.c(n.g.class), oVar, xVar.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(x xVar, k10.z zVar) {
        h hVar = xVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(n.a.class), oVar, hVar);
        zVar.x(q0.c(n.d.class), oVar, xVar.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(x xVar, k10.z zVar) {
        j jVar = xVar.new j(null);
        zVar.x(q0.c(n.e.class), k10.o.CANCEL_PREVIOUS, jVar);
        return oq.i0.f148189a;
    }

    private final jb4.b w9(dx.b bVar, er.a<oq.i0> aVar, er.a<oq.i0> aVar2) {
        return this.confirmMidErrorMapper.b(new hz2.e.Params(bVar, aVar2, aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ jb4.b x9(x xVar, dx.b bVar, er.a aVar, er.a aVar2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            aVar2 = xVar.b9(n.b.f78583a);
        }
        return xVar.w9(bVar, aVar, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p.a y9(o state) {
        return this.mapper.b(new hz2.f.Params(state, b9(n.g.f78591a), b9(n.c.f78584a), b9(n.b.f78583a), b9(n.a.f78582a), b9(n.d.f78585a)));
    }

    @Override // zx.b
    public xw.b<n.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<o, n> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<p.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }
}
