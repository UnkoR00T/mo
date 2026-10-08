package w0;

import a4.PointerInputChange;
import p071kotlin.Metadata;
import x3.IndirectPointerInputChange;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lw0/v0;", "", "La4/b0;", "event", "", "e0", "(La4/b0;)Z", "Lx3/f;", "i0", "(Lx3/f;)Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface v0 {
    default boolean e0(PointerInputChange event) {
        return false;
    }

    default boolean i0(IndirectPointerInputChange event) {
        return false;
    }
}
