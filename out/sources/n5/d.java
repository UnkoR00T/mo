package n5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o5.o;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f131821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f131822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f131823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f131824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f131825f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g5.i f131828i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet<d> f131820a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f131826g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f131827h = PKIFailureInfo.systemUnavail;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f131823d = eVar;
        this.f131824e = aVar;
    }

    public boolean a(d dVar, int i15) {
        return b(dVar, i15, PKIFailureInfo.systemUnavail, false);
    }

    public boolean b(d dVar, int i15, int i16, boolean z15) {
        if (dVar == null) {
            q();
            return true;
        }
        if (!z15 && !p(dVar)) {
            return false;
        }
        this.f131825f = dVar;
        if (dVar.f131820a == null) {
            dVar.f131820a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f131825f.f131820a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f131826g = i15;
        this.f131827h = i16;
        return true;
    }

    public void c(int i15, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f131820a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                o5.i.a(it.next().f131823d, i15, arrayList, oVar);
            }
        }
    }

    public HashSet<d> d() {
        return this.f131820a;
    }

    public int e() {
        if (this.f131822c) {
            return this.f131821b;
        }
        return 0;
    }

    public int f() {
        d dVar;
        if (this.f131823d.X() == 8) {
            return 0;
        }
        return (this.f131827h == Integer.MIN_VALUE || (dVar = this.f131825f) == null || dVar.f131823d.X() != 8) ? this.f131826g : this.f131827h;
    }

    public final d g() {
        switch (this.f131824e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f131823d.Q;
            case TOP:
                return this.f131823d.R;
            case RIGHT:
                return this.f131823d.O;
            case BOTTOM:
                return this.f131823d.P;
            default:
                throw new AssertionError(this.f131824e.name());
        }
    }

    public e h() {
        return this.f131823d;
    }

    public g5.i i() {
        return this.f131828i;
    }

    public d j() {
        return this.f131825f;
    }

    public a k() {
        return this.f131824e;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f131820a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet<d> hashSet = this.f131820a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f131822c;
    }

    public boolean o() {
        return this.f131825f != null;
    }

    public boolean p(d dVar) {
        if (dVar == null) {
            return false;
        }
        a aVarK = dVar.k();
        a aVar = this.f131824e;
        if (aVarK == aVar) {
            return aVar != a.BASELINE || (dVar.h().b0() && h().b0());
        }
        switch (aVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z15 = aVarK == a.LEFT || aVarK == a.RIGHT;
                if (dVar.h() instanceof h) {
                    return z15 || aVarK == a.CENTER_X;
                }
                return z15;
            case TOP:
            case BOTTOM:
                boolean z16 = aVarK == a.TOP || aVarK == a.BOTTOM;
                if (dVar.h() instanceof h) {
                    return z16 || aVarK == a.CENTER_Y;
                }
                return z16;
            case BASELINE:
                return (aVarK == a.LEFT || aVarK == a.RIGHT) ? false : true;
            case CENTER:
                return (aVarK == a.BASELINE || aVarK == a.CENTER_X || aVarK == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f131824e.name());
        }
    }

    public void q() {
        HashSet<d> hashSet;
        d dVar = this.f131825f;
        if (dVar != null && (hashSet = dVar.f131820a) != null) {
            hashSet.remove(this);
            if (this.f131825f.f131820a.size() == 0) {
                this.f131825f.f131820a = null;
            }
        }
        this.f131820a = null;
        this.f131825f = null;
        this.f131826g = 0;
        this.f131827h = PKIFailureInfo.systemUnavail;
        this.f131822c = false;
        this.f131821b = 0;
    }

    public void r() {
        this.f131822c = false;
        this.f131821b = 0;
    }

    public void s(g5.c cVar) {
        g5.i iVar = this.f131828i;
        if (iVar == null) {
            this.f131828i = new g5.i(g5.i.a.UNRESTRICTED, null);
        } else {
            iVar.k();
        }
    }

    public void t(int i15) {
        this.f131821b = i15;
        this.f131822c = true;
    }

    public String toString() {
        return this.f131823d.t() + ":" + this.f131824e.toString();
    }

    public void u(int i15) {
        if (o()) {
            this.f131827h = i15;
        }
    }
}
