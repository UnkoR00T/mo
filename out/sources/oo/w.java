package oo;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f147256a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f147257b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Object> f147258c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f147259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f147260e;

    public w(String str, String str2) {
        this.f147259d = str;
        this.f147260e = str2;
    }

    private int a() {
        int i15 = this.f147256a + this.f147257b;
        int i16 = i15 / 8;
        return i15 % 8 > 0 ? i16 + 1 : i16;
    }

    private List<Object> c(byte[] bArr, byte[][] bArr2, byte[][] bArr3, boolean z15) throws EOFException {
        if (z15) {
            this.f147256a = 0;
            this.f147257b = 0;
            this.f147258c = new ArrayList();
        }
        r rVar = new r(bArr);
        boolean z16 = bArr3 != null && bArr3.length > 0;
        boolean z17 = bArr2 != null && bArr2.length > 0;
        while (rVar.b()) {
            int iK = rVar.k();
            int i15 = 32768;
            if (iK == 10 && z16) {
                List<Object> list = this.f147258c;
                Integer num = (Integer) list.remove(list.size() - 1);
                int length = bArr3.length;
                if (length < 1240) {
                    i15 = 107;
                } else if (length < 33900) {
                    i15 = 1131;
                }
                int iIntValue = i15 + num.intValue();
                if (iIntValue < bArr3.length) {
                    c(bArr3[iIntValue], bArr2, bArr3, false);
                    List<Object> list2 = this.f147258c;
                    Object obj = list2.get(list2.size() - 1);
                    if ((obj instanceof p) && ((p) obj).a().a()[0] == 11) {
                        List<Object> list3 = this.f147258c;
                        list3.remove(list3.size() - 1);
                    }
                }
            } else if (iK == 29 && z17) {
                List<Object> list4 = this.f147258c;
                Integer num2 = (Integer) list4.remove(list4.size() - 1);
                int length2 = bArr2.length;
                if (length2 < 1240) {
                    i15 = 107;
                } else if (length2 < 33900) {
                    i15 = 1131;
                }
                int iIntValue2 = i15 + num2.intValue();
                if (iIntValue2 < bArr2.length) {
                    c(bArr2[iIntValue2], bArr2, bArr3, false);
                    List<Object> list5 = this.f147258c;
                    Object obj2 = list5.get(list5.size() - 1);
                    if ((obj2 instanceof p) && ((p) obj2).a().a()[0] == 11) {
                        List<Object> list6 = this.f147258c;
                        list6.remove(list6.size() - 1);
                    }
                }
            } else if (iK >= 0 && iK <= 27) {
                this.f147258c.add(e(iK, rVar));
            } else if (iK == 28) {
                this.f147258c.add(f(iK, rVar));
            } else if (iK >= 29 && iK <= 31) {
                this.f147258c.add(e(iK, rVar));
            } else {
                if (iK < 32 || iK > 255) {
                    throw new IllegalArgumentException();
                }
                this.f147258c.add(f(iK, rVar));
            }
        }
        return this.f147258c;
    }

    private List<Number> d() {
        ArrayList arrayList = new ArrayList();
        int size = this.f147258c.size();
        while (true) {
            size--;
            if (size <= -1) {
                break;
            }
            Object obj = this.f147258c.get(size);
            if (!(obj instanceof Number)) {
                break;
            }
            arrayList.add(0, (Number) obj);
        }
        return arrayList;
    }

    private p e(int i15, r rVar) {
        if (i15 == 1 || i15 == 18) {
            this.f147256a += d().size() / 2;
        } else if (i15 == 3 || i15 == 19 || i15 == 20 || i15 == 23) {
            this.f147257b += d().size() / 2;
        }
        if (i15 == 12) {
            return new p(i15, rVar.k());
        }
        if (i15 != 19 && i15 != 20) {
            return new p(i15);
        }
        int iA = a() + 1;
        int[] iArr = new int[iA];
        iArr[0] = i15;
        for (int i16 = 1; i16 < iA; i16++) {
            iArr[i16] = rVar.k();
        }
        return new p(iArr);
    }

    private Number f(int i15, r rVar) {
        if (i15 == 28) {
            return Integer.valueOf(rVar.j());
        }
        if (i15 >= 32 && i15 <= 246) {
            return Integer.valueOf(i15 - 139);
        }
        if (i15 >= 247 && i15 <= 250) {
            return Integer.valueOf(((i15 - 247) * 256) + rVar.k() + 108);
        }
        if (i15 >= 251 && i15 <= 254) {
            return Integer.valueOf((((-(i15 - 251)) * 256) - rVar.k()) - 108);
        }
        if (i15 != 255) {
            throw new IllegalArgumentException();
        }
        return Double.valueOf(((double) rVar.j()) + (((double) rVar.l()) / 65535.0d));
    }

    public List<Object> b(byte[] bArr, byte[][] bArr2, byte[][] bArr3) {
        return c(bArr, bArr2, bArr3, true);
    }

    public w(String str, int i15) {
        this.f147259d = str;
        this.f147260e = String.format(Locale.US, "%04x", Integer.valueOf(i15));
    }
}
