package b44;

import dx.i;
import fr.t;
import fr0.DocumentConfig;
import java.util.Iterator;
import java.util.List;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb44/c;", "Lr34/c;", "Lz34/a;", "repository", "<init>", "(Lz34/a;)V", "Lr34/c$a;", "params", "Ldx/i;", "Ldx/b;", "Lfr0/g;", "d", "(Lr34/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lz34/a;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements r34.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z34.a repository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f16536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f16537e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f16539g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f16537e = obj;
            this.f16539g |= PKIFailureInfo.systemUnavail;
            return c.this.c(null, this);
        }
    }

    public c(z34.a aVar) {
        this.repository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(r34.c.Params params, tq.e<? super i<? extends dx.b, DocumentConfig>> eVar) throws Throwable {
        a aVar;
        Object next;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f16539g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f16539g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f16537e;
        Object objE = uq.b.e();
        int i16 = aVar.f16539g;
        if (i16 == 0) {
            u.b(objC);
            z34.a aVar2 = this.repository;
            aVar.f16536d = params;
            aVar.f16539g = 1;
            objC = aVar2.c(aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (r34.c.Params) aVar.f16536d;
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        Iterator it = ((List) ((i.Right) iVar).b()).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (t.c(((DocumentConfig) next).getType(), params.getDocumentType())) {
                return new i.Right((DocumentConfig) next);
            }
        }
        next = null;
        return new i.Right((DocumentConfig) next);
    }
}
