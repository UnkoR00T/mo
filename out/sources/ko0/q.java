package ko0;

import eo0.EpuapApplicationType;
import eo0.FileHandler;
import eo0.OwTokens;
import eo0.b0;
import fv.y;
import ge4.x;
import java.util.List;
import jo0.ApplicationTypeDictionaryDto;
import jo0.EpuapSendMessageRequestDto;
import jo0.EpuapUploadAttachmentResponseDto;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.e0;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J,\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u000e2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010)R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lko0/q;", "Lmo0/i;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lpl/gov/coi/common/network/e0;", "multipartManager", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lpl/gov/coi/common/network/e0;)V", "Leo0/e0;", "Lfv/y$c;", "k", "(Leo0/e0;)Lfv/y$c;", "Ldx/i;", "Ldx/b;", "", "Leo0/a0;", "e", "(Ltq/e;)Ljava/lang/Object;", "Leo0/i0$a;", "owAccessToken", "file", "", "d", "(Leo0/i0$a;Leo0/e0;Ltq/e;)Ljava/lang/Object;", "Leo0/b0;", "request", "Loq/i0;", "a", "(Leo0/i0$a;Leo0/b0;Ltq/e;)Ljava/lang/Object;", "Leo0/y;", "attachmentId", "b", "(Leo0/i0$a;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Leo0/g0;", "messageId", "c", "(Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/w;", "Lpl/gov/coi/common/network/g0;", "Lpl/gov/coi/common/network/e0;", "Lho0/j;", "Loq/k;", "j", "()Lho0/j;", "epuapSendMessageClient", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements mo0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w httpServiceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e0 multipartManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k epuapSendMessageClient = oq.l.a(new er.a() { // from class: ko0.p
        @Override // er.a
        public final Object a() {
            return q.i(this.f112057a);
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f112063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f112064f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f112066h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112064f = obj;
            this.f112066h |= PKIFailureInfo.systemUnavail;
            return q.this.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112067e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f112069g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f112070h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(OwTokens.Access access, String str, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f112069g = access;
            this.f112070h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112067e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.j jVarJ = q.this.j();
            String strB = this.f112069g.b();
            String str = this.f112070h;
            this.f112067e = 1;
            Object objA = jVarJ.a(str, strB, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return q.this.new b(this.f112069g, this.f112070h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f112071d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f112073f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112071d = obj;
            this.f112073f |= PKIFailureInfo.systemUnavail;
            return q.this.e(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/l;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<ApplicationTypeDictionaryDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112074e;

        d(tq.e<? super d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112074e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.j jVarJ = q.this.j();
            this.f112074e = 1;
            Object objD = jVarJ.d(this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return q.this.new d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ApplicationTypeDictionaryDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112076d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f112077e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f112078f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f112080h;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112078f = obj;
            this.f112080h |= PKIFailureInfo.systemUnavail;
            return q.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112081e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f112083g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f112084h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(OwTokens.Access access, String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f112083g = access;
            this.f112084h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112081e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.j jVarJ = q.this.j();
            String strB = this.f112083g.b();
            String str = this.f112084h;
            this.f112081e = 1;
            Object objE2 = jVarJ.e(str, strB, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return q.this.new f(this.f112083g, this.f112084h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f112086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f112087f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f112089h;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112087f = obj;
            this.f112089h |= PKIFailureInfo.systemUnavail;
            return q.this.d(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/r0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<EpuapUploadAttachmentResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112090e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f112092g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ FileHandler f112093h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(OwTokens.Access access, FileHandler fileHandler, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f112092g = access;
            this.f112093h = fileHandler;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112090e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.j jVarJ = q.this.j();
            String strB = this.f112092g.b();
            y.c cVarK = q.this.k(this.f112093h);
            this.f112090e = 1;
            Object objC = jVarJ.c(strB, cVarK, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return q.this.new h(this.f112092g, this.f112093h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<EpuapUploadAttachmentResponseDto>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112094e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f112096g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b0 f112097h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(OwTokens.Access access, b0 b0Var, tq.e<? super i> eVar) {
            super(1, eVar);
            this.f112096g = access;
            this.f112097h = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112094e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.j jVarJ = q.this.j();
            String strB = this.f112096g.b();
            EpuapSendMessageRequestDto epuapSendMessageRequestDtoF = io0.b.f(this.f112097h);
            this.f112094e = 1;
            Object objB = jVarJ.b(strB, epuapSendMessageRequestDtoF, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return q.this.new i(this.f112096g, this.f112097h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((i) M(eVar)).J(i0.f148189a);
        }
    }

    public q(w wVar, g0 g0Var, e0 e0Var) {
        this.httpServiceFactory = wVar;
        this.networkCallMediator = g0Var;
        this.multipartManager = e0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ho0.j i(q qVar) {
        return (ho0.j) w.b(qVar.httpServiceFactory, null, ho0.j.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ho0.j j() {
        return (ho0.j) this.epuapSendMessageClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y.c k(FileHandler fileHandler) {
        return e0.a(this.multipartManager, fileHandler.getFile(), fileHandler.getMetadata().getName(), fileHandler.getMetadata().getExtension(), fileHandler.getMimeType(), null, 16, null);
    }

    @Override // mo0.i
    public Object a(OwTokens.Access access, b0 b0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new i(access, b0Var, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.i
    public Object b(OwTokens.Access access, String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f112080h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f112080h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f112078f;
        Object objE = uq.b.e();
        int i16 = eVar2.f112080h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(access, str, null);
            eVar2.f112076d = vq.j.a(access);
            eVar2.f112077e = vq.j.a(str);
            eVar2.f112080h = 1;
            objB = g0Var.b(fVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return new dx.i.Right(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.i
    public Object c(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f112066h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f112066h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f112064f;
        Object objE = uq.b.e();
        int i16 = aVar.f112066h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(access, str, null);
            aVar.f112062d = vq.j.a(str);
            aVar.f112063e = vq.j.a(access);
            aVar.f112066h = 1;
            objB = g0Var.b(bVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
            return bVar2 instanceof dx.b.g.c ? new dx.i.Right(i0.f148189a) : new dx.i.Left(bVar2);
        }
        if (iVar instanceof dx.i.Right) {
            return iVar;
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.i
    public Object d(OwTokens.Access access, FileHandler fileHandler, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f112089h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f112089h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f112087f;
        Object objE = uq.b.e();
        int i16 = gVar.f112089h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(access, fileHandler, null);
            gVar.f112085d = vq.j.a(access);
            gVar.f112086e = vq.j.a(fileHandler);
            gVar.f112089h = 1;
            objB = g0Var.b(hVar, gVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(((EpuapUploadAttachmentResponseDto) ((dx.i.Right) iVar).b()).getAttachmentId());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.i
    public Object e(tq.e<? super dx.i<? extends dx.b, ? extends List<EpuapApplicationType>>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f112073f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f112073f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f112071d;
        Object objE = uq.b.e();
        int i16 = cVar.f112073f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(null);
            cVar.f112073f = 1;
            objB = g0Var.b(dVar, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(io0.a.O((ApplicationTypeDictionaryDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
