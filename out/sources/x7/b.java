package x7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t7.v;
import w7.c0;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f217145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f217146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f217147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f217148d;

    public b(String str, byte[] bArr, int i15, int i16) {
        f(str, bArr, i16);
        this.f217145a = str;
        this.f217146b = bArr;
        this.f217147c = i15;
        this.f217148d = i16;
    }

    private static String e(List<Integer> list) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("track types = ");
        zj.i.g(',').c(sb5, list);
        return sb5.toString();
    }

    private static void f(String str, byte[] bArr, int i15) {
        byte b15;
        str.getClass();
        boolean z15 = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i15 == 23 && bArr.length == 4) {
                    z15 = true;
                }
                p.d(z15);
                break;
            case "auxiliary.tracks.interleaved":
                if (i15 == 75 && bArr.length == 1 && ((b15 = bArr[0]) == 0 || b15 == 1)) {
                    z15 = true;
                }
                p.d(z15);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i15 == 78 && bArr.length == 8) {
                    z15 = true;
                }
                p.d(z15);
                break;
            case "auxiliary.tracks.map":
                p.d(i15 == 0);
                break;
        }
    }

    public List<Integer> d() {
        p.x(this.f217145a.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b15 = this.f217146b[1];
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < b15; i15++) {
            arrayList.add(Integer.valueOf(this.f217146b[i15 + 2]));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f217145a.equals(bVar.f217145a) && Arrays.equals(this.f217146b, bVar.f217146b) && this.f217147c == bVar.f217147c && this.f217148d == bVar.f217148d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f217145a.hashCode()) * 31) + Arrays.hashCode(this.f217146b)) * 31) + this.f217147c) * 31) + this.f217148d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    public String toString() {
        String strE;
        int i15 = this.f217148d;
        if (i15 != 0) {
            if (i15 == 1) {
                strE = o0.G(this.f217146b);
            } else if (i15 == 23) {
                strE = String.valueOf(Float.intBitsToFloat(ek.g.h(this.f217146b)));
            } else if (i15 == 67) {
                strE = String.valueOf(ek.g.h(this.f217146b));
            } else if (i15 == 75) {
                strE = String.valueOf(Byte.toUnsignedInt(this.f217146b[0]));
            } else if (i15 != 78) {
                strE = o0.d1(this.f217146b);
            } else {
                strE = String.valueOf(new c0(this.f217146b).X());
            }
        } else if (this.f217145a.equals("auxiliary.tracks.map")) {
            strE = e(d());
        } else {
            strE = o0.d1(this.f217146b);
        }
        return "mdta: key=" + this.f217145a + ", value=" + strE;
    }
}
