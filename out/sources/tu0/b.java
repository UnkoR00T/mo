package tu0;

import dx.i;
import er.l;
import ge4.x;
import java.util.List;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ou0.Ticket;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import su0.TicketDto;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ltu0/b;", "Lvu0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Lou0/a;", "paymentStatus", "", "pageNumber", "Ldx/i;", "Ldx/b;", "", "Lou0/b;", "a", "(Lou0/a;ILtq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lqu0/a;", "b", "Loq/k;", "e", "()Lqu0/a;", "client", "taxservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements vu0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192322e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f192323f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f192325h;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f192323f = obj;
            this.f192325h |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: tu0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Lsu0/a;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C5023b extends vq.k implements l<e<? super x<List<? extends TicketDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f192326e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f192328g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ou0.a f192329h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5023b(int i15, ou0.a aVar, e<? super C5023b> eVar) {
            super(1, eVar);
            this.f192328g = i15;
            this.f192329h = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f192326e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            qu0.a aVarE = b.this.e();
            String strValueOf = String.valueOf(this.f192328g);
            String value = this.f192329h.getValue();
            this.f192326e = 1;
            Object objA = aVarE.a(strValueOf, value, this);
            return objA == objE ? objE : objA;
        }

        public final e<i0> M(e<?> eVar) {
            return b.this.new C5023b(this.f192328g, this.f192329h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(e<? super x<List<TicketDto>>> eVar) {
            return ((C5023b) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: tu0.a
            @Override // er.a
            public final Object a() {
                return b.d(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qu0.a d(w wVar) {
        return (qu0.a) w.b(wVar, null, qu0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qu0.a e() {
        return (qu0.a) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vu0.a
    public Object a(ou0.a aVar, int i15, e<? super i<? extends dx.b, ? extends List<Ticket>>> eVar) throws Throwable {
        a aVar2;
        if (eVar instanceof a) {
            aVar2 = (a) eVar;
            int i16 = aVar2.f192325h;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f192325h = i16 - PKIFailureInfo.systemUnavail;
            } else {
                aVar2 = new a(eVar);
            }
        } else {
            aVar2 = new a(eVar);
        }
        Object objB = aVar2.f192323f;
        Object objE = uq.b.e();
        int i17 = aVar2.f192325h;
        if (i17 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C5023b c5023b = new C5023b(i15, aVar, null);
            aVar2.f192321d = j.a(aVar);
            aVar2.f192322e = i15;
            aVar2.f192325h = 1;
            objB = g0Var.b(c5023b, aVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(ru0.a.a((List) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}
