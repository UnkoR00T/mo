package h2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f²\u0006\u0018\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\nX\u008a\u0084\u0002²\u0006\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\u00018\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/window/v;", "", "isSecureFlagSetOnParent", "a", "(Landroidx/compose/ui/window/v;Z)Z", "Lkotlin/Function1;", "", "Loq/i0;", "currentContent", "Lkotlin/Function0;", "currentOnDismissRequest", "currentDismissOnBackPress", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79997a;

        static {
            int[] iArr = new int[androidx.compose.ui.window.v.values().length];
            try {
                iArr[androidx.compose.ui.window.v.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.window.v.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.window.v.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f79997a = iArr;
        }
    }

    public static final boolean a(androidx.compose.ui.window.v vVar, boolean z15) {
        int i15 = a.f79997a[vVar.ordinal()];
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
