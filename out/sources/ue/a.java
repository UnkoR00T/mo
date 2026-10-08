package ue;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import ve.l;
import zd.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f197799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f197800c;

    private a(int i15, f fVar) {
        this.f197799b = i15;
        this.f197800c = fVar;
    }

    public static f c(Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // zd.f
    public void b(MessageDigest messageDigest) {
        this.f197800c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f197799b).array());
    }

    @Override // zd.f
    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f197799b == aVar.f197799b && this.f197800c.equals(aVar.f197800c)) {
                return true;
            }
        }
        return false;
    }

    @Override // zd.f
    public int hashCode() {
        return l.o(this.f197800c, this.f197799b);
    }
}
