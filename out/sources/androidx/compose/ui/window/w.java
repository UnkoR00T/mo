package androidx.compose.ui.window;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/window/v;", "", "isSecureFlagSetOnParent", "a", "(Landroidx/compose/ui/window/v;Z)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11162a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11162a = iArr;
        }
    }

    public static final boolean a(v vVar, boolean z15) {
        int i15 = a.f11162a[vVar.ordinal()];
        if (i15 == 1) {
            return false;
        }
        if (i15 == 2) {
            return true;
        }
        if (i15 == 3) {
            return z15;
        }
        throw new oq.p();
    }
}
