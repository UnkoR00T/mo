package ta;

import fr.t;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u000e\u001a)\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!¨\u0006#"}, d2 = {"", "type", "", "a", "(Ljava/lang/String;)I", "Lya/b;", "connection", "tableName", "Lta/r;", "g", "(Lya/b;Ljava/lang/String;)Lta/r;", "", "Lta/r$c;", "d", "(Lya/b;Ljava/lang/String;)Ljava/util/Set;", "Lya/d;", "stmt", "", "Lta/e;", "c", "(Lya/d;)Ljava/util/List;", "", "Lta/r$a;", "b", "(Lya/b;Ljava/lang/String;)Ljava/util/Map;", "Lta/r$d;", "f", "name", "", "unique", "e", "(Lya/b;Ljava/lang/String;Z)Lta/r$d;", "", "[Ljava/lang/String;", "FTS_OPTIONS", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f189081a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e((Integer) ((Map.Entry) t15).getKey(), (Integer) ((Map.Entry) t16).getKey());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e((Integer) ((Map.Entry) t15).getKey(), (Integer) ((Map.Entry) t16).getKey());
        }
    }

    public static final int a(String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (fu.r.d0(upperCase, "INT", false, 2, null)) {
            return 3;
        }
        if (fu.r.d0(upperCase, "CHAR", false, 2, null) || fu.r.d0(upperCase, "CLOB", false, 2, null) || fu.r.d0(upperCase, "TEXT", false, 2, null)) {
            return 2;
        }
        if (fu.r.d0(upperCase, "BLOB", false, 2, null)) {
            return 5;
        }
        return (fu.r.d0(upperCase, "REAL", false, 2, null) || fu.r.d0(upperCase, "FLOA", false, 2, null) || fu.r.d0(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
    }

    private static final Map<String, r.a> b(ya.b bVar, String str) throws Exception {
        ya.d dVarE4 = bVar.e4("PRAGMA table_info(`" + str + "`)");
        try {
            if (!dVarE4.Y3()) {
                Map<String, r.a> mapI = v0.i();
                cr.a.a(dVarE4, null);
                return mapI;
            }
            int iA = m.a(dVarE4, "name");
            int iA2 = m.a(dVarE4, "type");
            int iA3 = m.a(dVarE4, "notnull");
            int iA4 = m.a(dVarE4, "pk");
            int iA5 = m.a(dVarE4, "dflt_value");
            Map mapC = v0.c();
            do {
                String strU3 = dVarE4.u3(iA);
                mapC.put(strU3, new r.a(strU3, dVarE4.u3(iA2), dVarE4.getLong(iA3) != 0, (int) dVarE4.getLong(iA4), dVarE4.isNull(iA5) ? null : dVarE4.u3(iA5), 2));
            } while (dVarE4.Y3());
            Map<String, r.a> mapB = v0.b(mapC);
            cr.a.a(dVarE4, null);
            return mapB;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }

    private static final List<e> c(ya.d dVar) {
        int iA = m.a(dVar, "id");
        int iA2 = m.a(dVar, "seq");
        int iA3 = m.a(dVar, "from");
        int iA4 = m.a(dVar, "to");
        List listC = v.c();
        while (dVar.Y3()) {
            listC.add(new e((int) dVar.getLong(iA), (int) dVar.getLong(iA2), dVar.u3(iA3), dVar.u3(iA4)));
        }
        return v.T0(v.a(listC));
    }

    private static final Set<r.c> d(ya.b bVar, String str) throws Exception {
        ya.d dVarE4 = bVar.e4("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int iA = m.a(dVarE4, "id");
            int iA2 = m.a(dVarE4, "seq");
            int iA3 = m.a(dVarE4, "table");
            int iA4 = m.a(dVarE4, "on_delete");
            int iA5 = m.a(dVarE4, "on_update");
            List<e> listC = c(dVarE4);
            dVarE4.reset();
            Set setB = e1.b();
            while (dVarE4.Y3()) {
                if (dVarE4.getLong(iA2) == 0) {
                    int i15 = (int) dVarE4.getLong(iA);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<e> arrayList3 = new ArrayList();
                    for (Object obj : listC) {
                        if (((e) obj).getId() == i15) {
                            arrayList3.add(obj);
                        }
                    }
                    for (e eVar : arrayList3) {
                        arrayList.add(eVar.getFrom());
                        arrayList2.add(eVar.getTo());
                    }
                    setB.add(new r.c(dVarE4.u3(iA3), dVarE4.u3(iA4), dVarE4.u3(iA5), arrayList, arrayList2));
                }
            }
            Set<r.c> setA = e1.a(setB);
            cr.a.a(dVarE4, null);
            return setA;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }

    private static final r.d e(ya.b bVar, String str, boolean z15) throws Exception {
        ya.d dVarE4 = bVar.e4("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iA = m.a(dVarE4, "seqno");
            int iA2 = m.a(dVarE4, "cid");
            int iA3 = m.a(dVarE4, "name");
            int iA4 = m.a(dVarE4, "desc");
            if (iA != -1 && iA2 != -1 && iA3 != -1 && iA4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (dVarE4.Y3()) {
                    if (((int) dVarE4.getLong(iA2)) >= 0) {
                        int i15 = (int) dVarE4.getLong(iA);
                        String strU3 = dVarE4.u3(iA3);
                        String str2 = dVarE4.getLong(iA4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i15), strU3);
                        linkedHashMap2.put(Integer.valueOf(i15), str2);
                    }
                }
                List listU0 = v.U0(linkedHashMap.entrySet(), new a());
                ArrayList arrayList = new ArrayList(v.y(listU0, 10));
                Iterator it = listU0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listF1 = v.f1(arrayList);
                List listU1 = v.U0(linkedHashMap2.entrySet(), new b());
                ArrayList arrayList2 = new ArrayList(v.y(listU1, 10));
                Iterator it4 = listU1.iterator();
                while (it4.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it4.next()).getValue());
                }
                r.d dVar = new r.d(str, z15, listF1, v.f1(arrayList2));
                cr.a.a(dVarE4, null);
                return dVar;
            }
            cr.a.a(dVarE4, null);
            return null;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }

    private static final Set<r.d> f(ya.b bVar, String str) throws Exception {
        ya.d dVarE4 = bVar.e4("PRAGMA index_list(`" + str + "`)");
        try {
            int iA = m.a(dVarE4, "name");
            int iA2 = m.a(dVarE4, "origin");
            int iA3 = m.a(dVarE4, "unique");
            if (iA != -1 && iA2 != -1 && iA3 != -1) {
                Set setB = e1.b();
                while (dVarE4.Y3()) {
                    if (t.c("c", dVarE4.u3(iA2))) {
                        r.d dVarE = e(bVar, dVarE4.u3(iA), dVarE4.getLong(iA3) == 1);
                        if (dVarE == null) {
                            cr.a.a(dVarE4, null);
                            return null;
                        }
                        setB.add(dVarE);
                    }
                }
                Set<r.d> setA = e1.a(setB);
                cr.a.a(dVarE4, null);
                return setA;
            }
            cr.a.a(dVarE4, null);
            return null;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                cr.a.a(dVarE4, th4);
                throw th5;
            }
        }
    }

    public static final r g(ya.b bVar, String str) {
        return new r(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }
}
