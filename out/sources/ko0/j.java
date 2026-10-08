package ko0;

import eo0.CountryDictionary;
import eo0.OwTokens;
import eo0.Recipient;
import ge4.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jo0.CountriesDictionaryDtoDto;
import jo0.OrganizationDtoDto;
import jo0.OrganizationsResponseDto;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lko0/j;", "Lmo0/e;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "", "query", "Leo0/i0$a;", "owAccessToken", "Ldx/i;", "Ldx/b;", "", "Leo0/k0;", "b", "(Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Leo0/l;", "a", "(Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lho0/e;", "Loq/k;", "e", "()Lho0/e;", "recipientsClient", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements mo0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k recipientsClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111915d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f111916e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f111917f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f111919h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111917f = obj;
            this.f111919h |= PKIFailureInfo.systemUnavail;
            return j.this.b(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/h1;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<OrganizationsResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111920e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f111922g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111923h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, OwTokens.Access access, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f111922g = str;
            this.f111923h = access;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111920e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.e eVarE = j.this.e();
            String str = this.f111922g;
            String strB = this.f111923h.b();
            this.f111920e = 1;
            Object objA = eVarE.a(str, strB, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return j.this.new b(this.f111922g, this.f111923h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<OrganizationsResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f111924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f111925e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f111927g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f111925e = obj;
            this.f111927g |= PKIFailureInfo.systemUnavail;
            return j.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/u;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<CountriesDictionaryDtoDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111928e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f111930g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(OwTokens.Access access, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f111930g = access;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f111928e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.e eVarE = j.this.e();
            String strB = this.f111930g.b();
            this.f111928e = 1;
            Object objB = eVarE.b(strB, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return j.this.new d(this.f111930g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<CountriesDictionaryDtoDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    public j(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.recipientsClient = oq.l.a(new er.a() { // from class: ko0.i
            @Override // er.a
            public final Object a() {
                return j.f(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ho0.e e() {
        return (ho0.e) this.recipientsClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ho0.e f(w wVar) {
        return (ho0.e) w.b(wVar, null, ho0.e.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.e
    public Object a(OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, ? extends List<CountryDictionary>>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f111927g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f111927g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f111925e;
        Object objE = uq.b.e();
        int i16 = cVar.f111927g;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(access, null);
            cVar.f111924d = vq.j.a(access);
            cVar.f111927g = 1;
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
            return new dx.i.Right(io0.a.Q((CountriesDictionaryDtoDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.e
    public Object b(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, ? extends List<Recipient>>> eVar) throws Throwable {
        a aVar;
        Collection collectionN;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f111919h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f111919h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f111917f;
        Object objE = uq.b.e();
        int i16 = aVar.f111919h;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(str, access, null);
            aVar.f111915d = vq.j.a(str);
            aVar.f111916e = vq.j.a(access);
            aVar.f111919h = 1;
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
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List<OrganizationDtoDto> listA = ((OrganizationsResponseDto) ((dx.i.Right) iVar).b()).a();
        if (listA != null) {
            List<OrganizationDtoDto> list = listA;
            collectionN = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                collectionN.add(io0.a.u((OrganizationDtoDto) it.next()));
            }
        } else {
            collectionN = v.n();
        }
        return new dx.i.Right(collectionN);
    }
}
