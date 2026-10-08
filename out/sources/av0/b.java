package av0;

import dx.i;
import er.l;
import fv.e0;
import ge4.x;
import java.io.InputStream;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lav0/b;", "Ldv0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Lcv0/q;", "travelUuid", "Ldx/i;", "Ldx/b;", "Ljava/io/InputStream;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lxu0/b;", "b", "Loq/k;", "e", "()Lxu0/b;", "client", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements dv0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f14621d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f14622e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f14624g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f14622e = obj;
            this.f14624g |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    /* JADX INFO: renamed from: av0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfv/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C0321b extends vq.k implements l<tq.e<? super x<e0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14625e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f14627g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0321b(String str, tq.e<? super C0321b> eVar) {
            super(1, eVar);
            this.f14627g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f14625e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            xu0.b bVarE = b.this.e();
            String str = this.f14627g;
            this.f14625e = 1;
            Object objA = bVarE.a(str, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C0321b(this.f14627g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<e0>> eVar) {
            return ((C0321b) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: av0.a
            @Override // er.a
            public final Object a() {
                return b.d(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xu0.b d(w wVar) {
        return (xu0.b) w.b(wVar, null, xu0.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xu0.b e() {
        return (xu0.b) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dv0.a
    public Object a(String str, tq.e<? super i<? extends dx.b, ? extends InputStream>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f14624g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f14624g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f14622e;
        Object objE = uq.b.e();
        int i16 = aVar.f14624g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C0321b c0321b = new C0321b(str, null);
            aVar.f14621d = j.a(str);
            aVar.f14624g = 1;
            objB = g0Var.b(c0321b, aVar);
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
            return new i.Right(((e0) ((i.Right) iVar).b()).b());
        }
        throw new p();
    }
}
