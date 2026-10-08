package ng;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public class a extends kg.a {
    public static final Parcelable.Creator<a> CREATOR = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Comparator f135901e = e.f135908a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f135902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f135903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f135904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f135905d;

    public a(List list, boolean z15, String str, String str2) {
        jg.s.l(list);
        this.f135902a = list;
        this.f135903b = z15;
        this.f135904c = str;
        this.f135905d = str2;
    }

    public static a h(mg.f fVar) {
        return p(fVar.a(), true);
    }

    static a p(List list, boolean z15) {
        TreeSet treeSet = new TreeSet(f135901e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((hg.g) it.next()).b());
        }
        return new a(new ArrayList(treeSet), z15, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f135903b == aVar.f135903b && jg.r.a(this.f135902a, aVar.f135902a) && jg.r.a(this.f135904c, aVar.f135904c) && jg.r.a(this.f135905d, aVar.f135905d);
    }

    public final int hashCode() {
        return jg.r.b(Boolean.valueOf(this.f135903b), this.f135902a, this.f135904c, this.f135905d);
    }

    public List<gg.c> m() {
        return this.f135902a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.y(parcel, 1, m(), false);
        kg.c.c(parcel, 2, this.f135903b);
        kg.c.u(parcel, 3, this.f135904c, false);
        kg.c.u(parcel, 4, this.f135905d, false);
        kg.c.b(parcel, iA);
    }
}
