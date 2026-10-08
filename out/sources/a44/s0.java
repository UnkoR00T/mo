package a44;

import java.util.Map;
import k34.FamilyDataModel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"La44/s0;", "Lq34/s0;", "Lp34/a;", "documentsRepository", "Lmx/c;", "labelProvider", "<init>", "(Lp34/a;Lmx/c;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "", "", "Lk34/r;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lp34/a;", "Ldx/b$c;", "b", "Ldx/b$c;", "error", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s0 implements q34.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p34.a documentsRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business error;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3189e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3191g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3189e = obj;
            this.f3191g |= PKIFailureInfo.systemUnavail;
            return s0.this.c(null, this);
        }
    }

    public s0(p34.a aVar, mx.c cVar) {
        this.documentsRepository = aVar;
        this.error = new dx.b.Business(null, null, cVar.c(f34.a.f59014g), cVar.c(f34.a.f59012f), null, cVar.c(f34.a.f59010e), null, 83, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ? extends Map<String, FamilyDataModel>>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f3191g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f3191g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC0 = aVar.f3189e;
        Object objE = uq.b.e();
        int i16 = aVar.f3191g;
        if (i16 == 0) {
            oq.u.b(objC0);
            p34.a aVar2 = this.documentsRepository;
            aVar.f3188d = vq.j.a(c1792a);
            aVar.f3191g = 1;
            objC0 = aVar2.c0(aVar);
            if (objC0 == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC0);
        }
        dx.i iVar = (dx.i) objC0;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left(this.error);
        }
        if (iVar instanceof dx.i.Right) {
            return iVar;
        }
        throw new oq.p();
    }
}
