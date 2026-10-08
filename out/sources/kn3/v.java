package kn3;

import bn3.VehicleDocumentContainerData;
import bn3.VehicleDocumentData;
import f00.j0;
import fr.q0;
import iq0.DashboardServiceEntry;
import java.time.OffsetDateTime;
import java.util.List;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 k2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00042\u00020\u00052\u00020\u0006:\u0002lmBu\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0018\u0010'\u001a\u00020\"2\u0006\u0010&\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b)\u0010$J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020\"2\u0006\u0010*\u001a\u00020.H\u0082@¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\"2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\"H\u0002¢\u0006\u0004\b5\u0010$J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;H\u0002¢\u0006\u0004\b=\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR,\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030T8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bY\u0010$\u001a\u0004\bW\u0010XR \u0010a\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R&\u0010*\u001a\b\u0012\u0004\u0012\u00020c0b8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bd\u0010e\u0012\u0004\bh\u0010$\u001a\u0004\bf\u0010gR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020i0;8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010>¨\u0006n"}, d2 = {"Lkn3/v;", "Ll00/g;", "Lkn3/m;", "Lkn3/l;", "", "Lkn3/n;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "snackBarManagerStateHolder", "Lnn3/h;", "vehicleDetailsMapper", "Lnn3/b;", "vehicleDetailsErrorMapper", "Lcn3/a;", "getVehicleDataByRegistrationNoUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lez/a;", "currentTimeProvider", "La14/d;", "copyToClipboardUseCase", "Lmz3/z;", "updateDocumentAsyncUC", "Lh64/r;", "loadServicesUseCase", "Lzm3/a;", "vehiclesContainersInteractor", "Lcn3/c;", "isVehicleCardUpdateFeatureFlagActiveUC", "Lon3/b;", "setupData", "<init>", "(Lyy/a;Li70/n;Lnn3/h;Lnn3/b;Lcn3/a;Lac4/a;Lez/a;La14/d;Lmz3/z;Lh64/r;Lzm3/a;Lcn3/c;Lon3/b;)V", "Loq/i0;", "d", "()V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "state", "Lnn3/h$a;", "D9", "(Lkn3/m;)Lnn3/h$a;", "Lkn3/m$a;", "P9", "(Lkn3/m$a;Ltq/e;)Ljava/lang/Object;", "Lmz3/z$c;", "result", "K9", "(Lmz3/z$c;)V", "J9", "Lnn3/b$b;", "vehicleDetailsError", "Ljb4/b;", "G9", "(Lnn3/b$b;)Ljb4/b;", "Lmu/g;", "Ljava/time/OffsetDateTime;", "B9", "()Lmu/g;", "c", "Lnn3/h;", "Lnn3/b;", "e", "Lcn3/a;", "f", "Lac4/a;", "g", "Lez/a;", "h", "La14/d;", "j", "Lmz3/z;", "k", "Lh64/r;", "l", "Lzm3/a;", "m", "Lcn3/c;", "n", "Lon3/b;", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Lkn3/l$p;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lkn3/n$a;", "r", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "Li70/p;", "snackBarVisibilityState", "s", "b", "a", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<kn3.m, kn3.l> implements zx.b, kn3.n, i70.n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f111590t = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final rq0.b.d f111591v = rq0.b.d.VEHICLE_CARD;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ i70.n f111592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final nn3.h vehicleDetailsMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final nn3.b vehicleDetailsErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final cn3.a getVehicleDataByRegistrationNoUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a14.d copyToClipboardUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final h64.r loadServicesUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final zm3.a vehiclesContainersInteractor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final cn3.c isVehicleCardUpdateFeatureFlagActiveUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final on3.b setupData;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<kn3.m, kn3.l> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<kn3.l.p> navAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p0<kn3.n.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lkn3/v$b;", "Lf00/j0;", "Lon3/b;", "Lkn3/v;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends j0<on3.b, v> {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/h;", "Ljava/time/OffsetDateTime;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<mu.h<? super OffsetDateTime>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111607e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f111608f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0022  */
        /* JADX WARN: Code duplicated, block: B:13:0x002c  */
        /* JADX WARN: Code duplicated, block: B:16:0x0039  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004b -> B:11:0x0022). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f111608f
                mu.h r0 = (mu.h) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f111607e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1f
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                oq.u.b(r8)
                goto L39
            L1f:
                oq.u.b(r8)
            L22:
                tq.i r8 = r7.getContext()
                boolean r8 = ju.g2.n(r8)
                if (r8 == 0) goto L4e
                r7.f111608f = r0
                r7.f111607e = r4
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = ju.z0.b(r5, r7)
                if (r8 != r1) goto L39
                goto L4d
            L39:
                kn3.v r8 = kn3.v.this
                ez.a r8 = kn3.v.q9(r8)
                java.time.OffsetDateTime r8 = r8.f()
                r7.f111608f = r0
                r7.f111607e = r3
                java.lang.Object r8 = r0.F(r8, r7)
                if (r8 != r1) goto L22
            L4d:
                return r1
            L4e:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kn3.v.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super OffsetDateTime> hVar, tq.e<? super i0> eVar) {
            return ((c) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = v.this.new c(eVar);
            cVar.f111608f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<kn3.n.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f111610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f111611b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f111612a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f111613b;

            /* JADX INFO: renamed from: kn3.v$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2701a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f111614d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f111615e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f111616f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f111618h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f111619j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f111620k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f111621l;

                public C2701a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f111614d = obj;
                    this.f111615e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f111612a = hVar;
                this.f111613b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2701a c2701a;
                if (eVar instanceof C2701a) {
                    c2701a = (C2701a) eVar;
                    int i15 = c2701a.f111615e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2701a.f111615e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2701a = new C2701a(eVar);
                    }
                } else {
                    c2701a = new C2701a(eVar);
                }
                Object obj2 = c2701a.f111614d;
                Object objE = uq.b.e();
                int i16 = c2701a.f111615e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f111612a;
                    kn3.n.a aVarB = this.f111613b.vehicleDetailsMapper.b(this.f111613b.D9((kn3.m) obj));
                    c2701a.f111616f = vq.j.a(obj);
                    c2701a.f111618h = vq.j.a(c2701a);
                    c2701a.f111619j = vq.j.a(obj);
                    c2701a.f111620k = vq.j.a(hVar);
                    c2701a.f111621l = 0;
                    c2701a.f111615e = 1;
                    if (hVar.F(aVarB, c2701a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public d(mu.g gVar, v vVar) {
            this.f111610a = gVar;
            this.f111611b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super kn3.n.a> hVar, tq.e eVar) {
            Object objA = this.f111610a.a(new a(hVar, this.f111611b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkn3/l$a;", "<unused var>", "Lkn3/m;", "Loq/i0;", "<anonymous>", "(Lkn3/l$a;Lkn3/m;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<kn3.l.a, kn3.m, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111622e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111622e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<kn3.l.p> bVarY1 = v.this.Y1();
                kn3.l.p.a aVar = kn3.l.p.a.f111559a;
                this.f111622e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.a aVar, kn3.m mVar, tq.e<? super i0> eVar) {
            return v.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lkn3/m$b;", "state", "Lk10/l;", "Lkn3/m;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<kn3.m.b>, tq.e<? super k10.l<? extends kn3.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f111625f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f111626g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lkn3/m;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends kn3.m>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f111628e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f111629f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f111630g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f111631h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f111632j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f111633k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f111634l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ v f111635m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ k10.c0<kn3.m.b> f111636n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ List<DashboardServiceEntry> f111637p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, k10.c0<kn3.m.b> c0Var, List<DashboardServiceEntry> list, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f111635m = vVar;
                this.f111636n = c0Var;
                this.f111637p = list;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final kn3.m.DataLoaded V(VehicleDocumentData vehicleDocumentData, v vVar, List list, kn3.m.b bVar) {
                return new kn3.m.DataLoaded(vehicleDocumentData, false, false, false, vVar.currentTimeProvider.f(), false, list, 14, null);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:26:0x00c7  */
            /* JADX WARN: Code duplicated, block: B:27:0x00ca A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:28:0x00cc  */
            /* JADX WARN: Code duplicated, block: B:32:0x00fd  */
            /* JADX WARN: Code duplicated, block: B:35:0x0103  */
            /* JADX WARN: Code duplicated, block: B:37:0x0109  */
            /* JADX WARN: Code duplicated, block: B:39:0x010d  */
            /* JADX WARN: Code duplicated, block: B:41:0x011f  */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
            
                if (r10.F(r2, r9) == r0) goto L31;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 293
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: kn3.v.f.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f111635m, this.f111636n, this.f111637p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends kn3.m>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kn3.m.DataLoaded O(v vVar, List list, kn3.m.b bVar) {
            return new kn3.m.DataLoaded(((on3.b.VehicleData) vVar.setupData).getVehicleData(), false, false, false, vVar.currentTimeProvider.f(), false, list, 14, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
        
            if (r12 == r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c5, code lost:
        
            if (r2.F(r4, r11) == r1) goto L30;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 211
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kn3.v.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<kn3.m.b> c0Var, tq.e<? super k10.l<? extends kn3.m>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = v.this.new f(eVar);
            fVar.f111626g = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkn3/l$k;", "<unused var>", "Lkn3/m$a;", "Loq/i0;", "<anonymous>", "(Lkn3/l$k;Lkn3/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<kn3.l.k, kn3.m.DataLoaded, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f111640g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f111641h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111642j;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            if (r1.F(r4, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
        
            if (r1.F(r4, r7) == r0) goto L25;
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
                int r1 = r7.f111642j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r7.f111639f
                cb4.d r0 = (cb4.DialogData) r0
                goto L22
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r0 = r7.f111639f
                oq.i0 r0 = (oq.i0) r0
            L22:
                java.lang.Object r0 = r7.f111638e
                dx.i r0 = (dx.i) r0
                oq.u.b(r8)
                goto La0
            L2b:
                oq.u.b(r8)
                goto L43
            L2f:
                oq.u.b(r8)
                kn3.v r8 = kn3.v.this
                zm3.a r8 = kn3.v.w9(r8)
                rq0.c r1 = rq0.c.PENALTY_POINTS
                r7.f111642j = r4
                java.lang.Object r8 = r8.d(r1, r7)
                if (r8 != r0) goto L43
                goto L9f
            L43:
                dx.i r8 = (dx.i) r8
                kn3.v r1 = kn3.v.this
                boolean r4 = r8 instanceof dx.i.Left
                r5 = 0
                if (r4 == 0) goto L75
                r2 = r8
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                oq.i0 r2 = (oq.i0) r2
                kn3.l$p$f r4 = new kn3.l$p$f
                as2.a$a r6 = as2.a.C0311a.f14330a
                r4.<init>(r6)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f111638e = r8
                java.lang.Object r8 = vq.j.a(r2)
                r7.f111639f = r8
                r7.f111640g = r5
                r7.f111641h = r5
                r7.f111642j = r3
                java.lang.Object r8 = r1.F(r4, r7)
                if (r8 != r0) goto La0
                goto L9f
            L75:
                boolean r3 = r8 instanceof dx.i.Right
                if (r3 == 0) goto La3
                r3 = r8
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                kn3.l$p$i r4 = new kn3.l$p$i
                r4.<init>(r3)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f111638e = r8
                java.lang.Object r8 = vq.j.a(r3)
                r7.f111639f = r8
                r7.f111640g = r5
                r7.f111641h = r5
                r7.f111642j = r2
                java.lang.Object r8 = r1.F(r4, r7)
                if (r8 != r0) goto La0
            L9f:
                return r0
            La0:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            La3:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kn3.v.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.k kVar, kn3.m.DataLoaded dataLoaded, tq.e<? super i0> eVar) {
            return v.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkn3/l$j;", "action", "Lkn3/m$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lkn3/l$j;Lkn3/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<kn3.l.GoToMoreDialog, kn3.m.DataLoaded, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111645f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            kn3.l.GoToMoreDialog goToMoreDialog = (kn3.l.GoToMoreDialog) this.f111645f;
            Object objE = uq.b.e();
            int i15 = this.f111644e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                kn3.l.p.GoToMoreDialog goToMoreDialog2 = new kn3.l.p.GoToMoreDialog(new in3.e(goToMoreDialog.a()));
                this.f111645f = vq.j.a(goToMoreDialog);
                this.f111644e = 1;
                if (vVar.F(goToMoreDialog2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.GoToMoreDialog goToMoreDialog, kn3.m.DataLoaded dataLoaded, tq.e<? super i0> eVar) {
            h hVar = v.this.new h(eVar);
            hVar.f111645f = goToMoreDialog;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkn3/l$f;", "action", "Lkn3/m$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lkn3/l$f;Lkn3/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<kn3.l.CopyToClipboard, kn3.m.DataLoaded, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111648f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            kn3.l.CopyToClipboard copyToClipboard = (kn3.l.CopyToClipboard) this.f111648f;
            Object objE = uq.b.e();
            int i15 = this.f111647e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.d dVar = v.this.copyToClipboardUseCase;
                a14.d.Params params = new a14.d.Params(copyToClipboard.getValue(), copyToClipboard.getMessageLabel());
                this.f111648f = vq.j.a(copyToClipboard);
                this.f111647e = 1;
                if (dVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.CopyToClipboard copyToClipboard, kn3.m.DataLoaded dataLoaded, tq.e<? super i0> eVar) {
            i iVar = v.this.new i(eVar);
            iVar.f111648f = copyToClipboard;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkn3/l$c;", "<unused var>", "Lk10/c0;", "Lkn3/m$a;", "state", "Lk10/l;", "Lkn3/m;", "<anonymous>", "(Lkn3/l$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<kn3.l.c, k10.c0<kn3.m.DataLoaded>, tq.e<? super k10.l<? extends kn3.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111650e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111651f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kn3.m.DataLoaded O(kn3.m.DataLoaded dataLoaded) {
            return kn3.m.DataLoaded.b(dataLoaded, null, false, false, false, null, false, null, 123, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f111651f;
            uq.b.e();
            if (this.f111650e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: kn3.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.j.O((m.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.c cVar, k10.c0<kn3.m.DataLoaded> c0Var, tq.e<? super k10.l<? extends kn3.m>> eVar) {
            j jVar = new j(eVar);
            jVar.f111651f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkn3/l$d;", "<unused var>", "Lk10/c0;", "Lkn3/m$a;", "state", "Lk10/l;", "Lkn3/m;", "<anonymous>", "(Lkn3/l$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<kn3.l.d, k10.c0<kn3.m.DataLoaded>, tq.e<? super k10.l<? extends kn3.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111653f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kn3.m.DataLoaded O(kn3.m.DataLoaded dataLoaded) {
            return kn3.m.DataLoaded.b(dataLoaded, null, false, false, false, null, false, null, 119, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f111653f;
            uq.b.e();
            if (this.f111652e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: kn3.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.k.O((m.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.d dVar, k10.c0<kn3.m.DataLoaded> c0Var, tq.e<? super k10.l<? extends kn3.m>> eVar) {
            k kVar = new k(eVar);
            kVar.f111653f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkn3/l$r;", "action", "Lk10/c0;", "Lkn3/m$a;", "state", "Lk10/l;", "Lkn3/m;", "<anonymous>", "(Lkn3/l$r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<kn3.l.VehicleDetailsAccordionStateChange, k10.c0<kn3.m.DataLoaded>, tq.e<? super k10.l<? extends kn3.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111655f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f111656g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kn3.m.DataLoaded O(kn3.l.VehicleDetailsAccordionStateChange vehicleDetailsAccordionStateChange, kn3.m.DataLoaded dataLoaded) {
            return kn3.m.DataLoaded.b(dataLoaded, null, false, false, false, null, vehicleDetailsAccordionStateChange.getExpanded(), null, 95, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final kn3.l.VehicleDetailsAccordionStateChange vehicleDetailsAccordionStateChange = (kn3.l.VehicleDetailsAccordionStateChange) this.f111655f;
            k10.c0 c0Var = (k10.c0) this.f111656g;
            uq.b.e();
            if (this.f111654e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: kn3.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.l.O(vehicleDetailsAccordionStateChange, (m.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.VehicleDetailsAccordionStateChange vehicleDetailsAccordionStateChange, k10.c0<kn3.m.DataLoaded> c0Var, tq.e<? super k10.l<? extends kn3.m>> eVar) {
            l lVar = new l(eVar);
            lVar.f111655f = vehicleDetailsAccordionStateChange;
            lVar.f111656g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkn3/l$g;", "<unused var>", "Lkn3/m$a;", "state", "Loq/i0;", "<anonymous>", "(Lkn3/l$g;Lkn3/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<kn3.l.g, kn3.m.DataLoaded, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111658f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String vin;
            kn3.m.DataLoaded dataLoaded = (kn3.m.DataLoaded) this.f111658f;
            uq.b.e();
            if (this.f111657e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            VehicleDocumentContainerData data = dataLoaded.getVehicleDocumentData().getScope().getData();
            if (data != null && (vin = data.getVin()) != null) {
                v vVar = v.this;
                vVar.d9(new kn3.l.CopyToClipboard(vin, vVar.vehicleDetailsMapper.V()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.g gVar, kn3.m.DataLoaded dataLoaded, tq.e<? super i0> eVar) {
            m mVar = v.this.new m(eVar);
            mVar.f111658f = dataLoaded;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkn3/l$e;", "<unused var>", "Lkn3/m$a;", "state", "Loq/i0;", "<anonymous>", "(Lkn3/l$e;Lkn3/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<kn3.l.e, kn3.m.DataLoaded, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111661f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String registrationNumber;
            kn3.m.DataLoaded dataLoaded = (kn3.m.DataLoaded) this.f111661f;
            uq.b.e();
            if (this.f111660e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            VehicleDocumentContainerData data = dataLoaded.getVehicleDocumentData().getScope().getData();
            if (data != null && (registrationNumber = data.getRegistrationNumber()) != null) {
                v vVar = v.this;
                vVar.d9(new kn3.l.CopyToClipboard(registrationNumber, vVar.vehicleDetailsMapper.U()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.e eVar, kn3.m.DataLoaded dataLoaded, tq.e<? super i0> eVar2) {
            n nVar = v.this.new n(eVar2);
            nVar.f111661f = dataLoaded;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljava/time/OffsetDateTime;", "currentDateTime", "Lk10/c0;", "Lkn3/m$a;", "state", "Lk10/l;", "Lkn3/m;", "<anonymous>", "(Ljava/time/OffsetDateTime;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<OffsetDateTime, k10.c0<kn3.m.DataLoaded>, tq.e<? super k10.l<? extends kn3.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111664f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f111665g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kn3.m.DataLoaded O(OffsetDateTime offsetDateTime, kn3.m.DataLoaded dataLoaded) {
            return kn3.m.DataLoaded.b(dataLoaded, null, false, false, false, offsetDateTime, false, null, 111, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OffsetDateTime offsetDateTime = (OffsetDateTime) this.f111664f;
            k10.c0 c0Var = (k10.c0) this.f111665g;
            uq.b.e();
            if (this.f111663e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: kn3.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.o.O(offsetDateTime, (m.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OffsetDateTime offsetDateTime, k10.c0<kn3.m.DataLoaded> c0Var, tq.e<? super k10.l<? extends kn3.m>> eVar) {
            o oVar = new o(eVar);
            oVar.f111664f = offsetDateTime;
            oVar.f111665g = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkn3/l$o;", "action", "Lk10/c0;", "Lkn3/m$a;", "state", "Lk10/l;", "Lkn3/m;", "<anonymous>", "(Lkn3/l$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<kn3.l.LoadVehicleData, k10.c0<kn3.m.DataLoaded>, tq.e<? super k10.l<? extends kn3.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111666e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111667f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f111668g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lkn3/m;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends kn3.m>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f111670e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f111671f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f111672g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f111673h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f111674j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f111675k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ v f111676l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ kn3.l.LoadVehicleData f111677m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ k10.c0<kn3.m.DataLoaded> f111678n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, kn3.l.LoadVehicleData loadVehicleData, k10.c0<kn3.m.DataLoaded> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f111676l = vVar;
                this.f111677m = loadVehicleData;
                this.f111678n = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final kn3.m.DataLoaded V(VehicleDocumentData vehicleDocumentData, kn3.m.DataLoaded dataLoaded) {
                return kn3.m.DataLoaded.b(dataLoaded, vehicleDocumentData, false, false, false, null, false, null, 126, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<kn3.m.DataLoaded> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f111675k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    cn3.a aVar = this.f111676l.getVehicleDataByRegistrationNoUseCase;
                    cn3.a.Params params = new cn3.a.Params(this.f111677m.getRegistrationNumber());
                    this.f111675k = 1;
                    obj = aVar.d(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f111671f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                v vVar = this.f111676l;
                k10.c0<kn3.m.DataLoaded> c0Var2 = this.f111678n;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final VehicleDocumentData vehicleDocumentData = (VehicleDocumentData) ((dx.i.Right) iVar).b();
                    return c0Var2.b(new er.l() { // from class: kn3.c0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.p.a.V(vehicleDocumentData, (m.DataLoaded) obj2);
                        }
                    });
                }
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                xw.b<kn3.l.p> bVarY1 = vVar.Y1();
                kn3.l.p.Error error = new kn3.l.p.Error(vVar.G9(new nn3.b.AbstractC3391b.General(bVar)));
                this.f111670e = vq.j.a(iVar);
                this.f111671f = c0Var2;
                this.f111672g = vq.j.a(bVar);
                this.f111673h = 0;
                this.f111674j = 0;
                this.f111675k = 2;
                if (bVarY1.F(error, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f111676l, this.f111677m, this.f111678n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends kn3.m>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            kn3.l.LoadVehicleData loadVehicleData = (kn3.l.LoadVehicleData) this.f111667f;
            k10.c0 c0Var = (k10.c0) this.f111668g;
            Object objE = uq.b.e();
            int i15 = this.f111666e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = v.this.callActionWithLoaderUseCase;
            a aVar2 = new a(v.this, loadVehicleData, c0Var, null);
            this.f111667f = vq.j.a(loadVehicleData);
            this.f111668g = vq.j.a(c0Var);
            this.f111666e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.LoadVehicleData loadVehicleData, k10.c0<kn3.m.DataLoaded> c0Var, tq.e<? super k10.l<? extends kn3.m>> eVar) {
            p pVar = v.this.new p(eVar);
            pVar.f111667f = loadVehicleData;
            pVar.f111668g = c0Var;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkn3/l$b;", "<unused var>", "Lk10/c0;", "Lkn3/m$a;", "state", "Lk10/l;", "Lkn3/m;", "<anonymous>", "(Lkn3/l$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<kn3.l.b, k10.c0<kn3.m.DataLoaded>, tq.e<? super k10.l<? extends kn3.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111680f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kn3.m.DataLoaded O(kn3.m.DataLoaded dataLoaded) {
            return kn3.m.DataLoaded.b(dataLoaded, null, false, false, false, null, false, null, 125, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f111680f;
            uq.b.e();
            if (this.f111679e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: kn3.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.q.O((m.DataLoaded) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.b bVar, k10.c0<kn3.m.DataLoaded> c0Var, tq.e<? super k10.l<? extends kn3.m>> eVar) {
            q qVar = new q(eVar);
            qVar.f111680f = c0Var;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkn3/l$h;", "<unused var>", "Lkn3/m$a;", "Loq/i0;", "<anonymous>", "(Lkn3/l$h;Lkn3/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<kn3.l.h, kn3.m.DataLoaded, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111681e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111681e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<kn3.l.p> bVarY1 = v.this.Y1();
                kn3.l.p.c cVar = kn3.l.p.c.f111561a;
                this.f111681e = 1;
                if (bVarY1.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.h hVar, kn3.m.DataLoaded dataLoaded, tq.e<? super i0> eVar) {
            return v.this.new r(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkn3/l$q;", "<unused var>", "Lkn3/m$a;", "state", "Loq/i0;", "<anonymous>", "(Lkn3/l$q;Lkn3/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<kn3.l.q, kn3.m.DataLoaded, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f111683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f111684f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f111685g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        
            if (r2.P9(r0, r5) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f111685g
                kn3.m$a r0 = (kn3.m.DataLoaded) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f111684f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r6)
                goto L5a
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                oq.u.b(r6)
                goto L38
            L22:
                oq.u.b(r6)
                kn3.v r6 = kn3.v.this
                cn3.c r6 = kn3.v.y9(r6)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r5.f111685g = r0
                r5.f111684f = r4
                java.lang.Object r6 = r6.a(r2, r5)
                if (r6 != r1) goto L38
                goto L52
            L38:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != r4) goto L53
                kn3.v r2 = kn3.v.this
                java.lang.Object r4 = vq.j.a(r0)
                r5.f111685g = r4
                r5.f111683e = r6
                r5.f111684f = r3
                java.lang.Object r6 = kn3.v.A9(r2, r0, r5)
                if (r6 != r1) goto L5a
            L52:
                return r1
            L53:
                if (r6 != 0) goto L5d
                kn3.v r6 = kn3.v.this
                kn3.v.z9(r6)
            L5a:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            L5d:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kn3.v.s.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.q qVar, kn3.m.DataLoaded dataLoaded, tq.e<? super i0> eVar) {
            s sVar = v.this.new s(eVar);
            sVar.f111685g = dataLoaded;
            return sVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkn3/l$l;", "action", "Lkn3/m$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lkn3/l$l;Lkn3/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<kn3.l.C2699l, kn3.m.DataLoaded, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111687e;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111687e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<kn3.l.p> bVarY1 = v.this.Y1();
                kn3.l.p.e eVar = kn3.l.p.e.f111563a;
                this.f111687e = 1;
                if (bVarY1.F(eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.C2699l c2699l, kn3.m.DataLoaded dataLoaded, tq.e<? super i0> eVar) {
            return v.this.new t(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkn3/l$n;", "<unused var>", "Lkn3/m$a;", "state", "Loq/i0;", "<anonymous>", "(Lkn3/l$n;Lkn3/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<kn3.l.n, kn3.m.DataLoaded, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111689e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111690f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f111691g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f111692h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111693j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f111694k;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
        
            if (r2.F(r5, r11) == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
        
            if (r2.F(r5, r11) == r1) goto L36;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kn3.v.u.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.n nVar, kn3.m.DataLoaded dataLoaded, tq.e<? super i0> eVar) {
            u uVar = v.this.new u(eVar);
            uVar.f111694k = dataLoaded;
            return uVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: kn3.v$v, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkn3/l$i;", "<unused var>", "Lkn3/m$a;", "Loq/i0;", "<anonymous>", "(Lkn3/l$i;Lkn3/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class C2702v extends vq.k implements er.q<kn3.l.i, kn3.m.DataLoaded, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111697f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f111698g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f111699h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111700j;

        C2702v(tq.e<? super C2702v> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            if (r1.F(r4, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
        
            if (r1.F(r4, r7) == r0) goto L25;
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
                int r1 = r7.f111700j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r7.f111697f
                cb4.d r0 = (cb4.DialogData) r0
                goto L22
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r0 = r7.f111697f
                oq.i0 r0 = (oq.i0) r0
            L22:
                java.lang.Object r0 = r7.f111696e
                dx.i r0 = (dx.i) r0
                oq.u.b(r8)
                goto La0
            L2b:
                oq.u.b(r8)
                goto L43
            L2f:
                oq.u.b(r8)
                kn3.v r8 = kn3.v.this
                zm3.a r8 = kn3.v.w9(r8)
                rq0.c r1 = rq0.c.FINES
                r7.f111700j = r4
                java.lang.Object r8 = r8.d(r1, r7)
                if (r8 != r0) goto L43
                goto L9f
            L43:
                dx.i r8 = (dx.i) r8
                kn3.v r1 = kn3.v.this
                boolean r4 = r8 instanceof dx.i.Left
                r5 = 0
                if (r4 == 0) goto L75
                r2 = r8
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                oq.i0 r2 = (oq.i0) r2
                kn3.l$p$f r4 = new kn3.l$p$f
                p62.a$a r6 = p62.a.C3769a.f153207a
                r4.<init>(r6)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f111696e = r8
                java.lang.Object r8 = vq.j.a(r2)
                r7.f111697f = r8
                r7.f111698g = r5
                r7.f111699h = r5
                r7.f111700j = r3
                java.lang.Object r8 = r1.F(r4, r7)
                if (r8 != r0) goto La0
                goto L9f
            L75:
                boolean r3 = r8 instanceof dx.i.Right
                if (r3 == 0) goto La3
                r3 = r8
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                kn3.l$p$i r4 = new kn3.l$p$i
                r4.<init>(r3)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f111696e = r8
                java.lang.Object r8 = vq.j.a(r3)
                r7.f111697f = r8
                r7.f111698g = r5
                r7.f111699h = r5
                r7.f111700j = r2
                java.lang.Object r8 = r1.F(r4, r7)
                if (r8 != r0) goto La0
            L9f:
                return r0
            La0:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            La3:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kn3.v.C2702v.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.i iVar, kn3.m.DataLoaded dataLoaded, tq.e<? super i0> eVar) {
            return v.this.new C2702v(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkn3/l$m;", "<unused var>", "Lkn3/m$a;", "Loq/i0;", "<anonymous>", "(Lkn3/l$m;Lkn3/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<kn3.l.m, kn3.m.DataLoaded, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111703f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f111704g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f111705h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111706j;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            if (r1.F(r4, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
        
            if (r1.F(r4, r7) == r0) goto L25;
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
                int r1 = r7.f111706j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r7.f111703f
                cb4.d r0 = (cb4.DialogData) r0
                goto L22
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r0 = r7.f111703f
                oq.i0 r0 = (oq.i0) r0
            L22:
                java.lang.Object r0 = r7.f111702e
                dx.i r0 = (dx.i) r0
                oq.u.b(r8)
                goto La0
            L2b:
                oq.u.b(r8)
                goto L43
            L2f:
                oq.u.b(r8)
                kn3.v r8 = kn3.v.this
                zm3.a r8 = kn3.v.w9(r8)
                rq0.c r1 = rq0.c.VEHICLE_COLLISION
                r7.f111706j = r4
                java.lang.Object r8 = r8.d(r1, r7)
                if (r8 != r0) goto L43
                goto L9f
            L43:
                dx.i r8 = (dx.i) r8
                kn3.v r1 = kn3.v.this
                boolean r4 = r8 instanceof dx.i.Left
                r5 = 0
                if (r4 == 0) goto L75
                r2 = r8
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                oq.i0 r2 = (oq.i0) r2
                kn3.l$p$f r4 = new kn3.l$p$f
                nd3.a r6 = nd3.a.f134345a
                r4.<init>(r6)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f111702e = r8
                java.lang.Object r8 = vq.j.a(r2)
                r7.f111703f = r8
                r7.f111704g = r5
                r7.f111705h = r5
                r7.f111706j = r3
                java.lang.Object r8 = r1.F(r4, r7)
                if (r8 != r0) goto La0
                goto L9f
            L75:
                boolean r3 = r8 instanceof dx.i.Right
                if (r3 == 0) goto La3
                r3 = r8
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                kn3.l$p$i r4 = new kn3.l$p$i
                r4.<init>(r3)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f111702e = r8
                java.lang.Object r8 = vq.j.a(r3)
                r7.f111703f = r8
                r7.f111704g = r5
                r7.f111705h = r5
                r7.f111706j = r2
                java.lang.Object r8 = r1.F(r4, r7)
                if (r8 != r0) goto La0
            L9f:
                return r0
            La0:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            La3:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kn3.v.w.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kn3.l.m mVar, kn3.m.DataLoaded dataLoaded, tq.e<? super i0> eVar) {
            return v.this.new w(eVar).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class x extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f111710f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f111711g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f111712h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f111713j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f111714k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f111716m;

        x(tq.e<? super x> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111714k = obj;
            this.f111716m |= PKIFailureInfo.systemUnavail;
            return v.this.P9(null, this);
        }
    }

    public v(yy.a aVar, i70.n nVar, nn3.h hVar, nn3.b bVar, cn3.a aVar2, ac4.a aVar3, ez.a aVar4, a14.d dVar, mz3.z zVar, h64.r rVar, zm3.a aVar5, cn3.c cVar, on3.b bVar2) {
        this.f111592b = nVar;
        this.vehicleDetailsMapper = hVar;
        this.vehicleDetailsErrorMapper = bVar;
        this.getVehicleDataByRegistrationNoUseCase = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.currentTimeProvider = aVar4;
        this.copyToClipboardUseCase = dVar;
        this.updateDocumentAsyncUC = zVar;
        this.loadServicesUseCase = rVar;
        this.vehiclesContainersInteractor = aVar5;
        this.isVehicleCardUpdateFeatureFlagActiveUC = cVar;
        this.setupData = bVar2;
        kn3.m.b bVar3 = kn3.m.b.f111579a;
        this.stateMachine = aVar.a(bVar3, new er.l() { // from class: kn3.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.L9(this.f111588a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new d(e9().getState(), this), hVar.b(D9(bVar3)));
    }

    private final mu.g<OffsetDateTime> B9() {
        return mu.i.I(new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nn3.h.Params D9(kn3.m state) {
        return new nn3.h.Params(state, b9(kn3.l.q.f111570a), b9(kn3.l.n.f111557a), b9(kn3.l.m.f111556a), b9(kn3.l.i.f111552a), b9(kn3.l.k.f111554a), b9(kn3.l.b.f111544a), new er.l() { // from class: kn3.o
            @Override // er.l
            public final Object b(Object obj) {
                return v.E9(this.f111582a, (List) obj);
            }
        }, b9(kn3.l.h.f111551a), b9(kn3.l.c.f111545a), b9(kn3.l.d.f111546a), b9(kn3.l.C2699l.f111555a), new er.l() { // from class: kn3.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.F9(this.f111583a, ((Boolean) obj).booleanValue());
            }
        }, b9(kn3.l.g.f111550a), b9(kn3.l.e.f111547a), b9(kn3.l.a.f111543a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(v vVar, List list) {
        vVar.d9(new kn3.l.GoToMoreDialog(list));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(v vVar, boolean z15) {
        vVar.d9(new kn3.l.VehicleDetailsAccordionStateChange(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b G9(nn3.b.AbstractC3391b vehicleDetailsError) {
        return this.vehicleDetailsErrorMapper.b(new nn3.b.Params(vehicleDetailsError, new er.a() { // from class: kn3.t
            @Override // er.a
            public final Object a() {
                return v.H9(this.f111587a);
            }
        }, b9(kn3.l.q.f111570a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(v vVar) {
        vVar.d();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J9() {
        y(new p50.a.DefaultWithIcon(this.vehicleDetailsMapper.S(), false, null, null, 14, null));
    }

    private final void K9(mz3.z.c result) {
        Label labelP;
        if (result instanceof mz3.z.c.a) {
            labelP = this.vehicleDetailsMapper.O();
        } else {
            if (!(result instanceof mz3.z.c.UpdateStarted)) {
                throw new oq.p();
            }
            labelP = this.vehicleDetailsMapper.P();
        }
        y(new p50.a.DefaultWithIcon(labelP, false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(kn3.m.class), new er.l() { // from class: kn3.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.M9(this.f111584a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(kn3.m.b.class), new er.l() { // from class: kn3.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.N9(this.f111585a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(kn3.m.DataLoaded.class), new er.l() { // from class: kn3.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.O9(this.f111586a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(v vVar, k10.z zVar) {
        e eVar = vVar.new e(null);
        zVar.x(q0.c(kn3.l.a.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(v vVar, k10.z zVar) {
        zVar.A(vVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9(v vVar, k10.z zVar) {
        k10.k.m(zVar, vVar.B9(), null, new o(null), 2, null);
        p pVar = vVar.new p(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(kn3.l.LoadVehicleData.class), oVar, pVar);
        zVar.v(q0.c(kn3.l.b.class), oVar, new q(null));
        zVar.x(q0.c(kn3.l.h.class), oVar, vVar.new r(null));
        zVar.x(q0.c(kn3.l.q.class), oVar, vVar.new s(null));
        zVar.x(q0.c(kn3.l.C2699l.class), oVar, vVar.new t(null));
        zVar.x(q0.c(kn3.l.n.class), oVar, vVar.new u(null));
        zVar.x(q0.c(kn3.l.i.class), oVar, vVar.new C2702v(null));
        zVar.x(q0.c(kn3.l.m.class), oVar, vVar.new w(null));
        zVar.x(q0.c(kn3.l.k.class), oVar, vVar.new g(null));
        zVar.x(q0.c(kn3.l.GoToMoreDialog.class), oVar, vVar.new h(null));
        zVar.x(q0.c(kn3.l.CopyToClipboard.class), oVar, vVar.new i(null));
        zVar.v(q0.c(kn3.l.c.class), oVar, new j(null));
        zVar.v(q0.c(kn3.l.d.class), oVar, new k(null));
        zVar.v(q0.c(kn3.l.VehicleDetailsAccordionStateChange.class), oVar, new l(null));
        zVar.x(q0.c(kn3.l.g.class), oVar, vVar.new m(null));
        zVar.x(q0.c(kn3.l.e.class), oVar, vVar.new n(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00df  */
    /* JADX WARN: Code duplicated, block: B:40:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0106, code lost:
    
        if (F(r7, r2) == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013e, code lost:
    
        if (r8.F(r11, r2) == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0196, code lost:
    
        if (r8.F(r9, r2) == r3) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P9(kn3.m.DataLoaded r19, tq.e<? super oq.i0> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kn3.v.P9(kn3.m$a, tq.e):java.lang.Object");
    }

    @Override // i70.n
    public void B0() {
        this.f111592b.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(kn3.l.p pVar, tq.e<? super i0> eVar) {
        return super.F(pVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: I9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(kn3.n.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<kn3.l.p> Y1() {
        return this.navAction;
    }

    @Override // kn3.n
    public void d() {
        d9(kn3.l.a.f111543a);
    }

    @Override // l00.g
    protected k10.t<kn3.m, kn3.l> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<kn3.n.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.f111592b.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.f111592b.y(snackBarData);
    }
}
