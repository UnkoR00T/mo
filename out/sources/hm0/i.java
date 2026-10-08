package hm0;

import al0.Adult;
import al0.ApplicantDataModel;
import al0.ApplicationReason;
import al0.BEFileInfo;
import al0.BEGenerateXmlResponse;
import gm0.ApplicationReasonDto;
import gm0.GeneratePhysicalIdCardXmlApplicationV4Request;
import gm0.PhysicalIdCardApplicationInitResponse;
import gm0.PhysicalIdCardApplicationReasonsResponse;
import gm0.PhysicalIdCardXmlApplicationV4Response;
import gm0.SubmitPhysicalIdCardApplicationV4Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJT\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020&0\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001aH\u0096@¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010+R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010-\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lhm0/i;", "Lpm0/d;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lxl0/a;", "adultToRequestMapper", "Lxl0/g;", "idCardApplicationDataToRequestMapper", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lxl0/a;Lxl0/g;)V", "Ldx/i;", "Ldx/b;", "Lal0/e;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lal0/a;", "accessToken", "Lal0/d;", "data", "Lal0/m;", "d", "(Liy/b0;Lal0/d;Ltq/e;)Ljava/lang/Object;", "Lal0/g;", "ownerWithAge", "", "Lal0/h;", "c", "(Lal0/g;Ltq/e;)Ljava/lang/Object;", "Lal0/b0;", "idCardApplicationData", "Lry/a;", "signedBase64Xml", "", "officeEdorAddress", "Lal0/l;", "filesInfo", "Loq/i0;", "b", "(Liy/b0;Lal0/b0;Liy/b0;Lal0/g;Ljava/lang/String;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lxl0/a;", "Lxl0/g;", "Lwl0/k;", "Loq/k;", "m", "()Lwl0/k;", "client", "Lwl0/l;", "e", "n", "()Lwl0/l;", "clientV4", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements pm0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xl0.a adultToRequestMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xl0.g idCardApplicationDataToRequestMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k clientV4;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85423d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85424e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85425f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f85427h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85425f = obj;
            this.f85427h |= PKIFailureInfo.systemUnavail;
            return i.this.d(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/x6;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super ge4.x<PhysicalIdCardXmlApplicationV4Response>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85428e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85430g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Adult f85431h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(iy.b0 b0Var, Adult adult, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f85430g = b0Var;
            this.f85431h = adult;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85428e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.l lVarN = i.this.n();
            String strE = iy.c0.e(this.f85430g);
            GeneratePhysicalIdCardXmlApplicationV4Request generatePhysicalIdCardXmlApplicationV4RequestC = i.this.adultToRequestMapper.b(new xl0.a.Params(this.f85431h));
            this.f85428e = 1;
            Object objA = lVarN.a(strE, generatePhysicalIdCardXmlApplicationV4RequestC, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return i.this.new b(this.f85430g, this.f85431h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PhysicalIdCardXmlApplicationV4Response>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f85432d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f85434f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85432d = obj;
            this.f85434f |= PKIFailureInfo.systemUnavail;
            return i.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/u5;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super ge4.x<PhysicalIdCardApplicationInitResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85435e;

        d(tq.e<? super d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85435e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.k kVarM = i.this.m();
            this.f85435e = 1;
            Object objA = kVarM.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return i.this.new d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PhysicalIdCardApplicationInitResponse>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f85437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f85438e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f85440g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f85438e = obj;
            this.f85440g |= PKIFailureInfo.systemUnavail;
            return i.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lgm0/v5;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super ge4.x<PhysicalIdCardApplicationReasonsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85441e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ al0.g f85443g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(al0.g gVar, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f85443g = gVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85441e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.k kVarM = i.this.m();
            gm0.c cVarA = xl0.f.a(this.f85443g);
            this.f85441e = 1;
            Object objC = kVarM.c(cVarA, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return i.this.new f(this.f85443g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<PhysicalIdCardApplicationReasonsResponse>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.l<tq.e<? super ge4.x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85444e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85446g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ iy.b0 f85447h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ al0.b0 f85448j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ al0.g f85449k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f85450l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ List<BEFileInfo> f85451m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(iy.b0 b0Var, iy.b0 b0Var2, al0.b0 b0Var3, al0.g gVar, String str, List<BEFileInfo> list, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f85446g = b0Var;
            this.f85447h = b0Var2;
            this.f85448j = b0Var3;
            this.f85449k = gVar;
            this.f85450l = str;
            this.f85451m = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85444e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            wl0.l lVarN = i.this.n();
            String strE = iy.c0.e(this.f85446g);
            SubmitPhysicalIdCardApplicationV4Request submitPhysicalIdCardApplicationV4RequestC = i.this.idCardApplicationDataToRequestMapper.b(new xl0.g.Params(this.f85447h, this.f85448j, this.f85449k, this.f85450l, this.f85451m, null));
            this.f85444e = 1;
            Object objB = lVarN.b(strE, submitPhysicalIdCardApplicationV4RequestC, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return i.this.new g(this.f85446g, this.f85447h, this.f85448j, this.f85449k, this.f85450l, this.f85451m, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<i0>> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    public i(final pl.gov.coi.common.network.w wVar, g0 g0Var, xl0.a aVar, xl0.g gVar) {
        this.networkCallMediator = g0Var;
        this.adultToRequestMapper = aVar;
        this.idCardApplicationDataToRequestMapper = gVar;
        this.client = oq.l.a(new er.a() { // from class: hm0.g
            @Override // er.a
            public final Object a() {
                return i.l(wVar);
            }
        });
        this.clientV4 = oq.l.a(new er.a() { // from class: hm0.h
            @Override // er.a
            public final Object a() {
                return i.k(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wl0.l k(pl.gov.coi.common.network.w wVar) {
        return (wl0.l) pl.gov.coi.common.network.w.b(wVar, null, wl0.l.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wl0.k l(pl.gov.coi.common.network.w wVar) {
        return (wl0.k) pl.gov.coi.common.network.w.b(wVar, null, wl0.k.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wl0.k m() {
        return (wl0.k) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wl0.l n() {
        return (wl0.l) this.clientV4.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.d
    public Object a(tq.e<? super dx.i<? extends dx.b, ApplicantDataModel>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f85434f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f85434f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f85432d;
        Object objE = uq.b.e();
        int i16 = cVar.f85434f;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(null);
            cVar.f85434f = 1;
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
            return new dx.i.Right(xl0.f.c((PhysicalIdCardApplicationInitResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    @Override // pm0.d
    public Object b(iy.b0 b0Var, al0.b0 b0Var2, iy.b0 b0Var3, al0.g gVar, String str, List<BEFileInfo> list, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new g(b0Var, b0Var3, b0Var2, gVar, str, list, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.d
    public Object c(al0.g gVar, tq.e<? super dx.i<? extends dx.b, ? extends List<ApplicationReason>>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f85440g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f85440g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f85438e;
        Object objE = uq.b.e();
        int i16 = eVar2.f85440g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(gVar, null);
            eVar2.f85437d = vq.j.a(gVar);
            eVar2.f85440g = 1;
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
        List<ApplicationReasonDto> listA = ((PhysicalIdCardApplicationReasonsResponse) ((dx.i.Right) iVar).b()).a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(xl0.f.g((ApplicationReasonDto) it.next()));
        }
        return new dx.i.Right(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pm0.d
    public Object d(iy.b0 b0Var, Adult adult, tq.e<? super dx.i<? extends dx.b, BEGenerateXmlResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f85427h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f85427h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f85425f;
        Object objE = uq.b.e();
        int i16 = aVar.f85427h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(b0Var, adult, null);
            aVar.f85423d = vq.j.a(b0Var);
            aVar.f85424e = vq.j.a(adult);
            aVar.f85427h = 1;
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
            return xl0.f.h((PhysicalIdCardXmlApplicationV4Response) ((dx.i.Right) iVar).b());
        }
        throw new oq.p();
    }
}
