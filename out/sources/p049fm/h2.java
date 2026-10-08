package p049fm;

import p071kotlin.Metadata;
import wq.a;
import wq.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\bj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lfm/h2;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "e", "()I", "b", "c", "d", "f", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum h2 {
    NONE(0),
    NORMAL(1),
    SATELLITE(2),
    TERRAIN(3),
    HYBRID(4);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ a f65096h = b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    h2(int i15) {
        this.value = i15;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
