package a44;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"La44/e1;", "Lq34/e1;", "Lp34/a;", "documentsRepository", "Lmx/c;", "labelProvider", "<init>", "(Lp34/a;Lmx/c;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "", "Lk34/g0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lp34/a;", "Ldx/b$c;", "b", "Ldx/b$c;", "error", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e1 implements q34.e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p34.a documentsRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business error;

    public e1(p34.a aVar, mx.c cVar) {
        this.documentsRepository = aVar;
        this.error = new dx.b.Business(null, null, cVar.c(f34.a.f59014g), cVar.c(f34.a.f59012f), null, cVar.c(f34.a.f59010e), null, 83, null);
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ? extends List<k34.g0>>> eVar) {
        dx.i<dx.b, List<k34.g0>> iVarO = this.documentsRepository.O();
        if (iVarO instanceof dx.i.Right) {
            return iVarO;
        }
        if (iVarO instanceof dx.i.Left) {
            return new dx.i.Left(this.error);
        }
        throw new oq.p();
    }
}
