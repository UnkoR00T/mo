package f9;

import ek.g;
import t7.u;
import t7.v;
import zj.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60313b;

    public a(String str, String str2) {
        this.f60312a = c.g(str);
        this.f60313b = str2;
    }

    @Override // t7.v.a
    public void c(u.b bVar) {
        String str = this.f60312a;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer numP = g.p(this.f60313b);
                if (numP != null) {
                    bVar.t0(numP);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numP2 = g.p(this.f60313b);
                if (numP2 != null) {
                    bVar.s0(numP2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numP3 = g.p(this.f60313b);
                if (numP3 != null) {
                    bVar.u0(numP3);
                    break;
                }
                break;
            case "ALBUM":
                bVar.R(this.f60313b);
                break;
            case "GENRE":
                bVar.e0(this.f60313b);
                break;
            case "TITLE":
                bVar.r0(this.f60313b);
                break;
            case "DESCRIPTION":
                bVar.Y(this.f60313b);
                break;
            case "DISCNUMBER":
                Integer numP4 = g.p(this.f60313b);
                if (numP4 != null) {
                    bVar.Z(numP4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                bVar.Q(this.f60313b);
                break;
            case "ARTIST":
                bVar.S(this.f60313b);
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f60312a.equals(aVar.f60312a) && this.f60313b.equals(aVar.f60313b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f60312a.hashCode()) * 31) + this.f60313b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f60312a + "=" + this.f60313b;
    }
}
