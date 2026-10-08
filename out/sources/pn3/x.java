package pn3;

import bn3.VehicleDocumentData;
import bn3.VehicleDocumentsFullData;
import fr.q0;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00042\u00020\u0006BQ\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u001a2\b\u0010'\u001a\u0004\u0018\u00010&H\u0082@¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b3\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00108R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR,\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030C8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u0010\u001c\u001a\u0004\bF\u0010GR \u0010P\u001a\b\u0012\u0004\u0012\u00020K0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR&\u0010\"\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bW\u0010\u001c\u001a\u0004\bU\u0010VR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010Z¨\u0006\\"}, d2 = {"Lpn3/x;", "Ll00/g;", "Lpn3/o;", "Lpn3/n;", "", "Lpn3/p;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lrn3/d;", "vehiclesListMapper", "Lib4/c;", "errorMapper", "Lzm3/a;", "vehiclesContainersInteractor", "Lac4/a;", "callActionWithLoaderUseCase", "snackBarManagerStateHolder", "Lmz3/z;", "updateDocumentAsyncUC", "Lmz3/w;", "shouldDisplayDownloadLoaderUC", "Lcn3/c;", "isVehicleCardUpdateFeatureFlagActiveUC", "<init>", "(Lyy/a;Lrn3/d;Lib4/c;Lzm3/a;Lac4/a;Li70/n;Lmz3/z;Lmz3/w;Lcn3/c;)V", "Loq/i0;", "d", "()V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "state", "Lrn3/d$a;", "y9", "(Lpn3/o;)Lrn3/d$a;", "", "parentId", "K9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lmz3/z$c;", "result", "F9", "(Lmz3/z$c;)V", "Ldx/b;", "domainError", "Ljb4/b;", "A9", "(Ldx/b;)Ljb4/b;", "C9", "b", "Lrn3/d;", "c", "Lib4/c;", "Lzm3/a;", "e", "Lac4/a;", "f", "Li70/n;", "g", "Lmz3/z;", "h", "Lmz3/w;", "j", "Lcn3/c;", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Lpn3/n$f;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lpn3/p$a;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<o, n> implements p, zx.b, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rn3.d vehiclesListMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zm3.a vehiclesContainersInteractor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mz3.w shouldDisplayDownloadLoaderUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final cn3.c isVehicleCardUpdateFeatureFlagActiveUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<o, n> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<n.f> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<p.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<p.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f161305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f161306b;

        /* JADX INFO: renamed from: pn3.x$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3969a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f161307a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f161308b;

            /* JADX INFO: renamed from: pn3.x$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3970a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f161309d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f161310e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f161311f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f161313h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f161314j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f161315k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f161316l;

                public C3970a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f161309d = obj;
                    this.f161310e |= PKIFailureInfo.systemUnavail;
                    return C3969a.this.F(null, this);
                }
            }

            public C3969a(mu.h hVar, x xVar) {
                this.f161307a = hVar;
                this.f161308b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3970a c3970a;
                if (eVar instanceof C3970a) {
                    c3970a = (C3970a) eVar;
                    int i15 = c3970a.f161310e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3970a.f161310e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3970a = new C3970a(eVar);
                    }
                } else {
                    c3970a = new C3970a(eVar);
                }
                Object obj2 = c3970a.f161309d;
                Object objE = uq.b.e();
                int i16 = c3970a.f161310e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f161307a;
                    p.a aVarB = this.f161308b.vehiclesListMapper.b(this.f161308b.y9((o) obj));
                    c3970a.f161311f = vq.j.a(obj);
                    c3970a.f161313h = vq.j.a(c3970a);
                    c3970a.f161314j = vq.j.a(obj);
                    c3970a.f161315k = vq.j.a(hVar);
                    c3970a.f161316l = 0;
                    c3970a.f161310e = 1;
                    if (hVar.F(aVarB, c3970a) == objE) {
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

        public a(mu.g gVar, x xVar) {
            this.f161305a = gVar;
            this.f161306b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super p.a> hVar, tq.e eVar) {
            Object objA = this.f161305a.a(new C3969a(hVar, this.f161306b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lpn3/o$c;", "state", "Lk10/l;", "Lpn3/o;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<k10.c0<o.c>, tq.e<? super k10.l<? extends o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161318f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        
            if (r7.F(r2, r6) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f161318f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f161317e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r7)
                goto L69
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto L41
            L22:
                oq.u.b(r7)
                pn3.x r7 = pn3.x.this
                mz3.w r7 = pn3.x.r9(r7)
                mz3.w$a r2 = new mz3.w$a
                tn3.f r5 = tn3.f.f191166a
                rq0.b$d r5 = r5.a()
                r2.<init>(r5)
                r6.f161318f = r0
                r6.f161317e = r4
                java.lang.Object r7 = r7.c(r2, r6)
                if (r7 != r1) goto L41
                goto L59
            L41:
                mz3.w$b r7 = (mz3.w.b) r7
                boolean r2 = r7 instanceof mz3.w.b.NotReady
                if (r2 == 0) goto L5a
                pn3.x r7 = pn3.x.this
                xw.b r7 = r7.Y1()
                pn3.n$f$e r2 = pn3.n.f.e.f161268a
                r6.f161318f = r0
                r6.f161317e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L69
            L59:
                return r1
            L5a:
                mz3.w$b$b r1 = mz3.w.b.C3231b.f129717a
                boolean r7 = fr.t.c(r7, r1)
                if (r7 == 0) goto L6e
                pn3.x r7 = pn3.x.this
                pn3.n$e r1 = pn3.n.e.f161263a
                pn3.x.o9(r7, r1)
            L69:
                k10.l r7 = r0.c()
                return r7
            L6e:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: pn3.x.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<o.c> c0Var, tq.e<? super k10.l<? extends o>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = x.this.new b(eVar);
            bVar.f161318f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpn3/n$a;", "<unused var>", "Lpn3/o;", "Loq/i0;", "<anonymous>", "(Lpn3/n$a;Lpn3/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<n.a, o, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161320e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f161320e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<n.f> bVarY1 = x.this.Y1();
                n.f.a aVar = n.f.a.f161264a;
                this.f161320e = 1;
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
        public final Object w(n.a aVar, o oVar, tq.e<? super i0> eVar) {
            return x.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpn3/n$g;", "<unused var>", "Lpn3/o;", "Loq/i0;", "<anonymous>", "(Lpn3/n$g;Lpn3/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<n.g, o, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f161322e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f161323f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f161324g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f161325h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f161326j;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
        
            if (r4.F(r6, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
        
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
                int r1 = r7.f161326j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r7.f161323f
                cb4.d r0 = (cb4.DialogData) r0
                goto L22
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r0 = r7.f161323f
                dx.b r0 = (dx.b) r0
            L22:
                java.lang.Object r0 = r7.f161322e
                dx.i r0 = (dx.i) r0
                oq.u.b(r8)
                goto Lb0
            L2b:
                oq.u.b(r8)
                goto L49
            L2f:
                oq.u.b(r8)
                pn3.x r8 = pn3.x.this
                zm3.a r8 = pn3.x.s9(r8)
                pn3.x r1 = pn3.x.this
                pn3.n$b r5 = pn3.n.b.f161260a
                er.a r1 = pn3.x.n9(r1, r5)
                r7.f161326j = r4
                java.lang.Object r8 = r8.c(r1, r7)
                if (r8 != r0) goto L49
                goto Laf
            L49:
                dx.i r8 = (dx.i) r8
                pn3.x r1 = pn3.x.this
                boolean r4 = r8 instanceof dx.i.Left
                r5 = 0
                if (r4 == 0) goto L81
                r2 = r8
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                dx.b r2 = (dx.b) r2
                xw.b r4 = r1.Y1()
                pn3.n$f$b r6 = new pn3.n$f$b
                jb4.b r1 = pn3.x.u9(r1, r2)
                r6.<init>(r1)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f161322e = r8
                java.lang.Object r8 = vq.j.a(r2)
                r7.f161323f = r8
                r7.f161324g = r5
                r7.f161325h = r5
                r7.f161326j = r3
                java.lang.Object r8 = r4.F(r6, r7)
                if (r8 != r0) goto Lb0
                goto Laf
            L81:
                boolean r3 = r8 instanceof dx.i.Right
                if (r3 == 0) goto Lb3
                r3 = r8
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                xw.b r1 = r1.Y1()
                pn3.n$f$f r4 = new pn3.n$f$f
                r4.<init>(r3)
                java.lang.Object r8 = vq.j.a(r8)
                r7.f161322e = r8
                java.lang.Object r8 = vq.j.a(r3)
                r7.f161323f = r8
                r7.f161324g = r5
                r7.f161325h = r5
                r7.f161326j = r2
                java.lang.Object r8 = r1.F(r4, r7)
                if (r8 != r0) goto Lb0
            Laf:
                return r0
            Lb0:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            Lb3:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: pn3.x.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n.g gVar, o oVar, tq.e<? super i0> eVar) {
            return x.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpn3/n$c;", "<unused var>", "Lpn3/o;", "Loq/i0;", "<anonymous>", "(Lpn3/n$c;Lpn3/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<n.c, o, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161328e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f161328e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<n.f> bVarY1 = x.this.Y1();
                n.f.c cVar = n.f.c.f161266a;
                this.f161328e = 1;
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
        public final Object w(n.c cVar, o oVar, tq.e<? super i0> eVar) {
            return x.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpn3/n$b;", "<unused var>", "Lpn3/o;", "Loq/i0;", "<anonymous>", "(Lpn3/n$b;Lpn3/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<n.b, o, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161330e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f161332e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ x f161333f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f161333f = xVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
            
                if (r5.F(r1, r4) == r0) goto L15;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
                /*
                    r4 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r4.f161332e
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    oq.u.b(r5)
                    goto L41
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1a:
                    oq.u.b(r5)
                    goto L30
                L1e:
                    oq.u.b(r5)
                    pn3.x r5 = r4.f161333f
                    zm3.a r5 = pn3.x.s9(r5)
                    r4.f161332e = r3
                    java.lang.Object r5 = r5.b(r4)
                    if (r5 != r0) goto L30
                    goto L40
                L30:
                    pn3.x r5 = r4.f161333f
                    xw.b r5 = r5.Y1()
                    pn3.n$f$a r1 = pn3.n.f.a.f161264a
                    r4.f161332e = r2
                    java.lang.Object r5 = r5.F(r1, r4)
                    if (r5 != r0) goto L41
                L40:
                    return r0
                L41:
                    oq.i0 r5 = oq.i0.f148189a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pn3.x.f.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f161333f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f161330e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = x.this.callActionWithLoaderUseCase;
                a aVar2 = new a(x.this, null);
                this.f161330e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(n.b bVar, o oVar, tq.e<? super i0> eVar) {
            return x.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpn3/n$h;", "<unused var>", "Lpn3/o;", "state", "Loq/i0;", "<anonymous>", "(Lpn3/n$h;Lpn3/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<n.h, o, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161334e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161335f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        
            if (r8.K9(r4, r7) == r1) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f161335f
                pn3.o r0 = (pn3.o) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f161334e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r8)
                goto L83
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                oq.u.b(r8)
                goto L38
            L22:
                oq.u.b(r8)
                pn3.x r8 = pn3.x.this
                cn3.c r8 = pn3.x.v9(r8)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r7.f161335f = r0
                r7.f161334e = r4
                java.lang.Object r8 = r8.a(r2, r7)
                if (r8 != r1) goto L38
                goto L66
            L38:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != r4) goto L67
                pn3.x r8 = pn3.x.this
                boolean r2 = r0 instanceof pn3.o.DataLoaded
                r4 = 0
                if (r2 == 0) goto L4b
                r2 = r0
                pn3.o$a r2 = (pn3.o.DataLoaded) r2
                goto L4c
            L4b:
                r2 = r4
            L4c:
                if (r2 == 0) goto L58
                bn3.j r2 = r2.getVehicles()
                if (r2 == 0) goto L58
                java.lang.String r4 = r2.getParentId()
            L58:
                java.lang.Object r0 = vq.j.a(r0)
                r7.f161335f = r0
                r7.f161334e = r3
                java.lang.Object r8 = pn3.x.w9(r8, r4, r7)
                if (r8 != r1) goto L83
            L66:
                return r1
            L67:
                if (r8 != 0) goto L86
                pn3.x r8 = pn3.x.this
                p50.a$b r0 = new p50.a$b
                pn3.x r1 = pn3.x.this
                rn3.d r1 = pn3.x.t9(r1)
                mx.a r1 = r1.q()
                r5 = 14
                r6 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r8.y(r0)
            L83:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            L86:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: pn3.x.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(n.h hVar, o oVar, tq.e<? super i0> eVar) {
            g gVar = x.this.new g(eVar);
            gVar.f161335f = oVar;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpn3/n$e;", "<unused var>", "Lk10/c0;", "Lpn3/o;", "state", "Lk10/l;", "<anonymous>", "(Lpn3/n$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<n.e, k10.c0<o>, tq.e<? super k10.l<? extends o>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f161337e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f161338f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f161339g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f161340h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f161341j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f161342k;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o.Empty V(String str, o oVar) {
            return new o.Empty(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o.DataLoaded X(VehicleDocumentsFullData vehicleDocumentsFullData, String str, o oVar) {
            return new o.DataLoaded(vehicleDocumentsFullData, str);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
        
            if (r5.F(r7, r8) == r1) goto L26;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pn3.x.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(n.e eVar, k10.c0<o> c0Var, tq.e<? super k10.l<? extends o>> eVar2) {
            h hVar = x.this.new h(eVar2);
            hVar.f161342k = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpn3/n$d;", "action", "Lpn3/o$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpn3/n$d;Lpn3/o$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<n.GoToVehicleDetails, o.DataLoaded, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161345f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n.GoToVehicleDetails goToVehicleDetails = (n.GoToVehicleDetails) this.f161345f;
            Object objE = uq.b.e();
            int i15 = this.f161344e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<n.f> bVarY1 = x.this.Y1();
                n.f.GoToVehicleDetails goToVehicleDetails2 = new n.f.GoToVehicleDetails(goToVehicleDetails.getVehicleDocumentData());
                this.f161345f = vq.j.a(goToVehicleDetails);
                this.f161344e = 1;
                if (bVarY1.F(goToVehicleDetails2, this) == objE) {
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
        public final Object w(n.GoToVehicleDetails goToVehicleDetails, o.DataLoaded dataLoaded, tq.e<? super i0> eVar) {
            i iVar = x.this.new i(eVar);
            iVar.f161345f = goToVehicleDetails;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f161347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f161348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f161349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f161350g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f161351h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f161352j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f161353k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f161355m;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f161353k = obj;
            this.f161355m |= PKIFailureInfo.systemUnavail;
            return x.this.K9(null, this);
        }
    }

    public x(yy.a aVar, rn3.d dVar, ib4.c cVar, zm3.a aVar2, ac4.a aVar3, i70.n nVar, mz3.z zVar, mz3.w wVar, cn3.c cVar2) {
        this.vehiclesListMapper = dVar;
        this.errorMapper = cVar;
        this.vehiclesContainersInteractor = aVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.snackBarManagerStateHolder = nVar;
        this.updateDocumentAsyncUC = zVar;
        this.shouldDisplayDownloadLoaderUC = wVar;
        this.isVehicleCardUpdateFeatureFlagActiveUC = cVar2;
        o.c cVar3 = o.c.f161275a;
        this.stateMachine = aVar.a(cVar3, new er.l() { // from class: pn3.q
            @Override // er.l
            public final Object b(Object obj) {
                return x.G9(this.f161287a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), dVar.b(y9(cVar3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b A9(dx.b domainError) {
        return this.errorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: pn3.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.B9(this.f161293a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(x xVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.a.Primary) {
            xVar.d9(n.b.f161260a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
                throw new oq.p();
            }
            xVar.d9(n.a.f161259a);
        }
        return i0.f148189a;
    }

    private final jb4.b C9(dx.b domainError) {
        return this.errorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: pn3.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.D9(this.f161292a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(x xVar, ib4.c.b bVar) {
        if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            xVar.d9(n.h.f161271a);
        }
        return i0.f148189a;
    }

    private final void F9(mz3.z.c result) {
        Label labelI;
        if (result instanceof mz3.z.c.a) {
            labelI = this.vehiclesListMapper.h();
        } else {
            if (!(result instanceof mz3.z.c.UpdateStarted)) {
                throw new oq.p();
            }
            labelI = this.vehiclesListMapper.i();
        }
        y(new p50.a.DefaultWithIcon(labelI, false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(final x xVar, k10.v vVar) {
        vVar.c(q0.c(o.c.class), new er.l() { // from class: pn3.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.H9(this.f161288a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o.class), new er.l() { // from class: pn3.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.I9(this.f161289a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(o.DataLoaded.class), new er.l() { // from class: pn3.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.J9(this.f161290a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(x xVar, k10.z zVar) {
        zVar.A(xVar.new b(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(x xVar, k10.z zVar) {
        c cVar = xVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(n.a.class), oVar, cVar);
        zVar.x(q0.c(n.g.class), oVar, xVar.new d(null));
        zVar.x(q0.c(n.c.class), oVar, xVar.new e(null));
        zVar.x(q0.c(n.b.class), oVar, xVar.new f(null));
        zVar.x(q0.c(n.h.class), oVar, xVar.new g(null));
        zVar.v(q0.c(n.e.class), oVar, xVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(x xVar, k10.z zVar) {
        i iVar = xVar.new i(null);
        zVar.x(q0.c(n.GoToVehicleDetails.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fd, code lost:
    
        if (F(r6, r2) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012f, code lost:
    
        if (r7.F(r11, r2) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016d, code lost:
    
        if (r6.F(r7, r2) == r3) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K9(java.lang.String r18, tq.e<? super oq.i0> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn3.x.K9(java.lang.String, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rn3.d.Params y9(o state) {
        er.a<i0> aVarB9 = b9(n.h.f161271a);
        return new rn3.d.Params(state, new er.l() { // from class: pn3.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.z9(this.f161291a, (VehicleDocumentData) obj);
            }
        }, b9(n.a.f161259a), aVarB9, b9(n.g.f161270a), b9(n.c.f161261a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(x xVar, VehicleDocumentData vehicleDocumentData) {
        xVar.d9(new n.GoToVehicleDetails(vehicleDocumentData));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(p.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<n.f> Y1() {
        return this.navAction;
    }

    @Override // pn3.p
    public void d() {
        d9(n.a.f161259a);
    }

    @Override // l00.g
    protected k10.t<o, n> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<p.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(n.f fVar, tq.e<? super i0> eVar) {
        return super.F(fVar, eVar);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
