package wl;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f214062a;

    public z(String str) {
        this.f214062a = str;
    }

    private BigDecimal a() {
        return b0.b(this.f214062a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f214062a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.f214062a.equals(((z) obj).f214062a);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f214062a);
    }

    public int hashCode() {
        return this.f214062a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f214062a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f214062a);
            }
        } catch (NumberFormatException unused2) {
            return a().intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f214062a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public String toString() {
        return this.f214062a;
    }
}
