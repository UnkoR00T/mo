package az0;

import ez0.PointDetailsEntryPointData;
import fr.q0;
import jb4.PayloadErrorData;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import kh0.BEExtendedMeasurementPoint;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wy0.LegendEntryData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B[\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0082@¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b#\u0010$J\u0018\u0010'\u001a\u00020\"2\u0006\u0010&\u001a\u00020%H\u0082@¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\"2\u0006\u0010&\u001a\u00020%H\u0082@¢\u0006\u0004\b)\u0010(J8\u0010/\u001a\u00020\"2\u0006\u0010+\u001a\u00020*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\"0,2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010,H\u0082@¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u0004\u0018\u000101*\u00020*H\u0002¢\u0006\u0004\b2\u00103J\u0018\u00106\u001a\u00020\"2\u0006\u00105\u001a\u000204H\u0096\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b8\u00109R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR&\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030J8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR \u0010\\\u001a\b\u0012\u0004\u0012\u00020W0V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020^0]8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010_¨\u0006a"}, d2 = {"Laz0/o;", "Ll00/g;", "Laz0/b;", "Laz0/a;", "Laz0/c;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Ldz0/h;", "pointDetailsScreenMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Llh0/f;", "getDataAboutSpecificMeasurementPointUC", "Lib4/c;", "genericDomainErrorMapper", "Ldz0/c;", "pointDetailsDialogMapper", "Lly0/d;", "deleteFavoritePointUC", "Lly0/a;", "addFavouritePointUC", "snackBarManagerStateHolder", "Lez0/b;", "pointDetailsEntryPointData", "<init>", "(Lyy/a;Ldz0/h;Lac4/a;Llh0/f;Lib4/c;Ldz0/c;Lly0/d;Lly0/a;Li70/n;Lez0/b;)V", "entryPointData", "Lk10/c0;", "state", "Lk10/l;", "y9", "(Lez0/b;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "C9", "(Ltq/e;)Ljava/lang/Object;", "", "id", "x9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "w9", "Ldx/b;", "domainError", "Lkotlin/Function0;", "onRetry", "onClose", "A9", "(Ldx/b;Ler/a;Ler/a;Ltq/e;)Ljava/lang/Object;", "Ljb4/f;", "z9", "(Ldx/b;)Ljb4/f;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Ldz0/h;", "c", "Lac4/a;", "d", "Llh0/f;", "e", "Lib4/c;", "f", "Ldz0/c;", "g", "Lly0/d;", "h", "Lly0/a;", "j", "Li70/n;", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Laz0/c$a;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Laz0/a$h;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<az0.b, az0.a> implements az0.c, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dz0.h pointDetailsScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final lh0.f getDataAboutSpecificMeasurementPointUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final dz0.c pointDetailsDialogMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ly0.d deleteFavoritePointUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ly0.a addFavouritePointUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t<az0.b, az0.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<az0.c.a> state = a9(new d(e9().getState(), this), az0.c.a.C0359a.f15278a);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<az0.a.h> navAction = new xw.b<>();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f15321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f15322g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15323h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f15324j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f15325k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f15327m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f15327m = str;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0072  */
        /* JADX WARN: Code duplicated, block: B:22:0x0076  */
        /* JADX WARN: Code duplicated, block: B:23:0x007d  */
        /* JADX WARN: Code duplicated, block: B:25:0x0082  */
        /* JADX WARN: Code duplicated, block: B:27:0x0088  */
        /* JADX WARN: Code duplicated, block: B:28:0x008d  */
        /* JADX WARN: Code duplicated, block: B:31:0x0096  */
        /* JADX WARN: Code duplicated, block: B:32:0x009d  */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
        
            if (r1.A9(r3, r5, r4, r7) == r0) goto L35;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: az0.o.a.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return o.this.new a(this.f15327m, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15328d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15329e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f15330f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f15331g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15332h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f15333j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f15334k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f15336m;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f15334k = obj;
            this.f15336m |= PKIFailureInfo.systemUnavail;
            return o.this.x9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Laz0/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super k10.l<? extends az0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15337e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f15338f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f15339g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f15340h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f15341j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f15342k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f15343l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ PointDetailsEntryPointData f15345n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ c0<az0.b> f15346p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(PointDetailsEntryPointData pointDetailsEntryPointData, c0<az0.b> c0Var, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f15345n = pointDetailsEntryPointData;
            this.f15346p = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final az0.b.Initialized V(BEExtendedMeasurementPoint bEExtendedMeasurementPoint, PointDetailsEntryPointData pointDetailsEntryPointData, az0.b bVar) {
            return new az0.b.Initialized(bEExtendedMeasurementPoint, pointDetailsEntryPointData.getEntryPoint());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0<az0.b> c0Var;
            Object objE = uq.b.e();
            int i15 = this.f15343l;
            if (i15 == 0) {
                u.b(obj);
                lh0.f fVar = o.this.getDataAboutSpecificMeasurementPointUC;
                lh0.f.Params params = new lh0.f.Params(this.f15345n.getPointId());
                this.f15343l = 1;
                obj = fVar.c(params, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = (c0) this.f15338f;
                u.b(obj);
            }
            return c0Var.c();
            dx.i iVar = (dx.i) obj;
            o oVar = o.this;
            c0<az0.b> c0Var2 = this.f15346p;
            final PointDetailsEntryPointData pointDetailsEntryPointData = this.f15345n;
            if (!(iVar instanceof dx.i.Left)) {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BEExtendedMeasurementPoint bEExtendedMeasurementPoint = (BEExtendedMeasurementPoint) ((dx.i.Right) iVar).b();
                return c0Var2.d(new er.l() { // from class: az0.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o.c.V(bEExtendedMeasurementPoint, pointDetailsEntryPointData, (b) obj2);
                    }
                });
            }
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            er.a aVarB9 = bVar instanceof dx.b.g.e ? oVar.b9(az0.a.c.f15257a) : oVar.b9(az0.a.b.f15256a);
            er.a aVarB10 = oVar.b9(az0.a.k.f15273a);
            this.f15337e = vq.j.a(iVar);
            this.f15338f = c0Var2;
            this.f15339g = vq.j.a(bVar);
            this.f15340h = vq.j.a(aVarB9);
            this.f15341j = 0;
            this.f15342k = 0;
            this.f15343l = 2;
            if (oVar.A9(bVar, aVarB10, aVarB9, this) != objE) {
                c0Var = c0Var2;
                return c0Var.c();
            }
            return objE;
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return o.this.new c(this.f15345n, this.f15346p, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<? extends az0.b>> eVar) {
            return ((c) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<az0.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f15347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f15348b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f15349a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f15350b;

            /* JADX INFO: renamed from: az0.o$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0360a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f15351d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f15352e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f15353f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f15355h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f15356j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f15357k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f15358l;

                public C0360a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f15351d = obj;
                    this.f15352e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o oVar) {
                this.f15349a = hVar;
                this.f15350b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0360a c0360a;
                if (eVar instanceof C0360a) {
                    c0360a = (C0360a) eVar;
                    int i15 = c0360a.f15352e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0360a.f15352e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0360a = new C0360a(eVar);
                    }
                } else {
                    c0360a = new C0360a(eVar);
                }
                Object obj2 = c0360a.f15351d;
                Object objE = uq.b.e();
                int i16 = c0360a.f15352e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f15349a;
                    az0.c.a aVarB = this.f15350b.pointDetailsScreenMapper.b(new dz0.h.Params((az0.b) obj, this.f15350b.b9(az0.a.b.f15256a), this.f15350b.b9(az0.a.i.f15271a), this.f15350b.b9(az0.a.C0355a.f15255a), this.f15350b.new e(), this.f15350b.new f()));
                    c0360a.f15353f = vq.j.a(obj);
                    c0360a.f15355h = vq.j.a(c0360a);
                    c0360a.f15356j = vq.j.a(obj);
                    c0360a.f15357k = vq.j.a(hVar);
                    c0360a.f15358l = 0;
                    c0360a.f15352e = 1;
                    if (hVar.F(aVarB, c0360a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public d(mu.g gVar, o oVar) {
            this.f15347a = gVar;
            this.f15348b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super az0.c.a> hVar, tq.e eVar) {
            Object objA = this.f15347a.a(new a(hVar, this.f15348b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.l<String, i0> {
        e() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(String str) {
            c(str);
            return i0.f148189a;
        }

        public final void c(String str) {
            o.this.d9(new az0.a.GoToClosePoint(str));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements er.l<py0.c, i0> {
        f() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(py0.c cVar) {
            c(cVar);
            return i0.f148189a;
        }

        public final void c(py0.c cVar) {
            o.this.d9(new az0.a.OpenLegend(cVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Laz0/a$k;", "<unused var>", "Lk10/c0;", "Laz0/b;", "state", "Lk10/l;", "<anonymous>", "(Laz0/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<az0.a.k, c0<az0.b>, tq.e<? super k10.l<? extends az0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15362f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ PointDetailsEntryPointData f15364h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(PointDetailsEntryPointData pointDetailsEntryPointData, tq.e<? super g> eVar) {
            super(3, eVar);
            this.f15364h = pointDetailsEntryPointData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f15362f;
            Object objE = uq.b.e();
            int i15 = this.f15361e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            o oVar = o.this;
            PointDetailsEntryPointData pointDetailsEntryPointData = this.f15364h;
            this.f15362f = vq.j.a(c0Var);
            this.f15361e = 1;
            Object objY9 = oVar.y9(pointDetailsEntryPointData, c0Var, this);
            return objY9 == objE ? objE : objY9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(az0.a.k kVar, c0<az0.b> c0Var, tq.e<? super k10.l<? extends az0.b>> eVar) {
            g gVar = o.this.new g(this.f15364h, eVar);
            gVar.f15362f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Laz0/a$c;", "<unused var>", "Laz0/b;", "Loq/i0;", "<anonymous>", "(Laz0/a$c;Laz0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<az0.a.c, az0.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15365e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f15365e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<az0.a.h> bVarY1 = o.this.Y1();
                az0.a.h.b bVar = az0.a.h.b.f15263a;
                this.f15365e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(az0.a.c cVar, az0.b bVar, tq.e<? super i0> eVar) {
            return o.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Laz0/b$a;", "it", "Loq/i0;", "<anonymous>", "(Laz0/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<az0.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15367e;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f15367e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            o.this.d9(az0.a.k.f15273a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(az0.b.a aVar, tq.e<? super i0> eVar) {
            return ((i) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return o.this.new i(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Laz0/a$b;", "<unused var>", "Laz0/b$a;", "Loq/i0;", "<anonymous>", "(Laz0/a$b;Laz0/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<az0.a.b, az0.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15369e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f15369e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<az0.a.h> bVarY1 = o.this.Y1();
                az0.a.h.C0356a c0356a = az0.a.h.C0356a.f15262a;
                this.f15369e = 1;
                if (bVarY1.F(c0356a, this) == objE) {
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
        public final Object w(az0.a.b bVar, az0.b.a aVar, tq.e<? super i0> eVar) {
            return o.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Laz0/a$b;", "<unused var>", "Laz0/b$b;", "state", "Loq/i0;", "<anonymous>", "(Laz0/a$b;Laz0/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<az0.a.b, az0.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15372f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f15374a;

            static {
                int[] iArr = new int[ez0.a.values().length];
                try {
                    iArr[ez0.a.MAP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ez0.a.POINT_DETAILS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ez0.a.SEARCH.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ez0.a.DASHBOARD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f15374a = iArr;
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        
            if (r7.F(r2, r6) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        
            if (r7.F(r2, r6) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
        
            if (r7.F(r2, r6) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f15372f
                az0.b$b r0 = (az0.b.Initialized) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f15371e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L22
                if (r2 == r5) goto L15
                if (r2 == r4) goto L15
                if (r2 != r3) goto L1a
            L15:
                oq.u.b(r7)
                goto L99
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                oq.u.b(r7)
                ez0.a r7 = r0.getEntryPoint()
                int[] r2 = az0.o.k.a.f15374a
                int r7 = r7.ordinal()
                r7 = r2[r7]
                if (r7 == r5) goto L73
                if (r7 == r4) goto L5c
                if (r7 == r3) goto L5c
                r2 = 4
                if (r7 != r2) goto L56
                az0.o r7 = az0.o.this
                xw.b r7 = r7.Y1()
                az0.a$h$e r2 = new az0.a$h$e
                py0.b r4 = py0.b.DEFAULT
                r2.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r6.f15372f = r0
                r6.f15371e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L99
                goto L98
            L56:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            L5c:
                az0.o r7 = az0.o.this
                xw.b r7 = r7.Y1()
                az0.a$h$a r2 = az0.a.h.C0356a.f15262a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f15372f = r0
                r6.f15371e = r4
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L99
                goto L98
            L73:
                az0.o r7 = az0.o.this
                xw.b r7 = r7.Y1()
                az0.a$h$f r2 = new az0.a$h$f
                kh0.e r3 = r0.getPoint()
                kh0.f r3 = r3.getQuality()
                kh0.l r3 = r3.getRate()
                r2.<init>(r3)
                java.lang.Object r0 = vq.j.a(r0)
                r6.f15372f = r0
                r6.f15371e = r5
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L99
            L98:
                return r1
            L99:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: az0.o.k.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(az0.a.b bVar, az0.b.Initialized initialized, tq.e<? super i0> eVar) {
            k kVar = o.this.new k(eVar);
            kVar.f15372f = initialized;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Laz0/a$e;", "action", "Laz0/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Laz0/a$e;Laz0/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<az0.a.GoToClosePoint, az0.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15376f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            az0.a.GoToClosePoint goToClosePoint = (az0.a.GoToClosePoint) this.f15376f;
            Object objE = uq.b.e();
            int i15 = this.f15375e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<az0.a.h> bVarY1 = o.this.Y1();
                az0.a.h.GoToClosePoint goToClosePoint2 = new az0.a.h.GoToClosePoint(new PointDetailsEntryPointData(goToClosePoint.getId(), ez0.a.POINT_DETAILS));
                this.f15376f = vq.j.a(goToClosePoint);
                this.f15375e = 1;
                if (bVarY1.F(goToClosePoint2, this) == objE) {
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
        public final Object w(az0.a.GoToClosePoint goToClosePoint, az0.b.Initialized initialized, tq.e<? super i0> eVar) {
            l lVar = o.this.new l(eVar);
            lVar.f15376f = goToClosePoint;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Laz0/a$j;", "action", "Laz0/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Laz0/a$j;Laz0/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<az0.a.OpenLegend, az0.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15379f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            az0.a.OpenLegend openLegend = (az0.a.OpenLegend) this.f15379f;
            Object objE = uq.b.e();
            int i15 = this.f15378e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<az0.a.h> bVarY1 = o.this.Y1();
                az0.a.h.OpenLegend openLegend2 = new az0.a.h.OpenLegend(new LegendEntryData(openLegend.getDustIndicatorType(), wy0.c.POINT_DETAILS));
                this.f15379f = vq.j.a(openLegend);
                this.f15378e = 1;
                if (bVarY1.F(openLegend2, this) == objE) {
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
        public final Object w(az0.a.OpenLegend openLegend, az0.b.Initialized initialized, tq.e<? super i0> eVar) {
            m mVar = o.this.new m(eVar);
            mVar.f15379f = openLegend;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Laz0/a$f;", "action", "Laz0/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Laz0/a$f;Laz0/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<az0.a.GoToDashboard, az0.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15381e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15382f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            az0.a.GoToDashboard goToDashboard = (az0.a.GoToDashboard) this.f15382f;
            Object objE = uq.b.e();
            int i15 = this.f15381e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<az0.a.h> bVarY1 = o.this.Y1();
                az0.a.h.GoToDashboard goToDashboard2 = new az0.a.h.GoToDashboard(goToDashboard.getData());
                this.f15382f = vq.j.a(goToDashboard);
                this.f15381e = 1;
                if (bVarY1.F(goToDashboard2, this) == objE) {
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
        public final Object w(az0.a.GoToDashboard goToDashboard, az0.b.Initialized initialized, tq.e<? super i0> eVar) {
            n nVar = o.this.new n(eVar);
            nVar.f15382f = goToDashboard;
            return nVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: az0.o$o, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Laz0/a$i;", "<unused var>", "Laz0/b$b;", "Loq/i0;", "<anonymous>", "(Laz0/a$i;Laz0/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C0361o extends vq.k implements er.q<az0.a.i, az0.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15384e;

        C0361o(tq.e<? super C0361o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f15384e;
            if (i15 == 0) {
                u.b(obj);
                o oVar = o.this;
                this.f15384e = 1;
                if (oVar.C9(this) == objE) {
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
        public final Object w(az0.a.i iVar, az0.b.Initialized initialized, tq.e<? super i0> eVar) {
            return o.this.new C0361o(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Laz0/a$d;", "<unused var>", "Laz0/b$b;", "state", "Loq/i0;", "<anonymous>", "(Laz0/a$d;Laz0/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<az0.a.d, az0.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15386e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15387f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            az0.b.Initialized initialized = (az0.b.Initialized) this.f15387f;
            Object objE = uq.b.e();
            int i15 = this.f15386e;
            if (i15 == 0) {
                u.b(obj);
                o oVar = o.this;
                String id5 = initialized.getPoint().getId();
                this.f15387f = vq.j.a(initialized);
                this.f15386e = 1;
                if (oVar.x9(id5, this) == objE) {
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
        public final Object w(az0.a.d dVar, az0.b.Initialized initialized, tq.e<? super i0> eVar) {
            p pVar = o.this.new p(eVar);
            pVar.f15387f = initialized;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Laz0/a$l;", "action", "Laz0/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Laz0/a$l;Laz0/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<az0.a.ShowSnackBar, az0.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15390f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            az0.a.ShowSnackBar showSnackBar = (az0.a.ShowSnackBar) this.f15390f;
            uq.b.e();
            if (this.f15389e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            o.this.y(new p50.a.DefaultWithIcon(showSnackBar.getMessage(), false, null, null, 14, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(az0.a.ShowSnackBar showSnackBar, az0.b.Initialized initialized, tq.e<? super i0> eVar) {
            q qVar = o.this.new q(eVar);
            qVar.f15390f = showSnackBar;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Laz0/a$a;", "<unused var>", "Laz0/b$b;", "state", "Loq/i0;", "<anonymous>", "(Laz0/a$a;Laz0/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<az0.a.C0355a, az0.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15392e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15393f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            az0.b.Initialized initialized = (az0.b.Initialized) this.f15393f;
            Object objE = uq.b.e();
            int i15 = this.f15392e;
            if (i15 == 0) {
                u.b(obj);
                o oVar = o.this;
                String id5 = initialized.getPoint().getId();
                this.f15393f = vq.j.a(initialized);
                this.f15392e = 1;
                if (oVar.w9(id5, this) == objE) {
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
        public final Object w(az0.a.C0355a c0355a, az0.b.Initialized initialized, tq.e<? super i0> eVar) {
            r rVar = o.this.new r(eVar);
            rVar.f15393f = initialized;
            return rVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Laz0/a$g;", "<unused var>", "Laz0/b$b;", "Loq/i0;", "<anonymous>", "(Laz0/a$g;Laz0/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<az0.a.g, az0.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15395e;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f15395e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<az0.a.h> bVarY1 = o.this.Y1();
                az0.a.h.g gVar = az0.a.h.g.f15268a;
                this.f15395e = 1;
                if (bVarY1.F(gVar, this) == objE) {
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
        public final Object w(az0.a.g gVar, az0.b.Initialized initialized, tq.e<? super i0> eVar) {
            return o.this.new s(eVar).J(i0.f148189a);
        }
    }

    public o(yy.a aVar, dz0.h hVar, ac4.a aVar2, lh0.f fVar, ib4.c cVar, dz0.c cVar2, ly0.d dVar, ly0.a aVar3, i70.n nVar, final PointDetailsEntryPointData pointDetailsEntryPointData) {
        this.pointDetailsScreenMapper = hVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getDataAboutSpecificMeasurementPointUC = fVar;
        this.genericDomainErrorMapper = cVar;
        this.pointDetailsDialogMapper = cVar2;
        this.deleteFavoritePointUC = dVar;
        this.addFavouritePointUC = aVar3;
        this.snackBarManagerStateHolder = nVar;
        this.stateMachine = aVar.a(az0.b.a.f15275a, new er.l() { // from class: az0.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.E9(this.f15307a, pointDetailsEntryPointData, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A9(dx.b bVar, final er.a<i0> aVar, final er.a<i0> aVar2, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new az0.a.h.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: az0.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.B9(aVar, aVar2, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(er.a aVar, er.a aVar2, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            aVar.a();
        } else if (aVar2 != null) {
            aVar2.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C9(tq.e<? super i0> eVar) {
        Object objF = Y1().F(new az0.a.h.OpenDeleteFromFavouriteDialog(this.pointDetailsDialogMapper.b(new dz0.c.Params(b9(az0.a.d.f15258a)))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(final o oVar, final PointDetailsEntryPointData pointDetailsEntryPointData, v vVar) {
        vVar.c(q0.c(az0.b.class), new er.l() { // from class: az0.j
            @Override // er.l
            public final Object b(Object obj) {
                return o.F9(this.f15301a, pointDetailsEntryPointData, (z) obj);
            }
        });
        vVar.c(q0.c(az0.b.a.class), new er.l() { // from class: az0.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.G9(this.f15303a, (z) obj);
            }
        });
        vVar.c(q0.c(az0.b.Initialized.class), new er.l() { // from class: az0.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.H9(this.f15304a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(o oVar, PointDetailsEntryPointData pointDetailsEntryPointData, z zVar) {
        g gVar = oVar.new g(pointDetailsEntryPointData, null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(az0.a.k.class), oVar2, gVar);
        zVar.x(q0.c(az0.a.c.class), oVar2, oVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(o oVar, z zVar) {
        zVar.C(oVar.new i(null));
        j jVar = oVar.new j(null);
        zVar.x(q0.c(az0.a.b.class), k10.o.CANCEL_PREVIOUS, jVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(o oVar, z zVar) {
        k kVar = oVar.new k(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(az0.a.b.class), oVar2, kVar);
        zVar.x(q0.c(az0.a.GoToClosePoint.class), oVar2, oVar.new l(null));
        zVar.x(q0.c(az0.a.OpenLegend.class), oVar2, oVar.new m(null));
        zVar.x(q0.c(az0.a.GoToDashboard.class), oVar2, oVar.new n(null));
        zVar.x(q0.c(az0.a.i.class), oVar2, oVar.new C0361o(null));
        zVar.x(q0.c(az0.a.d.class), oVar2, oVar.new p(null));
        zVar.x(q0.c(az0.a.ShowSnackBar.class), oVar2, oVar.new q(null));
        zVar.x(q0.c(az0.a.C0355a.class), oVar2, oVar.new r(null));
        zVar.x(q0.c(az0.a.g.class), oVar2, oVar.new s(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w9(String str, tq.e<? super i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(str, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (A9(r2, r5, r4, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x9(java.lang.String r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.o.x9(java.lang.String, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y9(PointDetailsEntryPointData pointDetailsEntryPointData, c0<az0.b> c0Var, tq.e<? super k10.l<? extends az0.b>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new c(pointDetailsEntryPointData, c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PayloadErrorData z9(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(PointDetailsEntryPointData pointDetailsEntryPointData) {
        super.P5(pointDetailsEntryPointData);
    }

    @Override // zx.b
    public xw.b<az0.a.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<az0.b, az0.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<az0.c.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
