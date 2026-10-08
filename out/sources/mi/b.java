package mi;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.internal.a71;
import com.google.android.libraries.places.internal.dg;
import com.google.android.libraries.places.internal.f61;
import com.google.android.libraries.places.internal.hg;
import com.google.android.libraries.places.internal.ig;
import com.google.android.libraries.places.internal.qh;
import com.google.android.libraries.places.internal.rh;
import com.google.android.libraries.places.internal.sh;
import com.google.android.libraries.places.internal.yh;
import com.google.android.libraries.places.internal.zf;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hg f126670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yh f126671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f126672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f126673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f126674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private qh f126675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private qh f126676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a71 f126677h;

    public b(hg hgVar, yh yhVar, List list, int i15, Boolean bool, qh qhVar, qh qhVar2) {
        this.f126670a = hgVar;
        this.f126671b = yhVar;
        this.f126672c = list;
        this.f126673d = i15;
        this.f126674e = bool;
        this.f126675f = qhVar;
        this.f126676g = qhVar2;
    }

    private final zf e(Context context) {
        zf zfVarI = ig.I();
        hg hgVar = this.f126670a;
        zfVarI.A(hgVar);
        zfVarI.I(this.f126671b);
        zfVarI.D(this.f126672c);
        zfVarI.H(f61.a(context, this.f126673d));
        Boolean bool = this.f126674e;
        if (bool != null) {
            zfVarI.G(bool.booleanValue());
        }
        if (hgVar != hg.VARIANT_COMPACT_ADVANCED && hgVar != hg.VARIANT_FULL_ADVANCED) {
            return zfVarI;
        }
        rh rhVarI = sh.I();
        qh qhVar = this.f126675f;
        if (qhVar != null) {
            rhVarI.D(qhVar);
        }
        qh qhVar2 = this.f126676g;
        if (qhVar2 != null) {
            rhVarI.A(qhVar2);
        }
        zfVarI.J((sh) rhVarI.H0());
        return zfVarI;
    }

    private final void f(zf zfVar) {
        a71 a71Var = this.f126677h;
        if (a71Var != null) {
            a71Var.b((ig) zfVar.H0());
        }
    }

    private final void g(Context context, int i15, Integer num) {
        zf zfVarE = e(context);
        zfVarE.K(i15);
        if (num != null) {
            zfVarE.F(num.intValue());
        }
        f(zfVarE);
    }

    public final void a(Context context) {
        g(context, 3, null);
    }

    public final void b(Context context) {
        g(context, 4, null);
    }

    public final void c(Context context, int i15) {
        g(context, 5, Integer.valueOf(i15));
    }

    public final void d(Context context) {
        g(context, 6, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        ?? BooleanValue;
        parcel.writeString(this.f126670a.name());
        parcel.writeString(this.f126671b.name());
        List list = this.f126672c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(((dg) it.next()).name());
        }
        parcel.writeInt(this.f126673d);
        Boolean bool = this.f126674e;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeValue(this.f126675f);
        parcel.writeValue(this.f126676g);
    }
}
