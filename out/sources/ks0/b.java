package ks0;

import ge4.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import js0.AliasDto;
import js0.BlikTransactionDto;
import js0.StartBlikPaymentRequestDto;
import js0.StartOneClickBlikPaymentRequestDto;
import js0.StartPaymentResultDto;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pq.v;
import ur0.BEAlias;
import ur0.BEStartBlikPaymentRequest;
import ur0.BEStartOneClickBlikPaymentRequest;
import ur0.BEStartPaymentResult;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lks0/b;", "Lms0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "", "Lur0/a;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "transactionId", "Lur0/b;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lur0/e;", "startBlikPaymentRequest", "Lur0/g;", "c", "(Lur0/e;Ltq/e;)Ljava/lang/Object;", "Lur0/f;", "startOneClickBlikPaymentRequest", "d", "(Lur0/f;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lhs0/a;", "Loq/k;", "h", "()Lhs0/a;", "blikClient", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements ms0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k blikClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f112341d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f112343f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112341d = obj;
            this.f112343f |= PKIFailureInfo.systemUnavail;
            return b.this.a(this);
        }
    }

    /* JADX INFO: renamed from: ks0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Ljs0/b;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C2721b extends vq.k implements er.l<tq.e<? super x<List<? extends AliasDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112344e;

        C2721b(tq.e<? super C2721b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112344e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.a aVarH = b.this.h();
            this.f112344e = 1;
            Object objA = aVarH.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C2721b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<List<AliasDto>>> eVar) {
            return ((C2721b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112347e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112349g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112347e = obj;
            this.f112349g |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljs0/e;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<BlikTransactionDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112350e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112352g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f112352g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112350e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.a aVarH = b.this.h();
            String str = this.f112352g;
            this.f112350e = 1;
            Object objB = aVarH.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new d(this.f112352g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<BlikTransactionDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112354e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112356g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112354e = obj;
            this.f112356g |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljs0/a1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<StartPaymentResultDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112357e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BEStartOneClickBlikPaymentRequest f112359g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(BEStartOneClickBlikPaymentRequest bEStartOneClickBlikPaymentRequest, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f112359g = bEStartOneClickBlikPaymentRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112357e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.a aVarH = b.this.h();
            StartOneClickBlikPaymentRequestDto startOneClickBlikPaymentRequestDtoE = is0.c.E(this.f112359g);
            this.f112357e = 1;
            Object objC = aVarH.c(startOneClickBlikPaymentRequestDtoE, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new f(this.f112359g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<StartPaymentResultDto>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112361e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112363g;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112361e = obj;
            this.f112363g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljs0/a1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<StartPaymentResultDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112364e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BEStartBlikPaymentRequest f112366g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(BEStartBlikPaymentRequest bEStartBlikPaymentRequest, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f112366g = bEStartBlikPaymentRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112364e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.a aVarH = b.this.h();
            StartBlikPaymentRequestDto startBlikPaymentRequestDtoD = is0.c.D(this.f112366g);
            this.f112364e = 1;
            Object objD = aVarH.d(startBlikPaymentRequestDtoD, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new h(this.f112366g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<StartPaymentResultDto>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.blikClient = oq.l.a(new er.a() { // from class: ks0.a
            @Override // er.a
            public final Object a() {
                return b.g(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs0.a g(w wVar) {
        return (hs0.a) w.b(wVar, null, hs0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs0.a h() {
        return (hs0.a) this.blikClient.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.a
    public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<BEAlias>>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f112343f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f112343f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f112341d;
        Object objE = uq.b.e();
        int i16 = aVar.f112343f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C2721b c2721b = new C2721b(null);
            aVar.f112343f = 1;
            objB = g0Var.b(c2721b, aVar);
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
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List list = (List) ((dx.i.Right) iVar).b();
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(is0.c.h((AliasDto) it.next()));
        }
        return new dx.i.Right(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.a
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, ? extends ur0.b>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f112349g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f112349g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f112347e;
        Object objE = uq.b.e();
        int i16 = cVar.f112349g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(str, null);
            cVar.f112346d = vq.j.a(str);
            cVar.f112349g = 1;
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
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(is0.c.i((BlikTransactionDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.a
    public Object c(BEStartBlikPaymentRequest bEStartBlikPaymentRequest, tq.e<? super dx.i<? extends dx.b, BEStartPaymentResult>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f112363g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f112363g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f112361e;
        Object objE = uq.b.e();
        int i16 = gVar.f112363g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(bEStartBlikPaymentRequest, null);
            gVar.f112360d = vq.j.a(bEStartBlikPaymentRequest);
            gVar.f112363g = 1;
            objB = g0Var.b(hVar, gVar);
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
            return new dx.i.Right(is0.c.k((StartPaymentResultDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.a
    public Object d(BEStartOneClickBlikPaymentRequest bEStartOneClickBlikPaymentRequest, tq.e<? super dx.i<? extends dx.b, BEStartPaymentResult>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f112356g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f112356g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f112354e;
        Object objE = uq.b.e();
        int i16 = eVar2.f112356g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(bEStartOneClickBlikPaymentRequest, null);
            eVar2.f112353d = vq.j.a(bEStartOneClickBlikPaymentRequest);
            eVar2.f112356g = 1;
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
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(is0.c.k((StartPaymentResultDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
