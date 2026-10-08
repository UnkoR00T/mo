package mo3;

import co3.QrCodeData;
import co3.SummaryData;
import fr.q0;
import go3.f0;
import go3.k0;
import java.util.List;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0082@¢\u0006\u0004\b\u001f\u0010 J,\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020!0\u001a2\u0006\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020&H\u0082@¢\u0006\u0004\b)\u0010*J&\u0010/\u001a\u00020&2\u0006\u0010+\u001a\u00020\"2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0082@¢\u0006\u0004\b/\u00100J#\u00103\u001a\u00020&2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&01H\u0002¢\u0006\u0004\b3\u00104J\u0018\u00107\u001a\u00020&2\u0006\u00106\u001a\u000205H\u0082@¢\u0006\u0004\b7\u00108J%\u0010:\u001a\u0002092\u0006\u0010+\u001a\u00020\"2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002¢\u0006\u0004\b:\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR&\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030J8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR \u0010\\\u001a\b\u0012\u0004\u0012\u00020W0V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lmo3/t;", "Ll00/g;", "Lmo3/b;", "Lmo3/a;", "Lmo3/c;", "", "Lyy/a;", "stateMachineFactory", "Lno3/a;", "institutionsScreenMapper", "Lgo3/f0;", "loadInstitutionsDataUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lgo3/d;", "fetchQrCodeDataUseCase", "Lgo3/k0;", "sendDataToInstitutionUseCase", "Lg04/g;", "checkBiometricStatusUseCase", "Lib4/c;", "domainErrorMapper", "Ljo3/a;", "institutionPayloadData", "<init>", "(Lyy/a;Lno3/a;Lgo3/f0;Lac4/a;Lgo3/d;Lgo3/k0;Lg04/g;Lib4/c;Ljo3/a;)V", "Lk10/c0;", "Lmo3/b$d;", "state", "Lk10/l;", "Lmo3/b$c;", "O9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Lmo3/b$a;", "", "qrCode", "F9", "(Lk10/c0;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "Q9", "(Lmo3/b$c;Ltq/e;)Ljava/lang/Object;", "E9", "(Ltq/e;)Ljava/lang/Object;", "name", "", "Lco3/q;", "list", "M9", "(Ljava/lang/String;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Ldx/i;", "isAuthenticated", "N9", "(Ldx/i;)V", "Ldx/b;", "domainError", "G9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lco3/o;", "P9", "(Ljava/lang/String;Ljava/util/List;)Lco3/o;", "b", "Lgo3/f0;", "c", "Lac4/a;", "d", "Lgo3/d;", "e", "Lgo3/k0;", "f", "Lg04/g;", "g", "Lib4/c;", "h", "Ljo3/a;", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lmo3/c$a;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lmo3/a$f;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<mo3.b, mo3.a> implements mo3.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f0 loadInstitutionsDataUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final go3.d fetchQrCodeDataUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k0 sendDataToInstitutionUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g04.g checkBiometricStatusUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final jo3.a institutionPayloadData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<mo3.b, mo3.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<mo3.c.a> state;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<mo3.a.f> navAction = new xw.b<>();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f127250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f127251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f127252f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f127253g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f127254h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f127255j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f127257l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f127255j = obj;
            this.f127257l |= PKIFailureInfo.systemUnavail;
            return t.this.E9(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Loq/i0;", "isAuthenticated", "<anonymous>", "(Ldx/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<dx.i<? extends i0, ? extends i0>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f127259f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar = (dx.i) this.f127259f;
            uq.b.e();
            if (this.f127258e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.N9(iVar);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(dx.i<i0, i0> iVar, tq.e<? super i0> eVar) {
            return ((b) v(iVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = t.this.new b(eVar);
            bVar.f127259f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lmo3/b$d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super k10.l<? extends mo3.b.Loading>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f127261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f127262f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f127263g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f127264h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f127265j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f127266k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f127268m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ c0<mo3.b.Deeplink> f127269n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, c0<mo3.b.Deeplink> c0Var, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f127268m = str;
            this.f127269n = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mo3.b.Loading V(QrCodeData qrCodeData, mo3.b.Deeplink deeplink) {
            return new mo3.b.Loading(qrCodeData);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0<mo3.b.Deeplink> c0Var;
            Object objE = uq.b.e();
            int i15 = this.f127266k;
            if (i15 == 0) {
                oq.u.b(obj);
                go3.d dVar = t.this.fetchQrCodeDataUseCase;
                go3.d.Params params = new go3.d.Params(this.f127268m);
                this.f127266k = 1;
                obj = dVar.d(params, this);
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
                c0Var = (c0) this.f127262f;
                oq.u.b(obj);
            }
            return c0Var.c();
            dx.i iVar = (dx.i) obj;
            t tVar = t.this;
            c0<mo3.b.Deeplink> c0Var2 = this.f127269n;
            if (!(iVar instanceof dx.i.Left)) {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final QrCodeData qrCodeData = (QrCodeData) ((dx.i.Right) iVar).b();
                return c0Var2.d(new er.l() { // from class: mo3.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.c.V(qrCodeData, (b.Deeplink) obj2);
                    }
                });
            }
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            this.f127261e = vq.j.a(iVar);
            this.f127262f = c0Var2;
            this.f127263g = vq.j.a(bVar);
            this.f127264h = 0;
            this.f127265j = 0;
            this.f127266k = 2;
            if (tVar.G9(bVar, this) != objE) {
                c0Var = c0Var2;
                return c0Var.c();
            }
            return objE;
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return t.this.new c(this.f127268m, this.f127269n, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<mo3.b.Loading>> eVar) {
            return ((c) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lmo3/b$c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super k10.l<? extends mo3.b.Initialized>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f127270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f127271f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f127272g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f127273h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f127274j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f127275k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ c0<mo3.b.Loading> f127277m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c0<mo3.b.Loading> c0Var, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f127277m = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mo3.b.Initialized V(f0.Result result, mo3.b.Loading loading) {
            return new mo3.b.Initialized(result.getInstitutionData().getName(), result.getInstitutionData(), loading.getQrCodeData(), result.getDocument(), result.d(), result.getSubDocument());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0<mo3.b.Loading> c0Var;
            Object objE = uq.b.e();
            int i15 = this.f127275k;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = t.this.loadInstitutionsDataUseCase;
                f0.Params params = new f0.Params(this.f127277m.a().getQrCodeData());
                this.f127275k = 1;
                obj = f0Var.d(params, this);
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
                c0Var = (c0) this.f127271f;
                oq.u.b(obj);
            }
            return c0Var.c();
            dx.i iVar = (dx.i) obj;
            t tVar = t.this;
            c0<mo3.b.Loading> c0Var2 = this.f127277m;
            if (!(iVar instanceof dx.i.Left)) {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final f0.Result result = (f0.Result) ((dx.i.Right) iVar).b();
                return c0Var2.d(new er.l() { // from class: mo3.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.d.V(result, (b.Loading) obj2);
                    }
                });
            }
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            this.f127270e = vq.j.a(iVar);
            this.f127271f = c0Var2;
            this.f127272g = vq.j.a(bVar);
            this.f127273h = 0;
            this.f127274j = 0;
            this.f127275k = 2;
            if (tVar.G9(bVar, this) != objE) {
                c0Var = c0Var2;
                return c0Var.c();
            }
            return objE;
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return t.this.new d(this.f127277m, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<mo3.b.Initialized>> eVar) {
            return ((d) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f127278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f127279f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f127280g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f127281h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f127282j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ mo3.b.Initialized f127284l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(mo3.b.Initialized initialized, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f127284l = initialized;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
        
            if (r1.G9(r3, r7) == r0) goto L17;
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
                int r1 = r7.f127282j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r7.f127279f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r7.f127278e
                dx.i r0 = (dx.i) r0
                oq.u.b(r8)
                goto L90
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                oq.u.b(r8)
                goto L54
            L27:
                oq.u.b(r8)
                mo3.t r8 = mo3.t.this
                go3.k0 r8 = mo3.t.y9(r8)
                go3.k0$b r1 = new go3.k0$b
                mo3.b$c r4 = r7.f127284l
                co3.c r4 = r4.getInstitutionData()
                mo3.b$c r5 = r7.f127284l
                co3.e r5 = r5.getQrCodeData()
                mo3.b$c r6 = r7.f127284l
                k34.g r6 = r6.getSelectedDocument()
                rq0.b r6 = r6.getType()
                r1.<init>(r4, r5, r6)
                r7.f127282j = r3
                java.lang.Object r8 = r8.f(r1, r7)
                if (r8 != r0) goto L54
                goto L7e
            L54:
                dx.i r8 = (dx.i) r8
                mo3.t r1 = mo3.t.this
                boolean r3 = r8 instanceof dx.i.Left
                if (r3 == 0) goto L7f
                r3 = r8
                dx.i$b r3 = (dx.i.Left) r3
                java.lang.Object r3 = r3.b()
                dx.b r3 = (dx.b) r3
                java.lang.Object r8 = vq.j.a(r8)
                r7.f127278e = r8
                java.lang.Object r8 = vq.j.a(r3)
                r7.f127279f = r8
                r8 = 0
                r7.f127280g = r8
                r7.f127281h = r8
                r7.f127282j = r2
                java.lang.Object r8 = mo3.t.z9(r1, r3, r7)
                if (r8 != r0) goto L90
            L7e:
                return r0
            L7f:
                boolean r0 = r8 instanceof dx.i.Right
                if (r0 == 0) goto L93
                dx.i$c r8 = (dx.i.Right) r8
                java.lang.Object r8 = r8.b()
                oq.i0 r8 = (oq.i0) r8
                mo3.a$g r8 = mo3.a.g.f127201a
                mo3.t.t9(r1, r8)
            L90:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            L93:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: mo3.t.e.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return t.this.new e(this.f127284l, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<mo3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f127285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ no3.a f127286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f127287c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f127288a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ no3.a f127289b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ t f127290c;

            /* JADX INFO: renamed from: mo3.t$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3146a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f127291d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f127292e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f127293f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f127295h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f127296j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f127297k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f127298l;

                public C3146a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f127291d = obj;
                    this.f127292e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, no3.a aVar, t tVar) {
                this.f127288a = hVar;
                this.f127289b = aVar;
                this.f127290c = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3146a c3146a;
                if (eVar instanceof C3146a) {
                    c3146a = (C3146a) eVar;
                    int i15 = c3146a.f127292e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3146a.f127292e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3146a = new C3146a(eVar);
                    }
                } else {
                    c3146a = new C3146a(eVar);
                }
                Object obj2 = c3146a.f127291d;
                Object objE = uq.b.e();
                int i16 = c3146a.f127292e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f127288a;
                    mo3.c.a aVarB = this.f127289b.b(new no3.a.Params((mo3.b) obj, this.f127290c.b9(mo3.a.C3141a.f127189a), this.f127290c.b9(mo3.a.b.f127190a)));
                    c3146a.f127293f = vq.j.a(obj);
                    c3146a.f127295h = vq.j.a(c3146a);
                    c3146a.f127296j = vq.j.a(obj);
                    c3146a.f127297k = vq.j.a(hVar);
                    c3146a.f127298l = 0;
                    c3146a.f127292e = 1;
                    if (hVar.F(aVarB, c3146a) == objE) {
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

        public f(mu.g gVar, no3.a aVar, t tVar) {
            this.f127285a = gVar;
            this.f127286b = aVar;
            this.f127287c = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super mo3.c.a> hVar, tq.e eVar) {
            Object objA = this.f127285a.a(new a(hVar, this.f127286b, this.f127287c), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmo3/a$a;", "<unused var>", "Lmo3/b;", "Loq/i0;", "<anonymous>", "(Lmo3/a$a;Lmo3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<mo3.a.C3141a, mo3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127299e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f127299e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mo3.a.f> bVarY1 = t.this.Y1();
                mo3.a.f.C3142a c3142a = mo3.a.f.C3142a.f127194a;
                this.f127299e = 1;
                if (bVarY1.F(c3142a, this) == objE) {
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
        public final Object w(mo3.a.C3141a c3141a, mo3.b bVar, tq.e<? super i0> eVar) {
            return t.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmo3/a$e;", "<unused var>", "Lmo3/b;", "Loq/i0;", "<anonymous>", "(Lmo3/a$e;Lmo3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<mo3.a.e, mo3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127301e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f127301e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mo3.a.f> bVarY1 = t.this.Y1();
                mo3.a.f.e eVar = mo3.a.f.e.f127198a;
                this.f127301e = 1;
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
        public final Object w(mo3.a.e eVar, mo3.b bVar, tq.e<? super i0> eVar2) {
            return t.this.new h(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmo3/a$c;", "<unused var>", "Lmo3/b;", "Loq/i0;", "<anonymous>", "(Lmo3/a$c;Lmo3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<mo3.a.c, mo3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127303e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f127303e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mo3.a.f> bVarY1 = t.this.Y1();
                mo3.a.f.b bVar = mo3.a.f.b.f127195a;
                this.f127303e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(mo3.a.c cVar, mo3.b bVar, tq.e<? super i0> eVar) {
            return t.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lmo3/b$b;", "state", "Lk10/l;", "Lmo3/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<c0<mo3.b.C3144b>, tq.e<? super k10.l<? extends mo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f127306f;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mo3.b.Loading V(jo3.a aVar, mo3.b.C3144b c3144b) {
            return new mo3.b.Loading(((jo3.a.QrData) aVar).getQrCodeData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mo3.b.Deeplink X(jo3.a aVar, mo3.b.C3144b c3144b) {
            return new mo3.b.Deeplink(((jo3.a.QrText) aVar).getQrCode());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f127306f;
            uq.b.e();
            if (this.f127305e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final jo3.a aVar = t.this.institutionPayloadData;
            if (aVar instanceof jo3.a.QrData) {
                return c0Var.d(new er.l() { // from class: mo3.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.j.V(aVar, (b.C3144b) obj2);
                    }
                });
            }
            if (aVar instanceof jo3.a.QrText) {
                return c0Var.d(new er.l() { // from class: mo3.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.j.X(aVar, (b.C3144b) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<mo3.b.C3144b> c0Var, tq.e<? super k10.l<? extends mo3.b>> eVar) {
            return ((j) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            j jVar = t.this.new j(eVar);
            jVar.f127306f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lmo3/b$a;", "state", "Lk10/l;", "Lmo3/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<c0<mo3.b.Deeplink>, tq.e<? super k10.l<? extends mo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f127309f;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f127309f;
            Object objE = uq.b.e();
            int i15 = this.f127308e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            t tVar = t.this;
            String qrCode = ((mo3.b.Deeplink) c0Var.a()).getQrCode();
            this.f127309f = vq.j.a(c0Var);
            this.f127308e = 1;
            Object objF9 = tVar.F9(c0Var, qrCode, this);
            return objF9 == objE ? objE : objF9;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<mo3.b.Deeplink> c0Var, tq.e<? super k10.l<? extends mo3.b>> eVar) {
            return ((k) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            k kVar = t.this.new k(eVar);
            kVar.f127309f = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmo3/a$h;", "<unused var>", "Lk10/c0;", "Lmo3/b$a;", "state", "Lk10/l;", "Lmo3/b;", "<anonymous>", "(Lmo3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<mo3.a.h, c0<mo3.b.Deeplink>, tq.e<? super k10.l<? extends mo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127311e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f127312f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f127312f;
            Object objE = uq.b.e();
            int i15 = this.f127311e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            t tVar = t.this;
            String qrCode = ((mo3.b.Deeplink) c0Var.a()).getQrCode();
            this.f127312f = vq.j.a(c0Var);
            this.f127311e = 1;
            Object objF9 = tVar.F9(c0Var, qrCode, this);
            return objF9 == objE ? objE : objF9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mo3.a.h hVar, c0<mo3.b.Deeplink> c0Var, tq.e<? super k10.l<? extends mo3.b>> eVar) {
            l lVar = t.this.new l(eVar);
            lVar.f127312f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lmo3/b$d;", "state", "Lk10/l;", "Lmo3/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.p<c0<mo3.b.Loading>, tq.e<? super k10.l<? extends mo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f127315f;

        m(tq.e<? super m> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f127315f;
            Object objE = uq.b.e();
            int i15 = this.f127314e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            t tVar = t.this;
            this.f127315f = vq.j.a(c0Var);
            this.f127314e = 1;
            Object objO9 = tVar.O9(c0Var, this);
            return objO9 == objE ? objE : objO9;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<mo3.b.Loading> c0Var, tq.e<? super k10.l<? extends mo3.b>> eVar) {
            return ((m) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            m mVar = t.this.new m(eVar);
            mVar.f127315f = obj;
            return mVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmo3/a$h;", "<unused var>", "Lk10/c0;", "Lmo3/b$d;", "state", "Lk10/l;", "Lmo3/b;", "<anonymous>", "(Lmo3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<mo3.a.h, c0<mo3.b.Loading>, tq.e<? super k10.l<? extends mo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f127318f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f127318f;
            Object objE = uq.b.e();
            int i15 = this.f127317e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            t tVar = t.this;
            this.f127318f = vq.j.a(c0Var);
            this.f127317e = 1;
            Object objO9 = tVar.O9(c0Var, this);
            return objO9 == objE ? objE : objO9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mo3.a.h hVar, c0<mo3.b.Loading> c0Var, tq.e<? super k10.l<? extends mo3.b>> eVar) {
            n nVar = t.this.new n(eVar);
            nVar.f127318f = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmo3/a$i;", "<unused var>", "Lmo3/b$c;", "state", "Loq/i0;", "<anonymous>", "(Lmo3/a$i;Lmo3/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<mo3.a.i, mo3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f127321f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mo3.b.Initialized initialized = (mo3.b.Initialized) this.f127321f;
            Object objE = uq.b.e();
            int i15 = this.f127320e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                this.f127321f = vq.j.a(initialized);
                this.f127320e = 1;
                if (tVar.Q9(initialized, this) == objE) {
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
        public final Object w(mo3.a.i iVar, mo3.b.Initialized initialized, tq.e<? super i0> eVar) {
            o oVar = t.this.new o(eVar);
            oVar.f127321f = initialized;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmo3/a$h;", "<unused var>", "Lmo3/b$c;", "Loq/i0;", "<anonymous>", "(Lmo3/a$h;Lmo3/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<mo3.a.h, mo3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127323e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f127323e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(mo3.a.i.f127203a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mo3.a.h hVar, mo3.b.Initialized initialized, tq.e<? super i0> eVar) {
            return t.this.new p(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmo3/a$b;", "<unused var>", "Lmo3/b$c;", "Loq/i0;", "<anonymous>", "(Lmo3/a$b;Lmo3/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<mo3.a.b, mo3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127325e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f127325e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                this.f127325e = 1;
                if (tVar.E9(this) == objE) {
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
        public final Object w(mo3.a.b bVar, mo3.b.Initialized initialized, tq.e<? super i0> eVar) {
            return t.this.new q(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmo3/a$g;", "<unused var>", "Lmo3/b$c;", "state", "Loq/i0;", "<anonymous>", "(Lmo3/a$g;Lmo3/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<mo3.a.g, mo3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f127328f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mo3.b.Initialized initialized = (mo3.b.Initialized) this.f127328f;
            Object objE = uq.b.e();
            int i15 = this.f127327e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                String name = initialized.getInstitutionData().getName();
                List<co3.q> listC = initialized.c();
                this.f127328f = vq.j.a(initialized);
                this.f127327e = 1;
                if (tVar.M9(name, listC, this) == objE) {
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
        public final Object w(mo3.a.g gVar, mo3.b.Initialized initialized, tq.e<? super i0> eVar) {
            r rVar = t.this.new r(eVar);
            rVar.f127328f = initialized;
            return rVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmo3/a$d;", "<unused var>", "Lmo3/b$c;", "Loq/i0;", "<anonymous>", "(Lmo3/a$d;Lmo3/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<mo3.a.d, mo3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127330e;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f127330e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<mo3.a.f> bVarY1 = t.this.Y1();
                mo3.a.f.d dVar = mo3.a.f.d.f127197a;
                this.f127330e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(mo3.a.d dVar, mo3.b.Initialized initialized, tq.e<? super i0> eVar) {
            return t.this.new s(eVar).J(i0.f148189a);
        }
    }

    public t(yy.a aVar, no3.a aVar2, f0 f0Var, ac4.a aVar3, go3.d dVar, k0 k0Var, g04.g gVar, ib4.c cVar, jo3.a aVar4) {
        this.loadInstitutionsDataUseCase = f0Var;
        this.callActionWithLoaderUseCase = aVar3;
        this.fetchQrCodeDataUseCase = dVar;
        this.sendDataToInstitutionUseCase = k0Var;
        this.checkBiometricStatusUseCase = gVar;
        this.domainErrorMapper = cVar;
        this.institutionPayloadData = aVar4;
        this.stateMachine = aVar.a(mo3.b.C3144b.f127206a, new er.l() { // from class: mo3.j
            @Override // er.l
            public final Object b(Object obj) {
                return t.S9(this.f127230a, (k10.v) obj);
            }
        });
        this.state = a9(new f(e9().getState(), aVar2, this), mo3.c.a.C3145a.f127214a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (G9(r2, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        if (r5.F(r7, r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E9(tq.e<? super oq.i0> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mo3.t.E9(tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F9(c0<mo3.b.Deeplink> c0Var, String str, tq.e<? super k10.l<mo3.b.Loading>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new c(str, c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G9(dx.b bVar, tq.e<? super i0> eVar) {
        ib4.c.Params params;
        ib4.c.Params params2 = new ib4.c.Params(bVar, false, new er.l() { // from class: mo3.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.H9(this.f127235a, (ib4.c.b) obj);
            }
        }, 2, null);
        if (bVar instanceof dx.b.Business) {
            dx.b.Business.a type = ((dx.b.Business) bVar).getType();
            if (type == co3.a.EXPIRED_QR) {
                params = new ib4.c.Params(bVar, false, new er.l() { // from class: mo3.p
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.I9(this.f127236a, (ib4.c.b) obj);
                    }
                }, 2, null);
            } else if (type == co3.a.DOCUMENT_NOT_FOUND) {
                params = new ib4.c.Params(bVar, false, new er.l() { // from class: mo3.q
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.J9(this.f127237a, (ib4.c.b) obj);
                    }
                }, 2, null);
            } else if (type == co3.a.DRIVING_LICENCE_UPDATE_REQUIRED) {
                params = new ib4.c.Params(bVar, false, new er.l() { // from class: mo3.r
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.K9(this.f127238a, (ib4.c.b) obj);
                    }
                }, 2, null);
            } else if (type == co3.a.UNKNOWN_INSTITUTION) {
                params = new ib4.c.Params(bVar, false, new er.l() { // from class: mo3.s
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.L9(this.f127239a, (ib4.c.b) obj);
                    }
                }, 2, null);
            }
            params2 = params;
        }
        Object objF = Y1().F(new mo3.a.f.Error(this.domainErrorMapper.b(params2)), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(t tVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            tVar.d9(mo3.a.h.f127202a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            tVar.d9(mo3.a.c.f127191a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(t tVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.a.Primary) {
            tVar.d9(mo3.a.C3141a.f127189a);
        } else if ((bVar instanceof ib4.c.b.a.Secondary) || (bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            tVar.d9(mo3.a.c.f127191a);
        } else if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            throw new oq.p();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(t tVar, ib4.c.b bVar) {
        tVar.d9(mo3.a.c.f127191a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(t tVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.a.Primary) {
            tVar.d9(mo3.a.e.f127193a);
        } else {
            tVar.d9(mo3.a.c.f127191a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(t tVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.a.Primary) {
            tVar.d9(mo3.a.C3141a.f127189a);
        } else {
            tVar.d9(mo3.a.c.f127191a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M9(String str, List<? extends co3.q> list, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new mo3.a.f.Next(P9(str, list)), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N9(dx.i<i0, i0> isAuthenticated) {
        if (isAuthenticated instanceof dx.i.Right) {
            d9(mo3.a.i.f127203a);
        } else {
            if (!(isAuthenticated instanceof dx.i.Left)) {
                throw new oq.p();
            }
            d9(mo3.a.d.f127192a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O9(c0<mo3.b.Loading> c0Var, tq.e<? super k10.l<mo3.b.Initialized>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new d(c0Var, null), eVar, 1, null);
    }

    private final SummaryData P9(String name, List<? extends co3.q> list) {
        return new SummaryData(new SummaryData.a.Institutions(name), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Q9(mo3.b.Initialized initialized, tq.e<? super i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new e(initialized, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(mo3.b.class), new er.l() { // from class: mo3.i
            @Override // er.l
            public final Object b(Object obj) {
                return t.T9(this.f127229a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mo3.b.C3144b.class), new er.l() { // from class: mo3.k
            @Override // er.l
            public final Object b(Object obj) {
                return t.U9(this.f127231a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mo3.b.Deeplink.class), new er.l() { // from class: mo3.l
            @Override // er.l
            public final Object b(Object obj) {
                return t.V9(this.f127232a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mo3.b.Loading.class), new er.l() { // from class: mo3.m
            @Override // er.l
            public final Object b(Object obj) {
                return t.W9(this.f127233a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mo3.b.Initialized.class), new er.l() { // from class: mo3.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.X9(this.f127234a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T9(t tVar, k10.z zVar) {
        g gVar = tVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(mo3.a.C3141a.class), oVar, gVar);
        zVar.x(q0.c(mo3.a.e.class), oVar, tVar.new h(null));
        zVar.x(q0.c(mo3.a.c.class), oVar, tVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U9(t tVar, k10.z zVar) {
        zVar.A(tVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V9(t tVar, k10.z zVar) {
        zVar.A(tVar.new k(null));
        l lVar = tVar.new l(null);
        zVar.v(q0.c(mo3.a.h.class), k10.o.CANCEL_PREVIOUS, lVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W9(t tVar, k10.z zVar) {
        zVar.A(tVar.new m(null));
        n nVar = tVar.new n(null);
        zVar.v(q0.c(mo3.a.h.class), k10.o.CANCEL_PREVIOUS, nVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X9(t tVar, k10.z zVar) {
        o oVar = tVar.new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(mo3.a.i.class), oVar2, oVar);
        zVar.x(q0.c(mo3.a.h.class), oVar2, tVar.new p(null));
        zVar.x(q0.c(mo3.a.b.class), oVar2, tVar.new q(null));
        zVar.x(q0.c(mo3.a.g.class), oVar2, tVar.new r(null));
        zVar.x(q0.c(mo3.a.d.class), oVar2, tVar.new s(null));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: R9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(jo3.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<mo3.a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<mo3.b, mo3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<mo3.c.a> getState() {
        return this.state;
    }
}
