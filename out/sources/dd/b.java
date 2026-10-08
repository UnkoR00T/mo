package dd;

import oq.p;
import p071kotlin.Metadata;
import zc.ErrorResult;
import zc.SuccessResult;
import zc.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldd/b;", "Ldd/c;", "Ldd/d;", "target", "Lzc/i;", "result", "<init>", "(Ldd/d;Lzc/i;)V", "Loq/i0;", "a", "()V", "Ldd/d;", "b", "Lzc/i;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d target;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i result;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ldd/b$a;", "Ldd/c$a;", "<init>", "()V", "Ldd/d;", "target", "Lzc/i;", "result", "Ldd/c;", "a", "(Ldd/d;Lzc/i;)Ldd/c;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements c.a {
        @Override // dd.c.a
        public c a(d target, i result) {
            return new b(target, result);
        }
    }

    public b(d dVar, i iVar) {
        this.target = dVar;
        this.result = iVar;
    }

    @Override // dd.c
    public void a() {
        i iVar = this.result;
        if (iVar instanceof SuccessResult) {
            this.target.b(((SuccessResult) iVar).getImage());
        } else {
            if (!(iVar instanceof ErrorResult)) {
                throw new p();
            }
            this.target.c(((ErrorResult) iVar).getImage());
        }
    }
}
