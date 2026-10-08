package m04;

import g04.p;
import iy.a0;
import iy.c0;
import oq.r;
import oq.y;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lm04/o;", "Lg04/p;", "Liy/c;", "bytesConverter", "Liy/e;", "bytesManager", "<init>", "(Liy/c;Liy/e;)V", "Lg04/p$a;", "params", "Liy/a0;", "d", "(Lg04/p$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/c;", "b", "Liy/e;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.e bytesManager;

    public o(iy.c cVar, iy.e eVar) {
        this.bytesConverter = cVar;
        this.bytesManager = eVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(p.a aVar, tq.e<? super a0> eVar) {
        r rVarA;
        if (aVar instanceof p.a.Bytes) {
            p.a.Bytes bytes = (p.a.Bytes) aVar;
            rVarA = y.a(bytes.getPassword().getData(), bytes.getPin().getData());
        } else {
            if (!(aVar instanceof p.a.Chars)) {
                throw new oq.p();
            }
            p.a.Chars chars = (p.a.Chars) aVar;
            rVarA = y.a(iy.c.b(this.bytesConverter, chars.getPassword().getData(), null, 2, null), iy.c.b(this.bytesConverter, chars.getPin().getData(), null, 2, null));
        }
        return c0.f(this.bytesManager.c((byte[]) rVarA.a(), this.bytesManager.b((byte[]) rVarA.b())));
    }
}
