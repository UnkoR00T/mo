package androidx.compose.ui.window;

import android.os.IBinder;
import org.bouncycastle.asn1.BERTags;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B'\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010'¨\u0006("}, d2 = {"Landroidx/compose/ui/window/l;", "", "", "dismissOnBackPress", "dismissOnClickOutside", "Landroidx/compose/ui/window/v;", "securePolicy", "usePlatformDefaultWidth", "decorFitsSystemWindows", "", "windowTitle", "", "windowType", "Landroid/os/IBinder;", "windowToken", "<init>", "(ZZLandroidx/compose/ui/window/v;ZZLjava/lang/String;ILandroid/os/IBinder;)V", "(ZZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Z", "b", "()Z", "c", "Landroidx/compose/ui/window/v;", "d", "()Landroidx/compose/ui/window/v;", "e", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "g", "I", "h", "Landroid/os/IBinder;", "()Landroid/os/IBinder;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnBackPress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnClickOutside;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v securePolicy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean usePlatformDefaultWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean decorFitsSystemWindows;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String windowTitle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int windowType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final IBinder windowToken;

    public l(boolean z15, boolean z16, v vVar, boolean z17, boolean z18, String str, int i15, IBinder iBinder) {
        this.dismissOnBackPress = z15;
        this.dismissOnClickOutside = z16;
        this.securePolicy = vVar;
        this.usePlatformDefaultWidth = z17;
        this.decorFitsSystemWindows = z18;
        this.windowTitle = str;
        this.windowType = i15;
        this.windowToken = iBinder;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final v getSecurePolicy() {
        return this.securePolicy;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return this.dismissOnBackPress == lVar.dismissOnBackPress && this.dismissOnClickOutside == lVar.dismissOnClickOutside && this.securePolicy == lVar.securePolicy && this.usePlatformDefaultWidth == lVar.usePlatformDefaultWidth && this.decorFitsSystemWindows == lVar.decorFitsSystemWindows && this.windowType == lVar.windowType && fr.t.c(this.windowToken, lVar.windowToken);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getWindowTitle() {
        return this.windowTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final IBinder getWindowToken() {
        return this.windowToken;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getWindowType() {
        return this.windowType;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Boolean.hashCode(this.dismissOnBackPress) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode()) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth)) * 31) + Boolean.hashCode(this.decorFitsSystemWindows)) * 31) + this.windowType) * 31;
        IBinder iBinder = this.windowToken;
        return iHashCode + (iBinder != null ? iBinder.hashCode() : 0);
    }

    public /* synthetic */ l(boolean z15, boolean z16, v vVar, boolean z17, boolean z18, String str, int i15, IBinder iBinder, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? true : z15, (i16 & 2) != 0 ? true : z16, (i16 & 4) != 0 ? v.Inherit : vVar, (i16 & 8) != 0 ? true : z17, (i16 & 16) != 0 ? true : z18, (i16 & 32) != 0 ? "" : str, (i16 & 64) != 0 ? 2 : i15, (i16 & 128) != 0 ? null : iBinder);
    }

    public /* synthetic */ l(boolean z15, boolean z16, boolean z17, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? true : z15, (i15 & 2) != 0 ? true : z16, (i15 & 4) != 0 ? true : z17);
    }

    public l(boolean z15, boolean z16, boolean z17) {
        this(z15, z16, v.Inherit, z17, true, null, 0, null, BERTags.FLAGS, null);
    }
}
