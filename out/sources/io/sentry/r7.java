package io.sentry;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class r7 extends i5 implements d2 {
    private Map<String, Object> C;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private File f95603r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f95607w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Date f95609y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private io.sentry.protocol.v f95606v = new io.sentry.protocol.v();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f95604s = "replay_event";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b f95605t = b.SESSION;
    private List<String> A = new ArrayList();
    private List<String> B = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List<String> f95610z = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Date f95608x = m.d();

    public static final class a implements t1<r7> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r7 a(k3 k3Var, v0 v0Var) {
            i5.a aVar = new i5.a();
            r7 r7Var = new r7();
            k3Var.Y();
            String strO2 = null;
            b bVar = null;
            Integer numZ2 = null;
            Date dateP1 = null;
            HashMap map = null;
            io.sentry.protocol.v vVar = null;
            Date dateP2 = null;
            List<String> list = null;
            List<String> list2 = null;
            List<String> list3 = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                switch (strH1) {
                    case "replay_id":
                        vVar = (io.sentry.protocol.v) k3Var.M1(v0Var, new io.sentry.protocol.v.a());
                        break;
                    case "replay_start_timestamp":
                        dateP2 = k3Var.p1(v0Var);
                        break;
                    case "type":
                        strO2 = k3Var.O2();
                        break;
                    case "urls":
                        list = (List) k3Var.K3();
                        break;
                    case "timestamp":
                        dateP1 = k3Var.p1(v0Var);
                        break;
                    case "error_ids":
                        list2 = (List) k3Var.K3();
                        break;
                    case "trace_ids":
                        list3 = (List) k3Var.K3();
                        break;
                    case "replay_type":
                        bVar = (b) k3Var.M1(v0Var, new b.a());
                        break;
                    case "segment_id":
                        numZ2 = k3Var.z2();
                        break;
                    default:
                        if (!aVar.a(r7Var, strH1, k3Var, v0Var)) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            k3Var.U2(v0Var, map, strH1);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            k3Var.h0();
            if (strO2 != null) {
                r7Var.p0(strO2);
            }
            if (bVar != null) {
                r7Var.l0(bVar);
            }
            if (numZ2 != null) {
                r7Var.m0(numZ2.intValue());
            }
            if (dateP1 != null) {
                r7Var.n0(dateP1);
            }
            r7Var.j0(vVar);
            r7Var.k0(dateP2);
            r7Var.r0(list);
            r7Var.i0(list2);
            r7Var.o0(list3);
            r7Var.q0(map);
            return r7Var;
        }
    }

    public enum b implements d2 {
        SESSION,
        BUFFER;

        public static final class a implements t1<b> {
            @Override // io.sentry.t1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(k3 k3Var, v0 v0Var) {
                return b.valueOf(k3Var.q2().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.d2
        public void serialize(l3 l3Var, v0 v0Var) {
            l3Var.h(name().toLowerCase(Locale.ROOT));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r7.class == obj.getClass()) {
            r7 r7Var = (r7) obj;
            if (this.f95607w == r7Var.f95607w && io.sentry.util.v.a(this.f95604s, r7Var.f95604s) && this.f95605t == r7Var.f95605t && io.sentry.util.v.a(this.f95606v, r7Var.f95606v) && io.sentry.util.v.a(this.f95610z, r7Var.f95610z) && io.sentry.util.v.a(this.A, r7Var.A) && io.sentry.util.v.a(this.B, r7Var.B)) {
                return true;
            }
        }
        return false;
    }

    public Date g0() {
        return this.f95608x;
    }

    public File h0() {
        return this.f95603r;
    }

    public int hashCode() {
        return io.sentry.util.v.b(this.f95604s, this.f95605t, this.f95606v, Integer.valueOf(this.f95607w), this.f95610z, this.A, this.B);
    }

    public void i0(List<String> list) {
        this.A = list;
    }

    public void j0(io.sentry.protocol.v vVar) {
        this.f95606v = vVar;
    }

    public void k0(Date date) {
        this.f95609y = date;
    }

    public void l0(b bVar) {
        this.f95605t = bVar;
    }

    public void m0(int i15) {
        this.f95607w = i15;
    }

    public void n0(Date date) {
        this.f95608x = date;
    }

    public void o0(List<String> list) {
        this.B = list;
    }

    public void p0(String str) {
        this.f95604s = str;
    }

    public void q0(Map<String, Object> map) {
        this.C = map;
    }

    public void r0(List<String> list) {
        this.f95610z = list;
    }

    public void s0(File file) {
        this.f95603r = file;
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("type").h(this.f95604s);
        l3Var.f("replay_type").l(v0Var, this.f95605t);
        l3Var.f("segment_id").b(this.f95607w);
        l3Var.f("timestamp").l(v0Var, this.f95608x);
        if (this.f95606v != null) {
            l3Var.f("replay_id").l(v0Var, this.f95606v);
        }
        if (this.f95609y != null) {
            l3Var.f("replay_start_timestamp").l(v0Var, this.f95609y);
        }
        if (this.f95610z != null) {
            l3Var.f("urls").l(v0Var, this.f95610z);
        }
        if (this.A != null) {
            l3Var.f("error_ids").l(v0Var, this.A);
        }
        if (this.B != null) {
            l3Var.f("trace_ids").l(v0Var, this.B);
        }
        new i5.b().a(this, l3Var, v0Var);
        Map<String, Object> map = this.C;
        if (map != null) {
            for (String str : map.keySet()) {
                l3Var.f(str).l(v0Var, this.C.get(str));
            }
        }
        l3Var.h0();
    }
}
