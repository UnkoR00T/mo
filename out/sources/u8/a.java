package u8;

import java.util.Collections;
import o8.s0;
import t7.p;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
final class a extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f196272e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f196273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f196274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f196275d;

    public a(s0 s0Var) {
        super(s0Var);
    }

    @Override // u8.e
    protected boolean b(c0 c0Var) throws e.a {
        if (this.f196273b) {
            c0Var.g0(1);
        } else {
            int iQ = c0Var.Q();
            int i15 = (iQ >> 4) & 15;
            this.f196275d = i15;
            if (i15 == 2) {
                this.f196296a.e(new p.b().X("video/x-flv").A0("audio/mpeg").U(1).B0(f196272e[(iQ >> 2) & 3]).Q());
                this.f196274c = true;
            } else if (i15 == 7 || i15 == 8) {
                this.f196296a.e(new p.b().X("video/x-flv").A0(i15 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").U(1).B0(8000).Q());
                this.f196274c = true;
            } else if (i15 != 10) {
                throw new e.a("Audio format not supported: " + this.f196275d);
            }
            this.f196273b = true;
        }
        return true;
    }

    @Override // u8.e
    protected boolean c(c0 c0Var, long j15) {
        if (this.f196275d == 2) {
            int iA = c0Var.a();
            this.f196296a.a(c0Var, iA);
            this.f196296a.c(j15, 1, iA, 0, null);
            return true;
        }
        int iQ = c0Var.Q();
        if (iQ != 0 || this.f196274c) {
            if (this.f196275d == 10 && iQ != 1) {
                return false;
            }
            int iA2 = c0Var.a();
            this.f196296a.a(c0Var, iA2);
            this.f196296a.c(j15, 1, iA2, 0, null);
            return true;
        }
        int iA3 = c0Var.a();
        byte[] bArr = new byte[iA3];
        c0Var.u(bArr, 0, iA3);
        o8.a.b bVarE = o8.a.e(bArr);
        this.f196296a.e(new p.b().X("video/x-flv").A0("audio/mp4a-latm").V(bVarE.f143004c).U(bVarE.f143003b).B0(bVarE.f143002a).l0(Collections.singletonList(bArr)).Q());
        this.f196274c = true;
        return false;
    }
}
