package zq0;

import dx.i;
import er.l;
import fv.e0;
import ge4.x;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import sq0.BECreateNationalCourtRegisterSubscriptionRequest;
import sq0.BENationalCourtRegister;
import sq0.BESubscription;
import tq0.BEFile;
import vq.j;
import wx.FileContent;
import yq0.CreateNationalCourtRegisterSubscriptionRequest;
import yq0.CreateNationalCourtRegisterSubscriptionResponse;
import yq0.NationalCourtRegisterEntriesResponse;
import yq0.UpdateNationalCourtRegisterSubscriptionRequest;
import yq0.UpdateNationalCourtRegisterSubscriptionResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010\u0013\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lzq0/g;", "Lbr0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Lsq0/g;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lsq0/d;", "id", "Ltq0/d;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lsq0/b;", "request", "Lsq0/i;", "d", "(Lsq0/b;Ltq/e;)Ljava/lang/Object;", "Lsq0/c;", "Lsq0/k;", "b", "(Lsq0/c;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lwq0/c;", "Loq/k;", "g", "()Lwq0/c;", "nationalCourtRegister", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements br0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k nationalCourtRegister;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f236324e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f236326g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236324e = obj;
            this.f236326g |= PKIFailureInfo.systemUnavail;
            return g.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lyq0/d;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements l<tq.e<? super x<CreateNationalCourtRegisterSubscriptionResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236327e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BECreateNationalCourtRegisterSubscriptionRequest f236329g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(BECreateNationalCourtRegisterSubscriptionRequest bECreateNationalCourtRegisterSubscriptionRequest, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f236329g = bECreateNationalCourtRegisterSubscriptionRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236327e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wq0.c cVarG = g.this.g();
            CreateNationalCourtRegisterSubscriptionRequest createNationalCourtRegisterSubscriptionRequestH = xq0.b.h(this.f236329g);
            this.f236327e = 1;
            Object objC = cVarG.c(createNationalCourtRegisterSubscriptionRequestH, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return g.this.new b(this.f236329g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<CreateNationalCourtRegisterSubscriptionResponse>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f236331e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f236333g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236331e = obj;
            this.f236333g |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfv/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements l<tq.e<? super x<e0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236334e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f236336g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f236336g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236334e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wq0.c cVarG = g.this.g();
            String str = this.f236336g;
            this.f236334e = 1;
            Object objB = cVarG.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return g.this.new d(this.f236336g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<e0>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236337d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f236338e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f236340g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236338e = obj;
            this.f236340g |= PKIFailureInfo.systemUnavail;
            return g.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lyq0/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements l<tq.e<? super x<UpdateNationalCourtRegisterSubscriptionResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236341e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ sq0.c f236343g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(sq0.c cVar, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f236343g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236341e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wq0.c cVarG = g.this.g();
            UpdateNationalCourtRegisterSubscriptionRequest updateNationalCourtRegisterSubscriptionRequestI = xq0.b.i(this.f236343g);
            this.f236341e = 1;
            Object objD = cVarG.d(updateNationalCourtRegisterSubscriptionRequestI, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return g.this.new f(this.f236343g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<UpdateNationalCourtRegisterSubscriptionResponse>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: zq0.g$g, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C6386g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f236344d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f236346f;

        C6386g(tq.e<? super C6386g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236344d = obj;
            this.f236346f |= PKIFailureInfo.systemUnavail;
            return g.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lyq0/w;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements l<tq.e<? super x<NationalCourtRegisterEntriesResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236347e;

        h(tq.e<? super h> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236347e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wq0.c cVarG = g.this.g();
            this.f236347e = 1;
            Object objA = cVarG.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return g.this.new h(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<NationalCourtRegisterEntriesResponse>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    public g(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.nationalCourtRegister = oq.l.a(new er.a() { // from class: zq0.f
            @Override // er.a
            public final Object a() {
                return g.h(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wq0.c g() {
        return (wq0.c) this.nationalCourtRegister.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wq0.c h(w wVar) {
        return (wq0.c) w.b(wVar, null, wq0.c.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // br0.b
    public Object a(tq.e<? super i<? extends dx.b, BENationalCourtRegister>> eVar) throws Throwable {
        C6386g c6386g;
        if (eVar instanceof C6386g) {
            c6386g = (C6386g) eVar;
            int i15 = c6386g.f236346f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c6386g.f236346f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c6386g = new C6386g(eVar);
            }
        } else {
            c6386g = new C6386g(eVar);
        }
        Object objB = c6386g.f236344d;
        Object objE = uq.b.e();
        int i16 = c6386g.f236346f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(null);
            c6386g.f236346f = 1;
            objB = g0Var.b(hVar, c6386g);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return xq0.b.c((NationalCourtRegisterEntriesResponse) ((i.Right) iVar).b());
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // br0.b
    public Object b(sq0.c cVar, tq.e<? super i<? extends dx.b, sq0.k>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f236340g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f236340g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f236338e;
        Object objE = uq.b.e();
        int i16 = eVar2.f236340g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(cVar, null);
            eVar2.f236337d = j.a(cVar);
            eVar2.f236340g = 1;
            objB = g0Var.b(fVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return xq0.b.f((UpdateNationalCourtRegisterSubscriptionResponse) ((i.Right) iVar).b());
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // br0.b
    public Object c(String str, tq.e<? super i<? extends dx.b, BEFile>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f236333g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f236333g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f236331e;
        Object objE = uq.b.e();
        int i16 = cVar.f236333g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(str, null);
            cVar.f236330d = j.a(str);
            cVar.f236333g = 1;
            objB = g0Var.b(dVar, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(new BEFile(new FileContent(((e0) ((i.Right) iVar).b()).h())));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // br0.b
    public Object d(BECreateNationalCourtRegisterSubscriptionRequest bECreateNationalCourtRegisterSubscriptionRequest, tq.e<? super i<? extends dx.b, BESubscription>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f236326g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f236326g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f236324e;
        Object objE = uq.b.e();
        int i16 = aVar.f236326g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(bECreateNationalCourtRegisterSubscriptionRequest, null);
            aVar.f236323d = j.a(bECreateNationalCourtRegisterSubscriptionRequest);
            aVar.f236326g = 1;
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
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return xq0.b.b((CreateNationalCourtRegisterSubscriptionResponse) ((i.Right) iVar).b());
        }
        throw new p();
    }
}
