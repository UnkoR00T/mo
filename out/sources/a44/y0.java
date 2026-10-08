package a44;

import k34.PensionerCardDocumentData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"La44/y0;", "Lq34/y0;", "Lp34/a;", "documentsRepository", "Lmx/c;", "labelProvider", "<init>", "(Lp34/a;Lmx/c;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Lk34/x;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lp34/a;", "Ldx/b$c;", "b", "Ldx/b$c;", "error", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y0 implements q34.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p34.a documentsRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business error;

    public y0(p34.a aVar, mx.c cVar) {
        this.documentsRepository = aVar;
        this.error = new dx.b.Business(null, null, cVar.c(f34.a.f59014g), cVar.c(f34.a.f59012f), null, cVar.c(f34.a.f59010e), null, 83, null);
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, PensionerCardDocumentData>> eVar) {
        dx.i<dx.b, PensionerCardDocumentData> iVarP = this.documentsRepository.p();
        if (iVarP instanceof dx.i.Left) {
            return new dx.i.Left(this.error);
        }
        if (iVarP instanceof dx.i.Right) {
            return iVarP;
        }
        throw new oq.p();
    }
}
