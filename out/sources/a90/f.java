package a90;

import dx.i;
import er.l;
import ge4.x;
import lt3.JuniorSettingsDto;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import x80.BEJuniorSettings;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"La90/f;", "Lc90/c;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Lx80/d;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lkt3/d;", "b", "Loq/k;", "d", "()Lkt3/d;", "httpService", "juniorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements c90.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k httpService;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f4972d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f4974f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f4972d = obj;
            this.f4974f |= PKIFailureInfo.systemUnavail;
            return f.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Llt3/f;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements l<tq.e<? super x<JuniorSettingsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4975e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f4975e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            kt3.d dVarD = f.this.d();
            this.f4975e = 1;
            Object objA = dVarD.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<JuniorSettingsDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public f(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.httpService = oq.l.a(new er.a() { // from class: a90.e
            @Override // er.a
            public final Object a() {
                return f.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kt3.d d() {
        return (kt3.d) this.httpService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kt3.d e(w wVar) {
        return (kt3.d) w.b(wVar, null, kt3.d.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // c90.c
    public Object a(tq.e<? super i<? extends dx.b, BEJuniorSettings>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f4974f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f4974f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f4972d;
        Object objE = uq.b.e();
        int i16 = aVar.f4974f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(null);
            aVar.f4974f = 1;
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
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(z80.a.c((JuniorSettingsDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}
