package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class h80 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static h80 f32443e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f32444a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f32445b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g80[] f32446c = new g80[5];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32447d;

    h80() {
    }

    public static synchronized h80 a() {
        try {
            if (f32443e == null) {
                f32443e = new h80();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f32443e;
    }

    private final void e() {
        g80[] g80VarArr = this.f32446c;
        this.f32446c = (g80[]) Arrays.copyOf(g80VarArr, g80VarArr.length + 5);
    }

    public final List b() {
        List listUnmodifiableList;
        synchronized (this.f32444a) {
            listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((g80[]) Arrays.copyOfRange(this.f32446c, 0, this.f32447d)));
        }
        return listUnmodifiableList;
    }

    public final p70 c(String str, String str2, String str3, List list, List list2, boolean z15) {
        p70 p70Var;
        zj.p.e(!zj.v.b(str), "missing metric name");
        zj.p.r(str2, "description");
        zj.p.r(str3, "unit");
        zj.p.r(list, "requiredLabelKeys");
        zj.p.r(list2, "optionalLabelKeys");
        synchronized (this.f32444a) {
            try {
                Set set = this.f32445b;
                if (set.contains(str)) {
                    StringBuilder sb5 = new StringBuilder(str.length() + 32);
                    sb5.append("Metric with name ");
                    sb5.append(str);
                    sb5.append(" already exists");
                    throw new IllegalStateException(sb5.toString());
                }
                int i15 = this.f32447d;
                if (i15 + 1 == this.f32446c.length) {
                    e();
                }
                p70Var = new p70(i15, str, str2, str3, list, list2, false);
                this.f32446c[i15] = p70Var;
                set.add(str);
                this.f32447d++;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return p70Var;
    }

    public final q70 d(String str, String str2, String str3, List list, List list2, boolean z15) {
        q70 q70Var;
        zj.p.e(!zj.v.b("grpc.subchannel.open_connections"), "missing metric name");
        zj.p.r("EXPERIMENTAL. Number of open connections.", "description");
        zj.p.r("{connection}", "unit");
        zj.p.r(list, "requiredLabelKeys");
        zj.p.r(list2, "optionalLabelKeys");
        synchronized (this.f32444a) {
            try {
                Set set = this.f32445b;
                if (set.contains("grpc.subchannel.open_connections")) {
                    StringBuilder sb5 = new StringBuilder(64);
                    sb5.append("Metric with name ");
                    sb5.append("grpc.subchannel.open_connections");
                    sb5.append(" already exists");
                    throw new IllegalStateException(sb5.toString());
                }
                int i15 = this.f32447d;
                if (i15 + 1 == this.f32446c.length) {
                    e();
                }
                q70Var = new q70(i15, "grpc.subchannel.open_connections", "EXPERIMENTAL. Number of open connections.", "{connection}", list, list2, false);
                this.f32446c[i15] = q70Var;
                set.add("grpc.subchannel.open_connections");
                this.f32447d++;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return q70Var;
    }
}
