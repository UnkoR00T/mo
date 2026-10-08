package se;

import android.graphics.drawable.Drawable;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ve.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c<T> implements h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f180984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f180985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private re.d f180986c;

    public c() {
        this(PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail);
    }

    @Override // se.h
    public final void a(g gVar) {
    }

    @Override // se.h
    public final re.d b() {
        return this.f180986c;
    }

    @Override // se.h
    public void c(Drawable drawable) {
    }

    @Override // oe.l
    public void e() {
    }

    @Override // se.h
    public final void f(g gVar) {
        gVar.e(this.f180984a, this.f180985b);
    }

    @Override // oe.l
    public void g() {
    }

    @Override // se.h
    public final void i(re.d dVar) {
        this.f180986c = dVar;
    }

    @Override // se.h
    public void j(Drawable drawable) {
    }

    @Override // oe.l
    public void n() {
    }

    public c(int i15, int i16) {
        if (l.t(i15, i16)) {
            this.f180984a = i15;
            this.f180985b = i16;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i15 + " and height: " + i16);
    }
}
