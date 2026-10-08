package c9;

import ak.n0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import t7.u;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final String f24614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0<String> f24615d;

    public n(String str, String str2, List<String> list) {
        super(str);
        p.d(!list.isEmpty());
        this.f24613b = str2;
        n0<String> n0VarV = n0.v(list);
        this.f24615d = n0VarV;
        this.f24614c = n0VarV.get(0);
    }

    private static List<Integer> d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // t7.v.a
    public void c(u.b bVar) {
        String str = this.f24601a;
        str.getClass();
        byte b15 = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b15 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b15 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b15 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b15 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b15 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b15 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b15 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b15 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b15 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b15 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b15 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b15 = 11;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    b15 = 12;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b15 = 13;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b15 = 14;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b15 = 15;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b15 = 16;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b15 = 17;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b15 = 18;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b15 = 19;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b15 = 20;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b15 = 21;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b15 = 22;
                }
                break;
        }
        try {
            switch (b15) {
                case 0:
                case 10:
                    bVar.R(this.f24615d.get(0));
                    break;
                case 1:
                case 11:
                    bVar.W(this.f24615d.get(0));
                    break;
                case 2:
                case 13:
                    String str2 = this.f24615d.get(0);
                    bVar.j0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).i0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    bVar.S(this.f24615d.get(0));
                    break;
                case 4:
                case 19:
                    bVar.Q(this.f24615d.get(0));
                    break;
                case 5:
                case 20:
                    bVar.X(this.f24615d.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrZ0 = o0.Z0(this.f24615d.get(0), "/");
                    bVar.u0(Integer.valueOf(Integer.parseInt(strArrZ0[0]))).t0(strArrZ0.length > 1 ? Integer.valueOf(Integer.parseInt(strArrZ0[1])) : null);
                    break;
                case 7:
                case 17:
                    bVar.r0(this.f24615d.get(0));
                    break;
                case 8:
                case 16:
                    bVar.v0(this.f24615d.get(0));
                    break;
                case 9:
                case 22:
                    bVar.k0(Integer.valueOf(Integer.parseInt(this.f24615d.get(0))));
                    break;
                case 12:
                    Integer numP = ek.g.p(this.f24615d.get(0));
                    if (numP != null) {
                        String strA = j.a(numP.intValue());
                        if (strA != null) {
                            bVar.e0(strA);
                        }
                    } else {
                        bVar.e0(this.f24615d.get(0));
                    }
                    break;
                case 14:
                    List<Integer> listD = d(this.f24615d.get(0));
                    int size = listD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.i0(listD.get(2));
                            }
                        }
                        bVar.j0(listD.get(1));
                    }
                    bVar.k0(listD.get(0));
                    break;
                case 15:
                    List<Integer> listD2 = d(this.f24615d.get(0));
                    int size2 = listD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.l0(listD2.get(2));
                            }
                        }
                        bVar.m0(listD2.get(1));
                    }
                    bVar.n0(listD2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f24601a, nVar.f24601a) && Objects.equals(this.f24613b, nVar.f24613b) && this.f24615d.equals(nVar.f24615d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f24601a.hashCode()) * 31;
        String str = this.f24613b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f24615d.hashCode();
    }

    @Override // c9.i
    public String toString() {
        return this.f24601a + ": description=" + this.f24613b + ": values=" + this.f24615d;
    }
}
