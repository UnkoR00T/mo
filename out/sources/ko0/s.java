package ko0;

import eo0.OwTokens;
import eo0.RecipientResult;
import eo0.SearchRequest;
import ge4.x;
import java.util.List;
import jo0.BaeSearchRequestDto;
import jo0.BaeSearchResponseDto;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lko0/s;", "Lmo0/j;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Leo0/i0$a;", "owAccessToken", "Leo0/w0;", "searchRequest", "", "pageId", "Ldx/i;", "Ldx/b;", "", "Leo0/n0;", "a", "(Leo0/i0$a;Leo0/w0;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lho0/k;", "b", "Loq/k;", "d", "()Lho0/k;", "searchEngineClient", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements mo0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k searchEngineClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f112102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f112103f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f112104g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f112106j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112104g = obj;
            this.f112106j |= PKIFailureInfo.systemUnavail;
            return s.this.a(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljo0/s;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<BaeSearchResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112107e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OwTokens.Access f112109g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ SearchRequest f112110h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f112111j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(OwTokens.Access access, SearchRequest searchRequest, String str, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f112109g = access;
            this.f112110h = searchRequest;
            this.f112111j = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112107e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ho0.k kVarD = s.this.d();
            String str = "Bearer " + this.f112109g.getValue();
            BaeSearchRequestDto baeSearchRequestDtoD = io0.b.d(this.f112110h, this.f112111j);
            this.f112107e = 1;
            Object objA = kVarD.a(str, baeSearchRequestDtoD, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return s.this.new b(this.f112109g, this.f112110h, this.f112111j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<BaeSearchResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public s(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.searchEngineClient = oq.l.a(new er.a() { // from class: ko0.r
            @Override // er.a
            public final Object a() {
                return s.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ho0.k d() {
        return (ho0.k) this.searchEngineClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ho0.k e(w wVar) {
        return (ho0.k) w.b(wVar, null, ho0.k.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mo0.j
    public Object a(OwTokens.Access access, SearchRequest searchRequest, String str, tq.e<? super dx.i<? extends dx.b, ? extends List<RecipientResult>>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f112106j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f112106j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f112104g;
        Object objE = uq.b.e();
        int i16 = aVar.f112106j;
        if (i16 == 0) {
            oq.u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(access, searchRequest, str, null);
            aVar.f112101d = vq.j.a(access);
            aVar.f112102e = vq.j.a(searchRequest);
            aVar.f112103f = vq.j.a(str);
            aVar.f112106j = 1;
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
            return new dx.i.Right(io0.a.P((BaeSearchResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
