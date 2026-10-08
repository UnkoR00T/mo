package yu;

import kotlinx.serialization.KSerializer;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lyu/b2;", "Lkotlinx/serialization/KSerializer;", "Loq/e0;", "Lyu/m1;", "Loq/d0;", "", "<init>", "()V", "", "f", "([J)I", "Lxu/c;", "encoder", "content", "size", "Loq/i0;", "g", "(Lxu/c;[JI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b2 extends m1<oq.d0, oq.e0, Object> implements KSerializer<oq.e0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b2 f229422c = new b2();

    private b2() {
        super(vu.a.J(oq.d0.INSTANCE));
    }

    @Override // yu.a
    public /* bridge */ /* synthetic */ int c(Object obj) {
        return f(((oq.e0) obj).getStorage());
    }

    @Override // yu.m1
    public /* bridge */ /* synthetic */ void e(xu.c cVar, oq.e0 e0Var, int i15) {
        g(cVar, e0Var.getStorage(), i15);
    }

    protected int f(long[] jArr) {
        return oq.e0.l(jArr);
    }

    protected void g(xu.c encoder, long[] content, int size) {
        for (int i15 = 0; i15 < size; i15++) {
            encoder.c(getDescriptor(), i15).j(oq.e0.i(content, i15));
        }
    }
}
