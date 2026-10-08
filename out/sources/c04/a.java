package c04;

import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lc04/a;", "Lwz3/a;", "La04/a;", "certRenewManager", "<init>", "(La04/a;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Lwz3/a$a;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "La04/a;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements wz3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a04.a certRenewManager;

    /* JADX INFO: renamed from: c04.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0596a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f22344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f22345e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f22347g;

        C0596a(tq.e<? super C0596a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f22345e = obj;
            this.f22347g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(a04.a aVar) {
        this.certRenewManager = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, wz3.a.Result>> eVar) throws Throwable {
        C0596a c0596a;
        if (eVar instanceof C0596a) {
            c0596a = (C0596a) eVar;
            int i15 = c0596a.f22347g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c0596a.f22347g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c0596a = new C0596a(eVar);
            }
        } else {
            c0596a = new C0596a(eVar);
        }
        Object objF = c0596a.f22345e;
        Object objE = uq.b.e();
        int i16 = c0596a.f22347g;
        if (i16 == 0) {
            u.b(objF);
            a04.a aVar = this.certRenewManager;
            c0596a.f22344d = vq.j.a(c1792a);
            c0596a.f22347g = 1;
            objF = aVar.f(c0596a);
            if (objF == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objF);
        }
        dx.i iVar = (dx.i) objF;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(new wz3.a.Result(((Boolean) ((dx.i.Right) iVar).b()).booleanValue()));
        }
        throw new p();
    }
}
