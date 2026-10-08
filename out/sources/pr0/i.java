package pr0;

import fr0.BEAsyncDocumentGenerationResponse;
import ge4.x;
import oq.i0;
import oq.p;
import oq.u;
import or0.AsyncUpdateDocumentRequestDto;
import or0.AsyncUpdateDocumentResponseDto;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lpr0/i;", "Lrr0/d;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "", "documentId", "subtype", "Lrq0/b;", "type", "Ldx/i;", "Ldx/b;", "Lfr0/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Lrq0/b;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lmr0/d;", "b", "Loq/k;", "e", "()Lmr0/d;", "client", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements rr0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f162071d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f162072e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f162073f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f162074g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f162076j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f162074g = obj;
            this.f162076j |= PKIFailureInfo.systemUnavail;
            return i.this.a(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lor0/i;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<AsyncUpdateDocumentResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162077e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ rq0.b f162079g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f162080h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f162081j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(rq0.b bVar, String str, String str2, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f162079g = bVar;
            this.f162080h = str;
            this.f162081j = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162077e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mr0.d dVarE = i.this.e();
            AsyncUpdateDocumentRequestDto asyncUpdateDocumentRequestDto = new AsyncUpdateDocumentRequestDto(nr0.g.j(this.f162079g), this.f162080h, this.f162081j);
            this.f162077e = 1;
            Object objA = dVarE.a(asyncUpdateDocumentRequestDto, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return i.this.new b(this.f162079g, this.f162080h, this.f162081j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AsyncUpdateDocumentResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public i(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: pr0.h
            @Override // er.a
            public final Object a() {
                return i.d(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mr0.d d(w wVar) {
        return (mr0.d) w.b(wVar, null, mr0.d.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mr0.d e() {
        return (mr0.d) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rr0.d
    public Object a(String str, String str2, rq0.b bVar, tq.e<? super dx.i<? extends dx.b, BEAsyncDocumentGenerationResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f162076j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f162076j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f162074g;
        Object objE = uq.b.e();
        int i16 = aVar.f162076j;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar2 = new b(bVar, str, str2, null);
            aVar.f162071d = vq.j.a(str);
            aVar.f162072e = vq.j.a(str2);
            aVar.f162073f = vq.j.a(bVar);
            aVar.f162076j = 1;
            objB = g0Var.b(bVar2, aVar);
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
            return new dx.i.Right(nr0.c.a((AsyncUpdateDocumentResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}
