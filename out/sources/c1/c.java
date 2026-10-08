package c1;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.graphics.Color;
import b5.TextGeometricTransform;
import b5.k;
import c5.w;
import c5.x;
import n3.Shadow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import pq.v;
import q4.SpanStyle;
import u4.FontWeight;
import u4.y;
import u4.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u0017J\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010\"J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010\u0017J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010\u0017R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010-¨\u0006/"}, d2 = {"Lc1/c;", "", "", "string", "<init>", "(Ljava/lang/String;)V", "Lb5/a;", "b", "()F", "Lb5/q;", "n", "()Lb5/q;", "Lb5/k;", "m", "()Lb5/k;", "Ln3/w2;", "j", "()Ln3/w2;", "", "c", "()B", "", "i", "()I", "", "e", "l", "()Ljava/lang/String;", "a", "Lq4/h3;", "k", "()Lq4/h3;", "Landroidx/compose/ui/graphics/Color;", "d", "()J", "Lc5/v;", "o", "Lu4/d0;", "h", "()Lu4/d0;", "Lu4/y;", "f", "Lu4/z;", "g", "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Parcel parcel;

    public c(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.parcel = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final int a() {
        return this.parcel.dataAvail();
    }

    private final float b() {
        return b5.a.d(e());
    }

    private final byte c() {
        return this.parcel.readByte();
    }

    private final float e() {
        return this.parcel.readFloat();
    }

    private final int i() {
        return this.parcel.readInt();
    }

    private final Shadow j() {
        long jD = d();
        float fE = e();
        return new Shadow(jD, m3.e.e((((long) Float.floatToRawIntBits(e())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fE) << 32)), e(), null);
    }

    private final String l() {
        return this.parcel.readString();
    }

    private final k m() {
        int i15 = i();
        k.Companion companion = k.INSTANCE;
        boolean z15 = (companion.b().getMask() & i15) != 0;
        boolean z16 = (i15 & companion.d().getMask()) != 0;
        if (z15 && z16) {
            return companion.a(v.q(companion.b(), companion.d()));
        }
        if (z15) {
            return companion.b();
        }
        return z16 ? companion.d() : companion.c();
    }

    private final TextGeometricTransform n() {
        return new TextGeometricTransform(e(), e());
    }

    public final long d() {
        return androidx.compose.ui.graphics.a.a(Color.INSTANCE, this.parcel.readLong());
    }

    public final int f() {
        byte bC = c();
        if (bC != 0 && bC == 1) {
            return y.INSTANCE.a();
        }
        return y.INSTANCE.b();
    }

    public final int g() {
        byte bC = c();
        if (bC == 0) {
            return z.INSTANCE.b();
        }
        if (bC == 1) {
            return z.INSTANCE.a();
        }
        if (bC == 3) {
            return z.INSTANCE.c();
        }
        return bC == 2 ? z.INSTANCE.d() : z.INSTANCE.b();
    }

    public final FontWeight h() {
        return new FontWeight(i());
    }

    public final SpanStyle k() {
        f fVar = new f(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte bC = c();
            if (bC != 1) {
                if (bC != 2) {
                    if (bC != 3) {
                        if (bC != 4) {
                            if (bC != 5) {
                                if (bC != 6) {
                                    if (bC != 7) {
                                        if (bC != 8) {
                                            if (bC != 9) {
                                                if (bC != 10) {
                                                    if (bC != 11) {
                                                        if (bC == 12) {
                                                            if (a() < 20) {
                                                                break;
                                                            }
                                                            fVar.j(j());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (a() < 4) {
                                                            break;
                                                        }
                                                        fVar.k(m());
                                                    }
                                                } else {
                                                    if (a() < 8) {
                                                        break;
                                                    }
                                                    fVar.a(d());
                                                }
                                            } else {
                                                if (a() < 8) {
                                                    break;
                                                }
                                                fVar.l(n());
                                            }
                                        } else {
                                            if (a() < 4) {
                                                break;
                                            }
                                            fVar.b(b5.a.c(b()));
                                        }
                                    } else {
                                        if (a() < 5) {
                                            break;
                                        }
                                        fVar.i(o());
                                    }
                                } else {
                                    fVar.d(l());
                                }
                            } else {
                                if (a() < 1) {
                                    break;
                                }
                                fVar.g(z.e(g()));
                            }
                        } else {
                            if (a() < 1) {
                                break;
                            }
                            fVar.f(y.c(f()));
                        }
                    } else {
                        if (a() < 4) {
                            break;
                        }
                        fVar.h(h());
                    }
                } else {
                    if (a() < 5) {
                        break;
                    }
                    fVar.e(o());
                }
            } else {
                if (a() < 8) {
                    break;
                }
                fVar.c(d());
            }
        }
        return fVar.m();
    }

    public final long o() {
        long jA;
        byte bC = c();
        if (bC == 1) {
            jA = x.INSTANCE.b();
        } else {
            jA = bC == 2 ? x.INSTANCE.a() : x.INSTANCE.c();
        }
        return x.g(jA, x.INSTANCE.c()) ? c5.v.INSTANCE.a() : w.a(e(), jA);
    }
}
