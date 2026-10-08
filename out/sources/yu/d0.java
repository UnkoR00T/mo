package yu;

import kotlinx.serialization.KSerializer;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lyu/d0;", "Lkotlinx/serialization/KSerializer;", "", "Lyu/m1;", "", "", "<init>", "()V", "f", "([I)I", "Lxu/c;", "encoder", "content", "size", "Loq/i0;", "g", "(Lxu/c;[II)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 extends m1<Integer, int[], Object> implements KSerializer<int[]> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f229428c = new d0();

    private d0() {
        super(vu.a.A(fr.s.f66413a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yu.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int c(int[] iArr) {
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yu.m1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(xu.c encoder, int[] content, int size) {
        for (int i15 = 0; i15 < size; i15++) {
            encoder.t(getDescriptor(), i15, content[i15]);
        }
    }
}
