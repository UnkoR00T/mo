package ks0;

import as0.BETransaction;
import as0.BETransactionDetailsDomain;
import fv.e0;
import ge4.x;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import js0.TransactionDetailsDto;
import js0.TransactionDto;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00170\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lks0/t;", "Lms0/g;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "", "paymentId", "", "pageNumber", "pageSize", "Ldx/i;", "Ldx/b;", "", "Las0/a;", "c", "(Ljava/lang/String;IILtq/e;)Ljava/lang/Object;", "transactionId", "Las0/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljava/io/InputStream;", "b", "Lpl/gov/coi/common/network/g0;", "Lhs0/k;", "Loq/k;", "f", "()Lhs0/k;", "transactionsClient", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements ms0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k transactionsClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f112564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f112565f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f112567h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112565f = obj;
            this.f112567h |= PKIFailureInfo.systemUnavail;
            return t.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfv/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<e0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112568e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112570g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f112571h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f112570g = str;
            this.f112571h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112568e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.k kVarF = t.this.f();
            String str = this.f112570g;
            String str2 = this.f112571h;
            this.f112568e = 1;
            Object objB = kVarF.b(str, str2, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return t.this.new b(this.f112570g, this.f112571h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<e0>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f112573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f112574f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f112576h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112574f = obj;
            this.f112576h |= PKIFailureInfo.systemUnavail;
            return t.this.a(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljs0/c1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<TransactionDetailsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112577e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112579g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f112580h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f112579g = str;
            this.f112580h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112577e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.k kVarF = t.this.f();
            String str = this.f112579g;
            String str2 = this.f112580h;
            this.f112577e = 1;
            Object objA = kVarF.a(str, str2, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return t.this.new d(this.f112579g, this.f112580h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<TransactionDetailsDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f112583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f112584g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f112586j;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112584g = obj;
            this.f112586j |= PKIFailureInfo.systemUnavail;
            return t.this.c(null, 0, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Ljs0/d1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<List<? extends TransactionDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112587e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f112590h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f112591j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, int i15, int i16, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f112589g = str;
            this.f112590h = i15;
            this.f112591j = i16;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112587e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.k kVarF = t.this.f();
            String str = this.f112589g;
            Integer numE = vq.b.e(this.f112590h);
            Integer numE2 = vq.b.e(this.f112591j);
            this.f112587e = 1;
            Object objC = kVarF.c(str, numE, numE2, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return t.this.new f(this.f112589g, this.f112590h, this.f112591j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<List<TransactionDto>>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    public t(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.transactionsClient = oq.l.a(new er.a() { // from class: ks0.s
            @Override // er.a
            public final Object a() {
                return t.g(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs0.k f() {
        return (hs0.k) this.transactionsClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs0.k g(w wVar) {
        return (hs0.k) w.b(wVar, null, hs0.k.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.g
    public Object a(String str, String str2, tq.e<? super dx.i<? extends dx.b, BETransactionDetailsDomain>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f112576h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f112576h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f112574f;
        Object objE = uq.b.e();
        int i16 = cVar.f112576h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(str, str2, null);
            cVar.f112572d = vq.j.a(str);
            cVar.f112573e = vq.j.a(str2);
            cVar.f112576h = 1;
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
            return new dx.i.Right(is0.c.c((TransactionDetailsDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.g
    public Object b(String str, String str2, tq.e<? super dx.i<? extends dx.b, ? extends InputStream>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f112567h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f112567h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f112565f;
        Object objE = uq.b.e();
        int i16 = aVar.f112567h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(str, str2, null);
            aVar.f112563d = vq.j.a(str);
            aVar.f112564e = vq.j.a(str2);
            aVar.f112567h = 1;
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
            return new dx.i.Right(((e0) ((dx.i.Right) iVar).b()).b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.g
    public Object c(String str, int i15, int i16, tq.e<? super dx.i<? extends dx.b, ? extends List<BETransaction>>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i17 = eVar2.f112586j;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f112586j = i17 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f112584g;
        Object objE = uq.b.e();
        int i18 = eVar2.f112586j;
        if (i18 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(str, i15, i16, null);
            eVar2.f112581d = vq.j.a(str);
            eVar2.f112582e = i15;
            eVar2.f112583f = i16;
            eVar2.f112586j = 1;
            objB = g0Var.b(fVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i18 != 1) {
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
            arrayList.add(is0.c.a((TransactionDto) it.next()));
        }
        return new dx.i.Right(arrayList);
    }
}
