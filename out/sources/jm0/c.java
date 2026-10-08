package jm0;

import al0.BEFileInfo;
import al0.BEGenerateXmlResponse;
import fl0.BEChildInvalidationGenerateXmlData;
import fl0.BEChildInvalidationSubmitXmlData;
import ge4.x;
import gm0.GeneratePhysicalIdCardXmlInvalidationChildV4Request;
import gm0.PhysicalIdCardInvalidationChildInitRequest;
import gm0.PhysicalIdCardInvalidationChildInitResponse;
import gm0.PhysicalIdCardInvalidationChildXmlV4Response;
import gm0.SubmitPhysicalIdCardInvalidationChildV4Request;
import il0.BeChildAndParentsData;
import iy.b0;
import iy.c0;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import vq.j;
import wl0.n;
import wl0.o;
import wx.i;
import xl0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001c0\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Ljm0/c;", "Lrm0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lxl0/l;", "pickedFileToFileV4DtoMapper", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lxl0/l;)V", "Liy/b0;", "firstName", "lastName", "Lxw/g;", "pesel", "Ldx/i;", "Ldx/b;", "Lil0/a;", "b", "(Liy/b0;Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lal0/a;", "accessToken", "Lfl0/a;", "data", "Lal0/m;", "a", "(Liy/b0;Lfl0/a;Ltq/e;)Ljava/lang/Object;", "Lfl0/c;", "Loq/i0;", "c", "(Liy/b0;Lfl0/c;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lxl0/l;", "Lwl0/n;", "Loq/k;", "k", "()Lwl0/n;", "client", "Lwl0/o;", "d", "l", "()Lwl0/o;", "clientV4", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements rm0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l pickedFileToFileV4DtoMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k client;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k clientV4;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f103714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f103715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f103716f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f103718h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f103716f = obj;
            this.f103718h |= PKIFailureInfo.systemUnavail;
            return c.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/g6;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<PhysicalIdCardInvalidationChildXmlV4Response>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103719e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f103721g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ BEChildInvalidationGenerateXmlData f103722h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b0 b0Var, BEChildInvalidationGenerateXmlData bEChildInvalidationGenerateXmlData, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f103721g = b0Var;
            this.f103722h = bEChildInvalidationGenerateXmlData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f103719e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            o oVarL = c.this.l();
            String strE = c0.e(this.f103721g);
            BEChildInvalidationGenerateXmlData bEChildInvalidationGenerateXmlData = this.f103722h;
            i confirmationDocument = bEChildInvalidationGenerateXmlData.getConfirmationDocument();
            GeneratePhysicalIdCardXmlInvalidationChildV4Request k2VarG = dm0.a.g(bEChildInvalidationGenerateXmlData, confirmationDocument != null ? c.this.pickedFileToFileV4DtoMapper.b(new l.Params(confirmationDocument, BEFileInfo.a.Attachment)) : null);
            this.f103719e = 1;
            Object objB = oVarL.b(strE, k2VarG, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new b(this.f103721g, this.f103722h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<PhysicalIdCardInvalidationChildXmlV4Response>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: jm0.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2468c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f103723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f103724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f103725f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f103726g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f103728j;

        C2468c(tq.e<? super C2468c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f103726g = obj;
            this.f103728j |= PKIFailureInfo.systemUnavail;
            return c.this.b(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/e6;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<PhysicalIdCardInvalidationChildInitResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103729e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f103731g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b0 f103732h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ b0 f103733j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b0 b0Var, b0 b0Var2, b0 b0Var3, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f103731g = b0Var;
            this.f103732h = b0Var2;
            this.f103733j = b0Var3;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f103729e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            n nVarK = c.this.k();
            PhysicalIdCardInvalidationChildInitRequest physicalIdCardInvalidationChildInitRequest = new PhysicalIdCardInvalidationChildInitRequest(c0.e(this.f103731g), c0.e(this.f103732h), c0.e(this.f103733j));
            this.f103729e = 1;
            Object objA = nVarK.a(physicalIdCardInvalidationChildInitRequest, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new d(this.f103731g, this.f103732h, this.f103733j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<PhysicalIdCardInvalidationChildInitResponse>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103734e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f103736g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ BEChildInvalidationSubmitXmlData f103737h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b0 b0Var, BEChildInvalidationSubmitXmlData bEChildInvalidationSubmitXmlData, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f103736g = b0Var;
            this.f103737h = bEChildInvalidationSubmitXmlData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f103734e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            o oVarL = c.this.l();
            String strE = c0.e(this.f103736g);
            SubmitPhysicalIdCardInvalidationChildV4Request e7VarL = dm0.a.l(this.f103737h);
            this.f103734e = 1;
            Object objA = oVarL.a(strE, e7VarL, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new e(this.f103736g, this.f103737h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    public c(final w wVar, g0 g0Var, l lVar) {
        this.networkCallMediator = g0Var;
        this.pickedFileToFileV4DtoMapper = lVar;
        this.client = oq.l.a(new er.a() { // from class: jm0.a
            @Override // er.a
            public final Object a() {
                return c.j(wVar);
            }
        });
        this.clientV4 = oq.l.a(new er.a() { // from class: jm0.b
            @Override // er.a
            public final Object a() {
                return c.i(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o i(w wVar) {
        return (o) w.b(wVar, null, o.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n j(w wVar) {
        return (n) w.b(wVar, null, n.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n k() {
        return (n) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o l() {
        return (o) this.clientV4.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rm0.a
    public Object a(b0 b0Var, BEChildInvalidationGenerateXmlData bEChildInvalidationGenerateXmlData, tq.e<? super dx.i<? extends dx.b, BEGenerateXmlResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f103718h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f103718h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f103716f;
        Object objE = uq.b.e();
        int i16 = aVar.f103718h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(b0Var, bEChildInvalidationGenerateXmlData, null);
            aVar.f103714d = j.a(b0Var);
            aVar.f103715e = j.a(bEChildInvalidationGenerateXmlData);
            aVar.f103718h = 1;
            objB = g0Var.b(bVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return dm0.a.c((PhysicalIdCardInvalidationChildXmlV4Response) ((dx.i.Right) iVar).b());
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rm0.a
    public Object b(b0 b0Var, b0 b0Var2, b0 b0Var3, tq.e<? super dx.i<? extends dx.b, BeChildAndParentsData>> eVar) throws Throwable {
        C2468c c2468c;
        if (eVar instanceof C2468c) {
            c2468c = (C2468c) eVar;
            int i15 = c2468c.f103728j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c2468c.f103728j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c2468c = new C2468c(eVar);
            }
        } else {
            c2468c = new C2468c(eVar);
        }
        Object objB = c2468c.f103726g;
        Object objE = uq.b.e();
        int i16 = c2468c.f103728j;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(b0Var, b0Var2, b0Var3, null);
            c2468c.f103723d = j.a(b0Var);
            c2468c.f103724e = j.a(b0Var2);
            c2468c.f103725f = j.a(b0Var3);
            c2468c.f103728j = 1;
            objB = g0Var.b(dVar, c2468c);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(dm0.a.e((PhysicalIdCardInvalidationChildInitResponse) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // rm0.a
    public Object c(b0 b0Var, BEChildInvalidationSubmitXmlData bEChildInvalidationSubmitXmlData, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new e(b0Var, bEChildInvalidationSubmitXmlData, null), eVar);
    }
}
