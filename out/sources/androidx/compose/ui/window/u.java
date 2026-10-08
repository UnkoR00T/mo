package androidx.compose.ui.window;

import android.os.IBinder;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB;\b\u0016\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0011BE\b\u0016\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0014Be\b\u0016\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u001e\u0010!R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0011\u0010\u0010\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010!¨\u0006)"}, d2 = {"Landroidx/compose/ui/window/u;", "", "", "flags", "", "inheritSecurePolicy", "dismissOnBackPress", "dismissOnClickOutside", "excludeFromSystemGesture", "usePlatformDefaultWidth", "windowType", "Landroid/os/IBinder;", "windowToken", "<init>", "(IZZZZZILandroid/os/IBinder;)V", "focusable", "clippingEnabled", "(ZZZZZ)V", "Landroidx/compose/ui/window/v;", "securePolicy", "(ZZZLandroidx/compose/ui/window/v;ZZ)V", "(ZZZLandroidx/compose/ui/window/v;ZZZILandroid/os/IBinder;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "e", "b", "Z", "f", "()Z", "c", "d", "g", "i", "h", "Landroid/os/IBinder;", "()Landroid/os/IBinder;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int flags;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean inheritSecurePolicy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnBackPress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean dismissOnClickOutside;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean excludeFromSystemGesture;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean usePlatformDefaultWidth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int windowType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final IBinder windowToken;

    public u(int i15, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i16, IBinder iBinder) {
        this.flags = i15;
        this.inheritSecurePolicy = z15;
        this.dismissOnBackPress = z16;
        this.dismissOnClickOutside = z17;
        this.excludeFromSystemGesture = z18;
        this.usePlatformDefaultWidth = z19;
        this.windowType = i16;
        this.windowToken = iBinder;
    }

    public final boolean a() {
        return (this.flags & 512) == 0;
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
    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        return this.flags == uVar.flags && this.inheritSecurePolicy == uVar.inheritSecurePolicy && this.dismissOnBackPress == uVar.dismissOnBackPress && this.dismissOnClickOutside == uVar.dismissOnClickOutside && this.excludeFromSystemGesture == uVar.excludeFromSystemGesture && this.usePlatformDefaultWidth == uVar.usePlatformDefaultWidth && this.windowType == uVar.windowType && fr.t.c(this.windowToken, uVar.windowToken);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getInheritSecurePolicy() {
        return this.inheritSecurePolicy;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final IBinder getWindowToken() {
        return this.windowToken;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.flags * 31) + Boolean.hashCode(this.inheritSecurePolicy)) * 31) + Boolean.hashCode(this.dismissOnBackPress)) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + Boolean.hashCode(this.excludeFromSystemGesture)) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth)) * 31) + this.windowType) * 31;
        IBinder iBinder = this.windowToken;
        return iHashCode + (iBinder != null ? iBinder.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getWindowType() {
        return this.windowType;
    }

    public /* synthetic */ u(boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? true : z16, (i15 & 4) != 0 ? true : z17, (i15 & 8) != 0 ? true : z18, (i15 & 16) != 0 ? false : z19);
    }

    public u(boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this(z15, z16, z17, v.Inherit, true, z18, z19, 1002, null);
    }

    public /* synthetic */ u(boolean z15, boolean z16, boolean z17, v vVar, boolean z18, boolean z19, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? true : z16, (i15 & 4) != 0 ? true : z17, (i15 & 8) != 0 ? v.Inherit : vVar, (i15 & 16) != 0 ? true : z18, (i15 & 32) != 0 ? true : z19);
    }

    public u(boolean z15, boolean z16, boolean z17, v vVar, boolean z18, boolean z19) {
        this(z15, z16, z17, vVar, z18, z19, false, 0, null, MLKEMEngine.KyberPolyBytes, null);
    }

    public /* synthetic */ u(boolean z15, boolean z16, boolean z17, v vVar, boolean z18, boolean z19, boolean z25, int i15, IBinder iBinder, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? false : z15, (i16 & 2) != 0 ? true : z16, (i16 & 4) != 0 ? true : z17, (i16 & 8) != 0 ? v.Inherit : vVar, (i16 & 16) != 0 ? true : z18, (i16 & 32) != 0 ? true : z19, (i16 & 64) != 0 ? false : z25, (i16 & 128) != 0 ? 1002 : i15, (i16 & 256) != 0 ? null : iBinder);
    }

    public u(boolean z15, boolean z16, boolean z17, v vVar, boolean z18, boolean z19, boolean z25, int i15, IBinder iBinder) {
        this(b.g(z15, vVar, z19), vVar == v.Inherit, z16, z17, z18, z25, i15, iBinder);
    }
}
