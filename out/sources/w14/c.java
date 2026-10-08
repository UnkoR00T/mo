package w14;

import a14.y;
import fr.t;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lw14/c;", "La14/y;", "Lgy/a;", "permissionManager", "<init>", "(Lgy/a;)V", "La14/y$a;", "params", "Lu04/c;", "d", "(La14/y$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgy/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final gy.a permissionManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f209318e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f209320g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209318e = obj;
            this.f209320g |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(gy.a aVar) {
        this.permissionManager = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(y.Params params, e<? super u04.c> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f209320g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f209320g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objD = aVar.f209318e;
        Object objE = uq.b.e();
        int i16 = aVar.f209320g;
        if (i16 == 0) {
            u.b(objD);
            if (t.c(this.permissionManager.h(params.getPermissionType()), gy.c.a.f78236a)) {
                return u04.c.a.f194071a;
            }
            gy.a aVar2 = this.permissionManager;
            gy.d permissionType = params.getPermissionType();
            aVar.f209317d = j.a(params);
            aVar.f209320g = 1;
            objD = aVar2.d(permissionType, aVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objD);
        }
        gy.c cVar = (gy.c) objD;
        if (t.c(cVar, gy.c.a.f78236a)) {
            return u04.c.a.f194071a;
        }
        if (cVar instanceof gy.c.NotGranted) {
            return new u04.c.b(((gy.c.NotGranted) cVar).getShouldShowRationale());
        }
        if (t.c(cVar, gy.c.C1774c.f78238a)) {
            return new u04.c.b(false);
        }
        throw new p();
    }
}
