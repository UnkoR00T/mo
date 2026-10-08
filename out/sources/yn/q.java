package yn;

import ao.c0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f228071a;

    public q(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f228071a = bool;
    }

    private static boolean v(q qVar) {
        Object obj = qVar.f228071a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f228071a == null) {
            return qVar.f228071a == null;
        }
        if (v(this) && v(qVar)) {
            if ((this.f228071a instanceof BigInteger) || (qVar.f228071a instanceof BigInteger)) {
                return n().equals(qVar.n());
            }
            return s().longValue() == qVar.s().longValue();
        }
        Object obj2 = this.f228071a;
        if (obj2 instanceof Number) {
            Object obj3 = qVar.f228071a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return l().compareTo(qVar.l()) == 0;
                }
                double dQ = q();
                double dQ2 = qVar.q();
                return dQ == dQ2 || (Double.isNaN(dQ) && Double.isNaN(dQ2));
            }
        }
        return obj2.equals(qVar.f228071a);
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f228071a == null) {
            return 31;
        }
        if (v(this)) {
            jDoubleToLongBits = s().longValue();
        } else {
            Object obj = this.f228071a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(s().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public BigDecimal l() {
        Object obj = this.f228071a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : c0.b(t());
    }

    public BigInteger n() {
        Object obj = this.f228071a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return v(this) ? BigInteger.valueOf(s().longValue()) : c0.c(t());
    }

    public boolean o() {
        return u() ? ((Boolean) this.f228071a).booleanValue() : Boolean.parseBoolean(t());
    }

    public double q() {
        return w() ? s().doubleValue() : Double.parseDouble(t());
    }

    public Number s() {
        Object obj = this.f228071a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new ao.a0((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public String t() {
        Object obj = this.f228071a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (w()) {
            return s().toString();
        }
        if (u()) {
            return ((Boolean) this.f228071a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f228071a.getClass());
    }

    public boolean u() {
        return this.f228071a instanceof Boolean;
    }

    public boolean w() {
        return this.f228071a instanceof Number;
    }

    public boolean x() {
        return this.f228071a instanceof String;
    }

    public q(Number number) {
        Objects.requireNonNull(number);
        this.f228071a = number;
    }

    public q(String str) {
        Objects.requireNonNull(str);
        this.f228071a = str;
    }
}
