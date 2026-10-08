package pu1;

import dx.i;
import oq.k;
import oq.l;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ou1.DrivingLicenceFullData;
import p071kotlin.Metadata;
import tq.e;
import vq.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lpu1/b;", "", "Lgz/b$a$a;", "Lou1/g;", "Lmx/c;", "labelProvider", "Lnu1/a;", "drivingLicenceContainersInteractor", "<init>", "(Lmx/c;Lnu1/a;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lmx/c;", "b", "Lnu1/a;", "Ldx/b$c;", "c", "Loq/k;", "f", "()Ldx/b$c;", "error", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nu1.a drivingLicenceContainersInteractor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k error = l.a(new er.a() { // from class: pu1.a
        @Override // er.a
        public final Object a() {
            return b.e(this.f162729a);
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f162733d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f162734e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f162736g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f162734e = obj;
            this.f162736g |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    public b(mx.c cVar, nu1.a aVar) {
        this.labelProvider = cVar;
        this.drivingLicenceContainersInteractor = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dx.b.Business e(b bVar) {
        return new dx.b.Business(null, null, bVar.labelProvider.c(iu1.a.f97172v), bVar.labelProvider.c(iu1.a.f97170u), null, bVar.labelProvider.c(iu1.a.f97154m), null, 83, null);
    }

    private final dx.b.Business f() {
        return (dx.b.Business) this.error.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, e<? super i<? extends dx.b, DrivingLicenceFullData>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f162736g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f162736g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f162734e;
        Object objE = uq.b.e();
        int i16 = aVar.f162736g;
        if (i16 == 0) {
            u.b(objB);
            nu1.a aVar2 = this.drivingLicenceContainersInteractor;
            aVar.f162733d = j.a(c1792a);
            aVar.f162736g = 1;
            objB = aVar2.b(aVar);
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
            return new i.Left(f());
        }
        if (iVar instanceof i.Right) {
            return iVar;
        }
        throw new p();
    }
}
