package c70;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lc70/a;", "", "<init>", "()V", "", "isAutomaticTest", "Lyw/a;", "accessibilityLabelResolver", "Loq/i0;", "b", "(ZLyw/a;)V", "Lyw/a;", "a", "()Lyw/a;", "d", "(Lyw/a;)V", "value", "c", "Z", "()Z", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static yw.a accessibilityLabelResolver;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static boolean isAutomaticTest;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23835a = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f23838d = 8;

    private a() {
    }

    public final yw.a a() {
        yw.a aVar = accessibilityLabelResolver;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final void b(boolean isAutomaticTest2, yw.a accessibilityLabelResolver2) {
        d(accessibilityLabelResolver2);
        isAutomaticTest = isAutomaticTest2;
    }

    public final boolean c() {
        return isAutomaticTest;
    }

    public final void d(yw.a aVar) {
        accessibilityLabelResolver = aVar;
    }
}
