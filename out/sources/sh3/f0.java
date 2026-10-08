package sh3;

import androidx.p016lifecycle.u0;
import fr.q0;
import ja.x0;
import java.util.List;
import jb4.PayloadErrorData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.ProcessId;
import tv0.BEVehicleDataWithType;
import tv0.BEVehiclesPages;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJJ\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010$\u001a\u00020#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0082@¢\u0006\u0004\b)\u0010*J$\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b.\u0010/J,\u00103\u001a\u00020-2\u0006\u00100\u001a\u00020,2\b\u00101\u001a\u0004\u0018\u00010\u00032\b\u00102\u001a\u0004\u0018\u00010\u0003H\u0082@¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J+\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!09082\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b:\u0010;J\u0013\u0010=\u001a\u00020<*\u00020\u0002H\u0002¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u0004\u0018\u00010?*\u00020,H\u0002¢\u0006\u0004\b@\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR&\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030Y8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R \u0010e\u001a\b\u0012\u0004\u0012\u00020`0_8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR \u0010'\u001a\b\u0012\u0004\u0012\u00020<0f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j¨\u0006k"}, d2 = {"Lsh3/f0;", "Ll00/g;", "Lsh3/e;", "Lsh3/c;", "Lsh3/f;", "", "Lyy/a;", "stateMachineFactory", "Luh3/f;", "mapper", "Luh3/d;", "choiceTrailerDialogMapper", "Law0/x;", "getUserVehiclesUseCase", "Law0/v;", "getParticipantVehiclesByPageIdUC", "Lib4/c;", "domainErrorMapper", "Lmx/c;", "labelProvider", "Lde3/d;", "isWrongStateErrorUC", "Lvm3/a;", "vehicleTypeMapper", "Lth3/a;", "contract", "<init>", "(Lyy/a;Luh3/f;Luh3/d;Law0/x;Law0/v;Lib4/c;Lmx/c;Lde3/d;Lvm3/a;Lth3/a;)V", "Lsv0/y;", "processId", "Ltv0/m;", "pages", "", "Ltv0/k;", "manuallyAddedVehicles", "Lsh3/c$i;", "action", "Lk10/c0;", "Lsh3/e$c;", "state", "Lk10/l;", "M9", "(Lsv0/y;Ltv0/m;Ljava/util/List;Lsh3/c$i;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "D9", "(Lsv0/y;Ltq/e;)Ljava/lang/Object;", "domainError", "retryAction", "closeAction", "H9", "(Ldx/b;Lsh3/c;Lsh3/c;Ltq/e;)Ljava/lang/Object;", "Ldx/b$c;", "y9", "()Ldx/b$c;", "Lmu/g;", "Lja/n0;", "z9", "(Lsv0/y;Ltv0/m;)Lmu/g;", "Lsh3/f$a;", "J9", "(Lsh3/e;)Lsh3/f$a;", "Ljb4/f;", "G9", "(Ldx/b;)Ljb4/f;", "b", "Luh3/f;", "c", "Luh3/d;", "d", "Law0/x;", "e", "Law0/v;", "f", "Lib4/c;", "g", "Lmx/c;", "h", "Lde3/d;", "j", "Lvm3/a;", "k", "Lth3/a;", "F9", "()Lth3/a;", "l", "Lsh3/e$c;", "initialState", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lsh3/c$e;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 extends l00.g<sh3.e, sh3.c> implements sh3.f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final uh3.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final uh3.d choiceTrailerDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final aw0.x getUserVehiclesUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final aw0.v getParticipantVehiclesByPageIdUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final de3.d isWrongStateErrorUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final vm3.a vehicleTypeMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final th3.a contract;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final sh3.e.c initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<sh3.e, sh3.c> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sh3.c.e> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<sh3.f.a> state;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/b;", "domainError", "Loq/i0;", "<anonymous>", "(Ldx/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<dx.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181784e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181785f;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.b bVar = (dx.b) this.f181785f;
            Object objE = uq.b.e();
            int i15 = this.f181784e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                sh3.c.h hVar = sh3.c.h.f181737a;
                this.f181785f = vq.j.a(bVar);
                this.f181784e = 1;
                if (f0Var.H9(bVar, hVar, null, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(dx.b bVar, tq.e<? super oq.i0> eVar) {
            return ((a) v(bVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = f0.this.new a(eVar);
            aVar.f181785f = obj;
            return aVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f181787d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f181788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f181789f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f181790g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f181791h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f181792j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f181793k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f181795m;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f181793k = obj;
            this.f181795m |= PKIFailureInfo.systemUnavail;
            return f0.this.D9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f181796d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f181797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f181798f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f181799g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f181800h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f181801j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f181802k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f181803l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f181804m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f181805n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f181807q;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f181805n = obj;
            this.f181807q |= PKIFailureInfo.systemUnavail;
            return f0.this.M9(null, null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<sh3.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f181808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f181809b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f181810a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f0 f181811b;

            /* JADX INFO: renamed from: sh3.f0$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4679a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f181812d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f181813e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f181814f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f181816h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f181817j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f181818k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f181819l;

                public C4679a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f181812d = obj;
                    this.f181813e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, f0 f0Var) {
                this.f181810a = hVar;
                this.f181811b = f0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4679a c4679a;
                if (eVar instanceof C4679a) {
                    c4679a = (C4679a) eVar;
                    int i15 = c4679a.f181813e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4679a.f181813e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4679a = new C4679a(eVar);
                    }
                } else {
                    c4679a = new C4679a(eVar);
                }
                Object obj2 = c4679a.f181812d;
                Object objE = uq.b.e();
                int i16 = c4679a.f181813e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f181810a;
                    sh3.f.a aVarJ9 = this.f181811b.J9((sh3.e) obj);
                    c4679a.f181814f = vq.j.a(obj);
                    c4679a.f181816h = vq.j.a(c4679a);
                    c4679a.f181817j = vq.j.a(obj);
                    c4679a.f181818k = vq.j.a(hVar);
                    c4679a.f181819l = 0;
                    c4679a.f181813e = 1;
                    if (hVar.F(aVarJ9, c4679a) == objE) {
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

        public d(mu.g gVar, f0 f0Var) {
            this.f181808a = gVar;
            this.f181809b = f0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super sh3.f.a> hVar, tq.e eVar) {
            Object objA = this.f181808a.a(new a(hVar, this.f181809b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsh3/c$e;", "action", "Lsh3/e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsh3/c$e;Lsh3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<sh3.c.e, sh3.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181821f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sh3.c.e eVar = (sh3.c.e) this.f181821f;
            Object objE = uq.b.e();
            int i15 = this.f181820e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                this.f181821f = vq.j.a(eVar);
                this.f181820e = 1;
                if (f0Var.F(eVar, this) == objE) {
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
        public final Object w(sh3.c.e eVar, sh3.e eVar2, tq.e<? super oq.i0> eVar3) {
            e eVar4 = f0.this.new e(eVar3);
            eVar4.f181821f = eVar;
            return eVar4.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsh3/c$a;", "<unused var>", "Lsh3/e;", "Loq/i0;", "<anonymous>", "(Lsh3/c$a;Lsh3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<sh3.c.a, sh3.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181823e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f181823e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                sh3.c.e.d dVar = sh3.c.e.d.f181731a;
                this.f181823e = 1;
                if (f0Var.F(dVar, this) == objE) {
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
        public final Object w(sh3.c.a aVar, sh3.e eVar, tq.e<? super oq.i0> eVar2) {
            return f0.this.new f(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lsh3/c$j;", "<unused var>", "Lk10/c0;", "Lsh3/e;", "state", "Lk10/l;", "<anonymous>", "(Lsh3/c$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<sh3.c.j, k10.c0<sh3.e>, tq.e<? super k10.l<? extends sh3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181826f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sh3.e.a O(sh3.e eVar) {
            return sh3.e.a.f181749a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f181826f;
            uq.b.e();
            if (this.f181825e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sh3.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.g.O((e) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sh3.c.j jVar, k10.c0<sh3.e> c0Var, tq.e<? super k10.l<? extends sh3.e>> eVar) {
            g gVar = new g(eVar);
            gVar.f181826f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsh3/c$c;", "<unused var>", "Lsh3/e;", "Loq/i0;", "<anonymous>", "(Lsh3/c$c;Lsh3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<sh3.c.C4675c, sh3.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181827e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f181827e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                sh3.c.e.C4676c c4676c = sh3.c.e.C4676c.f181730a;
                this.f181827e = 1;
                if (f0Var.F(c4676c, this) == objE) {
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
        public final Object w(sh3.c.C4675c c4675c, sh3.e eVar, tq.e<? super oq.i0> eVar2) {
            return f0.this.new h(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsh3/e$c;", "it", "Loq/i0;", "<anonymous>", "(Lsh3/e$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<sh3.e.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181829e;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f181829e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            f0.this.d9(new sh3.c.Setup(false, 1, null));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(sh3.e.c cVar, tq.e<? super oq.i0> eVar) {
            return ((i) v(cVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return f0.this.new i(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsh3/c$i;", "action", "Lk10/c0;", "Lsh3/e$c;", "state", "Lk10/l;", "Lsh3/e;", "<anonymous>", "(Lsh3/c$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<sh3.c.Setup, k10.c0<sh3.e.c>, tq.e<? super k10.l<? extends sh3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181831e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181832f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f181833g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sh3.c.Setup setup = (sh3.c.Setup) this.f181832f;
            k10.c0 c0Var = (k10.c0) this.f181833g;
            Object objE = uq.b.e();
            int i15 = this.f181831e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            f0 f0Var = f0.this;
            ProcessId processId = f0Var.getContract().O2().getProcessId();
            BEVehiclesPages pages = f0.this.getContract().O2().getPages();
            List<BEVehicleDataWithType> listA = f0.this.getContract().O2().a();
            this.f181832f = vq.j.a(setup);
            this.f181833g = vq.j.a(c0Var);
            this.f181831e = 1;
            Object objM9 = f0Var.M9(processId, pages, listA, setup, c0Var, this);
            return objM9 == objE ? objE : objM9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sh3.c.Setup setup, k10.c0<sh3.e.c> c0Var, tq.e<? super k10.l<? extends sh3.e>> eVar) {
            j jVar = f0.this.new j(eVar);
            jVar.f181832f = setup;
            jVar.f181833g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lth3/a$a;", "event", "Lk10/c0;", "Lsh3/e$b;", "state", "Lk10/l;", "Lsh3/e;", "<anonymous>", "(Lth3/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<th3.a.Data, k10.c0<sh3.e.List>, tq.e<? super k10.l<? extends sh3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181835e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181836f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f181837g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sh3.e.List O(th3.a.Data data, sh3.e.List list) {
            return sh3.e.List.b(list, false, data.a(), null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final th3.a.Data data = (th3.a.Data) this.f181836f;
            k10.c0 c0Var = (k10.c0) this.f181837g;
            uq.b.e();
            if (this.f181835e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return !fr.t.c(data.a(), ((sh3.e.List) c0Var.a()).c()) ? c0Var.b(new er.l() { // from class: sh3.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.k.O(data, (e.List) obj2);
                }
            }) : c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(th3.a.Data data, k10.c0<sh3.e.List> c0Var, tq.e<? super k10.l<? extends sh3.e>> eVar) {
            k kVar = new k(eVar);
            kVar.f181836f = data;
            kVar.f181837g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsh3/c$b;", "<unused var>", "Lk10/c0;", "Lsh3/e$b;", "state", "Lk10/l;", "Lsh3/e;", "<anonymous>", "(Lsh3/c$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<sh3.c.b, k10.c0<sh3.e.List>, tq.e<? super k10.l<? extends sh3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181838e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181839f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sh3.e.c O(sh3.e.List list) {
            return sh3.e.c.f181754a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f181839f;
            Object objE = uq.b.e();
            int i15 = this.f181838e;
            if (i15 == 0) {
                oq.u.b(obj);
                th3.a contract = f0.this.getContract();
                this.f181839f = c0Var;
                this.f181838e = 1;
                if (contract.X5(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.d(new er.l() { // from class: sh3.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.l.O((e.List) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sh3.c.b bVar, k10.c0<sh3.e.List> c0Var, tq.e<? super k10.l<? extends sh3.e>> eVar) {
            l lVar = f0.this.new l(eVar);
            lVar.f181839f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsh3/c$d;", "action", "Lsh3/e$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsh3/c$d;Lsh3/e$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<sh3.c.GoToNextStep, sh3.e.List, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181842f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
        
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
                java.lang.Object r0 = r6.f181842f
                sh3.c$d r0 = (sh3.c.GoToNextStep) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f181841e
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
                goto L56
            L22:
                oq.u.b(r7)
                sh3.f0 r7 = sh3.f0.this
                th3.a r7 = r7.getContract()
                th3.a$a r7 = r7.O2()
                tv0.k r7 = r7.getSelectedVehicle()
                tv0.k r2 = r0.getVehicle()
                boolean r7 = fr.t.c(r7, r2)
                if (r7 != 0) goto L56
                sh3.f0 r7 = sh3.f0.this
                th3.a r7 = r7.getContract()
                tv0.k r2 = r0.getVehicle()
                java.lang.Object r5 = vq.j.a(r0)
                r6.f181842f = r5
                r6.f181841e = r4
                java.lang.Object r7 = r7.b4(r2, r6)
                if (r7 != r1) goto L56
                goto L68
            L56:
                sh3.f0 r7 = sh3.f0.this
                sh3.c$e$e r2 = sh3.c.e.C4677e.f181732a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f181842f = r0
                r6.f181841e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L69
            L68:
                return r1
            L69:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: sh3.f0.m.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sh3.c.GoToNextStep goToNextStep, sh3.e.List list, tq.e<? super oq.i0> eVar) {
            m mVar = f0.this.new m(eVar);
            mVar.f181842f = goToNextStep;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsh3/c$g;", "action", "Lsh3/e$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsh3/c$g;Lsh3/e$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<sh3.c.OnVehicleSelected, sh3.e.List, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181844e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181845f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f181847a;

            static {
                int[] iArr = new int[BEVehicleDataWithType.a.values().length];
                try {
                    iArr[BEVehicleDataWithType.a.Trailer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f181847a = iArr;
            }
        }

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(f0 f0Var, sh3.c.OnVehicleSelected onVehicleSelected) {
            f0Var.d9(new sh3.c.GoToNextStep(onVehicleSelected.getVehicle()));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sh3.c.OnVehicleSelected onVehicleSelected = (sh3.c.OnVehicleSelected) this.f181845f;
            Object objE = uq.b.e();
            int i15 = this.f181844e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (a.f181847a[onVehicleSelected.getVehicle().getType().ordinal()] == 1) {
                    f0 f0Var = f0.this;
                    uh3.d dVar = f0.this.choiceTrailerDialogMapper;
                    final f0 f0Var2 = f0.this;
                    sh3.c.e.ShowDialog showDialog = new sh3.c.e.ShowDialog(dVar.b(new uh3.d.Params(new er.a() { // from class: sh3.j0
                        @Override // er.a
                        public final Object a() {
                            return f0.n.O(f0Var2, onVehicleSelected);
                        }
                    })));
                    this.f181845f = vq.j.a(onVehicleSelected);
                    this.f181844e = 1;
                    if (f0Var.F(showDialog, this) == objE) {
                        return objE;
                    }
                } else {
                    f0.this.d9(new sh3.c.GoToNextStep(onVehicleSelected.getVehicle()));
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sh3.c.OnVehicleSelected onVehicleSelected, sh3.e.List list, tq.e<? super oq.i0> eVar) {
            n nVar = f0.this.new n(eVar);
            nVar.f181845f = onVehicleSelected;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsh3/c$f;", "action", "Lsh3/e$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsh3/c$f;Lsh3/e$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<sh3.c.OnDownloadedPage, sh3.e.List, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181849f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BEVehiclesPages O(sh3.c.OnDownloadedPage onDownloadedPage, BEVehiclesPages bEVehiclesPages) {
            return bEVehiclesPages.a(onDownloadedPage.getVehiclesCollisionPage());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sh3.c.OnDownloadedPage onDownloadedPage = (sh3.c.OnDownloadedPage) this.f181849f;
            Object objE = uq.b.e();
            int i15 = this.f181848e;
            if (i15 == 0) {
                oq.u.b(obj);
                th3.a contract = f0.this.getContract();
                er.l<? super BEVehiclesPages, BEVehiclesPages> lVar = new er.l() { // from class: sh3.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return f0.o.O(onDownloadedPage, (BEVehiclesPages) obj2);
                    }
                };
                this.f181849f = vq.j.a(onDownloadedPage);
                this.f181848e = 1;
                if (contract.J3(lVar, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sh3.c.OnDownloadedPage onDownloadedPage, sh3.e.List list, tq.e<? super oq.i0> eVar) {
            o oVar = f0.this.new o(eVar);
            oVar.f181849f = onDownloadedPage;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsh3/c$h;", "<unused var>", "Lsh3/e$b;", "state", "Loq/i0;", "<anonymous>", "(Lsh3/c$h;Lsh3/e$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<sh3.c.h, sh3.e.List, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181851e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181852f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sh3.e.List list = (sh3.e.List) this.f181852f;
            Object objE = uq.b.e();
            int i15 = this.f181851e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.a0<sh3.d> a0VarD = list.d();
                sh3.d.a aVar = sh3.d.a.f181745a;
                this.f181852f = vq.j.a(list);
                this.f181851e = 1;
                if (a0VarD.F(aVar, this) == objE) {
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
        public final Object w(sh3.c.h hVar, sh3.e.List list, tq.e<? super oq.i0> eVar) {
            p pVar = new p(eVar);
            pVar.f181852f = list;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lth3/a$a;", "event", "Lk10/c0;", "Lsh3/e$a;", "state", "Lk10/l;", "Lsh3/e;", "<anonymous>", "(Lth3/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<th3.a.Data, k10.c0<sh3.e.a>, tq.e<? super k10.l<? extends sh3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f181854f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f181855g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sh3.e.List O(th3.a.Data data, sh3.e.a aVar) {
            return new sh3.e.List(false, data.a(), mu.i.v(), null, 8, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final th3.a.Data data = (th3.a.Data) this.f181854f;
            k10.c0 c0Var = (k10.c0) this.f181855g;
            uq.b.e();
            if (this.f181853e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return !data.a().isEmpty() ? c0Var.d(new er.l() { // from class: sh3.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.q.O(data, (e.a) obj2);
                }
            }) : c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(th3.a.Data data, k10.c0<sh3.e.a> c0Var, tq.e<? super k10.l<? extends sh3.e>> eVar) {
            q qVar = new q(eVar);
            qVar.f181854f = data;
            qVar.f181855g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    public f0(yy.a aVar, uh3.f fVar, uh3.d dVar, aw0.x xVar, aw0.v vVar, ib4.c cVar, mx.c cVar2, de3.d dVar2, vm3.a aVar2, th3.a aVar3) {
        this.mapper = fVar;
        this.choiceTrailerDialogMapper = dVar;
        this.getUserVehiclesUseCase = xVar;
        this.getParticipantVehiclesByPageIdUC = vVar;
        this.domainErrorMapper = cVar;
        this.labelProvider = cVar2;
        this.isWrongStateErrorUC = dVar2;
        this.vehicleTypeMapper = aVar2;
        this.contract = aVar3;
        sh3.e.c cVar3 = sh3.e.c.f181754a;
        this.initialState = cVar3;
        this.stateMachine = aVar.a(cVar3, new er.l() { // from class: sh3.v
            @Override // er.l
            public final Object b(Object obj) {
                return f0.P9(this.f181911a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new d(e9().getState(), this), J9(cVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 A9(ProcessId processId, BEVehiclesPages bEVehiclesPages, final f0 f0Var) {
        return new p0(processId, bEVehiclesPages, f0Var.getParticipantVehiclesByPageIdUC, f0Var.vehicleTypeMapper, new er.l() { // from class: sh3.u
            @Override // er.l
            public final Object b(Object obj) {
                return f0.B9(this.f181910a, (BEVehiclesPages.BEVehiclesPageWithTypes) obj);
            }
        }, f0Var.new a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(f0 f0Var, BEVehiclesPages.BEVehiclesPageWithTypes bEVehiclesPageWithTypes) {
        f0Var.d9(new sh3.c.OnDownloadedPage(bEVehiclesPageWithTypes));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        if (r5.J3(r6, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D9(sv0.ProcessId r8, tq.e<? super dx.i<? extends dx.b, oq.i0>> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof sh3.f0.b
            if (r0 == 0) goto L13
            r0 = r9
            sh3.f0$b r0 = (sh3.f0.b) r0
            int r1 = r0.f181795m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181795m = r1
            goto L18
        L13:
            sh3.f0$b r0 = new sh3.f0$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f181793k
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f181795m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r8 = r0.f181790g
            tv0.m$a r8 = (tv0.BEVehiclesPages.BEVehiclesPageWithTypes) r8
            java.lang.Object r8 = r0.f181789f
            sv0.f r8 = (sv0.f) r8
            java.lang.Object r8 = r0.f181788e
            dx.i r8 = (dx.i) r8
            java.lang.Object r8 = r0.f181787d
            sv0.y r8 = (sv0.ProcessId) r8
            oq.u.b(r9)
            goto Lac
        L3c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L44:
            java.lang.Object r8 = r0.f181787d
            sv0.y r8 = (sv0.ProcessId) r8
            oq.u.b(r9)
            goto L65
        L4c:
            oq.u.b(r9)
            aw0.x r9 = r7.getUserVehiclesUseCase
            aw0.x$a r2 = new aw0.x$a
            r2.<init>(r8)
            java.lang.Object r5 = vq.j.a(r8)
            r0.f181787d = r5
            r0.f181795m = r4
            java.lang.Object r9 = r9.c(r2, r0)
            if (r9 != r1) goto L65
            goto Lab
        L65:
            dx.i r9 = (dx.i) r9
            boolean r2 = r9 instanceof dx.i.Left
            if (r2 == 0) goto L6c
            return r9
        L6c:
            boolean r2 = r9 instanceof dx.i.Right
            if (r2 == 0) goto Lb4
            r2 = r9
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
            sv0.f r2 = (sv0.f) r2
            vm3.a r4 = r7.vehicleTypeMapper
            tv0.m$a r4 = xd3.a.a(r2, r4)
            th3.a r5 = r7.contract
            sh3.e0 r6 = new sh3.e0
            r6.<init>()
            java.lang.Object r8 = vq.j.a(r8)
            r0.f181787d = r8
            java.lang.Object r8 = vq.j.a(r9)
            r0.f181788e = r8
            java.lang.Object r8 = vq.j.a(r2)
            r0.f181789f = r8
            java.lang.Object r8 = vq.j.a(r4)
            r0.f181790g = r8
            r8 = 0
            r0.f181791h = r8
            r0.f181792j = r8
            r0.f181795m = r3
            java.lang.Object r8 = r5.J3(r6, r0)
            if (r8 != r1) goto Lac
        Lab:
            return r1
        Lac:
            oq.i0 r8 = oq.i0.f148189a
            dx.i$c r9 = new dx.i$c
            r9.<init>(r8)
            return r9
        Lb4:
            oq.p r8 = new oq.p
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sh3.f0.D9(sv0.y, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BEVehiclesPages E9(BEVehiclesPages.BEVehiclesPageWithTypes bEVehiclesPageWithTypes, BEVehiclesPages bEVehiclesPages) {
        return bEVehiclesPages.a(bEVehiclesPageWithTypes);
    }

    private final PayloadErrorData G9(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H9(dx.b bVar, final sh3.c cVar, final sh3.c cVar2, tq.e<? super oq.i0> eVar) {
        PayloadErrorData payloadErrorDataG9 = G9(bVar);
        final boolean zC = fr.t.c(payloadErrorDataG9 != null ? payloadErrorDataG9.getCode() : null, "COLLISION_PARTICIPANT_VEHICLES_BY_PAGE_ID_NOT_FOUND");
        final boolean zBooleanValue = this.isWrongStateErrorUC.c(new de3.d.Params(bVar)).booleanValue();
        ib4.c cVar3 = this.domainErrorMapper;
        if (zC) {
            bVar = y9();
        } else if (zC) {
            throw new oq.p();
        }
        Object objF = F(new sh3.c.e.ShowError(cVar3.b(new ib4.c.Params(bVar, false, new er.l() { // from class: sh3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.I9(zBooleanValue, this, zC, cVar, cVar2, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(boolean z15, f0 f0Var, boolean z16, sh3.c cVar, sh3.c cVar2, ib4.c.b bVar) {
        if (z15) {
            f0Var.d9(sh3.c.C4675c.f181726a);
        } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar instanceof ib4.c.b.a.Primary)) {
            if (z16) {
                f0Var.d9(sh3.c.b.f181725a);
            } else {
                if (z16) {
                    throw new oq.p();
                }
                if (cVar != null) {
                    f0Var.d9(cVar);
                }
            }
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.a.Close)) {
                throw new oq.p();
            }
            if (cVar2 != null) {
                f0Var.d9(cVar2);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sh3.f.a J9(sh3.e eVar) {
        return this.mapper.b(new uh3.f.Params(eVar, new er.l() { // from class: sh3.z
            @Override // er.l
            public final Object b(Object obj) {
                return f0.K9(this.f181915a, (BEVehicleDataWithType) obj);
            }
        }, b9(sh3.c.a.f181724a), b9(sh3.c.e.b.f181729a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(f0 f0Var, BEVehicleDataWithType bEVehicleDataWithType) {
        f0Var.d9(new sh3.c.OnVehicleSelected(bEVehicleDataWithType));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ee, code lost:
    
        if (H9(r10, r11, r6, r2) == r3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M9(final sv0.ProcessId r15, final tv0.BEVehiclesPages r16, final java.util.List<tv0.BEVehicleDataWithType> r17, sh3.c.Setup r18, k10.c0<sh3.e.c> r19, tq.e<? super k10.l<? extends sh3.e>> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sh3.f0.M9(sv0.y, tv0.m, java.util.List, sh3.c$i, k10.c0, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sh3.e.a N9(sh3.e.c cVar) {
        return sh3.e.a.f181749a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sh3.e.List O9(f0 f0Var, ProcessId processId, BEVehiclesPages bEVehiclesPages, boolean z15, List list, sh3.e.c cVar) {
        return new sh3.e.List(z15, list, f0Var.z9(processId, bEVehiclesPages), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(final f0 f0Var, k10.v vVar) {
        vVar.c(q0.c(sh3.e.class), new er.l() { // from class: sh3.t
            @Override // er.l
            public final Object b(Object obj) {
                return f0.Q9(this.f181909a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(sh3.e.c.class), new er.l() { // from class: sh3.w
            @Override // er.l
            public final Object b(Object obj) {
                return f0.R9(this.f181912a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(sh3.e.List.class), new er.l() { // from class: sh3.x
            @Override // er.l
            public final Object b(Object obj) {
                return f0.S9(this.f181913a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(sh3.e.a.class), new er.l() { // from class: sh3.y
            @Override // er.l
            public final Object b(Object obj) {
                return f0.T9(this.f181914a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(f0 f0Var, k10.z zVar) {
        e eVar = f0Var.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(sh3.c.e.class), oVar, eVar);
        zVar.x(q0.c(sh3.c.a.class), oVar, f0Var.new f(null));
        zVar.v(q0.c(sh3.c.j.class), oVar, new g(null));
        zVar.x(q0.c(sh3.c.C4675c.class), oVar, f0Var.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(f0 f0Var, k10.z zVar) {
        zVar.C(f0Var.new i(null));
        j jVar = f0Var.new j(null);
        zVar.v(q0.c(sh3.c.Setup.class), k10.o.CANCEL_PREVIOUS, jVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(f0 f0Var, k10.z zVar) {
        k10.k.m(zVar, f0Var.contract.M3(), null, new k(null), 2, null);
        l lVar = f0Var.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(sh3.c.b.class), oVar, lVar);
        zVar.x(q0.c(sh3.c.GoToNextStep.class), oVar, f0Var.new m(null));
        zVar.x(q0.c(sh3.c.OnVehicleSelected.class), oVar, f0Var.new n(null));
        zVar.x(q0.c(sh3.c.OnDownloadedPage.class), oVar, f0Var.new o(null));
        zVar.x(q0.c(sh3.c.h.class), oVar, new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(f0 f0Var, k10.z zVar) {
        k10.k.m(zVar, f0Var.contract.M3(), null, new q(null), 2, null);
        return oq.i0.f148189a;
    }

    private final dx.b.Business y9() {
        return new dx.b.Business(null, dx.b.f.WARNING, this.labelProvider.c(md3.b.f125873y5), null, null, this.labelProvider.c(md3.b.R), null, 89, null);
    }

    private final mu.g<ja.n0<BEVehicleDataWithType>> z9(final ProcessId processId, final BEVehiclesPages pages) {
        return ja.d.a(new ja.l0(new ja.m0(10, 1, false, 0, 0, 0, 60, null), "INITIAL_PAGE", new er.a() { // from class: sh3.d0
            @Override // er.a
            public final Object a() {
                return f0.A9(processId, pages, this);
            }
        }).a(), u0.a(this));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(sh3.c.e eVar, tq.e<? super oq.i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    /* JADX INFO: renamed from: F9, reason: from getter */
    public final th3.a getContract() {
        return this.contract;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: L9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(th3.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<sh3.c.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<sh3.e, sh3.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<sh3.f.a> getState() {
        return this.state;
    }
}
