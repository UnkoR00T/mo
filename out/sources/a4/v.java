package a4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"La4/v;", "La4/g;", "La4/w;", "icon", "", "overrideDescendants", "<init>", "(La4/w;Z)V", "La4/p0;", "pointerType", "x3", "(I)Z", "Loq/i0;", "p3", "(La4/w;)V", "", "w", "Ljava/lang/String;", "D3", "()Ljava/lang/String;", "traverseKey", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends g {

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final String traverseKey;

    public v(w wVar, boolean z15) {
        super(wVar, z15, null, 4, null);
        this.traverseKey = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // g4.q1
    /* JADX INFO: renamed from: D3, reason: from getter */
    public String getTraverseKey() {
        return this.traverseKey;
    }

    @Override // a4.g
    public void p3(w icon) {
        y yVarW3 = w3();
        if (yVarW3 != null) {
            yVarW3.b(icon);
        }
    }

    @Override // a4.g
    public boolean x3(int pointerType) {
        p0.Companion companion = p0.INSTANCE;
        return (p0.i(pointerType, companion.c()) || p0.i(pointerType, companion.a())) ? false : true;
    }
}
