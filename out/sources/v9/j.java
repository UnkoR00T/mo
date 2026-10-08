package v9;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements l0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f205004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<t7.p> f205005b;

    public j(int i15) {
        this(i15, ak.n0.C());
    }

    private g0 c(l0.b bVar) {
        return new g0(e(bVar), "video/mp2t");
    }

    private o0 d(l0.b bVar) {
        return new o0(e(bVar), "video/mp2t");
    }

    private List<t7.p> e(l0.b bVar) {
        String str;
        int i15;
        if (f(32)) {
            return this.f205005b;
        }
        w7.c0 c0Var = new w7.c0(bVar.f205066e);
        List<t7.p> arrayList = this.f205005b;
        while (c0Var.a() > 0) {
            int iQ = c0Var.Q();
            int iG = c0Var.g() + c0Var.Q();
            if (iQ == 134) {
                arrayList = new ArrayList<>();
                int iQ2 = c0Var.Q() & 31;
                for (int i16 = 0; i16 < iQ2; i16++) {
                    String strN = c0Var.N(3);
                    int iQ3 = c0Var.Q();
                    boolean z15 = (iQ3 & 128) != 0;
                    if (z15) {
                        i15 = iQ3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i15 = 1;
                    }
                    byte bQ = (byte) c0Var.Q();
                    c0Var.g0(1);
                    arrayList.add(new t7.p.b().A0(str).o0(strN).R(i15).l0(z15 ? w7.i.h((bQ & 64) != 0) : null).Q());
                }
            }
            c0Var.f0(iG);
        }
        return arrayList;
    }

    private boolean f(int i15) {
        return (i15 & this.f205004a) != 0;
    }

    @Override // v9.l0.c
    public SparseArray<l0> a() {
        return new SparseArray<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0059  */
    @Override // v9.l0.c
    public l0 b(int i15, l0.b bVar) {
        if (i15 != 2) {
            if (i15 == 3 || i15 == 4) {
                return new y(new t(bVar.f205063b, bVar.a(), "video/mp2t"));
            }
            if (i15 == 21) {
                return new y(new r("video/mp2t"));
            }
            if (i15 == 27) {
                if (f(4)) {
                    return null;
                }
                return new y(new p(c(bVar), f(1), f(8), "video/mp2t"));
            }
            if (i15 == 36) {
                return new y(new q(c(bVar), "video/mp2t"));
            }
            if (i15 == 45) {
                return new y(new u("video/mp2t"));
            }
            if (i15 == 89) {
                return new y(new l(bVar.f205065d, "video/mp2t"));
            }
            if (i15 == 172) {
                return new y(new f(bVar.f205063b, bVar.a(), "video/mp2t"));
            }
            if (i15 == 257) {
                return new e0(new x("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i15 != 138) {
                if (i15 == 139) {
                    return new y(new k(bVar.f205063b, bVar.a(), 5408, "video/mp2t"));
                }
                switch (i15) {
                    case 15:
                        if (f(2)) {
                            return null;
                        }
                        return new y(new i(false, bVar.f205063b, bVar.a(), "video/mp2t"));
                    case 16:
                        return new y(new o(d(bVar), "video/mp2t"));
                    case 17:
                        if (f(2)) {
                            return null;
                        }
                        return new y(new s(bVar.f205063b, bVar.a(), "video/mp2t"));
                    default:
                        switch (i15) {
                            case 128:
                                break;
                            case 129:
                                return new y(new c(bVar.f205063b, bVar.a(), "video/mp2t"));
                            case 130:
                                if (!f(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i15) {
                                    case 134:
                                        if (f(16)) {
                                            return null;
                                        }
                                        return new e0(new x("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        return new y(new c(bVar.f205063b, bVar.a(), "video/mp2t"));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new y(new k(bVar.f205063b, bVar.a(), PKIFailureInfo.certConfirmed, "video/mp2t"));
        }
        return new y(new n(d(bVar), "video/mp2t"));
    }

    public j(int i15, List<t7.p> list) {
        this.f205004a = i15;
        this.f205005b = list;
    }
}
