package qh;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a extends kg.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[][] f166430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f166431k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f166436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f166437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[][] f166438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[][] f166439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[][] f166440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[][] f166441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f166442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[][] f166443h;
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final InterfaceC4178a f166432l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final InterfaceC4178a f166433m = new d();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final InterfaceC4178a f166434n = new e();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final InterfaceC4178a f166435p = new f();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: qh.a$a, reason: collision with other inner class name */
    interface InterfaceC4178a {
    }

    static {
        byte[][] bArr = new byte[0][];
        f166430j = bArr;
        f166431k = new a("", null, bArr, bArr, bArr, bArr, null, null);
    }

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f166436a = str;
        this.f166437b = bArr;
        this.f166438c = bArr2;
        this.f166439d = bArr3;
        this.f166440e = bArr4;
        this.f166441f = bArr5;
        this.f166442g = iArr;
        this.f166443h = bArr6;
    }

    private static List<Integer> h(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i15 : iArr) {
            arrayList.add(Integer.valueOf(i15));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List<String> m(byte[][] bArr) {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void p(StringBuilder sb5, String str, byte[][] bArr) {
        String str2;
        sb5.append(str);
        sb5.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb5.append("(");
            int length = bArr.length;
            boolean z15 = true;
            int i15 = 0;
            while (i15 < length) {
                byte[] bArr2 = bArr[i15];
                if (!z15) {
                    sb5.append(", ");
                }
                sb5.append("'");
                sb5.append(Base64.encodeToString(bArr2, 3));
                sb5.append("'");
                i15++;
                z15 = false;
            }
            str2 = ")";
        }
        sb5.append(str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (j.a(this.f166436a, aVar.f166436a) && Arrays.equals(this.f166437b, aVar.f166437b) && j.a(m(this.f166438c), m(aVar.f166438c)) && j.a(m(this.f166439d), m(aVar.f166439d)) && j.a(m(this.f166440e), m(aVar.f166440e)) && j.a(m(this.f166441f), m(aVar.f166441f)) && j.a(h(this.f166442g), h(aVar.f166442g)) && j.a(m(this.f166443h), m(aVar.f166443h))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String string;
        StringBuilder sb5 = new StringBuilder("ExperimentTokens");
        sb5.append("(");
        String str = this.f166436a;
        if (str == null) {
            string = "null";
        } else {
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 2);
            sb6.append("'");
            sb6.append(str);
            sb6.append("'");
            string = sb6.toString();
        }
        sb5.append(string);
        sb5.append(", ");
        byte[] bArr = this.f166437b;
        sb5.append("direct");
        sb5.append("=");
        if (bArr == null) {
            sb5.append("null");
        } else {
            sb5.append("'");
            sb5.append(Base64.encodeToString(bArr, 3));
            sb5.append("'");
        }
        sb5.append(", ");
        p(sb5, "GAIA", this.f166438c);
        sb5.append(", ");
        p(sb5, "PSEUDO", this.f166439d);
        sb5.append(", ");
        p(sb5, "ALWAYS", this.f166440e);
        sb5.append(", ");
        p(sb5, "OTHER", this.f166441f);
        sb5.append(", ");
        int[] iArr = this.f166442g;
        sb5.append("weak");
        sb5.append("=");
        if (iArr == null) {
            sb5.append("null");
        } else {
            sb5.append("(");
            int length = iArr.length;
            boolean z15 = true;
            int i15 = 0;
            while (i15 < length) {
                int i16 = iArr[i15];
                if (!z15) {
                    sb5.append(", ");
                }
                sb5.append(i16);
                i15++;
                z15 = false;
            }
            sb5.append(")");
        }
        sb5.append(", ");
        p(sb5, "directs", this.f166443h);
        sb5.append(")");
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f166436a, false);
        kg.c.f(parcel, 3, this.f166437b, false);
        kg.c.g(parcel, 4, this.f166438c, false);
        kg.c.g(parcel, 5, this.f166439d, false);
        kg.c.g(parcel, 6, this.f166440e, false);
        kg.c.g(parcel, 7, this.f166441f, false);
        kg.c.n(parcel, 8, this.f166442g, false);
        kg.c.g(parcel, 9, this.f166443h, false);
        kg.c.b(parcel, iA);
    }
}
