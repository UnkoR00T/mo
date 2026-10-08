package k8;

import java.io.FileNotFoundException;
import t7.x;
import y7.p;

/* JADX INFO: loaded from: classes3.dex */
public class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f109094a;

    public i() {
        this(-1);
    }

    private boolean d(Throwable th4) {
        while (th4 != null) {
            if (e(th4)) {
                return true;
            }
            th4 = th4.getCause();
        }
        return false;
    }

    private boolean e(Throwable th4) {
        if ((th4 instanceof x) || (th4 instanceof FileNotFoundException) || (th4 instanceof p) || (th4 instanceof l.h)) {
            return true;
        }
        return (th4 instanceof y7.g) && ((y7.g) th4).f224858a == 2008;
    }

    @Override // k8.j
    public long a(j.a aVar) {
        if (d(aVar.f109097c)) {
            return -9223372036854775807L;
        }
        return Math.min((aVar.f109098d - 1) * 1000, 5000);
    }

    @Override // k8.j
    public int b(int i15) {
        int i16 = this.f109094a;
        if (i16 == -1) {
            return i15 == 7 ? 6 : 3;
        }
        return i16;
    }

    public i(int i15) {
        this.f109094a = i15;
    }
}
