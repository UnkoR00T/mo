package ao;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13876a;

    public a0(String str) {
        this.f13876a = str;
    }

    private BigDecimal a() {
        return c0.b(this.f13876a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f13876a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f13876a.equals(((a0) obj).f13876a);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f13876a);
    }

    public int hashCode() {
        return this.f13876a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f13876a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f13876a);
            }
        } catch (NumberFormatException unused2) {
            return a().intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f13876a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public String toString() {
        return this.f13876a;
    }
}
