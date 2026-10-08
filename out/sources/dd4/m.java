package dd4;

import gb4.w0;
import jb4.ErrorActionData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldd4/m;", "Lgb4/w0;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lgb4/w0$a;", "p1", "Ljb4/b;", "f", "(Lgb4/w0$a;)Ljb4/b;", "a", "Lmx/c;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public m(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public jb4.b b(w0.Params p15) {
        return new jb4.b.Failure(this.labelProvider.c(s04.b.N0), null, null, new ErrorActionData(this.labelProvider.c(s04.b.f177233p0), new er.a() { // from class: dd4.k
            @Override // er.a
            public final Object a() {
                return m.h();
            }
        }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: dd4.l
            @Override // er.a
            public final Object a() {
                return m.i();
            }
        }), 54, null);
    }
}
