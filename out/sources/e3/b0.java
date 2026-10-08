package e3;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\r\u001a\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\r\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "data", "Le3/a0;", "e", "(Ljava/lang/String;)Le3/a0;", "f", "Le3/z;", "", "a", "(Le3/z;)Z", "", "Le3/w;", "c", "(Le3/z;)Ljava/util/List;", "d", "Le3/t;", "b", "g", "(Ljava/lang/String;)Ljava/lang/String;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b0 {
    private static final boolean a(z zVar) {
        return zVar.getI() < zVar.getData().length() - 1 && Character.isLetter(zVar.getData().charAt(zVar.getI())) && zVar.getData().charAt(zVar.getI() + 1) == '(';
    }

    private static final List<t> b(z zVar) throws x {
        boolean z15;
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        while (!zVar.c() && !zVar.h(':')) {
            if (zVar.h('*')) {
                z.b(zVar, 0, 1, null);
                z15 = true;
            } else {
                z15 = false;
            }
            Integer numValueOf2 = !zVar.h('@') ? Integer.valueOf(zVar.j("@") + 1) : null;
            z.b(zVar, 0, 1, null);
            int iJ = zVar.j("L,:");
            if (zVar.h('L')) {
                z.b(zVar, 0, 1, null);
                numValueOf = Integer.valueOf(zVar.j(",:"));
            } else {
                numValueOf = null;
            }
            arrayList.add(new t(numValueOf2 != null ? numValueOf2.intValue() : -1, iJ, numValueOf != null ? numValueOf.intValue() : -1, z15));
            if (zVar.h(',')) {
                z.b(zVar, 0, 1, null);
            }
        }
        z.b(zVar, 0, 1, null);
        return arrayList;
    }

    private static final List<w> c(z zVar) throws x {
        String strG;
        zVar.a(2);
        ArrayList arrayList = new ArrayList();
        boolean z15 = false;
        while (!zVar.c() && !zVar.h(')')) {
            if (zVar.h('!')) {
                z.b(zVar, 0, 1, null);
                String strK = zVar.k("!,)");
                if (strK.length() != 0) {
                    int i15 = Integer.parseInt(strK);
                    int i16 = 0;
                    while (i15 > 0) {
                        int size = arrayList.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size) {
                                arrayList.add(new w(i16, null, null, 6, null));
                                i15--;
                                break;
                            }
                            if (((w) arrayList.get(i17)).getSortedIndex() == i16) {
                                i16++;
                                break;
                            }
                            i17++;
                        }
                    }
                } else {
                    z15 = true;
                }
            } else {
                int iJ = zVar.j("!:,)");
                if (zVar.h(':')) {
                    z.b(zVar, 0, 1, null);
                    strG = g(zVar.k("!,)"));
                } else {
                    strG = null;
                }
                if (z15) {
                    int i18 = 0;
                    while (i18 < iJ) {
                        int size2 = arrayList.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 >= size2) {
                                arrayList.add(new w(i18, null, null, 6, null));
                                break;
                            }
                            if (((w) arrayList.get(i19)).getSortedIndex() == i18) {
                                i18++;
                                break;
                            }
                            i19++;
                        }
                    }
                    z15 = false;
                }
                arrayList.add(new w(iJ, null, strG, 2, null));
            }
            if (zVar.h(',')) {
                z.b(zVar, 0, 1, null);
            }
        }
        zVar.e(')');
        z.b(zVar, 0, 1, null);
        return arrayList;
    }

    private static final List<w> d(z zVar) throws x {
        String strG;
        zVar.a(2);
        ArrayList arrayList = new ArrayList();
        while (!zVar.c() && !zVar.h(')')) {
            String strK = zVar.k(":,)");
            if (zVar.h(':')) {
                z.b(zVar, 0, 1, null);
                strG = g(zVar.k(",)"));
            } else {
                strG = null;
            }
            arrayList.add(new w(arrayList.size(), strK, strG));
            if (zVar.h(',')) {
                z.b(zVar, 0, 1, null);
            }
        }
        zVar.e(')');
        z.b(zVar, 0, 1, null);
        return arrayList;
    }

    public static final a0 e(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return f(str);
        } catch (x e15) {
            y2.c0.a(e15.getMessage(), e15);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0082 A[SYNTHETIC] */
    public static final a0 f(String str) throws x {
        boolean z15;
        boolean z16;
        String strK;
        List<w> listN;
        List<t> listN2;
        String strK2;
        char cD;
        int i15;
        z zVar = new z(str);
        String strL = null;
        if (zVar.h('C')) {
            z.b(zVar, 0, 1, null);
            if (zVar.h('C')) {
                z.b(zVar, 0, 1, null);
                z15 = true;
            } else {
                z15 = false;
            }
            if (zVar.h('(')) {
                z.b(zVar, 0, 1, null);
                strK = zVar.k(")");
                zVar.e(')');
                z.b(zVar, 0, 1, null);
                z16 = true;
            } else {
                z16 = true;
            }
            listN = pq.v.n();
            while (a(zVar)) {
                cD = zVar.d();
                if (cD != 'N') {
                    listN = d(zVar);
                } else if (cD != 'P') {
                    zVar.a(2);
                    i15 = 0;
                    while (true) {
                        if (i15 > 0 && zVar.h(')')) {
                            zVar.e(')');
                            z.b(zVar, 0, 1, null);
                            break;
                        }
                        if (!zVar.c()) {
                            zVar.m("unexpected end");
                            throw new oq.g();
                        }
                        if (zVar.h('(')) {
                            i15++;
                        } else if (zVar.h(')')) {
                            i15--;
                        }
                        z.b(zVar, 0, 1, null);
                    }
                } else {
                    listN = c(zVar);
                }
            }
            listN2 = pq.v.n();
            if (zVar.h(':')) {
                z.b(zVar, 0, 1, null);
            } else {
                listN2 = b(zVar);
            }
            strK2 = zVar.k("#");
            if (strK2.length() <= 0) {
                strK2 = null;
            }
            if (zVar.h('#')) {
                z.b(zVar, 0, 1, null);
                strL = zVar.l();
            }
            String str2 = strK2;
            return new a0(z16, z15, strK, str2, listN, strL, listN2, str);
        }
        z15 = false;
        z16 = false;
        strK = null;
        listN = pq.v.n();
        while (a(zVar)) {
            cD = zVar.d();
            if (cD != 'N') {
                listN = d(zVar);
            } else if (cD != 'P') {
                zVar.a(2);
                i15 = 0;
                while (true) {
                    if (i15 > 0) {
                    }
                    if (!zVar.c()) {
                        zVar.m("unexpected end");
                        throw new oq.g();
                    }
                    if (zVar.h('(')) {
                        i15++;
                    } else if (zVar.h(')')) {
                        i15--;
                    }
                    z.b(zVar, 0, 1, null);
                }
            } else {
                listN = c(zVar);
            }
        }
        listN2 = pq.v.n();
        if (zVar.h(':')) {
            listN2 = b(zVar);
        } else {
            z.b(zVar, 0, 1, null);
        }
        strK2 = zVar.k("#");
        if (strK2.length() <= 0) {
            strK2 = null;
        }
        if (zVar.h('#')) {
            z.b(zVar, 0, 1, null);
            strL = zVar.l();
        }
        String str3 = strK2;
        return new a0(z16, z15, strK, str3, listN, strL, listN2, str);
    }

    private static final String g(String str) {
        return fu.r.R(str, "c#", "androidx.compose.", false, 4, null);
    }
}
