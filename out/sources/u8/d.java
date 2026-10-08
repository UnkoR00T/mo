package u8;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o8.n;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f196293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f196294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f196295d;

    public d() {
        super(new n());
        this.f196293b = -9223372036854775807L;
        this.f196294c = new long[0];
        this.f196295d = new long[0];
    }

    private static Boolean g(c0 c0Var) {
        return Boolean.valueOf(c0Var.Q() == 1);
    }

    private static Object h(c0 c0Var, int i15) {
        if (i15 == 0) {
            return j(c0Var);
        }
        if (i15 == 1) {
            return g(c0Var);
        }
        if (i15 == 2) {
            return n(c0Var);
        }
        if (i15 == 3) {
            return l(c0Var);
        }
        if (i15 == 8) {
            return k(c0Var);
        }
        if (i15 == 10) {
            return m(c0Var);
        }
        if (i15 != 11) {
            return null;
        }
        return i(c0Var);
    }

    private static Date i(c0 c0Var) {
        Date date = new Date((long) j(c0Var).doubleValue());
        c0Var.g0(2);
        return date;
    }

    private static Double j(c0 c0Var) {
        return Double.valueOf(Double.longBitsToDouble(c0Var.J()));
    }

    private static HashMap<String, Object> k(c0 c0Var) {
        int iU = c0Var.U();
        HashMap<String, Object> map = new HashMap<>(iU);
        for (int i15 = 0; i15 < iU; i15++) {
            String strN = n(c0Var);
            Object objH = h(c0Var, o(c0Var));
            if (objH != null) {
                map.put(strN, objH);
            }
        }
        return map;
    }

    private static HashMap<String, Object> l(c0 c0Var) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strN = n(c0Var);
            int iO = o(c0Var);
            if (iO == 9) {
                return map;
            }
            Object objH = h(c0Var, iO);
            if (objH != null) {
                map.put(strN, objH);
            }
        }
    }

    private static ArrayList<Object> m(c0 c0Var) {
        int iU = c0Var.U();
        ArrayList<Object> arrayList = new ArrayList<>(iU);
        for (int i15 = 0; i15 < iU; i15++) {
            Object objH = h(c0Var, o(c0Var));
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        return arrayList;
    }

    private static String n(c0 c0Var) {
        int iY = c0Var.Y();
        int iG = c0Var.g();
        c0Var.g0(iY);
        return new String(c0Var.f(), iG, iY);
    }

    private static int o(c0 c0Var) {
        return c0Var.Q();
    }

    @Override // u8.e
    protected boolean b(c0 c0Var) {
        return true;
    }

    @Override // u8.e
    protected boolean c(c0 c0Var, long j15) {
        if (o(c0Var) != 2 || !"onMetaData".equals(n(c0Var)) || c0Var.a() == 0 || o(c0Var) != 8) {
            return false;
        }
        HashMap<String, Object> mapK = k(c0Var);
        Object obj = mapK.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f196293b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapK.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f196294c = new long[size];
                this.f196295d = new long[size];
                for (int i15 = 0; i15 < size; i15++) {
                    Object obj5 = list.get(i15);
                    Object obj6 = list2.get(i15);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f196294c = new long[0];
                        this.f196295d = new long[0];
                        break;
                    }
                    this.f196294c[i15] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f196295d[i15] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long d() {
        return this.f196293b;
    }

    public long[] e() {
        return this.f196295d;
    }

    public long[] f() {
        return this.f196294c;
    }
}
