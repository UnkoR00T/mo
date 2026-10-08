package io.sentry;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class z1 implements k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.vendor.gson.stream.a f95991a;

    public z1(Reader reader) {
        this.f95991a = new io.sentry.vendor.gson.stream.a(reader);
    }

    @Override // io.sentry.k3
    public Long E2() throws IOException {
        if (this.f95991a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Long.valueOf(this.f95991a.nextLong());
        }
        this.f95991a.J();
        return null;
    }

    @Override // io.sentry.k3
    public void G0() throws IOException {
        this.f95991a.G0();
    }

    @Override // io.sentry.k3
    public Object K3() {
        return new y1().e(this);
    }

    @Override // io.sentry.k3
    public <T> T M1(v0 v0Var, t1<T> t1Var) throws IOException {
        if (this.f95991a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return t1Var.a(this, v0Var);
        }
        this.f95991a.J();
        return null;
    }

    @Override // io.sentry.k3
    public TimeZone N0(v0 v0Var) throws IOException {
        if (this.f95991a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f95991a.J();
            return null;
        }
        try {
            return TimeZone.getTimeZone(this.f95991a.q2());
        } catch (Exception e15) {
            v0Var.b(b7.ERROR, "Error when deserializing TimeZone", e15);
            return null;
        }
    }

    @Override // io.sentry.k3
    public String O2() throws IOException {
        if (this.f95991a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return this.f95991a.q2();
        }
        this.f95991a.J();
        return null;
    }

    @Override // io.sentry.k3
    public <T> Map<String, T> S2(v0 v0Var, t1<T> t1Var) throws IOException {
        if (this.f95991a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f95991a.J();
            return null;
        }
        this.f95991a.Y();
        HashMap map = new HashMap();
        if (this.f95991a.y()) {
            while (true) {
                try {
                    map.put(this.f95991a.h1(), t1Var.a(this, v0Var));
                } catch (Exception e15) {
                    v0Var.b(b7.WARNING, "Failed to deserialize object in map.", e15);
                }
                if (this.f95991a.peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && this.f95991a.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    break;
                }
            }
        }
        this.f95991a.h0();
        return map;
    }

    @Override // io.sentry.k3
    public <T> List<T> T3(v0 v0Var, t1<T> t1Var) throws IOException {
        if (this.f95991a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            this.f95991a.J();
            return null;
        }
        this.f95991a.b();
        ArrayList arrayList = new ArrayList();
        if (this.f95991a.y()) {
            do {
                try {
                    arrayList.add(t1Var.a(this, v0Var));
                } catch (Exception e15) {
                    v0Var.b(b7.WARNING, "Failed to deserialize object in list.", e15);
                }
            } while (this.f95991a.peek() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
        }
        this.f95991a.r();
        return arrayList;
    }

    @Override // io.sentry.k3
    public void U2(v0 v0Var, Map<String, Object> map, String str) {
        try {
            map.put(str, K3());
        } catch (Exception e15) {
            v0Var.a(b7.ERROR, e15, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // io.sentry.k3
    public void Y() {
        this.f95991a.Y();
    }

    public void b() {
        this.f95991a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f95991a.close();
    }

    @Override // io.sentry.k3
    public void e0(boolean z15) {
        this.f95991a.e0(z15);
    }

    @Override // io.sentry.k3
    public Double f1() throws IOException {
        if (this.f95991a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Double.valueOf(this.f95991a.nextDouble());
        }
        this.f95991a.J();
        return null;
    }

    public void h() {
        this.f95991a.r();
    }

    @Override // io.sentry.k3
    public void h0() {
        this.f95991a.h0();
    }

    @Override // io.sentry.k3
    public String h1() {
        return this.f95991a.h1();
    }

    public boolean m() {
        return this.f95991a.H();
    }

    @Override // io.sentry.k3
    public double nextDouble() {
        return this.f95991a.nextDouble();
    }

    @Override // io.sentry.k3
    public float nextFloat() {
        return (float) this.f95991a.nextDouble();
    }

    @Override // io.sentry.k3
    public int nextInt() {
        return this.f95991a.nextInt();
    }

    @Override // io.sentry.k3
    public long nextLong() {
        return this.f95991a.nextLong();
    }

    public void p() {
        this.f95991a.J();
    }

    @Override // io.sentry.k3
    public Date p1(v0 v0Var) throws IOException {
        if (this.f95991a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return k3.Z1(this.f95991a.q2(), v0Var);
        }
        this.f95991a.J();
        return null;
    }

    @Override // io.sentry.k3
    public io.sentry.vendor.gson.stream.b peek() {
        return this.f95991a.peek();
    }

    @Override // io.sentry.k3
    public String q2() {
        return this.f95991a.q2();
    }

    @Override // io.sentry.k3
    public Boolean u1() throws IOException {
        if (this.f95991a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Boolean.valueOf(this.f95991a.H());
        }
        this.f95991a.J();
        return null;
    }

    @Override // io.sentry.k3
    public Integer z2() throws IOException {
        if (this.f95991a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Integer.valueOf(this.f95991a.nextInt());
        }
        this.f95991a.J();
        return null;
    }

    @Override // io.sentry.k3
    public Float z3() throws IOException {
        if (this.f95991a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Float.valueOf(nextFloat());
        }
        this.f95991a.J();
        return null;
    }
}
