package av0;

import cv0.BEPersonalData;
import cv0.BETravel;
import cv0.BETravelRequestModel;
import dx.i;
import er.l;
import ge4.x;
import java.util.List;
import java.util.Map;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import zu0.TravelInitResponse;
import zu0.TravelRequest;
import zu0.TravelsV2Response;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0011\u001a \u0012\u0004\u0012\u00020\t\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r0\bH\u0096@¢\u0006\u0004\b\u0011\u0010\fJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lav0/d;", "Ldv0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Lcv0/f;", "c", "(Ltq/e;)Ljava/lang/Object;", "", "Lcv0/p;", "", "Lcv0/n;", "d", "Lcv0/o;", "model", "Loq/i0;", "f", "(Lcv0/o;Ltq/e;)Ljava/lang/Object;", "Lcv0/q;", "travelUuid", "g", "(Ljava/lang/String;Lcv0/o;Ltq/e;)Ljava/lang/Object;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "Lpl/gov/coi/common/network/g0;", "Lxu0/c;", "b", "Loq/k;", "i", "()Lxu0/c;", "client", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements dv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14631e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f14633g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f14633g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f14631e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            xu0.c cVarI = d.this.i();
            String str = this.f14633g;
            this.f14631e = 1;
            Object objD = cVarI.d(str, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new a(this.f14633g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f14634d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f14636f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f14634d = obj;
            this.f14636f |= PKIFailureInfo.systemUnavail;
            return d.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lzu0/s;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements l<tq.e<? super x<TravelInitResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14637e;

        c(tq.e<? super c> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f14637e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            xu0.c cVarI = d.this.i();
            this.f14637e = 1;
            Object objE2 = cVarI.e(this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new c(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<TravelInitResponse>> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: av0.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0322d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f14639d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f14641f;

        C0322d(tq.e<? super C0322d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f14639d = obj;
            this.f14641f |= PKIFailureInfo.systemUnavail;
            return d.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lzu0/b0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements l<tq.e<? super x<TravelsV2Response>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14642e;

        e(tq.e<? super e> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f14642e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            xu0.c cVarI = d.this.i();
            this.f14642e = 1;
            Object objB = cVarI.b(this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new e(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<TravelsV2Response>> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14644e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BETravelRequestModel f14646g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(BETravelRequestModel bETravelRequestModel, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f14646g = bETravelRequestModel;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f14644e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            xu0.c cVarI = d.this.i();
            TravelRequest travelRequestE = yu0.a.E(this.f14646g);
            this.f14644e = 1;
            Object objC = cVarI.c(travelRequestE, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new f(this.f14646g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14647e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f14649g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ BETravelRequestModel f14650h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, BETravelRequestModel bETravelRequestModel, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f14649g = str;
            this.f14650h = bETravelRequestModel;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f14647e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            xu0.c cVarI = d.this.i();
            String str = this.f14649g;
            TravelRequest travelRequestE = yu0.a.E(this.f14650h);
            this.f14647e = 1;
            Object objA = cVarI.a(str, travelRequestE, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new g(this.f14649g, this.f14650h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    public d(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: av0.c
            @Override // er.a
            public final Object a() {
                return d.h(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xu0.c h(w wVar) {
        return (xu0.c) w.b(wVar, null, xu0.c.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xu0.c i() {
        return (xu0.c) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dv0.b
    public Object c(tq.e<? super i<? extends dx.b, BEPersonalData>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f14636f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f14636f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objB = bVar.f14634d;
        Object objE = uq.b.e();
        int i16 = bVar.f14636f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            c cVar = new c(null);
            bVar.f14636f = 1;
            objB = g0Var.b(cVar, bVar);
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
            return new i.Right(yu0.a.g((TravelInitResponse) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dv0.b
    public Object d(tq.e<? super i<? extends dx.b, ? extends Map<cv0.p, ? extends List<BETravel>>>> eVar) throws Throwable {
        C0322d c0322d;
        if (eVar instanceof C0322d) {
            c0322d = (C0322d) eVar;
            int i15 = c0322d.f14641f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c0322d.f14641f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c0322d = new C0322d(eVar);
            }
        } else {
            c0322d = new C0322d(eVar);
        }
        Object objB = c0322d.f14639d;
        Object objE = uq.b.e();
        int i16 = c0322d.f14641f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            e eVar2 = new e(null);
            c0322d.f14641f = 1;
            objB = g0Var.b(eVar2, c0322d);
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
            return new i.Right(yu0.a.x((TravelsV2Response) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // dv0.b
    public Object e(String str, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new a(str, null), eVar);
    }

    @Override // dv0.b
    public Object f(BETravelRequestModel bETravelRequestModel, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new f(bETravelRequestModel, null), eVar);
    }

    @Override // dv0.b
    public Object g(String str, BETravelRequestModel bETravelRequestModel, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new g(str, bETravelRequestModel, null), eVar);
    }
}
