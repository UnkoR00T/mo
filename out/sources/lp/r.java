package lp;

import io.sentry.android.core.c2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r implements hp.c, u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final xp.d f119159h = new xp.d(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final bp.d f119160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final po.b f119161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final no.e f119162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s f119163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<Float> f119164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f119165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<Integer, Float> f119166g;

    r() {
        this.f119165f = -1.0f;
        bp.d dVar = new bp.d();
        this.f119160a = dVar;
        dVar.Y4(bp.i.f20732e9, bp.i.H3);
        this.f119161b = null;
        this.f119163d = null;
        this.f119162c = null;
        this.f119166g = new HashMap();
    }

    private s r() {
        bp.d dVarK4 = this.f119160a.k4(bp.i.J3);
        if (dVarK4 != null) {
            return new s(dVarK4);
        }
        no.e eVar = this.f119162c;
        if (eVar != null) {
            return d0.a(eVar);
        }
        return null;
    }

    private po.b s() throws Throwable {
        bp.b bVarP4 = this.f119160a.p4(bp.i.Q8);
        po.b bVarA = null;
        if (bVarP4 == null) {
            return null;
        }
        try {
            po.b bVarT = t(bVarP4);
            if (bVarT == null || bVarT.k()) {
                return bVarT;
            }
            c2.g("PdfBox-Android", "Invalid ToUnicode CMap in font " + getName());
            String strG = bVarT.g() != null ? bVarT.g() : "";
            String strH = bVarT.h() != null ? bVarT.h() : "";
            bp.b bVarP5 = this.f119160a.p4(bp.i.f20716d3);
            if (!strG.contains("Identity") && !strH.contains("Identity") && !bp.i.f20858r4.equals(bVarP5) && !bp.i.f20869s4.equals(bVarP5)) {
                return bVarT;
            }
            bVarA = c.a(bp.i.f20858r4.A3());
            c2.g("PdfBox-Android", "Using predefined identity CMap instead");
            return bVarA;
        } catch (IOException e15) {
            c2.f("PdfBox-Android", "Could not read ToUnicode CMap in font " + getName(), e15);
            return bVarA;
        }
    }

    public xp.d b() {
        return f119159h;
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && ((r) obj).D1() == D1();
    }

    public abstract void f(int i15);

    protected abstract byte[] g(int i15);

    public final byte[] h(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iCharCount = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            byteArrayOutputStream.write(g(iCodePointAt));
            iCharCount += Character.charCount(iCodePointAt);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return D1().hashCode();
    }

    @Override // hp.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f119160a;
    }

    public s j() {
        return this.f119163d;
    }

    protected final no.e k() {
        return this.f119162c;
    }

    protected abstract float l(int i15);

    public float m(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h(str));
        float fO = 0.0f;
        while (byteArrayInputStream.available() > 0) {
            fO += o(u(byteArrayInputStream));
        }
        return fO;
    }

    protected po.b n() {
        return this.f119161b;
    }

    public float o(int i15) {
        Float f15 = this.f119166g.get(Integer.valueOf(i15));
        if (f15 != null) {
            return f15.floatValue();
        }
        if (this.f119160a.p4(bp.i.I9) != null || this.f119160a.J3(bp.i.E5)) {
            int iY4 = this.f119160a.y4(bp.i.A3, -1);
            int iY5 = this.f119160a.y4(bp.i.V4, -1);
            int size = p().size();
            int i16 = i15 - iY4;
            if (size > 0 && i15 >= iY4 && i15 <= iY5 && i16 < size) {
                Float fValueOf = p().get(i16);
                if (fValueOf == null) {
                    fValueOf = Float.valueOf(0.0f);
                }
                this.f119166g.put(Integer.valueOf(i15), fValueOf);
                return fValueOf.floatValue();
            }
            s sVarJ = j();
            if (sVarJ != null) {
                float fM = sVarJ.m();
                this.f119166g.put(Integer.valueOf(i15), Float.valueOf(fM));
                return fM;
            }
        }
        if (q()) {
            float fL = l(i15);
            this.f119166g.put(Integer.valueOf(i15), Float.valueOf(fL));
            return fL;
        }
        float fD = d(i15);
        this.f119166g.put(Integer.valueOf(i15), Float.valueOf(fD));
        return fD;
    }

    protected final List<Float> p() {
        if (this.f119164e == null) {
            bp.a aVarJ4 = this.f119160a.j4(bp.i.I9);
            if (aVarJ4 != null) {
                this.f119164e = hp.a.f(aVarJ4);
            } else {
                this.f119164e = Collections.EMPTY_LIST;
            }
        }
        return this.f119164e;
    }

    public boolean q() {
        if (e()) {
            return false;
        }
        return h0.a(getName());
    }

    protected final po.b t(bp.b bVar) throws IOException {
        if (bVar instanceof bp.i) {
            return c.a(((bp.i) bVar).A3());
        }
        if (!(bVar instanceof bp.o)) {
            throw new IOException("Expected Name or Stream");
        }
        bp.g gVarL5 = null;
        try {
            gVarL5 = ((bp.o) bVar).l5();
            return c.b(gVarL5);
        } finally {
            dp.a.b(gVarL5);
        }
    }

    public String toString() {
        return getClass().getSimpleName() + " " + getName();
    }

    public abstract int u(InputStream inputStream);

    public abstract void v();

    public String w(int i15) {
        po.b bVar = this.f119161b;
        if (bVar != null) {
            return (bVar.g() == null || !this.f119161b.g().startsWith("Identity-") || (!(this.f119160a.p4(bp.i.Q8) instanceof bp.i) && this.f119161b.k())) ? this.f119161b.v(i15) : new String(new char[]{(char) i15});
        }
        return null;
    }

    public abstract boolean x();

    r(String str) {
        this.f119165f = -1.0f;
        bp.d dVar = new bp.d();
        this.f119160a = dVar;
        dVar.Y4(bp.i.f20732e9, bp.i.H3);
        this.f119161b = null;
        no.e eVarB = h0.b(str);
        this.f119162c = eVarB;
        if (eVarB != null) {
            this.f119163d = d0.a(eVarB);
            this.f119166g = new ConcurrentHashMap();
        } else {
            throw new IllegalArgumentException("No AFM for font " + str);
        }
    }

    protected r(bp.d dVar) {
        this.f119165f = -1.0f;
        this.f119160a = dVar;
        this.f119166g = new HashMap();
        this.f119162c = h0.b(getName());
        this.f119163d = r();
        this.f119161b = s();
    }
}
