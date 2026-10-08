package w24;

import i24.AdvocateCardData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lw24/u;", "Lw24/t;", "Lv24/b;", "documentsContainerRepository", "Lmx/c;", "labelProvider", "<init>", "(Lv24/b;Lmx/c;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b$c;", "Li24/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lv24/b;", "b", "Lmx/c;", "c", "Ldx/b$c;", "error", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business error;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209953d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f209954e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f209956g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209954e = obj;
            this.f209956g |= PKIFailureInfo.systemUnavail;
            return u.this.c(null, this);
        }
    }

    public u(v24.b bVar, mx.c cVar) {
        this.documentsContainerRepository = bVar;
        this.labelProvider = cVar;
        this.error = new dx.b.Business(null, null, cVar.c(e24.a.f47006c), cVar.c(e24.a.f47005b), null, cVar.c(e24.a.f47004a), null, 83, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<dx.b.Business, AdvocateCardData>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f209956g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f209956g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objN = aVar.f209954e;
        Object objE = uq.b.e();
        int i16 = aVar.f209956g;
        if (i16 == 0) {
            oq.u.b(objN);
            v24.b bVar = this.documentsContainerRepository;
            aVar.f209953d = vq.j.a(c1792a);
            aVar.f209956g = 1;
            objN = bVar.n(aVar);
            if (objN == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objN);
        }
        dx.i iVar = (dx.i) objN;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left(this.error);
        }
        if (iVar instanceof dx.i.Right) {
            return iVar;
        }
        throw new oq.p();
    }
}
