package wv;

import p071kotlin.Metadata;
import vv.buffer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aA\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\r\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvv/f0;", "Lvv/h;", "bytes", "", "bytesOffset", "byteCount", "", "fromIndex", "toIndex", "a", "(Lvv/f0;Lvv/h;IIJJ)J", "Lvv/e;", "", "c", "(Lvv/e;Lvv/h;IIJJ)Z", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final long a(buffer f0Var, vv.h hVar, int i15, int i16, long j15, long j16) {
        int i17 = i15;
        int i18 = i16;
        long j17 = i18;
        vv.b.b(hVar.Q(), i17, j17);
        if (f0Var.closed) {
            throw new IllegalStateException("closed");
        }
        long jMax = j15;
        while (true) {
            long j18 = jMax;
            long jB = a.b(f0Var.bufferField, hVar, j18, j16, i17, i18);
            if (jB != -1) {
                return jB;
            }
            long size = (f0Var.bufferField.getSize() - j17) + 1;
            if (size >= j16 || !c(f0Var.bufferField, hVar, i15, i16, j18, j16) || f0Var.source.k3(f0Var.bufferField, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(j18, size);
            i17 = i15;
            i18 = i16;
        }
    }

    public static /* synthetic */ long b(buffer f0Var, vv.h hVar, int i15, int i16, long j15, long j16, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            i15 = 0;
        }
        int i18 = i15;
        if ((i17 & 4) != 0) {
            i16 = hVar.Q();
        }
        return a(f0Var, hVar, i18, i16, j15, (i17 & 16) != 0 ? Long.MAX_VALUE : j16);
    }

    private static final boolean c(vv.e eVar, vv.h hVar, int i15, int i16, long j15, long j16) {
        if (eVar.getSize() < j16) {
            return true;
        }
        int iMax = (int) Math.max(1L, (eVar.getSize() - j16) + 1);
        int iMin = ((int) Math.min(i16, (eVar.getSize() - j15) + 1)) - 1;
        if (iMax > iMin) {
            return false;
        }
        int i17 = iMin;
        while (true) {
            vv.e eVar2 = eVar;
            vv.h hVar2 = hVar;
            int i18 = i15;
            if (eVar2.c0(eVar.getSize() - ((long) i17), hVar2, i18, i17)) {
                return true;
            }
            if (i17 == iMax) {
                return false;
            }
            i17--;
            eVar = eVar2;
            hVar = hVar2;
            i15 = i18;
        }
    }
}
