package h;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: h.b1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lh/b1;", "", "", "past", "future", "Lh/b1$b;", "transformFn", "<init>", "(IILh/b1$b;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getPast", "b", "getFuture", "c", "Lh/b1$b;", "getTransformFn", "()Lh/b1$b;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MetadataTransform {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int past;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int future;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b transformFn;

    /* JADX INFO: renamed from: h.b1$a */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h/b1$a", "Lh/b1$b;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements b {
        a() {
        }
    }

    /* JADX INFO: renamed from: h.b1$b */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lh/b1$b;", "", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
    }

    public MetadataTransform(int i15, int i16, b bVar) {
        this.past = i15;
        this.future = i16;
        this.transformFn = bVar;
        if (i15 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i16 < 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetadataTransform)) {
            return false;
        }
        MetadataTransform metadataTransform = (MetadataTransform) other;
        return this.past == metadataTransform.past && this.future == metadataTransform.future && fr.t.c(this.transformFn, metadataTransform.transformFn);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.past) * 31) + Integer.hashCode(this.future)) * 31) + this.transformFn.hashCode();
    }

    public String toString() {
        return "MetadataTransform(past=" + this.past + ", future=" + this.future + ", transformFn=" + this.transformFn + ')';
    }

    public /* synthetic */ MetadataTransform(int i15, int i16, b bVar, int i17, fr.k kVar) {
        this((i17 & 1) != 0 ? 0 : i15, (i17 & 2) != 0 ? 0 : i16, (i17 & 4) != 0 ? new a() : bVar);
    }
}
