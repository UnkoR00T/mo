package j5;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[] f99445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f99446b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f99447c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected b f99448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f99449e;

    public c(char[] cArr) {
        this.f99445a = cArr;
    }

    @Override // 
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c clone() {
        try {
            return (c) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f99446b == cVar.f99446b && this.f99447c == cVar.f99447c && this.f99449e == cVar.f99449e && Arrays.equals(this.f99445a, cVar.f99445a)) {
            return Objects.equals(this.f99448d, cVar.f99448d);
        }
        return false;
    }

    public String g() {
        String str = new String(this.f99445a);
        if (str.length() < 1) {
            return "";
        }
        long j15 = this.f99447c;
        if (j15 != Long.MAX_VALUE) {
            long j16 = this.f99446b;
            if (j15 >= j16) {
                return str.substring((int) j16, ((int) j15) + 1);
            }
        }
        long j17 = this.f99446b;
        return str.substring((int) j17, ((int) j17) + 1);
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f99445a) * 31;
        long j15 = this.f99446b;
        int i15 = (iHashCode + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f99447c;
        int i16 = (i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31;
        b bVar = this.f99448d;
        return ((i16 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f99449e;
    }

    public float i() {
        if (this instanceof e) {
            return ((e) this).i();
        }
        return Float.NaN;
    }

    public int j() {
        if (this instanceof e) {
            return ((e) this).j();
        }
        return 0;
    }

    public int l() {
        return this.f99449e;
    }

    protected String n() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public boolean o() {
        char[] cArr = this.f99445a;
        return cArr != null && cArr.length >= 1;
    }

    public void q(b bVar) {
        this.f99448d = bVar;
    }

    public void s(long j15) {
        if (this.f99447c != Long.MAX_VALUE) {
            return;
        }
        this.f99447c = j15;
        if (g.f99454a) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        b bVar = this.f99448d;
        if (bVar != null) {
            bVar.v(this);
        }
    }

    public void t(long j15) {
        this.f99446b = j15;
    }

    public String toString() {
        long j15 = this.f99446b;
        long j16 = this.f99447c;
        if (j15 > j16 || j16 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.f99446b + "-" + this.f99447c + ")";
        }
        return n() + " (" + this.f99446b + " : " + this.f99447c + ") <<" + new String(this.f99445a).substring((int) this.f99446b, ((int) this.f99447c) + 1) + ">>";
    }
}
