package i9;

import ak.h2;
import ak.n0;
import o8.e0;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
final class j {
    private static c9.e a(int i15, c0 c0Var) {
        int iZ = c0Var.z();
        if (c0Var.z() == 1684108385) {
            c0Var.g0(8);
            String strL = c0Var.L(iZ - 16);
            return new c9.e("und", strL, strL);
        }
        w7.t.h("MetadataUtil", "Failed to parse comment attribute: " + x7.d.a(i15));
        return null;
    }

    private static c9.a b(c0 c0Var) {
        String str;
        int iZ = c0Var.z();
        if (c0Var.z() != 1684108385) {
            w7.t.h("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iP = b.p(c0Var.z());
        if (iP == 13) {
            str = "image/jpeg";
        } else {
            str = iP == 14 ? "image/png" : null;
        }
        if (str == null) {
            w7.t.h("MetadataUtil", "Unrecognized cover art flags: " + iP);
            return null;
        }
        c0Var.g0(4);
        int i15 = iZ - 16;
        byte[] bArr = new byte[i15];
        c0Var.u(bArr, 0, i15);
        return new c9.a(str, null, 3, bArr);
    }

    public static t7.v.a c(c0 c0Var) {
        int iG = c0Var.g() + c0Var.z();
        int iZ = c0Var.z();
        int i15 = (iZ >> 24) & GF2Field.MASK;
        try {
            if (i15 == 169 || i15 == 253) {
                int i16 = 16777215 & iZ;
                if (i16 == 6516084) {
                    c9.e eVarA = a(iZ, c0Var);
                    c0Var.f0(iG);
                    return eVarA;
                }
                if (i16 == 7233901 || i16 == 7631467) {
                    c9.n nVarJ = j(iZ, "TIT2", c0Var);
                    c0Var.f0(iG);
                    return nVarJ;
                }
                if (i16 == 6516589 || i16 == 7828084) {
                    c9.n nVarJ2 = j(iZ, "TCOM", c0Var);
                    c0Var.f0(iG);
                    return nVarJ2;
                }
                if (i16 == 6578553) {
                    c9.n nVarJ3 = j(iZ, "TDRC", c0Var);
                    c0Var.f0(iG);
                    return nVarJ3;
                }
                if (i16 == 4280916) {
                    c9.n nVarJ4 = j(iZ, "TPE1", c0Var);
                    c0Var.f0(iG);
                    return nVarJ4;
                }
                if (i16 == 7630703) {
                    c9.n nVarJ5 = j(iZ, "TSSE", c0Var);
                    c0Var.f0(iG);
                    return nVarJ5;
                }
                if (i16 == 6384738) {
                    c9.n nVarJ6 = j(iZ, "TALB", c0Var);
                    c0Var.f0(iG);
                    return nVarJ6;
                }
                if (i16 == 7108978) {
                    c9.n nVarJ7 = j(iZ, "USLT", c0Var);
                    c0Var.f0(iG);
                    return nVarJ7;
                }
                if (i16 == 6776174) {
                    c9.n nVarJ8 = j(iZ, "TCON", c0Var);
                    c0Var.f0(iG);
                    return nVarJ8;
                }
                if (i16 == 6779504) {
                    c9.n nVarJ9 = j(iZ, "TIT1", c0Var);
                    c0Var.f0(iG);
                    return nVarJ9;
                }
                if (i16 == 7173742) {
                    c9.n nVarJ10 = j(iZ, "MVNM", c0Var);
                    c0Var.f0(iG);
                    return nVarJ10;
                }
                if (i16 == 7173737) {
                    c9.i iVarF = f(iZ, "MVIN", c0Var, true, false);
                    c0Var.f0(iG);
                    return iVarF;
                }
            } else {
                if (iZ == 1735291493) {
                    c9.n nVarI = i(c0Var);
                    c0Var.f0(iG);
                    return nVarI;
                }
                if (iZ == 1684632427) {
                    c9.n nVarD = d(iZ, "TPOS", c0Var);
                    c0Var.f0(iG);
                    return nVarD;
                }
                if (iZ == 1953655662) {
                    c9.n nVarD2 = d(iZ, "TRCK", c0Var);
                    c0Var.f0(iG);
                    return nVarD2;
                }
                if (iZ == 1953329263) {
                    c9.i iVarF2 = f(iZ, "TBPM", c0Var, true, false);
                    c0Var.f0(iG);
                    return iVarF2;
                }
                if (iZ == 1668311404) {
                    c9.i iVarF3 = f(iZ, "TCMP", c0Var, true, true);
                    c0Var.f0(iG);
                    return iVarF3;
                }
                if (iZ == 1668249202) {
                    c9.a aVarB = b(c0Var);
                    c0Var.f0(iG);
                    return aVarB;
                }
                if (iZ == 1631670868) {
                    c9.n nVarJ11 = j(iZ, "TPE2", c0Var);
                    c0Var.f0(iG);
                    return nVarJ11;
                }
                if (iZ == 1936682605) {
                    c9.n nVarJ12 = j(iZ, "TSOT", c0Var);
                    c0Var.f0(iG);
                    return nVarJ12;
                }
                if (iZ == 1936679276) {
                    c9.n nVarJ13 = j(iZ, "TSOA", c0Var);
                    c0Var.f0(iG);
                    return nVarJ13;
                }
                if (iZ == 1936679282) {
                    c9.n nVarJ14 = j(iZ, "TSOP", c0Var);
                    c0Var.f0(iG);
                    return nVarJ14;
                }
                if (iZ == 1936679265) {
                    c9.n nVarJ15 = j(iZ, "TSO2", c0Var);
                    c0Var.f0(iG);
                    return nVarJ15;
                }
                if (iZ == 1936679791) {
                    c9.n nVarJ16 = j(iZ, "TSOC", c0Var);
                    c0Var.f0(iG);
                    return nVarJ16;
                }
                if (iZ == 1920233063) {
                    c9.i iVarF4 = f(iZ, "ITUNESADVISORY", c0Var, false, false);
                    c0Var.f0(iG);
                    return iVarF4;
                }
                if (iZ == 1885823344) {
                    c9.i iVarF5 = f(iZ, "ITUNESGAPLESS", c0Var, false, true);
                    c0Var.f0(iG);
                    return iVarF5;
                }
                if (iZ == 1936683886) {
                    c9.n nVarJ17 = j(iZ, "TVSHOWSORT", c0Var);
                    c0Var.f0(iG);
                    return nVarJ17;
                }
                if (iZ == 1953919848) {
                    c9.n nVarJ18 = j(iZ, "TVSHOW", c0Var);
                    c0Var.f0(iG);
                    return nVarJ18;
                }
                if (iZ == 757935405) {
                    c9.i iVarG = g(c0Var, iG);
                    c0Var.f0(iG);
                    return iVarG;
                }
            }
            w7.t.b("MetadataUtil", "Skipped unknown metadata entry: " + x7.d.a(iZ));
            c0Var.f0(iG);
            return null;
        } catch (Throwable th4) {
            c0Var.f0(iG);
            throw th4;
        }
    }

    private static c9.n d(int i15, String str, c0 c0Var) {
        int iZ = c0Var.z();
        if (c0Var.z() == 1684108385 && iZ >= 22) {
            c0Var.g0(10);
            int iY = c0Var.Y();
            if (iY > 0) {
                String str2 = "" + iY;
                int iY2 = c0Var.Y();
                if (iY2 > 0) {
                    str2 = str2 + "/" + iY2;
                }
                return new c9.n(str, null, n0.E(str2));
            }
        }
        w7.t.h("MetadataUtil", "Failed to parse index/count attribute: " + x7.d.a(i15));
        return null;
    }

    private static int e(c0 c0Var) {
        int iZ = c0Var.z();
        if (c0Var.z() == 1684108385) {
            c0Var.g0(8);
            int i15 = iZ - 16;
            if (i15 == 1) {
                return c0Var.Q();
            }
            if (i15 == 2) {
                return c0Var.Y();
            }
            if (i15 == 3) {
                return c0Var.T();
            }
            if (i15 == 4 && (c0Var.q() & 128) == 0) {
                return c0Var.U();
            }
        }
        w7.t.h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static c9.i f(int i15, String str, c0 c0Var, boolean z15, boolean z16) {
        int iE = e(c0Var);
        if (z16) {
            iE = Math.min(1, iE);
        }
        if (iE >= 0) {
            return z15 ? new c9.n(str, null, n0.E(Integer.toString(iE))) : new c9.e("und", str, Integer.toString(iE));
        }
        w7.t.h("MetadataUtil", "Failed to parse uint8 attribute: " + x7.d.a(i15));
        return null;
    }

    private static c9.i g(c0 c0Var, int i15) {
        String strL = null;
        String strL2 = null;
        int i16 = -1;
        int i17 = -1;
        while (c0Var.g() < i15) {
            int iG = c0Var.g();
            int iZ = c0Var.z();
            int iZ2 = c0Var.z();
            c0Var.g0(4);
            if (iZ2 == 1835360622) {
                strL = c0Var.L(iZ - 12);
            } else if (iZ2 == 1851878757) {
                strL2 = c0Var.L(iZ - 12);
            } else {
                if (iZ2 == 1684108385) {
                    i16 = iG;
                    i17 = iZ;
                }
                c0Var.g0(iZ - 12);
            }
        }
        if (strL == null || strL2 == null || i16 == -1) {
            return null;
        }
        c0Var.f0(i16);
        c0Var.g0(16);
        return new c9.k(strL, strL2, c0Var.L(i17 - 16));
    }

    public static x7.b h(c0 c0Var, int i15, String str) {
        while (true) {
            int iG = c0Var.g();
            if (iG >= i15) {
                return null;
            }
            int iZ = c0Var.z();
            if (c0Var.z() == 1684108385) {
                int iZ2 = c0Var.z();
                int iZ3 = c0Var.z();
                int i16 = iZ - 16;
                byte[] bArr = new byte[i16];
                c0Var.u(bArr, 0, i16);
                try {
                    return new x7.b(str, bArr, iZ3, iZ2);
                } catch (Exception unused) {
                    w7.t.h("MetadataUtil", "Failed to parse metadata entry with key: " + str);
                    return null;
                }
            }
            c0Var.f0(iG + iZ);
        }
    }

    private static c9.n i(c0 c0Var) {
        String strA = c9.j.a(e(c0Var) - 1);
        if (strA != null) {
            return new c9.n("TCON", null, n0.E(strA));
        }
        w7.t.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static c9.n j(int i15, String str, c0 c0Var) {
        int iZ = c0Var.z();
        if (c0Var.z() == 1684108385) {
            c0Var.g0(8);
            return new c9.n(str, null, n0.E(c0Var.L(iZ - 16)));
        }
        w7.t.h("MetadataUtil", "Failed to parse text attribute: " + x7.d.a(i15));
        return null;
    }

    public static void k(int i15, e0 e0Var, t7.p.b bVar) {
        if (i15 == 1 && e0Var.c()) {
            bVar.e0(e0Var.f143069a).f0(e0Var.f143070b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(int i15, t7.v vVar, t7.p.b bVar, t7.v vVar2, t7.v... vVarArr) {
        if (vVar2 == null) {
            vVar2 = new t7.v(new t7.v.a[0]);
        }
        if (vVar != null) {
            h2 it = vVar.f(x7.b.class).iterator();
            while (it.hasNext()) {
                x7.b bVar2 = (x7.b) it.next();
                if (!bVar2.f217145a.equals("com.android.capture.fps") || i15 == 2) {
                    vVar2 = vVar2.a(bVar2);
                }
            }
        }
        for (t7.v vVar3 : vVarArr) {
            vVar2 = vVar2.b(vVar3);
        }
        if (vVar2.j() > 0) {
            bVar.s0(vVar2);
        }
    }
}
