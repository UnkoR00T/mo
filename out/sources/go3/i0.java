package go3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lgo3/i0;", "Lgz/b;", "Lgz/b$a$a;", "Lco3/h;", "Lgy/a;", "permissionManager", "<init>", "(Lgy/a;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lgy/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i0 implements gz.b<gz.b.a.C1792a, co3.h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final gy.a permissionManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f75485e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75487g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75485e = obj;
            this.f75487g |= PKIFailureInfo.systemUnavail;
            return i0.this.a(null, this);
        }
    }

    public i0(gy.a aVar) {
        this.permissionManager = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super co3.h> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f75487g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f75487g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objD = aVar.f75485e;
        Object objE = uq.b.e();
        int i16 = aVar.f75487g;
        if (i16 == 0) {
            oq.u.b(objD);
            gy.a aVar2 = this.permissionManager;
            gy.d dVar = gy.d.CAMERA;
            aVar.f75484d = vq.j.a(c1792a);
            aVar.f75487g = 1;
            objD = aVar2.d(dVar, aVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objD);
        }
        gy.c cVar = (gy.c) objD;
        if (fr.t.c(cVar, gy.c.a.f78236a)) {
            return co3.h.a.f28471a;
        }
        if (cVar instanceof gy.c.NotGranted) {
            return new co3.h.b(((gy.c.NotGranted) cVar).getShouldShowRationale());
        }
        if (fr.t.c(cVar, gy.c.C1774c.f78238a)) {
            return new co3.h.b(false);
        }
        throw new oq.p();
    }
}
