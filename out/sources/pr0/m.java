package pr0;

import fr0.DocumentConfig;
import ge4.x;
import java.util.List;
import oq.i0;
import oq.p;
import oq.u;
import or0.DocumentsTypeConfigResponseDto;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lpr0/m;", "Lrr0/f;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "", "Lfr0/g;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lmr0/f;", "b", "Loq/k;", "e", "()Lmr0/f;", "client", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements rr0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f162104d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f162106f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f162104d = obj;
            this.f162106f |= PKIFailureInfo.systemUnavail;
            return m.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lor0/q0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<DocumentsTypeConfigResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162107e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162107e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mr0.f fVarE = m.this.e();
            this.f162107e = 1;
            Object objA = fVarE.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return m.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<DocumentsTypeConfigResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public m(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: pr0.l
            @Override // er.a
            public final Object a() {
                return m.d(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mr0.f d(w wVar) {
        return (mr0.f) w.b(wVar, null, mr0.f.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mr0.f e() {
        return (mr0.f) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rr0.f
    public Object a(tq.e<? super dx.i<? extends dx.b, ? extends List<DocumentConfig>>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f162106f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f162106f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f162104d;
        Object objE = uq.b.e();
        int i16 = aVar.f162106f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(null);
            aVar.f162106f = 1;
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
            return new dx.i.Right(nr0.e.g((DocumentsTypeConfigResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}
