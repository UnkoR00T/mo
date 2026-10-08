package d40;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Ld40/j;", "", "", "alphaValue", "<init>", "(Ljava/lang/String;IF)V", "a", "F", "e", "()F", "b", "c", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum j {
    ENABLED(1.0f),
    DISABLED(0.3f);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ wq.a f39721e = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float alphaValue;

    j(float f15) {
        this.alphaValue = f15;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getAlphaValue() {
        return this.alphaValue;
    }
}
