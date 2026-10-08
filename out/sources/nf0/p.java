package nf0;

import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lnf0/p;", "Ldf0/p;", "Lay/k;", "networkConnectionManager", "Ldf0/h;", "manageDownloadTasksUC", "<init>", "(Lay/k;Ldf0/h;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lay/k;", "b", "Ldf0/h;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements df0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ay.k networkConnectionManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final df0.h manageDownloadTasksUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f135691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f135692e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f135694g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f135692e = obj;
            this.f135694g |= PKIFailureInfo.systemUnavail;
            return p.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b<T> implements mu.h {
        b() {
        }

        @Override // mu.h
        public /* bridge */ /* synthetic */ Object F(Object obj, tq.e eVar) {
            return a(((Boolean) obj).booleanValue(), eVar);
        }

        public final Object a(boolean z15, tq.e<? super i0> eVar) {
            Object objC;
            return (z15 && (objC = p.this.manageDownloadTasksUC.c(gz.b.a.C1792a.f78542a, eVar)) == uq.b.e()) ? objC : i0.f148189a;
        }
    }

    public p(ay.k kVar, df0.h hVar) {
        this.networkConnectionManager = kVar;
        this.manageDownloadTasksUC = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f135694g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f135694g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f135692e;
        Object objE = uq.b.e();
        int i16 = aVar.f135694g;
        if (i16 == 0) {
            u.b(obj);
            mu.g<Boolean> gVarD = this.networkConnectionManager.d();
            b bVar = new b();
            aVar.f135691d = vq.j.a(c1792a);
            aVar.f135694g = 1;
            if (gVarD.a(bVar, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        return i0.f148189a;
    }
}
