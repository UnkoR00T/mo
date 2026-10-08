package f00;

import java.util.LinkedHashMap;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lf00/c;", "Lf00/b;", "<init>", "()V", "", "T", "Lzx/a;", "destination", "c5", "(Lzx/a;)Ljava/lang/Object;", "value", "Loq/i0;", "I5", "(Lzx/a;Ljava/lang/Object;)V", "e5", "(Lzx/a;)V", "", "", "a", "Ljava/util/Map;", "data", "navigation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> data = new LinkedHashMap();

    @Override // f00.b
    public <T> void I5(zx.a destination, T value) {
        this.data.put(destination.b(), value);
    }

    @Override // f00.d
    public <T> T c5(zx.a destination) {
        T t15 = (T) this.data.get(destination.b());
        if (t15 == null) {
            return null;
        }
        return t15;
    }

    @Override // f00.b
    public void e5(zx.a destination) {
        this.data.remove(destination.b());
    }
}
