package sq1;

import p071kotlin.Metadata;
import wq.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lsq1/a;", "", "", "position", "<init>", "(Ljava/lang/String;II)V", "a", "I", "g", "()I", "b", "c", "d", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a {
    AIR_QUALITY(1),
    EPAYMENTS(2),
    CUSTOM(99);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ wq.a f183545f = b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int position;

    a(int i15) {
        this.position = i15;
    }

    public static wq.a<a> e() {
        return f183545f;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getPosition() {
        return this.position;
    }
}
