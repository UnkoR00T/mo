package bp;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f20654c = {116, 114, 117, 101};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f20655d = {102, 97, 108, 115, 101};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f20656e = new c(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f20657f = new c(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f20658b;

    private c(boolean z15) {
        this.f20658b = z15;
    }

    public static c i3(boolean z15) {
        return z15 ? f20656e : f20657f;
    }

    public boolean A3() {
        return this.f20658b;
    }

    @Override // bp.b
    public Object F1(r rVar) {
        return rVar.y(this);
    }

    public void J3(OutputStream outputStream) throws IOException {
        if (this.f20658b) {
            outputStream.write(f20654c);
        } else {
            outputStream.write(f20655d);
        }
    }

    public String toString() {
        return String.valueOf(this.f20658b);
    }
}
