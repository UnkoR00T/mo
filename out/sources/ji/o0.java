package ji;

import android.net.Uri;
import ii.u0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class o0 extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f103255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f103257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f103258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f103259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f103260f;

    /* synthetic */ o0(List list, List list2, m mVar, String str, int i15, Uri uri, byte[] bArr) {
        this.f103255a = list;
        this.f103256b = list2;
        this.f103257c = mVar;
        this.f103258d = str;
        this.f103259e = i15;
        this.f103260f = uri;
    }

    @Override // ji.q
    public m b() {
        return this.f103257c;
    }

    @Override // ji.q
    public List<ii.l0> c() {
        return this.f103255a;
    }

    @Override // ji.q
    public List<u0> d() {
        return this.f103256b;
    }

    @Override // ji.q
    public Uri e() {
        return this.f103260f;
    }

    public final boolean equals(Object obj) {
        List list;
        m mVar;
        String str;
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f103255a.equals(qVar.c()) && ((list = this.f103256b) != null ? list.equals(qVar.d()) : qVar.d() == null) && ((mVar = this.f103257c) != null ? mVar.equals(qVar.b()) : qVar.b() == null) && ((str = this.f103258d) != null ? str.equals(qVar.f()) : qVar.f() == null) && this.f103259e == qVar.g() && ((uri = this.f103260f) != null ? uri.equals(qVar.e()) : qVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ji.q
    public final String f() {
        return this.f103258d;
    }

    @Override // ji.q
    public final int g() {
        return this.f103259e;
    }

    public final int hashCode() {
        int iHashCode = this.f103255a.hashCode() ^ 1000003;
        List list = this.f103256b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        m mVar = this.f103257c;
        int iHashCode3 = (iHashCode2 ^ (mVar == null ? 0 : mVar.hashCode())) * 1000003;
        String str = this.f103258d;
        int iHashCode4 = (((iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f103259e) * 1000003;
        Uri uri = this.f103260f;
        return iHashCode4 ^ (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        String string = this.f103255a.toString();
        int length = string.length();
        Uri uri = this.f103260f;
        m mVar = this.f103257c;
        String strValueOf = String.valueOf(this.f103256b);
        String strValueOf2 = String.valueOf(mVar);
        String strValueOf3 = String.valueOf(uri);
        int length2 = strValueOf.length();
        int length3 = strValueOf2.length();
        String str = this.f103258d;
        int length4 = String.valueOf(str).length();
        int i15 = this.f103259e;
        StringBuilder sb5 = new StringBuilder(length + 47 + length2 + 13 + length3 + 16 + length4 + 20 + String.valueOf(i15).length() + 12 + strValueOf3.length() + 1);
        sb5.append("SearchByTextResponse{places=");
        sb5.append(string);
        sb5.append(", routingSummaries=");
        sb5.append(strValueOf);
        sb5.append(", pagination=");
        sb5.append(strValueOf2);
        sb5.append(", nextPageToken=");
        sb5.append(str);
        sb5.append(", responsePageIndex=");
        sb5.append(i15);
        sb5.append(", searchUri=");
        sb5.append(strValueOf3);
        sb5.append("}");
        return sb5.toString();
    }
}
