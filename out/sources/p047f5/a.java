package p047f5;

import io.sentry.android.core.c2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lf5/a;", "", "<init>", "()V", "", "index", "", "a", "(I)Ljava/lang/String;", "b", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f59146a = new a();

    private a() {
    }

    public final String a(int index) {
        if (index == 0) {
            return "top";
        }
        if (index == 1) {
            return "bottom";
        }
        c2.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
        return "top";
    }

    public final String b(int index) {
        if (index == -2) {
            return "start";
        }
        if (index == -1) {
            return "end";
        }
        if (index == 0) {
            return "left";
        }
        if (index == 1) {
            return "right";
        }
        c2.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
        return "start";
    }
}
