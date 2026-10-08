package w14;

import a14.x;
import a14.y;
import gy.d;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lw14/b;", "La14/x;", "La14/y;", "requestPermissionUseCase", "<init>", "(La14/y;)V", "Lgz/b$a$a;", "params", "Lu04/c;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "La14/y;", "getRequestPermissionUseCase", "()La14/y;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y requestPermissionUseCase;

    public b(y yVar) {
        this.requestPermissionUseCase = yVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, e<? super u04.c> eVar) {
        return this.requestPermissionUseCase.c(new y.Params(d.CAMERA), eVar);
    }
}
