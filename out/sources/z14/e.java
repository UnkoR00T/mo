package z14;

import fr.t;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lz14/e;", "Li14/e;", "Lgy/a;", "permissionManager", "<init>", "(Lgy/a;)V", "Lgz/b$a$a;", "params", "Lx04/a;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lgy/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements i14.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final gy.a permissionManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f232316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f232317e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f232319g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f232317e = obj;
            this.f232319g |= PKIFailureInfo.systemUnavail;
            return e.this.c(null, this);
        }
    }

    public e(gy.a aVar) {
        this.permissionManager = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super x04.a> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f232319g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f232319g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objD = aVar.f232317e;
        Object objE = uq.b.e();
        int i16 = aVar.f232319g;
        if (i16 == 0) {
            u.b(objD);
            gy.a aVar2 = this.permissionManager;
            gy.d dVar = gy.d.GPS;
            aVar.f232316d = j.a(c1792a);
            aVar.f232319g = 1;
            objD = aVar2.d(dVar, aVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objD);
        }
        return t.c((gy.c) objD, gy.c.a.f78236a) ? x04.a.C5758a.f216293a : x04.a.b.f216294a;
    }
}
