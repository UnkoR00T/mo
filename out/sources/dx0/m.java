package dx0;

import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Ldx0/m;", "Lax0/c;", "Ldx0/k;", "getMainDocumentDownloadTaskUC", "<init>", "(Ldx0/k;)V", "Lgz/b$a$a;", "params", "", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ldx0/k;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements ax0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k getMainDocumentDownloadTaskUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f45238e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f45240g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45238e = obj;
            this.f45240g |= PKIFailureInfo.systemUnavail;
            return m.this.c(null, this);
        }
    }

    public m(k kVar) {
        this.getMainDocumentDownloadTaskUC = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f45240g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f45240g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f45238e;
        Object objE = uq.b.e();
        int i16 = aVar.f45240g;
        if (i16 == 0) {
            u.b(objC);
            k kVar = this.getMainDocumentDownloadTaskUC;
            gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
            aVar.f45237d = vq.j.a(c1792a);
            aVar.f45240g = 1;
            objC = kVar.c(c1792a2, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return vq.b.a(false);
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        return vq.b.a(true);
    }
}
