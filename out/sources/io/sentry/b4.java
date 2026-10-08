package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b4 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f94675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<? extends io.sentry.rrweb.b> f94676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f94677c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f94679b;

        static {
            int[] iArr = new int[io.sentry.rrweb.c.values().length];
            f94679b = iArr;
            try {
                iArr[io.sentry.rrweb.c.IncrementalSnapshot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94679b[io.sentry.rrweb.c.Meta.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94679b[io.sentry.rrweb.c.Custom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[io.sentry.rrweb.d.b.values().length];
            f94678a = iArr2;
            try {
                iArr2[io.sentry.rrweb.d.b.MouseInteraction.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94678a[io.sentry.rrweb.d.b.TouchMove.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class b implements t1<b4> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b4 a(k3 k3Var, v0 v0Var) {
            b4 b4Var = new b4();
            k3Var.Y();
            ArrayList arrayList = null;
            HashMap map = null;
            Integer numZ2 = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("segment_id")) {
                    numZ2 = k3Var.z2();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    k3Var.U2(v0Var, map, strH1);
                }
            }
            k3Var.h0();
            k3Var.e0(true);
            List list = (List) k3Var.K3();
            k3Var.e0(false);
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        io.sentry.util.u uVar = new io.sentry.util.u(map2);
                        for (Map.Entry entry : map2.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (str.equals("type")) {
                                io.sentry.rrweb.c cVar = io.sentry.rrweb.c.values()[((Integer) value).intValue()];
                                int i15 = a.f94679b[cVar.ordinal()];
                                if (i15 == 1) {
                                    Map map3 = (Map) map2.get("data");
                                    if (map3 == null) {
                                        map3 = Collections.EMPTY_MAP;
                                    }
                                    Integer num = (Integer) map3.get("source");
                                    if (num != null) {
                                        io.sentry.rrweb.d.b bVar = io.sentry.rrweb.d.b.values()[num.intValue()];
                                        int i16 = a.f94678a[bVar.ordinal()];
                                        if (i16 == 1) {
                                            arrayList.add(new io.sentry.rrweb.e.a().a(uVar, v0Var));
                                        } else if (i16 != 2) {
                                            v0Var.c(b7.DEBUG, "Unsupported rrweb incremental snapshot type %s", bVar);
                                        } else {
                                            arrayList.add(new io.sentry.rrweb.f.a().a(uVar, v0Var));
                                        }
                                    }
                                } else if (i15 == 2) {
                                    arrayList.add(new io.sentry.rrweb.g.a().a(uVar, v0Var));
                                } else if (i15 != 3) {
                                    v0Var.c(b7.DEBUG, "Unsupported rrweb event type %s", cVar);
                                } else {
                                    Map map4 = (Map) map2.get("data");
                                    if (map4 == null) {
                                        map4 = Collections.EMPTY_MAP;
                                    }
                                    String str2 = (String) map4.get("tag");
                                    if (str2 != null) {
                                        switch (str2) {
                                            case "performanceSpan":
                                                arrayList.add(new io.sentry.rrweb.i.a().a(uVar, v0Var));
                                                break;
                                            case "video":
                                                arrayList.add(new io.sentry.rrweb.j.a().a(uVar, v0Var));
                                                break;
                                            case "breadcrumb":
                                                arrayList.add(new io.sentry.rrweb.a.C2241a().a(uVar, v0Var));
                                                break;
                                            default:
                                                v0Var.c(b7.DEBUG, "Unsupported rrweb event type %s", cVar);
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            b4Var.c(numZ2);
            b4Var.b(arrayList);
            b4Var.d(map);
            return b4Var;
        }
    }

    public List<? extends io.sentry.rrweb.b> a() {
        return this.f94676b;
    }

    public void b(List<? extends io.sentry.rrweb.b> list) {
        this.f94676b = list;
    }

    public void c(Integer num) {
        this.f94675a = num;
    }

    public void d(Map<String, Object> map) {
        this.f94677c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b4.class == obj.getClass()) {
            b4 b4Var = (b4) obj;
            if (io.sentry.util.v.a(this.f94675a, b4Var.f94675a) && io.sentry.util.v.a(this.f94676b, b4Var.f94676b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.v.b(this.f94675a, this.f94676b);
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        if (this.f94675a != null) {
            l3Var.f("segment_id").k(this.f94675a);
        }
        Map<String, Object> map = this.f94677c;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f94677c.get(str));
            }
        }
        l3Var.h0();
        l3Var.e0(true);
        if (this.f94675a != null) {
            l3Var.i("\n");
        }
        List<? extends io.sentry.rrweb.b> list = this.f94676b;
        if (list != null) {
            l3Var.l(v0Var, list);
        }
        l3Var.e0(false);
    }
}
