package p027coN;

import java.util.Arrays;
import pq.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f28661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f28662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f28663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f28664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Byte f28665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f28666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Byte f28667g;

    public final byte[] a() {
        byte[] bArr = {this.f28661a, this.f28662b, this.f28663c, this.f28664d};
        byte[] bArrH = new byte[0];
        Byte b15 = this.f28665e;
        if (b15 != null) {
            bArrH = new byte[]{b15.byteValue()};
        }
        byte[] bArr2 = this.f28666f;
        if (bArr2 != null) {
            if (!(bArr2.length == 0)) {
                bArrH = n.H(bArrH, Arrays.copyOf(bArr2, bArr2.length));
            }
        }
        byte[] bArrH2 = n.H(bArr, bArrH);
        Byte b16 = this.f28667g;
        return b16 != null ? n.G(bArrH2, b16.byteValue()) : bArrH2;
    }
}
