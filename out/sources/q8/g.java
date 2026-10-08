package q8;

import ak.n0;
import t7.p;
import w7.c0;
import w7.o0;
import w7.t;

/* JADX INFO: loaded from: classes3.dex */
final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f165286a;

    public g(p pVar) {
        this.f165286a = pVar;
    }

    private static String a(int i15) {
        switch (i15) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static String b(int i15) {
        if (i15 == 1) {
            return "audio/raw";
        }
        if (i15 == 85) {
            return "audio/mpeg";
        }
        if (i15 == 255) {
            return "audio/mp4a-latm";
        }
        if (i15 == 8192) {
            return "audio/ac3";
        }
        if (i15 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    private static a c(c0 c0Var) {
        c0Var.g0(4);
        int iD = c0Var.D();
        int iD2 = c0Var.D();
        c0Var.g0(4);
        int iD3 = c0Var.D();
        String strA = a(iD3);
        if (strA != null) {
            p.b bVar = new p.b();
            bVar.F0(iD).i0(iD2).A0(strA);
            return new g(bVar.Q());
        }
        t.h("StreamFormatChunk", "Ignoring track with unsupported compression " + iD3);
        return null;
    }

    public static a d(int i15, c0 c0Var) {
        if (i15 == 2) {
            return c(c0Var);
        }
        if (i15 == 1) {
            return e(c0Var);
        }
        t.h("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + o0.o0(i15));
        return null;
    }

    private static a e(c0 c0Var) {
        int I = c0Var.I();
        String strB = b(I);
        if (strB == null) {
            t.h("StreamFormatChunk", "Ignoring track with unsupported format tag " + I);
            return null;
        }
        int I2 = c0Var.I();
        int iD = c0Var.D();
        c0Var.g0(6);
        int iD0 = o0.d0(c0Var.I());
        int I3 = c0Var.a() > 0 ? c0Var.I() : 0;
        p.b bVar = new p.b();
        bVar.A0(strB).U(I2).B0(iD);
        if (strB.equals("audio/raw") && iD0 != 0) {
            bVar.t0(iD0);
        }
        if (strB.equals("audio/mp4a-latm") && I3 > 0) {
            byte[] bArr = new byte[I3];
            c0Var.u(bArr, 0, I3);
            bVar.l0(n0.E(bArr));
        }
        return new g(bVar.Q());
    }

    @Override // q8.a
    public int getType() {
        return 1718776947;
    }
}
