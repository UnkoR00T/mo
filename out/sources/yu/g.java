package yu;

import kotlinx.serialization.KSerializer;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lyu/g;", "Lkotlinx/serialization/KSerializer;", "", "Lyu/m1;", "", "", "<init>", "()V", "", "f", "([Z)I", "Lxu/c;", "encoder", "content", "size", "Loq/i0;", "g", "(Lxu/c;[ZI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends m1<Boolean, boolean[], Object> implements KSerializer<boolean[]> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f229441c = new g();

    private g() {
        super(vu.a.v(fr.d.f66385a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yu.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int c(boolean[] zArr) {
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yu.m1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(xu.c encoder, boolean[] content, int size) {
        for (int i15 = 0; i15 < size; i15++) {
            encoder.v(getDescriptor(), i15, content[i15]);
        }
    }
}
