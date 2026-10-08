package wv;

import java.util.ArrayList;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import vv.b0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0015\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\"\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001b\"\u0014\u0010$\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001b\"\u0018\u0010&\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0003\"\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0011*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lvv/b0;", "", "o", "(Lvv/b0;)I", "", "n", "(Lvv/b0;)Z", "child", "normalize", "j", "(Lvv/b0;Lvv/b0;Z)Lvv/b0;", "", "k", "(Ljava/lang/String;Z)Lvv/b0;", "Lvv/e;", "q", "(Lvv/e;Z)Lvv/b0;", "Lvv/h;", "s", "(Ljava/lang/String;)Lvv/h;", "", "r", "(B)Lvv/h;", "slash", "p", "(Lvv/e;Lvv/h;)Z", "a", "Lvv/h;", "SLASH", "b", "BACKSLASH", "c", "ANY_SLASH", "d", "DOT", "e", "DOT_DOT", "l", "indexOfLastSlash", "m", "(Lvv/b0;)Lvv/h;", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final vv.h f215229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final vv.h f215230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final vv.h f215231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final vv.h f215232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final vv.h f215233e;

    static {
        vv.h.Companion companion = vv.h.INSTANCE;
        f215229a = companion.d("/");
        f215230b = companion.d("\\");
        f215231c = companion.d("/\\");
        f215232d = companion.d(".");
        f215233e = companion.d("..");
    }

    public static final b0 j(b0 b0Var, b0 b0Var2, boolean z15) {
        if (b0Var2.isAbsolute() || b0Var2.t() != null) {
            return b0Var2;
        }
        vv.h hVarM = m(b0Var);
        if (hVarM == null && (hVarM = m(b0Var2)) == null) {
            hVarM = s(b0.f208327c);
        }
        vv.e eVar = new vv.e();
        eVar.M0(b0Var.getBytes());
        if (eVar.getSize() > 0) {
            eVar.M0(hVarM);
        }
        eVar.M0(b0Var2.getBytes());
        return q(eVar, z15);
    }

    public static final b0 k(String str, boolean z15) {
        return q(new vv.e().k1(str), z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(b0 b0Var) {
        int iG = vv.h.G(b0Var.getBytes(), f215229a, 0, 2, null);
        return iG != -1 ? iG : vv.h.G(b0Var.getBytes(), f215230b, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vv.h m(b0 b0Var) {
        vv.h bytes = b0Var.getBytes();
        vv.h hVar = f215229a;
        if (vv.h.y(bytes, hVar, 0, 2, null) != -1) {
            return hVar;
        }
        vv.h bytes2 = b0Var.getBytes();
        vv.h hVar2 = f215230b;
        if (vv.h.y(bytes2, hVar2, 0, 2, null) != -1) {
            return hVar2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(b0 b0Var) {
        return b0Var.getBytes().k(f215233e) && (b0Var.getBytes().Q() == 2 || b0Var.getBytes().H(b0Var.getBytes().Q() + (-3), f215229a, 0, 1) || b0Var.getBytes().H(b0Var.getBytes().Q() + (-3), f215230b, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(b0 b0Var) {
        if (b0Var.getBytes().Q() == 0) {
            return -1;
        }
        if (b0Var.getBytes().n(0) == 47) {
            return 1;
        }
        if (b0Var.getBytes().n(0) == 92) {
            if (b0Var.getBytes().Q() <= 2 || b0Var.getBytes().n(1) != 92) {
                return 1;
            }
            int iV = b0Var.getBytes().v(f215230b, 2);
            return iV == -1 ? b0Var.getBytes().Q() : iV;
        }
        if (b0Var.getBytes().Q() > 2 && b0Var.getBytes().n(1) == 58 && b0Var.getBytes().n(2) == 92) {
            char cN = (char) b0Var.getBytes().n(0);
            if ('a' <= cN && cN < '{') {
                return 3;
            }
            if ('A' <= cN && cN < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean p(vv.e eVar, vv.h hVar) {
        if (!fr.t.c(hVar, f215230b) || eVar.getSize() < 2 || eVar.I(1L) != 58) {
            return false;
        }
        char cI = (char) eVar.I(0L);
        if ('a' > cI || cI >= '{') {
            return 'A' <= cI && cI < '[';
        }
        return true;
    }

    public static final b0 q(vv.e eVar, boolean z15) {
        vv.h hVar;
        vv.h hVarR2;
        vv.e eVar2 = new vv.e();
        vv.h hVarR = null;
        int i15 = 0;
        while (true) {
            if (!eVar.a0(0L, f215229a)) {
                hVar = f215230b;
                if (!eVar.a0(0L, hVar)) {
                    break;
                }
            }
            byte b15 = eVar.readByte();
            if (hVarR == null) {
                hVarR = r(b15);
            }
            i15++;
        }
        boolean z16 = i15 >= 2 && fr.t.c(hVarR, hVar);
        if (z16) {
            eVar2.M0(hVarR);
            eVar2.M0(hVarR);
        } else if (i15 > 0) {
            eVar2.M0(hVarR);
        } else {
            long jV0 = eVar.v0(f215231c);
            if (hVarR == null) {
                hVarR = jV0 == -1 ? s(b0.f208327c) : r(eVar.I(jV0));
            }
            if (p(eVar, hVarR)) {
                if (jV0 == 2) {
                    eVar2.O3(eVar, 3L);
                } else {
                    eVar2.O3(eVar, 2L);
                }
            }
            i0 i0Var = i0.f148189a;
        }
        boolean z17 = eVar2.getSize() > 0;
        ArrayList arrayList = new ArrayList();
        while (!eVar.K2()) {
            long jV1 = eVar.v0(f215231c);
            if (jV1 == -1) {
                hVarR2 = eVar.d0();
            } else {
                hVarR2 = eVar.r2(jV1);
                eVar.readByte();
            }
            vv.h hVar2 = f215233e;
            if (fr.t.c(hVarR2, hVar2)) {
                if (!z17 || !arrayList.isEmpty()) {
                    if (!z15 || (!z17 && (arrayList.isEmpty() || fr.t.c(v.x0(arrayList), hVar2)))) {
                        arrayList.add(hVarR2);
                    } else if (!z16 || arrayList.size() != 1) {
                        v.N(arrayList);
                    }
                }
            } else if (!fr.t.c(hVarR2, f215232d) && !fr.t.c(hVarR2, vv.h.f208378e)) {
                arrayList.add(hVarR2);
            }
        }
        int size = arrayList.size();
        for (int i16 = 0; i16 < size; i16++) {
            if (i16 > 0) {
                eVar2.M0(hVarR);
            }
            eVar2.M0((vv.h) arrayList.get(i16));
        }
        if (eVar2.getSize() == 0) {
            eVar2.M0(f215232d);
        }
        return new b0(eVar2.d0());
    }

    private static final vv.h r(byte b15) {
        if (b15 == 47) {
            return f215229a;
        }
        if (b15 == 92) {
            return f215230b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vv.h s(String str) {
        if (fr.t.c(str, "/")) {
            return f215229a;
        }
        if (fr.t.c(str, "\\")) {
            return f215230b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
