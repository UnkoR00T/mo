package ze3;

import df3.VehicleDetailsData;
import fr.q0;
import java.util.List;
import ki3.ShowLocalizationModel;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import se3.InsuranceDetailsData;
import sv0.PdfFile;
import sv0.s0;
import ve3.PersonalDetailsData;
import ye3.PhotosDetailsSetupData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bk\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020&*\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020#2\u0006\u0010)\u001a\u00020\u001cH\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR&\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030F8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR \u0010R\u001a\b\u0012\u0004\u0012\u00020M0L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR \u0010X\u001a\b\u0012\u0004\u0012\u00020&0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lze3/z;", "Ll00/g;", "Lze3/c;", "Lze3/a;", "Lze3/d;", "", "Lyy/a;", "stateMachineFactory", "Lac4/a;", "callActionWithLoaderUseCase", "Law0/r;", "getCollisionStatementUC", "Law0/e;", "bEGetReportedToUfgCollisionDetails", "Law0/g;", "beGetUfgFormReportDetailsUC", "Laf3/l;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Lae3/q;", "requestStoragePermissionUC", "La14/w;", "openUrlIntentUseCase", "La14/g;", "dialIntentUseCase", "Lae3/n;", "regenerateStatementUC", "Lze3/b;", "setupData", "<init>", "(Lyy/a;Lac4/a;Law0/r;Law0/e;Law0/g;Laf3/l;Lib4/c;Lae3/q;La14/w;La14/g;Lae3/n;Lze3/b;)V", "Ldx/b;", "domainError", "retryAction", "Loq/i0;", "E9", "(Ldx/b;Lze3/a;)V", "Lze3/d$a;", "F9", "(Lze3/c;)Lze3/d$a;", "data", "M9", "(Lze3/b;)V", "b", "Lac4/a;", "c", "Law0/r;", "d", "Law0/e;", "e", "Law0/g;", "f", "Laf3/l;", "g", "Lib4/c;", "h", "Lae3/q;", "j", "La14/w;", "k", "La14/g;", "l", "Lae3/n;", "m", "Lze3/b;", "Lze3/c$b;", "n", "Lze3/c$b;", "initialState", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lze3/a$i;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "r", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<ze3.c, ze3.a> implements ze3.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final aw0.r getCollisionStatementUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final aw0.e bEGetReportedToUfgCollisionDetails;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final aw0.g beGetUfgFormReportDetailsUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final af3.l mapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ae3.q requestStoragePermissionUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a14.g dialIntentUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ae3.n regenerateStatementUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ze3.c.b initialState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ze3.c, ze3.a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ze3.a.i> navAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p0<ze3.d.a> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234885e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ dx.b f234887g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ze3.a f234888h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dx.b bVar, ze3.a aVar, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f234887g = bVar;
            this.f234888h = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(z zVar, ze3.a aVar, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar instanceof ib4.c.b.a.Primary)) {
                zVar.d9(aVar);
            } else {
                if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.a.Close)) {
                    throw new oq.p();
                }
                zVar.d9(ze3.a.C6326a.f234784a);
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f234885e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ze3.a.i> bVarY1 = z.this.Y1();
                ib4.c cVar = z.this.genericDomainErrorMapper;
                dx.b bVar = this.f234887g;
                final z zVar = z.this;
                final ze3.a aVar = this.f234888h;
                ze3.a.i.ShowError showError = new ze3.a.i.ShowError(cVar.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ze3.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.a.V(zVar, aVar, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f234885e = 1;
                if (bVarY1.F(showError, this) == objE) {
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

        public final tq.e<i0> N(tq.e<?> eVar) {
            return z.this.new a(this.f234887g, this.f234888h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ze3.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f234889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f234890b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f234891a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f234892b;

            /* JADX INFO: renamed from: ze3.z$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6330a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f234893d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f234894e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f234895f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f234897h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f234898j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f234899k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f234900l;

                public C6330a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f234893d = obj;
                    this.f234894e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, z zVar) {
                this.f234891a = hVar;
                this.f234892b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6330a c6330a;
                if (eVar instanceof C6330a) {
                    c6330a = (C6330a) eVar;
                    int i15 = c6330a.f234894e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6330a.f234894e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6330a = new C6330a(eVar);
                    }
                } else {
                    c6330a = new C6330a(eVar);
                }
                Object obj2 = c6330a.f234893d;
                Object objE = uq.b.e();
                int i16 = c6330a.f234894e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f234891a;
                    ze3.d.a aVarF9 = this.f234892b.F9((ze3.c) obj);
                    c6330a.f234895f = vq.j.a(obj);
                    c6330a.f234897h = vq.j.a(c6330a);
                    c6330a.f234898j = vq.j.a(obj);
                    c6330a.f234899k = vq.j.a(hVar);
                    c6330a.f234900l = 0;
                    c6330a.f234894e = 1;
                    if (hVar.F(aVarF9, c6330a) == objE) {
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

        public b(mu.g gVar, z zVar) {
            this.f234889a = gVar;
            this.f234890b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ze3.d.a> hVar, tq.e eVar) {
            Object objA = this.f234889a.a(new a(hVar, this.f234890b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lze3/a$a;", "<unused var>", "Lze3/c;", "Loq/i0;", "<anonymous>", "(Lze3/a$a;Lze3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ze3.a.C6326a, ze3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234901e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f234901e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                ze3.a.i.C6327a c6327a = ze3.a.i.C6327a.f234794a;
                this.f234901e = 1;
                if (zVar.F(c6327a, this) == objE) {
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
        public final Object w(ze3.a.C6326a c6326a, ze3.c cVar, tq.e<? super i0> eVar) {
            return z.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lze3/c$b;", "it", "Loq/i0;", "<anonymous>", "(Lze3/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<ze3.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234903e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f234903e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(ze3.a.c.f234787a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ze3.c.b bVar, tq.e<? super i0> eVar) {
            return ((d) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return z.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lze3/a$c;", "action", "Lk10/c0;", "Lze3/c$b;", "state", "Lk10/l;", "Lze3/c;", "<anonymous>", "(Lze3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ze3.a.c, k10.c0<ze3.c.b>, tq.e<? super k10.l<? extends ze3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234905e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234906f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f234907g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lze3/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ze3.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f234909e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ z f234910f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ze3.a.c f234911g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<ze3.c.b> f234912h;

            /* JADX INFO: renamed from: ze3.z$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C6331a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f234913a;

                static {
                    int[] iArr = new int[s0.values().length];
                    try {
                        iArr[s0.ReportedToUfg.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[s0.ReportedToUfgToFillForm.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[s0.ReportedToUfgFormFilled.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[s0.StatementCreatingError.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f234913a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, ze3.a.c cVar, k10.c0<ze3.c.b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f234910f = zVar;
                this.f234911g = cVar;
                this.f234912h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ze3.c.Initialized V(sv0.c0.b bVar, ze3.c.b bVar2) {
                return new ze3.c.Initialized(bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
            
                if (r6 == r0) goto L28;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
            
                if (r6 == r0) goto L28;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
            
                if (r6 == r0) goto L28;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 220
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ze3.z.e.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f234910f, this.f234911g, this.f234912h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ze3.c>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ze3.a.c cVar = (ze3.a.c) this.f234906f;
            k10.c0 c0Var = (k10.c0) this.f234907g;
            Object objE = uq.b.e();
            int i15 = this.f234905e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = z.this.callActionWithLoaderUseCase;
            a aVar2 = new a(z.this, cVar, c0Var, null);
            this.f234906f = vq.j.a(cVar);
            this.f234907g = vq.j.a(c0Var);
            this.f234905e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ze3.a.c cVar, k10.c0<ze3.c.b> c0Var, tq.e<? super k10.l<? extends ze3.c>> eVar) {
            e eVar2 = z.this.new e(eVar);
            eVar2.f234906f = cVar;
            eVar2.f234907g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lze3/a$k;", "action", "Lze3/c$a;", "state", "Loq/i0;", "<anonymous>", "(Lze3/a$k;Lze3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ze3.a.k, ze3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234915f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ze3.c.Initialized initialized = (ze3.c.Initialized) this.f234915f;
            uq.b.e();
            if (this.f234914e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            boolean regenerateStatement = initialized.getStatementDetails() instanceof sv0.c0.b.Finished ? ((sv0.c0.b.Finished) initialized.getStatementDetails()).getRegenerateStatement() : false;
            PdfFile pdfsFile = initialized.getStatementDetails().getPdfsFile();
            if (regenerateStatement || pdfsFile == null) {
                z.this.d9(ze3.a.o.f234811a);
            } else {
                z.this.d9(new ze3.a.DownloadPdf(pdfsFile, initialized.getStatementDetails().getStatementNumber()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ze3.a.k kVar, ze3.c.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = z.this.new f(eVar);
            fVar.f234915f = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lze3/a$o;", "action", "Lze3/c$a;", "state", "Loq/i0;", "<anonymous>", "(Lze3/a$o;Lze3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ze3.a.o, ze3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234918f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ze3.c.Initialized initialized = (ze3.c.Initialized) this.f234918f;
            Object objE = uq.b.e();
            int i15 = this.f234917e;
            if (i15 == 0) {
                oq.u.b(obj);
                ae3.n nVar = z.this.regenerateStatementUC;
                ae3.n.Params params = new ae3.n.Params(initialized.getStatementDetails().getProcessId());
                this.f234918f = vq.j.a(initialized);
                this.f234917e = 1;
                obj = nVar.d(params, this);
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
            z zVar = z.this;
            if (iVar instanceof dx.i.Right) {
                sv0.c0.b.RegeneratedStatement regeneratedStatement = (sv0.c0.b.RegeneratedStatement) ((dx.i.Right) iVar).b();
                zVar.d9(new ze3.a.Update(regeneratedStatement));
                zVar.d9(new ze3.a.DownloadPdf(regeneratedStatement.getPdfsFile(), regeneratedStatement.getStatementNumber()));
            }
            z zVar2 = z.this;
            if (iVar instanceof dx.i.Left) {
                zVar2.E9((dx.b) ((dx.i.Left) iVar).b(), ze3.a.o.f234811a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ze3.a.o oVar, ze3.c.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = z.this.new g(eVar);
            gVar.f234918f = initialized;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lze3/a$m;", "action", "Lze3/c$a;", "state", "Loq/i0;", "<anonymous>", "(Lze3/a$m;Lze3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ze3.a.OnPhotosClicked, ze3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f234922g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ze3.a.OnPhotosClicked onPhotosClicked = (ze3.a.OnPhotosClicked) this.f234921f;
            ze3.c.Initialized initialized = (ze3.c.Initialized) this.f234922g;
            Object objE = uq.b.e();
            int i15 = this.f234920e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ze3.a.i> bVarY1 = z.this.Y1();
                ze3.a.i.GoToPhotosDetails goToPhotosDetails = new ze3.a.i.GoToPhotosDetails(new PhotosDetailsSetupData(initialized.getStatementDetails().getProcessId(), initialized.getStatementDetails().getImageConfiguration(), onPhotosClicked.a(), new PhotosDetailsSetupData.a.StatementDetails(z.this.setupData.getStatus())));
                this.f234921f = vq.j.a(onPhotosClicked);
                this.f234922g = vq.j.a(initialized);
                this.f234920e = 1;
                if (bVarY1.F(goToPhotosDetails, this) == objE) {
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
        public final Object w(ze3.a.OnPhotosClicked onPhotosClicked, ze3.c.Initialized initialized, tq.e<? super i0> eVar) {
            h hVar = z.this.new h(eVar);
            hVar.f234921f = onPhotosClicked;
            hVar.f234922g = initialized;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lze3/a$g;", "<unused var>", "Lze3/c$a;", "state", "Loq/i0;", "<anonymous>", "(Lze3/a$g;Lze3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ze3.a.g, ze3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234925f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f234927a;

            static {
                int[] iArr = new int[sv0.l.values().length];
                try {
                    iArr[sv0.l.PERPETRATOR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[sv0.l.VICTIM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f234927a = iArr;
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ze3.c.Initialized initialized = (ze3.c.Initialized) this.f234925f;
            Object objE = uq.b.e();
            int i15 = this.f234924e;
            if (i15 == 0) {
                oq.u.b(obj);
                int i16 = a.f234927a[initialized.getStatementDetails().getCollisionRole().ordinal()];
                if (i16 == 1) {
                    px.f.e(px.f.f163100a, "Can't GoToReport as perpetrator", null, px.c.a(z.this), 2, null);
                } else {
                    if (i16 != 2) {
                        throw new oq.p();
                    }
                    z zVar = z.this;
                    ze3.a.i.GoToAutomaticReport goToAutomaticReport = new ze3.a.i.GoToAutomaticReport(initialized.getStatementDetails().getProcessId(), z.this.setupData.getStatus());
                    this.f234925f = vq.j.a(initialized);
                    this.f234924e = 1;
                    if (zVar.F(goToAutomaticReport, this) == objE) {
                        return objE;
                    }
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
        public final Object w(ze3.a.g gVar, ze3.c.Initialized initialized, tq.e<? super i0> eVar) {
            i iVar = z.this.new i(eVar);
            iVar.f234925f = initialized;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lze3/a$n;", "<unused var>", "Lk10/c0;", "Lze3/c$a;", "state", "Lk10/l;", "Lze3/c;", "<anonymous>", "(Lze3/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ze3.a.n, k10.c0<ze3.c.Initialized>, tq.e<? super k10.l<? extends ze3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234929f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ze3.c.b O(ze3.c.Initialized initialized) {
            return ze3.c.b.f234818a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f234929f;
            uq.b.e();
            if (this.f234928e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ze3.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.j.O((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ze3.a.n nVar, k10.c0<ze3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ze3.c>> eVar) {
            j jVar = new j(eVar);
            jVar.f234929f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lze3/a$d;", "action", "Lze3/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lze3/a$d;Lze3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ze3.a.GoToInsuranceDetails, ze3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234931f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ze3.a.GoToInsuranceDetails goToInsuranceDetails = (ze3.a.GoToInsuranceDetails) this.f234931f;
            Object objE = uq.b.e();
            int i15 = this.f234930e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                ze3.a.i.GoToInsuranceDetails goToInsuranceDetails2 = new ze3.a.i.GoToInsuranceDetails(goToInsuranceDetails.getInsuranceDetailsData());
                this.f234931f = vq.j.a(goToInsuranceDetails);
                this.f234930e = 1;
                if (zVar.F(goToInsuranceDetails2, this) == objE) {
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
        public final Object w(ze3.a.GoToInsuranceDetails goToInsuranceDetails, ze3.c.Initialized initialized, tq.e<? super i0> eVar) {
            k kVar = z.this.new k(eVar);
            kVar.f234931f = goToInsuranceDetails;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lze3/a$j;", "action", "Lze3/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lze3/a$j;Lze3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ze3.a.OnCall, ze3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234933e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234934f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ze3.a.OnCall onCall = (ze3.a.OnCall) this.f234934f;
            Object objE = uq.b.e();
            int i15 = this.f234933e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.g gVar = z.this.dialIntentUseCase;
                a14.g.Params params = new a14.g.Params(onCall.getNumber());
                this.f234934f = vq.j.a(onCall);
                this.f234933e = 1;
                if (gVar.c(params, this) == objE) {
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
        public final Object w(ze3.a.OnCall onCall, ze3.c.Initialized initialized, tq.e<? super i0> eVar) {
            l lVar = z.this.new l(eVar);
            lVar.f234934f = onCall;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lze3/a$l;", "action", "Lze3/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lze3/a$l;Lze3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ze3.a.l, ze3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f234936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f234937f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f234938g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f234939h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f234940j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f234941k;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
        
            if (r2.c(r5, r9) == r1) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f234941k
                ze3.a$l r0 = (ze3.a.l) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r9.f234940j
                r3 = 1
                r4 = 2
                if (r2 == 0) goto L2b
                if (r2 == r3) goto L27
                if (r2 != r4) goto L1f
                java.lang.Object r0 = r9.f234937f
                sv0.l0 r0 = (sv0.UfgFormReportDetails) r0
                java.lang.Object r0 = r9.f234936e
                dx.i r0 = (dx.i) r0
                oq.u.b(r10)
                goto L9d
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                oq.u.b(r10)
                goto L4e
            L2b:
                oq.u.b(r10)
                ze3.z r10 = ze3.z.this
                aw0.g r10 = ze3.z.s9(r10)
                aw0.g$a r2 = new aw0.g$a
                ze3.z r5 = ze3.z.this
                ze3.b r5 = ze3.z.A9(r5)
                sv0.y r5 = r5.getProcessId()
                r2.<init>(r5)
                r9.f234941k = r0
                r9.f234940j = r3
                java.lang.Object r10 = r10.c(r2, r9)
                if (r10 != r1) goto L4e
                goto L9c
            L4e:
                dx.i r10 = (dx.i) r10
                ze3.z r2 = ze3.z.this
                boolean r3 = r10 instanceof dx.i.Left
                if (r3 == 0) goto L62
                dx.i$b r10 = (dx.i.Left) r10
                java.lang.Object r10 = r10.b()
                dx.b r10 = (dx.b) r10
                ze3.z.B9(r2, r10, r0)
                goto L9d
            L62:
                boolean r3 = r10 instanceof dx.i.Right
                if (r3 == 0) goto La0
                r3 = r10
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                sv0.l0 r3 = (sv0.UfgFormReportDetails) r3
                a14.w r2 = ze3.z.x9(r2)
                a14.w$b r5 = new a14.w$b
                java.lang.String r6 = r3.getFillFormClaimUrl()
                r7 = 0
                r8 = 0
                r5.<init>(r6, r8, r4, r7)
                java.lang.Object r0 = vq.j.a(r0)
                r9.f234941k = r0
                java.lang.Object r10 = vq.j.a(r10)
                r9.f234936e = r10
                java.lang.Object r10 = vq.j.a(r3)
                r9.f234937f = r10
                r9.f234938g = r8
                r9.f234939h = r8
                r9.f234940j = r4
                java.lang.Object r10 = r2.c(r5, r9)
                if (r10 != r1) goto L9d
            L9c:
                return r1
            L9d:
                oq.i0 r10 = oq.i0.f148189a
                return r10
            La0:
                oq.p r10 = new oq.p
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ze3.z.m.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ze3.a.l lVar, ze3.c.Initialized initialized, tq.e<? super i0> eVar) {
            m mVar = z.this.new m(eVar);
            mVar.f234941k = lVar;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lze3/a$h;", "action", "Lze3/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lze3/a$h;Lze3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<ze3.a.GoToVehicleDetails, ze3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234943e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234944f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ze3.a.GoToVehicleDetails goToVehicleDetails = (ze3.a.GoToVehicleDetails) this.f234944f;
            Object objE = uq.b.e();
            int i15 = this.f234943e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                ze3.a.i.GoToVehicleDetails goToVehicleDetails2 = new ze3.a.i.GoToVehicleDetails(goToVehicleDetails.getVehicleDetailsData());
                this.f234944f = vq.j.a(goToVehicleDetails);
                this.f234943e = 1;
                if (zVar.F(goToVehicleDetails2, this) == objE) {
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
        public final Object w(ze3.a.GoToVehicleDetails goToVehicleDetails, ze3.c.Initialized initialized, tq.e<? super i0> eVar) {
            n nVar = z.this.new n(eVar);
            nVar.f234944f = goToVehicleDetails;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lze3/a$f;", "action", "Lze3/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lze3/a$f;Lze3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ze3.a.GoToPersonalDetails, ze3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234946e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234947f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ze3.a.GoToPersonalDetails goToPersonalDetails = (ze3.a.GoToPersonalDetails) this.f234947f;
            Object objE = uq.b.e();
            int i15 = this.f234946e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                ze3.a.i.GoToPersonalDetails goToPersonalDetails2 = new ze3.a.i.GoToPersonalDetails(goToPersonalDetails.getPersonalDetailsData());
                this.f234947f = vq.j.a(goToPersonalDetails);
                this.f234946e = 1;
                if (zVar.F(goToPersonalDetails2, this) == objE) {
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
        public final Object w(ze3.a.GoToPersonalDetails goToPersonalDetails, ze3.c.Initialized initialized, tq.e<? super i0> eVar) {
            o oVar = z.this.new o(eVar);
            oVar.f234947f = goToPersonalDetails;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lze3/a$e;", "action", "Lze3/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lze3/a$e;Lze3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<ze3.a.GoToMapDetails, ze3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234949e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234950f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ze3.a.GoToMapDetails goToMapDetails = (ze3.a.GoToMapDetails) this.f234950f;
            Object objE = uq.b.e();
            int i15 = this.f234949e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                ze3.a.i.GoToMapDetails goToMapDetails2 = new ze3.a.i.GoToMapDetails(goToMapDetails.getLocalization());
                this.f234950f = vq.j.a(goToMapDetails);
                this.f234949e = 1;
                if (zVar.F(goToMapDetails2, this) == objE) {
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
        public final Object w(ze3.a.GoToMapDetails goToMapDetails, ze3.c.Initialized initialized, tq.e<? super i0> eVar) {
            p pVar = z.this.new p(eVar);
            pVar.f234950f = goToMapDetails;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lze3/a$p;", "action", "Lk10/c0;", "Lze3/c$a;", "state", "Lk10/l;", "Lze3/c;", "<anonymous>", "(Lze3/a$p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<ze3.a.Update, k10.c0<ze3.c.Initialized>, tq.e<? super k10.l<? extends ze3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f234952e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f234953f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f234954g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ze3.c.Initialized O(ze3.a.Update update, ze3.c.Initialized initialized) {
            return initialized.a(update.getStatementDetails());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ze3.a.Update update = (ze3.a.Update) this.f234953f;
            k10.c0 c0Var = (k10.c0) this.f234954g;
            uq.b.e();
            if (this.f234952e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ze3.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.q.O(update, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ze3.a.Update update, k10.c0<ze3.c.Initialized> c0Var, tq.e<? super k10.l<? extends ze3.c>> eVar) {
            q qVar = new q(eVar);
            qVar.f234953f = update;
            qVar.f234954g = c0Var;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lze3/a$b;", "action", "Lze3/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lze3/a$b;Lze3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<ze3.a.DownloadPdf, ze3.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f234955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f234956f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f234957g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f234958h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f234959j;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
        
            if (r3.F(r6, r12) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00d4, code lost:
        
            if (r4.F(r5, r12) == r1) goto L24;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ze3.z.r.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ze3.a.DownloadPdf downloadPdf, ze3.c.Initialized initialized, tq.e<? super i0> eVar) {
            r rVar = z.this.new r(eVar);
            rVar.f234959j = downloadPdf;
            return rVar.J(i0.f148189a);
        }
    }

    public z(yy.a aVar, ac4.a aVar2, aw0.r rVar, aw0.e eVar, aw0.g gVar, af3.l lVar, ib4.c cVar, ae3.q qVar, a14.w wVar, a14.g gVar2, ae3.n nVar, SetupData setupData) {
        this.callActionWithLoaderUseCase = aVar2;
        this.getCollisionStatementUC = rVar;
        this.bEGetReportedToUfgCollisionDetails = eVar;
        this.beGetUfgFormReportDetailsUC = gVar;
        this.mapper = lVar;
        this.genericDomainErrorMapper = cVar;
        this.requestStoragePermissionUC = qVar;
        this.openUrlIntentUseCase = wVar;
        this.dialIntentUseCase = gVar2;
        this.regenerateStatementUC = nVar;
        this.setupData = setupData;
        ze3.c.b bVar = ze3.c.b.f234818a;
        this.initialState = bVar;
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: ze3.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.N9(this.f234867a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), F9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E9(dx.b domainError, ze3.a retryAction) {
        i00.a.a(this, new a(domainError, retryAction, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ze3.d.a F9(ze3.c cVar) {
        af3.l lVar = this.mapper;
        er.a<i0> aVarB9 = b9(ze3.a.C6326a.f234784a);
        return lVar.b(new af3.l.Params(cVar, new er.l() { // from class: ze3.o
            @Override // er.l
            public final Object b(Object obj) {
                return z.G9(this.f234858a, (InsuranceDetailsData) obj);
            }
        }, new er.l() { // from class: ze3.p
            @Override // er.l
            public final Object b(Object obj) {
                return z.H9(this.f234859a, (VehicleDetailsData) obj);
            }
        }, new er.l() { // from class: ze3.q
            @Override // er.l
            public final Object b(Object obj) {
                return z.I9(this.f234860a, (PersonalDetailsData) obj);
            }
        }, new er.l() { // from class: ze3.r
            @Override // er.l
            public final Object b(Object obj) {
                return z.J9(this.f234861a, (ShowLocalizationModel) obj);
            }
        }, b9(ze3.a.g.f234792a), aVarB9, b9(ze3.a.k.f234807a), new er.l() { // from class: ze3.s
            @Override // er.l
            public final Object b(Object obj) {
                return z.K9(this.f234862a, (List) obj);
            }
        }, new er.l() { // from class: ze3.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.L9(this.f234863a, (String) obj);
            }
        }, b9(ze3.a.l.f234808a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(z zVar, InsuranceDetailsData insuranceDetailsData) {
        zVar.d9(new ze3.a.GoToInsuranceDetails(insuranceDetailsData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(z zVar, VehicleDetailsData vehicleDetailsData) {
        zVar.d9(new ze3.a.GoToVehicleDetails(vehicleDetailsData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(z zVar, PersonalDetailsData personalDetailsData) {
        zVar.d9(new ze3.a.GoToPersonalDetails(personalDetailsData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(z zVar, ShowLocalizationModel showLocalizationModel) {
        zVar.d9(new ze3.a.GoToMapDetails(showLocalizationModel));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(z zVar, List list) {
        zVar.d9(new ze3.a.OnPhotosClicked(list));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(z zVar, String str) {
        zVar.d9(new ze3.a.OnCall(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(final z zVar, k10.v vVar) {
        vVar.c(q0.c(ze3.c.class), new er.l() { // from class: ze3.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.O9(this.f234864a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ze3.c.b.class), new er.l() { // from class: ze3.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.P9(this.f234865a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ze3.c.Initialized.class), new er.l() { // from class: ze3.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.Q9(this.f234866a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9(z zVar, k10.z zVar2) {
        c cVar = zVar.new c(null);
        zVar2.x(q0.c(ze3.a.C6326a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9(z zVar, k10.z zVar2) {
        zVar2.C(zVar.new d(null));
        e eVar = zVar.new e(null);
        zVar2.v(q0.c(ze3.a.c.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q9(z zVar, k10.z zVar2) {
        j jVar = new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(q0.c(ze3.a.n.class), oVar, jVar);
        zVar2.x(q0.c(ze3.a.GoToInsuranceDetails.class), oVar, zVar.new k(null));
        zVar2.x(q0.c(ze3.a.OnCall.class), oVar, zVar.new l(null));
        zVar2.x(q0.c(ze3.a.l.class), oVar, zVar.new m(null));
        zVar2.x(q0.c(ze3.a.GoToVehicleDetails.class), oVar, zVar.new n(null));
        zVar2.x(q0.c(ze3.a.GoToPersonalDetails.class), oVar, zVar.new o(null));
        zVar2.x(q0.c(ze3.a.GoToMapDetails.class), oVar, zVar.new p(null));
        zVar2.v(q0.c(ze3.a.Update.class), oVar, new q(null));
        zVar2.x(q0.c(ze3.a.DownloadPdf.class), oVar, zVar.new r(null));
        zVar2.x(q0.c(ze3.a.k.class), oVar, zVar.new f(null));
        zVar2.x(q0.c(ze3.a.o.class), oVar, zVar.new g(null));
        zVar2.x(q0.c(ze3.a.OnPhotosClicked.class), oVar, zVar.new h(null));
        zVar2.x(q0.c(ze3.a.g.class), oVar, zVar.new i(null));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ze3.a.i iVar, tq.e<? super i0> eVar) {
        return super.F(iVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public void P5(SetupData data) {
        if (data.getShouldRefreshSavedStatementData()) {
            d9(ze3.a.n.f234810a);
        }
    }

    @Override // zx.b
    public xw.b<ze3.a.i> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ze3.c, ze3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ze3.d.a> getState() {
        return this.state;
    }
}
