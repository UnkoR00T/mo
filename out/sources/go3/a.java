package go3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lgo3/a;", "Lgz/b;", "Lgz/b$a$a;", "", "Lbo3/a;", "verificationContainersInteractor", "<init>", "(Lbo3/a;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lbo3/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<gz.b.a.C1792a, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: go3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1706a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f75196e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75198g;

        C1706a(tq.e<? super C1706a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75196e = obj;
            this.f75198g |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    public a(bo3.a aVar) {
        this.verificationContainersInteractor = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super Boolean> eVar) throws Throwable {
        C1706a c1706a;
        if (eVar instanceof C1706a) {
            c1706a = (C1706a) eVar;
            int i15 = c1706a.f75198g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c1706a.f75198g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c1706a = new C1706a(eVar);
            }
        } else {
            c1706a = new C1706a(eVar);
        }
        Object objP = c1706a.f75196e;
        Object objE = uq.b.e();
        int i16 = c1706a.f75198g;
        boolean z15 = true;
        if (i16 == 0) {
            oq.u.b(objP);
            bo3.a aVar = this.verificationContainersInteractor;
            k34.a0.z zVar = k34.a0.z.f107904a;
            c1706a.f75195d = vq.j.a(c1792a);
            c1706a.f75198g = 1;
            objP = aVar.p(zVar, null, c1706a);
            if (objP == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objP);
        }
        dx.i iVar = (dx.i) objP;
        if (iVar instanceof dx.i.Left) {
            z15 = false;
        } else if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return vq.b.a(z15);
    }
}
