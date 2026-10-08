package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f36858a;

    public r(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f36858a = bool;
    }

    private static boolean x(r rVar) {
        Object obj = rVar.f36858a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean A() {
        return this.f36858a instanceof String;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f36858a == null) {
            return rVar.f36858a == null;
        }
        if (x(this) && x(rVar)) {
            if ((this.f36858a instanceof BigInteger) || (rVar.f36858a instanceof BigInteger)) {
                return q().equals(rVar.q());
            }
            return h().longValue() == rVar.h().longValue();
        }
        Object obj2 = this.f36858a;
        if (obj2 instanceof Number) {
            Object obj3 = rVar.f36858a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return o().compareTo(rVar.o()) == 0;
                }
                double dT = t();
                double dT2 = rVar.t();
                return dT == dT2 || (Double.isNaN(dT) && Double.isNaN(dT2));
            }
        }
        return obj2.equals(rVar.f36858a);
    }

    @Override // com.google.gson.l
    public Number h() {
        Object obj = this.f36858a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new wl.z((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f36858a == null) {
            return 31;
        }
        if (x(this)) {
            jDoubleToLongBits = h().longValue();
        } else {
            Object obj = this.f36858a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(h().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    @Override // com.google.gson.l
    public String i() {
        Object obj = this.f36858a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (z()) {
            return h().toString();
        }
        if (w()) {
            return ((Boolean) this.f36858a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f36858a.getClass());
    }

    public BigDecimal o() {
        Object obj = this.f36858a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : wl.b0.b(i());
    }

    public BigInteger q() {
        Object obj = this.f36858a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return x(this) ? BigInteger.valueOf(h().longValue()) : wl.b0.c(i());
    }

    public boolean s() {
        return w() ? ((Boolean) this.f36858a).booleanValue() : Boolean.parseBoolean(i());
    }

    public double t() {
        return z() ? h().doubleValue() : Double.parseDouble(i());
    }

    public int u() {
        return z() ? h().intValue() : Integer.parseInt(i());
    }

    public long v() {
        return z() ? h().longValue() : Long.parseLong(i());
    }

    public boolean w() {
        return this.f36858a instanceof Boolean;
    }

    public boolean z() {
        return this.f36858a instanceof Number;
    }

    public r(Number number) {
        Objects.requireNonNull(number);
        this.f36858a = number;
    }

    public r(String str) {
        Objects.requireNonNull(str);
        this.f36858a = str;
    }
}
