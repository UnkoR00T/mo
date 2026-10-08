package pr0;

import fr0.AsyncDocumentGenerationRequest;
import fr0.BEAsyncDocumentGenerationResponse;
import fr0.DocumentTypeWithSubtype;
import ge4.x;
import java.util.Set;
import oq.i0;
import oq.p;
import oq.u;
import or0.AsyncDocumentGenerationRequestDto;
import or0.AsyncDocumentGenerationResponseDto;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lpr0/e;", "Lrr0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "", "Lfr0/j;", "documentTypesToGenerate", "Ldx/i;", "Ldx/b;", "Lfr0/c;", "a", "(Ljava/util/Set;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lmr0/b;", "b", "Loq/k;", "e", "()Lmr0/b;", "client", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements rr0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f162051d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f162052e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f162054g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f162052e = obj;
            this.f162054g |= PKIFailureInfo.systemUnavail;
            return e.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lor0/c;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<AsyncDocumentGenerationResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162055e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<DocumentTypeWithSubtype> f162057g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set<DocumentTypeWithSubtype> set, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f162057g = set;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162055e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mr0.b bVarE = e.this.e();
            AsyncDocumentGenerationRequestDto asyncDocumentGenerationRequestDtoF = nr0.b.f(new AsyncDocumentGenerationRequest(this.f162057g));
            this.f162055e = 1;
            Object objA = bVarE.a(asyncDocumentGenerationRequestDtoF, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return e.this.new b(this.f162057g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AsyncDocumentGenerationResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public e(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: pr0.d
            @Override // er.a
            public final Object a() {
                return e.d(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mr0.b d(w wVar) {
        return (mr0.b) w.b(wVar, null, mr0.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mr0.b e() {
        return (mr0.b) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rr0.b
    public Object a(Set<DocumentTypeWithSubtype> set, tq.e<? super dx.i<? extends dx.b, BEAsyncDocumentGenerationResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f162054g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f162054g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f162052e;
        Object objE = uq.b.e();
        int i16 = aVar.f162054g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(set, null);
            aVar.f162051d = vq.j.a(set);
            aVar.f162054g = 1;
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
            return new dx.i.Right(nr0.b.b((AsyncDocumentGenerationResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}
