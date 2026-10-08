package cj2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class b extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @vl.c("cid")
    private int f27453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @vl.c("cs")
    private final LinkedHashMap<Integer, a> f27454d = new LinkedHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @vl.c("cer")
    private HashMap<String, String> f27455e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @vl.c("lwlcd")
    private Date f27456f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @vl.c("hP")
    private String f27457g = "";

    public int f(a aVar) {
        int i15 = this.f27453c;
        aVar.m(i15);
        this.f27454d.put(Integer.valueOf(i15), aVar);
        this.f27453c++;
        c();
        return i15;
    }

    public List<a> g() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, a> entry : this.f27454d.entrySet()) {
            if (entry.getValue().j()) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public HashMap<aj2.a, Integer> h(Boolean bool) {
        HashMap<aj2.a, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, a> entry : this.f27454d.entrySet()) {
            aj2.a aVarI = k(entry.getKey().intValue()).i();
            if (aVarI == aj2.a.TOZSAMOSC || aVarI == aj2.a.SCHOOL_CARD || aVarI == aj2.a.STUDENT_CARD || aVarI == aj2.a.REFUGEE) {
                if (entry.getValue().j() && (!entry.getValue().k() || !bool.booleanValue())) {
                    map.put(aVarI, Integer.valueOf(entry.getValue().b()));
                }
            }
        }
        return map;
    }

    public List<Integer> i() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, a> entry : this.f27454d.entrySet()) {
            if (entry.getValue().j()) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    public ArrayList<Integer> j() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Map.Entry<Integer, a> entry : this.f27454d.entrySet()) {
            aj2.a aVarI = k(entry.getKey().intValue()).i();
            if (aVarI == aj2.a.TOZSAMOSC || aVarI == aj2.a.SCHOOL_CARD || aVarI == aj2.a.STUDENT_CARD || aVarI == aj2.a.REFUGEE) {
                if (!entry.getValue().k() && entry.getValue().j()) {
                    arrayList.add(Integer.valueOf(entry.getValue().b()));
                }
            }
        }
        return arrayList;
    }

    public a k(int i15) {
        return this.f27454d.get(Integer.valueOf(i15));
    }

    public a l(aj2.a aVar) {
        for (Map.Entry<Integer, a> entry : this.f27454d.entrySet()) {
            if (entry.getValue().i() == aVar) {
                return entry.getValue();
            }
        }
        return null;
    }

    public int m(aj2.a aVar) {
        for (Map.Entry<Integer, a> entry : this.f27454d.entrySet()) {
            if (entry.getValue().i() == aVar) {
                return entry.getKey().intValue();
            }
        }
        return -1;
    }

    public List<Integer> n(aj2.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, a> entry : this.f27454d.entrySet()) {
            if (entry.getValue().i() == aVar) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    public String o() {
        return this.f27457g;
    }

    public List<Integer> p() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, a> entry : this.f27454d.entrySet()) {
            if (!entry.getValue().j()) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    public a q(aj2.a aVar) {
        for (Map.Entry<Integer, a> entry : this.f27454d.entrySet()) {
            if (entry.getValue().i() == aVar) {
                return l(aj2.a.INSTANCE.a(entry.getValue().h()));
            }
        }
        return null;
    }

    public void r(aj2.a aVar, aj2.a aVar2) {
        if (aVar != aVar2) {
            a aVarL = l(aVar);
            List<Integer> listD = aVarL.d();
            if (listD.contains(Integer.valueOf(aVar2.getId()))) {
                return;
            }
            listD.add(Integer.valueOf(aVar2.getId()));
            aVarL.o(listD);
            c();
        }
    }

    public void s(Integer num) {
        this.f27454d.remove(num);
        c();
    }

    public void t(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            this.f27454d.remove(it.next());
        }
        c();
    }

    public void u(String str) {
        this.f27457g = str;
    }

    public void v(int i15, a aVar) {
        this.f27454d.put(Integer.valueOf(i15), aVar);
    }
}
