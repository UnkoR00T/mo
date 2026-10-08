package ti;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.n;
import java.util.Locale;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import ri.d;
import ri.i;
import ri.j;
import ri.k;
import ri.l;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f190386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f190387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float f190388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f190389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final float f190390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final float f190391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final float f190392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f190393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f190394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f190395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f190396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f190397l;

    b(Context context, int i15, int i16, int i17, a aVar) {
        a aVar2 = new a();
        this.f190387b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i15 != 0) {
            aVar.f190398a = i15;
        }
        TypedArray typedArrayA = a(context, aVar.f190398a, i16, i17);
        Resources resources = context.getResources();
        this.f190388c = typedArrayA.getDimensionPixelSize(l.f174189m, -1);
        this.f190394i = context.getResources().getDimensionPixelSize(d.S);
        this.f190395j = context.getResources().getDimensionPixelSize(d.U);
        this.f190389d = typedArrayA.getDimensionPixelSize(l.f174269w, -1);
        this.f190390e = typedArrayA.getDimension(l.f174253u, resources.getDimension(d.f173966o));
        this.f190392g = typedArrayA.getDimension(l.f174293z, resources.getDimension(d.f173968p));
        this.f190391f = typedArrayA.getDimension(l.f174181l, resources.getDimension(d.f173966o));
        this.f190393h = typedArrayA.getDimension(l.f174261v, resources.getDimension(d.f173968p));
        boolean z15 = true;
        this.f190396k = typedArrayA.getInt(l.G, 1);
        this.f190397l = typedArrayA.getInt(l.f174165j, 0);
        aVar2.f190406j = aVar.f190406j == -2 ? GF2Field.MASK : aVar.f190406j;
        if (aVar.f190408l != -2) {
            aVar2.f190408l = aVar.f190408l;
        } else if (typedArrayA.hasValue(l.F)) {
            aVar2.f190408l = typedArrayA.getInt(l.F, 0);
        } else {
            aVar2.f190408l = -1;
        }
        if (aVar.f190407k != null) {
            aVar2.f190407k = aVar.f190407k;
        } else if (typedArrayA.hasValue(l.f174213p)) {
            aVar2.f190407k = typedArrayA.getString(l.f174213p);
        }
        aVar2.f190412q = aVar.f190412q;
        aVar2.f190413r = aVar.f190413r == null ? context.getString(j.f174050j) : aVar.f190413r;
        aVar2.f190414s = aVar.f190414s == 0 ? i.f174040a : aVar.f190414s;
        aVar2.f190415t = aVar.f190415t == 0 ? j.f174055o : aVar.f190415t;
        if (aVar.f190417w != null && !aVar.f190417w.booleanValue()) {
            z15 = false;
        }
        aVar2.f190417w = Boolean.valueOf(z15);
        aVar2.f190409m = aVar.f190409m == -2 ? typedArrayA.getInt(l.D, -2) : aVar.f190409m;
        aVar2.f190410n = aVar.f190410n == -2 ? typedArrayA.getInt(l.E, -2) : aVar.f190410n;
        aVar2.f190402e = Integer.valueOf(aVar.f190402e == null ? typedArrayA.getResourceId(l.f174197n, k.f174068b) : aVar.f190402e.intValue());
        aVar2.f190403f = Integer.valueOf(aVar.f190403f == null ? typedArrayA.getResourceId(l.f174205o, 0) : aVar.f190403f.intValue());
        aVar2.f190404g = Integer.valueOf(aVar.f190404g == null ? typedArrayA.getResourceId(l.f174277x, k.f174068b) : aVar.f190404g.intValue());
        aVar2.f190405h = Integer.valueOf(aVar.f190405h == null ? typedArrayA.getResourceId(l.f174285y, 0) : aVar.f190405h.intValue());
        aVar2.f190399b = Integer.valueOf(aVar.f190399b == null ? G(context, typedArrayA, l.f174157i) : aVar.f190399b.intValue());
        aVar2.f190401d = Integer.valueOf(aVar.f190401d == null ? typedArrayA.getResourceId(l.f174221q, k.f174070d) : aVar.f190401d.intValue());
        if (aVar.f190400c != null) {
            aVar2.f190400c = aVar.f190400c;
        } else if (typedArrayA.hasValue(l.f174229r)) {
            aVar2.f190400c = Integer.valueOf(G(context, typedArrayA, l.f174229r));
        } else {
            aVar2.f190400c = Integer.valueOf(new ij.d(context, aVar2.f190401d.intValue()).j().getDefaultColor());
        }
        aVar2.f190416v = Integer.valueOf(aVar.f190416v == null ? typedArrayA.getInt(l.f174173k, 8388661) : aVar.f190416v.intValue());
        aVar2.f190418x = Integer.valueOf(aVar.f190418x == null ? typedArrayA.getDimensionPixelSize(l.f174245t, resources.getDimensionPixelSize(d.T)) : aVar.f190418x.intValue());
        aVar2.f190419y = Integer.valueOf(aVar.f190419y == null ? typedArrayA.getDimensionPixelSize(l.f174237s, resources.getDimensionPixelSize(d.f173970q)) : aVar.f190419y.intValue());
        aVar2.f190420z = Integer.valueOf(aVar.f190420z == null ? typedArrayA.getDimensionPixelOffset(l.A, 0) : aVar.f190420z.intValue());
        aVar2.A = Integer.valueOf(aVar.A == null ? typedArrayA.getDimensionPixelOffset(l.H, 0) : aVar.A.intValue());
        aVar2.B = Integer.valueOf(aVar.B == null ? typedArrayA.getDimensionPixelOffset(l.B, aVar2.f190420z.intValue()) : aVar.B.intValue());
        aVar2.C = Integer.valueOf(aVar.C == null ? typedArrayA.getDimensionPixelOffset(l.I, aVar2.A.intValue()) : aVar.C.intValue());
        aVar2.F = Integer.valueOf(aVar.F == null ? typedArrayA.getDimensionPixelOffset(l.C, 0) : aVar.F.intValue());
        aVar2.D = Integer.valueOf(aVar.D == null ? 0 : aVar.D.intValue());
        aVar2.E = Integer.valueOf(aVar.E == null ? 0 : aVar.E.intValue());
        aVar2.G = Boolean.valueOf(aVar.G == null ? typedArrayA.getBoolean(l.f174149h, false) : aVar.G.booleanValue());
        typedArrayA.recycle();
        if (aVar.f190411p == null) {
            aVar2.f190411p = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            aVar2.f190411p = aVar.f190411p;
        }
        this.f190386a = aVar;
    }

    private static int G(Context context, TypedArray typedArray, int i15) {
        return ij.c.a(context, typedArray, i15).getDefaultColor();
    }

    private TypedArray a(Context context, int i15, int i16, int i17) {
        AttributeSet attributeSetI;
        int styleAttribute;
        if (i15 != 0) {
            attributeSetI = com.google.android.material.drawable.c.i(context, i15, "badge");
            styleAttribute = attributeSetI.getStyleAttribute();
        } else {
            attributeSetI = null;
            styleAttribute = 0;
        }
        return n.i(context, attributeSetI, l.f174141g, i16, styleAttribute == 0 ? i17 : styleAttribute, new int[0]);
    }

    int A() {
        return this.f190387b.C.intValue();
    }

    int B() {
        return this.f190387b.A.intValue();
    }

    boolean C() {
        return this.f190387b.f190408l != -1;
    }

    boolean D() {
        return this.f190387b.f190407k != null;
    }

    @Deprecated
    boolean E() {
        return this.f190387b.G.booleanValue();
    }

    boolean F() {
        return this.f190387b.f190417w.booleanValue();
    }

    void H(int i15) {
        this.f190386a.f190406j = i15;
        this.f190387b.f190406j = i15;
    }

    int b() {
        return this.f190387b.D.intValue();
    }

    int c() {
        return this.f190387b.E.intValue();
    }

    int d() {
        return this.f190387b.f190406j;
    }

    int e() {
        return this.f190387b.f190399b.intValue();
    }

    int f() {
        return this.f190387b.f190416v.intValue();
    }

    int g() {
        return this.f190387b.f190418x.intValue();
    }

    int h() {
        return this.f190387b.f190403f.intValue();
    }

    int i() {
        return this.f190387b.f190402e.intValue();
    }

    int j() {
        return this.f190387b.f190400c.intValue();
    }

    int k() {
        return this.f190387b.f190419y.intValue();
    }

    int l() {
        return this.f190387b.f190405h.intValue();
    }

    int m() {
        return this.f190387b.f190404g.intValue();
    }

    int n() {
        return this.f190387b.f190415t;
    }

    CharSequence o() {
        return this.f190387b.f190412q;
    }

    CharSequence p() {
        return this.f190387b.f190413r;
    }

    int q() {
        return this.f190387b.f190414s;
    }

    int r() {
        return this.f190387b.B.intValue();
    }

    int s() {
        return this.f190387b.f190420z.intValue();
    }

    int t() {
        return this.f190387b.F.intValue();
    }

    int u() {
        return this.f190387b.f190409m;
    }

    int v() {
        return this.f190387b.f190410n;
    }

    int w() {
        return this.f190387b.f190408l;
    }

    Locale x() {
        return this.f190387b.f190411p;
    }

    String y() {
        return this.f190387b.f190407k;
    }

    int z() {
        return this.f190387b.f190401d.intValue();
    }

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C4968a();
        private Integer A;
        private Integer B;
        private Integer C;
        private Integer D;
        private Integer E;
        private Integer F;
        private Boolean G;
        private Integer H;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f190398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f190399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f190400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f190401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f190402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f190403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f190404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f190405h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f190406j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f190407k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f190408l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f190409m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f190410n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Locale f190411p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private CharSequence f190412q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private CharSequence f190413r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f190414s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f190415t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Integer f190416v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Boolean f190417w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private Integer f190418x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Integer f190419y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Integer f190420z;

        /* JADX INFO: renamed from: ti.b$a$a, reason: collision with other inner class name */
        class C4968a implements Parcelable.Creator<a> {
            C4968a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i15) {
                return new a[i15];
            }
        }

        public a() {
            this.f190406j = GF2Field.MASK;
            this.f190408l = -2;
            this.f190409m = -2;
            this.f190410n = -2;
            this.f190417w = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            parcel.writeInt(this.f190398a);
            parcel.writeSerializable(this.f190399b);
            parcel.writeSerializable(this.f190400c);
            parcel.writeSerializable(this.f190401d);
            parcel.writeSerializable(this.f190402e);
            parcel.writeSerializable(this.f190403f);
            parcel.writeSerializable(this.f190404g);
            parcel.writeSerializable(this.f190405h);
            parcel.writeInt(this.f190406j);
            parcel.writeString(this.f190407k);
            parcel.writeInt(this.f190408l);
            parcel.writeInt(this.f190409m);
            parcel.writeInt(this.f190410n);
            CharSequence charSequence = this.f190412q;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f190413r;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f190414s);
            parcel.writeSerializable(this.f190416v);
            parcel.writeSerializable(this.f190418x);
            parcel.writeSerializable(this.f190419y);
            parcel.writeSerializable(this.f190420z);
            parcel.writeSerializable(this.A);
            parcel.writeSerializable(this.B);
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.F);
            parcel.writeSerializable(this.D);
            parcel.writeSerializable(this.E);
            parcel.writeSerializable(this.f190417w);
            parcel.writeSerializable(this.f190411p);
            parcel.writeSerializable(this.G);
            parcel.writeSerializable(this.H);
        }

        a(Parcel parcel) {
            this.f190406j = GF2Field.MASK;
            this.f190408l = -2;
            this.f190409m = -2;
            this.f190410n = -2;
            this.f190417w = Boolean.TRUE;
            this.f190398a = parcel.readInt();
            this.f190399b = (Integer) parcel.readSerializable();
            this.f190400c = (Integer) parcel.readSerializable();
            this.f190401d = (Integer) parcel.readSerializable();
            this.f190402e = (Integer) parcel.readSerializable();
            this.f190403f = (Integer) parcel.readSerializable();
            this.f190404g = (Integer) parcel.readSerializable();
            this.f190405h = (Integer) parcel.readSerializable();
            this.f190406j = parcel.readInt();
            this.f190407k = parcel.readString();
            this.f190408l = parcel.readInt();
            this.f190409m = parcel.readInt();
            this.f190410n = parcel.readInt();
            this.f190412q = parcel.readString();
            this.f190413r = parcel.readString();
            this.f190414s = parcel.readInt();
            this.f190416v = (Integer) parcel.readSerializable();
            this.f190418x = (Integer) parcel.readSerializable();
            this.f190419y = (Integer) parcel.readSerializable();
            this.f190420z = (Integer) parcel.readSerializable();
            this.A = (Integer) parcel.readSerializable();
            this.B = (Integer) parcel.readSerializable();
            this.C = (Integer) parcel.readSerializable();
            this.F = (Integer) parcel.readSerializable();
            this.D = (Integer) parcel.readSerializable();
            this.E = (Integer) parcel.readSerializable();
            this.f190417w = (Boolean) parcel.readSerializable();
            this.f190411p = (Locale) parcel.readSerializable();
            this.G = (Boolean) parcel.readSerializable();
            this.H = (Integer) parcel.readSerializable();
        }
    }
}
