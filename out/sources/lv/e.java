package lv;

import fr.t;
import fu.r;
import fv.d0;
import fv.m;
import fv.n;
import fv.u;
import fv.v;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!¨\u0006$"}, d2 = {"Lfv/u;", "", "headerName", "", "Lfv/h;", "a", "(Lfv/u;Ljava/lang/String;)Ljava/util/List;", "Lvv/e;", "", "result", "Loq/i0;", "c", "(Lvv/e;Ljava/util/List;)V", "", "g", "(Lvv/e;)Z", "", "prefix", "h", "(Lvv/e;B)Z", "d", "(Lvv/e;)Ljava/lang/String;", "e", "Lfv/n;", "Lfv/v;", "url", "headers", "f", "(Lfv/n;Lfv/v;Lfv/u;)V", "Lfv/d0;", "b", "(Lfv/d0;)Z", "Lvv/h;", "Lvv/h;", "QUOTED_STRING_DELIMITERS", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final vv.h f120552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final vv.h f120553b;

    static {
        vv.h.Companion companion = vv.h.INSTANCE;
        f120552a = companion.d("\"\\");
        f120553b = companion.d("\t ,=");
    }

    public static final List<fv.h> a(u uVar, String str) {
        ArrayList arrayList = new ArrayList();
        int size = uVar.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (r.G(str, uVar.f(i15), true)) {
                try {
                    c(new vv.e().k1(uVar.k(i15)), arrayList);
                } catch (EOFException e15) {
                    ov.h.INSTANCE.g().j("Unable to parse challenge", 5, e15);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(d0 d0Var) {
        if (t.c(d0Var.getRequest().getMethod(), "HEAD")) {
            return false;
        }
        int code = d0Var.getCode();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && gv.d.v(d0Var) == -1 && !r.G("chunked", d0.E(d0Var, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7 A[EDGE_INSN: B:59:0x00b7->B:48:0x00b7 BREAK  A[LOOP:2: B:22:0x006e->B:47:0x00b5], SYNTHETIC] */
    private static final void c(vv.e eVar, List<fv.h> list) {
        String strE;
        while (true) {
            String strE2 = null;
            while (true) {
                if (strE2 == null) {
                    g(eVar);
                    strE2 = e(eVar);
                    if (strE2 == null) {
                        return;
                    }
                }
                boolean zG = g(eVar);
                String strE3 = e(eVar);
                if (strE3 == null) {
                    if (eVar.K2()) {
                        list.add(new fv.h(strE2, v0.i()));
                        return;
                    }
                    return;
                }
                int iK = gv.d.K(eVar, (byte) 61);
                boolean zG2 = g(eVar);
                if (zG || !(zG2 || eVar.K2())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iK2 = iK + gv.d.K(eVar, (byte) 61);
                    while (true) {
                        if (strE3 != null) {
                            if (iK2 != 0) {
                                break;
                                break;
                            }
                            if (iK2 <= 1) {
                                return;
                            }
                            if (h(eVar, (byte) 34)) {
                                strE = d(eVar);
                            } else {
                                strE = e(eVar);
                            }
                            if (strE != null) {
                                return;
                            }
                            if (g(eVar)) {
                            }
                            strE3 = null;
                        } else {
                            strE3 = e(eVar);
                            if (!g(eVar)) {
                                iK2 = gv.d.K(eVar, (byte) 61);
                                if (iK2 != 0) {
                                    break;
                                }
                                if (iK2 <= 1 || g(eVar)) {
                                    return;
                                }
                                if (h(eVar, (byte) 34)) {
                                    strE = d(eVar);
                                } else {
                                    strE = e(eVar);
                                }
                                if (strE != null || ((String) linkedHashMap.put(strE3, strE)) != null) {
                                    return;
                                }
                                if (g(eVar) && !eVar.K2()) {
                                    return;
                                } else {
                                    strE3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new fv.h(strE2, linkedHashMap));
                    strE2 = strE3;
                } else {
                    list.add(new fv.h(strE2, Collections.singletonMap(null, strE3 + r.L("=", iK))));
                }
            }
        }
    }

    private static final String d(vv.e eVar) {
        if (eVar.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        vv.e eVar2 = new vv.e();
        while (true) {
            long jV0 = eVar.v0(f120552a);
            if (jV0 == -1) {
                return null;
            }
            if (eVar.I(jV0) == 34) {
                eVar2.O3(eVar, jV0);
                eVar.readByte();
                return eVar2.C0();
            }
            if (eVar.getSize() == jV0 + 1) {
                return null;
            }
            eVar2.O3(eVar, jV0);
            eVar.readByte();
            eVar2.O3(eVar, 1L);
        }
    }

    private static final String e(vv.e eVar) {
        long jV0 = eVar.v0(f120553b);
        if (jV0 == -1) {
            jV0 = eVar.getSize();
        }
        if (jV0 != 0) {
            return eVar.n2(jV0);
        }
        return null;
    }

    public static final void f(n nVar, v vVar, u uVar) {
        if (nVar == n.f67472b) {
            return;
        }
        List<m> listE = m.INSTANCE.e(vVar, uVar);
        if (listE.isEmpty()) {
            return;
        }
        nVar.a(vVar, listE);
    }

    private static final boolean g(vv.e eVar) {
        boolean z15 = false;
        while (!eVar.K2()) {
            byte bI = eVar.I(0L);
            if (bI == 44) {
                eVar.readByte();
                z15 = true;
            } else {
                if (bI != 32 && bI != 9) {
                    break;
                }
                eVar.readByte();
            }
        }
        return z15;
    }

    private static final boolean h(vv.e eVar, byte b15) {
        return !eVar.K2() && eVar.I(0L) == b15;
    }
}
