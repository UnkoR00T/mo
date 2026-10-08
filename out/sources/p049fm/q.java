package p049fm;

import p071kotlin.Metadata;
import wq.a;
import wq.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lfm/q;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "e", "()I", "b", "c", "d", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum q {
    LIGHT(0),
    DARK(1),
    FOLLOW_SYSTEM(2);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ a f65246f = b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    q(int i15) {
        this.value = i15;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
