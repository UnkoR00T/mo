package st0;

import dx.i;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lst0/a;", "Llt0/a;", "Lrt0/c;", "repository", "<init>", "(Lrt0/c;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lrt0/c;", "pushservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements lt0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final rt0.c repository;

    /* JADX INFO: renamed from: st0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4748a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f184183d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f184184e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f184186g;

        C4748a(tq.e<? super C4748a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f184184e = obj;
            this.f184186g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(rt0.c cVar) {
        this.repository = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super i<? extends dx.b, Long>> eVar) throws Throwable {
        C4748a c4748a;
        if (eVar instanceof C4748a) {
            c4748a = (C4748a) eVar;
            int i15 = c4748a.f184186g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4748a.f184186g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c4748a = new C4748a(eVar);
            }
        } else {
            c4748a = new C4748a(eVar);
        }
        Object objB = c4748a.f184184e;
        Object objE = uq.b.e();
        int i16 = c4748a.f184186g;
        if (i16 == 0) {
            u.b(objB);
            rt0.c cVar = this.repository;
            c4748a.f184183d = j.a(c1792a);
            c4748a.f184186g = 1;
            objB = cVar.b(c4748a);
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
            return new i.Right(vq.b.f(((Number) ((i.Right) iVar).b()).longValue()));
        }
        throw new p();
    }
}
