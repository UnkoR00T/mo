package hm0;

import al0.BEFileInfo;
import al0.BEGenerateXmlResponse;
import al0.IdCardSuspensionChildData;
import gl0.GenerateChildXmlData;
import gl0.SubmitChildXmlData;
import gm0.FileV4Dto;
import gm0.GeneratePhysicalIdCardXmlSuspensionChildV4Request;
import gm0.PhysicalIdCardSuspensionChildInitRequest;
import gm0.PhysicalIdCardSuspensionChildInitResponse;
import gm0.PhysicalIdCardSuspensionChildXmlV4Response;
import gm0.SubmitPhysicalIdCardSuspensionChildV4Request;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001c0\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lhm0/a0;", "Lpm0/l;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lxl0/l;", "pickedFileToFileV4DtoMapper", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lxl0/l;)V", "Liy/b0;", "firstName", "lastName", "Lxw/g;", "pesel", "Ldx/i;", "Ldx/b;", "Lal0/d0;", "b", "(Liy/b0;Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lal0/a;", "accessToken", "Lgl0/b;", "data", "Lal0/m;", "a", "(Liy/b0;Lgl0/b;Ltq/e;)Ljava/lang/Object;", "Lgl0/d;", "Loq/i0;", "c", "(Liy/b0;Lgl0/d;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lxl0/l;", "Lwl0/r;", "Loq/k;", "k", "()Lwl0/r;", "client", "Lwl0/s;", "d", "l", "()Lwl0/s;", "clientV4", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 implements pm0.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xl0.l pickedFileToFileV4DtoMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientV4;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85297f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f85299h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85297f = obj;
            this.f85299h |= PKIFailureInfo.systemUnavail;
            return a0.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/r6;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super ge4.x<PhysicalIdCardSuspensionChildXmlV4Response>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85300e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85302g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ GenerateChildXmlData f85303h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(iy.b0 b0Var, GenerateChildXmlData generateChildXmlData, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f85302g = b0Var;
            this.f85303h = generateChildXmlData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            FileV4Dto fileV4DtoB;
            Object objE = uq.b.e();
            int i15 = this.f85300e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.s sVarL = a0.this.l();
            String strE = iy.c0.e(this.f85302g);
            GenerateChildXmlData generateChildXmlData = this.f85303h;
            wx.i attachment = generateChildXmlData.getAttachment();
            GeneratePhysicalIdCardXmlSuspensionChildV4Request l2VarE = bm0.a.e(generateChildXmlData, (attachment == null || (fileV4DtoB = a0.this.pickedFileToFileV4DtoMapper.b(new xl0.l.Params(attachment, BEFileInfo.a.Attachment))) == null) ? null : pq.v.e(fileV4DtoB));
            this.f85300e = 1;
            Object objA = sVarL.a(strE, l2VarE, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return a0.this.new b(this.f85302g, this.f85303h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PhysicalIdCardSuspensionChildXmlV4Response>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f85306f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f85307g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f85309j;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85307g = obj;
            this.f85309j |= PKIFailureInfo.systemUnavail;
            return a0.this.b(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/p6;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super ge4.x<PhysicalIdCardSuspensionChildInitResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85310e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85312g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85313h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85314j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f85312g = b0Var;
            this.f85313h = b0Var2;
            this.f85314j = b0Var3;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85310e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.r rVarK = a0.this.k();
            PhysicalIdCardSuspensionChildInitRequest physicalIdCardSuspensionChildInitRequest = new PhysicalIdCardSuspensionChildInitRequest(iy.c0.e(this.f85312g), iy.c0.e(this.f85313h), iy.c0.e(this.f85314j));
            this.f85310e = 1;
            Object objA = rVarK.a(physicalIdCardSuspensionChildInitRequest, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return a0.this.new d(this.f85312g, this.f85313h, this.f85314j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PhysicalIdCardSuspensionChildInitResponse>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super ge4.x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85315e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85317g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ SubmitChildXmlData f85318h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(iy.b0 b0Var, SubmitChildXmlData submitChildXmlData, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f85317g = b0Var;
            this.f85318h = submitChildXmlData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85315e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.s sVarL = a0.this.l();
            String strE = iy.c0.e(this.f85317g);
            SubmitPhysicalIdCardSuspensionChildV4Request f7VarH = bm0.a.h(this.f85318h);
            this.f85315e = 1;
            Object objB = sVarL.b(strE, f7VarH, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return a0.this.new e(this.f85317g, this.f85318h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<i0>> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    public a0(final pl.gov.coi.common.network.w wVar, g0 g0Var, xl0.l lVar) {
        this.networkCallMediator = g0Var;
        this.pickedFileToFileV4DtoMapper = lVar;
        this.client = oq.l.a(new er.a() { // from class: hm0.y
            @Override // er.a
            public final Object a() {
                return a0.j(wVar);
            }
        });
        this.clientV4 = oq.l.a(new er.a() { // from class: hm0.z
            @Override // er.a
            public final Object a() {
                return a0.i(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wl0.s i(pl.gov.coi.common.network.w wVar) {
        return (wl0.s) pl.gov.coi.common.network.w.b(wVar, null, wl0.s.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wl0.r j(pl.gov.coi.common.network.w wVar) {
        return (wl0.r) pl.gov.coi.common.network.w.b(wVar, null, wl0.r.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wl0.r k() {
        return (wl0.r) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wl0.s l() {
        return (wl0.s) this.clientV4.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.l
    public Object a(iy.b0 b0Var, GenerateChildXmlData generateChildXmlData, tq.e<? super dx.i<? extends dx.b, BEGenerateXmlResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f85299h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f85299h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f85297f;
        Object objE = uq.b.e();
        int i16 = aVar.f85299h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(b0Var, generateChildXmlData, null);
            aVar.f85295d = vq.j.a(b0Var);
            aVar.f85296e = vq.j.a(generateChildXmlData);
            aVar.f85299h = 1;
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
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return bm0.a.a((PhysicalIdCardSuspensionChildXmlV4Response) ((dx.i.Right) iVar).b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.l
    public Object b(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, tq.e<? super dx.i<? extends dx.b, IdCardSuspensionChildData>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f85309j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f85309j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f85307g;
        Object objE = uq.b.e();
        int i16 = cVar.f85309j;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(b0Var, b0Var2, b0Var3, null);
            cVar.f85304d = vq.j.a(b0Var);
            cVar.f85305e = vq.j.a(b0Var2);
            cVar.f85306f = vq.j.a(b0Var3);
            cVar.f85309j = 1;
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
            return new dx.i.Right(xl0.i.a((PhysicalIdCardSuspensionChildInitResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    @Override // pm0.l
    public Object c(iy.b0 b0Var, SubmitChildXmlData submitChildXmlData, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new e(b0Var, submitChildXmlData, null), eVar);
    }
}
