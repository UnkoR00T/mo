package io.sentry.clientreport;

import io.sentry.b7;
import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.m;
import io.sentry.t1;
import io.sentry.v0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f94778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<g> f94779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f94780c;

    public static final class a implements t1<c> {
        private Exception c(String str, v0 v0Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            v0Var.b(b7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(k3 k3Var, v0 v0Var) throws Exception {
            ArrayList arrayList = new ArrayList();
            k3Var.Y();
            Date dateP1 = null;
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("discarded_events")) {
                    arrayList.addAll(k3Var.T3(v0Var, new g.a()));
                } else if (strH1.equals("timestamp")) {
                    dateP1 = k3Var.p1(v0Var);
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    k3Var.U2(v0Var, map, strH1);
                }
            }
            k3Var.h0();
            if (dateP1 == null) {
                throw c("timestamp", v0Var);
            }
            if (arrayList.isEmpty()) {
                throw c("discarded_events", v0Var);
            }
            c cVar = new c(dateP1, arrayList);
            cVar.b(map);
            return cVar;
        }
    }

    public c(Date date, List<g> list) {
        this.f94778a = date;
        this.f94779b = list;
    }

    public List<g> a() {
        return this.f94779b;
    }

    public void b(Map<String, Object> map) {
        this.f94780c = map;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("timestamp").h(m.h(this.f94778a));
        l3Var.f("discarded_events").l(v0Var, this.f94779b);
        Map<String, Object> map = this.f94780c;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.f94780c.get(str));
            }
        }
        l3Var.h0();
    }
}
