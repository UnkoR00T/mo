package a4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0012"}, d2 = {"La4/o0;", "", "", "Landroidx/compose/ui/input/pointer/NativePointerKeyboardModifiers;", "packedValue", "b", "(I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int packedValue;

    private /* synthetic */ o0(int i15) {
        this.packedValue = i15;
    }

    public static final /* synthetic */ o0 a(int i15) {
        return new o0(i15);
    }

    public static int b(int i15) {
        return i15;
    }

    public static boolean c(int i15, Object obj) {
        return (obj instanceof o0) && i15 == ((o0) obj).getPackedValue();
    }

    public static int d(int i15) {
        return Integer.hashCode(i15);
    }

    public static String e(int i15) {
        return "PointerKeyboardModifiers(packedValue=" + i15 + ')';
    }

    public boolean equals(Object other) {
        return c(this.packedValue, other);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final /* synthetic */ int getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return d(this.packedValue);
    }

    public String toString() {
        return e(this.packedValue);
    }
}
