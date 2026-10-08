package gg;

import android.os.RemoteException;
import io.sentry.android.core.c2;
import java.util.Arrays;
import jg.n1;
import jg.o1;

/* JADX INFO: loaded from: classes3.dex */
abstract class x extends n1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f72747d;

    protected x(byte[] bArr) {
        jg.s.a(bArr.length == 25);
        this.f72747d = Arrays.hashCode(bArr);
    }

    @Override // jg.o1
    public final rg.b c() {
        return rg.d.o3(m3());
    }

    @Override // jg.o1
    public final int d() {
        return this.f72747d;
    }

    public final boolean equals(Object obj) {
        rg.b bVarC;
        if (!(obj instanceof o1)) {
            return false;
        }
        try {
            o1 o1Var = (o1) obj;
            if (o1Var.d() == this.f72747d && (bVarC = o1Var.c()) != null) {
                return Arrays.equals(m3(), (byte[]) rg.d.n3(bVarC));
            }
            return false;
        } catch (RemoteException e15) {
            c2.f("GoogleCertificates", "Failed to get Google certificates from remote", e15);
            return false;
        }
    }

    public final int hashCode() {
        return this.f72747d;
    }

    abstract byte[] m3();
}
